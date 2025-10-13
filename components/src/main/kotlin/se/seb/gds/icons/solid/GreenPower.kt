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

internal val GreenPower: ImageVector
    get() {
        val current = _greenPower
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.GreenPower",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 5.16061f, y = 17.7687f)
                curveTo(x1 = 2.13084f, y1 = 13.7222f, x2 = 2.34132f, y2 = 9.272f, x3 = 5.10471f, y3 = 6.23444f)
                curveTo(x1 = 7.95009f, y1 = 3.10675f, x2 = 13.3026f, y2 = 1.69666f, x3 = 19.9204f, y3 = 3.54964f)
                curveTo(x1 = 20.1727f, y1 = 3.62027f, x2 = 20.3698f, y2 = 3.8174f, x3 = 20.4404f, y3 = 4.06965f)
                curveTo(x1 = 22.2933f, y1 = 10.6875f, x2 = 20.8832f, y2 = 16.04f, x3 = 17.7555f, y3 = 18.8853f)
                curveTo(x1 = 14.718f, y1 = 21.6487f, x2 = 10.2678f, y2 = 21.8591f, x3 = 6.22126f, y3 = 18.8294f)
                lineTo(x = 4.27808f, y = 20.7726f)
                curveTo(x1 = 3.98519f, y1 = 21.0655f, x2 = 3.51032f, y2 = 21.0655f, x3 = 3.21742f, y3 = 20.7726f)
                curveTo(x1 = 2.92453f, y1 = 20.4797f, x2 = 2.92453f, y2 = 20.0048f, x3 = 3.21742f, y3 = 19.7119f)
                lineTo(x = 5.16061f, y = 17.7687f)
                close()
                moveTo(x = 12.6151f, y = 7.9421f)
                curveTo(x1 = 12.9181f, y1 = 7.5633f, x2 = 13.5184f, y2 = 7.78246f, x3 = 13.5184f, y3 = 8.27189f)
                verticalLineTo(y = 10.4585f)
                horizontalLineTo(x = 14.9898f)
                curveTo(x1 = 15.4194f, y1 = 10.4585f, x2 = 15.656f, y2 = 10.969f, x3 = 15.3839f, y3 = 11.3091f)
                lineTo(x = 12.3849f, y = 15.058f)
                curveTo(x1 = 12.0819f, y1 = 15.4368f, x2 = 11.4816f, y2 = 15.2177f, x3 = 11.4816f, y3 = 14.7282f)
                verticalLineTo(y = 12.5416f)
                horizontalLineTo(x = 10.0102f)
                curveTo(x1 = 9.58059f, y1 = 12.5416f, x2 = 9.34405f, y2 = 12.0311f, x3 = 9.61607f, y3 = 11.6911f)
                lineTo(x = 12.6151f, y = 7.9421f)
                close()
            }
        }.build().also { _greenPower = it }
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
                imageVector = GreenPower,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _greenPower: ImageVector? = null
