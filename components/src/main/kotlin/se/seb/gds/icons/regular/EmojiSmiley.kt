package se.seb.gds.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val EmojiSmiley: ImageVector
    get() {
        val current = _emojiSmiley
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.EmojiSmiley",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.5f, y = 12.0f)
                curveTo(x1 = 17.5f, y1 = 15.0376f, x2 = 15.0376f, y2 = 17.5f, x3 = 12.0f, y3 = 17.5f)
                curveTo(x1 = 8.96243f, y1 = 17.5f, x2 = 6.5f, y2 = 15.0376f, x3 = 6.5f, y3 = 12.0f)
                moveTo(x = 21.25f, y = 12.0f)
                curveTo(x1 = 21.25f, y1 = 17.1086f, x2 = 17.1086f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                curveTo(x1 = 6.89137f, y1 = 21.25f, x2 = 2.75f, y2 = 17.1086f, x3 = 2.75f, y3 = 12.0f)
                curveTo(x1 = 2.75f, y1 = 6.89137f, x2 = 6.89137f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 17.1086f, y1 = 2.75f, x2 = 21.25f, y2 = 6.89137f, x3 = 21.25f, y3 = 12.0f)
                close()
                moveTo(x = 10.25f, y = 9.0f)
                curveTo(x1 = 10.25f, y1 = 9.41421f, x2 = 9.91421f, y2 = 9.75f, x3 = 9.5f, y3 = 9.75f)
                curveTo(x1 = 9.08579f, y1 = 9.75f, x2 = 8.75f, y2 = 9.41421f, x3 = 8.75f, y3 = 9.0f)
                curveTo(x1 = 8.75f, y1 = 8.58579f, x2 = 9.08579f, y2 = 8.25f, x3 = 9.5f, y3 = 8.25f)
                curveTo(x1 = 9.91421f, y1 = 8.25f, x2 = 10.25f, y2 = 8.58579f, x3 = 10.25f, y3 = 9.0f)
                close()
                moveTo(x = 15.25f, y = 9.0f)
                curveTo(x1 = 15.25f, y1 = 9.41421f, x2 = 14.9142f, y2 = 9.75f, x3 = 14.5f, y3 = 9.75f)
                curveTo(x1 = 14.0858f, y1 = 9.75f, x2 = 13.75f, y2 = 9.41421f, x3 = 13.75f, y3 = 9.0f)
                curveTo(x1 = 13.75f, y1 = 8.58579f, x2 = 14.0858f, y2 = 8.25f, x3 = 14.5f, y3 = 8.25f)
                curveTo(x1 = 14.9142f, y1 = 8.25f, x2 = 15.25f, y2 = 8.58579f, x3 = 15.25f, y3 = 9.0f)
                close()
            }
        }.build().also { _emojiSmiley = it }
    }

@Preview
@Composable
private fun IconPreview() {
    se.seb.gds.theme.GdsTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                imageVector = EmojiSmiley,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _emojiSmiley: ImageVector? = null
