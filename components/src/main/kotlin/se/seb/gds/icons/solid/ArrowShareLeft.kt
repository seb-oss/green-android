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

val ArrowShareLeft: ImageVector
    get() {
        val current = _arrowShareLeft
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowShareLeft",
                defaultWidth = 25.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 25.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.0f, y = 3.75001f)
                    curveTo(
                        x1 = 12.0f,
                        y1 = 3.45624f,
                        x2 = 11.8285f,
                        y2 = 3.18951f,
                        x3 = 11.5612f,
                        y3 = 3.06762f,
                    )
                    curveTo(
                        x1 = 11.2939f,
                        y1 = 2.94572f,
                        x2 = 10.98f,
                        y2 = 2.99111f,
                        x3 = 10.7582f,
                        y3 = 3.18374f,
                    )
                    lineTo(x = 1.25824f, y = 11.4337f)
                    curveTo(
                        x1 = 1.0942f,
                        y1 = 11.5762f,
                        x2 = 1.0f,
                        y2 = 11.7828f,
                        x3 = 1.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 1.0f,
                        y1 = 12.2173f,
                        x2 = 1.0942f,
                        y2 = 12.4238f,
                        x3 = 1.25824f,
                        y3 = 12.5663f,
                    )
                    lineTo(x = 10.7582f, y = 20.8163f)
                    curveTo(
                        x1 = 10.98f,
                        y1 = 21.0089f,
                        x2 = 11.2939f,
                        y2 = 21.0543f,
                        x3 = 11.5612f,
                        y3 = 20.9324f,
                    )
                    curveTo(
                        x1 = 11.8285f,
                        y1 = 20.8105f,
                        x2 = 12.0f,
                        y2 = 20.5438f,
                        x3 = 12.0f,
                        y3 = 20.25f,
                    )
                    verticalLineTo(y = 16.2549f)
                    curveTo(
                        x1 = 15.7435f,
                        y1 = 16.305f,
                        x2 = 17.7023f,
                        y2 = 16.7368f,
                        x3 = 18.881f,
                        y3 = 17.4029f,
                    )
                    curveTo(
                        x1 = 20.0758f,
                        y1 = 18.0783f,
                        x2 = 20.5524f,
                        y2 = 19.0318f,
                        x3 = 21.3053f,
                        y3 = 20.5376f,
                    )
                    lineTo(x = 21.3292f, y = 20.5854f)
                    curveTo(
                        x1 = 21.4847f,
                        y1 = 20.8965f,
                        x2 = 21.8338f,
                        y2 = 21.0599f,
                        x3 = 22.1723f,
                        y3 = 20.9799f,
                    )
                    curveTo(
                        x1 = 22.5108f,
                        y1 = 20.9f,
                        x2 = 22.75f,
                        y2 = 20.5978f,
                        x3 = 22.75f,
                        y3 = 20.25f,
                    )
                    curveTo(
                        x1 = 22.75f,
                        y1 = 15.9846f,
                        x2 = 22.198f,
                        y2 = 12.7949f,
                        x3 = 20.3793f,
                        y3 = 10.6963f,
                    )
                    curveTo(
                        x1 = 18.6425f,
                        y1 = 8.69239f,
                        x2 = 15.9068f,
                        y2 = 7.8511f,
                        x3 = 12.0f,
                        y3 = 7.75867f,
                    )
                    verticalLineTo(y = 3.75001f)
                    close()
                }
            }.build()
            .also { _arrowShareLeft = it }
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
                imageVector = ArrowShareLeft,
                contentDescription = null,
                modifier =
                Modifier
                    .width((25.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowShareLeft: ImageVector? = null
