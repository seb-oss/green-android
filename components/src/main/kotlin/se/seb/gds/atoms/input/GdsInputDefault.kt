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
import androidx.compose.foundation.text.input.TextFieldLineLimits
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
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun GdsInputDefault(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    style: GdsInputStyle = GdsInputDefaults.defaultStyle(),
    label: String,
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
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onTrailingIconClick: (() -> Unit)? = null,
    trailingIconDescription: String? = null,
    onInteraction: (Interaction) -> Unit = {},
    characterWhitelistPredicate: (CharSequence, CharSequence) -> Boolean = { _, _ -> true },
    onValueChange: (String) -> Unit = {},
    showInfoIcon: Boolean = false,
    onInfoIconClick: () -> Unit = { },
) {
    var textLineCount by remember { mutableIntStateOf(1) }

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
        InputDefaultHeader(
            label = label,
            supportLabel = supportLabel,
            style = style,
            showInfoIcon = showInfoIcon,
            onInfoIconClick = onInfoIconClick,
        )
        FieldContainer(
            contentPadding = containerContentPadding,
            textFieldIsFocused = textFieldIsFocused,
            readOnly = readOnly,
            style = style,
            enabled = enabled,
            isError = isError,
            state = state,
            lineLimits = lineLimits,
            scrollState = scrollState,
            maxCharacters = maxCharacters,
            interactionSource = interactionSource,
            inputTransformationChain = inputTransformation,
            characterWhitelistPredicate = characterWhitelistPredicate,
            outputTransformation = outputTransformation,
            keyboardOptions = keyboardOptions,
            trailingContent = {
                val isMultiLine = isMultiLine(lineLimits, textLineCount)
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
                    clearable = clearable,
                    style = style,
                    maxCharacters = maxCharacters,
                    state = state,
                    clearText = { clearText(state) },
                )
            },
            onTextLayoutResult = { lineCount -> textLineCount = lineCount },
        )
        if (isError && !errorMessage.isNullOrBlank()) {
            ErrorFooter(errorMessage = errorMessage, style = style)
        }
    }
}

@Composable
private fun InputDefaultHeader(
    style: GdsInputStyle,
    label: String,
    supportLabel: String? = null,
    showInfoIcon: Boolean = false,
    onInfoIconClick: () -> Unit = { },
) {
    Row(modifier = Modifier.padding(start = 16.dp)) {
        val columnModifier = when {
            showInfoIcon && supportLabel != null -> Modifier.padding(top = 12.dp)
            showInfoIcon -> Modifier.align(Alignment.CenterVertically)
            else -> Modifier
        }

        Column(modifier = columnModifier.weight(1f)) {
            Text(
                color = style.colors.labelColor,
                style = style.textStyle.labelStyle,
                text = label,
            )
            supportLabel?.let {
                Text(
                    style = style.textStyle.supportLabelStyle,
                    color = style.colors.supportLabelColor,
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

@Composable
private fun InputDefaultTrailing(
    modifier: Modifier = Modifier,
    clearable: Boolean = true,
    style: GdsInputStyle,
    maxCharacters: Int?,
    state: TextFieldState,
    clearText: () -> Unit?,
) {
    val content: @Composable () -> Unit = {
        if (maxCharacters != null) {
            CharacterAmountIndicator(
                textStyle = style.textStyle.characterCounter,
                color = style.colors.floatingLabelColor,
                maxCharacters = maxCharacters,
                currentCharacters = state.text.length,
            )
        }
        if (clearable) {
            ClearButton(
                modifier = Modifier.alpha(if (state.text.isNotEmpty()) 1f else 0f),
                enabled = state.text.isNotEmpty(),
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
                    showInfoIcon = true,
                    maxCharacters = 50,
                )
                Spacer(Modifier.height(16.dp))

                Spacer(Modifier.height(16.dp))
                GdsInputDefault(
                    state = rememberTextFieldState(),
                    label = "Label",
                    supportLabel = "Support Label",
                    errorMessage = "Error message.",
                    isError = true,
                )
            }
        }
    }
}
