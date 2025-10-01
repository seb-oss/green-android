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

val LightBulb: ImageVector
    get() {
        val current = _lightBulb
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.LightBulb",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.9998f, y = 9.00089f)
                curveTo(x1 = 19.9998f, y1 = 11.249f, x2 = 19.072f, y2 = 13.2807f, x3 = 17.5803f, y3 = 14.7334f)
                horizontalLineTo(x = 6.41753f)
                curveTo(x1 = 4.9259f, y1 = 13.2807f, x2 = 3.99805f, y2 = 11.249f, x3 = 3.99805f, y3 = 9.00089f)
                curveTo(x1 = 3.99805f, y1 = 4.58212f, x2 = 7.58016f, y2 = 1.0f, x3 = 11.9989f, y3 = 1.0f)
                curveTo(x1 = 16.4177f, y1 = 1.0f, x2 = 19.9998f, y2 = 4.58212f, x3 = 19.9998f, y3 = 9.00089f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 7.99775f, y = 18.25f)
                verticalLineTo(y = 16.2334f)
                horizontalLineTo(x = 16.0001f)
                verticalLineTo(y = 18.25f)
                curveTo(x1 = 16.0001f, y1 = 18.6642f, x2 = 15.6643f, y2 = 19.0f, x3 = 15.2501f, y3 = 19.0f)
                horizontalLineTo(x = 8.74775f)
                curveTo(x1 = 8.33354f, y1 = 19.0f, x2 = 7.99775f, y2 = 18.6642f, x3 = 7.99775f, y3 = 18.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 8.75f, y = 20.5f)
                curveTo(x1 = 8.33579f, y1 = 20.5f, x2 = 8.0f, y2 = 20.8358f, x3 = 8.0f, y3 = 21.25f)
                curveTo(x1 = 8.0f, y1 = 21.6642f, x2 = 8.33579f, y2 = 22.0f, x3 = 8.75f, y3 = 22.0f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 15.6642f, y1 = 22.0f, x2 = 16.0f, y2 = 21.6642f, x3 = 16.0f, y3 = 21.25f)
                curveTo(x1 = 16.0f, y1 = 20.8358f, x2 = 15.6642f, y2 = 20.5f, x3 = 15.25f, y3 = 20.5f)
                horizontalLineTo(x = 8.75f)
                close()
            }
        }.build().also { _lightBulb = it }
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
                imageVector = LightBulb,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lightBulb: ImageVector? = null
