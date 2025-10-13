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

internal val EyeSlash: ImageVector
    get() {
        val current = _eyeSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.EyeSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 2.21967f, y = 2.21967f)
                curveTo(x1 = 2.51256f, y1 = 1.92678f, x2 = 2.98744f, y2 = 1.92678f, x3 = 3.28033f, y3 = 2.21967f)
                lineTo(x = 7.04527f, y = 5.98461f)
                lineTo(x = 7.06003f, y = 5.99898f)
                lineTo(x = 18.0006f, y = 16.9395f)
                lineTo(x = 18.0149f, y = 16.9542f)
                lineTo(x = 21.7803f, y = 20.7197f)
                curveTo(x1 = 22.0732f, y1 = 21.0126f, x2 = 22.0732f, y2 = 21.4874f, x3 = 21.7803f, y3 = 21.7803f)
                curveTo(x1 = 21.4874f, y1 = 22.0732f, x2 = 21.0126f, y2 = 22.0732f, x3 = 20.7197f, y3 = 21.7803f)
                lineTo(x = 17.3704f, y = 18.4311f)
                curveTo(x1 = 14.728f, y1 = 20.0593f, x2 = 11.733f, y2 = 20.4272f, x3 = 8.91701f, y3 = 19.5005f)
                curveTo(x1 = 5.92036f, y1 = 18.5144f, x2 = 3.20469f, y2 = 16.0905f, x3 = 1.32902f, y3 = 12.3346f)
                curveTo(x1 = 1.22366f, y1 = 12.1236f, x2 = 1.22366f, y2 = 11.8754f, x3 = 1.32902f, y3 = 11.6644f)
                curveTo(x1 = 2.4302f, y1 = 9.45938f, x2 = 3.81974f, y2 = 7.71428f, x3 = 5.38773f, y3 = 6.44839f)
                lineTo(x = 2.21967f, y = 3.28033f)
                curveTo(x1 = 1.92678f, y1 = 2.98744f, x2 = 1.92678f, y2 = 2.51256f, x3 = 2.21967f, y3 = 2.21967f)
                close()
                moveTo(x = 8.0f, y = 11.9995f)
                curveTo(x1 = 8.0f, y1 = 11.1664f, x2 = 8.25524f, y2 = 10.3922f, x3 = 8.691f, y3 = 9.75166f)
                lineTo(x = 9.78265f, y = 10.8433f)
                curveTo(x1 = 9.60193f, y1 = 11.1891f, x2 = 9.5f, y2 = 11.5821f, x3 = 9.5f, y3 = 11.9995f)
                curveTo(x1 = 9.5f, y1 = 13.3802f, x2 = 10.6193f, y2 = 14.4995f, x3 = 12.0f, y3 = 14.4995f)
                curveTo(x1 = 12.4174f, y1 = 14.4995f, x2 = 12.8105f, y2 = 14.3976f, x3 = 13.1562f, y3 = 14.2169f)
                lineTo(x = 14.2478f, y = 15.3085f)
                curveTo(x1 = 13.6073f, y1 = 15.7443f, x2 = 12.8331f, y2 = 15.9995f, x3 = 12.0f, y3 = 15.9995f)
                curveTo(x1 = 9.79086f, y1 = 15.9995f, x2 = 8.0f, y2 = 14.2087f, x3 = 8.0f, y3 = 11.9995f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 22.6711f, y = 12.3351f)
                curveTo(x1 = 21.8382f, y1 = 14.0031f, x2 = 20.8387f, y2 = 15.4083f, x3 = 19.7235f, y3 = 16.5414f)
                lineTo(x = 8.02148f, y = 4.83944f)
                curveTo(x1 = 9.30221f, y1 = 4.2828f, x2 = 10.6447f, y2 = 3.99999f, x3 = 12.0002f, y3 = 4.0f)
                curveTo(x1 = 16.1419f, y1 = 4.00003f, x2 = 20.162f, y2 = 6.64058f, x3 = 22.6711f, y3 = 11.6649f)
                curveTo(x1 = 22.7765f, y1 = 11.8759f, x2 = 22.7765f, y2 = 12.1241f, x3 = 22.6711f, y3 = 12.3351f)
                close()
            }
        }.build().also { _eyeSlash = it }
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
                imageVector = EyeSlash,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _eyeSlash: ImageVector? = null
