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

val Dollar: ImageVector
    get() {
        val current = _dollar
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Dollar",
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
                moveTo(x = 12.0f, y = 7.375f)
                verticalLineTo(y = 6.34722f)
                moveTo(x = 12.0f, y = 16.625f)
                verticalLineTo(y = 17.6528f)
                moveTo(x = 14.2257f, y = 8.91667f)
                curveTo(x1 = 13.7814f, y1 = 8.30226f, x2 = 12.9511f, y2 = 7.88889f, x3 = 12.0f, y3 = 7.88889f)
                horizontalLineTo(x = 11.7145f)
                curveTo(x1 = 10.4531f, y1 = 7.88889f, x2 = 9.43056f, y2 = 8.70694f, x3 = 9.43056f, y3 = 9.71605f)
                verticalLineTo(y = 9.79449f)
                curveTo(x1 = 9.43056f, y1 = 10.5163f, x2 = 9.94031f, y2 = 11.1761f, x3 = 10.7473f, y3 = 11.4989f)
                lineTo(x = 13.2527f, y = 12.5011f)
                curveTo(x1 = 14.0597f, y1 = 12.8239f, x2 = 14.5694f, y2 = 13.4837f, x3 = 14.5694f, y3 = 14.2055f)
                curveTo(x1 = 14.5694f, y1 = 15.2579f, x2 = 13.503f, y2 = 16.1111f, x3 = 12.1874f, y3 = 16.1111f)
                horizontalLineTo(x = 12.0f)
                curveTo(x1 = 11.0489f, y1 = 16.1111f, x2 = 10.2186f, y2 = 15.6977f, x3 = 9.7743f, y3 = 15.0833f)
                moveTo(x = 21.25f, y = 12.0f)
                curveTo(x1 = 21.25f, y1 = 17.1086f, x2 = 17.1086f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                curveTo(x1 = 6.89137f, y1 = 21.25f, x2 = 2.75f, y2 = 17.1086f, x3 = 2.75f, y3 = 12.0f)
                curveTo(x1 = 2.75f, y1 = 6.89137f, x2 = 6.89137f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 17.1086f, y1 = 2.75f, x2 = 21.25f, y2 = 6.89137f, x3 = 21.25f, y3 = 12.0f)
                close()
            }
        }.build().also { _dollar = it }
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
                imageVector = Dollar,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _dollar: ImageVector? = null
