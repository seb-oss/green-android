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

internal val Truck: ImageVector
    get() {
        val current = _truck
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Truck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 8.75f, y = 4.0f)
                curveTo(x1 = 8.33579f, y1 = 4.0f, x2 = 8.0f, y2 = 4.33579f, x3 = 8.0f, y3 = 4.75f)
                verticalLineTo(y = 6.0f)
                horizontalLineTo(x = 5.0f)
                curveTo(x1 = 4.75389f, y1 = 6.0f, x2 = 4.52344f, y2 = 6.12074f, x3 = 4.38336f, y3 = 6.32309f)
                lineTo(x = 2.13336f, y = 9.57309f)
                curveTo(x1 = 2.04652f, y1 = 9.69852f, x2 = 2.0f, y2 = 9.84745f, x3 = 2.0f, y3 = 10.0f)
                verticalLineTo(y = 16.25f)
                curveTo(x1 = 2.0f, y1 = 16.6642f, x2 = 2.33579f, y2 = 17.0f, x3 = 2.75f, y3 = 17.0f)
                horizontalLineTo(x = 4.00947f)
                curveTo(x1 = 4.13713f, y1 = 18.6781f, x2 = 5.53919f, y2 = 20.0f, x3 = 7.25f, y3 = 20.0f)
                curveTo(x1 = 8.96081f, y1 = 20.0f, x2 = 10.3629f, y2 = 18.6781f, x3 = 10.4905f, y3 = 17.0f)
                horizontalLineTo(x = 13.5095f)
                curveTo(x1 = 13.6371f, y1 = 18.6781f, x2 = 15.0392f, y2 = 20.0f, x3 = 16.75f, y3 = 20.0f)
                curveTo(x1 = 18.4608f, y1 = 20.0f, x2 = 19.8629f, y2 = 18.6781f, x3 = 19.9905f, y3 = 17.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 17.0f, x2 = 22.0f, y2 = 16.6642f, x3 = 22.0f, y3 = 16.25f)
                verticalLineTo(y = 4.75f)
                curveTo(x1 = 22.0f, y1 = 4.33579f, x2 = 21.6642f, y2 = 4.0f, x3 = 21.25f, y3 = 4.0f)
                horizontalLineTo(x = 8.75f)
                close()
                moveTo(x = 8.0f, y = 7.5f)
                horizontalLineTo(x = 5.39296f)
                lineTo(x = 3.5f, y = 10.2343f)
                verticalLineTo(y = 15.5f)
                horizontalLineTo(x = 4.24908f)
                curveTo(x1 = 4.73886f, y1 = 14.3255f, x2 = 5.89803f, y2 = 13.5f, x3 = 7.25f, y3 = 13.5f)
                curveTo(x1 = 7.50813f, y1 = 13.5f, x2 = 7.75924f, y2 = 13.5301f, x3 = 8.0f, y3 = 13.587f)
                verticalLineTo(y = 7.5f)
                close()
                moveTo(x = 18.1057f, y = 15.6433f)
                curveTo(x1 = 18.178f, y1 = 15.8563f, x2 = 18.2852f, y2 = 16.0531f, x3 = 18.4205f, y3 = 16.227f)
                curveTo(x1 = 18.4722f, y1 = 16.3922f, x2 = 18.5f, y2 = 16.5678f, x3 = 18.5f, y3 = 16.75f)
                curveTo(x1 = 18.5f, y1 = 17.7165f, x2 = 17.7165f, y2 = 18.5f, x3 = 16.75f, y3 = 18.5f)
                curveTo(x1 = 15.7835f, y1 = 18.5f, x2 = 15.0f, y2 = 17.7165f, x3 = 15.0f, y3 = 16.75f)
                curveTo(x1 = 15.0f, y1 = 15.7835f, x2 = 15.7835f, y2 = 15.0f, x3 = 16.75f, y3 = 15.0f)
                curveTo(x1 = 17.2967f, y1 = 15.0f, x2 = 17.7848f, y2 = 15.2507f, x3 = 18.1057f, y3 = 15.6433f)
                close()
                moveTo(x = 7.25f, y = 15.0f)
                curveTo(x1 = 6.2835f, y1 = 15.0f, x2 = 5.5f, y2 = 15.7835f, x3 = 5.5f, y3 = 16.75f)
                curveTo(x1 = 5.5f, y1 = 17.7165f, x2 = 6.2835f, y2 = 18.5f, x3 = 7.25f, y3 = 18.5f)
                curveTo(x1 = 8.2165f, y1 = 18.5f, x2 = 9.0f, y2 = 17.7165f, x3 = 9.0f, y3 = 16.75f)
                curveTo(x1 = 9.0f, y1 = 15.7835f, x2 = 8.2165f, y2 = 15.0f, x3 = 7.25f, y3 = 15.0f)
                close()
            }
        }.build().also { _truck = it }
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
                imageVector = Truck,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _truck: ImageVector? = null
