package se.seb.green.theme

import androidx.compose.runtime.staticCompositionLocalOf

val LocalGreenColors = staticCompositionLocalOf {
    GreenTokenColors.defaultColors(isSystemDarkMode = false)
}

val LocalLegacyColors = staticCompositionLocalOf {
    LegacyColors.defaultColors(isSystemDarkMode = false)
}

val LocalGreenTypography = staticCompositionLocalOf {
    GreenTypography
}