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

val BubbleAnnotation: ImageVector
    get() {
        val current = _bubbleAnnotation
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BubbleAnnotation",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 22.0022f, y = 3.75f)
                    curveTo(x1 = 22.0022f, y1 = 3.33579f, x2 = 21.6664f, y2 = 3.0f, x3 = 21.2522f, y3 = 3.0f)
                    horizontalLineTo(x = 2.7522f)
                    curveTo(x1 = 2.33798f, y1 = 3.0f, x2 = 2.0022f, y2 = 3.33579f, x3 = 2.0022f, y3 = 3.75f)
                    verticalLineTo(y = 18.25f)
                    curveTo(x1 = 2.0022f, y1 = 18.6642f, x2 = 2.33798f, y2 = 19.0f, x3 = 2.7522f, y3 = 19.0f)
                    horizontalLineTo(x = 6.2522f)
                    verticalLineTo(y = 21.0f)
                    curveTo(x1 = 6.2522f, y1 = 21.2652f, x2 = 6.39222f, y2 = 21.5106f, x3 = 6.62048f, y3 = 21.6456f)
                    curveTo(x1 = 6.84873f, y1 = 21.7806f, x2 = 7.13129f, y2 = 21.785f, x3 = 7.36364f, y3 = 21.6572f)
                    lineTo(x = 12.1948f, y = 19.0f)
                    horizontalLineTo(x = 21.2522f)
                    curveTo(x1 = 21.6664f, y1 = 19.0f, x2 = 22.0022f, y2 = 18.6642f, x3 = 22.0022f, y3 = 18.25f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 6.5f, y = 11.0f)
                    curveTo(x1 = 6.5f, y1 = 11.5523f, x2 = 6.94772f, y2 = 12.0f, x3 = 7.5f, y3 = 12.0f)
                    curveTo(x1 = 8.05228f, y1 = 12.0f, x2 = 8.5f, y2 = 11.5523f, x3 = 8.5f, y3 = 11.0f)
                    curveTo(x1 = 8.5f, y1 = 10.4477f, x2 = 8.05228f, y2 = 10.0f, x3 = 7.5f, y3 = 10.0f)
                    curveTo(x1 = 6.94772f, y1 = 10.0f, x2 = 6.5f, y2 = 10.4477f, x3 = 6.5f, y3 = 11.0f)
                    close()
                    moveTo(x = 11.0f, y = 11.0f)
                    curveTo(x1 = 11.0f, y1 = 11.5523f, x2 = 11.4477f, y2 = 12.0f, x3 = 12.0f, y3 = 12.0f)
                    curveTo(x1 = 12.5523f, y1 = 12.0f, x2 = 13.0f, y2 = 11.5523f, x3 = 13.0f, y3 = 11.0f)
                    curveTo(x1 = 13.0f, y1 = 10.4477f, x2 = 12.5523f, y2 = 10.0f, x3 = 12.0f, y3 = 10.0f)
                    curveTo(x1 = 11.4477f, y1 = 10.0f, x2 = 11.0f, y2 = 10.4477f, x3 = 11.0f, y3 = 11.0f)
                    close()
                    moveTo(x = 16.5f, y = 12.0f)
                    curveTo(x1 = 15.9477f, y1 = 12.0f, x2 = 15.5f, y2 = 11.5523f, x3 = 15.5f, y3 = 11.0f)
                    curveTo(x1 = 15.5f, y1 = 10.4477f, x2 = 15.9477f, y2 = 10.0f, x3 = 16.5f, y3 = 10.0f)
                    curveTo(x1 = 17.0523f, y1 = 10.0f, x2 = 17.5f, y2 = 10.4477f, x3 = 17.5f, y3 = 11.0f)
                    curveTo(x1 = 17.5f, y1 = 11.5523f, x2 = 17.0523f, y2 = 12.0f, x3 = 16.5f, y3 = 12.0f)
                    close()
                }
            }.build()
            .also { _bubbleAnnotation = it }
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
                imageVector = BubbleAnnotation,
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
private var _bubbleAnnotation: ImageVector? = null
