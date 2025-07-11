package se.seb.gds.atoms.input

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object InputFieldUtil {
    @Composable
    fun minHeight(
        textLineCount: Int = 1,
        labelLineCount: Int = 1,
        hasPadding: Boolean = false,
        textStyle: TextStyle,
        labelStyle: TextStyle,
    ): Dp {
        val density = LocalDensity.current
        val textHeight = textStyle.lineHeight.value.sp
        val labelHeight = labelStyle.lineHeight.value.sp
        val buffer = 8.dp
        val padding = 16.dp
        val minHeight = with(density) {
            (textHeight.toDp() * textLineCount) + (labelHeight.toDp() * labelLineCount) + buffer + if (hasPadding) padding else 0.dp
        }
        return minHeight
    }
}
