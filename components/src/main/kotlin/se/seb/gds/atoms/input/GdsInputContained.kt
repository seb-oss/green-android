package se.seb.gds.atoms.input

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
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
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.CustomAccessibilityAction
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.customActions
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.lerp
import kotlinx.coroutines.flow.collectLatest
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.common.isLandscape
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * A composable function that renders a contained input field.
 * In this variant, the input field has a label inside the container, which floats above the field when focused.
 *
 * @param modifier Modifier to be applied to the input field.
 * @param state The state of the text field, including the current text value.
 * @param style The style configuration for the input field, including text styles and colors.
 * @param label The label text displayed inside the container.
 * @param inputState The state configuration for the input field, including error states and character limits.
 * @param inputTransformation Optional transformation applied to the input text.
 * @param outputTransformation Optional transformation applied to the output text.
 * @param keyboardOptions Keyboard options for the input field.
 * @param scrollState Scroll state for the input field.
 * @param interactionSource Source of user interactions for the input field.
 * @param onInteraction Callback invoked on user interactions.
 * @param characterWhitelistPredicate Predicate function to filter allowed characters in the input.
 * @param onValueChange Callback invoked when the text value changes.
 *
 * Example usage:
 * ```
 * var text by remember { mutableStateOf("") }
 * GdsInputContained(
 *     state = rememberTextFieldState(text),
 *     label = "Label",
 *     onValueChange = { text = it }
 * )
 * ```
 */
@Composable
fun GdsInputContained(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    style: InputContainedStyle = GdsInputDefaults.containedStyle(),
    label: String,
    inputState: BasicInputState = BasicInputState(),
    inputTransformation: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    scrollState: ScrollState = rememberScrollState(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onInteraction: (Interaction) -> Unit = {},
    characterWhitelistPredicate: (
        CharSequence,
        CharSequence,
    ) -> Boolean = { _: CharSequence, _: CharSequence -> true },
    onValueChange: (String) -> Unit = {},
) {
    val isTextFieldFocused by interactionSource.collectIsFocusedAsState()

    InputContainedCore(
        modifier = modifier,
        state = state,
        style = style,
        label = label,
        inputState = inputState,
        isTextFieldFocused = isTextFieldFocused,
        inputTransformation = inputTransformation,
        outputTransformation = outputTransformation,
        keyboardOptions = keyboardOptions,
        scrollState = scrollState,
        interactionSource = interactionSource,
        onInteraction = onInteraction,
        characterWhitelistPredicate = characterWhitelistPredicate,
        onValueChange = onValueChange,
        customActionsList = buildCustomAccessibilityActions {
            state.clearText()
        }.takeIf { inputState.clearable },
        textFieldDescription = getAccessibilityDescription(
            inputState,
            state,
            isTextFieldFocused,
            label,
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
 * A composable function that renders a contained input field.
 * In this variant, the input field has a label inside the container, which floats above the field when focused.
 *
 * @param modifier Modifier to be applied to the input field.
 * @param state The state of the text field, including the current text value.
 * @param style The style configuration for the input field, including text styles and colors.
 * @param label The label text displayed inside the container.
 * @param inputState The state configuration for the input field, including error states and character limits.
 * @param isTextFieldFocused Indicates whether the text field is currently focused.
 * @param inputTransformation Optional transformation applied to the input text.
 * @param outputTransformation Optional transformation applied to the output text.
 * @param keyboardOptions Keyboard options for the input field.
 * @param scrollState Scroll state for the input field.
 * @param interactionSource Source of user interactions for the input field.
 * @param onInteraction Callback invoked on user interactions.
 * @param characterWhitelistPredicate Predicate function to filter allowed characters in the input.
 * @param onValueChange Callback invoked when the text value changes.
 * @param customActionsList List of custom accessibility actions for the input field.
 * @param textFieldDescription Content description for the input field, used for accessibility.
 * @param textFieldEditDescription Description for the edit action of the input field, used for accessibility.
 *
 */
@Composable
fun InputContainedCore(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    style: InputContainedStyle = GdsInputDefaults.containedStyle(),
    label: String,
    inputState: BasicInputState = BasicInputState(),
    isTextFieldFocused: Boolean = false,
    inputTransformation: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    scrollState: ScrollState = rememberScrollState(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onInteraction: (Interaction) -> Unit = {},
    characterWhitelistPredicate: (
        CharSequence,
        CharSequence,
    ) -> Boolean = { _: CharSequence, _: CharSequence -> true },
    onValueChange: (String) -> Unit = {},
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
        onValueChange(text)
    }

    val labelAnimationProgress by animateFloatAsState(
        targetValue = if (isTextFieldFocused || state.text.isNotEmpty()) 1f else 0f,
    )

    val labelTextStyle by remember(labelAnimationProgress) {
        derivedStateOf {
            lerp(
                style.largeLabelStyle,
                style.smallLabelStyle,
                labelAnimationProgress,
            )
        }
    }

    val isError = inputState.isError || isCharacterLimitError
    val errorMessage = if (isCharacterLimitError) {
        characterLimitErrorMessage.orEmpty()
    } else {
        inputState.errorMessage.orEmpty()
    }

    CompositionLocalProvider(
        LocalTextSelectionColors provides style.basicInputStyle.textSelectionColors,
    ) {
        BasicTextField(
            modifier = modifier
                .bringIntoViewRequester(bringIntoViewRequester)
                .focusRequester(focusRequester)
                .clearAndSetSemantics {
                    contentDescription = textFieldDescription.orEmpty()
                    customActions = customActionsList.orEmpty()
                    if (isCharacterLimitError) {
                        characterLimitErrorDescription?.let {
                            error(it)
                        }
                    }
                    onClick(textFieldEditDescription, null)
                },
            state = state,
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
            ),
            outputTransformation = outputTransformation,
            interactionSource = interactionSource,
            keyboardOptions = keyboardOptions,
            decorator = { innerTextField ->
                TextFieldDefaults.DecorationBox(
                    isError = isError,
                    colors = GdsInputDefaults.textFieldColors(),
                    contentPadding = containerContentPadding(isLandscape()),
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
                        // Text field and clear button
                        Row(horizontalArrangement = Arrangement.SpaceBetween) {
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(top = GdsTheme.dimensions.spacing.Space4Xs),
                            ) { innerTextField() }
                            if (!inputState.readOnly && inputState.clearable) {
                                ClearButton(
                                    modifier = Modifier
                                        .padding(start = GdsTheme.dimensions.spacing.SpaceXs)
                                        .align(Alignment.CenterVertically)
                                        .alpha(if (state.text.isNotEmpty() && isTextFieldFocused) 1f else 0f),
                                    enabled = state.text.isNotEmpty(),
                                    onClick = { state.clearText() },
                                )
                            }
                        }
                    },
                    supportingText = errorContent(isError, errorMessage, style.basicInputStyle),
                    label = {
                        // Label and character counter
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Text(
                                modifier = Modifier.weight(1f),
                                text = label,
                                style = labelTextStyle.merge(
                                    color = style.basicInputStyle.colors.floatingLabelColor,
                                ),
                            )
                            if (inputState.hasCharacterLimit() && isTextFieldFocused) {
                                CharacterAmountIndicator(
                                    maxCharacters = inputState.characterLimit?.maxCharacters,
                                    currentCharacters = state.text.length,
                                    textStyle = style.basicInputStyle.characterCounter,
                                    color = style.basicInputStyle.colors.characterCounterColor,
                                )
                            }
                        }
                    },
                )
            },
        )
    }
}

/**
 * Builds a list of custom accessibility actions for the input field, such as clear and trailing icon actions.
 *
 * @param onClearText Callback invoked to clear the text field.
 * @return A list of CustomAccessibilityAction objects.
 */
@Composable
private fun buildCustomAccessibilityActions(onClearText: (() -> Unit)?): List<CustomAccessibilityAction> =
    buildList {
        onClearText?.let {
            add(
                CustomAccessibilityAction(stringResource(id = R.string.clear_button_description)) {
                    it()
                    true
                },
            )
        }
    }

/**
 * Provides padding values for the container content based on the device orientation.
 *
 * @param isLandscape Indicates whether the device is in landscape orientation. Defaults to false.
 * @return A `PaddingValues` object with appropriate horizontal and vertical padding.
 */
@Composable
private fun containerContentPadding(isLandscape: Boolean = false): PaddingValues {
    return if (isLandscape) {
        PaddingValues(
            horizontal = GdsTheme.dimensions.spacing.SpaceM,
            vertical = GdsTheme.dimensions.spacing.SpaceS,
        )
    } else {
        PaddingValues(
            horizontal = GdsTheme.dimensions.spacing.SpaceM,
            vertical = GdsTheme.dimensions.spacing.SpaceM,
        )
    }
}

@GdsUiPreview
@Composable
private fun TextFieldPreview() {
    GdsTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(GdsTheme.colors.State.Neutral01),
        ) {
            Column(
                modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
                verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceM),
            ) {
                GdsInputContained(
                    state = rememberTextFieldState("Text"),
                    label = "Label",
                )
                GdsInputContained(
                    state = rememberTextFieldState(),
                    label = "Label",
                    inputState = BasicInputState(
                        isError = true,
                        errorMessage = "Error message.",
                    ),
                )
            }
        }
    }
}
