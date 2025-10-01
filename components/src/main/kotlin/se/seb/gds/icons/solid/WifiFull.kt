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

val WifiFull: ImageVector
    get() {
        val current = _wifiFull
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.WifiFull",
                defaultWidth = 25.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 25.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 2.53857f, y = 7.23055f)
                    curveTo(
                        x1 = 8.05879f,
                        y1 = 2.92185f,
                        x2 = 15.9413f,
                        y2 = 2.92185f,
                        x3 = 21.4615f,
                        y3 = 7.23055f,
                    )
                    curveTo(
                        x1 = 21.788f,
                        y1 = 7.48541f,
                        x2 = 21.8461f,
                        y2 = 7.95672f,
                        x3 = 21.5913f,
                        y3 = 8.28324f,
                    )
                    curveTo(
                        x1 = 21.3364f,
                        y1 = 8.60977f,
                        x2 = 20.8651f,
                        y2 = 8.66786f,
                        x3 = 20.5386f,
                        y3 = 8.413f,
                    )
                    curveTo(
                        x1 = 15.5608f,
                        y1 = 4.5277f,
                        x2 = 8.43928f,
                        y2 = 4.5277f,
                        x3 = 3.4615f,
                        y3 = 8.413f,
                    )
                    curveTo(
                        x1 = 3.13498f,
                        y1 = 8.66786f,
                        x2 = 2.66367f,
                        y2 = 8.60977f,
                        x3 = 2.40881f,
                        y3 = 8.28324f,
                    )
                    curveTo(
                        x1 = 2.15395f,
                        y1 = 7.95672f,
                        x2 = 2.21204f,
                        y2 = 7.48541f,
                        x3 = 2.53857f,
                        y3 = 7.23055f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 16.7888f, y = 13.9058f)
                    curveTo(
                        x1 = 13.9979f,
                        y1 = 11.7293f,
                        x2 = 10.0031f,
                        y2 = 11.7293f,
                        x3 = 7.21224f,
                        y3 = 13.9058f,
                    )
                    curveTo(
                        x1 = 6.88561f,
                        y1 = 14.1606f,
                        x2 = 6.41433f,
                        y2 = 14.1023f,
                        x3 = 6.1596f,
                        y3 = 13.7757f,
                    )
                    curveTo(
                        x1 = 5.90487f,
                        y1 = 13.449f,
                        x2 = 5.96315f,
                        y2 = 12.9778f,
                        x3 = 6.28978f,
                        y3 = 12.723f,
                    )
                    curveTo(
                        x1 = 9.62291f,
                        y1 = 10.1236f,
                        x2 = 14.3781f,
                        y2 = 10.1236f,
                        x3 = 17.7112f,
                        y3 = 12.723f,
                    )
                    curveTo(
                        x1 = 18.0379f,
                        y1 = 12.9778f,
                        x2 = 18.0962f,
                        y2 = 13.449f,
                        x3 = 17.8414f,
                        y3 = 13.7757f,
                    )
                    curveTo(
                        x1 = 17.5867f,
                        y1 = 14.1023f,
                        x2 = 17.1154f,
                        y2 = 14.1606f,
                        x3 = 16.7888f,
                        y3 = 13.9058f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.0f, y = 20.0f)
                    curveTo(
                        x1 = 12.5523f,
                        y1 = 20.0f,
                        x2 = 13.0f,
                        y2 = 19.5523f,
                        x3 = 13.0f,
                        y3 = 19.0f,
                    )
                    curveTo(
                        x1 = 13.0f,
                        y1 = 18.4477f,
                        x2 = 12.5523f,
                        y2 = 18.0f,
                        x3 = 12.0f,
                        y3 = 18.0f,
                    )
                    curveTo(
                        x1 = 11.4477f,
                        y1 = 18.0f,
                        x2 = 11.0f,
                        y2 = 18.4477f,
                        x3 = 11.0f,
                        y3 = 19.0f,
                    )
                    curveTo(
                        x1 = 11.0f,
                        y1 = 19.5523f,
                        x2 = 11.4477f,
                        y2 = 20.0f,
                        x3 = 12.0f,
                        y3 = 20.0f,
                    )
                    close()
                }
            }.build()
            .also { _wifiFull = it }
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
                imageVector = WifiFull,
                contentDescription = null,
                modifier =
                Modifier
                    .width((25.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _wifiFull: ImageVector? = null
