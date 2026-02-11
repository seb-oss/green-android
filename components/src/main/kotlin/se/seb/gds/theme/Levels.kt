package se.seb.gds.theme

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

enum class Level {
    L1,
    L2,
    L3;

    fun elevate(): Level = when (this) {
        L1 -> L2
        L2 -> L3
        L3 -> L3
    }
}

enum class ColorScheme {
    Neutral01,
    Neutral02,
}

@Composable
fun getLevelContainerColor(): Color {
    val currentLevel = LocalLevel.current
    val currentColorScheme = LocalColorScheme.current

    Log.d("Levels", "Getting container color for level: $currentLevel and color scheme: $currentColorScheme")

    return when (currentLevel) {
        Level.L1 -> {
            when (currentColorScheme) {
                ColorScheme.Neutral01 -> GdsTheme.colors.L1.Neutral01
                ColorScheme.Neutral02 -> GdsTheme.colors.L1.Neutral02
            }
        }
        Level.L2 -> {
            when (currentColorScheme) {
                ColorScheme.Neutral01 -> GdsTheme.colors.L2.Neutral01
                ColorScheme.Neutral02 -> GdsTheme.colors.L2.Neutral02
            }
        }
        Level.L3 -> {
            when (currentColorScheme) {
                ColorScheme.Neutral01 -> GdsTheme.colors.L3.Neutral01
                ColorScheme.Neutral02 -> GdsTheme.colors.L3.Neutral02
            }
        }
    }
}

@Composable
fun getLevelContentColor(): Color {
    val currentColorScheme = LocalColorScheme.current

    Log.d("Levels", "Getting content color for color scheme: $currentColorScheme")

    return when (currentColorScheme) {
        ColorScheme.Neutral01 -> GdsTheme.colors.Content.Neutral01
        ColorScheme.Neutral02 -> GdsTheme.colors.Content.Neutral02
    }
}