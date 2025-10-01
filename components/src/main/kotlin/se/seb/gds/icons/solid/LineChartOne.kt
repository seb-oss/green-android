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

val LineChartOne: ImageVector
    get() {
        val current = _lineChartOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.LineChartOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 4.5f, y = 3.75f)
                curveTo(x1 = 4.5f, y1 = 3.33579f, x2 = 4.16421f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                curveTo(x1 = 3.33579f, y1 = 3.0f, x2 = 3.0f, y2 = 3.33579f, x3 = 3.0f, y3 = 3.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 3.0f, y1 = 20.6642f, x2 = 3.33579f, y2 = 21.0f, x3 = 3.75f, y3 = 21.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 21.0f, x2 = 22.0f, y2 = 20.6642f, x3 = 22.0f, y3 = 20.25f)
                curveTo(x1 = 22.0f, y1 = 19.8358f, x2 = 21.6642f, y2 = 19.5f, x3 = 21.25f, y3 = 19.5f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 15.0f, y = 4.75f)
                curveTo(x1 = 15.0f, y1 = 4.33579f, x2 = 14.6642f, y2 = 4.0f, x3 = 14.25f, y3 = 4.0f)
                curveTo(x1 = 13.8358f, y1 = 4.0f, x2 = 13.5f, y2 = 4.33579f, x3 = 13.5f, y3 = 4.75f)
                verticalLineTo(y = 16.25f)
                curveTo(x1 = 13.5f, y1 = 16.6642f, x2 = 13.8358f, y2 = 17.0f, x3 = 14.25f, y3 = 17.0f)
                curveTo(x1 = 14.6642f, y1 = 17.0f, x2 = 15.0f, y2 = 16.6642f, x3 = 15.0f, y3 = 16.25f)
                verticalLineTo(y = 4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 10.0f, y = 10.75f)
                curveTo(x1 = 10.0f, y1 = 10.3358f, x2 = 9.66421f, y2 = 10.0f, x3 = 9.25f, y3 = 10.0f)
                curveTo(x1 = 8.83579f, y1 = 10.0f, x2 = 8.5f, y2 = 10.3358f, x3 = 8.5f, y3 = 10.75f)
                verticalLineTo(y = 16.25f)
                curveTo(x1 = 8.5f, y1 = 16.6642f, x2 = 8.83579f, y2 = 17.0f, x3 = 9.25f, y3 = 17.0f)
                curveTo(x1 = 9.66421f, y1 = 17.0f, x2 = 10.0f, y2 = 16.6642f, x3 = 10.0f, y3 = 16.25f)
                verticalLineTo(y = 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 20.0f, y = 12.75f)
                curveTo(x1 = 20.0f, y1 = 12.3358f, x2 = 19.6642f, y2 = 12.0f, x3 = 19.25f, y3 = 12.0f)
                curveTo(x1 = 18.8358f, y1 = 12.0f, x2 = 18.5f, y2 = 12.3358f, x3 = 18.5f, y3 = 12.75f)
                verticalLineTo(y = 16.25f)
                curveTo(x1 = 18.5f, y1 = 16.6642f, x2 = 18.8358f, y2 = 17.0f, x3 = 19.25f, y3 = 17.0f)
                curveTo(x1 = 19.6642f, y1 = 17.0f, x2 = 20.0f, y2 = 16.6642f, x3 = 20.0f, y3 = 16.25f)
                verticalLineTo(y = 12.75f)
                close()
            }
        }.build().also { _lineChartOne = it }
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
                imageVector = LineChartOne,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lineChartOne: ImageVector? = null
