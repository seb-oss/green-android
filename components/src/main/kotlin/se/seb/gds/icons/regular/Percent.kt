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

val Percent: ImageVector
    get() {
        val current = _percent
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Percent",
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
                    moveTo(x = 16.0f, y = 8.0f)
                    lineTo(x = 8.0f, y = 16.0f)
                    moveTo(x = 21.25f, y = 12.0f)
                    curveTo(x1 = 21.25f, y1 = 17.1086f, x2 = 17.1086f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                    curveTo(x1 = 6.89137f, y1 = 21.25f, x2 = 2.75f, y2 = 17.1086f, x3 = 2.75f, y3 = 12.0f)
                    curveTo(x1 = 2.75f, y1 = 6.89137f, x2 = 6.89137f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                    curveTo(x1 = 17.1086f, y1 = 2.75f, x2 = 21.25f, y2 = 6.89137f, x3 = 21.25f, y3 = 12.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 0.5f,
                ) {
                    moveTo(x = 9.0f, y = 8.25f)
                    curveTo(x1 = 9.41421f, y1 = 8.25f, x2 = 9.75f, y2 = 8.58579f, x3 = 9.75f, y3 = 9.0f)
                    curveTo(x1 = 9.75f, y1 = 9.41421f, x2 = 9.41421f, y2 = 9.75f, x3 = 9.0f, y3 = 9.75f)
                    curveTo(x1 = 8.58579f, y1 = 9.75f, x2 = 8.25f, y2 = 9.41421f, x3 = 8.25f, y3 = 9.0f)
                    curveTo(x1 = 8.25f, y1 = 8.58579f, x2 = 8.58579f, y2 = 8.25f, x3 = 9.0f, y3 = 8.25f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 0.5f,
                ) {
                    moveTo(x = 15.0f, y = 14.25f)
                    curveTo(x1 = 15.4142f, y1 = 14.25f, x2 = 15.75f, y2 = 14.5858f, x3 = 15.75f, y3 = 15.0f)
                    curveTo(x1 = 15.75f, y1 = 15.4142f, x2 = 15.4142f, y2 = 15.75f, x3 = 15.0f, y3 = 15.75f)
                    curveTo(x1 = 14.5858f, y1 = 15.75f, x2 = 14.25f, y2 = 15.4142f, x3 = 14.25f, y3 = 15.0f)
                    curveTo(x1 = 14.25f, y1 = 14.5858f, x2 = 14.5858f, y2 = 14.25f, x3 = 15.0f, y3 = 14.25f)
                    close()
                }
            }.build()
            .also { _percent = it }
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
                imageVector = Percent,
                contentDescription = null,
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _percent: ImageVector? = null
