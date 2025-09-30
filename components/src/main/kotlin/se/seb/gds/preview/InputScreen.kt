package se.seb.gds.preview

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.input.GdsInput
import se.seb.gds.atoms.input.GdsInputDefaults
import se.seb.gds.components.SwitchRow
import se.seb.gds.theme.GdsTheme

@Composable
fun InputScreen(scrollState: ScrollState) {
    var enabled by rememberSaveable { mutableStateOf(true) }
    var clearable by rememberSaveable { mutableStateOf(false) }
    var isError by rememberSaveable { mutableStateOf(false) }
    var maxChar by rememberSaveable { mutableStateOf(false) }
    var leadingIcon by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .background(GdsTheme.colors.L1Neutral01)
                .verticalScroll(scrollState)
                .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Default SingleLine")
        GdsInput(
            state = rememberTextFieldState(),
            label = "Label",
            supportLabel = "Support Label",
            maxCharacters = if (maxChar) 50 else null,
            supportingText = "Supporting text",
            errorMessage = "Error message",
            placeholderText = "Placeholder",
            enabled = enabled,
            clearable = clearable,
            isError = isError,
            leadingIcon =
                if (leadingIcon) {
                    {
                        Icon(
                            painter = rememberVectorPainter(image = Icons.Default.Search),
                            contentDescription = null,
                        )
                    }
                } else {
                    null
                },
            lineLimits = TextFieldLineLimits.SingleLine,
        )
        Spacer(Modifier.height(16.dp))

        Text(text = "Default MultiLine")
        GdsInput(
            state = rememberTextFieldState(),
            label = "Label",
            supportLabel = "Support Label - Default variant",
            supportingText = "Support message (disabled).",
            maxCharacters = if (maxChar) 500 else null,
            enabled = enabled,
            clearable = clearable,
            isError = isError,
            leadingIcon =
                if (leadingIcon) {
                    {
                        Icon(
                            painter = rememberVectorPainter(image = Icons.Default.Search),
                            contentDescription = null,
                        )
                    }
                } else {
                    null
                },
            lineLimits = TextFieldLineLimits.MultiLine(minHeightInLines = 4),
        )
        Spacer(Modifier.height(16.dp))

        Text(text = "Contained SingleLine")
        GdsInput(
            state = rememberTextFieldState(),
            label = "Label",
            supportingText = "Supporting text",
            style = GdsInputDefaults.containedStyle(),
            maxCharacters = if (maxChar) 50 else null,
            errorMessage = "Error message",
            enabled = enabled,
            clearable = clearable,
            isError = isError,
            leadingIcon =
                if (leadingIcon) {
                    {
                        Icon(
                            painter = rememberVectorPainter(image = Icons.Default.Search),
                            contentDescription = null,
                        )
                    }
                } else {
                    null
                },
            lineLimits = TextFieldLineLimits.SingleLine,
        )

        Spacer(Modifier.height(16.dp))
        Text(text = "Contained MultiLine")
        GdsInput(
            state = rememberTextFieldState(),
            label = "Label",
            supportLabel = "Support Label - Default variant",
            supportingText = "Support message (disabled).",
            style = GdsInputDefaults.containedStyle(),
            maxCharacters = if (maxChar) 50 else null,
            errorMessage = "Error message",
            enabled = enabled,
            clearable = clearable,
            isError = isError,
            leadingIcon =
                if (leadingIcon) {
                    {
                        Icon(
                            painter = rememberVectorPainter(image = Icons.Default.Search),
                            contentDescription = null,
                        )
                    }
                } else {
                    null
                },
            lineLimits = TextFieldLineLimits.MultiLine(minHeightInLines = 4),
        )

        Spacer(modifier = Modifier.height(16.dp))
        SwitchRow("Enabled", checked = enabled) {
            enabled = it
        }
        SwitchRow("Clearable", checked = clearable) {
            clearable = it
        }
        SwitchRow("Error", checked = isError) {
            isError = it
        }
        SwitchRow("Max characters", checked = maxChar) {
            maxChar = it
        }
        SwitchRow("Leading icon", checked = leadingIcon) {
            leadingIcon = it
        }
    }
}
