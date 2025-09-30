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

val MoneyHand: ImageVector
    get() {
        val current = _moneyHand
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.MoneyHand",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 6.75f, y = 20.2122f)
                    horizontalLineTo(x = 8.89621f)
                    curveTo(x1 = 8.89621f, y1 = 20.2122f, x2 = 11.3461f, y2 = 21.1593f, x3 = 12.9937f, y3 = 21.2378f)
                    curveTo(x1 = 16.6264f, y1 = 21.411f, x2 = 19.5121f, y2 = 19.7189f, x3 = 21.8494f, y3 = 17.1452f)
                    curveTo(x1 = 22.3831f, y1 = 16.5574f, x2 = 22.3741f, y2 = 15.6701f, x3 = 21.8785f, y3 = 15.0498f)
                    curveTo(x1 = 21.2396f, y1 = 14.2501f, x2 = 20.0386f, y2 = 14.1853f, x3 = 19.2375f, y3 = 14.822f)
                    curveTo(x1 = 18.3548f, y1 = 15.5234f, x2 = 17.1831f, y2 = 16.3124f, x3 = 16.0668f, y3 = 16.6223f)
                    curveTo(x1 = 14.5248f, y1 = 17.0503f, x2 = 12.9937f, y2 = 17.1351f, x3 = 12.9937f, y3 = 17.1351f)
                    curveTo(x1 = 21.1886f, y1 = 16.6223f, x2 = 18.0181f, y2 = 11.0f, x3 = 6.75f, y3 = 14.0f)
                    moveTo(x = 14.0553f, y = 3.88943f)
                    curveTo(x1 = 13.6015f, y1 = 2.64139f, x2 = 12.4049f, y2 = 1.75f, x3 = 11.0f, y3 = 1.75f)
                    curveTo(x1 = 9.20507f, y1 = 1.75f, x2 = 7.75f, y2 = 3.20507f, x3 = 7.75f, y3 = 5.0f)
                    curveTo(x1 = 7.75f, y1 = 6.79493f, x2 = 9.20507f, y2 = 8.25f, x3 = 11.0f, y3 = 8.25f)
                    curveTo(x1 = 11.3286f, y1 = 8.25f, x2 = 11.6457f, y2 = 8.20124f, x3 = 11.9447f, y3 = 8.11057f)
                    moveTo(x = 14.0553f, y = 3.88943f)
                    curveTo(x1 = 12.7211f, y1 = 4.2941f, x2 = 11.75f, y2 = 5.53364f, x3 = 11.75f, y3 = 7.0f)
                    curveTo(x1 = 11.75f, y1 = 7.39005f, x2 = 11.8187f, y2 = 7.76406f, x3 = 11.9447f, y3 = 8.11057f)
                    moveTo(x = 14.0553f, y = 3.88943f)
                    curveTo(x1 = 14.3543f, y1 = 3.79876f, x2 = 14.6714f, y2 = 3.75f, x3 = 15.0f, y3 = 3.75f)
                    curveTo(x1 = 16.7949f, y1 = 3.75f, x2 = 18.25f, y2 = 5.20507f, x3 = 18.25f, y3 = 7.0f)
                    curveTo(x1 = 18.25f, y1 = 8.79493f, x2 = 16.7949f, y2 = 10.25f, x3 = 15.0f, y3 = 10.25f)
                    curveTo(x1 = 13.5951f, y1 = 10.25f, x2 = 12.3984f, y2 = 9.35861f, x3 = 11.9447f, y3 = 8.11057f)
                    moveTo(x = 2.75f, y = 12.75f)
                    horizontalLineTo(x = 6.75f)
                    verticalLineTo(y = 21.25f)
                    horizontalLineTo(x = 2.75f)
                    verticalLineTo(y = 12.75f)
                    close()
                }
            }.build()
            .also { _moneyHand = it }
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
                imageVector = MoneyHand,
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
private var _moneyHand: ImageVector? = null
