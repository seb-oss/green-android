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

internal val Basket: ImageVector
    get() {
        val current = _basket
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Basket",
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
                moveTo(x = 1.75f, y = 2.75f)
                horizontalLineTo(x = 3.5f)
                lineTo(x = 6.0f, y = 15.25f)
                horizontalLineTo(x = 19.5f)
                lineTo(x = 21.25f, y = 5.75f)
                horizontalLineTo(x = 4.5f)
                moveTo(x = 9.25f, y = 19.0f)
                curveTo(x1 = 9.25f, y1 = 19.6904f, x2 = 8.69036f, y2 = 20.25f, x3 = 8.0f, y3 = 20.25f)
                curveTo(x1 = 7.30964f, y1 = 20.25f, x2 = 6.75f, y2 = 19.6904f, x3 = 6.75f, y3 = 19.0f)
                curveTo(x1 = 6.75f, y1 = 18.3096f, x2 = 7.30964f, y2 = 17.75f, x3 = 8.0f, y3 = 17.75f)
                curveTo(x1 = 8.69036f, y1 = 17.75f, x2 = 9.25f, y2 = 18.3096f, x3 = 9.25f, y3 = 19.0f)
                close()
                moveTo(x = 18.25f, y = 19.0f)
                curveTo(x1 = 18.25f, y1 = 19.6904f, x2 = 17.6904f, y2 = 20.25f, x3 = 17.0f, y3 = 20.25f)
                curveTo(x1 = 16.3096f, y1 = 20.25f, x2 = 15.75f, y2 = 19.6904f, x3 = 15.75f, y3 = 19.0f)
                curveTo(x1 = 15.75f, y1 = 18.3096f, x2 = 16.3096f, y2 = 17.75f, x3 = 17.0f, y3 = 17.75f)
                curveTo(x1 = 17.6904f, y1 = 17.75f, x2 = 18.25f, y2 = 18.3096f, x3 = 18.25f, y3 = 19.0f)
                close()
            }
        }.build().also { _basket = it }
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
                imageVector = Basket,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _basket: ImageVector? = null
