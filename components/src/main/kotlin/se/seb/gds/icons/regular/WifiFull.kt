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

internal val WifiFull: ImageVector
    get() {
        val current = _wifiFull
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.WifiFull",
            defaultWidth = 25.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 25.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 7.82177f)
                curveTo(x1 = 15.751f, y1 = 3.72477f, x2 = 8.249f, y2 = 3.72477f, x3 = 3.0f, y3 = 7.82177f)
                moveTo(x = 6.75098f, y = 13.3144f)
                curveTo(x1 = 9.81298f, y1 = 10.9264f, x2 = 14.188f, y2 = 10.9264f, x3 = 17.25f, y3 = 13.3144f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 0.5f,
            ) {
                moveTo(x = 12.0f, y = 18.25f)
                curveTo(x1 = 12.4142f, y1 = 18.25f, x2 = 12.75f, y2 = 18.5858f, x3 = 12.75f, y3 = 19.0f)
                curveTo(x1 = 12.75f, y1 = 19.4142f, x2 = 12.4142f, y2 = 19.75f, x3 = 12.0f, y3 = 19.75f)
                curveTo(x1 = 11.5858f, y1 = 19.75f, x2 = 11.25f, y2 = 19.4142f, x3 = 11.25f, y3 = 19.0f)
                curveTo(x1 = 11.25f, y1 = 18.5858f, x2 = 11.5858f, y2 = 18.25f, x3 = 12.0f, y3 = 18.25f)
                close()
            }
        }.build().also { _wifiFull = it }
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
                imageVector = WifiFull,
                contentDescription = null,
                modifier = Modifier
                    .width((25.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _wifiFull: ImageVector? = null
