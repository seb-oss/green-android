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

val FastForward: ImageVector
    get() {
        val current = _fastForward
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.FastForward",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 5.19429f, y = 5.14577f)
                curveTo(x1 = 4.96646f, y1 = 4.97824f, x2 = 4.66376f, y2 = 4.95311f, x3 = 4.41141f, y3 = 5.08078f)
                curveTo(x1 = 4.15907f, y1 = 5.20845f, x2 = 4.0f, y2 = 5.4672f, x3 = 4.0f, y3 = 5.75f)
                verticalLineTo(y = 18.25f)
                curveTo(x1 = 4.0f, y1 = 18.5328f, x2 = 4.15907f, y2 = 18.7916f, x3 = 4.41141f, y3 = 18.9192f)
                curveTo(x1 = 4.66376f, y1 = 19.0469f, x2 = 4.96646f, y2 = 19.0218f, x3 = 5.19429f, y3 = 18.8542f)
                lineTo(x = 12.0f, y = 13.85f)
                verticalLineTo(y = 18.25f)
                curveTo(x1 = 12.0f, y1 = 18.5328f, x2 = 12.1591f, y2 = 18.7916f, x3 = 12.4114f, y3 = 18.9192f)
                curveTo(x1 = 12.6638f, y1 = 19.0469f, x2 = 12.9665f, y2 = 19.0218f, x3 = 13.1943f, y3 = 18.8542f)
                lineTo(x = 21.6943f, y = 12.6042f)
                curveTo(x1 = 21.8865f, y1 = 12.4629f, x2 = 22.0f, y2 = 12.2386f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 11.7614f, x2 = 21.8865f, y2 = 11.5371f, x3 = 21.6943f, y3 = 11.3958f)
                lineTo(x = 13.1943f, y = 5.14577f)
                curveTo(x1 = 12.9665f, y1 = 4.97824f, x2 = 12.6638f, y2 = 4.95311f, x3 = 12.4114f, y3 = 5.08078f)
                curveTo(x1 = 12.1591f, y1 = 5.20845f, x2 = 12.0f, y2 = 5.4672f, x3 = 12.0f, y3 = 5.75f)
                verticalLineTo(y = 10.15f)
                lineTo(x = 5.19429f, y = 5.14577f)
                close()
            }
        }.build().also { _fastForward = it }
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
                imageVector = FastForward,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _fastForward: ImageVector? = null
