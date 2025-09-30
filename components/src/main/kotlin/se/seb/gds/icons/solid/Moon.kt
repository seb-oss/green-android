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

val Moon: ImageVector
    get() {
        val current = _moon
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Moon",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.0f, y = 2.0f)
                    curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 11.9319f, x2 = 21.9993f, y2 = 11.8639f, x3 = 21.998f, y3 = 11.7962f)
                    curveTo(x1 = 21.9924f, y1 = 11.5186f, x2 = 21.834f, y2 = 11.2669f, x3 = 21.5862f, y3 = 11.1417f)
                    curveTo(x1 = 21.3384f, y1 = 11.0166f, x2 = 21.0418f, y2 = 11.0385f, x3 = 20.8151f, y3 = 11.1988f)
                    curveTo(x1 = 19.8784f, y1 = 11.861f, x2 = 18.7358f, y2 = 12.25f, x3 = 17.5f, y3 = 12.25f)
                    curveTo(x1 = 14.3244f, y1 = 12.25f, x2 = 11.75f, y2 = 9.67564f, x3 = 11.75f, y3 = 6.5f)
                    curveTo(x1 = 11.75f, y1 = 5.26425f, x2 = 12.139f, y2 = 4.12157f, x3 = 12.8012f, y3 = 3.18485f)
                    curveTo(x1 = 12.9615f, y1 = 2.95819f, x2 = 12.9834f, y2 = 2.66155f, x3 = 12.8583f, y3 = 2.41377f)
                    curveTo(x1 = 12.7331f, y1 = 2.16599f, x2 = 12.4814f, y2 = 2.0076f, x3 = 12.2038f, y3 = 2.00204f)
                    curveTo(x1 = 12.136f, y1 = 2.00068f, x2 = 12.0681f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    close()
                }
            }.build()
            .also { _moon = it }
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
                imageVector = Moon,
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
private var _moon: ImageVector? = null
