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

internal val Megaphone: ImageVector
    get() {
        val current = _megaphone
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Megaphone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 18.6931f, y = 2.1465f)
                curveTo(x1 = 18.8847f, y1 = 2.28788f, x2 = 18.9978f, y2 = 2.51187f, x3 = 18.9978f, y3 = 2.75001f)
                verticalLineTo(y = 7.32502f)
                curveTo(x1 = 20.7095f, y1 = 7.67247f, x2 = 21.9978f, y2 = 9.18579f, x3 = 21.9978f, y3 = 11.0f)
                curveTo(x1 = 21.9978f, y1 = 12.8142f, x2 = 20.7095f, y2 = 14.3275f, x3 = 18.9978f, y3 = 14.675f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 18.9978f, y1 = 19.4881f, x2 = 18.8847f, y2 = 19.7121f, x3 = 18.6931f, y3 = 19.8535f)
                curveTo(x1 = 18.5015f, y1 = 19.9949f, x2 = 18.2541f, y2 = 20.0369f, x3 = 18.0265f, y3 = 19.9666f)
                lineTo(x = 13.2834f, y = 18.5022f)
                curveTo(x1 = 12.7684f, y1 = 19.9565f, x2 = 11.3809f, y2 = 21.0f, x3 = 9.7478f, y3 = 21.0f)
                curveTo(x1 = 7.67673f, y1 = 21.0f, x2 = 5.9978f, y2 = 19.3211f, x3 = 5.9978f, y3 = 17.25f)
                verticalLineTo(y = 16.2527f)
                lineTo(x = 2.52654f, y = 15.1809f)
                curveTo(x1 = 2.2122f, y1 = 15.0839f, x2 = 1.9978f, y2 = 14.7933f, x3 = 1.9978f, y3 = 14.4643f)
                verticalLineTo(y = 7.53572f)
                curveTo(x1 = 1.9978f, y1 = 7.20674f, x2 = 2.2122f, y2 = 6.91616f, x3 = 2.52654f, y3 = 6.8191f)
                lineTo(x = 6.51204f, y = 5.58856f)
                curveTo(x1 = 6.52291f, y1 = 5.58492f, x2 = 6.53389f, y2 = 5.58153f, x3 = 6.54497f, y3 = 5.57839f)
                lineTo(x = 18.0265f, y = 2.03339f)
                curveTo(x1 = 18.2541f, y1 = 1.96313f, x2 = 18.5015f, y2 = 2.00511f, x3 = 18.6931f, y3 = 2.1465f)
                close()
                moveTo(x = 7.4978f, y = 16.7158f)
                verticalLineTo(y = 17.25f)
                curveTo(x1 = 7.4978f, y1 = 18.4926f, x2 = 8.50516f, y2 = 19.5f, x3 = 9.7478f, y3 = 19.5f)
                curveTo(x1 = 10.7042f, y1 = 19.5f, x2 = 11.5229f, y2 = 18.9029f, x3 = 11.8482f, y3 = 18.059f)
                lineTo(x = 7.4978f, y = 16.7158f)
                close()
                moveTo(x = 20.4978f, y = 11.0f)
                curveTo(x1 = 20.4978f, y1 = 11.9797f, x2 = 19.8717f, y2 = 12.8131f, x3 = 18.9978f, y3 = 13.122f)
                verticalLineTo(y = 8.87804f)
                curveTo(x1 = 19.8717f, y1 = 9.18691f, x2 = 20.4978f, y2 = 10.0203f, x3 = 20.4978f, y3 = 11.0f)
                close()
                moveTo(x = 6.0f, y = 7.31652f)
                verticalLineTo(y = 14.6835f)
                lineTo(x = 3.4978f, y = 13.9109f)
                verticalLineTo(y = 8.08909f)
                lineTo(x = 6.0f, y = 7.31652f)
                close()
            }
        }.build().also { _megaphone = it }
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
                imageVector = Megaphone,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _megaphone: ImageVector? = null
