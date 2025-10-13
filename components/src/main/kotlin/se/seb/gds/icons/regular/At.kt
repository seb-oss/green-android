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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val At: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.8684f, y = 19.8667f)
                curveTo(x1 = 15.4543f, y1 = 20.7437f, x2 = 13.7863f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                curveTo(x1 = 6.89137f, y1 = 21.25f, x2 = 2.75f, y2 = 17.1086f, x3 = 2.75f, y3 = 12.0f)
                curveTo(x1 = 2.75f, y1 = 6.89137f, x2 = 6.89137f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 17.1086f, y1 = 2.75f, x2 = 21.25f, y2 = 6.89137f, x3 = 21.25f, y3 = 12.0f)
                curveTo(x1 = 21.25f, y1 = 13.9797f, x2 = 20.2662f, y2 = 16.0242f, x3 = 17.9715f, y3 = 15.8156f)
                curveTo(x1 = 16.0837f, y1 = 15.644f, x2 = 14.7249f, y2 = 13.9258f, x3 = 14.993f, y3 = 12.0492f)
                lineTo(x = 15.5226f, y = 8.40278f)
                moveTo(x = 14.9375f, y = 12.4805f)
                curveTo(x1 = 14.63f, y1 = 14.6681f, x2 = 12.8291f, y2 = 16.2235f, x3 = 10.9149f, y3 = 15.9544f)
                curveTo(x1 = 9.00068f, y1 = 15.6854f, x2 = 7.69817f, y2 = 13.6939f, x3 = 8.00562f, y3 = 11.5063f)
                curveTo(x1 = 8.31308f, y1 = 9.31862f, x2 = 10.1141f, y2 = 7.76327f, x3 = 12.0283f, y3 = 8.03229f)
                curveTo(x1 = 13.9424f, y1 = 8.30131f, x2 = 15.245f, y2 = 10.2928f, x3 = 14.9375f, y3 = 12.4805f)
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
