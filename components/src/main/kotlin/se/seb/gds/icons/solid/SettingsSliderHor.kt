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

internal val SettingsSliderHor: ImageVector
    get() {
        val current = _settingsSliderHor
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SettingsSliderHor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.0f, y = 3.0f)
                curveTo(x1 = 15.0465f, y1 = 3.0f, x2 = 13.421f, y2 = 4.3989f, x3 = 13.0701f, y3 = 6.25f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 6.25f, x2 = 3.0f, y2 = 6.58579f, x3 = 3.0f, y3 = 7.0f)
                curveTo(x1 = 3.0f, y1 = 7.41421f, x2 = 3.33579f, y2 = 7.75f, x3 = 3.75f, y3 = 7.75f)
                horizontalLineTo(x = 13.0701f)
                curveTo(x1 = 13.421f, y1 = 9.6011f, x2 = 15.0465f, y2 = 11.0f, x3 = 17.0f, y3 = 11.0f)
                curveTo(x1 = 19.2098f, y1 = 11.0f, x2 = 21.0f, y2 = 9.20984f, x3 = 21.0f, y3 = 7.0f)
                curveTo(x1 = 21.0f, y1 = 4.79016f, x2 = 19.2098f, y2 = 3.0f, x3 = 17.0f, y3 = 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.0f, y = 13.0f)
                curveTo(x1 = 7.04652f, y1 = 13.0f, x2 = 5.421f, y2 = 14.3989f, x3 = 5.07014f, y3 = 16.25f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 16.25f, x2 = 3.0f, y2 = 16.5858f, x3 = 3.0f, y3 = 17.0f)
                curveTo(x1 = 3.0f, y1 = 17.4142f, x2 = 3.33579f, y2 = 17.75f, x3 = 3.75f, y3 = 17.75f)
                horizontalLineTo(x = 5.07014f)
                curveTo(x1 = 5.421f, y1 = 19.6011f, x2 = 7.04652f, y2 = 21.0f, x3 = 9.0f, y3 = 21.0f)
                curveTo(x1 = 10.9535f, y1 = 21.0f, x2 = 12.579f, y2 = 19.6011f, x3 = 12.9299f, y3 = 17.75f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 17.75f, x2 = 21.0f, y2 = 17.4142f, x3 = 21.0f, y3 = 17.0f)
                curveTo(x1 = 21.0f, y1 = 16.5858f, x2 = 20.6642f, y2 = 16.25f, x3 = 20.25f, y3 = 16.25f)
                horizontalLineTo(x = 12.9299f)
                curveTo(x1 = 12.579f, y1 = 14.3989f, x2 = 10.9535f, y2 = 13.0f, x3 = 9.0f, y3 = 13.0f)
                close()
            }
        }.build().also { _settingsSliderHor = it }
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
                imageVector = SettingsSliderHor,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _settingsSliderHor: ImageVector? = null
