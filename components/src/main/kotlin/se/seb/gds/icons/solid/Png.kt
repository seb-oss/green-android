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

internal val Png: ImageVector
    get() {
        val current = _png
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Png",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 13.0f, y = 3.0f)
                horizontalLineTo(x = 4.75f)
                curveTo(x1 = 4.33579f, y1 = 3.0f, x2 = 4.0f, y2 = 3.33579f, x3 = 4.0f, y3 = 3.75f)
                verticalLineTo(y = 12.0f)
                horizontalLineTo(x = 20.0f)
                verticalLineTo(y = 10.0f)
                horizontalLineTo(x = 13.75f)
                curveTo(x1 = 13.3358f, y1 = 10.0f, x2 = 13.0f, y2 = 9.66421f, x3 = 13.0f, y3 = 9.25f)
                verticalLineTo(y = 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 20.0f, y = 8.5f)
                verticalLineTo(y = 8.0f)
                curveTo(x1 = 20.0f, y1 = 7.80109f, x2 = 19.921f, y2 = 7.61032f, x3 = 19.7803f, y3 = 7.46967f)
                lineTo(x = 15.5303f, y = 3.21967f)
                curveTo(x1 = 15.3897f, y1 = 3.07902f, x2 = 15.1989f, y2 = 3.0f, x3 = 15.0f, y3 = 3.0f)
                horizontalLineTo(x = 14.5f)
                verticalLineTo(y = 8.5f)
                horizontalLineTo(x = 20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 18.798f, y = 15.5765f)
                curveTo(x1 = 18.614f, y1 = 15.5299f, x2 = 18.4251f, y2 = 15.5189f, x3 = 18.2978f, y3 = 15.5269f)
                curveTo(x1 = 17.7041f, y1 = 15.564f, x2 = 16.9054f, y2 = 16.2667f, x3 = 16.9054f, y3 = 17.561f)
                curveTo(x1 = 16.9054f, y1 = 18.8392f, x2 = 17.6295f, y2 = 19.4975f, x3 = 18.3957f, y3 = 19.5f)
                curveTo(x1 = 18.8281f, y1 = 19.4938f, x2 = 19.2307f, y2 = 19.3873f, x3 = 19.5f, y3 = 19.2133f)
                verticalLineTo(y = 18.5834f)
                horizontalLineTo(x = 19.1961f)
                curveTo(x1 = 18.7819f, y1 = 18.5834f, x2 = 18.4461f, y2 = 18.2476f, x3 = 18.4461f, y3 = 17.8334f)
                curveTo(x1 = 18.4461f, y1 = 17.4192f, x2 = 18.7819f, y2 = 17.0834f, x3 = 19.1961f, y3 = 17.0834f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 17.0834f, x2 = 21.0f, y2 = 17.4192f, x3 = 21.0f, y3 = 17.8334f)
                verticalLineTo(y = 19.5538f)
                curveTo(x1 = 21.0f, y1 = 19.7386f, x2 = 20.9318f, y2 = 19.9168f, x3 = 20.8085f, y3 = 20.0544f)
                curveTo(x1 = 20.1617f, y1 = 20.7761f, x2 = 19.1466f, y2 = 20.9908f, x3 = 18.4095f, y3 = 20.9999f)
                lineTo(x = 18.4001f, y = 21.0001f)
                curveTo(x1 = 16.5623f, y1 = 21.0001f, x2 = 15.4054f, y2 = 19.4058f, x3 = 15.4054f, y3 = 17.561f)
                curveTo(x1 = 15.4054f, y1 = 15.7297f, x2 = 16.5885f, y2 = 14.1308f, x3 = 18.2043f, y3 = 14.0298f)
                curveTo(x1 = 18.4763f, y1 = 14.0128f, x2 = 18.8215f, y2 = 14.0351f, x3 = 19.1659f, y3 = 14.1223f)
                curveTo(x1 = 19.5045f, y1 = 14.2079f, x2 = 19.9079f, y2 = 14.373f, x3 = 20.2262f, y3 = 14.691f)
                curveTo(x1 = 20.5192f, y1 = 14.9837f, x2 = 20.5195f, y2 = 15.4586f, x3 = 20.2267f, y3 = 15.7516f)
                curveTo(x1 = 19.934f, y1 = 16.0447f, x2 = 19.4591f, y2 = 16.0449f, x3 = 19.166f, y3 = 15.7522f)
                curveTo(x1 = 19.1074f, y1 = 15.6935f, x2 = 18.9879f, y2 = 15.6245f, x3 = 18.798f, y3 = 15.5765f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.0f, y = 14.75f)
                curveTo(x1 = 3.0f, y1 = 14.3358f, x2 = 3.33579f, y2 = 14.0f, x3 = 3.75f, y3 = 14.0f)
                horizontalLineTo(x = 5.5f)
                curveTo(x1 = 6.74264f, y1 = 14.0f, x2 = 7.75f, y2 = 15.0074f, x3 = 7.75f, y3 = 16.25f)
                curveTo(x1 = 7.75f, y1 = 17.4926f, x2 = 6.74264f, y2 = 18.5f, x3 = 5.5f, y3 = 18.5f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 4.5f, y1 = 20.6642f, x2 = 4.16421f, y2 = 21.0f, x3 = 3.75f, y3 = 21.0f)
                curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                verticalLineTo(y = 14.75f)
                close()
                moveTo(x = 4.5f, y = 17.0f)
                horizontalLineTo(x = 5.5f)
                curveTo(x1 = 5.91421f, y1 = 17.0f, x2 = 6.25f, y2 = 16.6642f, x3 = 6.25f, y3 = 16.25f)
                curveTo(x1 = 6.25f, y1 = 15.8358f, x2 = 5.91421f, y2 = 15.5f, x3 = 5.5f, y3 = 15.5f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 8.75f, y = 14.75f)
                curveTo(x1 = 8.75f, y1 = 14.3358f, x2 = 9.08579f, y2 = 14.0f, x3 = 9.5f, y3 = 14.0f)
                horizontalLineTo(x = 10.0f)
                curveTo(x1 = 10.2652f, y1 = 14.0f, x2 = 10.5108f, y2 = 14.1401f, x3 = 10.6457f, y3 = 14.3685f)
                lineTo(x = 13.0f, y = 18.3527f)
                verticalLineTo(y = 14.75f)
                curveTo(x1 = 13.0f, y1 = 14.3358f, x2 = 13.3358f, y2 = 14.0f, x3 = 13.75f, y3 = 14.0f)
                curveTo(x1 = 14.1642f, y1 = 14.0f, x2 = 14.5f, y2 = 14.3358f, x3 = 14.5f, y3 = 14.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 14.5f, y1 = 20.6642f, x2 = 14.1642f, y2 = 21.0f, x3 = 13.75f, y3 = 21.0f)
                horizontalLineTo(x = 13.25f)
                curveTo(x1 = 12.9848f, y1 = 21.0f, x2 = 12.7392f, y2 = 20.8599f, x3 = 12.6043f, y3 = 20.6315f)
                lineTo(x = 10.25f, y = 16.6473f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 10.25f, y1 = 20.6642f, x2 = 9.91421f, y2 = 21.0f, x3 = 9.5f, y3 = 21.0f)
                curveTo(x1 = 9.08579f, y1 = 21.0f, x2 = 8.75f, y2 = 20.6642f, x3 = 8.75f, y3 = 20.25f)
                verticalLineTo(y = 14.75f)
                close()
            }
        }.build().also { _png = it }
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
                imageVector = Png,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _png: ImageVector? = null
