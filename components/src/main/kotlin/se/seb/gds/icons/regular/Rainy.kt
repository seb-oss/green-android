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

internal val Rainy: ImageVector
    get() {
        val current = _rainy
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Rainy",
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
                moveTo(x = 11.8227f, y = 17.75f)
                lineTo(x = 10.7773f, y = 20.25f)
                moveTo(x = 6.8f, y = 17.75f)
                lineTo(x = 5.75f, y = 20.25f)
                moveTo(x = 16.8228f, y = 17.75f)
                lineTo(x = 15.7773f, y = 20.25f)
                moveTo(x = 9.42188f, y = 14.25f)
                horizontalLineTo(x = 16.125f)
                curveTo(x1 = 18.4032f, y1 = 14.25f, x2 = 20.25f, y2 = 12.3777f, x3 = 20.25f, y3 = 10.0682f)
                curveTo(x1 = 20.25f, y1 = 7.75863f, x2 = 18.4032f, y2 = 5.88636f, x3 = 16.125f, y3 = 5.88636f)
                curveTo(x1 = 15.5908f, y1 = 5.88636f, x2 = 15.0803f, y2 = 5.98932f, x3 = 14.6117f, y3 = 6.17673f)
                curveTo(x1 = 13.7313f, y1 = 4.15838f, x2 = 11.7388f, y2 = 2.75f, x3 = 9.42188f, y3 = 2.75f)
                curveTo(x1 = 6.28939f, y1 = 2.75f, x2 = 3.75f, y2 = 5.32436f, x3 = 3.75f, y3 = 8.5f)
                curveTo(x1 = 3.75f, y1 = 11.6756f, x2 = 6.28939f, y2 = 14.25f, x3 = 9.42188f, y3 = 14.25f)
                close()
            }
        }.build().also { _rainy = it }
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
                imageVector = Rainy,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _rainy: ImageVector? = null
