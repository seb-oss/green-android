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

val EmojiSmile: ImageVector
    get() {
        val current = _emojiSmile
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.EmojiSmile",
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
                moveTo(x = 14.8287f, y = 14.8284f)
                curveTo(x1 = 13.2666f, y1 = 16.3905f, x2 = 10.734f, y2 = 16.3905f, x3 = 9.17188f, y3 = 14.8284f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Square,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.5f, y = 9.5f)
                horizontalLineTo(x = 15.0f)
                moveTo(x = 15.25f, y = 9.5f)
                curveTo(x1 = 15.25f, y1 = 9.77614f, x2 = 15.0261f, y2 = 10.0f, x3 = 14.75f, y3 = 10.0f)
                curveTo(x1 = 14.4739f, y1 = 10.0f, x2 = 14.25f, y2 = 9.77614f, x3 = 14.25f, y3 = 9.5f)
                curveTo(x1 = 14.25f, y1 = 9.22386f, x2 = 14.4739f, y2 = 9.0f, x3 = 14.75f, y3 = 9.0f)
                curveTo(x1 = 15.0261f, y1 = 9.0f, x2 = 15.25f, y2 = 9.22386f, x3 = 15.25f, y3 = 9.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Square,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 9.5f)
                horizontalLineTo(x = 9.5f)
                moveTo(x = 9.75f, y = 9.5f)
                curveTo(x1 = 9.75f, y1 = 9.77614f, x2 = 9.52614f, y2 = 10.0f, x3 = 9.25f, y3 = 10.0f)
                curveTo(x1 = 8.97386f, y1 = 10.0f, x2 = 8.75f, y2 = 9.77614f, x3 = 8.75f, y3 = 9.5f)
                curveTo(x1 = 8.75f, y1 = 9.22386f, x2 = 8.97386f, y2 = 9.0f, x3 = 9.25f, y3 = 9.0f)
                curveTo(x1 = 9.52614f, y1 = 9.0f, x2 = 9.75f, y2 = 9.22386f, x3 = 9.75f, y3 = 9.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 12.0f)
                moveToRelative(dx = -9.25f, dy = 0.0f)
                arcToRelative(a = 9.25f, b = 9.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 18.5f, dy1 = 0.0f)
                arcToRelative(a = 9.25f, b = 9.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -18.5f, dy1 = 0.0f)
                close()
            }
        }.build().also { _emojiSmile = it }
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
                imageVector = EmojiSmile,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _emojiSmile: ImageVector? = null
