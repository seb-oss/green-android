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

val Smartwatch: ImageVector
    get() {
        val current = _smartwatch
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Smartwatch",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 7.28849f, y = 1.51283f)
                    curveTo(x1 = 7.39058f, y1 = 1.20657f, x2 = 7.67718f, y2 = 1.0f, x3 = 8.00001f, y3 = 1.0f)
                    horizontalLineTo(x = 16.0f)
                    curveTo(x1 = 16.3228f, y1 = 1.0f, x2 = 16.6094f, y2 = 1.20657f, x3 = 16.7115f, y3 = 1.51283f)
                    lineTo(x = 17.5406f, y = 4.0f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(x1 = 19.6642f, y1 = 4.0f, x2 = 20.0f, y2 = 4.33579f, x3 = 20.0f, y3 = 4.75f)
                    verticalLineTo(y = 19.25f)
                    curveTo(x1 = 20.0f, y1 = 19.6642f, x2 = 19.6642f, y2 = 20.0f, x3 = 19.25f, y3 = 20.0f)
                    horizontalLineTo(x = 17.5406f)
                    lineTo(x = 16.7115f, y = 22.4872f)
                    curveTo(x1 = 16.6094f, y1 = 22.7934f, x2 = 16.3228f, y2 = 23.0f, x3 = 16.0f, y3 = 23.0f)
                    horizontalLineTo(x = 8.00001f)
                    curveTo(x1 = 7.67718f, y1 = 23.0f, x2 = 7.39058f, y2 = 22.7934f, x3 = 7.28849f, y3 = 22.4872f)
                    lineTo(x = 6.45944f, y = 20.0f)
                    horizontalLineTo(x = 4.75f)
                    curveTo(x1 = 4.33579f, y1 = 20.0f, x2 = 4.0f, y2 = 19.6642f, x3 = 4.0f, y3 = 19.25f)
                    verticalLineTo(y = 4.75f)
                    curveTo(x1 = 4.0f, y1 = 4.33579f, x2 = 4.33579f, y2 = 4.0f, x3 = 4.75f, y3 = 4.0f)
                    horizontalLineTo(x = 6.45944f)
                    lineTo(x = 7.28849f, y = 1.51283f)
                    close()
                    moveTo(x = 8.04058f, y = 4.0f)
                    horizontalLineTo(x = 15.9594f)
                    lineTo(x = 15.4594f, y = 2.5f)
                    horizontalLineTo(x = 8.54058f)
                    lineTo(x = 8.04058f, y = 4.0f)
                    close()
                    moveTo(x = 8.04058f, y = 20.0f)
                    lineTo(x = 8.54058f, y = 21.5f)
                    horizontalLineTo(x = 15.4594f)
                    lineTo(x = 15.9594f, y = 20.0f)
                    horizontalLineTo(x = 8.04058f)
                    close()
                    moveTo(x = 12.0f, y = 8.0f)
                    curveTo(x1 = 12.4142f, y1 = 8.0f, x2 = 12.75f, y2 = 8.33579f, x3 = 12.75f, y3 = 8.75f)
                    verticalLineTo(y = 11.6893f)
                    lineTo(x = 14.0303f, y = 12.9697f)
                    curveTo(x1 = 14.3232f, y1 = 13.2626f, x2 = 14.3232f, y2 = 13.7374f, x3 = 14.0303f, y3 = 14.0303f)
                    curveTo(x1 = 13.7374f, y1 = 14.3232f, x2 = 13.2626f, y2 = 14.3232f, x3 = 12.9697f, y3 = 14.0303f)
                    lineTo(x = 11.4697f, y = 12.5303f)
                    curveTo(x1 = 11.329f, y1 = 12.3897f, x2 = 11.25f, y2 = 12.1989f, x3 = 11.25f, y3 = 12.0f)
                    verticalLineTo(y = 8.75f)
                    curveTo(x1 = 11.25f, y1 = 8.33579f, x2 = 11.5858f, y2 = 8.0f, x3 = 12.0f, y3 = 8.0f)
                    close()
                }
            }.build()
            .also { _smartwatch = it }
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
                imageVector = Smartwatch,
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
private var _smartwatch: ImageVector? = null
