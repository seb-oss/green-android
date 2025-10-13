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

internal val CrossSmall: ImageVector
    get() {
        val current = _crossSmall
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.CrossSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 7.11612f, y = 7.11612f)
                curveTo(x1 = 7.60427f, y1 = 6.62796f, x2 = 8.39573f, y2 = 6.62796f, x3 = 8.88388f, y3 = 7.11612f)
                lineTo(x = 12.0f, y = 10.2322f)
                lineTo(x = 15.1161f, y = 7.11612f)
                curveTo(x1 = 15.6043f, y1 = 6.62796f, x2 = 16.3957f, y2 = 6.62796f, x3 = 16.8839f, y3 = 7.11612f)
                curveTo(x1 = 17.372f, y1 = 7.60427f, x2 = 17.372f, y2 = 8.39573f, x3 = 16.8839f, y3 = 8.88388f)
                lineTo(x = 13.7678f, y = 12.0f)
                lineTo(x = 16.8839f, y = 15.1161f)
                curveTo(x1 = 17.372f, y1 = 15.6043f, x2 = 17.372f, y2 = 16.3957f, x3 = 16.8839f, y3 = 16.8839f)
                curveTo(x1 = 16.3957f, y1 = 17.372f, x2 = 15.6043f, y2 = 17.372f, x3 = 15.1161f, y3 = 16.8839f)
                lineTo(x = 12.0f, y = 13.7678f)
                lineTo(x = 8.88388f, y = 16.8839f)
                curveTo(x1 = 8.39573f, y1 = 17.372f, x2 = 7.60427f, y2 = 17.372f, x3 = 7.11612f, y3 = 16.8839f)
                curveTo(x1 = 6.62796f, y1 = 16.3957f, x2 = 6.62796f, y2 = 15.6043f, x3 = 7.11612f, y3 = 15.1161f)
                lineTo(x = 10.2322f, y = 12.0f)
                lineTo(x = 7.11612f, y = 8.88388f)
                curveTo(x1 = 6.62796f, y1 = 8.39573f, x2 = 6.62796f, y2 = 7.60427f, x3 = 7.11612f, y3 = 7.11612f)
                close()
            }
        }.build().also { _crossSmall = it }
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
                imageVector = CrossSmall,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _crossSmall: ImageVector? = null
