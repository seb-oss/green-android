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

val PaperPlaneTopRight: ImageVector
    get() {
        val current = _paperPlaneTopRight
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PaperPlaneTopRight",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 1.0615f, y = 3.4526f)
                    curveTo(x1 = 1.18016f, y1 = 3.17789f, x2 = 1.45077f, y2 = 3.0f, x3 = 1.75002f, y3 = 3.0f)
                    horizontalLineTo(x = 22.25f)
                    curveTo(x1 = 22.5186f, y1 = 3.0f, x2 = 22.7667f, y2 = 3.14366f, x3 = 22.9005f, y3 = 3.37663f)
                    curveTo(x1 = 23.0342f, y1 = 3.60959f, x2 = 23.0331f, y2 = 3.89629f, x3 = 22.8976f, y3 = 4.12825f)
                    lineTo(x = 12.3848f, y = 22.1282f)
                    curveTo(x1 = 12.2329f, y1 = 22.3884f, x2 = 11.9399f, y2 = 22.5324f, x3 = 11.6411f, y3 = 22.4938f)
                    curveTo(x1 = 11.3423f, y1 = 22.4552f, x2 = 11.0956f, y2 = 22.2415f, x3 = 11.0147f, y3 = 21.9513f)
                    lineTo(x = 8.33914f, y = 12.3462f)
                    lineTo(x = 14.9742f, y = 8.65542f)
                    curveTo(x1 = 15.3362f, y1 = 8.45407f, x2 = 15.4664f, y2 = 7.9974f, x3 = 15.265f, y3 = 7.63542f)
                    curveTo(x1 = 15.0637f, y1 = 7.27344f, x2 = 14.607f, y2 = 7.14322f, x3 = 14.245f, y3 = 7.34458f)
                    lineTo(x = 7.59005f, y = 11.0464f)
                    lineTo(x = 1.20398f, y = 4.26414f)
                    curveTo(x1 = 0.998839f, y1 = 4.04627f, x2 = 0.942841f, y2 = 3.72731f, x3 = 1.0615f, y3 = 3.4526f)
                    close()
                }
            }.build()
            .also { _paperPlaneTopRight = it }
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
                imageVector = PaperPlaneTopRight,
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
private var _paperPlaneTopRight: ImageVector? = null
