package se.seb.gds.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.atoms.cards.GdsCard
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.common.GdsUiTestsPreview
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@GdsUiTestsPreview
@PreviewTest
@Composable
private fun ListRowItemAllElementsScreenshot() {
    GdsTheme {
        Box(modifier = Modifier.background(color = GdsTheme.colors.L1.Neutral01)) {
            ListRowItem(
                startSlot = {
                    StartIcon(
                        icon = GdsIcons.Regular.Bell,
                    )
                },
                title = "Title",
                description = "Description",
                endSlot = {
                    EndIcon(
                        icon = GdsIcons.Regular.ChevronRight,
                    )
                },
            )
        }
    }
}

@GdsUiTestsPreview
@PreviewTest
@Composable
private fun ListRowItemNoStartSlotScreenshot() {
    GdsTheme {
        Box(modifier = Modifier.background(color = GdsTheme.colors.L1.Neutral01)) {
            ListRowItem(
                title = "Title",
                description = "Description",
                endSlot = {
                    EndIcon(
                        icon = GdsIcons.Regular.ChevronRight,
                    )
                },
            )
        }
    }
}

@GdsUiTestsPreview
@PreviewTest
@Composable
private fun ListRowItemNoDescriptionScreenshot() {
    GdsTheme {
        Box(modifier = Modifier.background(color = GdsTheme.colors.L1.Neutral01)) {
            ListRowItem(
                startSlot = {
                    StartIcon(
                        icon = GdsIcons.Regular.Bell,
                    )
                },
                title = "Title",
                endSlot = {
                    EndIcon(
                        icon = GdsIcons.Regular.ChevronRight,
                    )
                },
            )
        }
    }
}

@GdsUiTestsPreview
@PreviewTest
@Composable
private fun ListRowItemNoEndSlotScreenshot() {
    GdsTheme {
        Box(modifier = Modifier.background(color = GdsTheme.colors.L1.Neutral01)) {
            ListRowItem(
                startSlot = {
                    StartIcon(
                        icon = GdsIcons.Regular.Bell,
                    )
                },
                title = "Title",
                description = "Description",
            )
        }
    }
}

@GdsUiPreview
@PreviewTest
@Composable
private fun ListRowItemWithCardScreenshot() {
    GdsTheme {
        Box(
            modifier = Modifier
                .background(color = GdsTheme.colors.L1.Neutral02)
                .padding(16.dp),
        ) {
            GdsCard(
                containerColor = GdsTheme.colors.L2.Neutral02,
                border = null,
            ) {
                ListRowItem(
                    startSlot = {
                        StartIcon(
                            icon = GdsIcons.Regular.Bell,
                        )
                    },
                    title = "All elements",
                    description = "Description",
                    endSlot = {
                        EndIcon(
                            icon = GdsIcons.Regular.ChevronRight,
                        )
                    },
                )
                ListRowItem(
                    title = "No start slot",
                    description = "Description",
                    endSlot = {
                        EndIcon(
                            icon = GdsIcons.Regular.ChevronRight,
                        )
                    },
                )
                ListRowItem(
                    startSlot = {
                        StartIcon(
                            icon = GdsIcons.Regular.Bell,
                        )
                    },
                    title = "No description",
                    endSlot = {
                        EndIcon(
                            icon = GdsIcons.Regular.ChevronRight,
                        )
                    },
                )
                ListRowItem(
                    startSlot = {
                        StartIcon(
                            icon = GdsIcons.Regular.Bell,
                        )
                    },
                    title = "No end slot",
                    description = "Description",
                )
                ListRowItem(
                    title = "Only title",
                )
            }
        }
    }
}
