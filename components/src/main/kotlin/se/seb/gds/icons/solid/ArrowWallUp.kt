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

internal val ArrowWallUp: ImageVector
    get() {
        val current = _arrowWallUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowWallUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 4.0f, y = 2.75f)
                curveTo(x1 = 4.0f, y1 = 2.33579f, x2 = 4.33579f, y2 = 2.0f, x3 = 4.75f, y3 = 2.0f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.6642f, y1 = 2.0f, x2 = 20.0f, y2 = 2.33579f, x3 = 20.0f, y3 = 2.75f)
                curveTo(x1 = 20.0f, y1 = 3.16421f, x2 = 19.6642f, y2 = 3.5f, x3 = 19.25f, y3 = 3.5f)
                horizontalLineTo(x = 4.75f)
                curveTo(x1 = 4.33579f, y1 = 3.5f, x2 = 4.0f, y2 = 3.16421f, x3 = 4.0f, y3 = 2.75f)
                close()
                moveTo(x = 12.0f, y = 6.0f)
                curveTo(x1 = 12.1989f, y1 = 6.0f, x2 = 12.3897f, y2 = 6.07902f, x3 = 12.5303f, y3 = 6.21967f)
                lineTo(x = 16.7803f, y = 10.4697f)
                curveTo(x1 = 17.0732f, y1 = 10.7626f, x2 = 17.0732f, y2 = 11.2374f, x3 = 16.7803f, y3 = 11.5303f)
                curveTo(x1 = 16.4874f, y1 = 11.8232f, x2 = 16.0126f, y2 = 11.8232f, x3 = 15.7197f, y3 = 11.5303f)
                lineTo(x = 12.75f, y = 8.56067f)
                verticalLineTo(y = 21.25f)
                curveTo(x1 = 12.75f, y1 = 21.6642f, x2 = 12.4142f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 11.5858f, y1 = 22.0f, x2 = 11.25f, y2 = 21.6642f, x3 = 11.25f, y3 = 21.25f)
                verticalLineTo(y = 8.56065f)
                lineTo(x = 8.28033f, y = 11.5303f)
                curveTo(x1 = 7.98743f, y1 = 11.8232f, x2 = 7.51256f, y2 = 11.8232f, x3 = 7.21967f, y3 = 11.5303f)
                curveTo(x1 = 6.92678f, y1 = 11.2374f, x2 = 6.92678f, y2 = 10.7626f, x3 = 7.21967f, y3 = 10.4697f)
                lineTo(x = 11.4697f, y = 6.21967f)
                curveTo(x1 = 11.6103f, y1 = 6.07902f, x2 = 11.8011f, y2 = 6.0f, x3 = 12.0f, y3 = 6.0f)
                close()
            }
        }.build().also { _arrowWallUp = it }
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
                imageVector = ArrowWallUp,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowWallUp: ImageVector? = null
