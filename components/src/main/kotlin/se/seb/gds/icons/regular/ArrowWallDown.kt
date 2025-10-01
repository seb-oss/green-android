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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val ArrowWallDown: ImageVector
    get() {
        val current = _arrowWallDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowWallDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 12.4142f, y1 = 2.0f, x2 = 12.75f, y2 = 2.33579f, x3 = 12.75f, y3 = 2.75f)
                verticalLineTo(y = 15.4393f)
                lineTo(x = 15.7197f, y = 12.4697f)
                curveTo(x1 = 16.0126f, y1 = 12.1768f, x2 = 16.4874f, y2 = 12.1768f, x3 = 16.7803f, y3 = 12.4697f)
                curveTo(x1 = 17.0732f, y1 = 12.7626f, x2 = 17.0732f, y2 = 13.2374f, x3 = 16.7803f, y3 = 13.5303f)
                lineTo(x = 12.5303f, y = 17.7803f)
                curveTo(x1 = 12.3897f, y1 = 17.921f, x2 = 12.1989f, y2 = 18.0f, x3 = 12.0f, y3 = 18.0f)
                curveTo(x1 = 11.8011f, y1 = 18.0f, x2 = 11.6103f, y2 = 17.921f, x3 = 11.4697f, y3 = 17.7803f)
                lineTo(x = 7.21967f, y = 13.5303f)
                curveTo(x1 = 6.92678f, y1 = 13.2374f, x2 = 6.92678f, y2 = 12.7626f, x3 = 7.21967f, y3 = 12.4697f)
                curveTo(x1 = 7.51256f, y1 = 12.1768f, x2 = 7.98743f, y2 = 12.1768f, x3 = 8.28033f, y3 = 12.4697f)
                lineTo(x = 11.25f, y = 15.4393f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 11.25f, y1 = 2.33579f, x2 = 11.5858f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                close()
                moveTo(x = 4.0f, y = 21.25f)
                curveTo(x1 = 4.0f, y1 = 20.8358f, x2 = 4.33579f, y2 = 20.5f, x3 = 4.75f, y3 = 20.5f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.6642f, y1 = 20.5f, x2 = 20.0f, y2 = 20.8358f, x3 = 20.0f, y3 = 21.25f)
                curveTo(x1 = 20.0f, y1 = 21.6642f, x2 = 19.6642f, y2 = 22.0f, x3 = 19.25f, y3 = 22.0f)
                horizontalLineTo(x = 4.75f)
                curveTo(x1 = 4.33579f, y1 = 22.0f, x2 = 4.0f, y2 = 21.6642f, x3 = 4.0f, y3 = 21.25f)
                close()
            }
        }.build().also { _arrowWallDown = it }
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
                imageVector = ArrowWallDown,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowWallDown: ImageVector? = null
