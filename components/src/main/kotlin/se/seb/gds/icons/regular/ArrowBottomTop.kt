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

val ArrowBottomTop: ImageVector
    get() {
        val current = _arrowBottomTop
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowBottomTop",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 7.25f, y = 3.0f)
                    curveTo(
                        x1 = 7.66421f,
                        y1 = 3.0f,
                        x2 = 8.0f,
                        y2 = 3.33579f,
                        x3 = 8.0f,
                        y3 = 3.75f,
                    )
                    verticalLineTo(y = 18.4393f)
                    lineTo(x = 10.7197f, y = 15.7197f)
                    curveTo(
                        x1 = 11.0126f,
                        y1 = 15.4268f,
                        x2 = 11.4874f,
                        y2 = 15.4268f,
                        x3 = 11.7803f,
                        y3 = 15.7197f,
                    )
                    curveTo(
                        x1 = 12.0732f,
                        y1 = 16.0126f,
                        x2 = 12.0732f,
                        y2 = 16.4874f,
                        x3 = 11.7803f,
                        y3 = 16.7803f,
                    )
                    lineTo(x = 7.78033f, y = 20.7803f)
                    curveTo(
                        x1 = 7.48744f,
                        y1 = 21.0732f,
                        x2 = 7.01256f,
                        y2 = 21.0732f,
                        x3 = 6.71967f,
                        y3 = 20.7803f,
                    )
                    lineTo(x = 2.71967f, y = 16.7803f)
                    curveTo(
                        x1 = 2.42678f,
                        y1 = 16.4874f,
                        x2 = 2.42678f,
                        y2 = 16.0126f,
                        x3 = 2.71967f,
                        y3 = 15.7197f,
                    )
                    curveTo(
                        x1 = 3.01256f,
                        y1 = 15.4268f,
                        x2 = 3.48744f,
                        y2 = 15.4268f,
                        x3 = 3.78033f,
                        y3 = 15.7197f,
                    )
                    lineTo(x = 6.5f, y = 18.4393f)
                    verticalLineTo(y = 3.75f)
                    curveTo(
                        x1 = 6.5f,
                        y1 = 3.33579f,
                        x2 = 6.83579f,
                        y2 = 3.0f,
                        x3 = 7.25f,
                        y3 = 3.0f,
                    )
                    close()
                    moveTo(x = 16.2197f, y = 3.21967f)
                    curveTo(
                        x1 = 16.5126f,
                        y1 = 2.92678f,
                        x2 = 16.9874f,
                        y2 = 2.92678f,
                        x3 = 17.2803f,
                        y3 = 3.21967f,
                    )
                    lineTo(x = 21.2803f, y = 7.21967f)
                    curveTo(
                        x1 = 21.5732f,
                        y1 = 7.51256f,
                        x2 = 21.5732f,
                        y2 = 7.98744f,
                        x3 = 21.2803f,
                        y3 = 8.28033f,
                    )
                    curveTo(
                        x1 = 20.9874f,
                        y1 = 8.57322f,
                        x2 = 20.5126f,
                        y2 = 8.57322f,
                        x3 = 20.2197f,
                        y3 = 8.28033f,
                    )
                    lineTo(x = 17.5f, y = 5.56066f)
                    verticalLineTo(y = 20.25f)
                    curveTo(
                        x1 = 17.5f,
                        y1 = 20.6642f,
                        x2 = 17.1642f,
                        y2 = 21.0f,
                        x3 = 16.75f,
                        y3 = 21.0f,
                    )
                    curveTo(
                        x1 = 16.3358f,
                        y1 = 21.0f,
                        x2 = 16.0f,
                        y2 = 20.6642f,
                        x3 = 16.0f,
                        y3 = 20.25f,
                    )
                    verticalLineTo(y = 5.56066f)
                    lineTo(x = 13.2803f, y = 8.28033f)
                    curveTo(
                        x1 = 12.9874f,
                        y1 = 8.57322f,
                        x2 = 12.5126f,
                        y2 = 8.57322f,
                        x3 = 12.2197f,
                        y3 = 8.28033f,
                    )
                    curveTo(
                        x1 = 11.9268f,
                        y1 = 7.98744f,
                        x2 = 11.9268f,
                        y2 = 7.51256f,
                        x3 = 12.2197f,
                        y3 = 7.21967f,
                    )
                    lineTo(x = 16.2197f, y = 3.21967f)
                    close()
                }
            }.build()
            .also { _arrowBottomTop = it }
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
                imageVector = ArrowBottomTop,
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
private var _arrowBottomTop: ImageVector? = null
