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

val Shield: ImageVector
    get() {
        val current = _shield
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Shield",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.2372f, y = 2.03849f)
                    curveTo(x1 = 12.0832f, y1 = 1.98717f, x2 = 11.9168f, y2 = 1.98717f, x3 = 11.7628f, y3 = 2.03849f)
                    lineTo(x = 3.51283f, y = 4.78849f)
                    curveTo(x1 = 3.20657f, y1 = 4.89057f, x2 = 3.0f, y2 = 5.17718f, x3 = 3.0f, y3 = 5.5f)
                    verticalLineTo(y = 11.9123f)
                    curveTo(x1 = 3.0f, y1 = 14.6497f, x2 = 4.18351f, y2 = 16.6701f, x3 = 5.85876f, y3 = 18.2596f)
                    curveTo(x1 = 7.5058f, y1 = 19.8225f, x2 = 9.65956f, y2 = 20.9975f, x3 = 11.6439f, y3 = 22.068f)
                    curveTo(x1 = 11.8662f, y1 = 22.1879f, x2 = 12.1338f, y2 = 22.1879f, x3 = 12.3561f, y3 = 22.068f)
                    curveTo(x1 = 14.3404f, y1 = 20.9975f, x2 = 16.4942f, y2 = 19.8225f, x3 = 18.1412f, y3 = 18.2596f)
                    curveTo(x1 = 19.8165f, y1 = 16.6701f, x2 = 21.0f, y2 = 14.6497f, x3 = 21.0f, y3 = 11.9123f)
                    verticalLineTo(y = 5.5f)
                    curveTo(x1 = 21.0f, y1 = 5.17718f, x2 = 20.7934f, y2 = 4.89057f, x3 = 20.4872f, y3 = 4.78849f)
                    lineTo(x = 12.2372f, y = 2.03849f)
                    close()
                }
            }.build()
            .also { _shield = it }
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
                imageVector = Shield,
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
private var _shield: ImageVector? = null
