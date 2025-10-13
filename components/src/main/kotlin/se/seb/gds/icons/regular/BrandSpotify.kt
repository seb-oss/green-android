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

internal val BrandSpotify: ImageVector
    get() {
        val current = _brandSpotify
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BrandSpotify",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.9993f, y = 2.0f)
                curveTo(x1 = 6.4765f, y1 = 2.0f, x2 = 1.99915f, y2 = 6.47723f, x3 = 1.99915f, y3 = 12.0001f)
                curveTo(x1 = 1.99915f, y1 = 17.5231f, x2 = 6.4765f, y2 = 22.0f, x3 = 11.9993f, y3 = 22.0f)
                curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 21.9996f, y2 = 17.5231f, x3 = 21.9996f, y3 = 12.0001f)
                curveTo(x1 = 21.9996f, y1 = 6.47759f, x2 = 17.5228f, y2 = 2.00048f, x3 = 11.9992f, y3 = 2.00048f)
                lineTo(x = 11.9993f, y = 2.0f)
                close()
                moveTo(x = 16.5853f, y = 16.423f)
                curveTo(x1 = 16.4062f, y1 = 16.7167f, x2 = 16.0217f, y2 = 16.8099f, x3 = 15.7279f, y3 = 16.6295f)
                curveTo(x1 = 13.38f, y1 = 15.1954f, x2 = 10.4242f, y2 = 14.8706f, x3 = 6.94329f, y3 = 15.6659f)
                curveTo(x1 = 6.60785f, y1 = 15.7423f, x2 = 6.27349f, y2 = 15.5321f, x3 = 6.19706f, y3 = 15.1966f)
                curveTo(x1 = 6.12028f, y1 = 14.861f, x2 = 6.32961f, y2 = 14.5266f, x3 = 6.66589f, y3 = 14.4502f)
                curveTo(x1 = 10.4752f, y1 = 13.5796f, x2 = 13.7428f, y2 = 13.9546f, x3 = 16.3788f, y3 = 15.5656f)
                curveTo(x1 = 16.6725f, y1 = 15.7459f, x2 = 16.7657f, y2 = 16.1292f, x3 = 16.5853f, y3 = 16.423f)
                close()
                moveTo(x = 17.8093f, y = 13.6997f)
                curveTo(x1 = 17.5837f, y1 = 14.0669f, x2 = 17.1036f, y2 = 14.1827f, x3 = 16.737f, y3 = 13.957f)
                curveTo(x1 = 14.049f, y1 = 12.3044f, x2 = 9.95147f, y2 = 11.826f, x3 = 6.77205f, y3 = 12.7911f)
                curveTo(x1 = 6.35971f, y1 = 12.9156f, x2 = 5.9242f, y2 = 12.6832f, x3 = 5.79905f, y3 = 12.2716f)
                curveTo(x1 = 5.67486f, y1 = 11.8593f, x2 = 5.90736f, y2 = 11.4246f, x3 = 6.31899f, y3 = 11.2992f)
                curveTo(x1 = 9.95076f, y1 = 10.1973f, x2 = 14.4657f, y2 = 10.731f, x3 = 17.5526f, y3 = 12.6279f)
                curveTo(x1 = 17.9192f, y1 = 12.8536f, x2 = 18.035f, y2 = 13.3336f, x3 = 17.8093f, y3 = 13.6997f)
                close()
                moveTo(x = 17.9144f, y = 10.8643f)
                curveTo(x1 = 14.6914f, y1 = 8.94996f, x2 = 9.37386f, y2 = 8.77394f, x3 = 6.29666f, y3 = 9.70789f)
                curveTo(x1 = 5.80252f, y1 = 9.85775f, x2 = 5.27996f, y2 = 9.5788f, x3 = 5.13021f, y3 = 9.08466f)
                curveTo(x1 = 4.98046f, y1 = 8.59028f, x2 = 5.25918f, y2 = 8.06808f, x3 = 5.75368f, y3 = 7.91785f)
                curveTo(x1 = 9.28609f, y1 = 6.84551f, x2 = 15.1583f, y2 = 7.05269f, x3 = 18.869f, y3 = 9.25554f)
                curveTo(x1 = 19.3145f, y1 = 9.51933f, x2 = 19.4601f, y2 = 10.0934f, x3 = 19.1962f, y3 = 10.5372f)
                curveTo(x1 = 18.9335f, y1 = 10.9817f, x2 = 18.3579f, y2 = 11.1282f, x3 = 17.9149f, y3 = 10.8643f)
                horizontalLineTo(x = 17.9144f)
                close()
            }
        }.build().also { _brandSpotify = it }
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
                imageVector = BrandSpotify,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brandSpotify: ImageVector? = null
