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

internal val TrendingThree: ImageVector
    get() {
        val current = _trendingThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.TrendingThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 13.0465f, y = 3.00145f)
                curveTo(x1 = 13.3592f, y1 = 3.02086f, x2 = 13.6269f, y2 = 3.23264f, x3 = 13.7178f, y3 = 3.5325f)
                lineTo(x = 18.187f, y = 18.2811f)
                lineTo(x = 20.586f, y = 13.7138f)
                curveTo(x1 = 20.7786f, y1 = 13.347f, x2 = 21.2321f, y2 = 13.2059f, x3 = 21.5988f, y3 = 13.3985f)
                curveTo(x1 = 21.9655f, y1 = 13.5911f, x2 = 22.1066f, y2 = 14.0446f, x3 = 21.914f, y3 = 14.4113f)
                lineTo(x = 18.664f, y = 20.5988f)
                curveTo(x1 = 18.5224f, y1 = 20.8682f, x2 = 18.2321f, y2 = 21.0254f, x3 = 17.9291f, y3 = 20.9966f)
                curveTo(x1 = 17.6261f, y1 = 20.9679f, x2 = 17.3705f, y2 = 20.7588f, x3 = 17.2822f, y3 = 20.4675f)
                lineTo(x = 12.8668f, y = 5.89646f)
                lineTo(x = 8.68536f, y = 15.3046f)
                curveTo(x1 = 8.5717f, y1 = 15.5603f, x2 = 8.32512f, y2 = 15.7315f, x3 = 8.0458f, y3 = 15.7486f)
                curveTo(x1 = 7.76647f, y1 = 15.7657f, x2 = 7.50086f, y2 = 15.6258f, x3 = 7.35688f, y3 = 15.3859f)
                lineTo(x = 4.93384f, y = 11.3475f)
                lineTo(x = 3.35223f, y = 13.4783f)
                curveTo(x1 = 3.10535f, y1 = 13.8109f, x2 = 2.63559f, y2 = 13.8804f, x3 = 2.30299f, y3 = 13.6335f)
                curveTo(x1 = 1.97039f, y1 = 13.3866f, x2 = 1.90089f, y2 = 12.9168f, x3 = 2.14777f, y3 = 12.5842f)
                lineTo(x = 4.39777f, y = 9.55299f)
                curveTo(x1 = 4.547f, y1 = 9.35195f, x2 = 4.78671f, y2 = 9.23863f, x3 = 5.03678f, y3 = 9.25091f)
                curveTo(x1 = 5.28685f, y1 = 9.26319f, x2 = 5.5143f, y2 = 9.39944f, x3 = 5.64312f, y3 = 9.61414f)
                lineTo(x = 7.9007f, y = 13.3768f)
                lineTo(x = 12.3146f, y = 3.4454f)
                curveTo(x1 = 12.4419f, y1 = 3.15908f, x2 = 12.7337f, y2 = 2.98204f, x3 = 13.0465f, y3 = 3.00145f)
                close()
            }
        }.build().also { _trendingThree = it }
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
                imageVector = TrendingThree,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _trendingThree: ImageVector? = null
