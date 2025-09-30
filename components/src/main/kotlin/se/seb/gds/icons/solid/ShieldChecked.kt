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

val ShieldChecked: ImageVector
    get() {
        val current = _shieldChecked
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ShieldChecked",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 11.7628f, y = 2.03849f)
                    curveTo(x1 = 11.9168f, y1 = 1.98717f, x2 = 12.0832f, y2 = 1.98717f, x3 = 12.2372f, y3 = 2.03849f)
                    lineTo(x = 20.4872f, y = 4.78849f)
                    curveTo(x1 = 20.7934f, y1 = 4.89057f, x2 = 21.0f, y2 = 5.17718f, x3 = 21.0f, y3 = 5.5f)
                    verticalLineTo(y = 11.9123f)
                    curveTo(x1 = 21.0f, y1 = 14.6497f, x2 = 19.8165f, y2 = 16.6701f, x3 = 18.1412f, y3 = 18.2596f)
                    curveTo(x1 = 16.4942f, y1 = 19.8225f, x2 = 14.3404f, y2 = 20.9975f, x3 = 12.3561f, y3 = 22.068f)
                    curveTo(x1 = 12.1338f, y1 = 22.1879f, x2 = 11.8662f, y2 = 22.1879f, x3 = 11.6439f, y3 = 22.068f)
                    curveTo(x1 = 9.65956f, y1 = 20.9975f, x2 = 7.5058f, y2 = 19.8225f, x3 = 5.85876f, y3 = 18.2596f)
                    curveTo(x1 = 4.18351f, y1 = 16.6701f, x2 = 3.0f, y2 = 14.6497f, x3 = 3.0f, y3 = 11.9123f)
                    verticalLineTo(y = 5.5f)
                    curveTo(x1 = 3.0f, y1 = 5.17718f, x2 = 3.20657f, y2 = 4.89057f, x3 = 3.51283f, y3 = 4.78849f)
                    lineTo(x = 11.7628f, y = 2.03849f)
                    close()
                    moveTo(x = 15.2803f, y = 10.0303f)
                    curveTo(x1 = 15.5732f, y1 = 9.73744f, x2 = 15.5732f, y2 = 9.26256f, x3 = 15.2803f, y3 = 8.96967f)
                    curveTo(x1 = 14.9874f, y1 = 8.67678f, x2 = 14.5126f, y2 = 8.67678f, x3 = 14.2197f, y3 = 8.96967f)
                    lineTo(x = 11.0f, y = 12.1893f)
                    lineTo(x = 9.78033f, y = 10.9697f)
                    curveTo(x1 = 9.48744f, y1 = 10.6768f, x2 = 9.01256f, y2 = 10.6768f, x3 = 8.71967f, y3 = 10.9697f)
                    curveTo(x1 = 8.42678f, y1 = 11.2626f, x2 = 8.42678f, y2 = 11.7374f, x3 = 8.71967f, y3 = 12.0303f)
                    lineTo(x = 10.4697f, y = 13.7803f)
                    curveTo(x1 = 10.6103f, y1 = 13.921f, x2 = 10.8011f, y2 = 14.0f, x3 = 11.0f, y3 = 14.0f)
                    curveTo(x1 = 11.1989f, y1 = 14.0f, x2 = 11.3897f, y2 = 13.921f, x3 = 11.5303f, y3 = 13.7803f)
                    lineTo(x = 15.2803f, y = 10.0303f)
                    close()
                }
            }.build()
            .also { _shieldChecked = it }
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
                imageVector = ShieldChecked,
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
private var _shieldChecked: ImageVector? = null
