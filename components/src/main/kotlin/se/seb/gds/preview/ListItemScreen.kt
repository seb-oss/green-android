package se.seb.gds.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.cards.GdsCard
import se.seb.gds.components.ListRowItem
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Preview
@Composable
fun ListItemScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(GdsTheme.colors.L1.Neutral02),
    ) {
        ComponentHeaderSection(
            modifier = Modifier.padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
            title = "ListRowItem",
            body = "Example usage:",
            code = """
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
            """.trimIndent(),
        )

        GdsCard(
            modifier = Modifier.padding(16.dp),
            border = null,
            containerColor = GdsTheme.colors.L2.Neutral02,
        ) {
            ListRowItem(
                title = "Label 01",
            )
            HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
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
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
        ListRowItem(
            title = "Label 01",
            endSlot = {
                EndIcon(
                    icon = GdsIcons.Regular.ChevronRight,
                    contentDescription = "Chevron right icon",
                )
            },
        )
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
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
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
        ListRowItem(
            title = "Label 01",
            description = "Subtitle",
        )
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
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
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
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
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
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
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
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
