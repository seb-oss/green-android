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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val MicOff: ImageVector
    get() {
        val current = _micOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.MicOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.0001f, y = 11.5f)
                curveTo(x1 = 17.0001f, y1 = 12.1846f, x2 = 16.8625f, y2 = 12.8371f, x3 = 16.6134f, y3 = 13.4313f)
                lineTo(x = 7.67383f, y = 4.49163f)
                curveTo(x1 = 8.53954f, y1 = 3.00174f, x2 = 10.1528f, y2 = 2.0f, x3 = 12.0001f, y3 = 2.0f)
                curveTo(x1 = 14.7615f, y1 = 2.0f, x2 = 17.0001f, y2 = 4.23858f, x3 = 17.0001f, y3 = 7.0f)
                verticalLineTo(y = 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.53033f, y = 2.46967f)
                curveTo(x1 = 3.23744f, y1 = 2.17678f, x2 = 2.76256f, y2 = 2.17678f, x3 = 2.46967f, y3 = 2.46967f)
                curveTo(x1 = 2.17678f, y1 = 2.76256f, x2 = 2.17678f, y2 = 3.23744f, x3 = 2.46967f, y3 = 3.53033f)
                lineTo(x = 7.0f, y = 8.06066f)
                verticalLineTo(y = 11.5f)
                curveTo(x1 = 7.0f, y1 = 14.2614f, x2 = 9.23858f, y2 = 16.5f, x3 = 12.0f, y3 = 16.5f)
                curveTo(x1 = 12.9805f, y1 = 16.5f, x2 = 13.8962f, y2 = 16.2172f, x3 = 14.6684f, y3 = 15.7291f)
                lineTo(x = 15.9288f, y = 16.9894f)
                curveTo(x1 = 14.822f, y1 = 17.7832f, x2 = 13.4661f, y2 = 18.2499f, x3 = 11.9999f, y3 = 18.2499f)
                curveTo(x1 = 9.23314f, y1 = 18.2499f, x2 = 6.85352f, y2 = 16.5852f, x3 = 5.81123f, y3 = 14.1997f)
                curveTo(x1 = 5.64539f, y1 = 13.8201f, x2 = 5.20326f, y2 = 13.6468f, x3 = 4.82369f, y3 = 13.8127f)
                curveTo(x1 = 4.44412f, y1 = 13.9785f, x2 = 4.27086f, y2 = 14.4207f, x3 = 4.4367f, y3 = 14.8002f)
                curveTo(x1 = 5.61403f, y1 = 17.4948f, x2 = 8.19054f, y2 = 19.4406f, x3 = 11.2499f, y3 = 19.7163f)
                verticalLineTo(y = 21.2499f)
                curveTo(x1 = 11.2499f, y1 = 21.6642f, x2 = 11.5857f, y2 = 21.9999f, x3 = 11.9999f, y3 = 21.9999f)
                curveTo(x1 = 12.4141f, y1 = 21.9999f, x2 = 12.7499f, y2 = 21.6642f, x3 = 12.7499f, y3 = 21.2499f)
                verticalLineTo(y = 19.7163f)
                curveTo(x1 = 14.3398f, y1 = 19.5729f, x2 = 15.8004f, y2 = 18.9781f, x3 = 17.0011f, y3 = 18.0617f)
                lineTo(x = 20.4697f, y = 21.5303f)
                curveTo(x1 = 20.7626f, y1 = 21.8232f, x2 = 21.2374f, y2 = 21.8232f, x3 = 21.5303f, y3 = 21.5303f)
                curveTo(x1 = 21.8232f, y1 = 21.2374f, x2 = 21.8232f, y2 = 20.7626f, x3 = 21.5303f, y3 = 20.4697f)
                lineTo(x = 3.53033f, y = 2.46967f)
                close()
            }
        }.build().also { _micOff = it }
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
                imageVector = MicOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _micOff: ImageVector? = null
