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

val BrandPlayStore: ImageVector
    get() {
        val current = _brandPlayStore
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BrandPlayStore",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.90955f, y = 2.01344f)
                    curveTo(x1 = 5.28183f, y1 = 1.96523f, x2 = 5.65934f, y2 = 2.0476f, x3 = 5.97744f, y3 = 2.24644f)
                    lineTo(x = 16.8232f, y = 8.39588f)
                    lineTo(x = 14.0784f, y = 11.1669f)
                    lineTo(x = 4.90955f, y = 2.01344f)
                    close()
                    moveTo(x = 4.07526f, y = 2.84557f)
                    curveTo(x1 = 4.02295f, y1 = 3.02673f, x2 = 3.99765f, y2 = 3.21459f, x3 = 4.00017f, y3 = 3.4031f)
                    verticalLineTo(y = 20.5949f)
                    curveTo(x1 = 3.99765f, y1 = 20.7834f, x2 = 4.02295f, y2 = 20.9713f, x3 = 4.07526f, y3 = 21.1524f)
                    lineTo(x = 13.2525f, y = 11.999f)
                    lineTo(x = 4.07526f, y = 2.84557f)
                    close()
                    moveTo(x = 14.0868f, y = 12.8311f)
                    lineTo(x = 4.90955f, y = 21.9846f)
                    curveTo(x1 = 5.28201f, y1 = 22.0371f, x2 = 5.66101f, y2 = 21.9544f, x3 = 5.97744f, y3 = 21.7516f)
                    lineTo(x = 16.8232f, y = 15.6021f)
                    lineTo(x = 14.0868f, y = 12.8311f)
                    close()
                    moveTo(x = 21.1949f, y = 10.8839f)
                    lineTo(x = 17.9078f, y = 9.01998f)
                    lineTo(x = 14.9044f, y = 11.999f)
                    lineTo(x = 17.8995f, y = 14.9863f)
                    lineTo(x = 21.1866f, y = 13.1224f)
                    curveTo(x1 = 22.2711f, y1 = 12.5066f, x2 = 22.2711f, y2 = 11.4914f, x3 = 21.1866f, y3 = 10.8756f)
                    lineTo(x = 21.1949f, y = 10.8839f)
                    close()
                }
            }.build()
            .also { _brandPlayStore = it }
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
                imageVector = BrandPlayStore,
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
private var _brandPlayStore: ImageVector? = null
