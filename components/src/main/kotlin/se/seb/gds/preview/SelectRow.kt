package se.seb.gds.preview

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import se.seb.gds.theme.GdsTheme

@Composable
internal fun SelectRow(
    selectedText: String,
    onItemSelected: (String) -> Unit,
    items: List<String>,
    label: String,
) {
    Row(
        modifier = Modifier
            .padding(
                horizontal = GdsTheme.dimensions.spacing.SpaceM,
                vertical = GdsTheme.dimensions.spacing.SpaceS,
            )
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        var expanded by remember { mutableStateOf(false) }

        Text(
            modifier = Modifier.weight(1f),
            style = GdsTheme.typography.DetailBookM,
            text = label,
        )

        Box(modifier = Modifier.wrapContentSize()) {
            Text(
                modifier = Modifier.clickable(onClick = { expanded = true }),
                style = GdsTheme.typography.DetailBookM,
                text = selectedText,
            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
            ) {
                items.forEach { item ->
                    DropdownMenuItem(
                        text = { Text(item) },
                        onClick = {
                            onItemSelected(item)
                            expanded = false
                        },
                    )
                }
            }
        }
    }
}
