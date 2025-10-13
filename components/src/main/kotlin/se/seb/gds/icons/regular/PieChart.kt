package se.seb.gds.icons.regular

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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val PieChart: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.25f, y = 9.25f)
                curveTo(x1 = 20.7693f, y1 = 5.88913f, x2 = 18.1109f, y2 = 3.23074f, x3 = 14.75f, y3 = 2.75f)
                verticalLineTo(y = 9.25f)
                horizontalLineTo(x = 21.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.25f, y = 13.0f)
                curveTo(x1 = 19.25f, y1 = 17.5563f, x2 = 15.5563f, y2 = 21.25f, x3 = 11.0f, y3 = 21.25f)
                curveTo(x1 = 6.44365f, y1 = 21.25f, x2 = 2.75f, y2 = 17.5563f, x3 = 2.75f, y3 = 13.0f)
                curveTo(x1 = 2.75f, y1 = 8.44365f, x2 = 6.44365f, y2 = 4.75f, x3 = 11.0f, y3 = 4.75f)
                curveTo(x1 = 11.085f, y1 = 4.75f, x2 = 11.1697f, y2 = 4.75129f, x3 = 11.2541f, y3 = 4.75384f)
                verticalLineTo(y = 12.7502f)
                horizontalLineTo(x = 19.2463f)
                curveTo(x1 = 19.2488f, y1 = 12.8332f, x2 = 19.25f, y2 = 12.9164f, x3 = 19.25f, y3 = 13.0f)
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
