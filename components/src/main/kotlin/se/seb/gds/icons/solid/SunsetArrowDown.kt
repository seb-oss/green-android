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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val SunsetArrowDown: ImageVector
    get() {
        val current = _sunsetArrowDown
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SunsetArrowDown",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.0f, y = 2.0f)
                    curveTo(
                        x1 = 12.4142f,
                        y1 = 2.0f,
                        x2 = 12.75f,
                        y2 = 2.33579f,
                        x3 = 12.75f,
                        y3 = 2.75f,
                    )
                    verticalLineTo(y = 6.68934f)
                    lineTo(x = 13.9697f, y = 5.46967f)
                    curveTo(
                        x1 = 14.2626f,
                        y1 = 5.17678f,
                        x2 = 14.7374f,
                        y2 = 5.17678f,
                        x3 = 15.0303f,
                        y3 = 5.46967f,
                    )
                    curveTo(
                        x1 = 15.3232f,
                        y1 = 5.76256f,
                        x2 = 15.3232f,
                        y2 = 6.23744f,
                        x3 = 15.0303f,
                        y3 = 6.53033f,
                    )
                    lineTo(x = 12.5303f, y = 9.03033f)
                    curveTo(
                        x1 = 12.2374f,
                        y1 = 9.32322f,
                        x2 = 11.7626f,
                        y2 = 9.32322f,
                        x3 = 11.4697f,
                        y3 = 9.03033f,
                    )
                    lineTo(x = 8.96967f, y = 6.53033f)
                    curveTo(
                        x1 = 8.67678f,
                        y1 = 6.23744f,
                        x2 = 8.67678f,
                        y2 = 5.76256f,
                        x3 = 8.96967f,
                        y3 = 5.46967f,
                    )
                    curveTo(
                        x1 = 9.26256f,
                        y1 = 5.17678f,
                        x2 = 9.73744f,
                        y2 = 5.17678f,
                        x3 = 10.0303f,
                        y3 = 5.46967f,
                    )
                    lineTo(x = 11.25f, y = 6.68934f)
                    verticalLineTo(y = 2.75f)
                    curveTo(
                        x1 = 11.25f,
                        y1 = 2.33579f,
                        x2 = 11.5858f,
                        y2 = 2.0f,
                        x3 = 12.0f,
                        y3 = 2.0f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 2.00391f, y = 20.25f)
                    curveTo(
                        x1 = 2.00391f,
                        y1 = 19.8358f,
                        x2 = 2.33969f,
                        y2 = 19.5f,
                        x3 = 2.75391f,
                        y3 = 19.5f,
                    )
                    horizontalLineTo(x = 21.2539f)
                    curveTo(
                        x1 = 21.6681f,
                        y1 = 19.5f,
                        x2 = 22.0039f,
                        y2 = 19.8358f,
                        x3 = 22.0039f,
                        y3 = 20.25f,
                    )
                    curveTo(
                        x1 = 22.0039f,
                        y1 = 20.6642f,
                        x2 = 21.6681f,
                        y2 = 21.0f,
                        x3 = 21.2539f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 2.75391f)
                    curveTo(
                        x1 = 2.33969f,
                        y1 = 21.0f,
                        x2 = 2.00391f,
                        y2 = 20.6642f,
                        x3 = 2.00391f,
                        y3 = 20.25f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 2.75f, y = 15.5f)
                    curveTo(
                        x1 = 2.33579f,
                        y1 = 15.5f,
                        x2 = 2.0f,
                        y2 = 15.8358f,
                        x3 = 2.0f,
                        y3 = 16.25f,
                    )
                    curveTo(
                        x1 = 2.0f,
                        y1 = 16.6642f,
                        x2 = 2.33579f,
                        y2 = 17.0f,
                        x3 = 2.75f,
                        y3 = 17.0f,
                    )
                    horizontalLineTo(x = 4.25f)
                    curveTo(
                        x1 = 4.66421f,
                        y1 = 17.0f,
                        x2 = 5.0f,
                        y2 = 16.6642f,
                        x3 = 5.0f,
                        y3 = 16.25f,
                    )
                    curveTo(
                        x1 = 5.0f,
                        y1 = 15.8358f,
                        x2 = 4.66421f,
                        y2 = 15.5f,
                        x3 = 4.25f,
                        y3 = 15.5f,
                    )
                    horizontalLineTo(x = 2.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 19.75f, y = 15.5f)
                    curveTo(
                        x1 = 19.3358f,
                        y1 = 15.5f,
                        x2 = 19.0f,
                        y2 = 15.8358f,
                        x3 = 19.0f,
                        y3 = 16.25f,
                    )
                    curveTo(
                        x1 = 19.0f,
                        y1 = 16.6642f,
                        x2 = 19.3358f,
                        y2 = 17.0f,
                        x3 = 19.75f,
                        y3 = 17.0f,
                    )
                    horizontalLineTo(x = 21.25f)
                    curveTo(
                        x1 = 21.6642f,
                        y1 = 17.0f,
                        x2 = 22.0f,
                        y2 = 16.6642f,
                        x3 = 22.0f,
                        y3 = 16.25f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 15.8358f,
                        x2 = 21.6642f,
                        y2 = 15.5f,
                        x3 = 21.25f,
                        y3 = 15.5f,
                    )
                    horizontalLineTo(x = 19.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.3649f, y = 11.5005f)
                    curveTo(
                        x1 = 17.0987f,
                        y1 = 11.1832f,
                        x2 = 17.14f,
                        y2 = 10.7101f,
                        x3 = 17.4573f,
                        y3 = 10.4439f,
                    )
                    lineTo(x = 18.6064f, y = 9.47969f)
                    curveTo(
                        x1 = 18.9237f,
                        y1 = 9.21344f,
                        x2 = 19.3968f,
                        y2 = 9.25483f,
                        x3 = 19.663f,
                        y3 = 9.57213f,
                    )
                    curveTo(
                        x1 = 19.9293f,
                        y1 = 9.88944f,
                        x2 = 19.8879f,
                        y2 = 10.3625f,
                        x3 = 19.5706f,
                        y3 = 10.6288f,
                    )
                    lineTo(x = 18.4215f, y = 11.5929f)
                    curveTo(
                        x1 = 18.1042f,
                        y1 = 11.8592f,
                        x2 = 17.6312f,
                        y2 = 11.8178f,
                        x3 = 17.3649f,
                        y3 = 11.5005f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 5.39485f, y = 9.47968f)
                    curveTo(
                        x1 = 5.07754f,
                        y1 = 9.21343f,
                        x2 = 4.60447f,
                        y2 = 9.25482f,
                        x3 = 4.33822f,
                        y3 = 9.57212f,
                    )
                    curveTo(
                        x1 = 4.07197f,
                        y1 = 9.88943f,
                        x2 = 4.11336f,
                        y2 = 10.3625f,
                        x3 = 4.43066f,
                        y3 = 10.6287f,
                    )
                    lineTo(x = 5.57973f, y = 11.5929f)
                    curveTo(
                        x1 = 5.89704f,
                        y1 = 11.8592f,
                        x2 = 6.3701f,
                        y2 = 11.8178f,
                        x3 = 6.63635f,
                        y3 = 11.5005f,
                    )
                    curveTo(
                        x1 = 6.90261f,
                        y1 = 11.1832f,
                        x2 = 6.86122f,
                        y2 = 10.7101f,
                        x3 = 6.54391f,
                        y3 = 10.4439f,
                    )
                    lineTo(x = 5.39485f, y = 9.47968f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 16.25f, y = 17.0f)
                    curveTo(
                        x1 = 16.6642f,
                        y1 = 17.0f,
                        x2 = 17.0f,
                        y2 = 16.6642f,
                        x3 = 17.0f,
                        y3 = 16.25f,
                    )
                    verticalLineTo(y = 16.0f)
                    curveTo(
                        x1 = 17.0f,
                        y1 = 13.2386f,
                        x2 = 14.7614f,
                        y2 = 11.0f,
                        x3 = 12.0f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 9.23858f,
                        y1 = 11.0f,
                        x2 = 7.0f,
                        y2 = 13.2386f,
                        x3 = 7.0f,
                        y3 = 16.0f,
                    )
                    verticalLineTo(y = 16.25f)
                    curveTo(
                        x1 = 7.0f,
                        y1 = 16.6642f,
                        x2 = 7.33579f,
                        y2 = 17.0f,
                        x3 = 7.75f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 9.42513f,
                        y1 = 17.0f,
                        x2 = 14.5749f,
                        y2 = 17.0f,
                        x3 = 16.25f,
                        y3 = 17.0f,
                    )
                    close()
                }
            }.build()
            .also { _sunsetArrowDown = it }
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
                imageVector = SunsetArrowDown,
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
private var _sunsetArrowDown: ImageVector? = null
