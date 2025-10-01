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

val VolumeHalf: ImageVector
    get() {
        val current = _volumeHalf
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.VolumeHalf",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.6101f, y = 3.09208f)
                curveTo(x1 = 12.8505f, y1 = 3.22366f, x2 = 13.0f, y2 = 3.47592f, x3 = 13.0f, y3 = 3.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 13.0f, y1 = 20.5241f, x2 = 12.8505f, y2 = 20.7763f, x3 = 12.6101f, y3 = 20.9079f)
                curveTo(x1 = 12.3696f, y1 = 21.0395f, x2 = 12.0766f, y2 = 21.0294f, x3 = 11.8457f, y3 = 20.8817f)
                lineTo(x = 5.78055f, y = 17.0f)
                horizontalLineTo(x = 1.75f)
                curveTo(x1 = 1.33579f, y1 = 17.0f, x2 = 1.0f, y2 = 16.6642f, x3 = 1.0f, y3 = 16.25f)
                verticalLineTo(y = 7.75f)
                curveTo(x1 = 1.0f, y1 = 7.33579f, x2 = 1.33579f, y2 = 7.0f, x3 = 1.75f, y3 = 7.0f)
                horizontalLineTo(x = 5.78055f)
                lineTo(x = 11.8457f, y = 3.1183f)
                curveTo(x1 = 12.0766f, y1 = 2.97055f, x2 = 12.3696f, y2 = 2.9605f, x3 = 12.6101f, y3 = 3.09208f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 16.4194f, y = 7.581f)
                curveTo(x1 = 16.1265f, y1 = 7.28811f, x2 = 15.6516f, y2 = 7.28811f, x3 = 15.3587f, y3 = 7.581f)
                curveTo(x1 = 15.0658f, y1 = 7.87389f, x2 = 15.0658f, y2 = 8.34876f, x3 = 15.3587f, y3 = 8.64166f)
                curveTo(x1 = 16.2191f, y1 = 9.50206f, x2 = 16.75f, y2 = 10.6885f, x3 = 16.75f, y3 = 12.0004f)
                curveTo(x1 = 16.75f, y1 = 13.3123f, x2 = 16.2191f, y2 = 14.4988f, x3 = 15.3587f, y3 = 15.3592f)
                curveTo(x1 = 15.0658f, y1 = 15.6521f, x2 = 15.0658f, y2 = 16.1269f, x3 = 15.3587f, y3 = 16.4198f)
                curveTo(x1 = 15.6516f, y1 = 16.7127f, x2 = 16.1265f, y2 = 16.7127f, x3 = 16.4194f, y3 = 16.4198f)
                curveTo(x1 = 17.5496f, y1 = 15.2896f, x2 = 18.25f, y2 = 13.7261f, x3 = 18.25f, y3 = 12.0004f)
                curveTo(x1 = 18.25f, y1 = 10.2747f, x2 = 17.5496f, y2 = 8.7112f, x3 = 16.4194f, y3 = 7.581f)
                close()
            }
        }.build().also { _volumeHalf = it }
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
                imageVector = VolumeHalf,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _volumeHalf: ImageVector? = null
