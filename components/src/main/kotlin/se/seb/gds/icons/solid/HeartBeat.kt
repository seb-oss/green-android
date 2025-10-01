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

val HeartBeat: ImageVector
    get() {
        val current = _heartBeat
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.HeartBeat",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 21.5189f, y = 6.84578f)
                curveTo(x1 = 23.0877f, y1 = 10.7671f, x2 = 21.0886f, y2 = 16.5047f, x3 = 12.3689f, y3 = 21.404f)
                curveTo(x1 = 12.1408f, y1 = 21.5322f, x2 = 11.8623f, y2 = 21.5322f, x3 = 11.6341f, y3 = 21.404f)
                curveTo(x1 = 2.91438f, y1 = 16.5047f, x2 = 0.915246f, y2 = 10.7672f, x3 = 2.48404f, y3 = 6.8458f)
                curveTo(x1 = 3.25119f, y1 = 4.92822f, x2 = 4.8589f, y2 = 3.55922f, x3 = 6.74877f, y3 = 3.13681f)
                curveTo(x1 = 8.4672f, y1 = 2.75271f, x2 = 10.3616f, y2 = 3.16312f, x3 = 12.0015f, y3 = 4.54956f)
                curveTo(x1 = 13.6413f, y1 = 3.16312f, x2 = 15.5357f, y2 = 2.75271f, x3 = 17.2542f, y3 = 3.1368f)
                curveTo(x1 = 19.144f, y1 = 3.55922f, x2 = 20.7518f, y2 = 4.92821f, x3 = 21.5189f, y3 = 6.84578f)
                close()
                moveTo(x = 11.1708f, y = 8.66459f)
                curveTo(x1 = 11.0461f, y1 = 8.41523f, x2 = 10.7934f, y2 = 8.25561f, x3 = 10.5147f, y3 = 8.25014f)
                curveTo(x1 = 10.236f, y1 = 8.24468f, x2 = 9.97719f, y2 = 8.39428f, x3 = 9.84284f, y3 = 8.63856f)
                lineTo(x = 8.40655f, y = 11.25f)
                horizontalLineTo(x = 6.75f)
                curveTo(x1 = 6.33579f, y1 = 11.25f, x2 = 6.0f, y2 = 11.5858f, x3 = 6.0f, y3 = 12.0f)
                curveTo(x1 = 6.0f, y1 = 12.4142f, x2 = 6.33579f, y2 = 12.75f, x3 = 6.75f, y3 = 12.75f)
                horizontalLineTo(x = 8.85f)
                curveTo(x1 = 9.12352f, y1 = 12.75f, x2 = 9.37535f, y2 = 12.6011f, x3 = 9.50716f, y3 = 12.3614f)
                lineTo(x = 10.4684f, y = 10.6138f)
                lineTo(x = 12.8292f, y = 15.3354f)
                curveTo(x1 = 12.9539f, y1 = 15.5848f, x2 = 13.2066f, y2 = 15.7444f, x3 = 13.4853f, y3 = 15.7499f)
                curveTo(x1 = 13.764f, y1 = 15.7553f, x2 = 14.0228f, y2 = 15.6057f, x3 = 14.1572f, y3 = 15.3614f)
                lineTo(x = 15.5935f, y = 12.75f)
                horizontalLineTo(x = 17.25f)
                curveTo(x1 = 17.6642f, y1 = 12.75f, x2 = 18.0f, y2 = 12.4142f, x3 = 18.0f, y3 = 12.0f)
                curveTo(x1 = 18.0f, y1 = 11.5858f, x2 = 17.6642f, y2 = 11.25f, x3 = 17.25f, y3 = 11.25f)
                horizontalLineTo(x = 15.15f)
                curveTo(x1 = 14.8765f, y1 = 11.25f, x2 = 14.6247f, y2 = 11.3989f, x3 = 14.4928f, y3 = 11.6386f)
                lineTo(x = 13.5316f, y = 13.3862f)
                lineTo(x = 11.1708f, y = 8.66459f)
                close()
            }
        }.build().also { _heartBeat = it }
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
                imageVector = HeartBeat,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _heartBeat: ImageVector? = null
