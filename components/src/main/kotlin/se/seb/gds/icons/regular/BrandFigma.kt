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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val BrandFigma: ImageVector
    get() {
        val current = _brandFigma
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BrandFigma",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 8.66524f, y = 2.0f)
                curveTo(x1 = 6.82524f, y1 = 2.0f, x2 = 5.33191f, y2 = 3.49333f, x3 = 5.33191f, y3 = 5.33333f)
                curveTo(x1 = 5.33191f, y1 = 7.16852f, x2 = 6.81743f, y2 = 8.65884f, x3 = 8.65079f, y3 = 8.66664f)
                curveTo(x1 = 6.81744f, y1 = 8.67445f, x2 = 5.33193f, y2 = 10.1648f, x3 = 5.33193f, y3 = 11.9999f)
                curveTo(x1 = 5.33193f, y1 = 13.8399f, x2 = 6.82526f, y2 = 15.3333f, x3 = 8.66527f, y3 = 15.3333f)
                horizontalLineTo(x = 11.9986f)
                verticalLineTo(y = 12.0205f)
                curveTo(x1 = 12.0097f, y1 = 13.851f, x2 = 13.4987f, y2 = 15.3333f, x3 = 15.3319f, y3 = 15.3333f)
                curveTo(x1 = 17.1719f, y1 = 15.3333f, x2 = 18.6652f, y2 = 13.8399f, x3 = 18.6652f, y3 = 11.9999f)
                curveTo(x1 = 18.6652f, y1 = 10.1646f, x2 = 17.1795f, y2 = 8.67424f, x3 = 15.346f, y3 = 8.66664f)
                curveTo(x1 = 17.1795f, y1 = 8.65904f, x2 = 18.6652f, y2 = 7.16864f, x3 = 18.6652f, y3 = 5.33333f)
                curveTo(x1 = 18.6652f, y1 = 3.49333f, x2 = 17.1719f, y2 = 2.0f, x3 = 15.3319f, y3 = 2.0f)
                horizontalLineTo(x = 8.66524f)
                close()
                moveTo(x = 15.3113f, y = 8.66667f)
                horizontalLineTo(x = 11.9986f)
                verticalLineTo(y = 11.9794f)
                curveTo(x1 = 12.0096f, y1 = 10.1557f, x2 = 13.4876f, y2 = 8.67769f, x3 = 15.3113f, y3 = 8.66667f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 8.66527f, y = 22.0f)
                curveTo(x1 = 10.5053f, y1 = 22.0f, x2 = 11.9986f, y2 = 20.5067f, x3 = 11.9986f, y3 = 18.6667f)
                verticalLineTo(y = 15.3333f)
                horizontalLineTo(x = 8.66527f)
                curveTo(x1 = 6.82526f, y1 = 15.3333f, x2 = 5.33193f, y2 = 16.8267f, x3 = 5.33193f, y3 = 18.6667f)
                curveTo(x1 = 5.33193f, y1 = 20.5067f, x2 = 6.82526f, y2 = 22.0f, x3 = 8.66527f, y3 = 22.0f)
                close()
            }
        }.build().also { _brandFigma = it }
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
                imageVector = BrandFigma,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brandFigma: ImageVector? = null
