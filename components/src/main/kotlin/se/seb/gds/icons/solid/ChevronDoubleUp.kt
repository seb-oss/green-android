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

val ChevronDoubleUp: ImageVector
    get() {
        val current = _chevronDoubleUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChevronDoubleUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 7.46967f, y = 18.0303f)
                curveTo(x1 = 7.76256f, y1 = 18.3232f, x2 = 8.23744f, y2 = 18.3232f, x3 = 8.53033f, y3 = 18.0303f)
                lineTo(x = 12.0f, y = 14.5607f)
                lineTo(x = 15.4697f, y = 18.0303f)
                curveTo(x1 = 15.7626f, y1 = 18.3232f, x2 = 16.2374f, y2 = 18.3232f, x3 = 16.5303f, y3 = 18.0303f)
                curveTo(x1 = 16.8232f, y1 = 17.7374f, x2 = 16.8232f, y2 = 17.2626f, x3 = 16.5303f, y3 = 16.9697f)
                lineTo(x = 12.5303f, y = 12.9697f)
                curveTo(x1 = 12.2374f, y1 = 12.6768f, x2 = 11.7626f, y2 = 12.6768f, x3 = 11.4697f, y3 = 12.9697f)
                lineTo(x = 7.46967f, y = 16.9697f)
                curveTo(x1 = 7.17678f, y1 = 17.2626f, x2 = 7.17678f, y2 = 17.7374f, x3 = 7.46967f, y3 = 18.0303f)
                close()
                moveTo(x = 7.46967f, y = 11.0303f)
                curveTo(x1 = 7.76256f, y1 = 11.3232f, x2 = 8.23744f, y2 = 11.3232f, x3 = 8.53033f, y3 = 11.0303f)
                lineTo(x = 12.0f, y = 7.56066f)
                lineTo(x = 15.4697f, y = 11.0303f)
                curveTo(x1 = 15.7626f, y1 = 11.3232f, x2 = 16.2374f, y2 = 11.3232f, x3 = 16.5303f, y3 = 11.0303f)
                curveTo(x1 = 16.8232f, y1 = 10.7374f, x2 = 16.8232f, y2 = 10.2626f, x3 = 16.5303f, y3 = 9.96967f)
                lineTo(x = 12.5303f, y = 5.96967f)
                curveTo(x1 = 12.2374f, y1 = 5.67678f, x2 = 11.7626f, y2 = 5.67678f, x3 = 11.4697f, y3 = 5.96967f)
                lineTo(x = 7.46967f, y = 9.96967f)
                curveTo(x1 = 7.17678f, y1 = 10.2626f, x2 = 7.17678f, y2 = 10.7374f, x3 = 7.46967f, y3 = 11.0303f)
                close()
            }
        }.build().also { _chevronDoubleUp = it }
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
                imageVector = ChevronDoubleUp,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chevronDoubleUp: ImageVector? = null
