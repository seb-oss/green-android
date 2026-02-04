package se.seb.gds.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsText
import se.seb.gds.atoms.dialogs.GdsAlertDialog
import se.seb.gds.components.SwitchRow
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
internal fun DialogsScreen() {
    var showAlertDialog by rememberSaveable { mutableStateOf(false) }
    var hasIcon by rememberSaveable { mutableStateOf(true) }
    var hasTitle by rememberSaveable { mutableStateOf(true) }
    var hasText by rememberSaveable { mutableStateOf(true) }
    var hasDismissButton by rememberSaveable { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        GdsText(
            modifier = Modifier.padding(16.dp),
            label = "Configure Alert Dialog",
            style = GdsTheme.typography.HeadingS,
        )
        Spacer(modifier = Modifier.size(8.dp))
        SwitchRow(
            title = "Show Icon",
            checked = hasIcon,
            onCheckedChanged = { hasIcon = it },
        )
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
        SwitchRow(
            title = "Show Title",
            checked = hasTitle,
            onCheckedChanged = { hasTitle = it },
        )
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
        SwitchRow(
            title = "Show Text",
            checked = hasText,
            onCheckedChanged = { hasText = it },
        )
        HorizontalDivider(color = GdsTheme.colors.Border.Subtle01, thickness = 0.5.dp)
        SwitchRow(
            title = "Show Dismiss Button",
            checked = hasDismissButton,
            onCheckedChanged = { hasDismissButton = it },
        )
        Spacer(modifier = Modifier.size(16.dp))

        GdsButton(
            modifier = Modifier.padding(8.dp),
            title = "Show Alert Dialog",
            onClick = { showAlertDialog = true },
        )
    }

    if (showAlertDialog) {
        GdsAlertDialog(
            icon = if (hasIcon) GdsIcons.Regular.Bank else null,
            title = if (hasTitle) "Alert Dialog" else null,
            text = if (hasText) {
                "A dialog is a type of modal window that appears in front of app " +
                    "content to provide critical information, or prompt for a decision to be made."
            } else {
                null
            },
            confirmButtonText = "Ok",
            dismissButtonText = if (hasDismissButton) "Cancel" else null,
            onDismissRequest = { showAlertDialog = false },
            onConfirmation = { showAlertDialog = false },
        )
    }
}
