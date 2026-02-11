package se.seb.gds.theme

import androidx.compose.runtime.staticCompositionLocalOf
import se.seb.gds.theme.colors.LegacyColors
import se.seb.gds.theme.colors.LocalLightModeColors
import se.seb.gds.tokens.GdsTypographyTokens

val LocalGdsColors =
    staticCompositionLocalOf {
        LocalLightModeColors
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

val LocalLevel = staticCompositionLocalOf {
    Level.L1
}

val LocalColorScheme = staticCompositionLocalOf {
    ColorScheme.Neutral01
}
