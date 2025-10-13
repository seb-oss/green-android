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

internal val Png: ImageVector
    get() {
        val current = _png
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Png",
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
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.75f, y = 20.25f)
                verticalLineTo(y = 14.75f)
                horizontalLineTo(x = 5.5f)
                curveTo(x1 = 6.32843f, y1 = 14.75f, x2 = 7.0f, y2 = 15.4216f, x3 = 7.0f, y3 = 16.25f)
                curveTo(x1 = 7.0f, y1 = 17.0784f, x2 = 6.32843f, y2 = 17.75f, x3 = 5.5f, y3 = 17.75f)
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
                horizontalLineTo(x = 10.0f)
                lineTo(x = 13.25f, y = 20.25f)
                horizontalLineTo(x = 13.75f)
                verticalLineTo(y = 14.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.6961f, y = 15.2215f)
                curveTo(x1 = 19.3191f, y1 = 14.8448f, x2 = 18.6504f, y2 = 14.7533f, x3 = 18.251f, y3 = 14.7782f)
                curveTo(x1 = 17.1463f, y1 = 14.8473f, x2 = 16.1554f, y2 = 15.9981f, x3 = 16.1554f, y3 = 17.5608f)
                curveTo(x1 = 16.1554f, y1 = 19.1236f, x2 = 17.0973f, y2 = 20.2499f, x3 = 18.4001f, y3 = 20.2499f)
                curveTo(x1 = 19.0459f, y1 = 20.2418f, x2 = 19.8065f, y2 = 20.0485f, x3 = 20.25f, y3 = 19.5537f)
                verticalLineTo(y = 17.8333f)
                horizontalLineTo(x = 19.1961f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.75f, y = 4.25f)
                verticalLineTo(y = 9.25f)
                horizontalLineTo(x = 18.75f)
            }
        }.build().also { _png = it }
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
                imageVector = Png,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _png: ImageVector? = null
