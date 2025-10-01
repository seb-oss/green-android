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

val EyeOpen: ImageVector
    get() {
        val current = _eyeOpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.EyeOpen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 4.0f)
                curveTo(x1 = 16.1417f, y1 = 4.00003f, x2 = 20.1618f, y2 = 6.64058f, x3 = 22.671f, y3 = 11.6649f)
                curveTo(x1 = 22.7763f, y1 = 11.8759f, x2 = 22.7763f, y2 = 12.1241f, x3 = 22.671f, y3 = 12.3351f)
                curveTo(x1 = 20.1618f, y1 = 17.3595f, x2 = 16.1417f, y2 = 20.0f, x3 = 12.0f, y3 = 19.9999f)
                curveTo(x1 = 7.85826f, y1 = 19.9999f, x2 = 3.83815f, y2 = 17.3593f, x3 = 1.32902f, y3 = 12.335f)
                curveTo(x1 = 1.22366f, y1 = 12.124f, x2 = 1.22366f, y2 = 11.8758f, x3 = 1.32902f, y3 = 11.6648f)
                curveTo(x1 = 3.83815f, y1 = 6.64046f, x2 = 7.85827f, y2 = 3.99997f, x3 = 12.0f, y3 = 4.0f)
                close()
                moveTo(x = 8.375f, y = 12.0f)
                curveTo(x1 = 8.375f, y1 = 9.99797f, x2 = 9.99797f, y2 = 8.375f, x3 = 12.0f, y3 = 8.375f)
                curveTo(x1 = 14.002f, y1 = 8.375f, x2 = 15.625f, y2 = 9.99797f, x3 = 15.625f, y3 = 12.0f)
                curveTo(x1 = 15.625f, y1 = 14.002f, x2 = 14.002f, y2 = 15.625f, x3 = 12.0f, y3 = 15.625f)
                curveTo(x1 = 9.99797f, y1 = 15.625f, x2 = 8.375f, y2 = 14.002f, x3 = 8.375f, y3 = 12.0f)
                close()
            }
        }.build().also { _eyeOpen = it }
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
                imageVector = EyeOpen,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _eyeOpen: ImageVector? = null
