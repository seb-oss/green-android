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

val BubbleText: ImageVector
    get() {
        val current = _bubbleText
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BubbleText",
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
                moveTo(x = 8.75f, y = 8.25f)
                curveTo(x1 = 8.33579f, y1 = 8.25f, x2 = 8.0f, y2 = 8.58579f, x3 = 8.0f, y3 = 9.0f)
                curveTo(x1 = 8.0f, y1 = 9.41421f, x2 = 8.33579f, y2 = 9.75f, x3 = 8.75f, y3 = 9.75f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 15.6642f, y1 = 9.75f, x2 = 16.0f, y2 = 9.41421f, x3 = 16.0f, y3 = 9.0f)
                curveTo(x1 = 16.0f, y1 = 8.58579f, x2 = 15.6642f, y2 = 8.25f, x3 = 15.25f, y3 = 8.25f)
                horizontalLineTo(x = 8.75f)
                close()
                moveTo(x = 8.75f, y = 12.25f)
                curveTo(x1 = 8.33579f, y1 = 12.25f, x2 = 8.0f, y2 = 12.5858f, x3 = 8.0f, y3 = 13.0f)
                curveTo(x1 = 8.0f, y1 = 13.4142f, x2 = 8.33579f, y2 = 13.75f, x3 = 8.75f, y3 = 13.75f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 15.6642f, y1 = 13.75f, x2 = 16.0f, y2 = 13.4142f, x3 = 16.0f, y3 = 13.0f)
                curveTo(x1 = 16.0f, y1 = 12.5858f, x2 = 15.6642f, y2 = 12.25f, x3 = 15.25f, y3 = 12.25f)
                horizontalLineTo(x = 8.75f)
                close()
            }
        }.build().also { _bubbleText = it }
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
                imageVector = BubbleText,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bubbleText: ImageVector? = null
