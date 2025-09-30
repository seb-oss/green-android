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

val Maintenance: ImageVector
    get() {
        val current = _maintenance
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Maintenance",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 16.8878f, y = 3.11219f)
                    curveTo(x1 = 17.1388f, y1 = 2.86121f, x2 = 17.0545f, y2 = 2.43727f, x3 = 16.7154f, y3 = 2.33256f)
                    curveTo(x1 = 16.0152f, y1 = 2.11639f, x2 = 15.2712f, y2 = 2.0f, x3 = 14.5f, y3 = 2.0f)
                    curveTo(x1 = 10.3579f, y1 = 2.0f, x2 = 7.00001f, y2 = 5.35786f, x3 = 7.00001f, y3 = 9.5f)
                    curveTo(x1 = 7.00001f, y1 = 10.5332f, x2 = 7.20892f, y2 = 11.5176f, x3 = 7.5868f, y3 = 12.4132f)
                    lineTo(x = 2.03034f, y = 17.9697f)
                    curveTo(x1 = 1.73745f, y1 = 18.2626f, x2 = 1.73745f, y2 = 18.7374f, x3 = 2.03034f, y3 = 19.0303f)
                    lineTo(x = 4.96968f, y = 21.9697f)
                    curveTo(x1 = 5.26257f, y1 = 22.2626f, x2 = 5.73745f, y2 = 22.2626f, x3 = 6.03034f, y3 = 21.9697f)
                    lineTo(x = 11.5868f, y = 16.4132f)
                    curveTo(x1 = 12.4825f, y1 = 16.7911f, x2 = 13.4668f, y2 = 17.0f, x3 = 14.5f, y3 = 17.0f)
                    curveTo(x1 = 18.6421f, y1 = 17.0f, x2 = 22.0f, y2 = 13.6421f, x3 = 22.0f, y3 = 9.5f)
                    curveTo(x1 = 22.0f, y1 = 8.72883f, x2 = 21.8836f, y2 = 7.98484f, x3 = 21.6674f, y3 = 7.28464f)
                    curveTo(x1 = 21.5627f, y1 = 6.9455f, x2 = 21.1388f, y2 = 6.86121f, x3 = 20.8878f, y3 = 7.11219f)
                    lineTo(x = 18.0f, y = 10.0f)
                    curveTo(x1 = 16.8954f, y1 = 11.1046f, x2 = 15.1046f, y2 = 11.1046f, x3 = 14.0f, y3 = 10.0f)
                    curveTo(x1 = 12.8954f, y1 = 8.89543f, x2 = 12.8954f, y2 = 7.10457f, x3 = 14.0f, y3 = 6.0f)
                    lineTo(x = 16.8878f, y = 3.11219f)
                    close()
                }
            }.build()
            .also { _maintenance = it }
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
                imageVector = Maintenance,
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
private var _maintenance: ImageVector? = null
