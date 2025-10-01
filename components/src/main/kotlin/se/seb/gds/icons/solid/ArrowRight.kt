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

val ArrowRight: ImageVector
    get() {
        val current = _arrowRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 13.1161f, y = 5.36612f)
                curveTo(x1 = 13.6043f, y1 = 4.87796f, x2 = 14.3957f, y2 = 4.87796f, x3 = 14.8839f, y3 = 5.36612f)
                lineTo(x = 20.6339f, y = 11.1161f)
                curveTo(x1 = 20.8683f, y1 = 11.3505f, x2 = 21.0f, y2 = 11.6685f, x3 = 21.0f, y3 = 12.0f)
                curveTo(x1 = 21.0f, y1 = 12.3315f, x2 = 20.8683f, y2 = 12.6494f, x3 = 20.6339f, y3 = 12.8839f)
                lineTo(x = 14.8839f, y = 18.6339f)
                curveTo(x1 = 14.3957f, y1 = 19.122f, x2 = 13.6043f, y2 = 19.122f, x3 = 13.1161f, y3 = 18.6339f)
                curveTo(x1 = 12.628f, y1 = 18.1457f, x2 = 12.628f, y2 = 17.3543f, x3 = 13.1161f, y3 = 16.8661f)
                lineTo(x = 16.7322f, y = 13.25f)
                horizontalLineTo(x = 4.25f)
                curveTo(x1 = 3.55964f, y1 = 13.25f, x2 = 3.0f, y2 = 12.6903f, x3 = 3.0f, y3 = 12.0f)
                curveTo(x1 = 3.0f, y1 = 11.3096f, x2 = 3.55964f, y2 = 10.75f, x3 = 4.25f, y3 = 10.75f)
                horizontalLineTo(x = 16.7322f)
                lineTo(x = 13.1161f, y = 7.13388f)
                curveTo(x1 = 12.628f, y1 = 6.64573f, x2 = 12.628f, y2 = 5.85427f, x3 = 13.1161f, y3 = 5.36612f)
                close()
            }
        }.build().also { _arrowRight = it }
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
                imageVector = ArrowRight,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowRight: ImageVector? = null
