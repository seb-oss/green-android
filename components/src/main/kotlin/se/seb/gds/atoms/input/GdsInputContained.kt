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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldLineLimits
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
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun GdsInputContained(
    modifier: Modifier = Modifier,
    state: TextFieldState,
    style: GdsInputStyle = GdsInputDefaults.containedStyle(),
    label: String,
    errorMessage: String? = null,
    overrideTextDescription: String? = null,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    clearable: Boolean = true,
    showInfoIcon: Boolean = false,
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
            contentPadding = containerContentPadding(isLandscape()),
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
            outputTransformation = outputTransformation,
            keyboardOptions = keyboardOptions,
            characterWhitelistPredicate = characterWhitelistPredicate,
            labelContent = {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = label,
                        style = labelTextStyle.merge(
                            color = style.colors.floatingLabelColor(enabled = enabled),
                        ),
                    )
                }
            },
            trailingContent = {
                val isMultiLine = isMultiLine(lineLimits, textLineCount)
                val hasCounter = maxCharacters != null
                val showCounterContainer = (hasCounter && (isMultiLine || textFieldIsFocused)) ||
                    (!hasCounter && isMultiLine)

                val trailingModifier = if (showCounterContainer) {
                    Modifier.padding(trailingContentPadding())
                } else {
                    Modifier.align(Alignment.CenterVertically)
                }

                InputContainedTrailing(
                    modifier = trailingModifier,
                    showCounterContainer = showCounterContainer,
                    showClearButton = clearable && state.text.isNotEmpty() && textFieldIsFocused,
                    showInfoIcon = showInfoIcon,
                    hasContainedError = isError && errorMessage.isNullOrBlank(),
                    textFieldIsFocused = textFieldIsFocused,
                    maxCharacters = maxCharacters,
                    onInfoIconClick = onInfoIconClick,
                    style = style,
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
private fun InputContainedTrailing(
    modifier: Modifier = Modifier,
    showClearButton: Boolean = true,
    showInfoIcon: Boolean = false,
    textFieldIsFocused: Boolean = false,
    hasContainedError: Boolean = false,
    showCounterContainer: Boolean = true,
    maxCharacters: Int?,
    onInfoIconClick: () -> Unit = { },
    clearText: () -> Unit? = { },
    style: GdsInputStyle,
    state: TextFieldState,
) {
    val showErrorIcon = hasContainedError && !textFieldIsFocused
    Column(
        modifier = modifier.padding(start = 8.dp),
        horizontalAlignment = Alignment.End,
    ) {
        if (showCounterContainer) {
            val alpha = if (textFieldIsFocused && maxCharacters != null) 1f else 0f
            CharacterAmountIndicator(
                modifier = Modifier.alpha(alpha = alpha),
                textStyle = style.textStyle.characterCounter,
                color = style.colors.floatingLabelColor,
                maxCharacters = maxCharacters,
                currentCharacters = state.text.length,
            )
        }
        Row(
            modifier = Modifier
                .animateContentSizeIf(showInfoIcon)
                .heightIn(min = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            if (showInfoIcon) {
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
            AnimatedVisibility(
                visible = showClearButton,
                enter = if (showInfoIcon) {
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
            if (showErrorIcon) {
                Icon(
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.CenterVertically),
                    imageVector = GdsIcons.Solid.TriangleExclamation,
                    contentDescription = null,
                    tint = style.colors.errorSupportingTextColor,
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

private fun containerContentPadding(isLandscape: Boolean = false): PaddingValues {
    return if (isLandscape) {
        PaddingValues(
            horizontal = 0.dp,
            vertical = 8.dp,
        )
    } else {
        PaddingValues(
            horizontal = 0.dp,
            vertical = 16.dp,
        )
    }
}

private fun trailingContentPadding(): PaddingValues =
    PaddingValues(horizontal = 0.dp, vertical = 16.dp)

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
                    showInfoIcon = true,
                )
                Spacer(Modifier.height(16.dp))

                Spacer(Modifier.height(16.dp))
                GdsInputContained(
                    state = rememberTextFieldState(),
                    label = "Label",
                    errorMessage = "Error message.",
                    isError = true,
                )
            }
        }
    }
}
