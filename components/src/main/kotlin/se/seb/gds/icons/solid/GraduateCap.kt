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

val GraduateCap: ImageVector
    get() {
        val current = _graduateCap
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.GraduateCap",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.3172f, y = 3.07026f)
                    curveTo(x1 = 12.1161f, y1 = 2.97658f, x2 = 11.8839f, y2 = 2.97658f, x3 = 11.6828f, y3 = 3.07026f)
                    lineTo(x = 0.432836f, y = 8.31251f)
                    curveTo(x1 = 0.16878f, y1 = 8.43555f, x2 = 0.0f, y2 = 8.70018f, x3 = 0.0f, y3 = 8.99114f)
                    curveTo(x1 = 0.0f, y1 = 9.2821f, x2 = 0.16878f, y2 = 9.54673f, x3 = 0.432836f, y3 = 9.66978f)
                    lineTo(x = 11.6828f, y = 14.912f)
                    curveTo(x1 = 11.8839f, y1 = 15.0057f, x2 = 12.1161f, y2 = 15.0057f, x3 = 12.3172f, y3 = 14.912f)
                    lineTo(x = 22.5f, y = 10.167f)
                    verticalLineTo(y = 15.2319f)
                    curveTo(x1 = 22.5f, y1 = 15.6455f, x2 = 22.8358f, y2 = 15.9808f, x3 = 23.25f, y3 = 15.9808f)
                    curveTo(x1 = 23.6642f, y1 = 15.9808f, x2 = 24.0f, y2 = 15.6455f, x3 = 24.0f, y3 = 15.2319f)
                    verticalLineTo(y = 8.99114f)
                    curveTo(x1 = 24.0f, y1 = 8.70018f, x2 = 23.8312f, y2 = 8.43555f, x3 = 23.5672f, y3 = 8.31251f)
                    lineTo(x = 12.3172f, y = 3.07026f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 4.5f, y = 12.7156f)
                    verticalLineTo(y = 16.8199f)
                    curveTo(x1 = 4.5f, y1 = 17.1016f, x2 = 4.65832f, y2 = 17.3595f, x3 = 4.90974f, y3 = 17.4873f)
                    lineTo(x = 11.6597f, y = 20.9185f)
                    curveTo(x1 = 11.8735f, y1 = 21.0272f, x2 = 12.1264f, y2 = 21.0272f, x3 = 12.3402f, y3 = 20.9185f)
                    lineTo(x = 19.0903f, y = 17.4873f)
                    curveTo(x1 = 19.3417f, y1 = 17.3595f, x2 = 19.5f, y2 = 17.1016f, x3 = 19.5f, y3 = 16.8199f)
                    verticalLineTo(y = 12.7156f)
                    lineTo(x = 12.2288f, y = 16.4523f)
                    curveTo(x1 = 12.0852f, y1 = 16.5261f, x2 = 11.9148f, y2 = 16.5261f, x3 = 11.7712f, y3 = 16.4523f)
                    lineTo(x = 4.5f, y = 12.7156f)
                    close()
                }
            }.build()
            .also { _graduateCap = it }
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
                imageVector = GraduateCap,
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
private var _graduateCap: ImageVector? = null
