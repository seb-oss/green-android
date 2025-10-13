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

internal val Arrow: ImageVector
    get() {
        val current = _arrow
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Arrow",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 13.0f, y = 21.0f)
                curveTo(x1 = 13.5523f, y1 = 21.0f, x2 = 14.0f, y2 = 20.5523f, x3 = 14.0f, y3 = 20.0f)
                curveTo(x1 = 14.0f, y1 = 19.4477f, x2 = 13.5523f, y2 = 19.0f, x3 = 13.0f, y3 = 19.0f)
                curveTo(x1 = 12.4477f, y1 = 19.0f, x2 = 12.0f, y2 = 19.4477f, x3 = 12.0f, y3 = 20.0f)
                curveTo(x1 = 12.0f, y1 = 20.5523f, x2 = 12.4477f, y2 = 21.0f, x3 = 13.0f, y3 = 21.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 21.0f, y = 11.0f)
                curveTo(x1 = 21.0f, y1 = 10.4477f, x2 = 20.5523f, y2 = 9.99999f, x3 = 20.0f, y3 = 9.99999f)
                curveTo(x1 = 19.4477f, y1 = 9.99999f, x2 = 19.0f, y2 = 10.4477f, x3 = 19.0f, y3 = 11.0f)
                curveTo(x1 = 19.0f, y1 = 11.5523f, x2 = 19.4477f, y2 = 12.0f, x3 = 20.0f, y3 = 12.0f)
                curveTo(x1 = 20.5523f, y1 = 12.0f, x2 = 21.0f, y2 = 11.5523f, x3 = 21.0f, y3 = 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.9295f, y = 14.2679f)
                curveTo(x1 = 20.4078f, y1 = 14.5441f, x2 = 20.5716f, y2 = 15.1557f, x3 = 20.2955f, y3 = 15.634f)
                curveTo(x1 = 20.0193f, y1 = 16.1123f, x2 = 19.4078f, y2 = 16.2761f, x3 = 18.9295f, y3 = 16.0f)
                curveTo(x1 = 18.4512f, y1 = 15.7238f, x2 = 18.2873f, y2 = 15.1123f, x3 = 18.5634f, y3 = 14.634f)
                curveTo(x1 = 18.8396f, y1 = 14.1557f, x2 = 19.4512f, y2 = 13.9918f, x3 = 19.9295f, y3 = 14.2679f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.3676f, y = 19.2942f)
                curveTo(x1 = 17.8459f, y1 = 19.0181f, x2 = 18.0098f, y2 = 18.4065f, x3 = 17.7336f, y3 = 17.9282f)
                curveTo(x1 = 17.4575f, y1 = 17.4499f, x2 = 16.8459f, y2 = 17.286f, x3 = 16.3676f, y3 = 17.5621f)
                curveTo(x1 = 15.8893f, y1 = 17.8383f, x2 = 15.7254f, y2 = 18.4499f, x3 = 16.0016f, y3 = 18.9282f)
                curveTo(x1 = 16.2777f, y1 = 19.4065f, x2 = 16.8893f, y2 = 19.5703f, x3 = 17.3676f, y3 = 19.2942f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 18.9269f, y = 7.99998f)
                curveTo(x1 = 18.4487f, y1 = 8.27612f, x2 = 17.8371f, y2 = 8.11225f, x3 = 17.5609f, y3 = 7.63396f)
                curveTo(x1 = 17.2848f, y1 = 7.15566f, x2 = 17.4487f, y2 = 6.54407f, x3 = 17.9269f, y3 = 6.26793f)
                curveTo(x1 = 18.4052f, y1 = 5.99179f, x2 = 19.0168f, y2 = 6.15566f, x3 = 19.293f, y3 = 6.63396f)
                curveTo(x1 = 19.5691f, y1 = 7.11225f, x2 = 19.4052f, y2 = 7.72384f, x3 = 18.9269f, y3 = 7.99998f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.25f, y = 14.75f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 3.75f)
                moveTo(x = 9.0f, y = 19.6876f)
                curveTo(x1 = 5.92698f, y1 = 18.4875f, x2 = 3.75f, y2 = 15.498f, x3 = 3.75f, y3 = 12.0f)
                curveTo(x1 = 3.75f, y1 = 7.44365f, x2 = 7.44365f, y2 = 3.75f, x3 = 12.0f, y3 = 3.75f)
                curveTo(x1 = 13.1537f, y1 = 3.75f, x2 = 14.2521f, y2 = 3.98683f, x3 = 15.2493f, y3 = 4.41452f)
            }
        }.build().also { _arrow = it }
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
                imageVector = Arrow,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrow: ImageVector? = null
