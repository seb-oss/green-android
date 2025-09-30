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

val ArrowDown: ImageVector
    get() {
        val current = _arrowDown
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowDown",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 12.0f, y = 21.0f)
                    curveTo(x1 = 11.6685f, y1 = 21.0f, x2 = 11.3506f, y2 = 20.8683f, x3 = 11.1161f, y3 = 20.6339f)
                    lineTo(x = 5.36612f, y = 14.8839f)
                    curveTo(x1 = 4.87796f, y1 = 14.3957f, x2 = 4.87796f, y2 = 13.6043f, x3 = 5.36612f, y3 = 13.1161f)
                    curveTo(x1 = 5.85427f, y1 = 12.628f, x2 = 6.64573f, y2 = 12.628f, x3 = 7.13388f, y3 = 13.1161f)
                    lineTo(x = 10.75f, y = 16.7322f)
                    verticalLineTo(y = 4.25f)
                    curveTo(x1 = 10.75f, y1 = 3.55964f, x2 = 11.3097f, y2 = 3.0f, x3 = 12.0f, y3 = 3.0f)
                    curveTo(x1 = 12.6904f, y1 = 3.0f, x2 = 13.25f, y2 = 3.55964f, x3 = 13.25f, y3 = 4.25f)
                    verticalLineTo(y = 16.7322f)
                    lineTo(x = 16.8661f, y = 13.1161f)
                    curveTo(x1 = 17.3543f, y1 = 12.628f, x2 = 18.1457f, y2 = 12.628f, x3 = 18.6339f, y3 = 13.1161f)
                    curveTo(x1 = 19.122f, y1 = 13.6043f, x2 = 19.122f, y2 = 14.3957f, x3 = 18.6339f, y3 = 14.8839f)
                    lineTo(x = 12.8839f, y = 20.6339f)
                    curveTo(x1 = 12.6495f, y1 = 20.8683f, x2 = 12.3315f, y2 = 21.0f, x3 = 12.0f, y3 = 21.0f)
                    close()
                }
            }.build()
            .also { _arrowDown = it }
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
                imageVector = ArrowDown,
                contentDescription = null,
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowDown: ImageVector? = null
