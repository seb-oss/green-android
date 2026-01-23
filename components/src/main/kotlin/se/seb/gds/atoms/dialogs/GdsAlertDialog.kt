package se.seb.gds.atoms.dialogs

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import se.seb.gds.atoms.ButtonWidthType
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.GdsText
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
fun GdsAlertDialog(
    confirmButtonText: String,
    onConfirmation: () -> Unit,
    title: String? = null,
    text: String? = null,
    icon: ImageVector? = null,
    dismissButtonText: String? = null,
    onDismissRequest: () -> Unit = {},
) {
    AlertDialog(
        containerColor = GdsAlertDialogDefaults.containerColor(),
        iconContentColor = GdsAlertDialogDefaults.iconContentColor(),
        onDismissRequest = onDismissRequest,
        title = title?.let {
            {
                GdsText(
                    label = it,
                    style = GdsTheme.typography.HeadingM,
                )
            }
        },
        text = text?.let {
            {
                GdsText(
                    label = it,
                    style = GdsTheme.typography.BodyRegularM,
                )
            }
        },
        icon = icon?.let { iconVector ->
            {
                Icon(
                    modifier = Modifier.size(GdsAlertDialogDefaults.iconSize),
                    imageVector = iconVector,
                    contentDescription = null,
                )
            }
        },
        confirmButton = {
            GdsButton(
                title = confirmButtonText,
                style = GdsButtonDefaults.TwentyThree.tertiary(),
                sizeProfile = GdsButtonDefaults.TwentyThree.large().copy(widthType = ButtonWidthType.Dynamic),
                onClick = onConfirmation,
            )
        },
        dismissButton = dismissButtonText?.let {
            {
                GdsButton(
                    title = it,
                    style = GdsButtonDefaults.TwentyThree.tertiary(),
                    sizeProfile = GdsButtonDefaults.TwentyThree.large().copy(widthType = ButtonWidthType.Dynamic),
                    onClick = onDismissRequest,
                )
            }
        },
    )
}

@Preview(
    name = "Light Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0xFFFFFF,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0x000000,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun GdsAlertDialogPreview() {
    GdsTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = GdsTheme.colors.L1Neutral01),
            contentAlignment = Alignment.Center,
        ) {
            GdsAlertDialog(
                icon = GdsIcons.Regular.Bank,
                title = "Alert Dialog",
                text = "A dialog is a type of modal window that appears in front of app content to provide critical information, or prompt for a decision to be made.",
                confirmButtonText = "Ok",
                dismissButtonText = "Cancel",
                onDismissRequest = {},
                onConfirmation = {},
            )
        }
    }
}