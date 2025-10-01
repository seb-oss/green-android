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

val Jpg: ImageVector
    get() {
        val current = _jpg
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Jpg",
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
                moveTo(x = 4.75f, y = 11.25f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 15.0f)
                lineTo(x = 19.25f, y = 8.0f)
                verticalLineTo(y = 11.25f)
                moveTo(x = 13.75f, y = 4.25f)
                verticalLineTo(y = 9.25f)
                horizontalLineTo(x = 18.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.5f, y = 14.75f)
                verticalLineTo(y = 18.75f)
                curveTo(x1 = 6.5f, y1 = 19.5784f, x2 = 5.82843f, y2 = 20.25f, x3 = 5.0f, y3 = 20.25f)
                horizontalLineTo(x = 4.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.5f, y = 20.25f)
                verticalLineTo(y = 14.75f)
                horizontalLineTo(x = 11.25f)
                curveTo(x1 = 12.0784f, y1 = 14.75f, x2 = 12.75f, y2 = 15.4216f, x3 = 12.75f, y3 = 16.25f)
                curveTo(x1 = 12.75f, y1 = 17.0784f, x2 = 12.0784f, y2 = 17.75f, x3 = 11.25f, y3 = 17.75f)
                horizontalLineTo(x = 10.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.6751f, y = 15.1739f)
                curveTo(x1 = 18.2838f, y1 = 14.7915f, x2 = 17.5897f, y2 = 14.6985f, x3 = 17.1752f, y3 = 14.7239f)
                curveTo(x1 = 16.0285f, y1 = 14.7939f, x2 = 15.0f, y2 = 15.9625f, x3 = 15.0f, y3 = 17.5494f)
                curveTo(x1 = 15.0f, y1 = 19.1363f, x2 = 15.9777f, y2 = 20.28f, x3 = 17.3299f, y3 = 20.28f)
                curveTo(x1 = 18.0003f, y1 = 20.2718f, x2 = 18.7897f, y2 = 20.0755f, x3 = 19.25f, y3 = 19.573f)
                verticalLineTo(y = 17.8261f)
                horizontalLineTo(x = 18.1561f)
            }
        }.build().also { _jpg = it }
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
                imageVector = Jpg,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _jpg: ImageVector? = null
