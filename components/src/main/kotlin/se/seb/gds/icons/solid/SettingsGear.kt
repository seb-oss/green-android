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

val SettingsGear: ImageVector
    get() {
        val current = _settingsGear
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SettingsGear",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 10.451f, y = 2.33397f)
                curveTo(x1 = 10.5901f, y1 = 2.12533f, x2 = 10.8242f, y2 = 2.0f, x3 = 11.075f, y3 = 2.0f)
                horizontalLineTo(x = 12.925f)
                curveTo(x1 = 13.1758f, y1 = 2.0f, x2 = 13.4099f, y2 = 2.12533f, x3 = 13.549f, y3 = 2.33397f)
                lineTo(x = 15.1115f, y = 4.67764f)
                lineTo(x = 17.6126f, y = 4.10046f)
                curveTo(x1 = 17.8646f, y1 = 4.04231f, x2 = 18.1287f, y2 = 4.11807f, x3 = 18.3116f, y3 = 4.30092f)
                lineTo(x = 19.6991f, y = 5.68842f)
                curveTo(x1 = 19.8819f, y1 = 5.87127f, x2 = 19.9577f, y2 = 6.13542f, x3 = 19.8995f, y3 = 6.38739f)
                lineTo(x = 19.3224f, y = 8.88852f)
                lineTo(x = 21.666f, y = 10.451f)
                curveTo(x1 = 21.8747f, y1 = 10.5901f, x2 = 22.0f, y2 = 10.8242f, x3 = 22.0f, y3 = 11.075f)
                verticalLineTo(y = 12.925f)
                curveTo(x1 = 22.0f, y1 = 13.1758f, x2 = 21.8747f, y2 = 13.4099f, x3 = 21.666f, y3 = 13.549f)
                lineTo(x = 19.3224f, y = 15.1115f)
                lineTo(x = 19.8995f, y = 17.6126f)
                curveTo(x1 = 19.9577f, y1 = 17.8646f, x2 = 19.8819f, y2 = 18.1287f, x3 = 19.6991f, y3 = 18.3116f)
                lineTo(x = 18.3116f, y = 19.6991f)
                curveTo(x1 = 18.1287f, y1 = 19.8819f, x2 = 17.8646f, y2 = 19.9577f, x3 = 17.6126f, y3 = 19.8995f)
                lineTo(x = 15.1115f, y = 19.3224f)
                lineTo(x = 13.549f, y = 21.666f)
                curveTo(x1 = 13.4099f, y1 = 21.8747f, x2 = 13.1758f, y2 = 22.0f, x3 = 12.925f, y3 = 22.0f)
                horizontalLineTo(x = 11.075f)
                curveTo(x1 = 10.8242f, y1 = 22.0f, x2 = 10.5901f, y2 = 21.8747f, x3 = 10.451f, y3 = 21.666f)
                lineTo(x = 8.88852f, y = 19.3224f)
                lineTo(x = 6.38739f, y = 19.8995f)
                curveTo(x1 = 6.13542f, y1 = 19.9577f, x2 = 5.87127f, y2 = 19.8819f, x3 = 5.68842f, y3 = 19.6991f)
                lineTo(x = 4.30092f, y = 18.3116f)
                curveTo(x1 = 4.11807f, y1 = 18.1287f, x2 = 4.04231f, y2 = 17.8646f, x3 = 4.10046f, y3 = 17.6126f)
                lineTo(x = 4.67764f, y = 15.1115f)
                lineTo(x = 2.33397f, y = 13.549f)
                curveTo(x1 = 2.12533f, y1 = 13.4099f, x2 = 2.0f, y2 = 13.1758f, x3 = 2.0f, y3 = 12.925f)
                verticalLineTo(y = 11.075f)
                curveTo(x1 = 2.0f, y1 = 10.8242f, x2 = 2.12533f, y2 = 10.5901f, x3 = 2.33397f, y3 = 10.451f)
                lineTo(x = 4.67764f, y = 8.88852f)
                lineTo(x = 4.10046f, y = 6.38739f)
                curveTo(x1 = 4.04231f, y1 = 6.13542f, x2 = 4.11807f, y2 = 5.87127f, x3 = 4.30092f, y3 = 5.68842f)
                lineTo(x = 5.68842f, y = 4.30092f)
                curveTo(x1 = 5.87127f, y1 = 4.11807f, x2 = 6.13542f, y2 = 4.04231f, x3 = 6.38739f, y3 = 4.10046f)
                lineTo(x = 8.88852f, y = 4.67764f)
                lineTo(x = 10.451f, y = 2.33397f)
                close()
                moveTo(x = 8.875f, y = 12.0f)
                curveTo(x1 = 8.875f, y1 = 10.2741f, x2 = 10.2741f, y2 = 8.875f, x3 = 12.0f, y3 = 8.875f)
                curveTo(x1 = 13.7259f, y1 = 8.875f, x2 = 15.125f, y2 = 10.2741f, x3 = 15.125f, y3 = 12.0f)
                curveTo(x1 = 15.125f, y1 = 13.7259f, x2 = 13.7259f, y2 = 15.125f, x3 = 12.0f, y3 = 15.125f)
                curveTo(x1 = 10.2741f, y1 = 15.125f, x2 = 8.875f, y2 = 13.7259f, x3 = 8.875f, y3 = 12.0f)
                close()
            }
        }.build().also { _settingsGear = it }
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
                imageVector = SettingsGear,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _settingsGear: ImageVector? = null
