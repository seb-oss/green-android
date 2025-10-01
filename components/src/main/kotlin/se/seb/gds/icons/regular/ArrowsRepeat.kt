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

val ArrowsRepeat: ImageVector
    get() {
        val current = _arrowsRepeat
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowsRepeat",
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
                moveTo(x = 3.75f, y = 13.25f)
                verticalLineTo(y = 4.75f)
                horizontalLineTo(x = 15.1071f)
                moveTo(x = 12.6457f, y = 1.75f)
                lineTo(x = 15.7529f, y = 4.75f)
                lineTo(x = 12.6457f, y = 7.75f)
                moveTo(x = 20.25f, y = 10.75f)
                verticalLineTo(y = 19.25f)
                horizontalLineTo(x = 8.89286f)
                moveTo(x = 11.3543f, y = 22.25f)
                lineTo(x = 8.24714f, y = 19.25f)
                lineTo(x = 11.3543f, y = 16.25f)
            }
        }.build().also { _arrowsRepeat = it }
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
                imageVector = ArrowsRepeat,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowsRepeat: ImageVector? = null
