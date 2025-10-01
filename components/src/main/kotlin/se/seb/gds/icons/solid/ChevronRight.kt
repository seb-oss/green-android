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

val ChevronRight: ImageVector
    get() {
        val current = _chevronRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChevronRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 8.46967f, y = 3.46967f)
                curveTo(x1 = 8.76256f, y1 = 3.17678f, x2 = 9.23744f, y2 = 3.17678f, x3 = 9.53033f, y3 = 3.46967f)
                lineTo(x = 17.5303f, y = 11.4697f)
                curveTo(x1 = 17.671f, y1 = 11.6103f, x2 = 17.75f, y2 = 11.8011f, x3 = 17.75f, y3 = 12.0f)
                curveTo(x1 = 17.75f, y1 = 12.1989f, x2 = 17.671f, y2 = 12.3897f, x3 = 17.5303f, y3 = 12.5303f)
                lineTo(x = 9.53033f, y = 20.5303f)
                curveTo(x1 = 9.23744f, y1 = 20.8232f, x2 = 8.76256f, y2 = 20.8232f, x3 = 8.46967f, y3 = 20.5303f)
                curveTo(x1 = 8.17678f, y1 = 20.2374f, x2 = 8.17678f, y2 = 19.7626f, x3 = 8.46967f, y3 = 19.4697f)
                lineTo(x = 15.9393f, y = 12.0f)
                lineTo(x = 8.46967f, y = 4.53033f)
                curveTo(x1 = 8.17678f, y1 = 4.23744f, x2 = 8.17678f, y2 = 3.76256f, x3 = 8.46967f, y3 = 3.46967f)
                close()
            }
        }.build().also { _chevronRight = it }
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
                imageVector = ChevronRight,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chevronRight: ImageVector? = null
