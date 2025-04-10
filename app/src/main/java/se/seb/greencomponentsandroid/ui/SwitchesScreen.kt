package se.seb.greencomponentsandroid.ui

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
import se.seb.green.atoms.GreenSwitchDefaults
import se.seb.green.components.SwitchRow

@Composable
fun SwitchesScreen(scrollState: ScrollState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        var checked by remember { mutableStateOf(false) }
        SwitchRow(
            title = "Green 2023",
            checked = checked,
            onCheckedChanged = { checked = it },
        )

        var legacyChecked by remember { mutableStateOf(false) }
        SwitchRow(
            title = "Green 2016",
            checked = legacyChecked,
            style = GreenSwitchDefaults.legacyStyle(),
            onCheckedChanged = { legacyChecked = it },
        )

        var neoChecked by remember { mutableStateOf(false) }
        SwitchRow(
            title = "Neo",
            checked = neoChecked,
            style = GreenSwitchDefaults.neoStyle(),
            onCheckedChanged = { neoChecked = it },
        )
    }
}