package se.seb.gds.atoms.dialogs

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

object GdsAlertDialogDefaults {
    val iconSize = 24.dp

    @Composable
    fun containerColor(): Color = GdsTheme.colors.L1.Elevated01

    @Composable
    fun iconContentColor(): Color = GdsTheme.colors.Content.Neutral01
}
