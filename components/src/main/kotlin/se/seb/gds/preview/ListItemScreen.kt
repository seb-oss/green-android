package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.components.ListRowItem
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Preview
@Composable
fun ListItemScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(GdsTheme.colors.L1Neutral02),
    ) {

        CardColumn(modifier = Modifier.padding(16.dp)) {
            ListRowItem(
                title = "Label 01",
            )
            HorizontalDivider(color = GdsTheme.colors.BorderSubtle01, thickness = 0.5.dp)
            ListRowItem(
                title = "Label 01",
                endSlot = {
                    EndIcon(
                        icon = GdsIcons.Regular.ChevronRight,
                        contentDescription = "Chevron right icon",
                    )
                },
            )
        }

        ListRowItem(
            title = "Label 01",
        )
        HorizontalDivider(color = GdsTheme.colors.BorderSubtle01, thickness = 0.5.dp)
        ListRowItem(
            title = "Label 01",
            endSlot = {
                EndIcon(
                    icon = GdsIcons.Regular.ChevronRight,
                    contentDescription = "Chevron right icon",
                )
            },
        )
        HorizontalDivider(color = GdsTheme.colors.BorderSubtle01, thickness = 0.5.dp)
        ListRowItem(
            title = "Label 01",
            startSlot = {
                StartIcon(
                    icon = GdsIcons.Regular.Bell,
                    contentDescription = "Bell icon",
                )
            },
            endSlot = {
                EndIcon(
                    icon = GdsIcons.Regular.ChevronRight,
                    contentDescription = "Chevron right icon",
                )
            },
        )
        HorizontalDivider(color = GdsTheme.colors.BorderSubtle01, thickness = 0.5.dp)
        ListRowItem(
            title = "Label 01",
            description = "Subtitle",
        )
        HorizontalDivider(color = GdsTheme.colors.BorderSubtle01, thickness = 0.5.dp)
        ListRowItem(
            title = "Label 01",
            description = "Subtitle",
            endSlot = {
                EndIcon(
                    icon = GdsIcons.Regular.ChevronRight,
                    contentDescription = "Chevron right icon",
                )
            },
        )
        HorizontalDivider(color = GdsTheme.colors.BorderSubtle01, thickness = 0.5.dp)
        ListRowItem(
            title = "Label 01",
            description = "Subtitle",
            startSlot = {
                StartIcon(
                    icon = GdsIcons.Regular.Bell,
                    contentDescription = "Bell icon",
                )
            },
            endSlot = {
                EndIcon(
                    icon = GdsIcons.Regular.ChevronRight,
                    contentDescription = "Chevron right icon",
                )
            },
        )
        HorizontalDivider(color = GdsTheme.colors.BorderSubtle01, thickness = 0.5.dp)
        ListRowItem(
            title = "Label 01",
            description = "Subtitle",
            startSlot = {
                StartIcon(
                    icon = GdsIcons.Regular.Bell,
                    contentDescription = "Bell icon",
                )
            },
            endSlot = {
                EndLabel(text = "Label 02")
            },
        )
        HorizontalDivider(color = GdsTheme.colors.BorderSubtle01, thickness = 0.5.dp)
        ListRowItem(
            title = "Label 01",
            description = "Subtitle",
            startSlot = {
                StartIcon(
                    icon = GdsIcons.Regular.Bell,
                    contentDescription = "Bell icon",
                )
            },
            endSlot = {
                EndLabelWithIcon(
                    text = "Label 02",
                    icon = GdsIcons.Regular.ChevronRight,
                    contentDescription = "Chevron right icon",
                )
            },
        )
    }
}
