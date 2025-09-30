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

val ArrowBoxLeft: ImageVector
    get() {
        val current = _arrowBoxLeft
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowBoxLeft",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 3.21967f, y = 3.21967f)
                    curveTo(x1 = 3.36032f, y1 = 3.07902f, x2 = 3.55109f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                    lineTo(x = 11.25f, y = 3.0f)
                    curveTo(x1 = 11.6642f, y1 = 3.0f, x2 = 12.0f, y2 = 3.33579f, x3 = 12.0f, y3 = 3.75f)
                    curveTo(x1 = 12.0f, y1 = 4.16421f, x2 = 11.6642f, y2 = 4.5f, x3 = 11.25f, y3 = 4.5f)
                    lineTo(x = 4.5f, y = 4.5f)
                    lineTo(x = 4.5f, y = 19.5f)
                    horizontalLineTo(x = 11.25f)
                    curveTo(x1 = 11.6642f, y1 = 19.5f, x2 = 12.0f, y2 = 19.8358f, x3 = 12.0f, y3 = 20.25f)
                    curveTo(x1 = 12.0f, y1 = 20.6642f, x2 = 11.6642f, y2 = 21.0f, x3 = 11.25f, y3 = 21.0f)
                    horizontalLineTo(x = 3.75f)
                    curveTo(x1 = 3.55109f, y1 = 21.0f, x2 = 3.36032f, y2 = 20.921f, x3 = 3.21967f, y3 = 20.7803f)
                    curveTo(x1 = 3.07902f, y1 = 20.6397f, x2 = 3.0f, y2 = 20.4489f, x3 = 3.0f, y3 = 20.25f)
                    lineTo(x = 3.0f, y = 3.75f)
                    curveTo(x1 = 3.0f, y1 = 3.55109f, x2 = 3.07902f, y2 = 3.36032f, x3 = 3.21967f, y3 = 3.21967f)
                    close()
                    moveTo(x = 15.2197f, y = 6.96967f)
                    curveTo(x1 = 15.5126f, y1 = 6.67678f, x2 = 15.9874f, y2 = 6.67678f, x3 = 16.2803f, y3 = 6.96967f)
                    lineTo(x = 20.7803f, y = 11.4697f)
                    curveTo(x1 = 21.0732f, y1 = 11.7626f, x2 = 21.0732f, y2 = 12.2374f, x3 = 20.7803f, y3 = 12.5303f)
                    lineTo(x = 16.2803f, y = 17.0303f)
                    curveTo(x1 = 15.9874f, y1 = 17.3232f, x2 = 15.5126f, y2 = 17.3232f, x3 = 15.2197f, y3 = 17.0303f)
                    curveTo(x1 = 14.9268f, y1 = 16.7374f, x2 = 14.9268f, y2 = 16.2626f, x3 = 15.2197f, y3 = 15.9697f)
                    lineTo(x = 18.4393f, y = 12.75f)
                    lineTo(x = 9.0f, y = 12.75f)
                    curveTo(x1 = 8.58579f, y1 = 12.75f, x2 = 8.25f, y2 = 12.4142f, x3 = 8.25f, y3 = 12.0f)
                    curveTo(x1 = 8.25f, y1 = 11.5858f, x2 = 8.58579f, y2 = 11.25f, x3 = 9.0f, y3 = 11.25f)
                    lineTo(x = 18.4393f, y = 11.25f)
                    lineTo(x = 15.2197f, y = 8.03033f)
                    curveTo(x1 = 14.9268f, y1 = 7.73744f, x2 = 14.9268f, y2 = 7.26256f, x3 = 15.2197f, y3 = 6.96967f)
                    close()
                }
            }.build()
            .also { _arrowBoxLeft = it }
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
                imageVector = ArrowBoxLeft,
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
private var _arrowBoxLeft: ImageVector? = null
