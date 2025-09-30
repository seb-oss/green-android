package se.seb.gds.icons.solid

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Pdf: ImageVector
    get() {
        val current = _pdf
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Pdf",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 13.0f, y = 3.0f)
                    horizontalLineTo(x = 4.75f)
                    curveTo(x1 = 4.33579f, y1 = 3.0f, x2 = 4.0f, y2 = 3.33579f, x3 = 4.0f, y3 = 3.75f)
                    verticalLineTo(y = 12.0f)
                    horizontalLineTo(x = 20.0f)
                    verticalLineTo(y = 10.0f)
                    horizontalLineTo(x = 13.75f)
                    curveTo(x1 = 13.3358f, y1 = 10.0f, x2 = 13.0f, y2 = 9.66421f, x3 = 13.0f, y3 = 9.25f)
                    verticalLineTo(y = 3.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 20.0f, y = 8.5f)
                    verticalLineTo(y = 8.0f)
                    curveTo(x1 = 20.0f, y1 = 7.80109f, x2 = 19.921f, y2 = 7.61032f, x3 = 19.7803f, y3 = 7.46967f)
                    lineTo(x = 15.5303f, y = 3.21967f)
                    curveTo(x1 = 15.3897f, y1 = 3.07902f, x2 = 15.1989f, y2 = 3.0f, x3 = 15.0f, y3 = 3.0f)
                    horizontalLineTo(x = 14.5f)
                    verticalLineTo(y = 8.5f)
                    horizontalLineTo(x = 20.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 3.0f, y = 14.75f)
                    curveTo(x1 = 3.0f, y1 = 14.3358f, x2 = 3.33579f, y2 = 14.0f, x3 = 3.75f, y3 = 14.0f)
                    horizontalLineTo(x = 5.75f)
                    curveTo(x1 = 6.99264f, y1 = 14.0f, x2 = 8.0f, y2 = 15.0074f, x3 = 8.0f, y3 = 16.25f)
                    curveTo(x1 = 8.0f, y1 = 17.4926f, x2 = 6.99264f, y2 = 18.5f, x3 = 5.75f, y3 = 18.5f)
                    horizontalLineTo(x = 4.5f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 4.5f, y1 = 20.6642f, x2 = 4.16421f, y2 = 21.0f, x3 = 3.75f, y3 = 21.0f)
                    curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                    verticalLineTo(y = 14.75f)
                    close()
                    moveTo(x = 4.5f, y = 17.0f)
                    horizontalLineTo(x = 5.75f)
                    curveTo(x1 = 6.16421f, y1 = 17.0f, x2 = 6.5f, y2 = 16.6642f, x3 = 6.5f, y3 = 16.25f)
                    curveTo(x1 = 6.5f, y1 = 15.8358f, x2 = 6.16421f, y2 = 15.5f, x3 = 5.75f, y3 = 15.5f)
                    horizontalLineTo(x = 4.5f)
                    verticalLineTo(y = 17.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 9.0f, y = 14.75f)
                    curveTo(x1 = 9.0f, y1 = 14.3358f, x2 = 9.33579f, y2 = 14.0f, x3 = 9.75f, y3 = 14.0f)
                    horizontalLineTo(x = 11.25f)
                    curveTo(x1 = 11.8978f, y1 = 14.0f, x2 = 12.76f, y2 = 14.1611f, x3 = 13.4802f, y3 = 14.6992f)
                    curveTo(x1 = 14.2369f, y1 = 15.2646f, x2 = 14.75f, y2 = 16.183f, x3 = 14.75f, y3 = 17.5f)
                    curveTo(x1 = 14.75f, y1 = 18.817f, x2 = 14.2369f, y2 = 19.7354f, x3 = 13.4802f, y3 = 20.3008f)
                    curveTo(x1 = 12.76f, y1 = 20.8389f, x2 = 11.8978f, y2 = 21.0f, x3 = 11.25f, y3 = 21.0f)
                    horizontalLineTo(x = 9.75f)
                    curveTo(x1 = 9.33579f, y1 = 21.0f, x2 = 9.0f, y2 = 20.6642f, x3 = 9.0f, y3 = 20.25f)
                    verticalLineTo(y = 14.75f)
                    close()
                    moveTo(x = 10.5f, y = 15.5f)
                    verticalLineTo(y = 19.5f)
                    horizontalLineTo(x = 11.25f)
                    curveTo(x1 = 11.6856f, y1 = 19.5f, x2 = 12.1984f, y2 = 19.3861f, x3 = 12.5823f, y3 = 19.0992f)
                    curveTo(x1 = 12.9298f, y1 = 18.8396f, x2 = 13.25f, y2 = 18.383f, x3 = 13.25f, y3 = 17.5f)
                    curveTo(x1 = 13.25f, y1 = 16.617f, x2 = 12.9298f, y2 = 16.1604f, x3 = 12.5823f, y3 = 15.9008f)
                    curveTo(x1 = 12.1984f, y1 = 15.6139f, x2 = 11.6856f, y2 = 15.5f, x3 = 11.25f, y3 = 15.5f)
                    horizontalLineTo(x = 10.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 16.0f, y = 14.75f)
                    curveTo(x1 = 16.0f, y1 = 14.3358f, x2 = 16.3358f, y2 = 14.0f, x3 = 16.75f, y3 = 14.0f)
                    horizontalLineTo(x = 20.25f)
                    curveTo(x1 = 20.6642f, y1 = 14.0f, x2 = 21.0f, y2 = 14.3358f, x3 = 21.0f, y3 = 14.75f)
                    curveTo(x1 = 21.0f, y1 = 15.1642f, x2 = 20.6642f, y2 = 15.5f, x3 = 20.25f, y3 = 15.5f)
                    horizontalLineTo(x = 17.5f)
                    verticalLineTo(y = 17.0f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(x1 = 19.6642f, y1 = 17.0f, x2 = 20.0f, y2 = 17.3358f, x3 = 20.0f, y3 = 17.75f)
                    curveTo(x1 = 20.0f, y1 = 18.1642f, x2 = 19.6642f, y2 = 18.5f, x3 = 19.25f, y3 = 18.5f)
                    horizontalLineTo(x = 17.5f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 17.5f, y1 = 20.6642f, x2 = 17.1642f, y2 = 21.0f, x3 = 16.75f, y3 = 21.0f)
                    curveTo(x1 = 16.3358f, y1 = 21.0f, x2 = 16.0f, y2 = 20.6642f, x3 = 16.0f, y3 = 20.25f)
                    verticalLineTo(y = 14.75f)
                    close()
                }
            }.build()
            .also { _pdf = it }
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
                imageVector = Pdf,
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
private var _pdf: ImageVector? = null
