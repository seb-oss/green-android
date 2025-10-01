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

val At: ImageVector
    get() {
        val current = _at
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.At",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 3.5f)
                curveTo(x1 = 7.30558f, y1 = 3.5f, x2 = 3.5f, y2 = 7.30558f, x3 = 3.5f, y3 = 12.0f)
                curveTo(x1 = 3.5f, y1 = 16.6944f, x2 = 7.30558f, y2 = 20.5f, x3 = 12.0f, y3 = 20.5f)
                curveTo(x1 = 13.6426f, y1 = 20.5f, x2 = 15.1743f, y2 = 20.0348f, x3 = 16.4731f, y3 = 19.2293f)
                curveTo(x1 = 16.8251f, y1 = 19.011f, x2 = 17.2875f, y2 = 19.1194f, x3 = 17.5058f, y3 = 19.4714f)
                curveTo(x1 = 17.7241f, y1 = 19.8234f, x2 = 17.6157f, y2 = 20.2857f, x3 = 17.2637f, y3 = 20.504f)
                curveTo(x1 = 15.7344f, y1 = 21.4525f, x2 = 13.93f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 6.47715f, y1 = 22.0f, x2 = 2.0f, y2 = 17.5228f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 6.47715f, x2 = 6.47715f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 17.5228f, y1 = 2.0f, x2 = 22.0f, y2 = 6.47715f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 13.0958f, x2 = 21.7306f, y2 = 14.2721f, x3 = 21.0778f, y3 = 15.1696f)
                curveTo(x1 = 20.3967f, y1 = 16.106f, x2 = 19.3255f, y2 = 16.6918f, x3 = 17.9036f, y3 = 16.5625f)
                curveTo(x1 = 16.612f, y1 = 16.4451f, x2 = 15.5224f, y2 = 15.7374f, x3 = 14.8683f, y3 = 14.7351f)
                curveTo(x1 = 13.9689f, y1 = 16.0897f, x2 = 12.4624f, y2 = 16.9293f, x3 = 10.8105f, y3 = 16.6971f)
                curveTo(x1 = 8.39607f, y1 = 16.3578f, x2 = 6.91135f, y2 = 13.9034f, x3 = 7.26292f, y3 = 11.4019f)
                curveTo(x1 = 7.61449f, y1 = 8.90031f, x2 = 9.71821f, y2 = 6.95026f, x3 = 12.1326f, y3 = 7.28959f)
                curveTo(x1 = 13.1979f, y1 = 7.4393f, x2 = 14.0821f, y2 = 8.00071f, x3 = 14.7076f, y3 = 8.79624f)
                lineTo(x = 14.7804f, y = 8.29498f)
                curveTo(x1 = 14.8399f, y1 = 7.88507f, x2 = 15.2205f, y2 = 7.60103f, x3 = 15.6304f, y3 = 7.66057f)
                curveTo(x1 = 16.0403f, y1 = 7.7201f, x2 = 16.3243f, y2 = 8.10067f, x3 = 16.2648f, y3 = 8.51058f)
                lineTo(x = 15.7354f, y = 12.1553f)
                curveTo(x1 = 15.7354f, y1 = 12.1557f, x2 = 15.7353f, y2 = 12.1561f, x3 = 15.7353f, y3 = 12.1564f)
                curveTo(x1 = 15.5286f, y1 = 13.6075f, x2 = 16.5795f, y2 = 14.936f, x3 = 18.0394f, y3 = 15.0687f)
                curveTo(x1 = 18.9121f, y1 = 15.148f, x2 = 19.4802f, y2 = 14.8159f, x3 = 19.8647f, y3 = 14.2872f)
                curveTo(x1 = 20.2775f, y1 = 13.7197f, x2 = 20.5f, y2 = 12.8838f, x3 = 20.5f, y3 = 12.0f)
                curveTo(x1 = 20.5f, y1 = 7.30558f, x2 = 16.6944f, y2 = 3.5f, x3 = 12.0f, y3 = 3.5f)
                close()
                moveTo(x = 11.9239f, y = 8.77499f)
                curveTo(x1 = 10.5099f, y1 = 8.57627f, x2 = 9.01166f, y2 = 9.73692f, x3 = 8.74832f, y3 = 11.6106f)
                curveTo(x1 = 8.48499f, y1 = 13.4844f, x2 = 9.6053f, y2 = 15.013f, x3 = 11.0192f, y3 = 15.2117f)
                curveTo(x1 = 12.4332f, y1 = 15.4105f, x2 = 13.9315f, y2 = 14.2498f, x3 = 14.1948f, y3 = 12.3761f)
                curveTo(x1 = 14.4581f, y1 = 10.5024f, x2 = 13.3378f, y2 = 8.97371f, x3 = 11.9239f, y3 = 8.77499f)
                close()
            }
        }.build().also { _at = it }
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
                imageVector = At,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _at: ImageVector? = null
