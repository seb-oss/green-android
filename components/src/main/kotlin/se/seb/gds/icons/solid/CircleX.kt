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

internal val CircleX: ImageVector
    get() {
        val current = _circleX
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.CircleX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 2.0f, y = 12.0f)
                curveTo(x1 = 2.0f, y1 = 6.47715f, x2 = 6.47715f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 17.5228f, y1 = 2.0f, x2 = 22.0f, y2 = 6.47715f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 17.5228f, x2 = 17.5228f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 6.47715f, y1 = 22.0f, x2 = 2.0f, y2 = 17.5228f, x3 = 2.0f, y3 = 12.0f)
                close()
                moveTo(x = 9.53033f, y = 8.46967f)
                curveTo(x1 = 9.23744f, y1 = 8.17678f, x2 = 8.76256f, y2 = 8.17678f, x3 = 8.46967f, y3 = 8.46967f)
                curveTo(x1 = 8.17678f, y1 = 8.76256f, x2 = 8.17678f, y2 = 9.23744f, x3 = 8.46967f, y3 = 9.53033f)
                lineTo(x = 10.9393f, y = 12.0f)
                lineTo(x = 8.46967f, y = 14.4697f)
                curveTo(x1 = 8.17678f, y1 = 14.7626f, x2 = 8.17678f, y2 = 15.2374f, x3 = 8.46967f, y3 = 15.5303f)
                curveTo(x1 = 8.76256f, y1 = 15.8232f, x2 = 9.23744f, y2 = 15.8232f, x3 = 9.53033f, y3 = 15.5303f)
                lineTo(x = 12.0f, y = 13.0607f)
                lineTo(x = 14.4697f, y = 15.5303f)
                curveTo(x1 = 14.7626f, y1 = 15.8232f, x2 = 15.2374f, y2 = 15.8232f, x3 = 15.5303f, y3 = 15.5303f)
                curveTo(x1 = 15.8232f, y1 = 15.2374f, x2 = 15.8232f, y2 = 14.7626f, x3 = 15.5303f, y3 = 14.4697f)
                lineTo(x = 13.0607f, y = 12.0f)
                lineTo(x = 15.5303f, y = 9.53033f)
                curveTo(x1 = 15.8232f, y1 = 9.23744f, x2 = 15.8232f, y2 = 8.76256f, x3 = 15.5303f, y3 = 8.46967f)
                curveTo(x1 = 15.2374f, y1 = 8.17678f, x2 = 14.7626f, y2 = 8.17678f, x3 = 14.4697f, y3 = 8.46967f)
                lineTo(x = 12.0f, y = 10.9393f)
                lineTo(x = 9.53033f, y = 8.46967f)
                close()
            }
        }.build().also { _circleX = it }
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
                imageVector = CircleX,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _circleX: ImageVector? = null
