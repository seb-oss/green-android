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

internal val Block: ImageVector
    get() {
        val current = _block
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Block",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 4.0f, y = 3.75f)
                curveTo(x1 = 4.0f, y1 = 3.33579f, x2 = 4.33579f, y2 = 3.0f, x3 = 4.75f, y3 = 3.0f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.6642f, y1 = 3.0f, x2 = 20.0f, y2 = 3.33579f, x3 = 20.0f, y3 = 3.75f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 19.5f, x2 = 22.0f, y2 = 19.8358f, x3 = 22.0f, y3 = 20.25f)
                curveTo(x1 = 22.0f, y1 = 20.6642f, x2 = 21.6642f, y2 = 21.0f, x3 = 21.25f, y3 = 21.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 21.0f, x2 = 2.0f, y2 = 20.6642f, x3 = 2.0f, y3 = 20.25f)
                curveTo(x1 = 2.0f, y1 = 19.8358f, x2 = 2.33579f, y2 = 19.5f, x3 = 2.75f, y3 = 19.5f)
                horizontalLineTo(x = 4.0f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 8.0f, y = 7.75f)
                curveTo(x1 = 8.0f, y1 = 7.33579f, x2 = 8.33579f, y2 = 7.0f, x3 = 8.75f, y3 = 7.0f)
                horizontalLineTo(x = 10.25f)
                curveTo(x1 = 10.6642f, y1 = 7.0f, x2 = 11.0f, y2 = 7.33579f, x3 = 11.0f, y3 = 7.75f)
                curveTo(x1 = 11.0f, y1 = 8.16421f, x2 = 10.6642f, y2 = 8.5f, x3 = 10.25f, y3 = 8.5f)
                horizontalLineTo(x = 8.75f)
                curveTo(x1 = 8.33579f, y1 = 8.5f, x2 = 8.0f, y2 = 8.16421f, x3 = 8.0f, y3 = 7.75f)
                close()
                moveTo(x = 13.0f, y = 7.75f)
                curveTo(x1 = 13.0f, y1 = 7.33579f, x2 = 13.3358f, y2 = 7.0f, x3 = 13.75f, y3 = 7.0f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 15.6642f, y1 = 7.0f, x2 = 16.0f, y2 = 7.33579f, x3 = 16.0f, y3 = 7.75f)
                curveTo(x1 = 16.0f, y1 = 8.16421f, x2 = 15.6642f, y2 = 8.5f, x3 = 15.25f, y3 = 8.5f)
                horizontalLineTo(x = 13.75f)
                curveTo(x1 = 13.3358f, y1 = 8.5f, x2 = 13.0f, y2 = 8.16421f, x3 = 13.0f, y3 = 7.75f)
                close()
                moveTo(x = 8.0f, y = 11.75f)
                curveTo(x1 = 8.0f, y1 = 11.3358f, x2 = 8.33579f, y2 = 11.0f, x3 = 8.75f, y3 = 11.0f)
                horizontalLineTo(x = 10.25f)
                curveTo(x1 = 10.6642f, y1 = 11.0f, x2 = 11.0f, y2 = 11.3358f, x3 = 11.0f, y3 = 11.75f)
                curveTo(x1 = 11.0f, y1 = 12.1642f, x2 = 10.6642f, y2 = 12.5f, x3 = 10.25f, y3 = 12.5f)
                horizontalLineTo(x = 8.75f)
                curveTo(x1 = 8.33579f, y1 = 12.5f, x2 = 8.0f, y2 = 12.1642f, x3 = 8.0f, y3 = 11.75f)
                close()
                moveTo(x = 13.0f, y = 11.75f)
                curveTo(x1 = 13.0f, y1 = 11.3358f, x2 = 13.3358f, y2 = 11.0f, x3 = 13.75f, y3 = 11.0f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 15.6642f, y1 = 11.0f, x2 = 16.0f, y2 = 11.3358f, x3 = 16.0f, y3 = 11.75f)
                curveTo(x1 = 16.0f, y1 = 12.1642f, x2 = 15.6642f, y2 = 12.5f, x3 = 15.25f, y3 = 12.5f)
                horizontalLineTo(x = 13.75f)
                curveTo(x1 = 13.3358f, y1 = 12.5f, x2 = 13.0f, y2 = 12.1642f, x3 = 13.0f, y3 = 11.75f)
                close()
                moveTo(x = 8.0f, y = 15.75f)
                curveTo(x1 = 8.0f, y1 = 15.3358f, x2 = 8.33579f, y2 = 15.0f, x3 = 8.75f, y3 = 15.0f)
                horizontalLineTo(x = 10.25f)
                curveTo(x1 = 10.6642f, y1 = 15.0f, x2 = 11.0f, y2 = 15.3358f, x3 = 11.0f, y3 = 15.75f)
                curveTo(x1 = 11.0f, y1 = 16.1642f, x2 = 10.6642f, y2 = 16.5f, x3 = 10.25f, y3 = 16.5f)
                horizontalLineTo(x = 8.75f)
                curveTo(x1 = 8.33579f, y1 = 16.5f, x2 = 8.0f, y2 = 16.1642f, x3 = 8.0f, y3 = 15.75f)
                close()
                moveTo(x = 13.0f, y = 15.75f)
                curveTo(x1 = 13.0f, y1 = 15.3358f, x2 = 13.3358f, y2 = 15.0f, x3 = 13.75f, y3 = 15.0f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 15.6642f, y1 = 15.0f, x2 = 16.0f, y2 = 15.3358f, x3 = 16.0f, y3 = 15.75f)
                curveTo(x1 = 16.0f, y1 = 16.1642f, x2 = 15.6642f, y2 = 16.5f, x3 = 15.25f, y3 = 16.5f)
                horizontalLineTo(x = 13.75f)
                curveTo(x1 = 13.3358f, y1 = 16.5f, x2 = 13.0f, y2 = 16.1642f, x3 = 13.0f, y3 = 15.75f)
                close()
            }
        }.build().also { _block = it }
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
                imageVector = Block,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _block: ImageVector? = null
