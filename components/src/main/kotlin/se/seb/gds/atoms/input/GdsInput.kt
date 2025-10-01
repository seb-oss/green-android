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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.contentPaddingWithLabel
import androidx.compose.material3.TextFieldDefaults.contentPaddingWithoutLabel
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.CustomAccessibilityAction
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.customActions
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.lerp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.coerceAtLeast
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import se.seb.gds.components.R
import se.seb.gds.icons.ErrorIcon
import se.seb.gds.theme.GdsTheme

@Composable
fun GdsInput(
    modifier: Modifier = Modifier,
    rowModifier: Modifier? = null,
    state: TextFieldState,
    style: GdsInputStyle = GdsInputDefaults.defaultStyle(),
    label: String? = null,
    supportLabel: String? = null,
    placeholderText: String? = null,
    supportingText: String? = null,
    errorMessage: String? = null,
    overrideTextDescription: String? = null,
    overridePlaceholderDescription: String? = null,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    clearable: Boolean = true,
    maxCharacters: Int? = null,
    inputTransformation: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
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
    onInteraction: (Interaction) -> Unit = {},
    characterWhitelistPredicate: (
        CharSequence,
        CharSequence,
    ) -> Boolean = { _: CharSequence, _: CharSequence -> true },
    onValueChange: (String) -> Unit = {},
) {
    val scope = rememberCoroutineScope()
    val focusManager = LocalFocusManager.current

    val textFieldIsFocused by interactionSource.collectIsFocusedAsState()

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

    fun clearText() {
        state.edit {
            delete(0, state.text.length)
        }
    }

    val textFieldDescription = getAccessibilityDescription(
        maxCharacters,
        state,
        overrideTextDescription,
        textFieldIsFocused,
        readOnly,
        overridePlaceholderDescription,
        label,
        isError,
    )

    val customActionsList = buildCustomAccessibilityActions(
        trailingIconDescription = trailingIconDescription,
        onTrailingIconClick = onTrailingIconClick,
        onClearText = { clearText() },
    )

    val doubleTapToEditText = stringResource(id = R.string.text_field_edit)

    val currentTrailingIcon: @Composable (() -> Unit)? = when {
        trailingIcon != null -> trailingIcon

        isError && !textFieldIsFocused -> {
            @Composable { ErrorIcon() }
        }

        else -> null
    }

    val inputTransformationChain = inputTransformation
        .thenIfNotNull(
            maxCharacters?.let { MaxCharacterInputTransformation(it) },
        )
        .thenIfNotNull(CharacterWhitelistInputTransformation(characterWhitelistPredicate))

    Column(
        modifier = Modifier
            .clearAndSetSemantics {
                contentDescription = textFieldDescription
                customActions = customActionsList
                onClick(doubleTapToEditText, null)
            },
    ) {
        if (!style.floatingLabel) {
            Header(label = label, supportLabel = supportLabel, style = style)
        }
        Body(
            modifier = modifier,
            rowModifier = rowModifier,
            label = label,
            placeholderText = placeholderText,
            textFieldIsFocused = textFieldIsFocused,
            readOnly = readOnly,
            style = style,
            enabled = enabled,
            isError = isError,
            state = state,
            lineLimits = lineLimits,
            scrollState = scrollState,
            inputTransformationChain = inputTransformationChain,
            outputTransformation = outputTransformation,
            interactionSource = interactionSource,
            keyboardOptions = keyboardOptions,
            prefix = prefix,
            suffix = suffix,
            leadingIcon = leadingIcon,
            trailingIcon = currentTrailingIcon,
            maxCharacters = maxCharacters,
            clearable = clearable,
            clearText = { clearText() },
        )
        Footer(
            state = state,
            isEnabled = enabled,
            isError = isError,
            errorMessage = errorMessage,
            supportingMessage = supportingText,
            maxCharacters = maxCharacters,
            style = style,
        )
    }
}

@Composable
fun Footer(
    state: TextFieldState,
    isEnabled: Boolean,
    isError: Boolean,
    errorMessage: String?,
    supportingMessage: String?,
    maxCharacters: Int?,
    style: GdsInputStyle,
) {
    val textToShow = if (isError) {
        errorMessage
    } else {
        supportingMessage
    }
    textToShow?.let {
        val textColor = when {
            !isEnabled -> {
                style.colors.disabledSupportingTextColor
            }

            isError -> {
                style.colors.errorSupportingTextColor
            }

            else -> {
                style.colors.supportingTextColor
            }
        }

        Row(
            Modifier
                .padding(start = 16.dp, end = 16.dp, top = 8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = it,
                style = style.textStyle.footerMessageStyle,
                color = textColor,
            )
            if (maxCharacters != null && !style.floatingLabel) {
                CharacterAmountIndicator(
                    modifier = Modifier.align(Alignment.Bottom),
                    textStyle = style.textStyle.characterCounter,
                    color = textColor,
                    maxCharacters = maxCharacters,
                    currentCharacters = state.text.length,
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Body(
    modifier: Modifier = Modifier,
    rowModifier: Modifier? = null,
    label: String? = null,
    placeholderText: String? = null,
    textFieldIsFocused: Boolean,
    readOnly: Boolean,
    style: GdsInputStyle,
    enabled: Boolean,
    isError: Boolean,
    state: TextFieldState,
    lineLimits: TextFieldLineLimits,
    scrollState: ScrollState,
    inputTransformationChain: InputTransformation?,
    outputTransformation: OutputTransformation? = null,
    interactionSource: MutableInteractionSource,
    keyboardOptions: KeyboardOptions,
    prefix: @Composable (() -> Unit)?,
    suffix: @Composable (() -> Unit)?,
    leadingIcon: @Composable (() -> Unit)?,
    trailingIcon: @Composable (() -> Unit)?,
    maxCharacters: Int?,
    clearable: Boolean,
    clearText: () -> Unit?,
) {
    val floatingLabel = label.takeIf { style.floatingLabel }
    var textLineCount by remember { mutableIntStateOf(1) }
    var labelLineCount by remember {
        mutableIntStateOf(if (style.containerSize is InputSize.Large) 1 else 0)
    }

    val labelAnimationProgress by animateFloatAsState(
        targetValue = if (textFieldIsFocused || state.text.isNotEmpty()) 1f else 0f,
    )

    val labelTextStyle by remember(labelAnimationProgress) {
        derivedStateOf {
            lerp(
                style.textStyle.largeLabelStyle,
                style.textStyle.smallLabelStyle,
                labelAnimationProgress,
            )
        }
    }

    val containerColor = when {
        textFieldIsFocused && !readOnly -> style.colors.focusedContainerColor.copy(0.14f)
        enabled -> style.colors.containerColor
        else -> style.colors.disabledContainerColor
    }

    val currentLabelColor = when {
        !enabled -> style.colors.disabledContentColor
        else -> style.colors.floatingLabelColor
    }

    val borderColor = if (isError) {
        style.colors.errorIndicatorColor
    } else {
        Color.Transparent
    }

    val currentInputTextColor = when {
        !enabled -> style.colors.disabledContentColor
        else -> style.colors.inputTextColor
    }

    Box(
        modifier = Modifier
            .heightIn(
                min = InputFieldUtil.minHeight(
                    textLineCount = textLineCount,
                    labelLineCount = labelLineCount,
                    hasPadding = true,
                    textStyle = style.textStyle.inputTextStyle,
                    labelStyle = style.textStyle.smallLabelStyle,
                ).coerceAtLeast(style.containerSize.height),
            ),
        contentAlignment = Alignment.TopCenter,
    ) {
        Box(
            modifier = Modifier
                .background(shape = style.containerSize.shape, color = containerColor)
                .border(width = 2.dp, color = borderColor, shape = style.containerSize.shape)
                .matchParentSize(),
        )

        Row(
            modifier = rowModifier ?: Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(horizontal = 16.dp),
        ) {
            val alignIconToTop =
                lineLimits is TextFieldLineLimits.MultiLine &&
                    (lineLimits.minHeightInLines > 1 || textLineCount > 1)
            val leadingTrailingModifier = if (alignIconToTop) {
                Modifier
                    .align(Alignment.Top)
                    .padding(top = 12.dp)
            } else {
                Modifier.align(Alignment.CenterVertically)
            }
            leadingIcon?.let {
                Box(modifier = leadingTrailingModifier.padding(end = 12.dp)) {
                    leadingIcon.invoke()
                }
            }

            CompositionLocalProvider(
                LocalTextSelectionColors provides style.textSelectionColors,
            ) {
                BasicTextField(
                    state = state,
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .semantics { hideFromAccessibility() }
                        .weight(1f),
                    enabled = enabled,
                    readOnly = readOnly,
                    textStyle = style.textStyle.inputTextStyle.copy(color = currentInputTextColor),
                    lineLimits = lineLimits,
                    scrollState = scrollState,
                    cursorBrush = SolidColor(style.colors.cursorColor),
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
                            contentPadding = getContentPadding(style, floatingLabel),
                            value = state.text.toString(),
                            visualTransformation = VisualTransformation.None,
                            innerTextField = {
                                Row(modifier = Modifier.fillMaxWidth()) {
                                    Column(modifier = Modifier.weight(1f)) { innerTextField() }
                                    if (clearable && !readOnly && textFieldIsFocused && !isError) {
                                        ClearButton(
                                            modifier = Modifier
                                                .padding(start = 8.dp)
                                                .alpha(if (state.text.isNotEmpty()) 1f else 0f),
                                            enabled = state.text.isNotEmpty(),
                                            onClick = { clearText() },
                                        )
                                    }
                                }
                            },
                            enabled = enabled,
                            placeholder = placeholderText?.let {
                                {
                                    Text(
                                        text = placeholderText,
                                        style = style.textStyle.inputTextStyle,
                                    )
                                }
                            },
                            prefix = prefix,
                            suffix = suffix,
                            label = floatingLabel?.let {
                                {
                                    Row(
                                        verticalAlignment = Alignment.Top,
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
                                        if (textFieldIsFocused && !readOnly && !isError) {
                                            CharacterAmountIndicator(
                                                textStyle = style.textStyle.characterCounter,
                                                color = style.colors.floatingLabelColor,
                                                maxCharacters = maxCharacters,
                                                currentCharacters = state.text.length,
                                            )
                                        }
                                    }
                                }
                            },
                            singleLine = false,
                            isError = isError,
                            interactionSource = interactionSource,
                            colors = style.textFieldColors,
                        )
                    },
                )
            }
            trailingIcon?.let {
                Box(modifier = leadingTrailingModifier.padding(start = 12.dp)) {
                    trailingIcon.invoke()
                }
            }
        }
    }
}

@Composable
private fun getContentPadding(
    style: GdsInputStyle,
    floatingLabel: String?,
) = when {
    style.floatingLabel && floatingLabel == null -> {
        contentPaddingWithoutLabel(
            start = 0.dp,
            end = 0.dp,
        )
    }

    style.floatingLabel -> {
        contentPaddingWithLabel(
            start = 0.dp,
            end = 0.dp,
        )
    }

    else -> {
        PaddingValues(
            top = 10.dp,
            bottom = 10.dp,
            start = 0.dp,
            end = 0.dp,
        )
    }
}

@Composable
internal fun Header(
    style: GdsInputStyle,
    label: String? = null,
    supportLabel: String? = null,
) {
    val hasContent = label != null || supportLabel != null
    label?.let {
        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            color = style.colors.labelColor,
            style = style.textStyle.labelStyle,
            text = it,
        )
    }
    supportLabel?.let {
        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            style = style.textStyle.supportLabelStyle,
            color = style.colors.supportLabelColor,
            text = it,
        )
    }
    if (hasContent) {
        Spacer(Modifier.height(8.dp))
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
    isError: Boolean,
): String {
    val descriptionBuilder = StringBuilder()

    if (isError) {
        descriptionBuilder.append(stringResource(id = R.string.text_field_error_in_field))
        descriptionBuilder.append(", ")
    }

    descriptionBuilder.append(label ?: "")
    descriptionBuilder.append(", ")

    val currentText = overrideTextDescription ?: state.text
    if (currentText.isNotEmpty()) {
        descriptionBuilder.append(currentText)
    } else if (textFieldIsFocused && !readOnly) {
        descriptionBuilder.append(overridePlaceholderDescription ?: "")
    }

    descriptionBuilder.append(". ")
    descriptionBuilder.append(stringResource(id = R.string.text_field))

    if (textFieldIsFocused && !readOnly) {
        descriptionBuilder.append(", ")
        descriptionBuilder.append(stringResource(id = R.string.text_field_is_editing))
        maxCharacters?.let {
            descriptionBuilder.append(", ")
            descriptionBuilder.append(
                stringResource(
                    id = R.string.text_field_characters_written,
                    state.text.length,
                    it,
                ),
            )
        }
    } else if (readOnly) {
        descriptionBuilder.append(", ")
        descriptionBuilder.append(stringResource(id = R.string.text_field_disabled))
    }

    return descriptionBuilder.toString().replace(" ,", ",").trim()
}

@Composable
private fun buildCustomAccessibilityActions(
    trailingIconDescription: String?,
    onTrailingIconClick: (() -> Unit)?,
    onClearText: () -> Unit,
): List<CustomAccessibilityAction> {
    val clearTextActionDescription = stringResource(id = R.string.clear_button_description)
    val customActionsList = mutableListOf(
        CustomAccessibilityAction(clearTextActionDescription) {
            onClearText()
            true
        },
    )
    if (onTrailingIconClick != null && trailingIconDescription != null) {
        customActionsList.add(
            CustomAccessibilityAction(trailingIconDescription) {
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
                .background(GdsTheme.colors.StateNeutral01),
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
            ) {
                GdsInput(
                    state = rememberTextFieldState(),
                    label = "Label",
                    supportLabel = "Support Label - Default variant",
                    clearable = true,
                    maxCharacters = 50,
                    supportingText = "Support message.",
                    leadingIcon = {
                        Icon(
                            painter = rememberVectorPainter(image = Icons.Default.Search),
                            contentDescription = null,
                        )
                    },
                    lineLimits = TextFieldLineLimits.SingleLine,
                )
                Spacer(Modifier.height(16.dp))
                GdsInput(
                    state = rememberTextFieldState(),
                    label = "Label",
                    supportLabel = "Support Label - Default variant",
                    supportingText = "Support message (disabled).",
                    leadingIcon = {
                        Icon(
                            painter = rememberVectorPainter(image = Icons.Default.Search),
                            contentDescription = null,
                        )
                    },
                    lineLimits = TextFieldLineLimits.MultiLine(minHeightInLines = 4),
                )
                Spacer(Modifier.height(16.dp))
                GdsInput(
                    state = rememberTextFieldState(),
                    clearable = true,
                    style = GdsInputDefaults.containedStyle(),
                    placeholderText = "Placeholder text",
                    supportingText = "Contained variant",
                    errorMessage = "Error message.",
                )
                Spacer(Modifier.height(16.dp))
                GdsInput(
                    state = rememberTextFieldState("read only text"),
                    label = "Label3",
                    style = GdsInputDefaults.containedStyle(),
                    enabled = true,
                    readOnly = true,
                    supportingText = "Support message.",
                )
            }
        }
    }
}
