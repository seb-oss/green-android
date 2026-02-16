package se.seb.gds.atoms.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.common.GdsUiTestsPreview
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@GdsUiPreview
@PreviewTest
@Composable
private fun GdsAlertDialogAllElementsScreenshot() {
    GdsTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = GdsTheme.colors.L1.Neutral01),
            contentAlignment = Alignment.Center,
        ) {
            GdsAlertDialog(
                icon = GdsIcons.Regular.Bank,
                title = "Alert Dialog",
                text = "A dialog is a type of modal window that appears in front of app " +
                    "content to provide critical information, or prompt for a decision to be made.",
                confirmButtonText = "Ok",
                dismissButtonText = "Cancel",
                onDismissRequest = {},
                onConfirmation = {},
            )
        }
    }
}

@GdsUiTestsPreview
@PreviewTest
@Composable
private fun GdsAlertDialogNoTextScreenshot() {
    GdsTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = GdsTheme.colors.L1.Neutral01),
            contentAlignment = Alignment.Center,
        ) {
            GdsAlertDialog(
                title = "Alert Dialog",
                confirmButtonText = "Ok",
                dismissButtonText = "Cancel",
                onDismissRequest = {},
                onConfirmation = {},
            )
        }
    }
}

@GdsUiTestsPreview
@PreviewTest
@Composable
private fun GdsAlertDialogNoIconScreenshot() {
    GdsTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = GdsTheme.colors.L1.Neutral01),
            contentAlignment = Alignment.Center,
        ) {
            GdsAlertDialog(
                title = "Alert Dialog",
                text = "A dialog is a type of modal window that appears in front of app " +
                    "content to provide critical information, or prompt for a decision to be made.",
                confirmButtonText = "Ok",
                dismissButtonText = "Cancel",
                onDismissRequest = {},
                onConfirmation = {},
            )
        }
    }
}
