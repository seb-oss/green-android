package se.seb.gds.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import se.seb.gds.theme.colors.LegacyColors
import se.seb.gds.tokens.GdsColorTokens
import se.seb.gds.tokens.DarkModeColors
import se.seb.gds.tokens.LightModeColors

@Composable
fun GdsTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) {
        DarkModeColors
    } else {
        LightModeColors
    }
    val legacyColors = LegacyColors.defaultColors(isSystemDarkMode = isSystemInDarkTheme())
    val rippleIndication = ripple(true, Dp.Unspecified, Color.Unspecified)
    CompositionLocalProvider(
        LocalGdsColors provides colors,
        LocalIndication provides rippleIndication,
        LocalLegacyColors provides legacyColors,
        LocalGdsTypography provides GdsTypography,
        LocalLegacyTypography provides LegacyTypography,
        content = content,
    )
}

object GdsTheme {
    val colors: GdsColorTokens
        @Composable
        get() = LocalGdsColors.current

    val legacyColors: LegacyColors
        @Composable
        get() = LocalLegacyColors.current

    val typography: GdsTypography
        @Composable
        get() = LocalGdsTypography.current

    val legacyTypography: LegacyTypography
        @Composable
        get() = LocalLegacyTypography.current
}
