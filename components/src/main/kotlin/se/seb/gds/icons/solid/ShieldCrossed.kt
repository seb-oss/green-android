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

val ShieldCrossed: ImageVector
    get() {
        val current = _shieldCrossed
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ShieldCrossed",
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
                    curveTo(
                        x1 = 11.9168f,
                        y1 = 1.98717f,
                        x2 = 12.0832f,
                        y2 = 1.98717f,
                        x3 = 12.2372f,
                        y3 = 2.03849f,
                    )
                    lineTo(x = 20.4872f, y = 4.78849f)
                    curveTo(
                        x1 = 20.7934f,
                        y1 = 4.89057f,
                        x2 = 21.0f,
                        y2 = 5.17718f,
                        x3 = 21.0f,
                        y3 = 5.5f,
                    )
                    verticalLineTo(y = 11.9123f)
                    curveTo(
                        x1 = 21.0f,
                        y1 = 14.6497f,
                        x2 = 19.8165f,
                        y2 = 16.6701f,
                        x3 = 18.1412f,
                        y3 = 18.2596f,
                    )
                    curveTo(
                        x1 = 16.4942f,
                        y1 = 19.8225f,
                        x2 = 14.3404f,
                        y2 = 20.9975f,
                        x3 = 12.3561f,
                        y3 = 22.068f,
                    )
                    curveTo(
                        x1 = 12.1338f,
                        y1 = 22.1879f,
                        x2 = 11.8662f,
                        y2 = 22.1879f,
                        x3 = 11.6439f,
                        y3 = 22.068f,
                    )
                    curveTo(
                        x1 = 9.65956f,
                        y1 = 20.9975f,
                        x2 = 7.5058f,
                        y2 = 19.8225f,
                        x3 = 5.85876f,
                        y3 = 18.2596f,
                    )
                    curveTo(
                        x1 = 4.18351f,
                        y1 = 16.6701f,
                        x2 = 3.0f,
                        y2 = 14.6497f,
                        x3 = 3.0f,
                        y3 = 11.9123f,
                    )
                    verticalLineTo(y = 5.5f)
                    curveTo(
                        x1 = 3.0f,
                        y1 = 5.17718f,
                        x2 = 3.20657f,
                        y2 = 4.89057f,
                        x3 = 3.51283f,
                        y3 = 4.78849f,
                    )
                    lineTo(x = 11.7628f, y = 2.03849f)
                    close()
                    moveTo(x = 13.6941f, y = 14.2785f)
                    curveTo(
                        x1 = 13.9863f,
                        y1 = 14.5721f,
                        x2 = 14.4611f,
                        y2 = 14.5734f,
                        x3 = 14.7548f,
                        y3 = 14.2812f,
                    )
                    curveTo(
                        x1 = 15.0484f,
                        y1 = 13.9891f,
                        x2 = 15.0497f,
                        y2 = 13.5142f,
                        x3 = 14.7575f,
                        y3 = 13.2206f,
                    )
                    lineTo(x = 13.046f, y = 11.5001f)
                    lineTo(x = 14.7576f, y = 9.77943f)
                    curveTo(
                        x1 = 15.0497f,
                        y1 = 9.48576f,
                        x2 = 15.0484f,
                        y2 = 9.01089f,
                        x3 = 14.7548f,
                        y3 = 8.71878f,
                    )
                    curveTo(
                        x1 = 14.4611f,
                        y1 = 8.42666f,
                        x2 = 13.9862f,
                        y2 = 8.42793f,
                        x3 = 13.6941f,
                        y3 = 8.7216f,
                    )
                    lineTo(x = 11.9881f, y = 10.4367f)
                    lineTo(x = 10.2817f, y = 8.72135f)
                    curveTo(
                        x1 = 9.98958f,
                        y1 = 8.42769f,
                        x2 = 9.51471f,
                        y2 = 8.42646f,
                        x3 = 9.22105f,
                        y3 = 8.71859f,
                    )
                    curveTo(
                        x1 = 8.9274f,
                        y1 = 9.01071f,
                        x2 = 8.92616f,
                        y2 = 9.48559f,
                        x3 = 9.21829f,
                        y3 = 9.77924f,
                    )
                    lineTo(x = 10.9303f, y = 11.5002f)
                    lineTo(x = 9.21826f, y = 13.2214f)
                    curveTo(
                        x1 = 8.92615f,
                        y1 = 13.5151f,
                        x2 = 8.92741f,
                        y2 = 13.9899f,
                        x3 = 9.22109f,
                        y3 = 14.282f,
                    )
                    curveTo(
                        x1 = 9.51476f,
                        y1 = 14.5742f,
                        x2 = 9.98963f,
                        y2 = 14.5729f,
                        x3 = 10.2817f,
                        y3 = 14.2792f,
                    )
                    lineTo(x = 11.9882f, y = 12.5636f)
                    lineTo(x = 13.6941f, y = 14.2785f)
                    close()
                }
            }.build()
            .also { _shieldCrossed = it }
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
                imageVector = ShieldCrossed,
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
private var _shieldCrossed: ImageVector? = null
