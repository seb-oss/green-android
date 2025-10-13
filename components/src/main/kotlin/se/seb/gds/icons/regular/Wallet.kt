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

internal val Wallet: ImageVector
    get() {
        val current = _wallet
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Wallet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Square,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.75f, y = 6.5f)
                verticalLineTo(y = 17.25f)
                curveTo(x1 = 3.75f, y1 = 18.9069f, x2 = 5.09315f, y2 = 20.25f, x3 = 6.75f, y3 = 20.25f)
                horizontalLineTo(x = 20.25f)
                verticalLineTo(y = 8.75f)
                horizontalLineTo(x = 16.25f)
                moveTo(x = 3.75f, y = 6.5f)
                curveTo(x1 = 3.75f, y1 = 7.74264f, x2 = 4.75736f, y2 = 8.75f, x3 = 6.0f, y3 = 8.75f)
                horizontalLineTo(x = 16.25f)
                moveTo(x = 3.75f, y = 6.5f)
                curveTo(x1 = 3.75f, y1 = 4.98122f, x2 = 4.98122f, y2 = 3.75f, x3 = 6.5f, y3 = 3.75f)
                horizontalLineTo(x = 16.25f)
                verticalLineTo(y = 8.75f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 0.5f,
            ) {
                moveTo(x = 15.5f, y = 13.75f)
                curveTo(x1 = 15.9142f, y1 = 13.75f, x2 = 16.25f, y2 = 14.0858f, x3 = 16.25f, y3 = 14.5f)
                curveTo(x1 = 16.25f, y1 = 14.9142f, x2 = 15.9142f, y2 = 15.25f, x3 = 15.5f, y3 = 15.25f)
                curveTo(x1 = 15.0858f, y1 = 15.25f, x2 = 14.75f, y2 = 14.9142f, x3 = 14.75f, y3 = 14.5f)
                curveTo(x1 = 14.75f, y1 = 14.0858f, x2 = 15.0858f, y2 = 13.75f, x3 = 15.5f, y3 = 13.75f)
                close()
            }
        }.build().also { _wallet = it }
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
                imageVector = Wallet,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _wallet: ImageVector? = null
