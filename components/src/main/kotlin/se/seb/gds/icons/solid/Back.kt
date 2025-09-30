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

val Back: ImageVector
    get() {
        val current = _back
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Back",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 18.8437f, y = 4.11957f)
                    curveTo(x1 = 19.0745f, y1 = 3.97087f, x2 = 19.368f, y2 = 3.96011f, x3 = 19.609f, y3 = 4.09151f)
                    curveTo(x1 = 19.85f, y1 = 4.22292f, x2 = 20.0f, y2 = 4.47549f, x3 = 20.0f, y3 = 4.75f)
                    verticalLineTo(y = 19.25f)
                    curveTo(x1 = 20.0f, y1 = 19.5245f, x2 = 19.85f, y2 = 19.7771f, x3 = 19.609f, y3 = 19.9085f)
                    curveTo(x1 = 19.368f, y1 = 20.0399f, x2 = 19.0745f, y2 = 20.0291f, x3 = 18.8437f, y3 = 19.8804f)
                    lineTo(x = 7.59372f, y = 12.6304f)
                    curveTo(x1 = 7.37946f, y1 = 12.4923f, x2 = 7.25f, y2 = 12.2549f, x3 = 7.25f, y3 = 12.0f)
                    curveTo(x1 = 7.25f, y1 = 11.7451f, x2 = 7.37946f, y2 = 11.5077f, x3 = 7.59372f, y3 = 11.3696f)
                    lineTo(x = 18.8437f, y = 4.11957f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.0f, y = 4.75f)
                    curveTo(x1 = 4.0f, y1 = 4.33579f, x2 = 4.33579f, y2 = 4.0f, x3 = 4.75f, y3 = 4.0f)
                    curveTo(x1 = 5.16421f, y1 = 4.0f, x2 = 5.5f, y2 = 4.33579f, x3 = 5.5f, y3 = 4.75f)
                    verticalLineTo(y = 19.25f)
                    curveTo(x1 = 5.5f, y1 = 19.6642f, x2 = 5.16421f, y2 = 20.0f, x3 = 4.75f, y3 = 20.0f)
                    curveTo(x1 = 4.33579f, y1 = 20.0f, x2 = 4.0f, y2 = 19.6642f, x3 = 4.0f, y3 = 19.25f)
                    verticalLineTo(y = 4.75f)
                    close()
                }
            }.build()
            .also { _back = it }
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
                imageVector = Back,
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
private var _back: ImageVector? = null
