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

val Todos: ImageVector
    get() {
        val current = _todos
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Todos",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 20.25f, y = 3.0f)
                    curveTo(x1 = 20.6642f, y1 = 3.0f, x2 = 21.0f, y2 = 3.33579f, x3 = 21.0f, y3 = 3.75f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                    horizontalLineTo(x = 15.5f)
                    curveTo(x1 = 15.2239f, y1 = 21.0f, x2 = 15.0f, y2 = 20.7761f, x3 = 15.0f, y3 = 20.5f)
                    curveTo(x1 = 15.0f, y1 = 20.2239f, x2 = 14.7761f, y2 = 20.0f, x3 = 14.5f, y3 = 20.0f)
                    horizontalLineTo(x = 9.5f)
                    curveTo(x1 = 9.22386f, y1 = 20.0f, x2 = 9.0f, y2 = 20.2239f, x3 = 9.0f, y3 = 20.5f)
                    curveTo(x1 = 9.0f, y1 = 20.7761f, x2 = 8.77614f, y2 = 21.0f, x3 = 8.5f, y3 = 21.0f)
                    horizontalLineTo(x = 3.75f)
                    curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                    verticalLineTo(y = 3.75f)
                    curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                    horizontalLineTo(x = 20.25f)
                    close()
                    moveTo(x = 15.7558f, y = 9.61807f)
                    curveTo(x1 = 15.9922f, y1 = 9.27798f, x2 = 15.9082f, y2 = 8.81059f, x3 = 15.5681f, y3 = 8.57414f)
                    curveTo(x1 = 15.228f, y1 = 8.3377f, x2 = 14.7607f, y2 = 8.42172f, x3 = 14.5242f, y3 = 8.76181f)
                    lineTo(x = 11.0972f, y = 13.691f)
                    lineTo(x = 9.49578f, y = 12.2802f)
                    curveTo(x1 = 9.18498f, y1 = 12.0064f, x2 = 8.71105f, y2 = 12.0364f, x3 = 8.43724f, y3 = 12.3472f)
                    curveTo(x1 = 8.16343f, y1 = 12.658f, x2 = 8.19341f, y2 = 13.1319f, x3 = 8.50422f, y3 = 13.4057f)
                    lineTo(x = 10.7369f, y = 15.3727f)
                    curveTo(x1 = 10.8974f, y1 = 15.5141f, x2 = 11.1106f, y2 = 15.5802f, x3 = 11.3229f, y3 = 15.5545f)
                    curveTo(x1 = 11.5352f, y1 = 15.5288f, x2 = 11.7264f, y2 = 15.4137f, x3 = 11.8485f, y3 = 15.2381f)
                    lineTo(x = 15.7558f, y = 9.61807f)
                    close()
                }
            }.build()
            .also { _todos = it }
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
                imageVector = Todos,
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
private var _todos: ImageVector? = null
