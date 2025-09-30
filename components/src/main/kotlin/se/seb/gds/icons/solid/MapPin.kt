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

val MapPin: ImageVector
    get() {
        val current = _mapPin
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.MapPin",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 11.556f, y = 21.9973f)
                    lineTo(x = 11.5538f, y = 21.9957f)
                    lineTo(x = 11.5486f, y = 21.9918f)
                    lineTo(x = 11.5304f, y = 21.9783f)
                    curveTo(x1 = 11.5149f, y1 = 21.9667f, x2 = 11.4927f, y2 = 21.95f, x3 = 11.4643f, y3 = 21.9284f)
                    curveTo(x1 = 11.4074f, y1 = 21.8851f, x2 = 11.3256f, y2 = 21.822f, x3 = 11.2224f, y3 = 21.7401f)
                    curveTo(x1 = 11.016f, y1 = 21.5764f, x2 = 10.7236f, y2 = 21.3374f, x3 = 10.3739f, y3 = 21.0321f)
                    curveTo(x1 = 9.67555f, y1 = 20.4223f, x2 = 8.74308f, y2 = 19.5433f, x3 = 7.80853f, y3 = 18.4663f)
                    curveTo(x1 = 5.96419f, y1 = 16.3408f, x2 = 4.0f, y2 = 13.3169f, x3 = 4.0f, y3 = 10.0f)
                    curveTo(x1 = 4.0f, y1 = 5.58172f, x2 = 7.58172f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    curveTo(x1 = 16.4183f, y1 = 2.0f, x2 = 20.0f, y2 = 5.58172f, x3 = 20.0f, y3 = 10.0f)
                    curveTo(x1 = 20.0f, y1 = 13.3169f, x2 = 18.0358f, y2 = 16.3408f, x3 = 16.1915f, y3 = 18.4663f)
                    curveTo(x1 = 15.2569f, y1 = 19.5433f, x2 = 14.3245f, y2 = 20.4223f, x3 = 13.6261f, y3 = 21.0321f)
                    curveTo(x1 = 13.2764f, y1 = 21.3374f, x2 = 12.984f, y2 = 21.5764f, x3 = 12.7776f, y3 = 21.7401f)
                    curveTo(x1 = 12.6744f, y1 = 21.822f, x2 = 12.5926f, y2 = 21.8851f, x3 = 12.5357f, y3 = 21.9284f)
                    curveTo(x1 = 12.5073f, y1 = 21.95f, x2 = 12.4851f, y2 = 21.9667f, x3 = 12.4696f, y3 = 21.9783f)
                    lineTo(x = 12.4514f, y = 21.9918f)
                    lineTo(x = 12.4462f, y = 21.9957f)
                    lineTo(x = 12.4445f, y = 21.9969f)
                    curveTo(x1 = 12.4445f, y1 = 21.9969f, x2 = 12.4436f, y2 = 21.9976f, x3 = 12.0f, y3 = 21.3929f)
                    lineTo(x = 12.4436f, y = 21.9976f)
                    curveTo(x1 = 12.1796f, y1 = 22.1913f, x2 = 11.82f, y2 = 22.191f, x3 = 11.556f, y3 = 21.9973f)
                    close()
                    moveTo(x = 12.0f, y = 21.3929f)
                    lineTo(x = 11.556f, y = 21.9973f)
                    curveTo(x1 = 11.556f, y1 = 21.9973f, x2 = 11.5564f, y2 = 21.9976f, x3 = 12.0f, y3 = 21.3929f)
                    close()
                    moveTo(x = 8.875f, y = 10.0f)
                    curveTo(x1 = 8.875f, y1 = 8.27411f, x2 = 10.2741f, y2 = 6.875f, x3 = 12.0f, y3 = 6.875f)
                    curveTo(x1 = 13.7259f, y1 = 6.875f, x2 = 15.125f, y2 = 8.27411f, x3 = 15.125f, y3 = 10.0f)
                    curveTo(x1 = 15.125f, y1 = 11.7259f, x2 = 13.7259f, y2 = 13.125f, x3 = 12.0f, y3 = 13.125f)
                    curveTo(x1 = 10.2741f, y1 = 13.125f, x2 = 8.875f, y2 = 11.7259f, x3 = 8.875f, y3 = 10.0f)
                    close()
                }
            }.build()
            .also { _mapPin = it }
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
                imageVector = MapPin,
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
private var _mapPin: ImageVector? = null
