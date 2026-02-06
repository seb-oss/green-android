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

internal val TrendingFive: ImageVector
    get() {
        val current = _trendingFive
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.TrendingFive",
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
                moveTo(x = 2.75f, y = 20.25f)
                verticalLineTo(y = 14.0f)
                verticalLineTo(y = 13.5f)
                curveTo(x1 = 2.75f, y1 = 13.2239f, x2 = 2.97386f, y2 = 13.0f, x3 = 3.25f, y3 = 13.0f)
                horizontalLineTo(x = 4.0f)
                horizontalLineTo(x = 7.73438f)
                horizontalLineTo(x = 8.23438f)
                curveTo(x1 = 8.51052f, y1 = 13.0f, x2 = 8.73438f, y2 = 12.7761f, x3 = 8.73438f, y3 = 12.5f)
                verticalLineTo(y = 5.0f)
                verticalLineTo(y = 4.25f)
                curveTo(x1 = 8.73438f, y1 = 3.97386f, x2 = 8.95823f, y2 = 3.75f, x3 = 9.23438f, y3 = 3.75f)
                horizontalLineTo(x = 9.73438f)
                horizontalLineTo(x = 14.0f)
                horizontalLineTo(x = 14.5f)
                curveTo(x1 = 14.7761f, y1 = 3.75f, x2 = 15.0f, y2 = 3.97386f, x3 = 15.0f, y3 = 4.25f)
                verticalLineTo(y = 5.0f)
                verticalLineTo(y = 19.0f)
                verticalLineTo(y = 19.75f)
                curveTo(x1 = 15.0f, y1 = 20.0261f, x2 = 15.2239f, y2 = 20.25f, x3 = 15.5f, y3 = 20.25f)
                horizontalLineTo(x = 16.0f)
                horizontalLineTo(x = 20.0f)
                horizontalLineTo(x = 20.75f)
                curveTo(x1 = 21.0261f, y1 = 20.25f, x2 = 21.25f, y2 = 20.0261f, x3 = 21.25f, y3 = 19.75f)
                verticalLineTo(y = 19.0f)
                verticalLineTo(y = 13.0f)
            }
        }.build().also { _trendingFive = it }
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
                imageVector = TrendingFive,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _trendingFive: ImageVector? = null
