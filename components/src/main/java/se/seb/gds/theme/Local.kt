package se.seb.gds.theme

import androidx.compose.runtime.staticCompositionLocalOf
import se.seb.gds.theme.colors.GdsTokensColors
import se.seb.gds.theme.colors.LegacyColors

val LocalGdsColors = staticCompositionLocalOf {
    GdsTokensColors.defaultColors(isSystemDarkMode = false)
}

val LocalLegacyColors = staticCompositionLocalOf {
    LegacyColors.defaultColors(isSystemDarkMode = false)
}

val LocalGdsTypography = staticCompositionLocalOf {
    GdsTypography
}