package se.seb.gds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _done: ImageVector? = null

fun createCheckIcon(): ImageVector {
    if (_done != null) {
        return _done!!
    }
    _done = ImageVector.Builder(
        name = "Checkmark",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f
    ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathBuilder = {
                moveTo(12.5f, 5.0f) // Start at the bottom-left of the checkmark
                lineTo(7.0f, 11.5f) // Draw the diagonal line up to the middle
                lineTo(4.0f, 8.5f) // Draw the diagonal line down to the end
            }
        )
    }.build()
    return _done!!
}
