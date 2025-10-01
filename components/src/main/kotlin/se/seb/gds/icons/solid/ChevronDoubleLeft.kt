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

val ChevronDoubleLeft: ImageVector
    get() {
        val current = _chevronDoubleLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChevronDoubleLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 10.5303f, y = 7.46967f)
                curveTo(x1 = 10.8232f, y1 = 7.76256f, x2 = 10.8232f, y2 = 8.23744f, x3 = 10.5303f, y3 = 8.53033f)
                lineTo(x = 7.06066f, y = 12.0f)
                lineTo(x = 10.5303f, y = 15.4697f)
                curveTo(x1 = 10.8232f, y1 = 15.7626f, x2 = 10.8232f, y2 = 16.2374f, x3 = 10.5303f, y3 = 16.5303f)
                curveTo(x1 = 10.2374f, y1 = 16.8232f, x2 = 9.76256f, y2 = 16.8232f, x3 = 9.46967f, y3 = 16.5303f)
                lineTo(x = 5.46967f, y = 12.5303f)
                curveTo(x1 = 5.17678f, y1 = 12.2374f, x2 = 5.17678f, y2 = 11.7626f, x3 = 5.46967f, y3 = 11.4697f)
                lineTo(x = 9.46967f, y = 7.46967f)
                curveTo(x1 = 9.76256f, y1 = 7.17678f, x2 = 10.2374f, y2 = 7.17678f, x3 = 10.5303f, y3 = 7.46967f)
                close()
                moveTo(x = 17.5303f, y = 7.46967f)
                curveTo(x1 = 17.8232f, y1 = 7.76256f, x2 = 17.8232f, y2 = 8.23744f, x3 = 17.5303f, y3 = 8.53033f)
                lineTo(x = 14.0607f, y = 12.0f)
                lineTo(x = 17.5303f, y = 15.4697f)
                curveTo(x1 = 17.8232f, y1 = 15.7626f, x2 = 17.8232f, y2 = 16.2374f, x3 = 17.5303f, y3 = 16.5303f)
                curveTo(x1 = 17.2374f, y1 = 16.8232f, x2 = 16.7626f, y2 = 16.8232f, x3 = 16.4697f, y3 = 16.5303f)
                lineTo(x = 12.4697f, y = 12.5303f)
                curveTo(x1 = 12.1768f, y1 = 12.2374f, x2 = 12.1768f, y2 = 11.7626f, x3 = 12.4697f, y3 = 11.4697f)
                lineTo(x = 16.4697f, y = 7.46967f)
                curveTo(x1 = 16.7626f, y1 = 7.17678f, x2 = 17.2374f, y2 = 7.17678f, x3 = 17.5303f, y3 = 7.46967f)
                close()
            }
        }.build().also { _chevronDoubleLeft = it }
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
                imageVector = ChevronDoubleLeft,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chevronDoubleLeft: ImageVector? = null
