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

val PiggyBank: ImageVector
    get() {
        val current = _piggyBank
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.PiggyBank",
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
                moveTo(x = 19.7181f, y = 14.5359f)
                curveTo(x1 = 20.0626f, y1 = 13.7609f, x2 = 20.254f, y2 = 12.9028f, x3 = 20.254f, y3 = 12.0f)
                curveTo(x1 = 20.254f, y1 = 8.54822f, x2 = 17.4558f, y2 = 5.75f, x3 = 14.004f, y3 = 5.75f)
                horizontalLineTo(x = 10.004f)
                curveTo(x1 = 9.93732f, y1 = 5.75f, x2 = 9.87088f, y2 = 5.75104f, x3 = 9.8047f, y3 = 5.75312f)
                curveTo(x1 = 8.32457f, y1 = 3.97909f, x2 = 6.38818f, y2 = 3.75f, x3 = 5.75f, y3 = 3.75f)
                verticalLineTo(y = 7.4211f)
                curveTo(x1 = 5.06066f, y1 = 8.06182f, x2 = 4.51621f, y2 = 8.85631f, x3 = 4.17124f, y3 = 9.75f)
                horizontalLineTo(x = 1.75f)
                verticalLineTo(y = 14.25f)
                horizontalLineTo(x = 4.17124f)
                curveTo(x1 = 4.51621f, y1 = 15.1437f, x2 = 5.06066f, y2 = 15.9382f, x3 = 5.75f, y3 = 16.5789f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 10.25f)
                verticalLineTo(y = 18.25f)
                horizontalLineTo(x = 13.75f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 18.25f)
                verticalLineTo(y = 16.5863f)
                curveTo(x1 = 18.8686f, y1 = 16.0134f, x2 = 19.371f, y2 = 15.3168f, x3 = 19.7181f, y3 = 14.5359f)
                close()
                moveTo(x = 19.7181f, y = 14.5359f)
                curveTo(x1 = 20.085f, y1 = 14.9725f, x2 = 20.6351f, y2 = 15.25f, x3 = 21.25f, y3 = 15.25f)
                curveTo(x1 = 22.3546f, y1 = 15.25f, x2 = 23.25f, y2 = 14.3546f, x3 = 23.25f, y3 = 13.25f)
                curveTo(x1 = 23.25f, y1 = 12.777f, x2 = 23.0858f, y2 = 12.3424f, x3 = 22.8113f, y3 = 12.0f)
                moveTo(x = 8.0f, y = 10.75f)
                horizontalLineTo(x = 8.5f)
                moveTo(x = 8.75f, y = 10.75f)
                curveTo(x1 = 8.75f, y1 = 11.0261f, x2 = 8.52614f, y2 = 11.25f, x3 = 8.25f, y3 = 11.25f)
                curveTo(x1 = 7.97386f, y1 = 11.25f, x2 = 7.75f, y2 = 11.0261f, x3 = 7.75f, y3 = 10.75f)
                curveTo(x1 = 7.75f, y1 = 10.4739f, x2 = 7.97386f, y2 = 10.25f, x3 = 8.25f, y3 = 10.25f)
                curveTo(x1 = 8.52614f, y1 = 10.25f, x2 = 8.75f, y2 = 10.4739f, x3 = 8.75f, y3 = 10.75f)
                close()
            }
        }.build().also { _piggyBank = it }
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
                imageVector = PiggyBank,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _piggyBank: ImageVector? = null
