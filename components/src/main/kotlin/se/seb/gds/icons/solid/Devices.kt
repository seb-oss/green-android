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

internal val Devices: ImageVector
    get() {
        val current = _devices
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Devices",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.25f, y = 17.5f)
                curveTo(x1 = 16.8358f, y1 = 17.5f, x2 = 16.5f, y2 = 17.8358f, x3 = 16.5f, y3 = 18.25f)
                curveTo(x1 = 16.5f, y1 = 18.6642f, x2 = 16.8358f, y2 = 19.0f, x3 = 17.25f, y3 = 19.0f)
                horizontalLineTo(x = 19.5f)
                curveTo(x1 = 19.9142f, y1 = 19.0f, x2 = 20.25f, y2 = 18.6642f, x3 = 20.25f, y3 = 18.25f)
                curveTo(x1 = 20.25f, y1 = 17.8358f, x2 = 19.9142f, y2 = 17.5f, x3 = 19.5f, y3 = 17.5f)
                horizontalLineTo(x = 17.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.75f, y = 3.0f)
                curveTo(x1 = 3.33579f, y1 = 3.0f, x2 = 3.0f, y2 = 3.33579f, x3 = 3.0f, y3 = 3.75f)
                verticalLineTo(y = 16.0f)
                horizontalLineTo(x = 1.75f)
                curveTo(x1 = 1.33579f, y1 = 16.0f, x2 = 1.0f, y2 = 16.3358f, x3 = 1.0f, y3 = 16.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 1.0f, y1 = 20.6642f, x2 = 1.33579f, y2 = 21.0f, x3 = 1.75f, y3 = 21.0f)
                horizontalLineTo(x = 13.5f)
                verticalLineTo(y = 21.25f)
                curveTo(x1 = 13.5f, y1 = 21.6642f, x2 = 13.8358f, y2 = 22.0f, x3 = 14.25f, y3 = 22.0f)
                horizontalLineTo(x = 22.25f)
                curveTo(x1 = 22.6642f, y1 = 22.0f, x2 = 23.0f, y2 = 21.6642f, x3 = 23.0f, y3 = 21.25f)
                verticalLineTo(y = 8.75f)
                curveTo(x1 = 23.0f, y1 = 8.33579f, x2 = 22.6642f, y2 = 8.0f, x3 = 22.25f, y3 = 8.0f)
                horizontalLineTo(x = 21.0f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 21.0f, y1 = 3.33579f, x2 = 20.6642f, y2 = 3.0f, x3 = 20.25f, y3 = 3.0f)
                horizontalLineTo(x = 3.75f)
                close()
                moveTo(x = 14.0f, y = 8.04268f)
                curveTo(x1 = 14.0782f, y1 = 8.01504f, x2 = 14.1623f, y2 = 8.0f, x3 = 14.25f, y3 = 8.0f)
                horizontalLineTo(x = 14.0f)
                verticalLineTo(y = 8.04268f)
                close()
                moveTo(x = 15.0f, y = 20.5f)
                verticalLineTo(y = 9.5f)
                horizontalLineTo(x = 21.5f)
                verticalLineTo(y = 20.5f)
                horizontalLineTo(x = 15.0f)
                close()
                moveTo(x = 13.5f, y = 17.5f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 2.5f)
                verticalLineTo(y = 17.5f)
                horizontalLineTo(x = 13.5f)
                close()
            }
        }.build().also { _devices = it }
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
                imageVector = Devices,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _devices: ImageVector? = null
