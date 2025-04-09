package se.seb.green.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.green.atoms.GreenSwitch
import se.seb.green.atoms.GreenSwitchDefaults
import se.seb.green.icons.SebIcons
import se.seb.green.theme.GreenTheme

@Composable
fun SwitchRow(
    title: String,
    checked: Boolean,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    colors: SwitchColors = GreenSwitchDefaults.sebColors(),
    onCheckedChanged: (Boolean) -> Unit = {},
    checkedIcon: ImageVector = SebIcons.Check,
    enabled: Boolean = true,
) {
    Row(
        modifier = modifier
            .height(64.dp)
            .fillMaxWidth()
            .background(
                color = GreenTheme.colors.level2Colors.levelL2BackgroundSecondary,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.weight(1f),
            style = GreenTheme.typography.Body,
            text = title
        )
        GreenSwitch(
            checked = checked,
            onCheckedChanged = onCheckedChanged,
            checkedIcon = checkedIcon,
            enabled = enabled,
            colors = colors
        )
    }
}

@Preview
@Composable
private fun SwitchRowPreview() {
    GreenTheme {
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
                colors = GreenSwitchDefaults.seb2016Colors(),
                onCheckedChanged = { legacyChecked = it },
            )
        }

    }
}