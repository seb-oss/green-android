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

val HeartBeat: ImageVector
    get() {
        val current = _heartBeat
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.HeartBeat",
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
                moveTo(x = 17.25f, y = 12.0f)
                horizontalLineTo(x = 15.15f)
                lineTo(x = 13.5f, y = 15.0f)
                lineTo(x = 10.5f, y = 9.0f)
                lineTo(x = 8.85f, y = 12.0f)
                horizontalLineTo(x = 6.75f)
                moveTo(x = 12.0f, y = 5.57193f)
                curveTo(x1 = 18.3331f, y1 = -0.86765f, x2 = 29.1898f, y2 = 11.0916f, x3 = 12.0f, y3 = 20.75f)
                curveTo(x1 = -5.18982f, y1 = 11.0916f, x2 = 5.66687f, y2 = -0.867651f, x3 = 12.0f, y3 = 5.57193f)
                close()
            }
        }.build().also { _heartBeat = it }
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
                imageVector = HeartBeat,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _heartBeat: ImageVector? = null
