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

val ArrowOutOfBox: ImageVector
    get() {
        val current = _arrowOutOfBox
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowOutOfBox",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 12.0f, y = 3.0f)
                    curveTo(
                        x1 = 12.1989f,
                        y1 = 3.0f,
                        x2 = 12.3897f,
                        y2 = 3.07902f,
                        x3 = 12.5303f,
                        y3 = 3.21967f,
                    )
                    lineTo(x = 17.0303f, y = 7.71967f)
                    curveTo(
                        x1 = 17.3232f,
                        y1 = 8.01256f,
                        x2 = 17.3232f,
                        y2 = 8.48744f,
                        x3 = 17.0303f,
                        y3 = 8.78033f,
                    )
                    curveTo(
                        x1 = 16.7374f,
                        y1 = 9.07322f,
                        x2 = 16.2626f,
                        y2 = 9.07322f,
                        x3 = 15.9697f,
                        y3 = 8.78033f,
                    )
                    lineTo(x = 12.75f, y = 5.56066f)
                    verticalLineTo(y = 15.0f)
                    curveTo(
                        x1 = 12.75f,
                        y1 = 15.4142f,
                        x2 = 12.4142f,
                        y2 = 15.75f,
                        x3 = 12.0f,
                        y3 = 15.75f,
                    )
                    curveTo(
                        x1 = 11.5858f,
                        y1 = 15.75f,
                        x2 = 11.25f,
                        y2 = 15.4142f,
                        x3 = 11.25f,
                        y3 = 15.0f,
                    )
                    verticalLineTo(y = 5.56066f)
                    lineTo(x = 8.03033f, y = 8.78033f)
                    curveTo(
                        x1 = 7.73744f,
                        y1 = 9.07322f,
                        x2 = 7.26256f,
                        y2 = 9.07322f,
                        x3 = 6.96967f,
                        y3 = 8.78033f,
                    )
                    curveTo(
                        x1 = 6.67678f,
                        y1 = 8.48744f,
                        x2 = 6.67678f,
                        y2 = 8.01256f,
                        x3 = 6.96967f,
                        y3 = 7.71967f,
                    )
                    lineTo(x = 11.4697f, y = 3.21967f)
                    curveTo(
                        x1 = 11.6103f,
                        y1 = 3.07902f,
                        x2 = 11.8011f,
                        y2 = 3.0f,
                        x3 = 12.0f,
                        y3 = 3.0f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 3.75f, y = 12.0f)
                    curveTo(
                        x1 = 4.16421f,
                        y1 = 12.0f,
                        x2 = 4.5f,
                        y2 = 12.3358f,
                        x3 = 4.5f,
                        y3 = 12.75f,
                    )
                    verticalLineTo(y = 19.5f)
                    horizontalLineTo(x = 19.5f)
                    verticalLineTo(y = 12.75f)
                    curveTo(
                        x1 = 19.5f,
                        y1 = 12.3358f,
                        x2 = 19.8358f,
                        y2 = 12.0f,
                        x3 = 20.25f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 20.6642f,
                        y1 = 12.0f,
                        x2 = 21.0f,
                        y2 = 12.3358f,
                        x3 = 21.0f,
                        y3 = 12.75f,
                    )
                    verticalLineTo(y = 20.25f)
                    curveTo(
                        x1 = 21.0f,
                        y1 = 20.6642f,
                        x2 = 20.6642f,
                        y2 = 21.0f,
                        x3 = 20.25f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 3.75f)
                    curveTo(
                        x1 = 3.33579f,
                        y1 = 21.0f,
                        x2 = 3.0f,
                        y2 = 20.6642f,
                        x3 = 3.0f,
                        y3 = 20.25f,
                    )
                    verticalLineTo(y = 12.75f)
                    curveTo(
                        x1 = 3.0f,
                        y1 = 12.3358f,
                        x2 = 3.33579f,
                        y2 = 12.0f,
                        x3 = 3.75f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _arrowOutOfBox = it }
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
                imageVector = ArrowOutOfBox,
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
private var _arrowOutOfBox: ImageVector? = null
