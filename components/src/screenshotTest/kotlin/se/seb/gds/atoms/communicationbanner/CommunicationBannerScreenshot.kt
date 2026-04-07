package se.seb.gds.atoms.communicationbanner

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.common.GdsUiTestsPreview
import se.seb.gds.theme.GdsTheme

/**
 * Screenshot tests for the [GdsCommunicationBanner] component.
 */
@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsCommunicationBannerInformationScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsCommunicationBanner(
                heading = "Information",
                body = "This is an information banner that displays important details for the user.",
                bannerType = GdsCommunicationBannerType.Information,
                onDismiss = {},
            )
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsCommunicationBannerNoticeScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsCommunicationBanner(
                heading = "Notice",
                body = "This is a notice banner that displays success or confirmation messages.",
                bannerType = GdsCommunicationBannerType.Notice,
                onDismiss = {},
            )
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsCommunicationBannerWarningScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsCommunicationBanner(
                heading = "Warning",
                body = "This is a warning banner that alerts users about potential issues.",
                bannerType = GdsCommunicationBannerType.Warning,
                onDismiss = {},
            )
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsCommunicationBannerErrorScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsCommunicationBanner(
                heading = "Error",
                body = "This is an error banner that displays critical messages or errors.",
                bannerType = GdsCommunicationBannerType.Error,
                onDismiss = {},
            )
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsCommunicationBannerWithoutCloseButtonScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsCommunicationBanner(
                heading = "Information",
                body = "This banner does not have a close button.",
                bannerType = GdsCommunicationBannerType.Information,
                onDismiss = null,
            )
        }
    }
}
