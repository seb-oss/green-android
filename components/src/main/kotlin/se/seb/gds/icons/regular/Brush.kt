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

val Brush: ImageVector
    get() {
        val current = _brush
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Brush",
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
                    moveTo(x = 16.5f, y = 15.5f)
                    lineTo(x = 8.49997f, y = 7.5f)
                    moveTo(x = 13.1225f, y = 18.1222f)
                    lineTo(x = 13.5001f, y = 18.5001f)
                    lineTo(x = 21.5f, y = 10.5f)
                    lineTo(x = 19.5f, y = 8.5f)
                    horizontalLineTo(x = 17.5f)
                    lineTo(x = 17.5f, y = 6.5f)
                    lineTo(x = 13.5f, y = 2.5f)
                    lineTo(x = 5.50006f, y = 10.5003f)
                    lineTo(x = 5.87774f, y = 10.8776f)
                    curveTo(x1 = 7.05031f, y1 = 12.0489f, x2 = 7.05082f, y2 = 13.9492f, x3 = 5.87889f, y3 = 15.1212f)
                    lineTo(x = 2.50024f, y = 18.5001f)
                    lineTo(x = 5.50079f, y = 21.4995f)
                    lineTo(x = 8.87883f, y = 18.1213f)
                    curveTo(x1 = 10.0508f, y1 = 16.9492f, x2 = 11.9511f, y2 = 16.9497f, x3 = 13.1225f, y3 = 18.1222f)
                    close()
                }
            }.build()
            .also { _brush = it }
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
                imageVector = Brush,
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
private var _brush: ImageVector? = null
