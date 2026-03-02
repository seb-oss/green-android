package se.seb.gds.atoms.input

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.theme.GdsTheme

@GdsUiPreview
@PreviewTest
@Composable
fun GdsInputDefaultScreenshot() {
    GdsTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.verticalScroll(rememberScrollState(0)),
        ) {
            InputDefaultCore(
                state = rememberTextFieldState("Not focused"),
                label = "Label",
                supportLabel = "Support Label",
                onInfoIconClick = {},
                inputState = BasicInputState(
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputDefaultCore(
                state = rememberTextFieldState("Focused. Character limit. Clearable."),
                label = "Label",
                isTextFieldFocused = true,
                onInfoIconClick = {},
                inputState = BasicInputState(
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputDefaultCore(
                state = rememberTextFieldState("Focused. No Character limit. Clearable."),
                label = "Label",
                isTextFieldFocused = true,
                onInfoIconClick = {},
            )
            InputDefaultCore(
                state = rememberTextFieldState("Focused. No Character limit. Not Clearable."),
                label = "Label",
                isTextFieldFocused = true,
                onInfoIconClick = {},
                inputState = BasicInputState(
                    clearable = false,
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputDefaultCore(
                state = rememberTextFieldState("Error state"),
                label = "Label",
                supportLabel = "Support Label",
                isTextFieldFocused = false,
                onInfoIconClick = {},
                inputState = BasicInputState(
                    isError = true,
                    errorMessage = "Error message",
                    characterLimit = CharacterLimit(50),
                ),
            )
        }
    }
}

@GdsUiPreview
@PreviewTest
@Composable
fun GdsInputDefaultMultiLineScreenshot() {
    GdsTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.verticalScroll(rememberScrollState(0)),
        ) {
            InputDefaultCore(
                state = rememberTextFieldState("Multiline - Not focused"),
                label = "Label",
                supportLabel = "Support Label",
                onInfoIconClick = {},
                inputState = BasicInputState(
                    lineLimits = TextFieldLineLimits.MultiLine(4, 5),
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputDefaultCore(
                state = rememberTextFieldState("Multiline - Focused - Character limit"),
                label = "Label",
                isTextFieldFocused = true,
                onInfoIconClick = {},
                inputState = BasicInputState(
                    lineLimits = TextFieldLineLimits.MultiLine(4, 5),
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputDefaultCore(
                state = rememberTextFieldState("Multiline - Focused - No Character limit"),
                label = "Label",
                isTextFieldFocused = true,
                onInfoIconClick = {},
                inputState = BasicInputState(
                    lineLimits = TextFieldLineLimits.MultiLine(4, 5),
                ),
            )
        }
    }
}
