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
                moveTo(x = 3.75f, y = 3.75f)
                verticalLineTo(y = 3.0f)
                curveTo(x1 = 3.33579f, y1 = 3.0f, x2 = 3.0f, y2 = 3.33579f, x3 = 3.0f, y3 = 3.75f)
                horizontalLineTo(x = 3.75f)
                close()
                moveTo(x = 20.25f, y = 3.75f)
                horizontalLineTo(x = 21.0f)
                curveTo(x1 = 21.0f, y1 = 3.33579f, x2 = 20.6642f, y2 = 3.0f, x3 = 20.25f, y3 = 3.0f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 20.25f, y = 20.25f)
                verticalLineTo(y = 21.0f)
                curveTo(x1 = 20.6642f, y1 = 21.0f, x2 = 21.0f, y2 = 20.6642f, x3 = 21.0f, y3 = 20.25f)
                horizontalLineTo(x = 20.25f)
                close()
                moveTo(x = 3.75f, y = 20.25f)
                horizontalLineTo(x = 3.0f)
                curveTo(x1 = 3.0f, y1 = 20.6642f, x2 = 3.33579f, y2 = 21.0f, x3 = 3.75f, y3 = 21.0f)
                verticalLineTo(y = 20.25f)
                close()
                moveTo(x = 8.0f, y = 12.0f)
                lineTo(x = 8.53033f, y = 11.4697f)
                curveTo(x1 = 8.23744f, y1 = 11.1768f, x2 = 7.76256f, y2 = 11.1768f, x3 = 7.46967f, y3 = 11.4697f)
                lineTo(x = 8.0f, y = 12.0f)
                close()
                moveTo(x = 3.75f, y = 3.75f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 20.25f)
                verticalLineTo(y = 3.75f)
                verticalLineTo(y = 3.0f)
                horizontalLineTo(x = 3.75f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 20.25f, y = 3.75f)
                horizontalLineTo(x = 19.5f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 20.25f)
                horizontalLineTo(x = 21.0f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 20.25f)
                close()
                moveTo(x = 3.75f, y = 16.25f)
                lineTo(x = 4.28033f, y = 16.7803f)
                lineTo(x = 8.53033f, y = 12.5303f)
                lineTo(x = 8.0f, y = 12.0f)
                lineTo(x = 7.46967f, y = 11.4697f)
                lineTo(x = 3.21967f, y = 15.7197f)
                lineTo(x = 3.75f, y = 16.25f)
                close()
                moveTo(x = 3.75f, y = 20.25f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 16.25f)
                horizontalLineTo(x = 3.75f)
                horizontalLineTo(x = 3.0f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 3.75f)
                close()
                moveTo(x = 3.75f, y = 16.25f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 3.75f)
                horizontalLineTo(x = 3.0f)
                verticalLineTo(y = 16.25f)
                horizontalLineTo(x = 3.75f)
                close()
                moveTo(x = 8.0f, y = 12.0f)
                lineTo(x = 7.46967f, y = 12.5303f)
                lineTo(x = 15.7197f, y = 20.7803f)
                lineTo(x = 16.25f, y = 20.25f)
                lineTo(x = 16.7803f, y = 19.7197f)
                lineTo(x = 8.53033f, y = 11.4697f)
                lineTo(x = 8.0f, y = 12.0f)
                close()
                moveTo(x = 20.25f, y = 20.25f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 16.25f)
                verticalLineTo(y = 20.25f)
                verticalLineTo(y = 21.0f)
                horizontalLineTo(x = 20.25f)
                verticalLineTo(y = 20.25f)
                close()
                moveTo(x = 16.25f, y = 20.25f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 3.75f)
                verticalLineTo(y = 20.25f)
                verticalLineTo(y = 21.0f)
                horizontalLineTo(x = 16.25f)
                verticalLineTo(y = 20.25f)
                close()
                moveTo(x = 16.5f, y = 9.5f)
                horizontalLineTo(x = 15.75f)
                curveTo(x1 = 15.75f, y1 = 10.1904f, x2 = 15.1904f, y2 = 10.75f, x3 = 14.5f, y3 = 10.75f)
                verticalLineTo(y = 11.5f)
                verticalLineTo(y = 12.25f)
                curveTo(x1 = 16.0188f, y1 = 12.25f, x2 = 17.25f, y2 = 11.0188f, x3 = 17.25f, y3 = 9.5f)
                horizontalLineTo(x = 16.5f)
                close()
                moveTo(x = 14.5f, y = 11.5f)
                verticalLineTo(y = 10.75f)
                curveTo(x1 = 13.8096f, y1 = 10.75f, x2 = 13.25f, y2 = 10.1904f, x3 = 13.25f, y3 = 9.5f)
                horizontalLineTo(x = 12.5f)
                horizontalLineTo(x = 11.75f)
                curveTo(x1 = 11.75f, y1 = 11.0188f, x2 = 12.9812f, y2 = 12.25f, x3 = 14.5f, y3 = 12.25f)
                verticalLineTo(y = 11.5f)
                close()
                moveTo(x = 12.5f, y = 9.5f)
                horizontalLineTo(x = 13.25f)
                curveTo(x1 = 13.25f, y1 = 8.80964f, x2 = 13.8096f, y2 = 8.25f, x3 = 14.5f, y3 = 8.25f)
                verticalLineTo(y = 7.5f)
                verticalLineTo(y = 6.75f)
                curveTo(x1 = 12.9812f, y1 = 6.75f, x2 = 11.75f, y2 = 7.98122f, x3 = 11.75f, y3 = 9.5f)
                horizontalLineTo(x = 12.5f)
                close()
                moveTo(x = 14.5f, y = 7.5f)
                verticalLineTo(y = 8.25f)
                curveTo(x1 = 15.1904f, y1 = 8.25f, x2 = 15.75f, y2 = 8.80964f, x3 = 15.75f, y3 = 9.5f)
                horizontalLineTo(x = 16.5f)
                horizontalLineTo(x = 17.25f)
                curveTo(x1 = 17.25f, y1 = 7.98122f, x2 = 16.0188f, y2 = 6.75f, x3 = 14.5f, y3 = 6.75f)
                verticalLineTo(y = 7.5f)
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
