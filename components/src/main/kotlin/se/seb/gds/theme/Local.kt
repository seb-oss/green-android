package se.seb.gds.theme

import androidx.compose.runtime.staticCompositionLocalOf
import se.seb.gds.theme.colors.LegacyColors
import se.seb.gds.tokens.lightModeColors

val LocalGdsColors = staticCompositionLocalOf {
    lightModeColors
}

val LocalLegacyColors = staticCompositionLocalOf {
    LegacyColors.defaultColors(isSystemDarkMode = false)
}

val LocalGdsTypography = staticCompositionLocalOf {
    GdsTypography
}

val LocalLegacyTypography = staticCompositionLocalOf {
    LegacyTypography
}