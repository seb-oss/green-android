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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val Archive: ImageVector
    get() {
        val current = _archive
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Archive",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 2.75f, y = 3.0f)
                curveTo(x1 = 2.33579f, y1 = 3.0f, x2 = 2.0f, y2 = 3.33579f, x3 = 2.0f, y3 = 3.75f)
                verticalLineTo(y = 6.25f)
                curveTo(x1 = 2.0f, y1 = 6.66421f, x2 = 2.33579f, y2 = 7.0f, x3 = 2.75f, y3 = 7.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 7.0f, x2 = 22.0f, y2 = 6.66421f, x3 = 22.0f, y3 = 6.25f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 22.0f, y1 = 3.33579f, x2 = 21.6642f, y2 = 3.0f, x3 = 21.25f, y3 = 3.0f)
                horizontalLineTo(x = 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.0f, y = 20.25f)
                verticalLineTo(y = 8.5f)
                horizontalLineTo(x = 21.0f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                close()
                moveTo(x = 10.0f, y = 11.0f)
                curveTo(x1 = 9.58579f, y1 = 11.0f, x2 = 9.25f, y2 = 11.3358f, x3 = 9.25f, y3 = 11.75f)
                curveTo(x1 = 9.25f, y1 = 12.1642f, x2 = 9.58579f, y2 = 12.5f, x3 = 10.0f, y3 = 12.5f)
                horizontalLineTo(x = 14.0f)
                curveTo(x1 = 14.4142f, y1 = 12.5f, x2 = 14.75f, y2 = 12.1642f, x3 = 14.75f, y3 = 11.75f)
                curveTo(x1 = 14.75f, y1 = 11.3358f, x2 = 14.4142f, y2 = 11.0f, x3 = 14.0f, y3 = 11.0f)
                horizontalLineTo(x = 10.0f)
                close()
            }
        }.build().also { _archive = it }
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
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _archive: ImageVector? = null
