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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val BrandChrome: ImageVector
    get() {
        val current = _brandChrome
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BrandChrome",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 4.41465f, y = 5.48386f)
                curveTo(x1 = 9.06345f, y1 = 0.073537f, x2 = 17.6831f, y2 = 1.14151f, x3 = 20.9054f, y3 = 7.46137f)
                curveTo(x1 = 18.6371f, y1 = 7.46215f, x2 = 15.0851f, y2 = 7.46074f, x3 = 13.1613f, y3 = 7.46137f)
                curveTo(x1 = 11.766f, y1 = 7.46183f, x2 = 10.8652f, y2 = 7.43012f, x3 = 9.88955f, y3 = 7.94371f)
                curveTo(x1 = 8.74266f, y1 = 8.54746f, x2 = 7.87718f, y2 = 9.66653f, x3 = 7.57515f, y3 = 10.9811f)
                lineTo(x = 4.41465f, y = 5.48386f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 8.67313f, y = 11.9997f)
                curveTo(x1 = 8.67313f, y1 = 13.8333f, x2 = 10.1641f, y2 = 15.3251f, x3 = 11.9968f, y3 = 15.3251f)
                curveTo(x1 = 13.8293f, y1 = 15.3251f, x2 = 15.3202f, y2 = 13.8334f, x3 = 15.3202f, y3 = 11.9997f)
                curveTo(x1 = 15.3202f, y1 = 10.1661f, x2 = 13.8293f, y2 = 8.67418f, x3 = 11.9968f, y3 = 8.67418f)
                curveTo(x1 = 10.1641f, y1 = 8.67418f, x2 = 8.67313f, y2 = 10.1661f, x3 = 8.67313f, y3 = 11.9997f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 13.2866f, y = 16.3523f)
                curveTo(x1 = 11.4211f, y1 = 16.9067f, x2 = 9.23814f, y2 = 16.2919f, x3 = 8.04234f, y3 = 14.2278f)
                curveTo(x1 = 7.12952f, y1 = 12.6523f, x2 = 4.71778f, y2 = 8.4509f, x3 = 3.62167f, y3 = 6.54058f)
                curveTo(x1 = -0.21743f, y1 = 12.4248f, x2 = 3.09135f, y2 = 20.4434f, x3 = 10.0611f, y3 = 21.812f)
                lineTo(x = 13.2866f, y = 16.3523f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 15.084f, y = 8.67418f)
                curveTo(x1 = 16.6377f, y1 = 10.1192f, x2 = 16.9762f, y2 = 12.4592f, x3 = 15.9237f, y3 = 14.2736f)
                curveTo(x1 = 15.1307f, y1 = 15.6406f, x2 = 12.6f, y2 = 19.9119f, x3 = 11.3735f, y3 = 21.9801f)
                curveTo(x1 = 18.5545f, y1 = 22.4228f, x2 = 23.7894f, y2 = 15.385f, x3 = 21.4248f, y3 = 8.67418f)
                horizontalLineTo(x = 15.084f)
                close()
            }
        }.build().also { _brandChrome = it }
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
                imageVector = BrandChrome,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brandChrome: ImageVector? = null
