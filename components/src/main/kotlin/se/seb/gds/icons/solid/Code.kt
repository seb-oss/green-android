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

internal val Code: ImageVector
    get() {
        val current = _code
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Code",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.0f, y = 3.75f)
                curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 3.0f, x2 = 21.0f, y2 = 3.33579f, x3 = 21.0f, y3 = 3.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 10.7803f, y = 8.46967f)
                curveTo(x1 = 11.0732f, y1 = 8.76256f, x2 = 11.0732f, y2 = 9.23744f, x3 = 10.7803f, y3 = 9.53033f)
                lineTo(x = 8.84099f, y = 11.4697f)
                curveTo(x1 = 8.5481f, y1 = 11.7626f, x2 = 8.5481f, y2 = 12.2374f, x3 = 8.84099f, y3 = 12.5303f)
                lineTo(x = 10.7803f, y = 14.4697f)
                curveTo(x1 = 11.0732f, y1 = 14.7626f, x2 = 11.0732f, y2 = 15.2374f, x3 = 10.7803f, y3 = 15.5303f)
                curveTo(x1 = 10.4874f, y1 = 15.8232f, x2 = 10.0126f, y2 = 15.8232f, x3 = 9.71967f, y3 = 15.5303f)
                lineTo(x = 6.71967f, y = 12.5303f)
                curveTo(x1 = 6.42678f, y1 = 12.2374f, x2 = 6.42678f, y2 = 11.7626f, x3 = 6.71967f, y3 = 11.4697f)
                lineTo(x = 9.71967f, y = 8.46967f)
                curveTo(x1 = 10.0126f, y1 = 8.17678f, x2 = 10.4874f, y2 = 8.17678f, x3 = 10.7803f, y3 = 8.46967f)
                close()
                moveTo(x = 14.2803f, y = 8.46967f)
                curveTo(x1 = 13.9874f, y1 = 8.17678f, x2 = 13.5126f, y2 = 8.17678f, x3 = 13.2197f, y3 = 8.46967f)
                curveTo(x1 = 12.9268f, y1 = 8.76256f, x2 = 12.9268f, y2 = 9.23744f, x3 = 13.2197f, y3 = 9.53033f)
                lineTo(x = 15.159f, y = 11.4697f)
                curveTo(x1 = 15.4519f, y1 = 11.7626f, x2 = 15.4519f, y2 = 12.2374f, x3 = 15.159f, y3 = 12.5303f)
                lineTo(x = 13.2197f, y = 14.4697f)
                curveTo(x1 = 12.9268f, y1 = 14.7626f, x2 = 12.9268f, y2 = 15.2374f, x3 = 13.2197f, y3 = 15.5303f)
                curveTo(x1 = 13.5126f, y1 = 15.8232f, x2 = 13.9874f, y2 = 15.8232f, x3 = 14.2803f, y3 = 15.5303f)
                lineTo(x = 17.2803f, y = 12.5303f)
                curveTo(x1 = 17.5732f, y1 = 12.2374f, x2 = 17.5732f, y2 = 11.7626f, x3 = 17.2803f, y3 = 11.4697f)
                lineTo(x = 14.2803f, y = 8.46967f)
                close()
            }
        }.build().also { _code = it }
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
                imageVector = Code,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _code: ImageVector? = null
