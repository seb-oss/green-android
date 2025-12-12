package se.seb.gds.atoms.input

import android.content.res.Configuration
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.common.isLandscape
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
    onInfoIconClick: () -> Unit = { },
    inputState: BasicInputState = BasicInputState()
) {
    var textLineCount by remember { mutableIntStateOf(1) }

    BasicInput(
        modifier = modifier,
        state = state,
        label = label,
        supportLabel = supportLabel,
        inputState = inputState,
        interactionSource = interactionSource,
        onInfoIconClick = onInfoIconClick,
        onValueChange = onValueChange,
        onInteraction = onInteraction,
    ) { textFieldIsFocused ->
        InputDefaultHeader(
            label = label,
            supportLabel = supportLabel,
            style = style,
            showInfoIcon = inputState.showInfoIcon,
            onInfoIconClick = onInfoIconClick,
        )
        InputContainer(
            contentPadding = containerContentPadding,
            textFieldIsFocused = textFieldIsFocused,
            style = style.basicInputStyle,
            inputState = inputState,
            state = state,
            scrollState = scrollState,
            interactionSource = interactionSource,
            inputTransformationChain = inputTransformation,
            characterWhitelistPredicate = characterWhitelistPredicate,
            outputTransformation = outputTransformation,
            keyboardOptions = keyboardOptions,
            trailingContent = {
                val isMultiLine = isMultiLine(inputState.lineLimits, textLineCount)
                val trailingModifier = Modifier
                    .alpha(if (textFieldIsFocused) 1f else 0f)
                    .let {
                        if (isMultiLine) {
                            it.padding(containerContentPadding)
                        } else {
                            it.align(Alignment.CenterVertically)
                        }
                    }
                InputDefaultTrailing(
                    modifier = trailingModifier,
                    textFieldIsFocused = textFieldIsFocused,
                    clearable = inputState.clearable,
                    style = style.basicInputStyle,
                    maxCharacters = inputState.maxCharacters,
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
 * A composable function that renders the header section of the `GdsInputDefault` input field.
 *
 * This header includes the main label, an optional support label, and an optional info icon.
 * The layout adjusts dynamically based on the presence of the support label and the info icon.
 *
 * @param style The style configuration for the input field, including text styles and colors.
 * @param label The main label text displayed above the input field.
 * @param supportLabel Optional support label text displayed below the main label.
 * @param showInfoIcon Whether to display an info icon in the header.
 * @param onInfoIconClick Callback invoked when the info icon is clicked.
 */
@Composable
private fun InputDefaultHeader(
    style: InputDefaultStyle,
    label: String,
    supportLabel: String? = null,
    showInfoIcon: Boolean = false,
    onInfoIconClick: () -> Unit = { },
) {
    Row(modifier = Modifier.padding(start = 16.dp)) {
        val columnModifier = when {
            // Top padding ensures the ripple effect on the info icon is fully visible.
            showInfoIcon && supportLabel != null -> Modifier.padding(top = 12.dp)
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
        if (showInfoIcon) {
            IconButton(
                modifier = Modifier.padding(start = GdsTheme.dimensions.spacing.SpaceS, end = 4.dp),
                onClick = onInfoIconClick,
            ) {
                Icon(imageVector = GdsIcons.Regular.CircleInfo, contentDescription = null)
            }
        }
    }

    if (!supportLabel.isNullOrBlank() || !showInfoIcon) {
        Spacer(Modifier.height(8.dp))
    }
}

/**
 * A composable function that renders the trailing content for the [GdsInputDefault] inside the container.
 *
 * This trailing content includes an optional character counter and a clear button.
 * The layout dynamically adjusts based on the device orientation (landscape or portrait).
 *
 * @param modifier Modifier to be applied to the trailing content container.
 * @param clearable Whether the input field includes a clear button to clear the text.
 * @param style The style configuration for the input field, including text styles and colors.
 * @param maxCharacters Optional maximum character limit for the input field.
 * @param state The state of the text field, including the current text value.
 * @param clearText Callback invoked to clear the text in the input field.
 * @param textFieldIsFocused Whether the text field is currently focused.
 */
@Composable
private fun InputDefaultTrailing(
    modifier: Modifier = Modifier,
    clearable: Boolean = true,
    style: BasicInputStyle,
    maxCharacters: Int?,
    state: TextFieldState,
    clearText: () -> Unit?,
    textFieldIsFocused: Boolean,
) {
    val content: @Composable () -> Unit = {
        if (maxCharacters != null) {
            CharacterAmountIndicator(
                textStyle = style.characterCounter,
                color = style.colors.floatingLabelColor,
                maxCharacters = maxCharacters,
                currentCharacters = state.text.length,
            )
        }
        if (clearable) {
            ClearButton(
                modifier = Modifier.alpha(if (state.text.isNotEmpty()) 1f else 0f),
                enabled = state.text.isNotEmpty() && textFieldIsFocused,
                onClick = { clearText() },
            )
        }
    }

    if (isLandscape()) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) { content() }
    } else {
        Column(
            modifier = modifier.padding(start = 8.dp),
            horizontalAlignment = Alignment.End,
        ) { content() }
    }
}

private val containerContentPadding = PaddingValues(
    horizontal = 0.dp,
    vertical = 16.dp,
)

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
                GdsInputDefault(
                    state = rememberTextFieldState("Text"),
                    label = "Label",
                    supportLabel = "Support Label",
                    inputState = BasicInputState(
                        showInfoIcon = true,
                        maxCharacters = 50,
                    ),
                )
                Spacer(Modifier.height(16.dp))

                Spacer(Modifier.height(16.dp))
                GdsInputDefault(
                    state = rememberTextFieldState(),
                    label = "Label",
                    supportLabel = "Support Label",
                    inputState = BasicInputState(
                        errorMessage = "Error message.",
                        isError = true,
                    ),
                )
            }
        }
    }
}
