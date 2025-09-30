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

val Rainy: ImageVector
    get() {
        val current = _rainy
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Rainy",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 9.42188f, y = 2.0f)
                    curveTo(x1 = 5.86553f, y1 = 2.0f, x2 = 3.0f, y2 = 4.91986f, x3 = 3.0f, y3 = 8.5f)
                    curveTo(x1 = 3.0f, y1 = 12.0801f, x2 = 5.86553f, y2 = 15.0f, x3 = 9.42188f, y3 = 15.0f)
                    horizontalLineTo(x = 16.125f)
                    curveTo(x1 = 18.827f, y1 = 15.0f, x2 = 21.0f, y2 = 12.7822f, x3 = 21.0f, y3 = 10.0682f)
                    curveTo(x1 = 21.0f, y1 = 7.35412f, x2 = 18.827f, y2 = 5.13636f, x3 = 16.125f, y3 = 5.13636f)
                    curveTo(x1 = 15.7367f, y1 = 5.13636f, x2 = 15.3585f, y2 = 5.18243f, x3 = 14.9956f, y3 = 5.26957f)
                    curveTo(x1 = 13.8902f, y1 = 3.32006f, x2 = 11.8116f, y2 = 2.0f, x3 = 9.42188f, y3 = 2.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 7.49149f, y = 18.0404f)
                    curveTo(x1 = 7.65188f, y1 = 17.6585f, x2 = 7.47232f, y2 = 17.2189f, x3 = 7.09042f, y3 = 17.0585f)
                    curveTo(x1 = 6.70853f, y1 = 16.8981f, x2 = 6.26891f, y2 = 17.0777f, x3 = 6.10851f, y3 = 17.4596f)
                    lineTo(x = 5.05851f, y = 19.9596f)
                    curveTo(x1 = 4.89812f, y1 = 20.3415f, x2 = 5.07768f, y2 = 20.7811f, x3 = 5.45958f, y3 = 20.9415f)
                    curveTo(x1 = 5.84147f, y1 = 21.1019f, x2 = 6.28109f, y2 = 20.9223f, x3 = 6.44149f, y3 = 20.5404f)
                    lineTo(x = 7.49149f, y = 18.0404f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.5147f, y = 18.0394f)
                    curveTo(x1 = 12.6745f, y1 = 17.6572f, x2 = 12.4942f, y2 = 17.2179f, x3 = 12.1121f, y3 = 17.0581f)
                    curveTo(x1 = 11.7299f, y1 = 16.8983f, x2 = 11.2906f, y2 = 17.0785f, x3 = 11.1308f, y3 = 17.4606f)
                    lineTo(x = 10.0853f, y = 19.9606f)
                    curveTo(x1 = 9.92553f, y1 = 20.3428f, x2 = 10.1058f, y2 = 20.7821f, x3 = 10.4879f, y3 = 20.9419f)
                    curveTo(x1 = 10.8701f, y1 = 21.1017f, x2 = 11.3094f, y2 = 20.9215f, x3 = 11.4692f, y3 = 20.5394f)
                    lineTo(x = 12.5147f, y = 18.0394f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.5147f, y = 18.0394f)
                    curveTo(x1 = 17.6745f, y1 = 17.6572f, x2 = 17.4943f, y2 = 17.2179f, x3 = 17.1122f, y3 = 17.0581f)
                    curveTo(x1 = 16.73f, y1 = 16.8983f, x2 = 16.2907f, y2 = 17.0785f, x3 = 16.1309f, y3 = 17.4606f)
                    lineTo(x = 15.0854f, y = 19.9606f)
                    curveTo(x1 = 14.9256f, y1 = 20.3428f, x2 = 15.1058f, y2 = 20.7821f, x3 = 15.488f, y3 = 20.9419f)
                    curveTo(x1 = 15.8701f, y1 = 21.1017f, x2 = 16.3095f, y2 = 20.9215f, x3 = 16.4693f, y3 = 20.5394f)
                    lineTo(x = 17.5147f, y = 18.0394f)
                    close()
                }
            }.build()
            .also { _rainy = it }
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
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _rainy: ImageVector? = null
