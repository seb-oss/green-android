package se.seb.gds.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.communicationbanner.GdsCommunicationBanner
import se.seb.gds.atoms.communicationbanner.GdsCommunicationBannerType
import se.seb.gds.components.SwitchRow
import se.seb.gds.theme.GdsTheme

@Composable
internal fun CommunicationBannerScreen() {
    var showInformation by rememberSaveable { mutableStateOf(true) }
    var showNotice by rememberSaveable { mutableStateOf(true) }
    var showWarning by rememberSaveable { mutableStateOf(true) }
    var showError by rememberSaveable { mutableStateOf(true) }
    var showCloseButton by rememberSaveable { mutableStateOf(true) }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(GdsTheme.dimensions.spacing.SpaceM),
        verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceM),
    ) {
        item(key = "toggle") {
            SwitchRow(
                title = "Show Close Button",
                checked = showCloseButton,
                onCheckedChanged = { showCloseButton = it },
            )
            HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
        }

        if (showInformation) {
            item(key = "information") {
                GdsCommunicationBanner(
                    modifier = Modifier.animateItem(),
                    heading = "Information",
                    body = "This is an information banner that displays important details for the user.",
                    bannerType = GdsCommunicationBannerType.Information,
                    onDismiss = if (showCloseButton) {
                        { showInformation = false }
                    } else {
                        null
                    },
                )
            }
        }

        if (showNotice) {
            item(key = "notice") {
                GdsCommunicationBanner(
                    modifier = Modifier.animateItem(),
                    heading = "Notice",
                    body = "This is a notice banner that displays success or confirmation messages.",
                    bannerType = GdsCommunicationBannerType.Notice,
                    onDismiss = if (showCloseButton) {
                        { showNotice = false }
                    } else {
                        null
                    },
                )
            }
        }

        if (showWarning) {
            item(key = "warning") {
                GdsCommunicationBanner(
                    modifier = Modifier.animateItem(),
                    heading = "Warning",
                    body = "This is a warning banner that alerts users about potential issues.",
                    bannerType = GdsCommunicationBannerType.Warning,
                    onDismiss = if (showCloseButton) {
                        { showWarning = false }
                    } else {
                        null
                    },
                )
            }
        }

        if (showError) {
            item(key = "error") {
                GdsCommunicationBanner(
                    modifier = Modifier.animateItem(),
                    heading = "Error",
                    body = "This is an error banner that displays critical messages or errors.",
                    bannerType = GdsCommunicationBannerType.Error,
                    onDismiss = if (showCloseButton) {
                        { showError = false }
                    } else {
                        null
                    },
                )
            }
        }
    }
}
