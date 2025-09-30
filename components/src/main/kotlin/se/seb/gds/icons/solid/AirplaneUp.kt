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

val AirplaneUp: ImageVector
    get() {
        val current = _airplaneUp
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.AirplaneUp",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 18.0799f, y = 4.11251f)
                    curveTo(x1 = 17.5868f, y1 = 4.0224f, x2 = 17.0804f, y2 = 4.0673f, x3 = 16.6095f, y3 = 4.24666f)
                    curveTo(x1 = 15.0299f, y1 = 4.84827f, x2 = 10.2771f, y2 = 6.65651f, x3 = 8.26179f, y3 = 7.40193f)
                    curveTo(x1 = 7.90222f, y1 = 7.53492f, x2 = 7.50317f, y2 = 7.49913f, x3 = 7.17102f, y3 = 7.30272f)
                    lineTo(x = 4.54044f, y = 5.74721f)
                    curveTo(x1 = 4.34608f, y1 = 5.63229f, x2 = 4.11029f, y2 = 5.61104f, x3 = 3.89852f, y3 = 5.68937f)
                    lineTo(x = 1.48983f, y = 6.58027f)
                    curveTo(x1 = 1.27478f, y1 = 6.65981f, x2 = 1.10793f, y2 = 6.83335f, x3 = 1.0369f, y3 = 7.05136f)
                    curveTo(x1 = 0.965869f, y1 = 7.26937f, x2 = 0.998466f, y2 = 7.50789f, x3 = 1.12539f, y3 = 7.69885f)
                    lineTo(x = 3.24376f, y = 10.886f)
                    lineTo(x = 2.83814f, y = 11.6471f)
                    curveTo(x1 = 2.73417f, y1 = 11.8421f, x2 = 2.72155f, y2 = 12.0731f, x3 = 2.80365f, y3 = 12.2784f)
                    lineTo(x = 3.07547f, y = 12.9579f)
                    curveTo(x1 = 3.63163f, y1 = 14.3483f, x2 = 5.19803f, y2 = 15.0381f, x3 = 6.5992f, y3 = 14.5097f)
                    lineTo(x = 9.36931f, y = 13.465f)
                    lineTo(x = 9.65651f, y = 15.8592f)
                    curveTo(x1 = 9.68386f, y1 = 16.0871f, x2 = 9.81414f, y2 = 16.29f, x3 = 10.0101f, y3 = 16.4098f)
                    curveTo(x1 = 10.206f, y1 = 16.5295f, x2 = 10.446f, y2 = 16.5529f, x3 = 10.6613f, y3 = 16.4733f)
                    lineTo(x = 13.5518f, y = 15.4042f)
                    curveTo(x1 = 13.7289f, y1 = 15.3387f, x2 = 13.8748f, y2 = 15.2087f, x3 = 13.9603f, y3 = 15.0403f)
                    lineTo(x = 16.0409f, y = 10.9426f)
                    lineTo(x = 20.7606f, y = 9.05235f)
                    curveTo(x1 = 21.6602f, y1 = 8.69204f, x2 = 22.25f, y2 = 7.8205f, x3 = 22.25f, y3 = 6.8514f)
                    curveTo(x1 = 22.25f, y1 = 5.70636f, x2 = 21.4316f, y2 = 4.72493f, x3 = 20.3053f, y3 = 4.51911f)
                    lineTo(x = 18.0799f, y = 4.11251f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 2.75f, y = 18.4998f)
                    curveTo(x1 = 2.33579f, y1 = 18.4998f, x2 = 2.0f, y2 = 18.8356f, x3 = 2.0f, y3 = 19.2498f)
                    curveTo(x1 = 2.0f, y1 = 19.664f, x2 = 2.33579f, y2 = 19.9998f, x3 = 2.75f, y3 = 19.9998f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 19.9998f, x2 = 22.0f, y2 = 19.664f, x3 = 22.0f, y3 = 19.2498f)
                    curveTo(x1 = 22.0f, y1 = 18.8356f, x2 = 21.6642f, y2 = 18.4998f, x3 = 21.25f, y3 = 18.4998f)
                    horizontalLineTo(x = 2.75f)
                    close()
                }
            }.build()
            .also { _airplaneUp = it }
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
                imageVector = AirplaneUp,
                contentDescription = null,
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _airplaneUp: ImageVector? = null
