package se.seb.gds.atoms.loadingindicators

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

object GdsLoadingIndicatorDefaults {
    val Size = 48.dp
    
    @Composable
    fun indicatorColor(): Color = GdsTheme.colors.L3NeutralStrong
    
    @Composable
    fun containerColor(): Color = GdsTheme.colors.L3Neutral02
}