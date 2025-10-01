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

val TrendingTwo: ImageVector
    get() {
        val current = _trendingTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.TrendingTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.75f, y = 3.0f)
                curveTo(x1 = 4.16421f, y1 = 3.0f, x2 = 4.5f, y2 = 3.33579f, x3 = 4.5f, y3 = 3.75f)
                verticalLineTo(y = 15.3456f)
                lineTo(x = 8.89154f, y = 10.954f)
                curveTo(x1 = 9.18444f, y1 = 10.6612f, x2 = 9.65931f, y2 = 10.6612f, x3 = 9.95221f, y3 = 10.954f)
                lineTo(x = 12.0f, y = 13.0018f)
                lineTo(x = 16.6259f, y = 8.37592f)
                curveTo(x1 = 16.9188f, y1 = 8.08303f, x2 = 17.3937f, y2 = 8.08303f, x3 = 17.6866f, y3 = 8.37592f)
                lineTo(x = 19.7491f, y = 10.4384f)
                curveTo(x1 = 20.042f, y1 = 10.7313f, x2 = 20.042f, y2 = 11.2062f, x3 = 19.7491f, y3 = 11.4991f)
                curveTo(x1 = 19.4562f, y1 = 11.792f, x2 = 18.9813f, y2 = 11.792f, x3 = 18.6884f, y3 = 11.4991f)
                lineTo(x = 17.1562f, y = 9.96691f)
                lineTo(x = 12.5303f, y = 14.5928f)
                curveTo(x1 = 12.2374f, y1 = 14.8857f, x2 = 11.7626f, y2 = 14.8857f, x3 = 11.4697f, y3 = 14.5928f)
                lineTo(x = 9.42188f, y = 12.545f)
                lineTo(x = 4.5f, y = 17.4669f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 19.5f, x2 = 21.0f, y2 = 19.8358f, x3 = 21.0f, y3 = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                close()
            }
        }.build().also { _trendingTwo = it }
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
                imageVector = TrendingTwo,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _trendingTwo: ImageVector? = null
