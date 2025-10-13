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

internal val PencilWave: ImageVector
    get() {
        val current = _pencilWave
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.PencilWave",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 16.4697f, y = 2.21967f)
                curveTo(x1 = 16.7626f, y1 = 1.92678f, x2 = 17.2374f, y2 = 1.92678f, x3 = 17.5303f, y3 = 2.21967f)
                lineTo(x = 20.7803f, y = 5.46967f)
                curveTo(x1 = 21.0732f, y1 = 5.76256f, x2 = 21.0732f, y2 = 6.23744f, x3 = 20.7803f, y3 = 6.53033f)
                lineTo(x = 6.53033f, y = 20.7803f)
                curveTo(x1 = 6.38968f, y1 = 20.921f, x2 = 6.19891f, y2 = 21.0f, x3 = 6.0f, y3 = 21.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 21.0f, x2 = 2.0f, y2 = 20.6642f, x3 = 2.0f, y3 = 20.25f)
                verticalLineTo(y = 17.0f)
                curveTo(x1 = 2.0f, y1 = 16.8011f, x2 = 2.07902f, y2 = 16.6103f, x3 = 2.21967f, y3 = 16.4697f)
                lineTo(x = 16.4697f, y = 2.21967f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 21.4903f, y = 17.4324f)
                curveTo(x1 = 21.1769f, y1 = 17.1618f, x2 = 20.7035f, y2 = 17.1963f, x3 = 20.4327f, y3 = 17.5095f)
                lineTo(x = 20.4261f, y = 17.5168f)
                curveTo(x1 = 20.4192f, y1 = 17.5246f, x2 = 20.4075f, y2 = 17.5374f, x3 = 20.3914f, y3 = 17.5547f)
                curveTo(x1 = 20.3592f, y1 = 17.5892f, x2 = 20.3095f, y2 = 17.641f, x3 = 20.2446f, y3 = 17.7043f)
                curveTo(x1 = 20.1139f, y1 = 17.8317f, x2 = 19.9261f, y2 = 18.0013f, x3 = 19.699f, y3 = 18.1696f)
                curveTo(x1 = 19.2229f, y1 = 18.5224f, x2 = 18.675f, y2 = 18.7944f, x3 = 18.166f, y3 = 18.7944f)
                curveTo(x1 = 17.6346f, y1 = 18.7944f, x2 = 17.124f, y2 = 18.5421f, x3 = 16.4177f, y3 = 18.1672f)
                lineTo(x = 16.3494f, y = 18.131f)
                curveTo(x1 = 15.7225f, y1 = 17.7975f, x2 = 14.9093f, y2 = 17.365f, x3 = 13.9866f, y3 = 17.365f)
                curveTo(x1 = 12.2062f, y1 = 17.365f, x2 = 11.1671f, y2 = 18.2154f, x3 = 10.2046f, y3 = 19.2352f)
                curveTo(x1 = 9.92027f, y1 = 19.5364f, x2 = 9.93398f, y2 = 20.0111f, x3 = 10.2352f, y3 = 20.2954f)
                curveTo(x1 = 10.5364f, y1 = 20.5797f, x2 = 11.0111f, y2 = 20.566f, x3 = 11.2954f, y3 = 20.2648f)
                curveTo(x1 = 12.1526f, y1 = 19.3567f, x2 = 12.8215f, y2 = 18.865f, x3 = 13.9866f, y3 = 18.865f)
                curveTo(x1 = 14.5028f, y1 = 18.865f, x2 = 15.0037f, y2 = 19.1149f, x3 = 15.7145f, y3 = 19.4922f)
                lineTo(x = 15.7677f, y = 19.5205f)
                curveTo(x1 = 16.4011f, y1 = 19.8571f, x2 = 17.2241f, y2 = 20.2944f, x3 = 18.166f, y3 = 20.2944f)
                curveTo(x1 = 19.1571f, y1 = 20.2944f, x2 = 20.0262f, y2 = 19.7942f, x3 = 20.5921f, y3 = 19.3748f)
                curveTo(x1 = 20.886f, y1 = 19.157f, x2 = 21.1254f, y2 = 18.9405f, x3 = 21.2917f, y3 = 18.7783f)
                curveTo(x1 = 21.3753f, y1 = 18.6968f, x2 = 21.4415f, y2 = 18.628f, x3 = 21.4881f, y3 = 18.578f)
                curveTo(x1 = 21.5114f, y1 = 18.5531f, x2 = 21.5299f, y2 = 18.5328f, x3 = 21.5432f, y3 = 18.5179f)
                lineTo(x = 21.5593f, y = 18.4997f)
                lineTo(x = 21.5645f, y = 18.4939f)
                lineTo(x = 21.5663f, y = 18.4918f)
                lineTo(x = 21.5676f, y = 18.4903f)
                curveTo(x1 = 21.5676f, y1 = 18.4903f, x2 = 21.5676f, y2 = 18.4903f, x3 = 21.0f, y3 = 18.0f)
                lineTo(x = 21.5676f, y = 18.4903f)
                curveTo(x1 = 21.8383f, y1 = 18.1768f, x2 = 21.8037f, y2 = 17.7032f, x3 = 21.4903f, y3 = 17.4324f)
                close()
            }
        }.build().also { _pencilWave = it }
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
                imageVector = PencilWave,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _pencilWave: ImageVector? = null
