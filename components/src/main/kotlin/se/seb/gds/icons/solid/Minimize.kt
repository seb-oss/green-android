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

internal val Minimize: ImageVector
    get() {
        val current = _minimize
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Minimize",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 13.75f, y = 3.0f)
                curveTo(x1 = 14.1642f, y1 = 3.0f, x2 = 14.5f, y2 = 3.33579f, x3 = 14.5f, y3 = 3.75f)
                verticalLineTo(y = 8.43934f)
                lineTo(x = 19.7197f, y = 3.21967f)
                curveTo(x1 = 20.0126f, y1 = 2.92678f, x2 = 20.4874f, y2 = 2.92678f, x3 = 20.7803f, y3 = 3.21967f)
                curveTo(x1 = 21.0732f, y1 = 3.51256f, x2 = 21.0732f, y2 = 3.98744f, x3 = 20.7803f, y3 = 4.28033f)
                lineTo(x = 15.5607f, y = 9.5f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 9.5f, x2 = 21.0f, y2 = 9.83579f, x3 = 21.0f, y3 = 10.25f)
                curveTo(x1 = 21.0f, y1 = 10.6642f, x2 = 20.6642f, y2 = 11.0f, x3 = 20.25f, y3 = 11.0f)
                horizontalLineTo(x = 13.75f)
                curveTo(x1 = 13.3358f, y1 = 11.0f, x2 = 13.0f, y2 = 10.6642f, x3 = 13.0f, y3 = 10.25f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 13.0f, y1 = 3.33579f, x2 = 13.3358f, y2 = 3.0f, x3 = 13.75f, y3 = 3.0f)
                close()
                moveTo(x = 3.75f, y = 14.5f)
                curveTo(x1 = 3.33579f, y1 = 14.5f, x2 = 3.0f, y2 = 14.1642f, x3 = 3.0f, y3 = 13.75f)
                curveTo(x1 = 3.0f, y1 = 13.3358f, x2 = 3.33579f, y2 = 13.0f, x3 = 3.75f, y3 = 13.0f)
                horizontalLineTo(x = 10.25f)
                curveTo(x1 = 10.6642f, y1 = 13.0f, x2 = 11.0f, y2 = 13.3358f, x3 = 11.0f, y3 = 13.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 11.0f, y1 = 20.6642f, x2 = 10.6642f, y2 = 21.0f, x3 = 10.25f, y3 = 21.0f)
                curveTo(x1 = 9.83579f, y1 = 21.0f, x2 = 9.5f, y2 = 20.6642f, x3 = 9.5f, y3 = 20.25f)
                verticalLineTo(y = 15.5607f)
                lineTo(x = 4.28033f, y = 20.7803f)
                curveTo(x1 = 3.98744f, y1 = 21.0732f, x2 = 3.51256f, y2 = 21.0732f, x3 = 3.21967f, y3 = 20.7803f)
                curveTo(x1 = 2.92678f, y1 = 20.4874f, x2 = 2.92678f, y2 = 20.0126f, x3 = 3.21967f, y3 = 19.7197f)
                lineTo(x = 8.43934f, y = 14.5f)
                horizontalLineTo(x = 3.75f)
                close()
            }
        }.build().also { _minimize = it }
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
                imageVector = Minimize,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _minimize: ImageVector? = null
