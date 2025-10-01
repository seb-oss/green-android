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

val Key: ImageVector
    get() {
        val current = _key
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Key",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 1.0f, y = 12.0f)
                    curveTo(
                        x1 = 1.0f,
                        y1 = 8.68629f,
                        x2 = 3.68629f,
                        y2 = 6.0f,
                        x3 = 7.0f,
                        y3 = 6.0f,
                    )
                    curveTo(
                        x1 = 8.93293f,
                        y1 = 6.0f,
                        x2 = 10.6525f,
                        y2 = 6.91485f,
                        x3 = 11.7486f,
                        y3 = 8.33211f,
                    )
                    curveTo(
                        x1 = 11.8462f,
                        y1 = 8.4583f,
                        x2 = 11.9578f,
                        y2 = 8.5f,
                        x3 = 12.0315f,
                        y3 = 8.5f,
                    )
                    horizontalLineTo(x = 20.0261f)
                    curveTo(
                        x1 = 20.551f,
                        y1 = 8.5f,
                        x2 = 21.0482f,
                        y2 = 8.7356f,
                        x3 = 21.3805f,
                        y3 = 9.14183f,
                    )
                    lineTo(x = 22.8124f, y = 10.8918f)
                    curveTo(
                        x1 = 23.3398f,
                        y1 = 11.5365f,
                        x2 = 23.3398f,
                        y2 = 12.4635f,
                        x3 = 22.8124f,
                        y3 = 13.1082f,
                    )
                    lineTo(x = 21.3805f, y = 14.8582f)
                    curveTo(
                        x1 = 21.0482f,
                        y1 = 15.2644f,
                        x2 = 20.551f,
                        y2 = 15.5f,
                        x3 = 20.0261f,
                        y3 = 15.5f,
                    )
                    horizontalLineTo(x = 18.2868f)
                    curveTo(
                        x1 = 17.9588f,
                        y1 = 15.5f,
                        x2 = 17.6374f,
                        y2 = 15.4078f,
                        x3 = 17.3593f,
                        y3 = 15.234f,
                    )
                    lineTo(x = 16.1325f, y = 14.4672f)
                    curveTo(
                        x1 = 16.0514f,
                        y1 = 14.4166f,
                        x2 = 15.9486f,
                        y2 = 14.4166f,
                        x3 = 15.8675f,
                        y3 = 14.4672f,
                    )
                    lineTo(x = 14.6407f, y = 15.234f)
                    curveTo(
                        x1 = 14.3626f,
                        y1 = 15.4078f,
                        x2 = 14.0412f,
                        y2 = 15.5f,
                        x3 = 13.7132f,
                        y3 = 15.5f,
                    )
                    horizontalLineTo(x = 12.0315f)
                    curveTo(
                        x1 = 11.9578f,
                        y1 = 15.5f,
                        x2 = 11.8462f,
                        y2 = 15.5417f,
                        x3 = 11.7486f,
                        y3 = 15.6679f,
                    )
                    curveTo(
                        x1 = 10.6525f,
                        y1 = 17.0851f,
                        x2 = 8.93293f,
                        y2 = 18.0f,
                        x3 = 7.0f,
                        y3 = 18.0f,
                    )
                    curveTo(
                        x1 = 3.68629f,
                        y1 = 18.0f,
                        x2 = 1.0f,
                        y2 = 15.3137f,
                        x3 = 1.0f,
                        y3 = 12.0f,
                    )
                    close()
                    moveTo(x = 5.5f, y = 12.0f)
                    curveTo(
                        x1 = 5.5f,
                        y1 = 11.1716f,
                        x2 = 6.17157f,
                        y2 = 10.5f,
                        x3 = 7.0f,
                        y3 = 10.5f,
                    )
                    curveTo(
                        x1 = 7.82843f,
                        y1 = 10.5f,
                        x2 = 8.5f,
                        y2 = 11.1716f,
                        x3 = 8.5f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 8.5f,
                        y1 = 12.8284f,
                        x2 = 7.82843f,
                        y2 = 13.5f,
                        x3 = 7.0f,
                        y3 = 13.5f,
                    )
                    curveTo(
                        x1 = 6.17157f,
                        y1 = 13.5f,
                        x2 = 5.5f,
                        y2 = 12.8284f,
                        x3 = 5.5f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _key = it }
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
                imageVector = Key,
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
private var _key: ImageVector? = null
