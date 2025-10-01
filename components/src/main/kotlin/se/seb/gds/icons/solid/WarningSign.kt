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

val WarningSign: ImageVector
    get() {
        val current = _warningSign
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.WarningSign",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 6.0211f, y = 3.5733f)
                curveTo(x1 = 6.10266f, y1 = 3.23689f, x2 = 6.40384f, y2 = 3.0f, x3 = 6.74999f, y3 = 3.0f)
                horizontalLineTo(x = 17.25f)
                curveTo(x1 = 17.5961f, y1 = 3.0f, x2 = 17.8973f, y2 = 3.23689f, x3 = 17.9789f, y3 = 3.5733f)
                lineTo(x = 21.9789f, y = 20.0733f)
                curveTo(x1 = 22.0765f, y1 = 20.4759f, x2 = 21.8292f, y2 = 20.8813f, x3 = 21.4267f, y3 = 20.9789f)
                curveTo(x1 = 21.0241f, y1 = 21.0765f, x2 = 20.6187f, y2 = 20.8293f, x3 = 20.5211f, y3 = 20.4267f)
                lineTo(x = 19.8116f, y = 17.5f)
                horizontalLineTo(x = 14.6884f)
                lineTo(x = 13.9789f, y = 20.4267f)
                curveTo(x1 = 13.8813f, y1 = 20.8293f, x2 = 13.4758f, y2 = 21.0765f, x3 = 13.0733f, y3 = 20.9789f)
                curveTo(x1 = 12.6707f, y1 = 20.8813f, x2 = 12.4235f, y2 = 20.4759f, x3 = 12.5211f, y3 = 20.0733f)
                lineTo(x = 13.1449f, y = 17.5f)
                horizontalLineTo(x = 4.18838f)
                lineTo(x = 3.47888f, y = 20.4267f)
                curveTo(x1 = 3.38129f, y1 = 20.8293f, x2 = 2.97584f, y2 = 21.0765f, x3 = 2.57329f, y3 = 20.9789f)
                curveTo(x1 = 2.17074f, y1 = 20.8813f, x2 = 1.92351f, y2 = 20.4759f, x3 = 2.0211f, y3 = 20.0733f)
                lineTo(x = 6.0211f, y = 3.5733f)
                close()
                moveTo(x = 17.25f, y = 6.93336f)
                lineTo(x = 15.052f, y = 16.0f)
                horizontalLineTo(x = 19.448f)
                lineTo(x = 17.25f, y = 6.93336f)
                close()
            }
        }.build().also { _warningSign = it }
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
                imageVector = WarningSign,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _warningSign: ImageVector? = null
