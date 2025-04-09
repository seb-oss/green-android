package se.seb.green.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun GreenTheme(
    content: @Composable () -> Unit
) {
    val colors = GreenTokenColors.defaultColors(isSystemDarkMode = isSystemInDarkTheme())
    val legacyColors = LegacyColors.defaultColors(isSystemDarkMode = isSystemInDarkTheme())

    CompositionLocalProvider(
        LocalGreenColors provides colors,
        LocalLegacyColors provides legacyColors,
        LocalGreenTypography provides GreenTypography,
        content = content
    )
}

object GreenTheme {
    val colors: GreenTokenColors
        @Composable
        get() = LocalGreenColors.current

    val legacyColors: LegacyColors
        @Composable
        get() = LocalLegacyColors.current

    val typography: GreenTypography
        @Composable
        get() = LocalGreenTypography.current
}