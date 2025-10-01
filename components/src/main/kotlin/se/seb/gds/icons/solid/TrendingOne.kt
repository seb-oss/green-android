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

val TrendingOne: ImageVector
    get() {
        val current = _trendingOne
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.TrendingOne",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.75f, y = 4.0f)
                    curveTo(
                        x1 = 3.16421f,
                        y1 = 4.0f,
                        x2 = 3.5f,
                        y2 = 4.33579f,
                        x3 = 3.5f,
                        y3 = 4.75f,
                    )
                    verticalLineTo(y = 18.5f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(
                        x1 = 21.6642f,
                        y1 = 18.5f,
                        x2 = 22.0f,
                        y2 = 18.8358f,
                        x3 = 22.0f,
                        y3 = 19.25f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 19.6642f,
                        x2 = 21.6642f,
                        y2 = 20.0f,
                        x3 = 21.25f,
                        y3 = 20.0f,
                    )
                    horizontalLineTo(x = 2.75f)
                    curveTo(
                        x1 = 2.33579f,
                        y1 = 20.0f,
                        x2 = 2.0f,
                        y2 = 19.6642f,
                        x3 = 2.0f,
                        y3 = 19.25f,
                    )
                    verticalLineTo(y = 4.75f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 4.33579f,
                        x2 = 2.33579f,
                        y2 = 4.0f,
                        x3 = 2.75f,
                        y3 = 4.0f,
                    )
                    close()
                    moveTo(x = 14.0f, y = 6.75f)
                    curveTo(
                        x1 = 14.0f,
                        y1 = 6.33579f,
                        x2 = 14.3358f,
                        y2 = 6.0f,
                        x3 = 14.75f,
                        y3 = 6.0f,
                    )
                    horizontalLineTo(x = 19.25f)
                    curveTo(
                        x1 = 19.6642f,
                        y1 = 6.0f,
                        x2 = 20.0f,
                        y2 = 6.33579f,
                        x3 = 20.0f,
                        y3 = 6.75f,
                    )
                    verticalLineTo(y = 11.25f)
                    curveTo(
                        x1 = 20.0f,
                        y1 = 11.6642f,
                        x2 = 19.6642f,
                        y2 = 12.0f,
                        x3 = 19.25f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 18.8358f,
                        y1 = 12.0f,
                        x2 = 18.5f,
                        y2 = 11.6642f,
                        x3 = 18.5f,
                        y3 = 11.25f,
                    )
                    verticalLineTo(y = 8.56066f)
                    lineTo(x = 13.5303f, y = 13.5303f)
                    curveTo(
                        x1 = 13.2374f,
                        y1 = 13.8232f,
                        x2 = 12.7626f,
                        y2 = 13.8232f,
                        x3 = 12.4697f,
                        y3 = 13.5303f,
                    )
                    lineTo(x = 11.0f, y = 12.0607f)
                    lineTo(x = 7.28033f, y = 15.7803f)
                    curveTo(
                        x1 = 6.98744f,
                        y1 = 16.0732f,
                        x2 = 6.51256f,
                        y2 = 16.0732f,
                        x3 = 6.21967f,
                        y3 = 15.7803f,
                    )
                    curveTo(
                        x1 = 5.92678f,
                        y1 = 15.4874f,
                        x2 = 5.92678f,
                        y2 = 15.0126f,
                        x3 = 6.21967f,
                        y3 = 14.7197f,
                    )
                    lineTo(x = 10.4697f, y = 10.4697f)
                    curveTo(
                        x1 = 10.7626f,
                        y1 = 10.1768f,
                        x2 = 11.2374f,
                        y2 = 10.1768f,
                        x3 = 11.5303f,
                        y3 = 10.4697f,
                    )
                    lineTo(x = 13.0f, y = 11.9393f)
                    lineTo(x = 17.4393f, y = 7.5f)
                    horizontalLineTo(x = 14.75f)
                    curveTo(
                        x1 = 14.3358f,
                        y1 = 7.5f,
                        x2 = 14.0f,
                        y2 = 7.16421f,
                        x3 = 14.0f,
                        y3 = 6.75f,
                    )
                    close()
                }
            }.build()
            .also { _trendingOne = it }
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
                imageVector = TrendingOne,
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
private var _trendingOne: ImageVector? = null
