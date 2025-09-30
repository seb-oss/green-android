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

val Thermostat: ImageVector
    get() {
        val current = _thermostat
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Thermostat",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 7.25f, y = 2.0f)
                    curveTo(x1 = 6.83579f, y1 = 2.0f, x2 = 6.5f, y2 = 2.33579f, x3 = 6.5f, y3 = 2.75f)
                    verticalLineTo(y = 12.6689f)
                    curveTo(x1 = 5.0055f, y1 = 13.5334f, x2 = 4.0f, y2 = 15.1493f, x3 = 4.0f, y3 = 17.0f)
                    curveTo(x1 = 4.0f, y1 = 19.7614f, x2 = 6.23858f, y2 = 22.0f, x3 = 9.0f, y3 = 22.0f)
                    curveTo(x1 = 11.7614f, y1 = 22.0f, x2 = 14.0f, y2 = 19.7614f, x3 = 14.0f, y3 = 17.0f)
                    curveTo(x1 = 14.0f, y1 = 15.1493f, x2 = 12.9945f, y2 = 13.5334f, x3 = 11.5f, y3 = 12.6689f)
                    verticalLineTo(y = 2.75f)
                    curveTo(x1 = 11.5f, y1 = 2.33579f, x2 = 11.1642f, y2 = 2.0f, x3 = 10.75f, y3 = 2.0f)
                    horizontalLineTo(x = 7.25f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 15.75f, y = 3.5f)
                    curveTo(x1 = 15.3358f, y1 = 3.5f, x2 = 15.0f, y2 = 3.83579f, x3 = 15.0f, y3 = 4.25f)
                    curveTo(x1 = 15.0f, y1 = 4.66421f, x2 = 15.3358f, y2 = 5.0f, x3 = 15.75f, y3 = 5.0f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(x1 = 19.6642f, y1 = 5.0f, x2 = 20.0f, y2 = 4.66421f, x3 = 20.0f, y3 = 4.25f)
                    curveTo(x1 = 20.0f, y1 = 3.83579f, x2 = 19.6642f, y2 = 3.5f, x3 = 19.25f, y3 = 3.5f)
                    horizontalLineTo(x = 15.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 15.75f, y = 7.5f)
                    curveTo(x1 = 15.3358f, y1 = 7.5f, x2 = 15.0f, y2 = 7.83579f, x3 = 15.0f, y3 = 8.25f)
                    curveTo(x1 = 15.0f, y1 = 8.66421f, x2 = 15.3358f, y2 = 9.0f, x3 = 15.75f, y3 = 9.0f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(x1 = 19.6642f, y1 = 9.0f, x2 = 20.0f, y2 = 8.66421f, x3 = 20.0f, y3 = 8.25f)
                    curveTo(x1 = 20.0f, y1 = 7.83579f, x2 = 19.6642f, y2 = 7.5f, x3 = 19.25f, y3 = 7.5f)
                    horizontalLineTo(x = 15.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 15.0f, y = 12.25f)
                    curveTo(x1 = 15.0f, y1 = 11.8358f, x2 = 15.3358f, y2 = 11.5f, x3 = 15.75f, y3 = 11.5f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(x1 = 19.6642f, y1 = 11.5f, x2 = 20.0f, y2 = 11.8358f, x3 = 20.0f, y3 = 12.25f)
                    curveTo(x1 = 20.0f, y1 = 12.6642f, x2 = 19.6642f, y2 = 13.0f, x3 = 19.25f, y3 = 13.0f)
                    horizontalLineTo(x = 15.75f)
                    curveTo(x1 = 15.3358f, y1 = 13.0f, x2 = 15.0f, y2 = 12.6642f, x3 = 15.0f, y3 = 12.25f)
                    close()
                }
            }.build()
            .also { _thermostat = it }
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
                imageVector = Thermostat,
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
private var _thermostat: ImageVector? = null
