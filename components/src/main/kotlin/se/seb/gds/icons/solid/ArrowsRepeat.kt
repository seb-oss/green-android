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

val ArrowsRepeat: ImageVector
    get() {
        val current = _arrowsRepeat
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowsRepeat",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.1062f, y = 1.22905f)
                curveTo(x1 = 12.3939f, y1 = 0.931069f, x2 = 12.8687f, y2 = 0.922739f, x3 = 13.1667f, y3 = 1.21045f)
                lineTo(x = 16.2738f, y = 4.21045f)
                curveTo(x1 = 16.4202f, y1 = 4.35178f, x2 = 16.5029f, y2 = 4.54653f, x3 = 16.5029f, y3 = 4.75f)
                curveTo(x1 = 16.5029f, y1 = 4.95348f, x2 = 16.4202f, y2 = 5.14822f, x3 = 16.2738f, y3 = 5.28955f)
                lineTo(x = 13.1667f, y = 8.28955f)
                curveTo(x1 = 12.8687f, y1 = 8.57726f, x2 = 12.3939f, y2 = 8.56893f, x3 = 12.1062f, y3 = 8.27095f)
                curveTo(x1 = 11.8185f, y1 = 7.97296f, x2 = 11.8268f, y2 = 7.49816f, x3 = 12.1248f, y3 = 7.21045f)
                lineTo(x = 13.8963f, y = 5.5f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 13.25f)
                curveTo(x1 = 4.5f, y1 = 13.6642f, x2 = 4.16421f, y2 = 14.0f, x3 = 3.75f, y3 = 14.0f)
                curveTo(x1 = 3.33579f, y1 = 14.0f, x2 = 3.0f, y2 = 13.6642f, x3 = 3.0f, y3 = 13.25f)
                verticalLineTo(y = 4.75f)
                curveTo(x1 = 3.0f, y1 = 4.33579f, x2 = 3.33579f, y2 = 4.0f, x3 = 3.75f, y3 = 4.0f)
                horizontalLineTo(x = 13.8963f)
                lineTo(x = 12.1248f, y = 2.28955f)
                curveTo(x1 = 11.8268f, y1 = 2.00184f, x2 = 11.8185f, y2 = 1.52704f, x3 = 12.1062f, y3 = 1.22905f)
                close()
                moveTo(x = 20.25f, y = 10.0f)
                curveTo(x1 = 20.6642f, y1 = 10.0f, x2 = 21.0f, y2 = 10.3358f, x3 = 21.0f, y3 = 10.75f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 21.0f, y1 = 19.6642f, x2 = 20.6642f, y2 = 20.0f, x3 = 20.25f, y3 = 20.0f)
                horizontalLineTo(x = 10.1037f)
                lineTo(x = 11.8752f, y = 21.7104f)
                curveTo(x1 = 12.1732f, y1 = 21.9982f, x2 = 12.1815f, y2 = 22.473f, x3 = 11.8938f, y3 = 22.7709f)
                curveTo(x1 = 11.6061f, y1 = 23.0689f, x2 = 11.1313f, y2 = 23.0773f, x3 = 10.8333f, y3 = 22.7896f)
                lineTo(x = 7.7262f, y = 19.7896f)
                curveTo(x1 = 7.57982f, y1 = 19.6482f, x2 = 7.49714f, y2 = 19.4535f, x3 = 7.49714f, y3 = 19.25f)
                curveTo(x1 = 7.49714f, y1 = 19.0465f, x2 = 7.57982f, y2 = 18.8518f, x3 = 7.7262f, y3 = 18.7104f)
                lineTo(x = 10.8333f, y = 15.7105f)
                curveTo(x1 = 11.1313f, y1 = 15.4227f, x2 = 11.6061f, y2 = 15.4311f, x3 = 11.8938f, y3 = 15.7291f)
                curveTo(x1 = 12.1815f, y1 = 16.027f, x2 = 12.1732f, y2 = 16.5018f, x3 = 11.8752f, y3 = 16.7896f)
                lineTo(x = 10.1037f, y = 18.5f)
                horizontalLineTo(x = 19.5f)
                verticalLineTo(y = 10.75f)
                curveTo(x1 = 19.5f, y1 = 10.3358f, x2 = 19.8358f, y2 = 10.0f, x3 = 20.25f, y3 = 10.0f)
                close()
            }
        }.build().also { _arrowsRepeat = it }
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
                imageVector = ArrowsRepeat,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowsRepeat: ImageVector? = null
