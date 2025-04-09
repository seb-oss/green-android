package se.seb.greencomponentsandroid.ui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb



private fun Color.toHexString(): String {
    val argb = this.toArgb()
    return String.format("#%08X", argb)
}

data class ColorMapping(
    val lightModeColor: Color,
    val lightModeValue: String = lightModeColor.toHexString(),
    val darkModeColor: Color,
    val darkModeValue: String = darkModeColor.toHexString(),
)