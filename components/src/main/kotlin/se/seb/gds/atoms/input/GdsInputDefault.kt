package se.seb.gds.atoms.input

import android.content.res.Configuration
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
import se.seb.gds.atoms.input.GdsInputDefaults.contentPaddingWithoutLabel
import se.seb.gds.icons.ErrorIcon
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun GdsInputDefault(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    style: GdsInputStyle = GdsInputDefaults.defaultStyle(),
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
            modifier = modifier,
            contentPadding = contentPaddingWithoutLabel(),
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
            innerInputContent = { innerTextField ->
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(
                        modifier = Modifier.weight(1f),
                    ) { innerTextField() }
                }
            },
            trailingContent = {
                val isMultiLine = lineLimits is TextFieldLineLimits.MultiLine &&
                    (lineLimits.minHeightInLines > 1 || textLineCount > 1)

                val trailingModifier = Modifier
                    .alpha(if (textFieldIsFocused) 1f else 0f)
                    .then(
                        if (isMultiLine) {
                            Modifier.padding(contentPaddingWithoutLabel())
                        } else {
                            Modifier.align(Alignment.CenterVertically)
                        },
                    )
                InputDefaultTrailing(
                    modifier = trailingModifier,
                    clearable = clearable,
                    style = style,
                    maxCharacters = maxCharacters,
                    state = state,
                    clearText = { clearText(state) },
                )
            },
            onTextLayoutResult = { lineCount ->
                textLineCount = lineCount
            },
        )
        if (isError) {
            InputDefaultError(
                errorMessage = errorMessage,
                style = style,
            )
        }
    }
}

@Composable
private fun InputDefaultHeader(
    style: GdsInputStyle,
    label: String? = null,
    supportLabel: String? = null,
    showInfoIcon: Boolean = false,
    onInfoIconClick: () -> Unit = { },
) {
    if (label == null && supportLabel == null && !showInfoIcon) return
    Row(
        modifier = Modifier.padding(start = 16.dp),
    ) {
        var columnModifier = Modifier.weight(1f)
        columnModifier = if (showInfoIcon) {
            if (supportLabel != null && label != null) {
                columnModifier.padding(top = 12.dp)
            } else {
                columnModifier.align(Alignment.CenterVertically)
            }
        } else {
            columnModifier
        }

        Column(
            modifier = columnModifier,
        ) {
            label?.let {
                Text(
                    color = style.colors.labelColor,
                    style = style.textStyle.labelStyle,
                    text = it,
                )
            }
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
                Icon(
                    imageVector = GdsIcons.Regular.CircleInfo,
                    contentDescription = null,
                )
            }
        }
    }

    val bothLabelsArePresent = !label.isNullOrBlank() && !supportLabel.isNullOrBlank()

    if (bothLabelsArePresent || !showInfoIcon) {
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
                modifier = Modifier
                    .alpha(if (state.text.isNotEmpty()) 1f else 0f),
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
        ) {
            content()
        }
    } else {
        Column(
            modifier = modifier.padding(start = 8.dp),
            horizontalAlignment = Alignment.End,
        ) {
            content()
        }
    }
}

@Composable
private fun InputDefaultError(
    errorMessage: String?,
    style: GdsInputStyle,
) {
    errorMessage?.let {
        Row(
            Modifier
                .padding(top = 8.dp, start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            ErrorIcon(
                Modifier
                    .size(20.dp)
                    .align(Alignment.CenterVertically),
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically),
                text = it,
                style = style.textStyle.footerMessageStyle,
                color = style.colors.errorSupportingTextColor,
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
                    isError = true
                )
            }
        }
    }
}

