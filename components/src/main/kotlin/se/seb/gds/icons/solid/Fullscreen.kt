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

val Fullscreen: ImageVector
    get() {
        val current = _fullscreen
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Fullscreen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.0f, y = 3.75f)
                curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                horizontalLineTo(x = 8.25f)
                curveTo(x1 = 8.66421f, y1 = 3.0f, x2 = 9.0f, y2 = 3.33579f, x3 = 9.0f, y3 = 3.75f)
                curveTo(x1 = 9.0f, y1 = 4.16421f, x2 = 8.66421f, y2 = 4.5f, x3 = 8.25f, y3 = 4.5f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 8.25f)
                curveTo(x1 = 4.5f, y1 = 8.66421f, x2 = 4.16421f, y2 = 9.0f, x3 = 3.75f, y3 = 9.0f)
                curveTo(x1 = 3.33579f, y1 = 9.0f, x2 = 3.0f, y2 = 8.66421f, x3 = 3.0f, y3 = 8.25f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 15.0f, y = 3.75f)
                curveTo(x1 = 15.0f, y1 = 3.33579f, x2 = 15.3358f, y2 = 3.0f, x3 = 15.75f, y3 = 3.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 3.0f, x2 = 21.0f, y2 = 3.33579f, x3 = 21.0f, y3 = 3.75f)
                verticalLineTo(y = 8.25f)
                curveTo(x1 = 21.0f, y1 = 8.66421f, x2 = 20.6642f, y2 = 9.0f, x3 = 20.25f, y3 = 9.0f)
                curveTo(x1 = 19.8358f, y1 = 9.0f, x2 = 19.5f, y2 = 8.66421f, x3 = 19.5f, y3 = 8.25f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 15.75f)
                curveTo(x1 = 15.3358f, y1 = 4.5f, x2 = 15.0f, y2 = 4.16421f, x3 = 15.0f, y3 = 3.75f)
                close()
                moveTo(x = 3.75f, y = 15.0f)
                curveTo(x1 = 4.16421f, y1 = 15.0f, x2 = 4.5f, y2 = 15.3358f, x3 = 4.5f, y3 = 15.75f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 8.25f)
                curveTo(x1 = 8.66421f, y1 = 19.5f, x2 = 9.0f, y2 = 19.8358f, x3 = 9.0f, y3 = 20.25f)
                curveTo(x1 = 9.0f, y1 = 20.6642f, x2 = 8.66421f, y2 = 21.0f, x3 = 8.25f, y3 = 21.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                verticalLineTo(y = 15.75f)
                curveTo(x1 = 3.0f, y1 = 15.3358f, x2 = 3.33579f, y2 = 15.0f, x3 = 3.75f, y3 = 15.0f)
                close()
                moveTo(x = 20.25f, y = 15.0f)
                curveTo(x1 = 20.6642f, y1 = 15.0f, x2 = 21.0f, y2 = 15.3358f, x3 = 21.0f, y3 = 15.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 15.75f)
                curveTo(x1 = 15.3358f, y1 = 21.0f, x2 = 15.0f, y2 = 20.6642f, x3 = 15.0f, y3 = 20.25f)
                curveTo(x1 = 15.0f, y1 = 19.8358f, x2 = 15.3358f, y2 = 19.5f, x3 = 15.75f, y3 = 19.5f)
                horizontalLineTo(x = 19.5f)
                verticalLineTo(y = 15.75f)
                curveTo(x1 = 19.5f, y1 = 15.3358f, x2 = 19.8358f, y2 = 15.0f, x3 = 20.25f, y3 = 15.0f)
                close()
            }
        }.build().also { _fullscreen = it }
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
                imageVector = Fullscreen,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _fullscreen: ImageVector? = null
