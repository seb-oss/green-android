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

val ArrowWallLeft: ImageVector
    get() {
        val current = _arrowWallLeft
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowWallLeft",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.75f, y = 4.0f)
                    curveTo(
                        x1 = 3.16421f,
                        y1 = 4.0f,
                        x2 = 3.5f,
                        y2 = 4.33579f,
                        x3 = 3.5f,
                        y3 = 4.75f,
                    )
                    verticalLineTo(y = 19.25f)
                    curveTo(
                        x1 = 3.5f,
                        y1 = 19.6642f,
                        x2 = 3.16421f,
                        y2 = 20.0f,
                        x3 = 2.75f,
                        y3 = 20.0f,
                    )
                    curveTo(
                        x1 = 2.33579f,
                        y1 = 20.0f,
                        x2 = 2.0f,
                        y2 = 19.6642f,
                        x3 = 2.0f,
                        y3 = 19.25f,
                    )
                    verticalLineTo(y = 4.75f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 4.33579f,
                        x2 = 2.33579f,
                        y2 = 4.0f,
                        x3 = 2.75f,
                        y3 = 4.0f,
                    )
                    close()
                    moveTo(x = 11.5303f, y = 7.21967f)
                    curveTo(
                        x1 = 11.8232f,
                        y1 = 7.51256f,
                        x2 = 11.8232f,
                        y2 = 7.98744f,
                        x3 = 11.5303f,
                        y3 = 8.28033f,
                    )
                    lineTo(x = 8.56067f, y = 11.25f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(
                        x1 = 21.6642f,
                        y1 = 11.25f,
                        x2 = 22.0f,
                        y2 = 11.5858f,
                        x3 = 22.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 12.4142f,
                        x2 = 21.6642f,
                        y2 = 12.75f,
                        x3 = 21.25f,
                        y3 = 12.75f,
                    )
                    horizontalLineTo(x = 8.56065f)
                    lineTo(x = 11.5303f, y = 15.7197f)
                    curveTo(
                        x1 = 11.8232f,
                        y1 = 16.0126f,
                        x2 = 11.8232f,
                        y2 = 16.4874f,
                        x3 = 11.5303f,
                        y3 = 16.7803f,
                    )
                    curveTo(
                        x1 = 11.2374f,
                        y1 = 17.0732f,
                        x2 = 10.7626f,
                        y2 = 17.0732f,
                        x3 = 10.4697f,
                        y3 = 16.7803f,
                    )
                    lineTo(x = 6.21967f, y = 12.5303f)
                    curveTo(
                        x1 = 6.07902f,
                        y1 = 12.3897f,
                        x2 = 6.0f,
                        y2 = 12.1989f,
                        x3 = 6.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 6.0f,
                        y1 = 11.8011f,
                        x2 = 6.07902f,
                        y2 = 11.6103f,
                        x3 = 6.21967f,
                        y3 = 11.4697f,
                    )
                    lineTo(x = 10.4697f, y = 7.21967f)
                    curveTo(
                        x1 = 10.7626f,
                        y1 = 6.92678f,
                        x2 = 11.2374f,
                        y2 = 6.92678f,
                        x3 = 11.5303f,
                        y3 = 7.21967f,
                    )
                    close()
                }
            }.build()
            .also { _arrowWallLeft = it }
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
                imageVector = ArrowWallLeft,
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
private var _arrowWallLeft: ImageVector? = null
