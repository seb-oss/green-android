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

val TradingViewCandles: ImageVector
    get() {
        val current = _tradingViewCandles
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.TradingViewCandles",
            defaultWidth = 20.0.dp,
            defaultHeight = 20.0.dp,
            viewportWidth = 20.0f,
            viewportHeight = 20.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 6.45833f, y = 2.29175f)
                curveTo(x1 = 6.45833f, y1 = 1.94657f, x2 = 6.17851f, y2 = 1.66675f, x3 = 5.83333f, y3 = 1.66675f)
                curveTo(x1 = 5.48816f, y1 = 1.66675f, x2 = 5.20833f, y2 = 1.94657f, x3 = 5.20833f, y3 = 2.29175f)
                verticalLineTo(y = 8.33342f)
                horizontalLineTo(x = 3.125f)
                curveTo(x1 = 2.77982f, y1 = 8.33342f, x2 = 2.5f, y2 = 8.61324f, x3 = 2.5f, y3 = 8.95842f)
                verticalLineTo(y = 15.2084f)
                curveTo(x1 = 2.5f, y1 = 15.5536f, x2 = 2.77982f, y2 = 15.8334f, x3 = 3.125f, y3 = 15.8334f)
                horizontalLineTo(x = 5.20833f)
                verticalLineTo(y = 17.7084f)
                curveTo(x1 = 5.20833f, y1 = 18.0536f, x2 = 5.48816f, y2 = 18.3334f, x3 = 5.83333f, y3 = 18.3334f)
                curveTo(x1 = 6.17851f, y1 = 18.3334f, x2 = 6.45833f, y2 = 18.0536f, x3 = 6.45833f, y3 = 17.7084f)
                verticalLineTo(y = 15.8334f)
                horizontalLineTo(x = 8.54167f)
                curveTo(x1 = 8.88684f, y1 = 15.8334f, x2 = 9.16667f, y2 = 15.5536f, x3 = 9.16667f, y3 = 15.2084f)
                verticalLineTo(y = 8.95842f)
                curveTo(x1 = 9.16667f, y1 = 8.61324f, x2 = 8.88684f, y2 = 8.33342f, x3 = 8.54167f, y3 = 8.33342f)
                horizontalLineTo(x = 6.45833f)
                verticalLineTo(y = 2.29175f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 14.7917f, y = 2.29176f)
                curveTo(x1 = 14.7917f, y1 = 1.94658f, x2 = 14.5118f, y2 = 1.66676f, x3 = 14.1667f, y3 = 1.66676f)
                curveTo(x1 = 13.8215f, y1 = 1.66676f, x2 = 13.5417f, y2 = 1.94658f, x3 = 13.5417f, y3 = 2.29176f)
                verticalLineTo(y = 4.16675f)
                horizontalLineTo(x = 11.4583f)
                curveTo(x1 = 11.1132f, y1 = 4.16675f, x2 = 10.8333f, y2 = 4.44657f, x3 = 10.8333f, y3 = 4.79175f)
                verticalLineTo(y = 15.2084f)
                curveTo(x1 = 10.8333f, y1 = 15.5536f, x2 = 11.1132f, y2 = 15.8334f, x3 = 11.4583f, y3 = 15.8334f)
                horizontalLineTo(x = 13.5417f)
                verticalLineTo(y = 17.7084f)
                curveTo(x1 = 13.5417f, y1 = 18.0536f, x2 = 13.8215f, y2 = 18.3334f, x3 = 14.1667f, y3 = 18.3334f)
                curveTo(x1 = 14.5118f, y1 = 18.3334f, x2 = 14.7917f, y2 = 18.0536f, x3 = 14.7917f, y3 = 17.7084f)
                verticalLineTo(y = 15.8334f)
                horizontalLineTo(x = 16.875f)
                curveTo(x1 = 17.2202f, y1 = 15.8334f, x2 = 17.5f, y2 = 15.5536f, x3 = 17.5f, y3 = 15.2084f)
                verticalLineTo(y = 4.79175f)
                curveTo(x1 = 17.5f, y1 = 4.44657f, x2 = 17.2202f, y2 = 4.16675f, x3 = 16.875f, y3 = 4.16675f)
                horizontalLineTo(x = 14.7917f)
                verticalLineTo(y = 2.29176f)
                close()
            }
        }.build().also { _tradingViewCandles = it }
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
                imageVector = TradingViewCandles,
                contentDescription = null,
                modifier = Modifier
                    .width((20.0).dp)
                    .height((20.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _tradingViewCandles: ImageVector? = null
