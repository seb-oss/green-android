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

val Backward: ImageVector
    get() {
        val current = _backward
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Backward",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 6.0f, y = 4.0f)
                curveTo(x1 = 5.74058f, y1 = 4.0f, x2 = 5.49958f, y2 = 4.13406f, x3 = 5.36277f, y3 = 4.35448f)
                lineTo(x = 0.86277f, y = 11.6045f)
                curveTo(x1 = 0.71241f, y1 = 11.8467f, x2 = 0.71241f, y2 = 12.1533f, x3 = 0.86277f, y3 = 12.3955f)
                lineTo(x = 5.36277f, y = 19.6455f)
                curveTo(x1 = 5.49958f, y1 = 19.8659f, x2 = 5.74058f, y2 = 20.0f, x3 = 6.0f, y3 = 20.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 20.0f, x2 = 22.0f, y2 = 19.6642f, x3 = 22.0f, y3 = 19.25f)
                verticalLineTo(y = 4.75f)
                curveTo(x1 = 22.0f, y1 = 4.33579f, x2 = 21.6642f, y2 = 4.0f, x3 = 21.25f, y3 = 4.0f)
                horizontalLineTo(x = 6.0f)
                close()
                moveTo(x = 11.0303f, y = 9.21967f)
                curveTo(x1 = 10.7374f, y1 = 8.92678f, x2 = 10.2626f, y2 = 8.92678f, x3 = 9.96967f, y3 = 9.21967f)
                curveTo(x1 = 9.67678f, y1 = 9.51256f, x2 = 9.67678f, y2 = 9.98744f, x3 = 9.96967f, y3 = 10.2803f)
                lineTo(x = 11.6893f, y = 12.0f)
                lineTo(x = 9.96967f, y = 13.7197f)
                curveTo(x1 = 9.67678f, y1 = 14.0126f, x2 = 9.67678f, y2 = 14.4874f, x3 = 9.96967f, y3 = 14.7803f)
                curveTo(x1 = 10.2626f, y1 = 15.0732f, x2 = 10.7374f, y2 = 15.0732f, x3 = 11.0303f, y3 = 14.7803f)
                lineTo(x = 12.75f, y = 13.0607f)
                lineTo(x = 14.4697f, y = 14.7803f)
                curveTo(x1 = 14.7626f, y1 = 15.0732f, x2 = 15.2374f, y2 = 15.0732f, x3 = 15.5303f, y3 = 14.7803f)
                curveTo(x1 = 15.8232f, y1 = 14.4874f, x2 = 15.8232f, y2 = 14.0126f, x3 = 15.5303f, y3 = 13.7197f)
                lineTo(x = 13.8107f, y = 12.0f)
                lineTo(x = 15.5303f, y = 10.2803f)
                curveTo(x1 = 15.8232f, y1 = 9.98744f, x2 = 15.8232f, y2 = 9.51256f, x3 = 15.5303f, y3 = 9.21967f)
                curveTo(x1 = 15.2374f, y1 = 8.92678f, x2 = 14.7626f, y2 = 8.92678f, x3 = 14.4697f, y3 = 9.21967f)
                lineTo(x = 12.75f, y = 10.9393f)
                lineTo(x = 11.0303f, y = 9.21967f)
                close()
            }
        }.build().also { _backward = it }
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
                imageVector = Backward,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _backward: ImageVector? = null
