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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val BrandFacebook: ImageVector
    get() {
        val current = _brandFacebook
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BrandFacebook",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 9.58404f, y = 21.706f)
                    verticalLineTo(y = 15.0561f)
                    horizontalLineTo(x = 7.52015f)
                    verticalLineTo(y = 12.0f)
                    horizontalLineTo(x = 9.58404f)
                    verticalLineTo(y = 10.6833f)
                    curveTo(x1 = 9.58404f, y1 = 7.27944f, x2 = 11.124f, y2 = 5.70333f, x3 = 14.464f, y3 = 5.70333f)
                    curveTo(x1 = 15.0963f, y1 = 5.70333f, x2 = 16.1879f, y2 = 5.82722f, x3 = 16.6363f, y3 = 5.95111f)
                    verticalLineTo(y = 8.71944f)
                    curveTo(x1 = 16.4001f, y1 = 8.69556f, x2 = 15.9879f, y2 = 8.68333f, x3 = 15.4801f, y3 = 8.68333f)
                    curveTo(x1 = 13.8401f, y1 = 8.68333f, x2 = 13.2079f, y2 = 9.30333f, x3 = 13.2079f, y3 = 10.9194f)
                    verticalLineTo(y = 12.0f)
                    horizontalLineTo(x = 16.4763f)
                    lineTo(x = 15.9163f, y = 15.0556f)
                    horizontalLineTo(x = 13.2124f)
                    verticalLineTo(y = 21.9277f)
                    curveTo(x1 = 18.1637f, y1 = 21.3279f, x2 = 22.0f, y2 = 17.112f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 6.47722f, x2 = 17.5228f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    curveTo(x1 = 6.47722f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47722f, x3 = 2.0f, y3 = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 16.6899f, x2 = 5.22813f, y2 = 20.6253f, x3 = 9.58404f, y3 = 21.706f)
                    close()
                }
            }.build()
            .also { _brandFacebook = it }
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
                imageVector = BrandFacebook,
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
private var _brandFacebook: ImageVector? = null
