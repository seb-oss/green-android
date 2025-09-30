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

val Television: ImageVector
    get() {
        val current = _television
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Television",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 2.0f, y = 3.75f)
                    curveTo(x1 = 2.0f, y1 = 3.33579f, x2 = 2.33579f, y2 = 3.0f, x3 = 2.75f, y3 = 3.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 3.0f, x2 = 22.0f, y2 = 3.33579f, x3 = 22.0f, y3 = 3.75f)
                    verticalLineTo(y = 16.25f)
                    curveTo(x1 = 22.0f, y1 = 16.6642f, x2 = 21.6642f, y2 = 17.0f, x3 = 21.25f, y3 = 17.0f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 17.0f, x2 = 2.0f, y2 = 16.6642f, x3 = 2.0f, y3 = 16.25f)
                    verticalLineTo(y = 3.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 6.24416f, y = 20.9592f)
                    curveTo(x1 = 8.05294f, y1 = 20.337f, x2 = 9.9879f, y2 = 20.0f, x3 = 12.0002f, y3 = 20.0f)
                    curveTo(x1 = 14.0125f, y1 = 20.0f, x2 = 15.9475f, y2 = 20.337f, x3 = 17.7563f, y3 = 20.9592f)
                    curveTo(x1 = 18.1479f, y1 = 21.0939f, x2 = 18.5747f, y2 = 20.8856f, x3 = 18.7094f, y3 = 20.494f)
                    curveTo(x1 = 18.8442f, y1 = 20.1023f, x2 = 18.6358f, y2 = 19.6755f, x3 = 18.2442f, y3 = 19.5408f)
                    curveTo(x1 = 16.2809f, y1 = 18.8655f, x2 = 14.1812f, y2 = 18.5f, x3 = 12.0002f, y3 = 18.5f)
                    curveTo(x1 = 9.8192f, y1 = 18.5f, x2 = 7.71949f, y2 = 18.8655f, x3 = 5.75625f, y3 = 19.5408f)
                    curveTo(x1 = 5.36456f, y1 = 19.6755f, x2 = 5.15626f, y2 = 20.1023f, x3 = 5.29099f, y3 = 20.494f)
                    curveTo(x1 = 5.42572f, y1 = 20.8856f, x2 = 5.85247f, y2 = 21.0939f, x3 = 6.24416f, y3 = 20.9592f)
                    close()
                }
            }.build()
            .also { _television = it }
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
                imageVector = Television,
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
private var _television: ImageVector? = null
