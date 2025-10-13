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

internal val LineChartThree: ImageVector
    get() {
        val current = _lineChartThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.LineChartThree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 21.998f, y = 4.75f)
                curveTo(x1 = 21.998f, y1 = 4.33579f, x2 = 21.6623f, y2 = 4.0f, x3 = 21.248f, y3 = 4.0f)
                curveTo(x1 = 20.8338f, y1 = 4.0f, x2 = 20.498f, y2 = 4.33579f, x3 = 20.498f, y3 = 4.75f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 20.498f, y1 = 19.6642f, x2 = 20.8338f, y2 = 20.0f, x3 = 21.248f, y3 = 20.0f)
                curveTo(x1 = 21.6623f, y1 = 20.0f, x2 = 21.998f, y2 = 19.6642f, x3 = 21.998f, y3 = 19.25f)
                verticalLineTo(y = 4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 15.082f, y = 8.0f)
                curveTo(x1 = 15.4962f, y1 = 8.0f, x2 = 15.832f, y2 = 8.33579f, x3 = 15.832f, y3 = 8.75f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 15.832f, y1 = 19.6642f, x2 = 15.4962f, y2 = 20.0f, x3 = 15.082f, y3 = 20.0f)
                curveTo(x1 = 14.6678f, y1 = 20.0f, x2 = 14.332f, y2 = 19.6642f, x3 = 14.332f, y3 = 19.25f)
                verticalLineTo(y = 8.75f)
                curveTo(x1 = 14.332f, y1 = 8.33579f, x2 = 14.6678f, y2 = 8.0f, x3 = 15.082f, y3 = 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 9.66602f, y = 12.75f)
                curveTo(x1 = 9.66602f, y1 = 12.3358f, x2 = 9.33023f, y2 = 12.0f, x3 = 8.91602f, y3 = 12.0f)
                curveTo(x1 = 8.5018f, y1 = 12.0f, x2 = 8.16602f, y2 = 12.3358f, x3 = 8.16602f, y3 = 12.75f)
                lineTo(x = 8.16602f, y = 19.25f)
                curveTo(x1 = 8.16602f, y1 = 19.6642f, x2 = 8.5018f, y2 = 20.0f, x3 = 8.91602f, y3 = 20.0f)
                curveTo(x1 = 9.33023f, y1 = 20.0f, x2 = 9.66602f, y2 = 19.6642f, x3 = 9.66602f, y3 = 19.25f)
                lineTo(x = 9.66602f, y = 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.5f, y = 16.75f)
                curveTo(x1 = 3.5f, y1 = 16.3358f, x2 = 3.16421f, y2 = 16.0f, x3 = 2.75f, y3 = 16.0f)
                curveTo(x1 = 2.33579f, y1 = 16.0f, x2 = 2.0f, y2 = 16.3358f, x3 = 2.0f, y3 = 16.75f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 2.0f, y1 = 19.6642f, x2 = 2.33579f, y2 = 20.0f, x3 = 2.75f, y3 = 20.0f)
                curveTo(x1 = 3.16421f, y1 = 20.0f, x2 = 3.5f, y2 = 19.6642f, x3 = 3.5f, y3 = 19.25f)
                verticalLineTo(y = 16.75f)
                close()
            }
        }.build().also { _lineChartThree = it }
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
                imageVector = LineChartThree,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lineChartThree: ImageVector? = null
