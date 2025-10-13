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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val BubbleQuestion: ImageVector
    get() {
        val current = _bubbleQuestion
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BubbleQuestion",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.75f, y = 3.75f)
                verticalLineTo(y = 3.0f)
                curveTo(x1 = 3.33579f, y1 = 3.0f, x2 = 3.0f, y2 = 3.33579f, x3 = 3.0f, y3 = 3.75f)
                horizontalLineTo(x = 3.75f)
                close()
                moveTo(x = 20.25f, y = 3.75f)
                horizontalLineTo(x = 21.0f)
                curveTo(x1 = 21.0f, y1 = 3.33579f, x2 = 20.6642f, y2 = 3.0f, x3 = 20.25f, y3 = 3.0f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 20.25f, y = 18.25f)
                verticalLineTo(y = 19.0f)
                curveTo(x1 = 20.6642f, y1 = 19.0f, x2 = 21.0f, y2 = 18.6642f, x3 = 21.0f, y3 = 18.25f)
                horizontalLineTo(x = 20.25f)
                close()
                moveTo(x = 3.75f, y = 18.25f)
                horizontalLineTo(x = 3.0f)
                curveTo(x1 = 3.0f, y1 = 18.6642f, x2 = 3.33579f, y2 = 19.0f, x3 = 3.75f, y3 = 19.0f)
                verticalLineTo(y = 18.25f)
                close()
                moveTo(x = 11.9979f, y = 20.75f)
                lineTo(x = 11.5161f, y = 21.3248f)
                curveTo(x1 = 11.7936f, y1 = 21.5574f, x2 = 12.1976f, y2 = 21.5585f, x3 = 12.4764f, y3 = 21.3275f)
                lineTo(x = 11.9979f, y = 20.75f)
                close()
                moveTo(x = 15.0155f, y = 18.25f)
                verticalLineTo(y = 17.5f)
                curveTo(x1 = 14.8408f, y1 = 17.5f, x2 = 14.6716f, y2 = 17.561f, x3 = 14.537f, y3 = 17.6725f)
                lineTo(x = 15.0155f, y = 18.25f)
                close()
                moveTo(x = 9.0155f, y = 18.25f)
                lineTo(x = 9.49731f, y = 17.6752f)
                curveTo(x1 = 9.36227f, y1 = 17.562f, x2 = 9.1917f, y2 = 17.5f, x3 = 9.0155f, y3 = 17.5f)
                verticalLineTo(y = 18.25f)
                close()
                moveTo(x = 11.2804f, y = 11.8019f)
                curveTo(x1 = 11.2188f, y1 = 12.2116f, x2 = 11.501f, y2 = 12.5935f, x3 = 11.9106f, y3 = 12.655f)
                curveTo(x1 = 12.3203f, y1 = 12.7165f, x2 = 12.7022f, y2 = 12.4343f, x3 = 12.7637f, y3 = 12.0247f)
                lineTo(x = 11.2804f, y = 11.8019f)
                close()
                moveTo(x = 12.8816f, y = 10.6136f)
                lineTo(x = 13.3032f, y = 11.2339f)
                lineTo(x = 13.3032f, y = 11.2338f)
                lineTo(x = 12.8816f, y = 10.6136f)
                close()
                moveTo(x = 9.87366f, y = 9.42768f)
                curveTo(x1 = 9.87366f, y1 = 9.8419f, x2 = 10.2094f, y2 = 10.1777f, x3 = 10.6237f, y3 = 10.1777f)
                curveTo(x1 = 11.0379f, y1 = 10.1777f, x2 = 11.3737f, y2 = 9.8419f, x3 = 11.3737f, y3 = 9.42768f)
                horizontalLineTo(x = 9.87366f)
                close()
                moveTo(x = 3.75f, y = 4.5f)
                horizontalLineTo(x = 20.25f)
                verticalLineTo(y = 3.0f)
                horizontalLineTo(x = 3.75f)
                verticalLineTo(y = 4.5f)
                close()
                moveTo(x = 19.5f, y = 3.75f)
                verticalLineTo(y = 18.25f)
                horizontalLineTo(x = 21.0f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 19.5f)
                close()
                moveTo(x = 4.5f, y = 18.25f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 3.0f)
                verticalLineTo(y = 18.25f)
                horizontalLineTo(x = 4.5f)
                close()
                moveTo(x = 20.25f, y = 17.5f)
                horizontalLineTo(x = 15.0155f)
                verticalLineTo(y = 19.0f)
                horizontalLineTo(x = 20.25f)
                verticalLineTo(y = 17.5f)
                close()
                moveTo(x = 14.537f, y = 17.6725f)
                lineTo(x = 11.5194f, y = 20.1725f)
                lineTo(x = 12.4764f, y = 21.3275f)
                lineTo(x = 15.494f, y = 18.8275f)
                lineTo(x = 14.537f, y = 17.6725f)
                close()
                moveTo(x = 12.4797f, y = 20.1752f)
                lineTo(x = 9.49731f, y = 17.6752f)
                lineTo(x = 8.5337f, y = 18.8248f)
                lineTo(x = 11.5161f, y = 21.3248f)
                lineTo(x = 12.4797f, y = 20.1752f)
                close()
                moveTo(x = 9.0155f, y = 17.5f)
                horizontalLineTo(x = 3.75f)
                verticalLineTo(y = 19.0f)
                horizontalLineTo(x = 9.0155f)
                verticalLineTo(y = 17.5f)
                close()
                moveTo(x = 12.7637f, y = 12.0247f)
                curveTo(x1 = 12.796f, y1 = 11.8096f, x2 = 12.8675f, y2 = 11.6643f, x3 = 12.9495f, y3 = 11.5539f)
                curveTo(x1 = 13.0361f, y1 = 11.4375f, x2 = 13.1522f, y2 = 11.3365f, x3 = 13.3032f, y3 = 11.2339f)
                lineTo(x = 12.46f, y = 9.99327f)
                curveTo(x1 = 11.9841f, y1 = 10.3167f, x2 = 11.4245f, y2 = 10.842f, x3 = 11.2804f, y3 = 11.8019f)
                lineTo(x = 12.7637f, y = 12.0247f)
                close()
                moveTo(x = 13.3032f, y = 11.2338f)
                curveTo(x1 = 13.7232f, y1 = 10.9483f, x2 = 14.3737f, y2 = 10.4252f, x3 = 14.3737f, y3 = 9.42768f)
                horizontalLineTo(x = 12.8737f)
                curveTo(x1 = 12.8737f, y1 = 9.56123f, x2 = 12.8379f, y2 = 9.6406f, x3 = 12.7876f, y3 = 9.70897f)
                curveTo(x1 = 12.7249f, y1 = 9.79415f, x2 = 12.6241f, y2 = 9.88168f, x3 = 12.4599f, y3 = 9.99332f)
                lineTo(x = 13.3032f, y = 11.2338f)
                close()
                moveTo(x = 14.3737f, y = 9.42768f)
                curveTo(x1 = 14.3737f, y1 = 8.18351f, x2 = 13.3734f, y2 = 7.16333f, x3 = 12.1237f, y3 = 7.16333f)
                verticalLineTo(y = 8.66333f)
                curveTo(x1 = 12.5315f, y1 = 8.66333f, x2 = 12.8737f, y2 = 8.99844f, x3 = 12.8737f, y3 = 9.42768f)
                horizontalLineTo(x = 14.3737f)
                close()
                moveTo(x = 12.1237f, y = 7.16333f)
                curveTo(x1 = 10.874f, y1 = 7.16333f, x2 = 9.87366f, y2 = 8.18351f, x3 = 9.87366f, y3 = 9.42768f)
                horizontalLineTo(x = 11.3737f)
                curveTo(x1 = 11.3737f, y1 = 8.99844f, x2 = 11.7158f, y2 = 8.66333f, x3 = 12.1237f, y3 = 8.66333f)
                verticalLineTo(y = 7.16333f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.5f,
            ) {
                moveTo(x = 11.25f, y = 14.25f)
                curveTo(x1 = 11.25f, y1 = 14.6642f, x2 = 11.5858f, y2 = 15.0f, x3 = 12.0f, y3 = 15.0f)
                curveTo(x1 = 12.4142f, y1 = 15.0f, x2 = 12.75f, y2 = 14.6642f, x3 = 12.75f, y3 = 14.25f)
                curveTo(x1 = 12.75f, y1 = 13.8358f, x2 = 12.4142f, y2 = 13.5f, x3 = 12.0f, y3 = 13.5f)
                curveTo(x1 = 11.5858f, y1 = 13.5f, x2 = 11.25f, y2 = 13.8358f, x3 = 11.25f, y3 = 14.25f)
                close()
            }
        }.build().also { _bubbleQuestion = it }
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
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bubbleQuestion: ImageVector? = null
