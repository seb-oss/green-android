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

val PieChart: ImageVector
    get() {
        val current = _pieChart
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.PieChart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 14.2586f, y = 2.18337f)
                curveTo(x1 = 14.4229f, y1 = 2.04092f, x2 = 14.6409f, y2 = 1.97677f, x3 = 14.8562f, y3 = 2.00756f)
                curveTo(x1 = 18.5469f, y1 = 2.53548f, x2 = 21.4645f, y2 = 5.45306f, x3 = 21.9924f, y3 = 9.14381f)
                curveTo(x1 = 22.0232f, y1 = 9.35906f, x2 = 21.9591f, y2 = 9.57708f, x3 = 21.8166f, y3 = 9.74136f)
                curveTo(x1 = 21.6742f, y1 = 9.90564f, x2 = 21.4674f, y2 = 10.0f, x3 = 21.25f, y3 = 10.0f)
                horizontalLineTo(x = 14.75f)
                curveTo(x1 = 14.3358f, y1 = 10.0f, x2 = 14.0f, y2 = 9.66422f, x3 = 14.0f, y3 = 9.25001f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 14.0f, y1 = 2.53256f, x2 = 14.0944f, y2 = 2.32582f, x3 = 14.2586f, y3 = 2.18337f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 2.0f, y = 13.0f)
                curveTo(x1 = 2.0f, y1 = 8.02944f, x2 = 6.02944f, y2 = 4.0f, x3 = 11.0f, y3 = 4.0f)
                curveTo(x1 = 11.0926f, y1 = 4.0f, x2 = 11.1849f, y2 = 4.0014f, x3 = 11.2768f, y3 = 4.00418f)
                curveTo(x1 = 11.682f, y1 = 4.01644f, x2 = 12.0041f, y2 = 4.34846f, x3 = 12.0041f, y3 = 4.75384f)
                verticalLineTo(y = 12.0002f)
                horizontalLineTo(x = 19.2463f)
                curveTo(x1 = 19.6518f, y1 = 12.0002f, x2 = 19.9839f, y2 = 12.3226f, x3 = 19.996f, y3 = 12.7279f)
                curveTo(x1 = 19.9986f, y1 = 12.8183f, x2 = 20.0f, y2 = 12.909f, x3 = 20.0f, y3 = 13.0f)
                curveTo(x1 = 20.0f, y1 = 17.9706f, x2 = 15.9706f, y2 = 22.0f, x3 = 11.0f, y3 = 22.0f)
                curveTo(x1 = 6.02944f, y1 = 22.0f, x2 = 2.0f, y2 = 17.9706f, x3 = 2.0f, y3 = 13.0f)
                close()
            }
        }.build().also { _pieChart = it }
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
                imageVector = PieChart,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _pieChart: ImageVector? = null
