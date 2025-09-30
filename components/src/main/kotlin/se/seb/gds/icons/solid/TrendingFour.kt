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

val TrendingFour: ImageVector
    get() {
        val current = _trendingFour
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.TrendingFour",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 15.0f, y = 6.75f)
                    curveTo(x1 = 15.0f, y1 = 6.33579f, x2 = 15.3358f, y2 = 6.0f, x3 = 15.75f, y3 = 6.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 6.0f, x2 = 22.0f, y2 = 6.33579f, x3 = 22.0f, y3 = 6.75f)
                    verticalLineTo(y = 12.25f)
                    curveTo(x1 = 22.0f, y1 = 12.6642f, x2 = 21.6642f, y2 = 13.0f, x3 = 21.25f, y3 = 13.0f)
                    curveTo(x1 = 20.8358f, y1 = 13.0f, x2 = 20.5f, y2 = 12.6642f, x3 = 20.5f, y3 = 12.25f)
                    verticalLineTo(y = 8.57067f)
                    lineTo(x = 13.5299f, y = 15.5307f)
                    curveTo(x1 = 13.237f, y1 = 15.8232f, x2 = 12.7624f, y2 = 15.8231f, x3 = 12.4697f, y3 = 15.5303f)
                    lineTo(x = 9.0f, y = 12.0607f)
                    lineTo(x = 3.28033f, y = 17.7803f)
                    curveTo(x1 = 2.98744f, y1 = 18.0732f, x2 = 2.51256f, y2 = 18.0732f, x3 = 2.21967f, y3 = 17.7803f)
                    curveTo(x1 = 1.92678f, y1 = 17.4874f, x2 = 1.92678f, y2 = 17.0126f, x3 = 2.21967f, y3 = 16.7197f)
                    lineTo(x = 8.46967f, y = 10.4697f)
                    curveTo(x1 = 8.76256f, y1 = 10.1768f, x2 = 9.23744f, y2 = 10.1768f, x3 = 9.53033f, y3 = 10.4697f)
                    lineTo(x = 13.0004f, y = 13.9397f)
                    lineTo(x = 19.4494f, y = 7.5f)
                    horizontalLineTo(x = 15.75f)
                    curveTo(x1 = 15.3358f, y1 = 7.5f, x2 = 15.0f, y2 = 7.16421f, x3 = 15.0f, y3 = 6.75f)
                    close()
                }
            }.build()
            .also { _trendingFour = it }
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
                imageVector = TrendingFour,
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
private var _trendingFour: ImageVector? = null
