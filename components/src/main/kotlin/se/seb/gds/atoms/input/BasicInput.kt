package se.seb.gds.atoms.input

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.collectLatest
import se.seb.gds.components.R
import se.seb.gds.icons.GdsIcons

/**
 * Configuration class for the [BasicInput] composable.
 *
 * @property enabled Whether the input field is enabled for user interaction.
 * @property readOnly Whether the input field is read-only.
 * @property clearable Whether the input field includes a clear button to clear the text.
 * @property showInfoIcon Whether to display an info icon in the trailing content.
 * @property maxCharacters Optional maximum character limit for the input field.
 * @property isError Whether the input field is in an error state.
 * @property errorMessage Optional error message displayed below the input field.
 * @property overrideTextDescription Optional text description to override the default accessibility description.
 * @property lineLimits Line limits for the input field, such as single-line or multi-line.
 */
data class BasicInputState(
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val clearable: Boolean = true,
    val showInfoIcon: Boolean = false,
    val maxCharacters: Int? = null,
    val isError: Boolean = false,
    val errorMessage: String? = null,
    val overrideTextDescription: String? = null,
    val lineLimits: TextFieldLineLimits = TextFieldLineLimits.Default,
)

/**
 * A composable function that provides the basic structure for an input field. It provides accessibility description and focus management.
 * Integrates focus management, interaction handling, and accessibility features.
 *
 * @param modifier Modifier to be applied to the input field container.
 * @param state The state of the text field, including the current text value.
 * @param label Optional label text displayed above the input field.
 * @param supportLabel Optional support label displayed below the main label.
 * @param inputState Configuration for the input field, including error state, max characters, transformations, and callbacks.
 * @param interactionSource Source of user interactions for the input field.
 * @param onInfoIconClick Callback invoked when the info icon is clicked.
 * @param onInteraction Callback invoked on user interactions.
 * @param onValueChange Callback invoked when the text value changes.
 * @param content A composable lambda that provides the main content. Use InputContainer inside this lambda to render the actual input field UI.
 */
@Composable
internal fun BasicInput(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    label: String? = null,
    supportLabel: String? = null,
    inputState: BasicInputState = BasicInputState(),
    interactionSource: MutableInteractionSource = remember {
        MutableInteractionSource()
    },
    onInfoIconClick: () -> Unit = { },
    onValueChange: (String) -> Unit = {},
    onInteraction: (Interaction) -> Unit = {},
    content: @Composable ((Boolean) -> Unit),
) {
    val focusManager = LocalFocusManager.current
    val textFieldIsFocused by interactionSource.collectIsFocusedAsState()
    val bringIntoViewRequester = remember { BringIntoViewRequester() }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collectLatest { value ->
            if (value is DragInteraction.Start) {
                focusManager.clearFocus(true)
            } else {
                onInteraction(value)
            }
        }
    }

    LaunchedEffect(state.text) {
        onValueChange(state.text.toString())
    }

    val textFieldDescription = getAccessibilityDescription(
        inputState,
        state,
        textFieldIsFocused,
        label,
        supportLabel,
    )

    val customActionsList = buildCustomAccessibilityActions(
        trailingIconDescription = stringResource(R.string.input_info_icon_description)
            .takeIf { inputState.showInfoIcon },
        onTrailingIconClick = onInfoIconClick
            .takeIf { inputState.showInfoIcon },
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

/**
 * A composable function responsible for rendering the actual container text field UI, including its border, background, and layout.
 *
 * @param modifier Modifier to be applied to the container.
 * @param state The state of the text field, including the current text value.
 * @param style The style configuration for the input field, including text styles and colors.
 * @param inputState Configuration for the input field.
 * @param contentPadding Padding values for the content inside the container.
 * @param textFieldIsFocused Whether the text field is currently focused.
 * @param scrollState Scroll state for the input field.
 * @param interactionSource Source of user interactions for the input field.
 * @param inputTransformationChain Optional chain of input transformations to apply to the text input.
 * @param outputTransformation Optional output transformation to apply to the text input.
 * @param keyboardOptions Keyboard options for the input field.
 * @param labelContent A composable lambda for rendering the label content.
 * @param trailingContent A composable lambda for rendering the trailing content.
 * @param onTextLayoutResult Callback invoked when the text layout result is calculated.
 * @param characterWhitelistPredicate Predicate function to filter allowed characters in the input.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputContainer(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    style: BasicInputStyle,
    inputState: BasicInputState = BasicInputState(),
    contentPadding: PaddingValues,
    textFieldIsFocused: Boolean = false,
    scrollState: ScrollState = rememberScrollState(),
    interactionSource: MutableInteractionSource = remember {
        MutableInteractionSource()
    },
    inputTransformationChain: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    labelContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (RowScope.() -> Unit)? = null,
    onTextLayoutResult: (textLineCount: Int) -> Unit = { },
    characterWhitelistPredicate: (
        CharSequence,
        CharSequence,
    ) -> Boolean = { _: CharSequence, _: CharSequence -> true },
) {
    val containerSize = style.getCurrentContainerShape()

    val inputTransformationChain = inputTransformationChain
        .thenIfNotNull(
            inputState.maxCharacters?.let { MaxCharacterInputTransformation(it) },
        )
        .thenIfNotNull(CharacterWhitelistInputTransformation(characterWhitelistPredicate))

    val borderStroke = animateBorderStrokeAsState(
        style,
        inputState.isError,
        textFieldIsFocused,
    )

    Box(
        modifier = modifier
            .borderIf(
                style.showBorder || inputState.isError,
                borderStroke.value,
                containerSize.shape
            )
            .heightIn(containerSize.height)
            .background(
                shape = containerSize.shape,
                color = style.colors.containerColor(inputState.enabled),
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
                    modifier = Modifier
                        .semantics { hideFromAccessibility() }
                        .weight(1f),
                    enabled = inputState.enabled,
                    readOnly = inputState.readOnly,
                    textStyle = style.inputTextStyle.copy(
                        color = style.colors.inputTextColor(inputState.enabled),
                    ),
                    lineLimits = inputState.lineLimits,
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
                            innerTextField = { innerTextField() },
                            enabled = inputState.enabled,
                            label = labelContent,
                            singleLine = false,
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

/**
 * Displays an error message with an error icon. Used as a footer for input fields.
 *
 * @param errorMessage The error message to display.
 * @param style The style configuration for the input field, including text styles and colors.
 */
@Composable
internal fun ErrorFooter(
    errorMessage: String = "",
    style: BasicInputStyle,
) {
    Row(
        Modifier
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Icon(
            modifier = Modifier
                .size(20.dp)
                .align(Alignment.CenterVertically),
            imageVector = GdsIcons.Solid.TriangleExclamation,
            contentDescription = null,
            tint = style.colors.errorTextColor,
        )
        Text(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),
            text = errorMessage,
            style = style.errorMessageStyle,
            color = style.colors.errorTextColor,
        )
    }
}

/**
 * Animates the border stroke color and thickness for the input field based on error and focus state.
 *
 * @param style The style configuration for the input field.
 * @param isError Whether the input field is in an error state.
 * @param focused Whether the input field is currently focused.
 * @return A State object containing the animated BorderStroke.
 */
@Composable
internal fun animateBorderStrokeAsState(
    style: BasicInputStyle,
    isError: Boolean,
    focused: Boolean,
): State<BorderStroke> {
    val targetColor = style.colors.borderColor(isError)
    val indicatorColor = animateColorAsState(targetColor, tween(durationMillis = 150))

    val targetThickness = style.getBorderWidth(focused, isError)
    val thickness = animateDpAsState(targetThickness, tween(durationMillis = 150))
    return rememberUpdatedState(BorderStroke(thickness.value, indicatorColor.value))
}

/**
 * Chains two InputTransformation objects if both are not null.
 *
 * @receiver The first InputTransformation or null.
 * @param next The next InputTransformation or null.
 * @return The chained InputTransformation or null if both are null.
 */
private fun InputTransformation?.thenIfNotNull(next: InputTransformation?): InputTransformation? {
    return when {
        this == null -> next
        next == null -> this
        else -> this.then(next)
    }
}

/**
 * Builds the accessibility description string for the input field.
 *
 * @param state The state of the text field, including the current text value.
 * @param textFieldIsFocused Whether the text field is currently focused.
 * @param label Optional label text displayed above the input field.
 * @param supportLabel Optional support label displayed below the main label.
 * @return The accessibility description string.
 */
@Composable
private fun getAccessibilityDescription(
    inputState: BasicInputState,
    state: TextFieldState,
    textFieldIsFocused: Boolean,
    label: String?,
    supportLabel: String?,
): String {
    val descriptionBuilder = StringBuilder()

    if (inputState.isError) {
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

    val currentText = inputState.overrideTextDescription ?: state.text
    if (currentText.isNotEmpty()) {
        descriptionBuilder.append(currentText)
        descriptionBuilder.append(". ")
    }

    descriptionBuilder.append(stringResource(id = R.string.text_field))

    if (textFieldIsFocused && !inputState.readOnly) {
        descriptionBuilder.append(", ")
        descriptionBuilder.append(stringResource(id = R.string.text_field_is_editing))
        inputState.maxCharacters?.let {
            descriptionBuilder.append(", ")
            descriptionBuilder.append(
                stringResource(
                    id = R.string.text_field_characters_written,
                    state.text.length,
                    it,
                ),
            )
        }
    } else if (inputState.readOnly) {
        descriptionBuilder.append(", ")
        descriptionBuilder.append(stringResource(id = R.string.text_field_disabled))
    }

    return descriptionBuilder.toString().replace(" ,", ",").trim()
}

/**
 * Builds a list of custom accessibility actions for the input field, such as clear and trailing icon actions.
 *
 * @param trailingIconDescription Optional description for the trailing icon.
 * @param onTrailingIconClick Callback invoked when the trailing icon is clicked.
 * @param onClearText Callback invoked to clear the text field.
 * @return A list of CustomAccessibilityAction objects.
 */
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

/**
 * Clears the text in the provided TextFieldState.
 *
 * @param state The state of the text field to clear.
 */
fun clearText(state: TextFieldState) {
    state.edit {
        delete(0, state.text.length)
    }
}

/**
 * Returns true if the input field is multi-line based on line limits and current line count.
 *
 * @param lineLimits The line limits for the input field.
 * @param textLineCount The current number of lines in the text field.
 * @return True if multi-line, false otherwise.
 */
internal fun isMultiLine(
    lineLimits: TextFieldLineLimits,
    textLineCount: Int,
): Boolean =
    lineLimits is TextFieldLineLimits.MultiLine &&
        (lineLimits.minHeightInLines > 1 || textLineCount > 1)

/**
 * Applies a border to the modifier if showBorder is true.
 *
 * @param showBorder Whether to show the border.
 * @param border The BorderStroke to apply.
 * @param shape The shape of the border.
 * @receiver The original Modifier.
 * @return The modified Modifier with border if showBorder is true.
 */
fun Modifier.borderIf(
    showBorder: Boolean,
    border: BorderStroke,
    shape: Shape,
): Modifier {
    return if (showBorder) {
        this.border(border, shape)
    } else {
        this
    }
}
