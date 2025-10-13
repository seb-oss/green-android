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

internal val FloppyDisk: ImageVector
    get() {
        val current = _floppyDisk
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.FloppyDisk",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.5f, y = 14.25f)
                curveTo(x1 = 9.5f, y1 = 12.8693f, x2 = 10.6193f, y2 = 11.75f, x3 = 12.0f, y3 = 11.75f)
                curveTo(x1 = 13.3807f, y1 = 11.75f, x2 = 14.5f, y2 = 12.8693f, x3 = 14.5f, y3 = 14.25f)
                curveTo(x1 = 14.5f, y1 = 15.6307f, x2 = 13.3807f, y2 = 16.75f, x3 = 12.0f, y3 = 16.75f)
                curveTo(x1 = 10.6193f, y1 = 16.75f, x2 = 9.5f, y2 = 15.6307f, x3 = 9.5f, y3 = 14.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.75f, y = 3.0f)
                horizontalLineTo(x = 8.0f)
                verticalLineTo(y = 8.25f)
                curveTo(x1 = 8.0f, y1 = 8.66421f, x2 = 8.33579f, y2 = 9.0f, x3 = 8.75f, y3 = 9.0f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 15.6642f, y1 = 9.0f, x2 = 16.0f, y2 = 8.66421f, x3 = 16.0f, y3 = 8.25f)
                verticalLineTo(y = 3.0f)
                horizontalLineTo(x = 17.25f)
                curveTo(x1 = 17.4489f, y1 = 3.0f, x2 = 17.6397f, y2 = 3.07902f, x3 = 17.7803f, y3 = 3.21967f)
                lineTo(x = 20.7803f, y = 6.21967f)
                curveTo(x1 = 20.921f, y1 = 6.36032f, x2 = 21.0f, y2 = 6.55109f, x3 = 21.0f, y3 = 6.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                close()
                moveTo(x = 12.0f, y = 10.25f)
                curveTo(x1 = 9.79086f, y1 = 10.25f, x2 = 8.0f, y2 = 12.0409f, x3 = 8.0f, y3 = 14.25f)
                curveTo(x1 = 8.0f, y1 = 16.4591f, x2 = 9.79086f, y2 = 18.25f, x3 = 12.0f, y3 = 18.25f)
                curveTo(x1 = 14.2091f, y1 = 18.25f, x2 = 16.0f, y2 = 16.4591f, x3 = 16.0f, y3 = 14.25f)
                curveTo(x1 = 16.0f, y1 = 12.0409f, x2 = 14.2091f, y2 = 10.25f, x3 = 12.0f, y3 = 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.5f, y = 3.0f)
                horizontalLineTo(x = 14.5f)
                verticalLineTo(y = 7.5f)
                horizontalLineTo(x = 9.5f)
                verticalLineTo(y = 3.0f)
                close()
            }
        }.build().also { _floppyDisk = it }
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
                imageVector = FloppyDisk,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _floppyDisk: ImageVector? = null
