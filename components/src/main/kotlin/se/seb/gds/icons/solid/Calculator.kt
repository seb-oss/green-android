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

val Calculator: ImageVector
    get() {
        val current = _calculator
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Calculator",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 4.75f, y = 2.0f)
                curveTo(x1 = 4.33579f, y1 = 2.0f, x2 = 4.0f, y2 = 2.33579f, x3 = 4.0f, y3 = 2.75f)
                verticalLineTo(y = 21.25f)
                curveTo(x1 = 4.0f, y1 = 21.6642f, x2 = 4.33579f, y2 = 22.0f, x3 = 4.75f, y3 = 22.0f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.6642f, y1 = 22.0f, x2 = 20.0f, y2 = 21.6642f, x3 = 20.0f, y3 = 21.25f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 20.0f, y1 = 2.33579f, x2 = 19.6642f, y2 = 2.0f, x3 = 19.25f, y3 = 2.0f)
                horizontalLineTo(x = 4.75f)
                close()
                moveTo(x = 18.5f, y = 7.0f)
                verticalLineTo(y = 3.5f)
                horizontalLineTo(x = 5.5f)
                verticalLineTo(y = 7.0f)
                horizontalLineTo(x = 18.5f)
                close()
                moveTo(x = 9.5f, y = 13.25f)
                curveTo(x1 = 10.0523f, y1 = 13.25f, x2 = 10.5f, y2 = 12.8023f, x3 = 10.5f, y3 = 12.25f)
                curveTo(x1 = 10.5f, y1 = 11.6977f, x2 = 10.0523f, y2 = 11.25f, x3 = 9.5f, y3 = 11.25f)
                curveTo(x1 = 8.94772f, y1 = 11.25f, x2 = 8.5f, y2 = 11.6977f, x3 = 8.5f, y3 = 12.25f)
                curveTo(x1 = 8.5f, y1 = 12.8023f, x2 = 8.94772f, y2 = 13.25f, x3 = 9.5f, y3 = 13.25f)
                close()
                moveTo(x = 9.5f, y = 17.75f)
                curveTo(x1 = 10.0523f, y1 = 17.75f, x2 = 10.5f, y2 = 17.3023f, x3 = 10.5f, y3 = 16.75f)
                curveTo(x1 = 10.5f, y1 = 16.1977f, x2 = 10.0523f, y2 = 15.75f, x3 = 9.5f, y3 = 15.75f)
                curveTo(x1 = 8.94772f, y1 = 15.75f, x2 = 8.5f, y2 = 16.1977f, x3 = 8.5f, y3 = 16.75f)
                curveTo(x1 = 8.5f, y1 = 17.3023f, x2 = 8.94772f, y2 = 17.75f, x3 = 9.5f, y3 = 17.75f)
                close()
                moveTo(x = 15.5f, y = 12.25f)
                curveTo(x1 = 15.5f, y1 = 12.8023f, x2 = 15.0523f, y2 = 13.25f, x3 = 14.5f, y3 = 13.25f)
                curveTo(x1 = 13.9477f, y1 = 13.25f, x2 = 13.5f, y2 = 12.8023f, x3 = 13.5f, y3 = 12.25f)
                curveTo(x1 = 13.5f, y1 = 11.6977f, x2 = 13.9477f, y2 = 11.25f, x3 = 14.5f, y3 = 11.25f)
                curveTo(x1 = 15.0523f, y1 = 11.25f, x2 = 15.5f, y2 = 11.6977f, x3 = 15.5f, y3 = 12.25f)
                close()
                moveTo(x = 14.5f, y = 17.75f)
                curveTo(x1 = 15.0523f, y1 = 17.75f, x2 = 15.5f, y2 = 17.3023f, x3 = 15.5f, y3 = 16.75f)
                curveTo(x1 = 15.5f, y1 = 16.1977f, x2 = 15.0523f, y2 = 15.75f, x3 = 14.5f, y3 = 15.75f)
                curveTo(x1 = 13.9477f, y1 = 15.75f, x2 = 13.5f, y2 = 16.1977f, x3 = 13.5f, y3 = 16.75f)
                curveTo(x1 = 13.5f, y1 = 17.3023f, x2 = 13.9477f, y2 = 17.75f, x3 = 14.5f, y3 = 17.75f)
                close()
            }
        }.build().also { _calculator = it }
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
                imageVector = Calculator,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _calculator: ImageVector? = null
