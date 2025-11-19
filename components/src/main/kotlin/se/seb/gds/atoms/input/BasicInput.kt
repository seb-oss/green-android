package se.seb.gds.atoms.input

import android.content.res.Configuration
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.delete
import androidx.compose.foundation.text.input.then
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalConfiguration
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import se.seb.gds.components.R

@Composable
internal fun BasicInput(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    label: String? = null,
    supportLabel: String?,
    overrideTextDescription: String? = null,
    readOnly: Boolean = false,
    isError: Boolean = false,
    maxCharacters: Int? = null,
    interactionSource: MutableInteractionSource = remember {
        MutableInteractionSource()
    },
    onTrailingIconClick: (() -> Unit)? = null,
    trailingIconDescription: String? = null,
    onInteraction: (Interaction) -> Unit = {},
    onValueChange: (String) -> Unit = {},
    content: @Composable ((Boolean) -> Unit),
) {
    val scope = rememberCoroutineScope()
    val focusManager = LocalFocusManager.current
    val textFieldIsFocused by interactionSource.collectIsFocusedAsState()
    val bringIntoViewRequester = remember { BringIntoViewRequester() }

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
        label,
        supportLabel,
        isError,
    )

    val customActionsList = buildCustomAccessibilityActions(
        trailingIconDescription = trailingIconDescription,
        onTrailingIconClick = onTrailingIconClick,
        onClearText = { clearText(state) },
    )

    val doubleTapToEditText = stringResource(id = R.string.text_field_edit)

    Column(
        modifier = modifier
            .bringIntoViewRequester(bringIntoViewRequester)
            .clearAndSetSemantics {
                contentDescription = textFieldDescription
                customActions = customActionsList
                onClick(doubleTapToEditText, null)
            },
    ) {
        content(textFieldIsFocused)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FieldContainer(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    contentPadding: PaddingValues,
    textFieldIsFocused: Boolean = false,
    readOnly: Boolean = false,
    style: GdsInputStyle = GdsInputDefaults.defaultStyle(),
    enabled: Boolean = true,
    isError: Boolean = false,
    lineLimits: TextFieldLineLimits = TextFieldLineLimits.Default,
    maxCharacters: Int? = null,
    characterWhitelistPredicate: (
        CharSequence,
        CharSequence,
    ) -> Boolean = { _: CharSequence, _: CharSequence -> true },
    scrollState: ScrollState = rememberScrollState(),
    interactionSource: MutableInteractionSource = remember {
        MutableInteractionSource()
    },
    inputTransformationChain: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    innerInputContent: @Composable ((@Composable (() -> Unit)) -> Unit) = {},
    labelContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (RowScope.() -> Unit)? = null,
    onTextLayoutResult: (textLineCount: Int) -> Unit = { },
) {
    val containerSize = style.getContainerSize(isLandscape())

    val inputTransformationChain = inputTransformationChain
        .thenIfNotNull(
            maxCharacters?.let { MaxCharacterInputTransformation(it) },
        )
        .thenIfNotNull(CharacterWhitelistInputTransformation(characterWhitelistPredicate))

    Box(
        modifier = Modifier
            .outlineBorder(
                show = style.showBorder || isError,
                width = style.getBorderWidth(textFieldIsFocused, isError),
                color = style.colors.borderColor(isError),
                shape = containerSize.shape,
            )
            .then(
                Modifier
                    .heightIn(containerSize.height)
                    .background(
                        shape = containerSize.shape,
                        color = style.colors.containerColor(enabled),
                    ),
            ),
        contentAlignment = Alignment.TopCenter,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(horizontal = 16.dp),
        ) {
            CompositionLocalProvider(
                LocalTextSelectionColors provides style.textSelectionColors,
            ) {
                BasicTextField(
                    state = state,
                    modifier = modifier
                        .semantics { hideFromAccessibility() }
                        .weight(1f),
                    enabled = enabled,
                    readOnly = readOnly,
                    textStyle = style.textStyle.inputTextStyle.copy(
                        color = style.colors.inputTextColor(enabled),
                    ),
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
                            onTextLayoutResult(textLayoutResult.lineCount)
                        }
                    },
                    decorator = { innerTextField ->
                        TextFieldDefaults.DecorationBox(
                            contentPadding = contentPadding,
                            value = state.text.toString(),
                            visualTransformation = VisualTransformation.None,
                            innerTextField = { innerInputContent(innerTextField) },
                            enabled = enabled,
                            label = labelContent,
                            singleLine = false,
                            isError = isError,
                            interactionSource = interactionSource,
                            colors = GdsInputDefaults.textFieldColors(),
                        )
                    },
                )
            }
            trailingContent?.invoke(this)
        }
    }
}

private fun InputTransformation?.thenIfNotNull(next: InputTransformation?): InputTransformation? {
    return when {
        this == null -> next
        next == null -> this
        else -> this.then(next)
    }
}

private fun Modifier.outlineBorder(
    show: Boolean,
    width: Dp,
    color: Color,
    shape: Shape,
) = if (!show || width <= 0.dp) {
    this
} else {
    this.drawBehind {
        val strokeWidth = width.toPx()
        drawOutline(
            outline = shape.createOutline(size, layoutDirection, this),
            color = color,
            style = Stroke(width = strokeWidth),
        )
    }
}

@Composable
private fun getAccessibilityDescription(
    maxCharacters: Int?,
    state: TextFieldState,
    overrideTextDescription: String?,
    textFieldIsFocused: Boolean,
    readOnly: Boolean,
    label: String?,
    supportLabel: String?,
    isError: Boolean,
): String {
    val descriptionBuilder = StringBuilder()

    if (isError) {
        descriptionBuilder.append(stringResource(id = R.string.text_field_error_in_field))
        descriptionBuilder.append(", ")
    }

    label?.let {
        if (it.isNotBlank()) {
            descriptionBuilder.append(label)
            descriptionBuilder.append(", ")
        }
    }

    supportLabel?.let {
        descriptionBuilder.append(supportLabel)
        descriptionBuilder.append(", ")
    }

    val currentText = overrideTextDescription ?: state.text
    if (currentText.isNotEmpty()) {
        descriptionBuilder.append(currentText)
        descriptionBuilder.append(". ")
    }

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

fun clearText(state: TextFieldState) {
    state.edit {
        delete(0, state.text.length)
    }
}

@Composable
internal fun isLandscape(): Boolean {
    val configuration = LocalConfiguration.current
    val isLandscape = configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
    return isLandscape
}
