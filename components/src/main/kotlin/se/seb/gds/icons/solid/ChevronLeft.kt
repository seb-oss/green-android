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

internal val ChevronLeft: ImageVector
    get() {
        val current = _chevronLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChevronLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 15.5303f, y = 3.46967f)
                curveTo(x1 = 15.8232f, y1 = 3.76256f, x2 = 15.8232f, y2 = 4.23744f, x3 = 15.5303f, y3 = 4.53033f)
                lineTo(x = 8.06066f, y = 12.0f)
                lineTo(x = 15.5303f, y = 19.4697f)
                curveTo(x1 = 15.8232f, y1 = 19.7626f, x2 = 15.8232f, y2 = 20.2374f, x3 = 15.5303f, y3 = 20.5303f)
                curveTo(x1 = 15.2374f, y1 = 20.8232f, x2 = 14.7626f, y2 = 20.8232f, x3 = 14.4697f, y3 = 20.5303f)
                lineTo(x = 6.46967f, y = 12.5303f)
                curveTo(x1 = 6.32902f, y1 = 12.3897f, x2 = 6.25f, y2 = 12.1989f, x3 = 6.25f, y3 = 12.0f)
                curveTo(x1 = 6.25f, y1 = 11.8011f, x2 = 6.32902f, y2 = 11.6103f, x3 = 6.46967f, y3 = 11.4697f)
                lineTo(x = 14.4697f, y = 3.46967f)
                curveTo(x1 = 14.7626f, y1 = 3.17678f, x2 = 15.2374f, y2 = 3.17678f, x3 = 15.5303f, y3 = 3.46967f)
                close()
            }
        }.build().also { _chevronLeft = it }
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
                imageVector = ChevronLeft,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chevronLeft: ImageVector? = null
