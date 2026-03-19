package se.seb.gds.preview

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import se.seb.gds.components.SwitchRow

@Composable
internal fun SwitchesScreen(scrollState: ScrollState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        ComponentHeaderSection(
            title = "GdsSwitch",
            body = "Example usage:",
            code = """
            GdsSwitch(
              checked = true,
              onCheckedChanged = { },
              enabled = true,
            )
            """.trimIndent(),
        )

        var checked by remember { mutableStateOf(true) }
        SwitchRow(
            title = "Enabled",
            checked = checked,
            onCheckedChanged = { checked = it },
        )

        SwitchRow(
            title = "Disabled - Checked",
            checked = true,
            enabled = false,
            onCheckedChanged = { checked = it },
        )

        SwitchRow(
            title = "Disabled - Unchecked",
            checked = false,
            enabled = false,
            onCheckedChanged = { checked = it },
        )
    }
}
