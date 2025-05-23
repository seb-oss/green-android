package io.github.sebopensource.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import io.github.sebopensource.theme.colors.GdsTokens
import io.github.sebopensource.theme.colors.LegacyColors
import io.github.sebopensource.theme.colors.darkModeColors
import io.github.sebopensource.theme.colors.lightModeColors

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
    val colors: GdsTokens
        @Composable
        get() = LocalGdsColors.current

    val legacyColors: LegacyColors
        @Composable
        get() = LocalLegacyColors.current

    val typography: GdsTypography
        @Composable
        get() = LocalGdsTypography.current
}