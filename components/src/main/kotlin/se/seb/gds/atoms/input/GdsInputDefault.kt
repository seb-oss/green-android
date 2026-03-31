package se.seb.gds.atoms.input

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.clearText
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.CustomAccessibilityAction
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.customActions
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.VisualTransformation
import kotlinx.coroutines.flow.collectLatest
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.components.R
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

/**
 * A composable function that renders a default input field.
 * In this variant, the label and optional support label are displayed above the input field container.
 *
 * @param modifier Modifier to be applied to the input field.
 * @param state The state of the text field, including the current text value.
 * @param style The style configuration for the input field, including text styles and colors.
 * @param label The main label text displayed above the input field.
 * @param supportLabel Optional support label text displayed below the main label.
 * @param inputTransformation Optional transformation applied to the input text.
 * @param outputTransformation Optional transformation applied to the output text.
 * @param keyboardOptions Configuration options for the software keyboard.
 * @param scrollState Scroll state for the input field.
 * @param interactionSource Source of user interactions for the input field.
 * @param onInteraction Callback invoked on user interactions with the input field.
 * @param characterWhitelistPredicate Predicate function to filter allowed characters in the input.
 * @param onValueChange Callback invoked when the text value changes.
 * @param onInfoIconClick Callback invoked when the info icon is clicked.
 * @param inputState Additional state configuration for the input field.
 * @see BasicInputState for additional state configuration options such as error handling and character limits.
 *
 * Example usage:
 * ```
 * var text by remember { mutableStateOf("") }
 * GdsInputDefault(
 *     state = rememberTextFieldState(text),
 *     label = "Label",
 *     onValueChange = { text = it }
 * )
 * ```
 */
@Composable
fun GdsInputDefault(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    style: InputDefaultStyle = GdsInputDefaults.defaultStyle(),
    label: String,
    supportLabel: String? = null,
    inputTransformation: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    scrollState: ScrollState = rememberScrollState(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onInteraction: (Interaction) -> Unit = {},
    characterWhitelistPredicate: (CharSequence, CharSequence) -> Boolean = { _, _ -> true },
    onValueChange: (String) -> Unit = {},
    onInfoIconClick: (() -> Unit)? = null,
    inputState: BasicInputState = BasicInputState(),
) {
    val isTextFieldFocused by interactionSource.collectIsFocusedAsState()

    InputDefaultCore(
        modifier = modifier,
        state = state,
        style = style,
        label = label,
        supportLabel = supportLabel,
        inputTransformation = inputTransformation,
        outputTransformation = outputTransformation,
        keyboardOptions = keyboardOptions,
        scrollState = scrollState,
        interactionSource = interactionSource,
        onInteraction = onInteraction,
        characterWhitelistPredicate = characterWhitelistPredicate,
        onValueChange = onValueChange,
        onInfoIconClick = onInfoIconClick,
        inputState = inputState,
        isTextFieldFocused = isTextFieldFocused,
        customActionsList = buildCustomAccessibilityActions(
            onInfoIconClick = onInfoIconClick,
            onClearText = { state.clearText() }.takeIf { inputState.clearable },
        ),
        textFieldDescription = getAccessibilityDescription(
            inputState,
            state,
            isTextFieldFocused,
            label,
            supportLabel,
        ),
        textFieldEditDescription = stringResource(id = R.string.text_field_edit),
        characterLimitErrorMessage = inputState.characterLimit?.let {
            stringResource(
                R.string.text_field_character_limit_error,
                it.maxCharacters,
            )
        },
        characterLimitErrorDescription = inputState.characterLimit?.let {
            stringResource(
                R.string.text_field_characters_written,
                state.text.length,
                it.maxCharacters,
            )
        },
    )
}

/**
 * Internal composable function that contains the core implementation of the `GdsInputDefault` input field.
 * This function is separated from the public API to manage additional parameters related to accessibility
 * and focus state without exposing them to the public interface.
 *
 * @param modifier Modifier to be applied to the input field.
 * @param state The state of the text field, including the current text value.
 * @param style The style configuration for the input field, including text styles and colors.
 * @param label The main label text displayed above the input field.
 * @param supportLabel Optional support label text displayed below the main label.
 * @param inputTransformation Optional transformation applied to the input text.
 * @param outputTransformation Optional transformation applied to the output text.
 * @param keyboardOptions Configuration options for the software keyboard.
 * @param scrollState Scroll state for the input field.
 * @param interactionSource Source of user interactions for the input field.
 * @param onInteraction Callback invoked on user interactions with the input field.
 * @param characterWhitelistPredicate Predicate function to filter allowed characters in the input.
 * @param onValueChange Callback invoked when the text value changes.
 * @param onInfoIconClick Callback invoked when the info icon is clicked.
 * @param inputState Additional state configuration for the input field.
 * @param isTextFieldFocused Whether the text field is currently focused.
 * @param customActionsList List of custom accessibility actions for the input field.
 * @param textFieldDescription Accessibility description for the text field.
 * @param textFieldEditDescription Accessibility description for editing the text field.
 */
@Composable
internal fun InputDefaultCore(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    style: InputDefaultStyle = GdsInputDefaults.defaultStyle(),
    label: String,
    inputState: BasicInputState = BasicInputState(),
    supportLabel: String? = null,
    inputTransformation: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    scrollState: ScrollState = rememberScrollState(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onInteraction: (Interaction) -> Unit = {},
    characterWhitelistPredicate: (CharSequence, CharSequence) -> Boolean = { _, _ -> true },
    onValueChange: (String) -> Unit = {},
    onInfoIconClick: (() -> Unit)? = null,
    isTextFieldFocused: Boolean = false,
    characterLimitErrorMessage: String? = null,
    characterLimitErrorDescription: String? = null,
    customActionsList: List<CustomAccessibilityAction>? = null,
    textFieldDescription: String? = null,
    textFieldEditDescription: String? = null,
) {
    val focusManager = LocalFocusManager.current
    val bringIntoViewRequester = remember { BringIntoViewRequester() }
    val focusRequester = remember { FocusRequester() }
    var isCharacterLimitError by rememberSaveable { mutableStateOf(false) }
    val haptics = LocalHapticFeedback.current

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
        val text = state.text.toString()
        isCharacterLimitError = validate(text, inputState.characterLimit)
        if (isCharacterLimitError) {
            haptics.performHapticFeedback(HapticFeedbackType.Reject)
        }
        onValueChange(text)
    }

    val isError = inputState.isError || isCharacterLimitError
    val errorMessage = if (isCharacterLimitError) {
        characterLimitErrorMessage.orEmpty()
    } else {
        inputState.errorMessage.orEmpty()
    }

    Column(
        modifier = modifier
            .bringIntoViewRequester(bringIntoViewRequester)
            .focusRequester(focusRequester)
            .semantics(true) {
                customActions = customActionsList.orEmpty()
                onClick(textFieldEditDescription, null)
            },
    ) {
        InputDefaultHeader(
            label = label,
            supportLabel = supportLabel,
            style = style,
            onInfoIconClick = onInfoIconClick,
        )

        CompositionLocalProvider(
            LocalTextSelectionColors provides style.basicInputStyle.textSelectionColors,
        ) {
            BasicTextField(
                state = state,
                modifier = Modifier
                    .clearAndSetSemantics {
                        contentDescription = textFieldDescription.orEmpty()
                        if (isCharacterLimitError) {
                            characterLimitErrorDescription?.let {
                                error(it)
                            }
                        }
                    },
                readOnly = inputState.readOnly,
                textStyle = style.basicInputStyle.inputTextStyle.copy(
                    color = style.basicInputStyle.colors.inputTextColor,
                ),
                lineLimits = inputState.lineLimits,
                scrollState = scrollState,
                cursorBrush = SolidColor(style.basicInputStyle.colors.cursorColor),
                inputTransformation = basicTransformation(
                    inputTransformation,
                    inputState,
                    characterWhitelistPredicate,
                    onInputRejected = { haptics.performHapticFeedback(HapticFeedbackType.Reject) },
                ),
                outputTransformation = outputTransformation,
                interactionSource = interactionSource,
                keyboardOptions = keyboardOptions,
                decorator = { innerTextField ->
                    TextFieldDefaults.DecorationBox(
                        colors = GdsInputDefaults.textFieldColors(),
                        contentPadding = containerContentPadding,
                        value = state.text.toString(),
                        visualTransformation = VisualTransformation.None,
                        enabled = true,
                        singleLine = false,
                        interactionSource = interactionSource,
                        container = {
                            // Container with border and background
                            InputContainer(
                                basicStyle = style.basicInputStyle,
                                isError = isError,
                                isTextFieldFocused = isTextFieldFocused,
                                inputState = inputState,
                            )
                        },
                        innerTextField = {
                            // Text field, character counter and clear button
                            Row(
                                modifier = Modifier
                                    .height(IntrinsicSize.Min)
                                    .heightIn(GdsTheme.dimensions.spacing.Space3Xl),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Column(modifier = Modifier.weight(1f)) { innerTextField() }
                                TrailingContent(
                                    inputState = inputState,
                                    state = state,
                                    style = style,
                                    isTextFieldFocused = isTextFieldFocused,
                                )
                            }
                        },
                        supportingText = errorContent(isError, errorMessage, style.basicInputStyle),
                    )
                },
            )
        }
    }
}

@Composable
private fun TrailingContent(
    inputState: BasicInputState,
    state: TextFieldState,
    style: InputDefaultStyle,
    isTextFieldFocused: Boolean,
) {
    if (!inputState.readOnly) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = GdsTheme.dimensions.spacing.SpaceXs)
                .alpha(if (isTextFieldFocused) 1f else 0f),
            horizontalAlignment = Alignment.End,
        ) {
            if (inputState.hasCharacterLimit() && isTextFieldFocused) {
                CharacterAmountIndicator(
                    maxCharacters = inputState.characterLimit?.maxCharacters,
                    currentCharacters = state.text.length,
                    textStyle = style.basicInputStyle.characterCounter,
                    color = style.basicInputStyle.colors.characterCounterColor,
                )
            }
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center,
            ) {
                val enabled = state.text.isNotEmpty() && inputState.clearable && isTextFieldFocused
                val alpha = if (enabled) 1f else 0f
                ClearButton(
                    modifier = Modifier.alpha(alpha),
                    enabled = enabled,
                    onClick = { state.clearText() },
                )
            }
        }
    }
}

/**
 * A composable function that renders the header section of the `GdsInputDefault` input field.
 *
 * This header includes the main label, an optional support label, and an optional info icon.
 * The layout adjusts dynamically based on the presence of the support label and the info icon.
 *
 * @param style The style configuration for the input field, including text styles and colors.
 * @param label The main label text displayed above the input field.
 * @param supportLabel Optional support label text displayed below the main label.
 * @param onInfoIconClick Callback invoked when the info icon is clicked.
 */
@Composable
private fun InputDefaultHeader(
    style: InputDefaultStyle,
    label: String,
    supportLabel: String? = null,
    onInfoIconClick: (() -> Unit)? = null,
) {
    val showInfoIcon = onInfoIconClick != null
    Row(
        modifier = Modifier
            .clearAndSetSemantics {
                hideFromAccessibility()
            }
            .padding(start = GdsTheme.dimensions.spacing.SpaceM),
    ) {
        val columnModifier = when {
            // Top padding ensures the ripple effect on the info icon is fully visible.
            showInfoIcon && supportLabel != null -> Modifier.padding(
                top = GdsTheme.dimensions.spacing.SpaceS,
            )

            showInfoIcon -> Modifier.align(Alignment.CenterVertically)

            else -> Modifier
        }

        Column(modifier = columnModifier.weight(1f)) {
            Text(
                color = style.basicInputStyle.colors.labelColor,
                style = style.labelStyle,
                text = label,
            )
            supportLabel?.let {
                Text(
                    style = style.supportLabelStyle,
                    color = style.basicInputStyle.colors.supportLabelColor,
                    text = it,
                )
            }
        }
        onInfoIconClick?.let {
            IconButton(
                modifier = Modifier.padding(
                    start = GdsTheme.dimensions.spacing.SpaceS,
                    end = GdsTheme.dimensions.spacing.Space3Xs,
                ),
                onClick = it,
            ) {
                Icon(
                    imageVector = GdsIcons.Regular.CircleInfo,
                    tint = GdsTheme.colors.Content.Neutral01,
                    contentDescription = null,
                )
            }
        }
    }

    if (!supportLabel.isNullOrBlank() || !showInfoIcon) {
        Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceXs))
    }
}

/**
 * Builds a list of custom accessibility actions for the input field, such as clear and trailing icon actions.
 *
 * @param onInfoIconClick Callback invoked when the trailing icon is clicked.
 * @param onClearText Callback invoked to clear the text field.
 * @return A list of CustomAccessibilityAction objects.
 */
@Composable
private fun buildCustomAccessibilityActions(
    onInfoIconClick: (() -> Unit)?,
    onClearText: (() -> Unit)?,
): List<CustomAccessibilityAction> =
    buildList {
        onClearText?.let {
            add(
                CustomAccessibilityAction(stringResource(id = R.string.clear_button_description)) {
                    it()
                    true
                },
            )
        }
        onInfoIconClick?.let {
            add(
                CustomAccessibilityAction(stringResource(R.string.input_info_icon_description)) {
                    it()
                    true
                },
            )
        }
    }

private val containerContentPadding: PaddingValues
    @Composable
    get() = PaddingValues(
        horizontal = GdsTheme.dimensions.spacing.SpaceM,
        vertical = GdsTheme.dimensions.spacing.SpaceS,
    )

@GdsUiPreview
@Composable
fun TextFieldDefaultPreview() {
    GdsTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(GdsTheme.colors.State.Neutral01),
        ) {
            Column(
                modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
            ) {
                InputDefaultCore(
                    state = rememberTextFieldState("Text"),
                    label = "Label",
                    supportLabel = "Support Label",
                    onInfoIconClick = {},
                    inputState = BasicInputState(
                        characterLimit = CharacterLimit(50),
                    ),
                )
            }
        }
    }
}
