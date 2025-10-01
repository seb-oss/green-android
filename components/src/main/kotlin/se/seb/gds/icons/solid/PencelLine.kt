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

val PencelLine: ImageVector
    get() {
        val current = _pencelLine
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PencelLine",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.5303f, y = 2.21967f)
                    curveTo(
                        x1 = 17.2374f,
                        y1 = 1.92678f,
                        x2 = 16.7626f,
                        y2 = 1.92678f,
                        x3 = 16.4697f,
                        y3 = 2.21967f,
                    )
                    lineTo(x = 2.21967f, y = 16.4697f)
                    curveTo(
                        x1 = 2.07902f,
                        y1 = 16.6103f,
                        x2 = 2.0f,
                        y2 = 16.8011f,
                        x3 = 2.0f,
                        y3 = 17.0f,
                    )
                    verticalLineTo(y = 21.25f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 21.6642f,
                        x2 = 2.33579f,
                        y2 = 22.0f,
                        x3 = 2.75f,
                        y3 = 22.0f,
                    )
                    horizontalLineTo(x = 7.0f)
                    curveTo(
                        x1 = 7.19891f,
                        y1 = 22.0f,
                        x2 = 7.38968f,
                        y2 = 21.921f,
                        x3 = 7.53033f,
                        y3 = 21.7803f,
                    )
                    lineTo(x = 21.7803f, y = 7.53033f)
                    curveTo(
                        x1 = 22.0732f,
                        y1 = 7.23744f,
                        x2 = 22.0732f,
                        y2 = 6.76256f,
                        x3 = 21.7803f,
                        y3 = 6.46967f,
                    )
                    lineTo(x = 17.5303f, y = 2.21967f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.75f, y = 20.5f)
                    curveTo(
                        x1 = 12.3358f,
                        y1 = 20.5f,
                        x2 = 12.0f,
                        y2 = 20.8358f,
                        x3 = 12.0f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 12.0f,
                        y1 = 21.6642f,
                        x2 = 12.3358f,
                        y2 = 22.0f,
                        x3 = 12.75f,
                        y3 = 22.0f,
                    )
                    horizontalLineTo(x = 21.25f)
                    curveTo(
                        x1 = 21.6642f,
                        y1 = 22.0f,
                        x2 = 22.0f,
                        y2 = 21.6642f,
                        x3 = 22.0f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 20.8358f,
                        x2 = 21.6642f,
                        y2 = 20.5f,
                        x3 = 21.25f,
                        y3 = 20.5f,
                    )
                    horizontalLineTo(x = 12.75f)
                    close()
                }
            }.build()
            .also { _pencelLine = it }
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
                imageVector = PencelLine,
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
private var _pencelLine: ImageVector? = null
