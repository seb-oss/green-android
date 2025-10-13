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

internal val Mute: ImageVector
    get() {
        val current = _mute
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Mute",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.0f, y = 5.93934f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 17.0f, y1 = 3.47592f, x2 = 16.8505f, y2 = 3.22366f, x3 = 16.6101f, y3 = 3.09208f)
                curveTo(x1 = 16.3696f, y1 = 2.9605f, x2 = 16.0766f, y2 = 2.97055f, x3 = 15.8457f, y3 = 3.1183f)
                lineTo(x = 9.78055f, y = 7.0f)
                horizontalLineTo(x = 5.75f)
                curveTo(x1 = 5.33579f, y1 = 7.0f, x2 = 5.0f, y2 = 7.33579f, x3 = 5.0f, y3 = 7.75f)
                verticalLineTo(y = 16.25f)
                curveTo(x1 = 5.0f, y1 = 16.6642f, x2 = 5.33579f, y2 = 17.0f, x3 = 5.75f, y3 = 17.0f)
                horizontalLineTo(x = 5.93934f)
                lineTo(x = 3.21967f, y = 19.7197f)
                curveTo(x1 = 2.92678f, y1 = 20.0126f, x2 = 2.92678f, y2 = 20.4874f, x3 = 3.21967f, y3 = 20.7803f)
                curveTo(x1 = 3.51256f, y1 = 21.0732f, x2 = 3.98744f, y2 = 21.0732f, x3 = 4.28033f, y3 = 20.7803f)
                lineTo(x = 20.7803f, y = 4.28033f)
                curveTo(x1 = 21.0732f, y1 = 3.98744f, x2 = 21.0732f, y2 = 3.51256f, x3 = 20.7803f, y3 = 3.21967f)
                curveTo(x1 = 20.4874f, y1 = 2.92678f, x2 = 20.0126f, y2 = 2.92678f, x3 = 19.7197f, y3 = 3.21967f)
                lineTo(x = 17.0f, y = 5.93934f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 15.8457f, y = 20.8817f)
                lineTo(x = 10.0243f, y = 17.156f)
                lineTo(x = 17.0f, y = 10.1803f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 17.0f, y1 = 20.5241f, x2 = 16.8505f, y2 = 20.7763f, x3 = 16.6101f, y3 = 20.9079f)
                curveTo(x1 = 16.3696f, y1 = 21.0395f, x2 = 16.0766f, y2 = 21.0294f, x3 = 15.8457f, y3 = 20.8817f)
                close()
            }
        }.build().also { _mute = it }
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
                imageVector = Mute,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mute: ImageVector? = null
