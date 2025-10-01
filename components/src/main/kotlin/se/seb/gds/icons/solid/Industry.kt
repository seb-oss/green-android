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

val Industry: ImageVector
    get() {
        val current = _industry
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Industry",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 8.75f, y = 5.25f)
                curveTo(x1 = 8.75f, y1 = 4.55964f, x2 = 9.30964f, y2 = 4.0f, x3 = 10.0f, y3 = 4.0f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.6642f, y1 = 4.0f, x2 = 20.0f, y2 = 3.66421f, x3 = 20.0f, y3 = 3.25f)
                curveTo(x1 = 20.0f, y1 = 2.83579f, x2 = 19.6642f, y2 = 2.5f, x3 = 19.25f, y3 = 2.5f)
                horizontalLineTo(x = 10.0f)
                curveTo(x1 = 8.48122f, y1 = 2.5f, x2 = 7.25f, y2 = 3.73122f, x3 = 7.25f, y3 = 5.25f)
                curveTo(x1 = 7.25f, y1 = 5.66421f, x2 = 7.58579f, y2 = 6.0f, x3 = 8.0f, y3 = 6.0f)
                curveTo(x1 = 8.41421f, y1 = 6.0f, x2 = 8.75f, y2 = 5.66421f, x3 = 8.75f, y3 = 5.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 5.75001f, y = 7.0f)
                curveTo(x1 = 5.38153f, y1 = 7.0f, x2 = 5.06764f, y2 = 7.26766f, x3 = 5.00943f, y3 = 7.63151f)
                lineTo(x = 3.00943f, y = 20.1315f)
                curveTo(x1 = 2.97473f, y1 = 20.3484f, x2 = 3.03682f, y2 = 20.5695f, x3 = 3.17932f, y3 = 20.7366f)
                curveTo(x1 = 3.32181f, y1 = 20.9037f, x2 = 3.53039f, y2 = 21.0f, x3 = 3.75001f, y3 = 21.0f)
                horizontalLineTo(x = 12.25f)
                curveTo(x1 = 12.3155f, y1 = 21.0f, x2 = 12.38f, y2 = 20.9914f, x3 = 12.4421f, y3 = 20.975f)
                curveTo(x1 = 12.5037f, y1 = 20.9913f, x2 = 12.5682f, y2 = 21.0f, x3 = 12.6345f, y3 = 21.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 21.0f, x2 = 21.0f, y2 = 20.6642f, x3 = 21.0f, y3 = 20.25f)
                verticalLineTo(y = 11.5f)
                curveTo(x1 = 21.0f, y1 = 11.2426f, x2 = 20.868f, y2 = 11.0032f, x3 = 20.6504f, y3 = 10.8658f)
                curveTo(x1 = 20.4328f, y1 = 10.7284f, x2 = 20.1599f, y2 = 10.7122f, x3 = 19.9276f, y3 = 10.8229f)
                lineTo(x = 15.75f, y = 12.8122f)
                verticalLineTo(y = 11.5f)
                curveTo(x1 = 15.75f, y1 = 11.2411f, x2 = 15.6165f, y2 = 11.0006f, x3 = 15.3969f, y3 = 10.8636f)
                curveTo(x1 = 15.1772f, y1 = 10.7266f, x2 = 14.9024f, y2 = 10.7126f, x3 = 14.67f, y3 = 10.8265f)
                lineTo(x = 11.7321f, y = 12.2661f)
                lineTo(x = 10.9906f, y = 7.63151f)
                curveTo(x1 = 10.9324f, y1 = 7.26766f, x2 = 10.6185f, y2 = 7.0f, x3 = 10.25f, y3 = 7.0f)
                horizontalLineTo(x = 5.75001f)
                close()
                moveTo(x = 4.62954f, y = 19.5f)
                lineTo(x = 6.38954f, y = 8.5f)
                horizontalLineTo(x = 9.61047f)
                lineTo(x = 11.3705f, y = 19.5f)
                horizontalLineTo(x = 4.62954f)
                close()
            }
        }.build().also { _industry = it }
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
                imageVector = Industry,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _industry: ImageVector? = null
