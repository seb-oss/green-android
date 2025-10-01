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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val VolumeOff: ImageVector
    get() {
        val current = _volumeOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.VolumeOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 1.75f, y = 7.75f)
                verticalLineTo(y = 7.0f)
                curveTo(x1 = 1.33579f, y1 = 7.0f, x2 = 1.0f, y2 = 7.33579f, x3 = 1.0f, y3 = 7.75f)
                horizontalLineTo(x = 1.75f)
                close()
                moveTo(x = 6.0f, y = 7.75f)
                verticalLineTo(y = 8.5f)
                curveTo(x1 = 6.1433f, y1 = 8.5f, x2 = 6.2836f, y2 = 8.45895f, x3 = 6.40429f, y3 = 8.3817f)
                lineTo(x = 6.0f, y = 7.75f)
                close()
                moveTo(x = 12.25f, y = 3.75f)
                horizontalLineTo(x = 13.0f)
                curveTo(x1 = 13.0f, y1 = 3.47592f, x2 = 12.8505f, y2 = 3.22366f, x3 = 12.6101f, y3 = 3.09208f)
                curveTo(x1 = 12.3696f, y1 = 2.9605f, x2 = 12.0766f, y2 = 2.97055f, x3 = 11.8457f, y3 = 3.1183f)
                lineTo(x = 12.25f, y = 3.75f)
                close()
                moveTo(x = 12.25f, y = 20.25f)
                lineTo(x = 11.8457f, y = 20.8817f)
                curveTo(x1 = 12.0766f, y1 = 21.0294f, x2 = 12.3696f, y2 = 21.0395f, x3 = 12.6101f, y3 = 20.9079f)
                curveTo(x1 = 12.8505f, y1 = 20.7763f, x2 = 13.0f, y2 = 20.5241f, x3 = 13.0f, y3 = 20.25f)
                horizontalLineTo(x = 12.25f)
                close()
                moveTo(x = 6.0f, y = 16.25f)
                lineTo(x = 6.40429f, y = 15.6183f)
                curveTo(x1 = 6.2836f, y1 = 15.5411f, x2 = 6.1433f, y2 = 15.5f, x3 = 6.0f, y3 = 15.5f)
                verticalLineTo(y = 16.25f)
                close()
                moveTo(x = 1.75f, y = 16.25f)
                horizontalLineTo(x = 1.0f)
                curveTo(x1 = 1.0f, y1 = 16.6642f, x2 = 1.33579f, y2 = 17.0f, x3 = 1.75f, y3 = 17.0f)
                lineTo(x = 1.75f, y = 16.25f)
                close()
                moveTo(x = 22.0303f, y = 10.5303f)
                curveTo(x1 = 22.3232f, y1 = 10.2374f, x2 = 22.3232f, y2 = 9.76256f, x3 = 22.0303f, y3 = 9.46967f)
                curveTo(x1 = 21.7374f, y1 = 9.17678f, x2 = 21.2626f, y2 = 9.17678f, x3 = 20.9697f, y3 = 9.46967f)
                lineTo(x = 22.0303f, y = 10.5303f)
                close()
                moveTo(x = 16.727f, y = 13.7123f)
                curveTo(x1 = 16.4341f, y1 = 14.0052f, x2 = 16.4341f, y2 = 14.4801f, x3 = 16.727f, y3 = 14.773f)
                curveTo(x1 = 17.0199f, y1 = 15.0659f, x2 = 17.4948f, y2 = 15.0659f, x3 = 17.7877f, y3 = 14.773f)
                lineTo(x = 16.727f, y = 13.7123f)
                close()
                moveTo(x = 17.7877f, y = 9.46967f)
                curveTo(x1 = 17.4948f, y1 = 9.17678f, x2 = 17.0199f, y2 = 9.17678f, x3 = 16.727f, y3 = 9.46967f)
                curveTo(x1 = 16.4341f, y1 = 9.76256f, x2 = 16.4341f, y2 = 10.2374f, x3 = 16.727f, y3 = 10.5303f)
                lineTo(x = 17.7877f, y = 9.46967f)
                close()
                moveTo(x = 20.9697f, y = 14.773f)
                curveTo(x1 = 21.2626f, y1 = 15.0659f, x2 = 21.7374f, y2 = 15.0659f, x3 = 22.0303f, y3 = 14.773f)
                curveTo(x1 = 22.3232f, y1 = 14.4801f, x2 = 22.3232f, y2 = 14.0052f, x3 = 22.0303f, y3 = 13.7123f)
                lineTo(x = 20.9697f, y = 14.773f)
                close()
                moveTo(x = 1.75f, y = 7.75f)
                verticalLineTo(y = 8.5f)
                horizontalLineTo(x = 6.0f)
                verticalLineTo(y = 7.75f)
                verticalLineTo(y = 7.0f)
                horizontalLineTo(x = 1.75f)
                verticalLineTo(y = 7.75f)
                close()
                moveTo(x = 6.0f, y = 7.75f)
                lineTo(x = 6.40429f, y = 8.3817f)
                lineTo(x = 12.6543f, y = 4.3817f)
                lineTo(x = 12.25f, y = 3.75f)
                lineTo(x = 11.8457f, y = 3.1183f)
                lineTo(x = 5.59571f, y = 7.1183f)
                lineTo(x = 6.0f, y = 7.75f)
                close()
                moveTo(x = 12.25f, y = 3.75f)
                horizontalLineTo(x = 11.5f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 12.25f)
                horizontalLineTo(x = 13.0f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 12.25f)
                close()
                moveTo(x = 12.25f, y = 20.25f)
                lineTo(x = 12.6543f, y = 19.6183f)
                lineTo(x = 6.40429f, y = 15.6183f)
                lineTo(x = 6.0f, y = 16.25f)
                lineTo(x = 5.59571f, y = 16.8817f)
                lineTo(x = 11.8457f, y = 20.8817f)
                lineTo(x = 12.25f, y = 20.25f)
                close()
                moveTo(x = 6.0f, y = 16.25f)
                verticalLineTo(y = 15.5f)
                horizontalLineTo(x = 1.75f)
                verticalLineTo(y = 16.25f)
                verticalLineTo(y = 17.0f)
                horizontalLineTo(x = 6.0f)
                verticalLineTo(y = 16.25f)
                close()
                moveTo(x = 1.75f, y = 16.25f)
                horizontalLineTo(x = 2.5f)
                verticalLineTo(y = 7.75f)
                horizontalLineTo(x = 1.75f)
                horizontalLineTo(x = 1.0f)
                verticalLineTo(y = 16.25f)
                horizontalLineTo(x = 1.75f)
                close()
                moveTo(x = 21.5f, y = 10.0f)
                lineTo(x = 20.9697f, y = 9.46967f)
                lineTo(x = 18.8483f, y = 11.591f)
                lineTo(x = 19.3787f, y = 12.1213f)
                lineTo(x = 19.909f, y = 12.6517f)
                lineTo(x = 22.0303f, y = 10.5303f)
                lineTo(x = 21.5f, y = 10.0f)
                close()
                moveTo(x = 19.3787f, y = 12.1213f)
                lineTo(x = 18.8483f, y = 11.591f)
                lineTo(x = 16.727f, y = 13.7123f)
                lineTo(x = 17.2574f, y = 14.2426f)
                lineTo(x = 17.7877f, y = 14.773f)
                lineTo(x = 19.909f, y = 12.6517f)
                lineTo(x = 19.3787f, y = 12.1213f)
                close()
                moveTo(x = 17.2574f, y = 10.0f)
                lineTo(x = 16.727f, y = 10.5303f)
                lineTo(x = 18.8483f, y = 12.6517f)
                lineTo(x = 19.3787f, y = 12.1213f)
                lineTo(x = 19.909f, y = 11.591f)
                lineTo(x = 17.7877f, y = 9.46967f)
                lineTo(x = 17.2574f, y = 10.0f)
                close()
                moveTo(x = 19.3787f, y = 12.1213f)
                lineTo(x = 18.8483f, y = 12.6517f)
                lineTo(x = 20.9697f, y = 14.773f)
                lineTo(x = 21.5f, y = 14.2426f)
                lineTo(x = 22.0303f, y = 13.7123f)
                lineTo(x = 19.909f, y = 11.591f)
                lineTo(x = 19.3787f, y = 12.1213f)
                close()
            }
        }.build().also { _volumeOff = it }
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
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _volumeOff: ImageVector? = null
