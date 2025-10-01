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

val BubbleQuotes: ImageVector
    get() {
        val current = _bubbleQuotes
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BubbleQuotes",
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
                moveTo(x = 2.75f, y = 3.75f)
                horizontalLineTo(x = 21.25f)
                verticalLineTo(y = 18.25f)
                horizontalLineTo(x = 15.0155f)
                lineTo(x = 11.9979f, y = 20.75f)
                lineTo(x = 9.0155f, y = 18.25f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.52309f, y = 8.0f)
                curveTo(x1 = 8.40577f, y1 = 8.0f, x2 = 7.5f, y2 = 8.91026f, x3 = 7.5f, y3 = 10.0331f)
                curveTo(x1 = 7.5f, y1 = 11.156f, x2 = 8.40577f, y2 = 12.0662f, x3 = 9.52309f, y3 = 12.0662f)
                curveTo(x1 = 9.80224f, y1 = 12.0662f, x2 = 10.0682f, y2 = 12.0094f, x3 = 10.3101f, y3 = 11.9067f)
                curveTo(x1 = 10.2619f, y1 = 11.9952f, x2 = 10.2095f, y2 = 12.0788f, x3 = 10.1535f, y3 = 12.1583f)
                curveTo(x1 = 9.80027f, y1 = 12.6602f, x2 = 9.2779f, y2 = 13.0429f, x3 = 8.59934f, y3 = 13.4975f)
                curveTo(x1 = 8.39303f, y1 = 13.6358f, x2 = 8.33704f, y2 = 13.9166f, x3 = 8.47432f, y3 = 14.1236f)
                curveTo(x1 = 8.6116f, y1 = 14.3305f, x2 = 8.89179f, y2 = 14.3876f, x3 = 9.0981f, y3 = 14.2494f)
                curveTo(x1 = 9.76827f, y1 = 13.8004f, x2 = 10.426f, y2 = 13.3359f, x3 = 10.8876f, y3 = 12.6801f)
                curveTo(x1 = 11.3621f, y1 = 12.006f, x2 = 11.6045f, y2 = 11.17f, x3 = 11.5461f, y3 = 10.0207f)
                curveTo(x1 = 11.5395f, y1 = 8.90356f, x2 = 10.6363f, y2 = 8.0f, x3 = 9.52309f, y3 = 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 14.4684f, y = 8.0f)
                curveTo(x1 = 13.3511f, y1 = 8.0f, x2 = 12.4453f, y2 = 8.91026f, x3 = 12.4453f, y3 = 10.0331f)
                curveTo(x1 = 12.4453f, y1 = 11.156f, x2 = 13.3511f, y2 = 12.0662f, x3 = 14.4684f, y3 = 12.0662f)
                curveTo(x1 = 14.7476f, y1 = 12.0662f, x2 = 15.0135f, y2 = 12.0094f, x3 = 15.2554f, y3 = 11.9067f)
                curveTo(x1 = 15.2072f, y1 = 11.9952f, x2 = 15.1548f, y2 = 12.0788f, x3 = 15.0989f, y3 = 12.1583f)
                curveTo(x1 = 14.7456f, y1 = 12.6602f, x2 = 14.2232f, y2 = 13.0429f, x3 = 13.5447f, y3 = 13.4975f)
                curveTo(x1 = 13.3383f, y1 = 13.6358f, x2 = 13.2824f, y2 = 13.9166f, x3 = 13.4196f, y3 = 14.1236f)
                curveTo(x1 = 13.5569f, y1 = 14.3305f, x2 = 13.8371f, y2 = 14.3876f, x3 = 14.0434f, y3 = 14.2494f)
                curveTo(x1 = 14.7136f, y1 = 13.8004f, x2 = 15.3713f, y2 = 13.3359f, x3 = 15.8329f, y3 = 12.6801f)
                curveTo(x1 = 16.3074f, y1 = 12.006f, x2 = 16.5498f, y2 = 11.17f, x3 = 16.4915f, y3 = 10.0207f)
                curveTo(x1 = 16.4848f, y1 = 8.90356f, x2 = 15.5816f, y2 = 8.0f, x3 = 14.4684f, y3 = 8.0f)
                close()
            }
        }.build().also { _bubbleQuotes = it }
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
                imageVector = BubbleQuotes,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bubbleQuotes: ImageVector? = null
