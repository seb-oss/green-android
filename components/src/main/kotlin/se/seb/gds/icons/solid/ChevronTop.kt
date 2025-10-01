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

val ChevronTop: ImageVector
    get() {
        val current = _chevronTop
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChevronTop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 6.25f)
                curveTo(x1 = 12.1989f, y1 = 6.25f, x2 = 12.3897f, y2 = 6.32902f, x3 = 12.5303f, y3 = 6.46967f)
                lineTo(x = 20.5303f, y = 14.4697f)
                curveTo(x1 = 20.8232f, y1 = 14.7626f, x2 = 20.8232f, y2 = 15.2374f, x3 = 20.5303f, y3 = 15.5303f)
                curveTo(x1 = 20.2374f, y1 = 15.8232f, x2 = 19.7626f, y2 = 15.8232f, x3 = 19.4697f, y3 = 15.5303f)
                lineTo(x = 12.0f, y = 8.06066f)
                lineTo(x = 4.53033f, y = 15.5303f)
                curveTo(x1 = 4.23744f, y1 = 15.8232f, x2 = 3.76256f, y2 = 15.8232f, x3 = 3.46967f, y3 = 15.5303f)
                curveTo(x1 = 3.17678f, y1 = 15.2374f, x2 = 3.17678f, y2 = 14.7626f, x3 = 3.46967f, y3 = 14.4697f)
                lineTo(x = 11.4697f, y = 6.46967f)
                curveTo(x1 = 11.6103f, y1 = 6.32902f, x2 = 11.8011f, y2 = 6.25f, x3 = 12.0f, y3 = 6.25f)
                close()
            }
        }.build().also { _chevronTop = it }
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
                imageVector = ChevronTop,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chevronTop: ImageVector? = null
