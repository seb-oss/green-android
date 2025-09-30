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

val Bubble: ImageVector
    get() {
        val current = _bubble
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Bubble",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 21.2522f, y = 3.0f)
                    curveTo(x1 = 21.6664f, y1 = 3.0f, x2 = 22.0022f, y2 = 3.33579f, x3 = 22.0022f, y3 = 3.75f)
                    verticalLineTo(y = 18.25f)
                    curveTo(x1 = 22.0022f, y1 = 18.6642f, x2 = 21.6664f, y2 = 19.0f, x3 = 21.2522f, y3 = 19.0f)
                    horizontalLineTo(x = 12.1948f)
                    lineTo(x = 7.36364f, y = 21.6572f)
                    curveTo(x1 = 7.13129f, y1 = 21.785f, x2 = 6.84873f, y2 = 21.7806f, x3 = 6.62048f, y3 = 21.6456f)
                    curveTo(x1 = 6.39222f, y1 = 21.5106f, x2 = 6.2522f, y2 = 21.2652f, x3 = 6.2522f, y3 = 21.0f)
                    verticalLineTo(y = 19.0f)
                    horizontalLineTo(x = 2.7522f)
                    curveTo(x1 = 2.33798f, y1 = 19.0f, x2 = 2.0022f, y2 = 18.6642f, x3 = 2.0022f, y3 = 18.25f)
                    verticalLineTo(y = 3.75f)
                    curveTo(x1 = 2.0022f, y1 = 3.33579f, x2 = 2.33798f, y2 = 3.0f, x3 = 2.7522f, y3 = 3.0f)
                    horizontalLineTo(x = 21.2522f)
                    close()
                }
            }.build()
            .also { _bubble = it }
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
                imageVector = Bubble,
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
private var _bubble: ImageVector? = null
