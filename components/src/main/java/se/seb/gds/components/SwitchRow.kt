package se.seb.gds.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.GdsSwitch
import se.seb.gds.atoms.GdsSwitchDefaults
import se.seb.gds.atoms.GdsSwitchStyle
import se.seb.gds.theme.GdsTheme

@Composable
fun SwitchRow(
    title: String,
    checked: Boolean,
    modifier: Modifier = Modifier,
    style: GdsSwitchStyle = GdsSwitchDefaults.defaultStyle(),
    enabled: Boolean = true,
    onCheckedChanged: (Boolean) -> Unit = {},
) {
    Row(
        modifier = modifier
            .height(64.dp)
            .fillMaxWidth()
            .background(
                color = GdsTheme.colors.level2Colors.levelL2BackgroundSecondary,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.weight(1f),
            style = GdsTheme.typography.Headline,
            text = title
        )
        GdsSwitch(
            checked = checked,
            onCheckedChanged = onCheckedChanged,
            style = style,
            enabled = enabled,
        )
    }
}

@Preview
@Composable
private fun SwitchRowPreview() {
    GdsTheme {
        Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = spacedBy(2.dp)) {
            var checked by remember { mutableStateOf(false) }
            SwitchRow(
                modifier = Modifier.padding(16.dp),
                title = "Green 2023",
                checked = checked,
                onCheckedChanged = { checked = it },
            )

            var legacyChecked by remember { mutableStateOf(false) }
            SwitchRow(
                modifier = Modifier.padding(16.dp),
                title = "Green 2016",
                checked = legacyChecked,
                style = GdsSwitchDefaults.legacyStyle(),
                onCheckedChanged = { legacyChecked = it },
            )

            var neoChecked by remember { mutableStateOf(false) }
            SwitchRow(
                modifier = Modifier.padding(16.dp),
                title = "Neo",
                checked = neoChecked,
                style = GdsSwitchDefaults.neoStyle(),
                onCheckedChanged = { neoChecked = it },
            )
        }

    }
}