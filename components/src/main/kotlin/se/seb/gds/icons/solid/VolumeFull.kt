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

val VolumeFull: ImageVector
    get() {
        val current = _volumeFull
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.VolumeFull",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 13.0f, y = 3.75f)
                    curveTo(x1 = 13.0f, y1 = 3.47592f, x2 = 12.8505f, y2 = 3.22366f, x3 = 12.6101f, y3 = 3.09208f)
                    curveTo(x1 = 12.3696f, y1 = 2.9605f, x2 = 12.0766f, y2 = 2.97055f, x3 = 11.8457f, y3 = 3.1183f)
                    lineTo(x = 5.78055f, y = 7.0f)
                    horizontalLineTo(x = 1.75f)
                    curveTo(x1 = 1.33579f, y1 = 7.0f, x2 = 1.0f, y2 = 7.33579f, x3 = 1.0f, y3 = 7.75f)
                    verticalLineTo(y = 16.25f)
                    curveTo(x1 = 1.0f, y1 = 16.6642f, x2 = 1.33579f, y2 = 17.0f, x3 = 1.75f, y3 = 17.0f)
                    horizontalLineTo(x = 5.78055f)
                    lineTo(x = 11.8457f, y = 20.8817f)
                    curveTo(x1 = 12.0766f, y1 = 21.0294f, x2 = 12.3696f, y2 = 21.0395f, x3 = 12.6101f, y3 = 20.9079f)
                    curveTo(x1 = 12.8505f, y1 = 20.7763f, x2 = 13.0f, y2 = 20.5241f, x3 = 13.0f, y3 = 20.25f)
                    verticalLineTo(y = 3.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 18.7175f, y = 4.22162f)
                    curveTo(x1 = 19.0104f, y1 = 3.92873f, x2 = 19.4852f, y2 = 3.92873f, x3 = 19.7781f, y3 = 4.22162f)
                    curveTo(x1 = 21.7679f, y1 = 6.21141f, x2 = 23.0f, y2 = 8.96244f, x3 = 23.0f, y3 = 11.9998f)
                    curveTo(x1 = 23.0f, y1 = 15.0372f, x2 = 21.7679f, y2 = 17.7882f, x3 = 19.7781f, y3 = 19.778f)
                    curveTo(x1 = 19.4852f, y1 = 20.0709f, x2 = 19.0104f, y2 = 20.0709f, x3 = 18.7175f, y3 = 19.778f)
                    curveTo(x1 = 18.4246f, y1 = 19.4851f, x2 = 18.4246f, y2 = 19.0102f, x3 = 18.7175f, y3 = 18.7173f)
                    curveTo(x1 = 20.4375f, y1 = 16.9973f, x2 = 21.5f, y2 = 14.6234f, x3 = 21.5f, y3 = 11.9998f)
                    curveTo(x1 = 21.5f, y1 = 9.37624f, x2 = 20.4375f, y2 = 7.00227f, x3 = 18.7175f, y3 = 5.28228f)
                    curveTo(x1 = 18.4246f, y1 = 4.98939f, x2 = 18.4246f, y2 = 4.51452f, x3 = 18.7175f, y3 = 4.22162f)
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
            }.build()
            .also { _volumeFull = it }
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
                imageVector = VolumeFull,
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
private var _volumeFull: ImageVector? = null
