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

internal val SortAscending: ImageVector
    get() {
        val current = _sortAscending
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SortAscending",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 17.5005f, y = 3.0f)
                curveTo(x1 = 17.788f, y1 = 3.00019f, x2 = 18.0501f, y2 = 3.16475f, x3 = 18.1753f, y3 = 3.42363f)
                lineTo(x = 20.1018f, y = 7.40968f)
                curveTo(x1 = 20.1067f, y1 = 7.41918f, x2 = 20.1113f, y2 = 7.42881f, x3 = 20.1158f, y3 = 7.43854f)
                lineTo(x = 21.3169f, y = 9.92363f)
                curveTo(x1 = 21.4971f, y1 = 10.2966f, x2 = 21.3409f, y2 = 10.745f, x3 = 20.968f, y3 = 10.9253f)
                curveTo(x1 = 20.5951f, y1 = 11.1055f, x2 = 20.1466f, y2 = 10.9493f, x3 = 19.9664f, y3 = 10.5764f)
                lineTo(x = 18.9628f, y = 8.5f)
                horizontalLineTo(x = 16.0299f)
                lineTo(x = 15.0225f, y = 10.5773f)
                curveTo(x1 = 14.8417f, y1 = 10.95f, x2 = 14.3931f, y2 = 11.1056f, x3 = 14.0204f, y3 = 10.9248f)
                curveTo(x1 = 13.6477f, y1 = 10.7441f, x2 = 13.4921f, y2 = 10.2954f, x3 = 13.6728f, y3 = 9.92273f)
                lineTo(x = 14.8781f, y = 7.4376f)
                curveTo(x1 = 14.8825f, y1 = 7.42789f, x2 = 14.8872f, y2 = 7.4183f, x3 = 14.892f, y3 = 7.40883f)
                lineTo(x = 16.8252f, y = 3.42273f)
                curveTo(x1 = 16.9506f, y1 = 3.16402f, x2 = 17.213f, y2 = 2.99981f, x3 = 17.5005f, y3 = 3.0f)
                close()
                moveTo(x = 16.7574f, y = 7.0f)
                horizontalLineTo(x = 18.2378f)
                lineTo(x = 17.4989f, y = 5.47111f)
                lineTo(x = 16.7574f, y = 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 14.0f, y = 13.75f)
                curveTo(x1 = 14.0f, y1 = 13.3358f, x2 = 14.3358f, y2 = 13.0f, x3 = 14.75f, y3 = 13.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.542f, y1 = 13.0f, x2 = 20.8075f, y2 = 13.1695f, x3 = 20.9304f, y3 = 13.4344f)
                curveTo(x1 = 21.0533f, y1 = 13.6994f, x2 = 21.0112f, y2 = 14.0115f, x3 = 20.8225f, y3 = 14.2345f)
                lineTo(x = 16.3671f, y = 19.5f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 19.5f, x2 = 21.0f, y2 = 19.8358f, x3 = 21.0f, y3 = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 14.75f)
                curveTo(x1 = 14.458f, y1 = 21.0f, x2 = 14.1925f, y2 = 20.8305f, x3 = 14.0696f, y3 = 20.5656f)
                curveTo(x1 = 13.9467f, y1 = 20.3006f, x2 = 13.9888f, y2 = 19.9885f, x3 = 14.1775f, y3 = 19.7655f)
                lineTo(x = 18.6329f, y = 14.5f)
                horizontalLineTo(x = 14.75f)
                curveTo(x1 = 14.3358f, y1 = 14.5f, x2 = 14.0f, y2 = 14.1642f, x3 = 14.0f, y3 = 13.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 7.0f, y = 3.0f)
                curveTo(x1 = 7.41421f, y1 = 3.0f, x2 = 7.75f, y2 = 3.33579f, x3 = 7.75f, y3 = 3.75f)
                verticalLineTo(y = 18.4393f)
                lineTo(x = 9.46967f, y = 16.7197f)
                curveTo(x1 = 9.76256f, y1 = 16.4268f, x2 = 10.2374f, y2 = 16.4268f, x3 = 10.5303f, y3 = 16.7197f)
                curveTo(x1 = 10.8232f, y1 = 17.0126f, x2 = 10.8232f, y2 = 17.4874f, x3 = 10.5303f, y3 = 17.7803f)
                lineTo(x = 7.53033f, y = 20.7803f)
                curveTo(x1 = 7.23744f, y1 = 21.0732f, x2 = 6.76256f, y2 = 21.0732f, x3 = 6.46967f, y3 = 20.7803f)
                lineTo(x = 3.46967f, y = 17.7803f)
                curveTo(x1 = 3.17678f, y1 = 17.4874f, x2 = 3.17678f, y2 = 17.0126f, x3 = 3.46967f, y3 = 16.7197f)
                curveTo(x1 = 3.76256f, y1 = 16.4268f, x2 = 4.23744f, y2 = 16.4268f, x3 = 4.53033f, y3 = 16.7197f)
                lineTo(x = 6.25f, y = 18.4393f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 6.25f, y1 = 3.33579f, x2 = 6.58579f, y2 = 3.0f, x3 = 7.0f, y3 = 3.0f)
                close()
            }
        }.build().also { _sortAscending = it }
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
                imageVector = SortAscending,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _sortAscending: ImageVector? = null
