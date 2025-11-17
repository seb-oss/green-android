package se.seb.gds.atoms.input

import android.content.res.Configuration
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.lerp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.input.GdsInputDefaults.contentPaddingWithLabel
import se.seb.gds.icons.ErrorIcon
import se.seb.gds.theme.GdsTheme

@Composable
fun GdsInputContained(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    style: GdsInputStyle = GdsInputDefaults.containedStyle(),
    label: String? = null,
    supportLabel: String? = null,
    errorMessage: String? = null,
    overrideTextDescription: String? = null,
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
    onTrailingIconClick: (() -> Unit)? = null,
    trailingIconDescription: String? = null,
    onInteraction: (Interaction) -> Unit = {},
    characterWhitelistPredicate: (
        CharSequence,
        CharSequence,
    ) -> Boolean = { _: CharSequence, _: CharSequence -> true },
    onValueChange: (String) -> Unit = {},
) {
    BasicInput(
        modifier = modifier,
        state = state,
        label = label,
        supportLabel = supportLabel,
        overrideTextDescription = overrideTextDescription,
        readOnly = readOnly,
        isError = isError,
        maxCharacters = maxCharacters,
        interactionSource = interactionSource,
        onTrailingIconClick = onTrailingIconClick,
        trailingIconDescription = trailingIconDescription,
        onInteraction = onInteraction,
        onValueChange = onValueChange,
    ) { textFieldIsFocused ->

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

        FieldContainer(
            contentPadding = contentPaddingWithLabel(),
            textFieldIsFocused = textFieldIsFocused,
            readOnly = readOnly,
            style = style,
            enabled = enabled,
            isError = isError,
            state = state,
            lineLimits = lineLimits,
            scrollState = scrollState,
            interactionSource = interactionSource,
            inputTransformationChain = inputTransformation,
            outputTransformation = outputTransformation,
            keyboardOptions = keyboardOptions,
            characterWhitelistPredicate = characterWhitelistPredicate,
            innerInputContent = { innerTextField ->
                InputContainedInnerText(
                    clearable = clearable,
                    state = state,
                    innerTextField = innerTextField,
                    clearText = { clearText(state) },
                    textFieldIsFocused = textFieldIsFocused,
                )
            },
            labelContent = {
                label?.let {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            modifier = Modifier.weight(1f),
                            text = it,
                            style = labelTextStyle.merge(
                                color = style.colors.floatingLabelColor(
                                    enabled,
                                ),
                            ),
                        )
                        if (textFieldIsFocused && !isError) {
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
        )
        InputContainedFooter(
            isEnabled = enabled,
            isError = isError,
            errorMessage = errorMessage,
            supportingMessage = supportLabel,
            style = style,
        )
    }
}

@Composable
fun InputContainedFooter(
    isEnabled: Boolean,
    isError: Boolean,
    errorMessage: String?,
    supportingMessage: String?,
    style: GdsInputStyle,
) {
    val textToShow = when {
        isError -> errorMessage
        else -> supportingMessage
    }

    textToShow?.let {
        val textColor = style.colors.footerTextColor(enabled = isEnabled, error = isError)

        Row(
            Modifier
                .padding(top = 8.dp, start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            if (isError) {
                ErrorIcon(
                    Modifier
                        .size(20.dp)
                        .align(Alignment.CenterVertically),
                )
            }
            Text(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically),
                text = it,
                style = style.textStyle.footerMessageStyle,
                color = textColor,
            )
        }
    }
}

@Composable
private fun InputContainedInnerText(
    clearable: Boolean = true,
    textFieldIsFocused: Boolean = false,
    innerTextField: @Composable (() -> Unit),
    state: TextFieldState,
    clearText: () -> Unit?,
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier
                .weight(1f),
        ) { innerTextField() }

        Spacer(Modifier.width(8.dp))
        if (clearable) {
            ClearButton(
                modifier = Modifier
                    .alpha(if (textFieldIsFocused && state.text.isNotEmpty()) 1f else 0f),
                enabled = state.text.isNotEmpty(),
                onClick = { clearText() },
            )
        }
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
                GdsInputContained(
                    state = rememberTextFieldState("Text"),
                    label = "Label",
                    supportLabel = "Support Label",
                    clearable = true,
                    maxCharacters = 50,
                )
                Spacer(Modifier.height(16.dp))

                Spacer(Modifier.height(16.dp))
                GdsInputContained(
                    state = rememberTextFieldState(),
                    label = "Label",
                    supportLabel = "Support Label",
                    clearable = true,
                    errorMessage = "Error message.",
                    isError = true
                )
            }
        }
    }
}
