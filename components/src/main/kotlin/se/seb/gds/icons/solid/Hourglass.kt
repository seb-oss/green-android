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

internal val Hourglass: ImageVector
    get() {
        val current = _hourglass
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Hourglass",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 5.0f, y = 3.5f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 3.5f, x2 = 3.0f, y2 = 3.16421f, x3 = 3.0f, y3 = 2.75f)
                curveTo(x1 = 3.0f, y1 = 2.33579f, x2 = 3.33579f, y2 = 2.0f, x3 = 3.75f, y3 = 2.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 2.0f, x2 = 21.0f, y2 = 2.33579f, x3 = 21.0f, y3 = 2.75f)
                curveTo(x1 = 21.0f, y1 = 3.16421f, x2 = 20.6642f, y2 = 3.5f, x3 = 20.25f, y3 = 3.5f)
                horizontalLineTo(x = 19.0f)
                verticalLineTo(y = 8.0f)
                curveTo(x1 = 19.0f, y1 = 8.25574f, x2 = 18.8697f, y2 = 8.49385f, x3 = 18.6543f, y3 = 8.6317f)
                lineTo(x = 13.3913f, y = 12.0f)
                lineTo(x = 18.6543f, y = 15.3683f)
                curveTo(x1 = 18.8697f, y1 = 15.5062f, x2 = 19.0f, y2 = 15.7443f, x3 = 19.0f, y3 = 16.0f)
                verticalLineTo(y = 20.5f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 20.5f, x2 = 21.0f, y2 = 20.8358f, x3 = 21.0f, y3 = 21.25f)
                curveTo(x1 = 21.0f, y1 = 21.6642f, x2 = 20.6642f, y2 = 22.0f, x3 = 20.25f, y3 = 22.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 22.0f, x2 = 3.0f, y2 = 21.6642f, x3 = 3.0f, y3 = 21.25f)
                curveTo(x1 = 3.0f, y1 = 20.8358f, x2 = 3.33579f, y2 = 20.5f, x3 = 3.75f, y3 = 20.5f)
                horizontalLineTo(x = 5.0f)
                verticalLineTo(y = 16.0f)
                curveTo(x1 = 5.0f, y1 = 15.7443f, x2 = 5.13031f, y2 = 15.5062f, x3 = 5.34571f, y3 = 15.3683f)
                lineTo(x = 10.6087f, y = 12.0f)
                lineTo(x = 5.34571f, y = 8.6317f)
                curveTo(x1 = 5.13031f, y1 = 8.49385f, x2 = 5.0f, y2 = 8.25574f, x3 = 5.0f, y3 = 8.0f)
                verticalLineTo(y = 3.5f)
                close()
                moveTo(x = 6.5f, y = 7.0f)
                horizontalLineTo(x = 17.5f)
                verticalLineTo(y = 3.5f)
                horizontalLineTo(x = 6.5f)
                verticalLineTo(y = 7.0f)
                close()
                moveTo(x = 17.5f, y = 16.4104f)
                verticalLineTo(y = 18.0f)
                horizontalLineTo(x = 6.5f)
                verticalLineTo(y = 16.4104f)
                lineTo(x = 12.0f, y = 12.8904f)
                lineTo(x = 17.5f, y = 16.4104f)
                close()
            }
        }.build().also { _hourglass = it }
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
                imageVector = Hourglass,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _hourglass: ImageVector? = null
