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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Shapes: ImageVector
    get() {
        val current = _shapes
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Shapes",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.1073f, y = 17.1577f)
                curveTo(x1 = 17.1073f, y1 = 18.8655f, x2 = 15.7213f, y2 = 20.25f, x3 = 14.0116f, y3 = 20.25f)
                curveTo(x1 = 12.3019f, y1 = 20.25f, x2 = 10.9159f, y2 = 18.8655f, x3 = 10.9159f, y3 = 17.1577f)
                curveTo(x1 = 10.9159f, y1 = 15.4499f, x2 = 12.3019f, y2 = 14.0654f, x3 = 14.0116f, y3 = 14.0654f)
                curveTo(x1 = 15.7213f, y1 = 14.0654f, x2 = 17.1073f, y2 = 15.4499f, x3 = 17.1073f, y3 = 17.1577f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.99145f, y = 6.98598f)
                lineTo(x = 10.4681f, y = 11.5764f)
                lineTo(x = 3.75f, y = 14.0189f)
                lineTo(x = 4.99145f, y = 6.98598f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.2695f, y = 3.5f)
                lineTo(x = 20.25f, y = 5.1007f)
                lineTo(x = 18.6475f, y = 11.0746f)
                lineTo(x = 12.6671f, y = 9.47388f)
                lineTo(x = 14.2695f, y = 3.5f)
                close()
            }
        }.build().also { _shapes = it }
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
                imageVector = Shapes,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _shapes: ImageVector? = null
