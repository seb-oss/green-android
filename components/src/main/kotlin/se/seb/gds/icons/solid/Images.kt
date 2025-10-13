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

internal val Images: ImageVector
    get() {
        val current = _images
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Images",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 14.5f, y = 7.0f)
                curveTo(x1 = 13.1193f, y1 = 7.0f, x2 = 12.0f, y2 = 8.11929f, x3 = 12.0f, y3 = 9.5f)
                curveTo(x1 = 12.0f, y1 = 10.8807f, x2 = 13.1193f, y2 = 12.0f, x3 = 14.5f, y3 = 12.0f)
                curveTo(x1 = 15.8807f, y1 = 12.0f, x2 = 17.0f, y2 = 10.8807f, x3 = 17.0f, y3 = 9.5f)
                curveTo(x1 = 17.0f, y1 = 8.11929f, x2 = 15.8807f, y2 = 7.0f, x3 = 14.5f, y3 = 7.0f)
                close()
            }
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
                moveTo(x = 4.5f, y = 14.4393f)
                lineTo(x = 7.46967f, y = 11.4697f)
                curveTo(x1 = 7.76256f, y1 = 11.1768f, x2 = 8.23744f, y2 = 11.1768f, x3 = 8.53033f, y3 = 11.4697f)
                lineTo(x = 16.5607f, y = 19.5f)
                horizontalLineTo(x = 19.5f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 14.4393f)
                close()
            }
        }.build().also { _images = it }
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
                imageVector = Images,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _images: ImageVector? = null
