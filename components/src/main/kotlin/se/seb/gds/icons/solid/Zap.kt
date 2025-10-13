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

internal val Zap: ImageVector
    get() {
        val current = _zap
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Zap",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 14.0f, y = 1.75005f)
                curveTo(x1 = 14.0f, y1 = 1.42403f, x2 = 13.7894f, y2 = 1.13535f, x3 = 13.4789f, y3 = 1.03584f)
                curveTo(x1 = 13.1685f, y1 = 0.936333f, x2 = 12.8293f, y2 = 1.04879f, x3 = 12.6397f, y3 = 1.31407f)
                lineTo(x = 3.13974f, y = 14.6114f)
                curveTo(x1 = 2.97642f, y1 = 14.84f, x2 = 2.95456f, y2 = 15.1407f, x3 = 3.08311f, y3 = 15.3905f)
                curveTo(x1 = 3.21166f, y1 = 15.6403f, x2 = 3.46905f, y2 = 15.7973f, x3 = 3.75f, y3 = 15.7973f)
                horizontalLineTo(x = 10.0f)
                verticalLineTo(y = 22.2501f)
                curveTo(x1 = 10.0f, y1 = 22.5771f, x2 = 10.2119f, y2 = 22.8664f, x3 = 10.5236f, y3 = 22.9651f)
                curveTo(x1 = 10.8354f, y1 = 23.0638f, x2 = 11.1752f, y2 = 22.9491f, x3 = 11.3634f, y3 = 22.6817f)
                lineTo(x = 20.8634f, y = 9.18167f)
                curveTo(x1 = 21.0245f, y1 = 8.95269f, x2 = 21.0447f, y2 = 8.65303f, x3 = 20.9157f, y3 = 8.40452f)
                curveTo(x1 = 20.7867f, y1 = 8.15601f, x2 = 20.53f, y2 = 8.00005f, x3 = 20.25f, y3 = 8.00005f)
                horizontalLineTo(x = 14.0f)
                verticalLineTo(y = 1.75005f)
                close()
            }
        }.build().also { _zap = it }
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
                imageVector = Zap,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _zap: ImageVector? = null
