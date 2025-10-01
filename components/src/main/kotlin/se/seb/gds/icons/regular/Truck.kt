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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Truck: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.0f, y = 16.25f)
                horizontalLineTo(x = 14.5f)
                moveTo(x = 4.71429f, y = 16.25f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 10.0f)
                lineTo(x = 5.0f, y = 6.75f)
                horizontalLineTo(x = 8.75f)
                verticalLineTo(y = 15.0f)
                moveTo(x = 19.3561f, y = 16.25f)
                horizontalLineTo(x = 21.25f)
                verticalLineTo(y = 4.75f)
                horizontalLineTo(x = 8.75f)
                verticalLineTo(y = 6.84091f)
                moveTo(x = 9.75f, y = 16.75f)
                curveTo(x1 = 9.75f, y1 = 18.1307f, x2 = 8.63071f, y2 = 19.25f, x3 = 7.25f, y3 = 19.25f)
                curveTo(x1 = 5.86929f, y1 = 19.25f, x2 = 4.75f, y2 = 18.1307f, x3 = 4.75f, y3 = 16.75f)
                curveTo(x1 = 4.75f, y1 = 15.3693f, x2 = 5.86929f, y2 = 14.25f, x3 = 7.25f, y3 = 14.25f)
                curveTo(x1 = 8.63071f, y1 = 14.25f, x2 = 9.75f, y2 = 15.3693f, x3 = 9.75f, y3 = 16.75f)
                close()
                moveTo(x = 19.25f, y = 16.75f)
                curveTo(x1 = 19.25f, y1 = 18.1307f, x2 = 18.1307f, y2 = 19.25f, x3 = 16.75f, y3 = 19.25f)
                curveTo(x1 = 15.3693f, y1 = 19.25f, x2 = 14.25f, y2 = 18.1307f, x3 = 14.25f, y3 = 16.75f)
                curveTo(x1 = 14.25f, y1 = 15.3693f, x2 = 15.3693f, y2 = 14.25f, x3 = 16.75f, y3 = 14.25f)
                curveTo(x1 = 18.1307f, y1 = 14.25f, x2 = 19.25f, y2 = 15.3693f, x3 = 19.25f, y3 = 16.75f)
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
