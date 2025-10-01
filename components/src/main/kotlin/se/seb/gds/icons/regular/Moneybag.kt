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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Moneybag: ImageVector
    get() {
        val current = _moneybag
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Moneybag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.42188f, y = 7.75f)
                horizontalLineTo(x = 14.5781f)
                moveTo(x = 9.42188f, y = 7.75f)
                curveTo(x1 = 9.42188f, y1 = 7.75f, x2 = 3.74996f, y2 = 10.9722f, x3 = 3.75f, y3 = 16.1111f)
                curveTo(x1 = 3.75003f, y1 = 20.2435f, x2 = 7.85366f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                curveTo(x1 = 16.1463f, y1 = 21.25f, x2 = 20.25f, y2 = 20.2435f, x3 = 20.25f, y3 = 16.1111f)
                curveTo(x1 = 20.25f, y1 = 10.9722f, x2 = 14.5781f, y2 = 7.75f, x3 = 14.5781f, y3 = 7.75f)
                moveTo(x = 9.42188f, y = 7.75f)
                lineTo(x = 7.875f, y = 3.77778f)
                curveTo(x1 = 7.875f, y1 = 3.77778f, x2 = 9.42188f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 14.5781f, y1 = 2.75f, x2 = 16.125f, y2 = 3.77778f, x3 = 16.125f, y3 = 3.77778f)
                lineTo(x = 14.5781f, y = 7.75f)
            }
        }.build().also { _moneybag = it }
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
                imageVector = Moneybag,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _moneybag: ImageVector? = null
