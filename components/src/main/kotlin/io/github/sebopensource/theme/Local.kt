package io.github.sebopensource.theme

import androidx.compose.runtime.staticCompositionLocalOf
import io.github.sebopensource.theme.colors.LegacyColors
import io.github.sebopensource.theme.colors.lightModeColors

val LocalGdsColors = staticCompositionLocalOf {
    lightModeColors
}

val LocalLegacyColors = staticCompositionLocalOf {
    LegacyColors.defaultColors(isSystemDarkMode = false)
}

val LocalGdsTypography = staticCompositionLocalOf {
    GdsTypography
}