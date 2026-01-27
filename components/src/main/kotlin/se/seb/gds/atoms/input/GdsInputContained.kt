package se.seb.gds.atoms.input

import android.content.res.Configuration
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.role
import androidx.compose.ui.text.lerp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.common.isLandscape
import se.seb.gds.icons.GdsIcons
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
 * @param onInfoIconClick Callback invoked when the info icon is clicked.
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
    onInfoIconClick: () -> Unit = { },
) {
    var textLineCount by remember { mutableIntStateOf(1) }

    BasicInput(
        modifier = modifier,
        state = state,
        label = label,
        inputState = inputState,
        interactionSource = interactionSource,
        onValueChange = onValueChange,
        onInteraction = onInteraction,
        onInfoIconClick = onInfoIconClick,
    ) { textFieldIsFocused ->
        val labelAnimationProgress by animateFloatAsState(
            targetValue = if (textFieldIsFocused || state.text.isNotEmpty()) 1f else 0f,
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

        InputContainer(
            contentPadding = containerContentPadding(isLandscape()),
            textFieldIsFocused = textFieldIsFocused,
            style = style.basicInputStyle,
            state = state,
            inputState = inputState,
            scrollState = scrollState,
            interactionSource = interactionSource,
            inputTransformationChain = inputTransformation,
            outputTransformation = outputTransformation,
            keyboardOptions = keyboardOptions,
            characterWhitelistPredicate = characterWhitelistPredicate,
            labelContent = {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = label,
                        style = labelTextStyle.merge(
                            color = style.basicInputStyle.colors.floatingLabelColor(
                                enabled = inputState.enabled,
                            ),
                        ),
                    )
                }
            },
            trailingContent = {
                val isMultiLine = isMultiLine(inputState.lineLimits, textLineCount)
                val hasCounter = inputState.maxCharacters != null
                val showCounterContainer = (hasCounter && (isMultiLine || textFieldIsFocused)) ||
                    (!hasCounter && isMultiLine)

                val trailingModifier = if (showCounterContainer) {
                    Modifier.padding(containerContentPadding(isLandscape()))
                } else {
                    Modifier.align(Alignment.CenterVertically)
                }

                InputContainedTrailing(
                    modifier = trailingModifier,
                    showCounterContainer = showCounterContainer,
                    inputState = inputState,
                    textFieldIsFocused = textFieldIsFocused,
                    onInfoIconClick = onInfoIconClick,
                    style = style.basicInputStyle,
                    state = state,
                    clearText = { clearText(state) },
                )
            },
            onTextLayoutResult = { lineCount -> textLineCount = lineCount },
        )
        if (inputState.isError && !inputState.errorMessage.isNullOrBlank()) {
            ErrorFooter(errorMessage = inputState.errorMessage, style = style.basicInputStyle)
        }
    }
}

/**
 * A composable function that renders the trailing content for the `GdsInputContained` inside the container.
 *
 * This trailing content includes optional elements such as a character counter, a clear button,
 * an info icon, and an error icon.
 *
 * @param modifier Modifier to be applied to the trailing content container.
 * @param textFieldIsFocused Whether the text field is currently focused.
 * @param showCounterContainer Show counter container to align trailing content with text input.
 * The content inside can be hidden with alpha
 * @param onInfoIconClick Callback invoked when the info icon is clicked.
 * @param clearText Callback invoked to clear the text in the input field.
 * @param style The style configuration for the input field, including text styles and colors.
 * @param state The state of the text field, including the current text value.
 */
@Composable
private fun InputContainedTrailing(
    modifier: Modifier = Modifier,
    textFieldIsFocused: Boolean = false,
    showCounterContainer: Boolean = true,
    onInfoIconClick: () -> Unit = { },
    clearText: () -> Unit? = { },
    style: BasicInputStyle,
    state: TextFieldState,
    inputState: BasicInputState,
) {
    Column(
        modifier = modifier.padding(start = GdsTheme.dimensions.spacing.SpaceXs),
        horizontalAlignment = Alignment.End,
    ) {
        if (showCounterContainer) {
            val alpha = if (textFieldIsFocused && inputState.maxCharacters != null) 1f else 0f
            CharacterAmountIndicator(
                modifier = Modifier.alpha(alpha = alpha),
                textStyle = style.characterCounter,
                color = style.colors.floatingLabelColor,
                maxCharacters = inputState.maxCharacters,
                currentCharacters = state.text.length,
            )
        }
        Row(
            modifier = Modifier
                .animateContentSizeIf(inputState.showInfoIcon)
                .heightIn(min = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceS),
        ) {
            if (inputState.showInfoIcon) {
                Icon(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                        .clearAndSetSemantics { role = Role.Button }
                        .clickable(onClick = onInfoIconClick),
                    imageVector = GdsIcons.Regular.CircleInfo,
                    contentDescription = null,
                )
            }
            val showClearButton =
                inputState.clearable && state.text.isNotEmpty() && textFieldIsFocused
            AnimatedVisibility(
                visible = showClearButton,
                enter = if (inputState.showInfoIcon) {
                    scaleIn(animationSpec = spring(stiffness = Spring.StiffnessMedium))
                } else {
                    EnterTransition.None
                },
                exit = ExitTransition.None,
            ) {
                ClearButton(
                    onClick = { clearText() },
                )
            }
            val hasContainedError = inputState.isError && inputState.errorMessage.isNullOrBlank()
            val showErrorIcon = hasContainedError && !textFieldIsFocused
            if (showErrorIcon) {
                Icon(
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.CenterVertically),
                    imageVector = GdsIcons.Solid.TriangleExclamation,
                    contentDescription = null,
                    tint = style.colors.errorTextColor,
                )
            }
        }
    }
}

private fun Modifier.animateContentSizeIf(condition: Boolean): Modifier {
    return if (condition) {
        this.animateContentSize(
            animationSpec = spring(stiffness = Spring.StiffnessHigh),
        )
    } else {
        this
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
            horizontal = GdsTheme.dimensions.spacing.Space0,
            vertical = GdsTheme.dimensions.spacing.SpaceXs,
        )
    } else {
        PaddingValues(
            horizontal = GdsTheme.dimensions.spacing.Space0,
            vertical = GdsTheme.dimensions.spacing.SpaceM,
        )
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
                modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
                verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceM),
            ) {
                GdsInputContained(
                    state = rememberTextFieldState("Text"),
                    label = "Label",
                    inputState = BasicInputState(
                        showInfoIcon = true,
                    ),
                )
                GdsInputContained(
                    state = rememberTextFieldState(),
                    label = "Label",
                    inputState = BasicInputState(
                        showInfoIcon = true,
                        isError = true,
                        errorMessage = "Error message.",
                    ),
                )
                GdsInputContained(
                    state = rememberTextFieldState(),
                    label = "Label",
                    inputState = BasicInputState(
                        showInfoIcon = true,
                        isError = true,
                    ),
                )
            }
        }
    }
}
