package se.seb.gds.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
            ) {
                moveTo(x = 2.0f, y = 11.9999f)
                lineTo(x = 1.32902f, y = 11.6648f)
                curveTo(x1 = 1.22366f, y1 = 11.8758f, x2 = 1.22366f, y2 = 12.124f, x3 = 1.32902f, y3 = 12.335f)
                lineTo(x = 2.0f, y = 11.9999f)
                close()
                moveTo(x = 22.0f, y = 12.0f)
                lineTo(x = 22.671f, y = 12.3351f)
                curveTo(x1 = 22.7763f, y1 = 12.1241f, x2 = 22.7763f, y2 = 11.8759f, x3 = 22.671f, y3 = 11.6649f)
                lineTo(x = 22.0f, y = 12.0f)
                close()
                moveTo(x = 2.0f, y = 11.9999f)
                lineTo(x = 2.67098f, y = 12.335f)
                curveTo(x1 = 4.9893f, y1 = 7.69273f, x2 = 8.55546f, y2 = 5.49997f, x3 = 12.0f, y3 = 5.5f)
                curveTo(x1 = 15.4445f, y1 = 5.50003f, x2 = 19.0107f, y2 = 7.69284f, x3 = 21.329f, y3 = 12.3351f)
                lineTo(x = 22.0f, y = 12.0f)
                lineTo(x = 22.671f, y = 11.6649f)
                curveTo(x1 = 20.1618f, y1 = 6.64058f, x2 = 16.1417f, y2 = 4.00003f, x3 = 12.0f, y3 = 4.0f)
                curveTo(x1 = 7.85827f, y1 = 3.99997f, x2 = 3.83815f, y2 = 6.64046f, x3 = 1.32902f, y3 = 11.6648f)
                lineTo(x = 2.0f, y = 11.9999f)
                close()
                moveTo(x = 2.0f, y = 11.9999f)
                lineTo(x = 1.32902f, y = 12.335f)
                curveTo(x1 = 3.83815f, y1 = 17.3593f, x2 = 7.85826f, y2 = 19.9999f, x3 = 12.0f, y3 = 19.9999f)
                curveTo(x1 = 16.1417f, y1 = 20.0f, x2 = 20.1618f, y2 = 17.3595f, x3 = 22.671f, y3 = 12.3351f)
                lineTo(x = 22.0f, y = 12.0f)
                lineTo(x = 21.329f, y = 11.6649f)
                curveTo(x1 = 19.0107f, y1 = 16.3072f, x2 = 15.4445f, y2 = 18.4999f, x3 = 12.0f, y3 = 18.4999f)
                curveTo(x1 = 8.55547f, y1 = 18.4999f, x2 = 4.9893f, y2 = 16.3071f, x3 = 2.67098f, y3 = 11.6648f)
                lineTo(x = 2.0f, y = 11.9999f)
                close()
                moveTo(x = 15.25f, y = 12.0f)
                horizontalLineTo(x = 14.5f)
                curveTo(x1 = 14.5f, y1 = 13.3807f, x2 = 13.3807f, y2 = 14.5f, x3 = 12.0f, y3 = 14.5f)
                verticalLineTo(y = 15.25f)
                verticalLineTo(y = 16.0f)
                curveTo(x1 = 14.2091f, y1 = 16.0f, x2 = 16.0f, y2 = 14.2091f, x3 = 16.0f, y3 = 12.0f)
                horizontalLineTo(x = 15.25f)
                close()
                moveTo(x = 12.0f, y = 15.25f)
                verticalLineTo(y = 14.5f)
                curveTo(x1 = 10.6193f, y1 = 14.5f, x2 = 9.5f, y2 = 13.3807f, x3 = 9.5f, y3 = 12.0f)
                horizontalLineTo(x = 8.75f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 8.0f, y1 = 14.2091f, x2 = 9.79086f, y2 = 16.0f, x3 = 12.0f, y3 = 16.0f)
                verticalLineTo(y = 15.25f)
                close()
                moveTo(x = 8.75f, y = 12.0f)
                horizontalLineTo(x = 9.5f)
                curveTo(x1 = 9.5f, y1 = 10.6193f, x2 = 10.6193f, y2 = 9.5f, x3 = 12.0f, y3 = 9.5f)
                verticalLineTo(y = 8.75f)
                verticalLineTo(y = 8.0f)
                curveTo(x1 = 9.79086f, y1 = 8.0f, x2 = 8.0f, y2 = 9.79086f, x3 = 8.0f, y3 = 12.0f)
                horizontalLineTo(x = 8.75f)
                close()
                moveTo(x = 12.0f, y = 8.75f)
                verticalLineTo(y = 9.5f)
                curveTo(x1 = 13.3807f, y1 = 9.5f, x2 = 14.5f, y2 = 10.6193f, x3 = 14.5f, y3 = 12.0f)
                horizontalLineTo(x = 15.25f)
                horizontalLineTo(x = 16.0f)
                curveTo(x1 = 16.0f, y1 = 9.79086f, x2 = 14.2091f, y2 = 8.0f, x3 = 12.0f, y3 = 8.0f)
                verticalLineTo(y = 8.75f)
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
