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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val ArrowRotateCounterClockwise: ImageVector
    get() {
        val current = _arrowRotateCounterClockwise
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowRotateCounterClockwise",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.24023f, y = 14.75f)
                curveTo(x1 = 5.37278f, y1 = 17.9543f, x2 = 8.42869f, y2 = 20.25f, x3 = 12.0208f, y3 = 20.25f)
                curveTo(x1 = 16.5771f, y1 = 20.25f, x2 = 20.2708f, y2 = 16.5563f, x3 = 20.2708f, y3 = 12.0f)
                curveTo(x1 = 20.2708f, y1 = 7.44365f, x2 = 16.5771f, y2 = 3.75f, x3 = 12.0208f, y3 = 3.75f)
                curveTo(x1 = 8.82811f, y1 = 3.75f, x2 = 6.83534f, y2 = 5.29688f, x3 = 4.77284f, y3 = 7.875f)
                moveTo(x = 4.7498f, y = 4.0f)
                verticalLineTo(y = 8.0f)
                horizontalLineTo(x = 8.7498f)
            }
        }.build().also { _arrowRotateCounterClockwise = it }
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
                imageVector = ArrowRotateCounterClockwise,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowRotateCounterClockwise: ImageVector? = null
