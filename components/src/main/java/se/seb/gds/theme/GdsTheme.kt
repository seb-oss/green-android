package se.seb.gds.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import se.seb.gds.theme.colors.GdsTokensColors
import se.seb.gds.theme.colors.LegacyColors

@Composable
fun GdsTheme(
    content: @Composable () -> Unit
) {
    val colors = GdsTokensColors.defaultColors(isSystemDarkMode = isSystemInDarkTheme())
    val legacyColors = LegacyColors.defaultColors(isSystemDarkMode = isSystemInDarkTheme())

    CompositionLocalProvider(
        LocalGdsColors provides colors,
        LocalLegacyColors provides legacyColors,
        LocalGdsTypography provides GdsTypography,
        content = content
    )
}

object GdsTheme {
    val colors: GdsTokensColors
        @Composable
        get() = LocalGdsColors.current

    val legacyColors: LegacyColors
        @Composable
        get() = LocalLegacyColors.current

    val typography: GdsTypography
        @Composable
        get() = LocalGdsTypography.current
}