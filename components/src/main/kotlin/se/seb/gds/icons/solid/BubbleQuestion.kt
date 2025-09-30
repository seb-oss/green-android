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

val BubbleQuestion: ImageVector
    get() {
        val current = _bubbleQuestion
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BubbleQuestion",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 3.0f, y = 3.75f)
                    curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                    horizontalLineTo(x = 20.25f)
                    curveTo(x1 = 20.6642f, y1 = 3.0f, x2 = 21.0f, y2 = 3.33579f, x3 = 21.0f, y3 = 3.75f)
                    verticalLineTo(y = 18.25f)
                    curveTo(x1 = 21.0f, y1 = 18.6642f, x2 = 20.6642f, y2 = 19.0f, x3 = 20.25f, y3 = 19.0f)
                    horizontalLineTo(x = 15.2858f)
                    lineTo(x = 12.4764f, y = 21.3275f)
                    curveTo(x1 = 12.1976f, y1 = 21.5585f, x2 = 11.7936f, y2 = 21.5574f, x3 = 11.5161f, y3 = 21.3248f)
                    lineTo(x = 8.74274f, y = 19.0f)
                    horizontalLineTo(x = 3.75f)
                    curveTo(x1 = 3.33579f, y1 = 19.0f, x2 = 3.0f, y2 = 18.6642f, x3 = 3.0f, y3 = 18.25f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 9.87366f, y = 9.42768f)
                    curveTo(x1 = 9.87366f, y1 = 8.18351f, x2 = 10.874f, y2 = 7.16333f, x3 = 12.1237f, y3 = 7.16333f)
                    curveTo(x1 = 13.3734f, y1 = 7.16333f, x2 = 14.3737f, y2 = 8.18351f, x3 = 14.3737f, y3 = 9.42768f)
                    curveTo(x1 = 14.3737f, y1 = 10.4252f, x2 = 13.7232f, y2 = 10.9483f, x3 = 13.3032f, y3 = 11.2338f)
                    curveTo(x1 = 13.1522f, y1 = 11.3364f, x2 = 13.0361f, y2 = 11.4375f, x3 = 12.9495f, y3 = 11.5539f)
                    curveTo(x1 = 12.8674f, y1 = 11.6643f, x2 = 12.796f, y2 = 11.8096f, x3 = 12.7637f, y3 = 12.0247f)
                    curveTo(x1 = 12.7022f, y1 = 12.4343f, x2 = 12.3203f, y2 = 12.7165f, x3 = 11.9106f, y3 = 12.655f)
                    curveTo(x1 = 11.501f, y1 = 12.5935f, x2 = 11.2188f, y2 = 12.2116f, x3 = 11.2804f, y3 = 11.8019f)
                    curveTo(x1 = 11.4245f, y1 = 10.8421f, x2 = 11.984f, y2 = 10.3168f, x3 = 12.4599f, y3 = 9.99332f)
                    curveTo(x1 = 12.6241f, y1 = 9.8817f, x2 = 12.7249f, y2 = 9.79414f, x3 = 12.7876f, y3 = 9.70897f)
                    curveTo(x1 = 12.8379f, y1 = 9.6406f, x2 = 12.8737f, y2 = 9.56123f, x3 = 12.8737f, y3 = 9.42768f)
                    curveTo(x1 = 12.8737f, y1 = 8.99844f, x2 = 12.5315f, y2 = 8.66333f, x3 = 12.1237f, y3 = 8.66333f)
                    curveTo(x1 = 11.7158f, y1 = 8.66333f, x2 = 11.3737f, y2 = 8.99844f, x3 = 11.3737f, y3 = 9.42768f)
                    curveTo(x1 = 11.3737f, y1 = 9.8419f, x2 = 11.0379f, y2 = 10.1777f, x3 = 10.6237f, y3 = 10.1777f)
                    curveTo(x1 = 10.2094f, y1 = 10.1777f, x2 = 9.87366f, y2 = 9.8419f, x3 = 9.87366f, y3 = 9.42768f)
                    close()
                    moveTo(x = 12.0f, y = 15.25f)
                    curveTo(x1 = 11.4477f, y1 = 15.25f, x2 = 11.0f, y2 = 14.8023f, x3 = 11.0f, y3 = 14.25f)
                    curveTo(x1 = 11.0f, y1 = 13.6977f, x2 = 11.4477f, y2 = 13.25f, x3 = 12.0f, y3 = 13.25f)
                    curveTo(x1 = 12.5523f, y1 = 13.25f, x2 = 13.0f, y2 = 13.6977f, x3 = 13.0f, y3 = 14.25f)
                    curveTo(x1 = 13.0f, y1 = 14.8023f, x2 = 12.5523f, y2 = 15.25f, x3 = 12.0f, y3 = 15.25f)
                    close()
                }
            }.build()
            .also { _bubbleQuestion = it }
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
                imageVector = BubbleQuestion,
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
private var _bubbleQuestion: ImageVector? = null
