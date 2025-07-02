package se.seb.gds.atoms.input

import android.content.res.Configuration
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.delete
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.input.then
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.CustomAccessibilityAction
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.customActions
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.lerp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import se.seb.gds.components.R
import se.seb.gds.atoms.ClearButton
import se.seb.gds.icons.ErrorIcon
import se.seb.gds.theme.GdsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GdsInput(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    rowModifier: Modifier? = null,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    label: String? = null,
    labelColor: Color = GdsTheme.colors.contentContent02,
    overrideTextDescription: String? = null,
    overridePlaceholderDescription: String? = null,
    maxCharacters: Int? = null,
    inputTransformation: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    textStyle: TextStyle = GdsTheme.typography.Headline,
    lineLimits: TextFieldLineLimits = TextFieldLineLimits.Default,
    scrollState: ScrollState = rememberScrollState(),
    interactionSource: MutableInteractionSource = remember {
        MutableInteractionSource()
    },
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    onTrailingIconClick: (() -> Unit)? = null,
    trailingIconDescription: String? = null,
    supportingText: String? = null,
    errorMessage: String? = null,
    onInteraction: (Interaction) -> Unit = {},
    characterWhitelistPredicate: (CharSequence, CharSequence) -> Boolean = { _: CharSequence, _: CharSequence -> true },
    onValueChange: (String) -> Unit = {},
) {
    val scope = rememberCoroutineScope()
    val focusManager = LocalFocusManager.current

    val smallLabelStyle = GdsTheme.typography.Caption
    val largeLabelStyle = GdsTheme.typography.Body

    val textFieldIsFocused by interactionSource.collectIsFocusedAsState()

    val labelAnimationProgress by animateFloatAsState(
        targetValue = if (textFieldIsFocused || state.text.isNotEmpty()) 1f else 0f,
    )

    val labelTextStyle by remember(labelAnimationProgress) {
        derivedStateOf {
            lerp(largeLabelStyle, smallLabelStyle, labelAnimationProgress)
        }
    }

    val currentLabelColor = when {
        !enabled -> GdsTheme.colors.contentContentDisabled01
        isError -> GdsTheme.colors.contentContentNegative01
        textFieldIsFocused || state.text.isNotEmpty() -> labelColor
        else -> GdsTheme.colors.contentContent01
    }

    var textLineCount by remember { mutableIntStateOf(1) }
    var labelLineCount by remember { mutableIntStateOf(1) }

    LaunchedEffect(Unit) {
        scope.launch {
            interactionSource.interactions.collectLatest { value ->
                if (value is DragInteraction.Start) {
                    focusManager.clearFocus(true)
                } else {
                    onInteraction(value)
                }
            }
        }
    }

    LaunchedEffect(state.text) {
        onValueChange(state.text.toString())
    }

    val textFieldDescription = getAccessibilityDescription(
        maxCharacters,
        state,
        overrideTextDescription,
        textFieldIsFocused,
        readOnly,
        overridePlaceholderDescription,
        label,
        isError
    )

    fun clearText() {
        state.edit {
            delete(0, state.text.length)
        }
    }

    val doubleTapToEditText = stringResource(id = R.string.text_field_edit)
    val customActionsList = buildCustomAccessibilityActions(
        trailingIconDescription = trailingIconDescription,
        onTrailingIconClick = onTrailingIconClick,
        clearTextActionDescription = stringResource(id = R.string.clear_button_description),
    ) { clearText() }

    val showClearIcon = state.text.isNotEmpty() && enabled && !readOnly && textFieldIsFocused

    val currentTrailingIcon: @Composable (() -> Unit)? = when {
        trailingIcon != null -> trailingIcon

        isError -> {
            @Composable { ErrorIcon() }
        }

        showClearIcon -> {
            @Composable {
                ClearButton(
                    onClick = { clearText() },
                )
            }
        }

        else -> null
    }

    // Create chain of inputTransformations with MaxCharacterInputTransformation ( if not null )
    val inputTransformationChain = inputTransformation
        .thenIfNotNull(
            maxCharacters?.let { MaxCharacterInputTransformation(it) },
        )
        .thenIfNotNull(CharacterWhitelistInputTransformation(characterWhitelistPredicate))

    val textFieldColors = TextFieldDefaults.colors().copy(
        disabledContainerColor = Color.Transparent,
        focusedContainerColor = Color.Transparent,
        errorContainerColor = Color.Transparent,
        unfocusedContainerColor = Color.Transparent,

        focusedTextColor = GdsTheme.colors.contentContent01,
        unfocusedTextColor = GdsTheme.colors.contentContent01,
        disabledTextColor = GdsTheme.colors.contentContentDisabled01,
        errorTextColor = GdsTheme.colors.contentContentNegative01,

        focusedLabelColor = GdsTheme.colors.contentContent02,
        unfocusedLabelColor = GdsTheme.colors.contentContent02,
        errorLabelColor = GdsTheme.colors.contentContentNegative01,
        disabledLabelColor = GdsTheme.colors.contentContent02,

        errorTrailingIconColor = GdsTheme.colors.contentContentNegative01,

        focusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        errorIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
    )

    val textSelectionColors = TextSelectionColors(
        handleColor = GdsTheme.colors.contentContent01,
        backgroundColor = GdsTheme.colors.contentContent01.copy(alpha = 0.2f),
    )

    val containerColor = when {
        !enabled -> GdsTheme.colors.l3Disabled01
        else -> GdsTheme.colors.l302
    }

    val borderColor = if (isError) {
        GdsTheme.colors.borderNegative
    } else {
        Color.Transparent
    }

    val currentInputTextColor = when {
        !enabled -> GdsTheme.colors.contentContentDisabled01
        else -> GdsTheme.colors.contentContent01
    }

    CompositionLocalProvider(
        LocalTextSelectionColors provides textSelectionColors,
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .semantics(true) { },
        ) {
            Column(
                modifier = Modifier
                    .clearAndSetSemantics {
                        contentDescription = textFieldDescription
                        customActions = customActionsList
                        onClick(doubleTapToEditText, null)
                    }
            ) {
                val pressedModifier = if (textFieldIsFocused && !readOnly) {
                    Modifier.background(
                        shape = RoundedCornerShape(12.dp),
                        color = GdsTheme.colors.stateLightPressed
                    )
                } else {
                    Modifier
                }
                Box(
                    modifier = Modifier
                        .heightIn(
                            min = InputFieldUtil.minHeight(
                                textLineCount = textLineCount,
                                labelLineCount = labelLineCount,
                                hasPadding = true,
                            ).coerceAtLeast(64.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .background(shape = RoundedCornerShape(12.dp), color = containerColor)
                            .border(
                                width = 1.dp,
                                color = borderColor,
                                shape = RoundedCornerShape(12.dp)
                            )
                            .matchParentSize()
                    )
                    Box(modifier = pressedModifier.matchParentSize())
                    Row(
                        modifier = rowModifier ?: Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        BasicTextField(
                            state = state,
                            modifier = modifier
                                .align(Alignment.CenterVertically)
                                .semantics { hideFromAccessibility() }
                                .weight(1f),
                            enabled = enabled,
                            readOnly = readOnly,
                            textStyle = textStyle.copy(color = currentInputTextColor),
                            lineLimits = lineLimits,
                            scrollState = scrollState,
                            cursorBrush = SolidColor(GdsTheme.colors.contentContent01), //check this color
                            inputTransformation = inputTransformationChain,
                            outputTransformation = outputTransformation,
                            interactionSource = interactionSource,
                            keyboardOptions = keyboardOptions,
                            onTextLayout = { getResult ->
                                val textLayoutResult = getResult()
                                if (textLayoutResult != null) {
                                    textLineCount = textLayoutResult.lineCount
                                }
                            },
                            decorator = { innerTextField ->
                                TextFieldDefaults.DecorationBox(
                                    value = state.text.toString(),
                                    visualTransformation = VisualTransformation.None,
                                    innerTextField = { innerTextField() },
                                    enabled = enabled,
                                    prefix = prefix,
                                    suffix = suffix,
                                    leadingIcon = leadingIcon,
                                    trailingIcon = {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                        ) {
                                            if (maxCharacters != null && textFieldIsFocused && !readOnly && !isError) {
                                                CharacterAmountIndicator(
                                                    maxCharacters = maxCharacters,
                                                    currentCharacters = state.text.length,
                                                    isFocused = textFieldIsFocused
                                                )
                                                if (currentTrailingIcon == null) {
                                                    Spacer(modifier = Modifier.width(12.dp))
                                                }
                                            }
                                            currentTrailingIcon?.invoke()
                                        }
                                    },
                                    label = label?.let {
                                        {
                                            Row(
                                                verticalAlignment = Alignment.Top,
                                                horizontalArrangement = Arrangement.SpaceBetween,
                                                modifier = Modifier.fillMaxWidth(),
                                            ) {
                                                Text(
                                                    text = it,
                                                    style = labelTextStyle.merge(color = currentLabelColor),
                                                    modifier = Modifier.weight(1f),
                                                    onTextLayout = { textLayoutResult ->
                                                        labelLineCount = textLayoutResult.lineCount
                                                    },
                                                )
                                            }
                                        }
                                    },
                                    singleLine = false,
                                    isError = isError,
                                    interactionSource = interactionSource,
                                    colors = textFieldColors,
                                )
                            },
                        )
                    }
                }
                ConditionalSupportingText(
                    isEnabled = enabled,
                    isError = isError,
                    errorMessage = errorMessage,
                    supportingText = supportingText
                )
            }
        }
    }
}

@Composable
private fun getAccessibilityDescription(
    maxCharacters: Int?,
    state: TextFieldState,
    overrideTextDescription: String?,
    textFieldIsFocused: Boolean,
    readOnly: Boolean,
    overridePlaceholderDescription: String?,
    label: String?,
    isError: Boolean
): String {
    val errorDescription = stringResource(id = R.string.text_field_error_in_field)
    val isEditing = stringResource(id = R.string.text_field_is_editing)
    val amountOfCharacters = maxCharacters?.let {
        stringResource(id = R.string.text_field_characters_written, state.text.length, it)
    } ?: ""
    val textDescription = overrideTextDescription ?: state.text
    val textOrPlaceholder = textDescription.ifEmpty {
        if (textFieldIsFocused && !readOnly) overridePlaceholderDescription ?: "" else ""
    }

    val basicDescription = "$label, $textOrPlaceholder. ${stringResource(id = R.string.text_field)}"
    val accessibilityDescription = if (textFieldIsFocused && !readOnly) {
        "$basicDescription, $isEditing, $amountOfCharacters"
    } else if (readOnly) {
        "$basicDescription, ${stringResource(id = R.string.text_field_disabled)}"
    } else {
        basicDescription
    }

    val textFieldDescription =
        if (isError) {
            "$errorDescription, $accessibilityDescription"
        } else {
            accessibilityDescription
        }
    return textFieldDescription
}

@Composable
private fun ConditionalSupportingText(
    isEnabled: Boolean,
    isError: Boolean,
    errorMessage: String?,
    supportingText: String?
) {
    val message = if (isError) {
        errorMessage
    } else {
        supportingText
    }
    message?.let {
        val color = when {
            !isEnabled -> {
                GdsTheme.colors.contentContentDisabled01
            }

            isError -> {
                GdsTheme.colors.contentContentNegative01
            }

            else -> {
                GdsTheme.colors.contentContent01
            }
        }

        Box(Modifier.padding(start = 16.dp, top = 8.dp)) {
            Text(
                text = it,
                style = GdsTheme.typography.SubHeader2,
                color = color
            )
        }
    }
}

private fun buildCustomAccessibilityActions(
    trailingIconDescription: String?,
    onTrailingIconClick: (() -> Unit)?,
    clearTextActionDescription: String,
    onClearText: () -> Unit,
): List<CustomAccessibilityAction> {
    val customActionsList = mutableListOf(
        CustomAccessibilityAction(
            clearTextActionDescription,
        ) {
            onClearText()
            true
        },
    )
    if (onTrailingIconClick != null && trailingIconDescription != null) {
        customActionsList.add(
            CustomAccessibilityAction(
                trailingIconDescription,
            ) {
                onTrailingIconClick()
                true
            },
        )
    }
    return customActionsList
}

fun InputTransformation?.thenIfNotNull(next: InputTransformation?): InputTransformation? {
    return when {
        this == null -> next
        next == null -> this
        else -> this.then(next)
    }
}


@Preview(
    name = "Light Mode GdsInput",
    group = "Themes",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark Mode GdsInput",
    group = "Themes",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun TextFieldPreview() {
    GdsTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(GdsTheme.colors.l101)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                GdsInput(
                    state = rememberTextFieldState("input text"),
                    label = "Label",
                    maxCharacters = 100,
                    supportingText = "Support message."
                )
                Spacer(Modifier.height(16.dp))
                GdsInput(
                    state = rememberTextFieldState(),
                    label = "Label2",
                    isError = false,
                    supportingText = "Support message."
                )
                Spacer(Modifier.height(16.dp))
                GdsInput(
                    state = rememberTextFieldState(),
                    label = "Label3",
                    isError = true,
                    supportingText = "Support message",
                    errorMessage = "Error message."
                )
                Spacer(Modifier.height(16.dp))
                GdsInput(
                    state = rememberTextFieldState(),
                    label = "Label3",
                    enabled = false,
                    isError = false,
                    supportingText = "Support message."
                )
                Spacer(Modifier.height(16.dp))
                GdsInput(
                    state = rememberTextFieldState("read only text"),
                    label = "Label3",
                    enabled = true,
                    readOnly = true,
                    isError = false,
                    supportingText = "Support message."
                )
            }
        }
    }
}