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

val ChartOne: ImageVector
    get() {
        val current = _chartOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChartOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 4.50098f, y = 1.75098f)
                curveTo(x1 = 4.50098f, y1 = 1.33676f, x2 = 4.16519f, y2 = 1.00098f, x3 = 3.75098f, y3 = 1.00098f)
                curveTo(x1 = 3.33676f, y1 = 1.00098f, x2 = 3.00098f, y2 = 1.33676f, x3 = 3.00098f, y3 = 1.75098f)
                lineTo(x = 3.00098f, y = 3.71235f)
                curveTo(x1 = 3.00033f, y1 = 3.72515f, x2 = 3.0f, y2 = 3.73802f, x3 = 3.0f, y3 = 3.75098f)
                verticalLineTo(y = 7.25098f)
                curveTo(x1 = 3.0f, y1 = 7.26393f, x2 = 3.00033f, y2 = 7.27681f, x3 = 3.00098f, y3 = 7.2896f)
                lineTo(x = 3.00098f, y = 10.2124f)
                curveTo(x1 = 3.00033f, y1 = 10.2251f, x2 = 3.0f, y2 = 10.238f, x3 = 3.0f, y3 = 10.251f)
                verticalLineTo(y = 13.751f)
                curveTo(x1 = 3.0f, y1 = 13.7639f, x2 = 3.00033f, y2 = 13.7768f, x3 = 3.00098f, y3 = 13.7896f)
                lineTo(x = 3.00098f, y = 16.7124f)
                curveTo(x1 = 3.00033f, y1 = 16.7252f, x2 = 3.0f, y2 = 16.738f, x3 = 3.0f, y3 = 16.751f)
                verticalLineTo(y = 20.251f)
                curveTo(x1 = 3.0f, y1 = 20.2639f, x2 = 3.00033f, y2 = 20.2768f, x3 = 3.00098f, y3 = 20.2896f)
                lineTo(x = 3.00098f, y = 22.251f)
                curveTo(x1 = 3.00098f, y1 = 22.6652f, x2 = 3.33676f, y2 = 23.001f, x3 = 3.75098f, y3 = 23.001f)
                curveTo(x1 = 4.16519f, y1 = 23.001f, x2 = 4.50098f, y2 = 22.6652f, x3 = 4.50098f, y3 = 22.251f)
                verticalLineTo(y = 21.001f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 21.001f, x2 = 21.0f, y2 = 20.6652f, x3 = 21.0f, y3 = 20.251f)
                verticalLineTo(y = 16.751f)
                curveTo(x1 = 21.0f, y1 = 16.3368f, x2 = 20.6642f, y2 = 16.001f, x3 = 20.25f, y3 = 16.001f)
                lineTo(x = 4.50098f, y = 16.001f)
                lineTo(x = 4.50098f, y = 14.501f)
                lineTo(x = 14.75f, y = 14.501f)
                curveTo(x1 = 15.1642f, y1 = 14.501f, x2 = 15.5f, y2 = 14.1652f, x3 = 15.5f, y3 = 13.751f)
                verticalLineTo(y = 10.251f)
                curveTo(x1 = 15.5f, y1 = 9.83676f, x2 = 15.1642f, y2 = 9.50098f, x3 = 14.75f, y3 = 9.50098f)
                horizontalLineTo(x = 4.50098f)
                lineTo(x = 4.50098f, y = 8.00098f)
                lineTo(x = 9.25f, y = 8.00098f)
                curveTo(x1 = 9.66421f, y1 = 8.00098f, x2 = 10.0f, y2 = 7.66519f, x3 = 10.0f, y3 = 7.25098f)
                lineTo(x = 10.0f, y = 3.75098f)
                curveTo(x1 = 10.0f, y1 = 3.33676f, x2 = 9.66421f, y2 = 3.00098f, x3 = 9.25f, y3 = 3.00098f)
                lineTo(x = 4.50098f, y = 3.00098f)
                verticalLineTo(y = 1.75098f)
                close()
            }
        }.build().also { _chartOne = it }
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
                imageVector = ChartOne,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chartOne: ImageVector? = null
