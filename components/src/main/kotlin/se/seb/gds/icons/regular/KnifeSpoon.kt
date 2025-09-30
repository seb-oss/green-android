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

val KnifeSpoon: ImageVector
    get() {
        val current = _knifeSpoon
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.KnifeSpoon",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 3.75f, y = 3.75f)
                    verticalLineTo(y = 9.0f)
                    curveTo(x1 = 3.75f, y1 = 10.7949f, x2 = 5.20507f, y2 = 12.25f, x3 = 7.0f, y3 = 12.25f)
                    curveTo(x1 = 8.79493f, y1 = 12.25f, x2 = 10.25f, y2 = 10.7949f, x3 = 10.25f, y3 = 9.0f)
                    verticalLineTo(y = 3.75f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 7.0f, y = 12.25f)
                    verticalLineTo(y = 20.25f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 17.0f, y = 12.5f)
                    verticalLineTo(y = 20.25f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 20.5f, y = 8.00758f)
                    curveTo(x1 = 20.5f, y1 = 10.4238f, x2 = 18.933f, y2 = 12.25f, x3 = 17.0f, y3 = 12.25f)
                    curveTo(x1 = 15.067f, y1 = 12.25f, x2 = 13.5f, y2 = 10.4238f, x3 = 13.5f, y3 = 8.00758f)
                    curveTo(x1 = 13.5f, y1 = 5.59133f, x2 = 15.067f, y2 = 3.5f, x3 = 17.0f, y3 = 3.5f)
                    curveTo(x1 = 18.933f, y1 = 3.5f, x2 = 20.5f, y2 = 5.59133f, x3 = 20.5f, y3 = 8.00758f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 7.0f, y = 3.75f)
                    verticalLineTo(y = 9.25f)
                }
            }.build()
            .also { _knifeSpoon = it }
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
                imageVector = KnifeSpoon,
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
private var _knifeSpoon: ImageVector? = null
