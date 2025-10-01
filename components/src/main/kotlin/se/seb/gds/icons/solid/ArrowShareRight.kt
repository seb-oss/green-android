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

val ArrowShareRight: ImageVector
    get() {
        val current = _arrowShareRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowShareRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.75f, y = 3.75001f)
                curveTo(x1 = 11.75f, y1 = 3.45624f, x2 = 11.9215f, y2 = 3.18951f, x3 = 12.1888f, y3 = 3.06762f)
                curveTo(x1 = 12.4561f, y1 = 2.94572f, x2 = 12.77f, y2 = 2.99111f, x3 = 12.9918f, y3 = 3.18374f)
                lineTo(x = 22.4918f, y = 11.4337f)
                curveTo(x1 = 22.6558f, y1 = 11.5762f, x2 = 22.75f, y2 = 11.7828f, x3 = 22.75f, y3 = 12.0f)
                curveTo(x1 = 22.75f, y1 = 12.2173f, x2 = 22.6558f, y2 = 12.4238f, x3 = 22.4918f, y3 = 12.5663f)
                lineTo(x = 12.9918f, y = 20.8163f)
                curveTo(x1 = 12.77f, y1 = 21.0089f, x2 = 12.4561f, y2 = 21.0543f, x3 = 12.1888f, y3 = 20.9324f)
                curveTo(x1 = 11.9215f, y1 = 20.8105f, x2 = 11.75f, y2 = 20.5438f, x3 = 11.75f, y3 = 20.25f)
                verticalLineTo(y = 16.2549f)
                curveTo(x1 = 8.0065f, y1 = 16.305f, x2 = 6.04766f, y2 = 16.7368f, x3 = 4.86904f, y3 = 17.4029f)
                curveTo(x1 = 3.67425f, y1 = 18.0783f, x2 = 3.19755f, y2 = 19.0318f, x3 = 2.44475f, y3 = 20.5376f)
                lineTo(x = 2.42082f, y = 20.5854f)
                curveTo(x1 = 2.26526f, y1 = 20.8965f, x2 = 1.91621f, y2 = 21.0599f, x3 = 1.57768f, y3 = 20.9799f)
                curveTo(x1 = 1.23916f, y1 = 20.9f, x2 = 1.0f, y2 = 20.5978f, x3 = 1.0f, y3 = 20.25f)
                curveTo(x1 = 1.0f, y1 = 15.9846f, x2 = 1.55196f, y2 = 12.7949f, x3 = 3.37073f, y3 = 10.6963f)
                curveTo(x1 = 5.10747f, y1 = 8.69239f, x2 = 7.84317f, y2 = 7.8511f, x3 = 11.75f, y3 = 7.75867f)
                verticalLineTo(y = 3.75001f)
                close()
            }
        }.build().also { _arrowShareRight = it }
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
                imageVector = ArrowShareRight,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowShareRight: ImageVector? = null
