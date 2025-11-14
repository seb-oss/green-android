package se.seb.gds.theme

import androidx.compose.runtime.staticCompositionLocalOf
import se.seb.gds.theme.colors.LegacyColors
import se.seb.gds.tokens.GdsTypographyTokens
import se.seb.gds.tokens.LightModeColors

val LocalGdsColors =
    staticCompositionLocalOf {
        LightModeColors
    }

val LocalLegacyColors =
    staticCompositionLocalOf {
        LegacyColors.defaultColors(isSystemDarkMode = false)
    }

val LocalGdsTypography =
    staticCompositionLocalOf {
        GdsTypographyTokens
    }

val LocalGdsDimensions = staticCompositionLocalOf {
    GdsDimensions()
}
