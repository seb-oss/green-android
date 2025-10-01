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

val Thermostat: ImageVector
    get() {
        val current = _thermostat
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Thermostat",
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
                moveTo(x = 15.75f, y = 4.25f)
                horizontalLineTo(x = 19.25f)
                moveTo(x = 15.75f, y = 8.25f)
                horizontalLineTo(x = 19.25f)
                moveTo(x = 15.75f, y = 12.25f)
                horizontalLineTo(x = 19.25f)
                moveTo(x = 13.25f, y = 17.0f)
                curveTo(x1 = 13.25f, y1 = 19.3472f, x2 = 11.3472f, y2 = 21.25f, x3 = 9.0f, y3 = 21.25f)
                curveTo(x1 = 6.65279f, y1 = 21.25f, x2 = 4.75f, y2 = 19.3472f, x3 = 4.75f, y3 = 17.0f)
                curveTo(x1 = 4.75f, y1 = 15.4791f, x2 = 5.54892f, y2 = 14.1447f, x3 = 6.75f, y3 = 13.3938f)
                verticalLineTo(y = 2.75f)
                horizontalLineTo(x = 11.25f)
                verticalLineTo(y = 13.3938f)
                curveTo(x1 = 12.4511f, y1 = 14.1447f, x2 = 13.25f, y2 = 15.4791f, x3 = 13.25f, y3 = 17.0f)
                close()
            }
        }.build().also { _thermostat = it }
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
                imageVector = Thermostat,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _thermostat: ImageVector? = null
