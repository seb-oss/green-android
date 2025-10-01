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

val Rocket: ImageVector
    get() {
        val current = _rocket
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Rocket",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 15.5f, y = 14.3242f)
                lineTo(x = 11.5f, y = 17.501f)
                verticalLineTo(y = 19.4866f)
                lineTo(x = 15.5f, y = 17.3048f)
                verticalLineTo(y = 14.3242f)
                close()
                moveTo(x = 10.0f, y = 17.4495f)
                lineTo(x = 6.55045f, y = 14.0f)
                horizontalLineTo(x = 3.25f)
                curveTo(x1 = 2.9853f, y1 = 14.0f, x2 = 2.7402f, y2 = 13.8605f, x3 = 2.60508f, y3 = 13.6328f)
                curveTo(x1 = 2.46995f, y1 = 13.4052f, x2 = 2.46482f, y2 = 13.1232f, x3 = 2.59158f, y3 = 12.8909f)
                lineTo(x = 5.59158f, y = 7.39086f)
                curveTo(x1 = 5.723f, y1 = 7.14992f, x2 = 5.97554f, y2 = 7.0f, x3 = 6.25f, y3 = 7.0f)
                horizontalLineTo(x = 10.902f)
                curveTo(x1 = 13.7571f, y1 = 3.96176f, x2 = 16.9703f, y2 = 2.0f, x3 = 21.25f, y3 = 2.0f)
                curveTo(x1 = 21.6642f, y1 = 2.0f, x2 = 22.0f, y2 = 2.33579f, x3 = 22.0f, y3 = 2.75f)
                curveTo(x1 = 22.0f, y1 = 7.02966f, x2 = 20.0382f, y2 = 10.2429f, x3 = 17.0f, y3 = 13.098f)
                verticalLineTo(y = 17.75f)
                curveTo(x1 = 17.0f, y1 = 18.0245f, x2 = 16.8501f, y2 = 18.277f, x3 = 16.6091f, y3 = 18.4084f)
                lineTo(x = 11.1091f, y = 21.4084f)
                curveTo(x1 = 10.8768f, y1 = 21.5352f, x2 = 10.5948f, y2 = 21.53f, x3 = 10.3672f, y3 = 21.3949f)
                curveTo(x1 = 10.1395f, y1 = 21.2598f, x2 = 10.0f, y2 = 21.0147f, x3 = 10.0f, y3 = 20.75f)
                verticalLineTo(y = 17.4495f)
                close()
                moveTo(x = 6.499f, y = 12.5f)
                lineTo(x = 9.67577f, y = 8.5f)
                horizontalLineTo(x = 6.69522f)
                lineTo(x = 4.51341f, y = 12.5f)
                horizontalLineTo(x = 6.499f)
                close()
                moveTo(x = 2.0f, y = 19.1944f)
                curveTo(x1 = 2.0f, y1 = 17.645f, x2 = 3.25609f, y2 = 16.3889f, x3 = 4.80556f, y3 = 16.3889f)
                curveTo(x1 = 6.35502f, y1 = 16.3889f, x2 = 7.61111f, y2 = 17.645f, x3 = 7.61111f, y3 = 19.1944f)
                curveTo(x1 = 7.61111f, y1 = 20.7439f, x2 = 6.35502f, y2 = 22.0f, x3 = 4.80556f, y3 = 22.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 22.0f, x2 = 2.0f, y2 = 21.6642f, x3 = 2.0f, y3 = 21.25f)
                verticalLineTo(y = 19.1944f)
                close()
            }
        }.build().also { _rocket = it }
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
                imageVector = Rocket,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _rocket: ImageVector? = null
