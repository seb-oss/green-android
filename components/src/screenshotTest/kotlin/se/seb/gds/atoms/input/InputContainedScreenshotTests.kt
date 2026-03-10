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
fun GdsInputContainedScreenshot() {
    GdsTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.verticalScroll(rememberScrollState(0)),
        ) {
            InputContainedCore(
                state = rememberTextFieldState("Not focused"),
                label = "Label",
                inputState = BasicInputState(
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputContainedCore(
                state = rememberTextFieldState("Focused. Character limit. Clearable."),
                label = "Label",
                isTextFieldFocused = true,
                inputState = BasicInputState(
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputContainedCore(
                state = rememberTextFieldState("Focused. No Character limit. Clearable."),
                label = "Label",
                isTextFieldFocused = true,
            )
            InputContainedCore(
                state = rememberTextFieldState("Focused. No Character limit. Not Clearable."),
                label = "Label",
                isTextFieldFocused = true,
                inputState = BasicInputState(
                    clearable = false,
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputContainedCore(
                state = rememberTextFieldState("Error state"),
                label = "Label",
                isTextFieldFocused = false,
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
fun GdsInputContainedMultiLineScreenshot() {
    GdsTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.verticalScroll(rememberScrollState(0)),
        ) {
            InputContainedCore(
                state = rememberTextFieldState("Multiline - Not focused"),
                label = "Label",
                inputState = BasicInputState(
                    lineLimits = TextFieldLineLimits.MultiLine(4, 5),
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputContainedCore(
                state = rememberTextFieldState("Multiline - Focused - Character limit"),
                label = "Label",
                isTextFieldFocused = true,
                inputState = BasicInputState(
                    lineLimits = TextFieldLineLimits.MultiLine(4, 5),
                    characterLimit = CharacterLimit(50),
                ),
            )
            InputContainedCore(
                state = rememberTextFieldState("Multiline - Focused - No Character limit"),
                label = "Label",
                isTextFieldFocused = true,
                inputState = BasicInputState(
                    lineLimits = TextFieldLineLimits.MultiLine(4, 5),
                ),
            )
        }
    }
}
