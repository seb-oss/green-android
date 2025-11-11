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

internal val ChevronRightSmall: ImageVector
    get() {
        val current = _chevronRightSmall
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChevronRightSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 9.46967f, y = 7.46967f)
                curveTo(x1 = 9.76256f, y1 = 7.17678f, x2 = 10.2374f, y2 = 7.17678f, x3 = 10.5303f, y3 = 7.46967f)
                lineTo(x = 14.5303f, y = 11.4697f)
                curveTo(x1 = 14.8232f, y1 = 11.7626f, x2 = 14.8232f, y2 = 12.2374f, x3 = 14.5303f, y3 = 12.5303f)
                lineTo(x = 10.5303f, y = 16.5303f)
                curveTo(x1 = 10.2374f, y1 = 16.8232f, x2 = 9.76256f, y2 = 16.8232f, x3 = 9.46967f, y3 = 16.5303f)
                curveTo(x1 = 9.17678f, y1 = 16.2374f, x2 = 9.17678f, y2 = 15.7626f, x3 = 9.46967f, y3 = 15.4697f)
                lineTo(x = 12.9393f, y = 12.0f)
                lineTo(x = 9.46967f, y = 8.53033f)
                curveTo(x1 = 9.17678f, y1 = 8.23744f, x2 = 9.17678f, y2 = 7.76256f, x3 = 9.46967f, y3 = 7.46967f)
                close()
            }
        }.build().also { _chevronRightSmall = it }
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
                imageVector = ChevronRightSmall,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chevronRightSmall: ImageVector? = null
