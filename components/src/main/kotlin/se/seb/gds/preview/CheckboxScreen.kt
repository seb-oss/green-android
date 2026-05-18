package se.seb.gds.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.cards.GdsCard
import se.seb.gds.atoms.checkbox.GdsCheckbox
import se.seb.gds.components.GdsCheckboxRow
import se.seb.gds.components.GdsTriStateCheckboxRow
import se.seb.gds.components.SwitchRow
import se.seb.gds.theme.GdsTheme

@Composable
internal fun CheckboxScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(GdsTheme.dimensions.spacing.SpaceM),
        verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceM),
    ) {
        var error by rememberSaveable { mutableStateOf(false) }
        var enabled by rememberSaveable { mutableStateOf(true) }

        GdsCard(
            border = null,
        ) {
            SwitchRow("Enabled", checked = enabled) {
                enabled = it
            }
            SwitchRow("Error", checked = error) {
                error = it
            }
        }

        CheckboxSample(error = error, enabled = enabled)

        CheckboxWithLabelSample(error = error, enabled = enabled)

        GdsTriStateCheckboxRowSample(error = error, enabled = enabled)
    }
}

@Composable
private fun CheckboxSample(
    error: Boolean,
    enabled: Boolean,
) {
    Column {
        ComponentHeaderSection(
            title = "GdsCheckbox",
            body = "Example usage:",
            code = """
            GdsCheckbox(
              checked = true,
              onCheckedChange = { }
            )
            """.trimIndent(),
        )

        var checked by remember { mutableStateOf(true) }

        GdsCheckbox(
            enabled = enabled,
            checked = checked,
            isError = error,
            onCheckedChange = { checked = it },
        )
    }
}

@Composable
private fun CheckboxWithLabelSample(
    error: Boolean,
    enabled: Boolean,
) {
    Column {
        ComponentHeaderSection(
            title = "GdsCheckboxRow",
            body = "Example usage:",
            code = """
            GdsCheckboxRow(
              label = "Label",
              checked = true,
              onCheckedChange = { }
            )
            """.trimIndent(),
        )

        var checked by remember { mutableStateOf(true) }

        GdsCheckboxRow(
            label = "Label",
            enabled = enabled,
            checked = checked,
            isError = error,
            onClick = { checked = it },
        )

        var checked2 by remember { mutableStateOf(true) }
        GdsCheckboxRow(
            labelSlot = {
                Column {
                    Text(
                        text = "Label",
                        style = GdsTheme.typography.DetailBookM,
                        color = GdsTheme.colors.Content.Neutral01,
                    )
                    Text(
                        text = "Sub label",
                        style = GdsTheme.typography.DetailRegularS,
                        color = GdsTheme.colors.Content.Neutral02,
                    )
                }
            },
            enabled = enabled,
            checked = checked2,
            isError = error,
            onClick = { checked2 = it },
        )
    }
}

@Composable
private fun GdsTriStateCheckboxRowSample(
    error: Boolean,
    enabled: Boolean,
) {
    Column {
        ComponentHeaderSection(
            title = "GdsTriStateCheckboxRow",
            body = "Example usage:",
            code = """
          GdsTriStateCheckboxRow(
            label = "Label",
            parentState = parentState,
            onClick = { },
            enabled = true,
            isError = false,
        )
            """.trimIndent(),
        )

        TriStateCheckboxSample(
            isError = error,
            enabled = enabled,
        )
    }
}

@Composable
private fun TriStateCheckboxSample(
    isError: Boolean = false,
    enabled: Boolean = true,
) {
    Column {
        val (state, onStateChange) = remember { mutableStateOf(true) }
        val (state2, onStateChange2) = remember { mutableStateOf(true) }

        val parentState =
            remember(state, state2) {
                if (state && state2) {
                    ToggleableState.On
                } else if (!state && !state2) {
                    ToggleableState.Off
                } else {
                    ToggleableState.Indeterminate
                }
            }
        val onClick = {
            val s = parentState != ToggleableState.On
            onStateChange(s)
            onStateChange2(s)
        }

        GdsTriStateCheckboxRow(
            label = "Title",
            parentState = parentState,
            onClick = onClick,
            enabled = enabled,
            isError = isError,
        )
        Column(Modifier.padding(start = 24.dp)) {
            GdsCheckboxRow(
                checked = state,
                isError = isError,
                enabled = enabled,
                onClick = onStateChange,
                label = "Title 1",
            )

            GdsCheckboxRow(
                checked = state2,
                isError = isError,
                enabled = enabled,
                onClick = onStateChange2,
                label = "Title 2",
            )
        }
    }
}
