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

val ArrowWallRight: ImageVector
    get() {
        val current = _arrowWallRight
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowWallRight",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 22.0f, y = 4.75f)
                    curveTo(x1 = 22.0f, y1 = 4.33579f, x2 = 21.6642f, y2 = 4.0f, x3 = 21.25f, y3 = 4.0f)
                    curveTo(x1 = 20.8358f, y1 = 4.0f, x2 = 20.5f, y2 = 4.33579f, x3 = 20.5f, y3 = 4.75f)
                    verticalLineTo(y = 19.25f)
                    curveTo(x1 = 20.5f, y1 = 19.6642f, x2 = 20.8358f, y2 = 20.0f, x3 = 21.25f, y3 = 20.0f)
                    curveTo(x1 = 21.6642f, y1 = 20.0f, x2 = 22.0f, y2 = 19.6642f, x3 = 22.0f, y3 = 19.25f)
                    verticalLineTo(y = 4.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 13.5303f, y = 7.21967f)
                    curveTo(x1 = 13.2374f, y1 = 6.92678f, x2 = 12.7626f, y2 = 6.92678f, x3 = 12.4697f, y3 = 7.21967f)
                    curveTo(x1 = 12.1768f, y1 = 7.51256f, x2 = 12.1768f, y2 = 7.98744f, x3 = 12.4697f, y3 = 8.28033f)
                    lineTo(x = 15.4393f, y = 11.25f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 11.25f, x2 = 2.0f, y2 = 11.5858f, x3 = 2.0f, y3 = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 12.4142f, x2 = 2.33579f, y2 = 12.75f, x3 = 2.75f, y3 = 12.75f)
                    horizontalLineTo(x = 15.4393f)
                    lineTo(x = 12.4697f, y = 15.7197f)
                    curveTo(x1 = 12.1768f, y1 = 16.0126f, x2 = 12.1768f, y2 = 16.4874f, x3 = 12.4697f, y3 = 16.7803f)
                    curveTo(x1 = 12.7626f, y1 = 17.0732f, x2 = 13.2374f, y2 = 17.0732f, x3 = 13.5303f, y3 = 16.7803f)
                    lineTo(x = 17.7803f, y = 12.5303f)
                    curveTo(x1 = 17.921f, y1 = 12.3897f, x2 = 18.0f, y2 = 12.1989f, x3 = 18.0f, y3 = 12.0f)
                    curveTo(x1 = 18.0f, y1 = 11.8011f, x2 = 17.921f, y2 = 11.6103f, x3 = 17.7803f, y3 = 11.4697f)
                    lineTo(x = 13.5303f, y = 7.21967f)
                    close()
                }
            }.build()
            .also { _arrowWallRight = it }
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
                imageVector = ArrowWallRight,
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
private var _arrowWallRight: ImageVector? = null
