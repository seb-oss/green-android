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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val TradingViewCandles: ImageVector
    get() {
        val current = _tradingViewCandles
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.TradingViewCandles",
                defaultWidth = 20.0.dp,
                defaultHeight = 20.0.dp,
                viewportWidth = 20.0f,
                viewportHeight = 20.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 5.83333f, y = 2.29175f)
                    verticalLineTo(y = 8.95842f)
                    moveTo(x = 5.83333f, y = 8.95842f)
                    horizontalLineTo(x = 3.125f)
                    verticalLineTo(y = 15.2084f)
                    horizontalLineTo(x = 5.83333f)
                    moveTo(x = 5.83333f, y = 8.95842f)
                    horizontalLineTo(x = 8.54167f)
                    verticalLineTo(y = 15.2084f)
                    horizontalLineTo(x = 5.83333f)
                    moveTo(x = 5.83333f, y = 15.2084f)
                    verticalLineTo(y = 17.7084f)
                    moveTo(x = 14.1667f, y = 2.29176f)
                    verticalLineTo(y = 4.79175f)
                    moveTo(x = 14.1667f, y = 4.79175f)
                    horizontalLineTo(x = 11.4583f)
                    verticalLineTo(y = 15.2084f)
                    horizontalLineTo(x = 14.1667f)
                    moveTo(x = 14.1667f, y = 4.79175f)
                    horizontalLineTo(x = 16.875f)
                    verticalLineTo(y = 15.2084f)
                    horizontalLineTo(x = 14.1667f)
                    moveTo(x = 14.1667f, y = 15.2084f)
                    verticalLineTo(y = 17.7084f)
                }
            }.build()
            .also { _tradingViewCandles = it }
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
                modifier =
                Modifier
                    .width((20.0).dp)
                    .height((20.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _tradingViewCandles: ImageVector? = null
