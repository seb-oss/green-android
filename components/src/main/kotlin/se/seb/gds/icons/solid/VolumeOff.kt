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

val VolumeOff: ImageVector
    get() {
        val current = _volumeOff
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.VolumeOff",
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
                    moveTo(x = 22.0303f, y = 10.5304f)
                    curveTo(x1 = 22.3232f, y1 = 10.2375f, x2 = 22.3232f, y2 = 9.76266f, x3 = 22.0303f, y3 = 9.46977f)
                    curveTo(x1 = 21.7374f, y1 = 9.17687f, x2 = 21.2625f, y2 = 9.17687f, x3 = 20.9697f, y3 = 9.46977f)
                    lineTo(x = 19.3787f, y = 11.0608f)
                    lineTo(x = 17.7877f, y = 9.46977f)
                    curveTo(x1 = 17.4948f, y1 = 9.17687f, x2 = 17.0199f, y2 = 9.17687f, x3 = 16.727f, y3 = 9.46977f)
                    curveTo(x1 = 16.4341f, y1 = 9.76266f, x2 = 16.4341f, y2 = 10.2375f, x3 = 16.727f, y3 = 10.5304f)
                    lineTo(x = 18.318f, y = 12.1214f)
                    lineTo(x = 16.727f, y = 13.7124f)
                    curveTo(x1 = 16.4341f, y1 = 14.0053f, x2 = 16.4341f, y2 = 14.4802f, x3 = 16.727f, y3 = 14.7731f)
                    curveTo(x1 = 17.0199f, y1 = 15.066f, x2 = 17.4948f, y2 = 15.066f, x3 = 17.7877f, y3 = 14.7731f)
                    lineTo(x = 19.3787f, y = 13.1821f)
                    lineTo(x = 20.9697f, y = 14.7731f)
                    curveTo(x1 = 21.2625f, y1 = 15.066f, x2 = 21.7374f, y2 = 15.066f, x3 = 22.0303f, y3 = 14.7731f)
                    curveTo(x1 = 22.3232f, y1 = 14.4802f, x2 = 22.3232f, y2 = 14.0053f, x3 = 22.0303f, y3 = 13.7124f)
                    lineTo(x = 20.4393f, y = 12.1214f)
                    lineTo(x = 22.0303f, y = 10.5304f)
                    close()
                }
            }.build()
            .also { _volumeOff = it }
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
                imageVector = VolumeOff,
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
private var _volumeOff: ImageVector? = null
