package se.seb.gds.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import se.seb.gds.theme.colors.LegacyColors
import se.seb.gds.tokens.GdsColorTokens
import se.seb.gds.tokens.darkModeColors
import se.seb.gds.tokens.lightModeColors

@Composable
fun GdsTheme(
    content: @Composable () -> Unit
) {
    val colors = if (isSystemInDarkTheme()) {
        darkModeColors
    } else {
        lightModeColors
    }
    val legacyColors = LegacyColors.defaultColors(isSystemDarkMode = isSystemInDarkTheme())

    CompositionLocalProvider(
        LocalGdsColors provides colors,
        LocalLegacyColors provides legacyColors,
        LocalGdsTypography provides GdsTypography,
        content = content
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
}