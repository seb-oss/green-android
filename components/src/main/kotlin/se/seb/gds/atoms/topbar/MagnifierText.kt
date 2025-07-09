package se.seb.gds.atoms.topbar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.round
import androidx.compose.ui.window.Popup
import se.seb.gds.theme.GdsTheme

@Composable
fun MagnifierText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    style: TextStyle = LocalTextStyle.current,
    onClick: (() -> Unit)? = null,
) {
    val localDensity = LocalDensity.current
    val textSize = with(localDensity) { style.fontSize.value.dp.toSp() }
    val lineHeight = with(localDensity) { style.lineHeight.value.dp.toSp() }
    var showMagnifier by remember { mutableStateOf(false) }
    var magnifierPosition by remember { mutableStateOf(IntOffset.Zero) }

    Text(
        text = text,
        modifier = modifier.pointerInput(Unit) {
            detectTapGestures(
                onTap = onClick?.let { onClick ->
                    { onClick() }
                },
                onLongPress = { offset ->
                    // Move up the magnifier to be above the text
                    val offsetAboveText = 100f
                    magnifierPosition = offset
                        .copy(y = offset.y - offsetAboveText)
                        .round()
                    showMagnifier = true
                },
            )
        },
        color = color,
        overflow = overflow,
        maxLines = maxLines,
        style = style.copy(fontSize = textSize, lineHeight = lineHeight),
    )

    if (showMagnifier) {
        Popup(
            offset = magnifierPosition,
            onDismissRequest = { showMagnifier = false },
        ) {
            Box(
                modifier = Modifier
                    .background(
                        GdsTheme.colors.contentContent01.copy(alpha = 0.9f),
                        RoundedCornerShape(3.dp),
                    )
                    .clickable { showMagnifier = false },
            ) {
                Text(
                    text = text,
                    color = GdsTheme.colors.contentContent03,
                    style = GdsTheme.typography.Headline,
                    modifier = Modifier.padding(16.dp),
                )
            }
        }
    }
}

