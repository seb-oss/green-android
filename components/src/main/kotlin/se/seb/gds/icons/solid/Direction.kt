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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Direction: ImageVector
    get() {
        val current = _direction
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Direction",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 3.0f)
                curveTo(x1 = 11.5858f, y1 = 3.0f, x2 = 11.25f, y2 = 3.33579f, x3 = 11.25f, y3 = 3.75f)
                verticalLineTo(y = 8.25f)
                horizontalLineTo(x = 4.75f)
                curveTo(x1 = 4.52216f, y1 = 8.25f, x2 = 4.30668f, y2 = 8.35357f, x3 = 4.16435f, y3 = 8.53148f)
                lineTo(x = 2.16435f, y = 11.0315f)
                curveTo(x1 = 1.94522f, y1 = 11.3054f, x2 = 1.94522f, y2 = 11.6946f, x3 = 2.16435f, y3 = 11.9685f)
                lineTo(x = 4.16435f, y = 14.4685f)
                curveTo(x1 = 4.30668f, y1 = 14.6464f, x2 = 4.52216f, y2 = 14.75f, x3 = 4.75f, y3 = 14.75f)
                horizontalLineTo(x = 11.25f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 7.75f)
                curveTo(x1 = 7.33579f, y1 = 19.5f, x2 = 7.0f, y2 = 19.8358f, x3 = 7.0f, y3 = 20.25f)
                curveTo(x1 = 7.0f, y1 = 20.6642f, x2 = 7.33579f, y2 = 21.0f, x3 = 7.75f, y3 = 21.0f)
                horizontalLineTo(x = 16.25f)
                curveTo(x1 = 16.6642f, y1 = 21.0f, x2 = 17.0f, y2 = 20.6642f, x3 = 17.0f, y3 = 20.25f)
                curveTo(x1 = 17.0f, y1 = 19.8358f, x2 = 16.6642f, y2 = 19.5f, x3 = 16.25f, y3 = 19.5f)
                horizontalLineTo(x = 12.75f)
                verticalLineTo(y = 9.75f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.4778f, y1 = 9.75f, x2 = 19.6933f, y2 = 9.64643f, x3 = 19.8357f, y3 = 9.46852f)
                lineTo(x = 21.8357f, y = 6.96852f)
                curveTo(x1 = 22.0468f, y1 = 6.70464f, x2 = 22.0553f, y2 = 6.33217f, x3 = 21.8566f, y3 = 6.05887f)
                lineTo(x = 19.8566f, y = 3.30887f)
                curveTo(x1 = 19.7154f, y1 = 3.11481f, x2 = 19.49f, y2 = 3.0f, x3 = 19.25f, y3 = 3.0f)
                horizontalLineTo(x = 12.0f)
                close()
            }
        }.build().also { _direction = it }
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
                imageVector = Direction,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _direction: ImageVector? = null
