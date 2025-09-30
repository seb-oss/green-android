package se.seb.gds.icons.regular

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

val Archive: ImageVector
    get() {
        val current = _archive
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Archive",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 20.25f, y = 7.75f)
                    horizontalLineTo(x = 21.0f)
                    curveTo(x1 = 21.0f, y1 = 7.33579f, x2 = 20.6642f, y2 = 7.0f, x3 = 20.25f, y3 = 7.0f)
                    verticalLineTo(y = 7.75f)
                    close()
                    moveTo(x = 20.25f, y = 20.25f)
                    verticalLineTo(y = 21.0f)
                    curveTo(x1 = 20.6642f, y1 = 21.0f, x2 = 21.0f, y2 = 20.6642f, x3 = 21.0f, y3 = 20.25f)
                    horizontalLineTo(x = 20.25f)
                    close()
                    moveTo(x = 3.75f, y = 20.25f)
                    horizontalLineTo(x = 3.0f)
                    curveTo(x1 = 3.0f, y1 = 20.6642f, x2 = 3.33579f, y2 = 21.0f, x3 = 3.75f, y3 = 21.0f)
                    verticalLineTo(y = 20.25f)
                    close()
                    moveTo(x = 3.75f, y = 7.75f)
                    verticalLineTo(y = 7.0f)
                    curveTo(x1 = 3.33579f, y1 = 7.0f, x2 = 3.0f, y2 = 7.33579f, x3 = 3.0f, y3 = 7.75f)
                    horizontalLineTo(x = 3.75f)
                    close()
                    moveTo(x = 2.75f, y = 3.75f)
                    verticalLineTo(y = 3.0f)
                    curveTo(x1 = 2.33579f, y1 = 3.0f, x2 = 2.0f, y2 = 3.33579f, x3 = 2.0f, y3 = 3.75f)
                    horizontalLineTo(x = 2.75f)
                    close()
                    moveTo(x = 21.25f, y = 3.75f)
                    horizontalLineTo(x = 22.0f)
                    curveTo(x1 = 22.0f, y1 = 3.33579f, x2 = 21.6642f, y2 = 3.0f, x3 = 21.25f, y3 = 3.0f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 21.25f, y = 7.75f)
                    verticalLineTo(y = 8.5f)
                    curveTo(x1 = 21.6642f, y1 = 8.5f, x2 = 22.0f, y2 = 8.16421f, x3 = 22.0f, y3 = 7.75f)
                    horizontalLineTo(x = 21.25f)
                    close()
                    moveTo(x = 2.75f, y = 7.75f)
                    horizontalLineTo(x = 2.0f)
                    curveTo(x1 = 2.0f, y1 = 8.16421f, x2 = 2.33579f, y2 = 8.5f, x3 = 2.75f, y3 = 8.5f)
                    verticalLineTo(y = 7.75f)
                    close()
                    moveTo(x = 10.0f, y = 11.0f)
                    curveTo(x1 = 9.58579f, y1 = 11.0f, x2 = 9.25f, y2 = 11.3358f, x3 = 9.25f, y3 = 11.75f)
                    curveTo(x1 = 9.25f, y1 = 12.1642f, x2 = 9.58579f, y2 = 12.5f, x3 = 10.0f, y3 = 12.5f)
                    verticalLineTo(y = 11.0f)
                    close()
                    moveTo(x = 14.0f, y = 12.5f)
                    curveTo(x1 = 14.4142f, y1 = 12.5f, x2 = 14.75f, y2 = 12.1642f, x3 = 14.75f, y3 = 11.75f)
                    curveTo(x1 = 14.75f, y1 = 11.3358f, x2 = 14.4142f, y2 = 11.0f, x3 = 14.0f, y3 = 11.0f)
                    verticalLineTo(y = 12.5f)
                    close()
                    moveTo(x = 20.25f, y = 7.75f)
                    horizontalLineTo(x = 19.5f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 20.25f)
                    horizontalLineTo(x = 21.0f)
                    verticalLineTo(y = 7.75f)
                    horizontalLineTo(x = 20.25f)
                    close()
                    moveTo(x = 20.25f, y = 20.25f)
                    verticalLineTo(y = 19.5f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 20.25f)
                    verticalLineTo(y = 21.0f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 20.25f)
                    close()
                    moveTo(x = 3.75f, y = 20.25f)
                    horizontalLineTo(x = 4.5f)
                    verticalLineTo(y = 7.75f)
                    horizontalLineTo(x = 3.75f)
                    horizontalLineTo(x = 3.0f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 3.75f)
                    close()
                    moveTo(x = 3.75f, y = 7.75f)
                    verticalLineTo(y = 8.5f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 7.75f)
                    verticalLineTo(y = 7.0f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 7.75f)
                    close()
                    moveTo(x = 2.75f, y = 3.75f)
                    verticalLineTo(y = 4.5f)
                    horizontalLineTo(x = 21.25f)
                    verticalLineTo(y = 3.75f)
                    verticalLineTo(y = 3.0f)
                    horizontalLineTo(x = 2.75f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 21.25f, y = 3.75f)
                    horizontalLineTo(x = 20.5f)
                    verticalLineTo(y = 7.75f)
                    horizontalLineTo(x = 21.25f)
                    horizontalLineTo(x = 22.0f)
                    verticalLineTo(y = 3.75f)
                    horizontalLineTo(x = 21.25f)
                    close()
                    moveTo(x = 21.25f, y = 7.75f)
                    verticalLineTo(y = 7.0f)
                    horizontalLineTo(x = 2.75f)
                    verticalLineTo(y = 7.75f)
                    verticalLineTo(y = 8.5f)
                    horizontalLineTo(x = 21.25f)
                    verticalLineTo(y = 7.75f)
                    close()
                    moveTo(x = 2.75f, y = 7.75f)
                    horizontalLineTo(x = 3.5f)
                    verticalLineTo(y = 3.75f)
                    horizontalLineTo(x = 2.75f)
                    horizontalLineTo(x = 2.0f)
                    verticalLineTo(y = 7.75f)
                    horizontalLineTo(x = 2.75f)
                    close()
                    moveTo(x = 10.0f, y = 11.75f)
                    verticalLineTo(y = 12.5f)
                    horizontalLineTo(x = 14.0f)
                    verticalLineTo(y = 11.75f)
                    verticalLineTo(y = 11.0f)
                    horizontalLineTo(x = 10.0f)
                    verticalLineTo(y = 11.75f)
                    close()
                }
            }.build()
            .also { _archive = it }
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
                imageVector = Archive,
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
private var _archive: ImageVector? = null
