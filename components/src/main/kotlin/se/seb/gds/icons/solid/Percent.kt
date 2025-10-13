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

internal val Percent: ImageVector
    get() {
        val current = _percent
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Percent",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 6.47715f, x2 = 17.5228f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                close()
                moveTo(x = 8.0f, y = 9.0f)
                curveTo(x1 = 8.0f, y1 = 9.55228f, x2 = 8.44772f, y2 = 10.0f, x3 = 9.0f, y3 = 10.0f)
                curveTo(x1 = 9.55228f, y1 = 10.0f, x2 = 10.0f, y2 = 9.55228f, x3 = 10.0f, y3 = 9.0f)
                curveTo(x1 = 10.0f, y1 = 8.44772f, x2 = 9.55228f, y2 = 8.0f, x3 = 9.0f, y3 = 8.0f)
                curveTo(x1 = 8.44772f, y1 = 8.0f, x2 = 8.0f, y2 = 8.44772f, x3 = 8.0f, y3 = 9.0f)
                close()
                moveTo(x = 14.0f, y = 15.0f)
                curveTo(x1 = 14.0f, y1 = 15.5523f, x2 = 14.4477f, y2 = 16.0f, x3 = 15.0f, y3 = 16.0f)
                curveTo(x1 = 15.5523f, y1 = 16.0f, x2 = 16.0f, y2 = 15.5523f, x3 = 16.0f, y3 = 15.0f)
                curveTo(x1 = 16.0f, y1 = 14.4477f, x2 = 15.5523f, y2 = 14.0f, x3 = 15.0f, y3 = 14.0f)
                curveTo(x1 = 14.4477f, y1 = 14.0f, x2 = 14.0f, y2 = 14.4477f, x3 = 14.0f, y3 = 15.0f)
                close()
                moveTo(x = 16.5303f, y = 8.53033f)
                curveTo(x1 = 16.8232f, y1 = 8.23744f, x2 = 16.8232f, y2 = 7.76256f, x3 = 16.5303f, y3 = 7.46967f)
                curveTo(x1 = 16.2374f, y1 = 7.17678f, x2 = 15.7626f, y2 = 7.17678f, x3 = 15.4697f, y3 = 7.46967f)
                lineTo(x = 7.46967f, y = 15.4697f)
                curveTo(x1 = 7.17678f, y1 = 15.7626f, x2 = 7.17678f, y2 = 16.2374f, x3 = 7.46967f, y3 = 16.5303f)
                curveTo(x1 = 7.76256f, y1 = 16.8232f, x2 = 8.23744f, y2 = 16.8232f, x3 = 8.53033f, y3 = 16.5303f)
                lineTo(x = 16.5303f, y = 8.53033f)
                close()
            }
        }.build().also { _percent = it }
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
                imageVector = Percent,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _percent: ImageVector? = null
