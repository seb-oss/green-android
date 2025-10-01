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

val BookmarkPlus: ImageVector
    get() {
        val current = _bookmarkPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BookmarkPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.25f, y = 2.75f)
                horizontalLineTo(x = 20.0f)
                curveTo(x1 = 20.0f, y1 = 2.33579f, x2 = 19.6642f, y2 = 2.0f, x3 = 19.25f, y3 = 2.0f)
                verticalLineTo(y = 2.75f)
                close()
                moveTo(x = 19.25f, y = 21.0f)
                lineTo(x = 18.8877f, y = 21.6567f)
                curveTo(x1 = 19.12f, y1 = 21.7849f, x2 = 19.4028f, y2 = 21.7807f, x3 = 19.6313f, y3 = 21.6458f)
                curveTo(x1 = 19.8598f, y1 = 21.5109f, x2 = 20.0f, y2 = 21.2653f, x3 = 20.0f, y3 = 21.0f)
                horizontalLineTo(x = 19.25f)
                close()
                moveTo(x = 4.75f, y = 21.0f)
                horizontalLineTo(x = 4.0f)
                curveTo(x1 = 4.0f, y1 = 21.2653f, x2 = 4.14021f, y2 = 21.5109f, x3 = 4.36871f, y3 = 21.6458f)
                curveTo(x1 = 4.5972f, y1 = 21.7807f, x2 = 4.87997f, y2 = 21.7849f, x3 = 5.11231f, y3 = 21.6567f)
                lineTo(x = 4.75f, y = 21.0f)
                close()
                moveTo(x = 4.75f, y = 2.75f)
                verticalLineTo(y = 2.0f)
                curveTo(x1 = 4.33579f, y1 = 2.0f, x2 = 4.0f, y2 = 2.33579f, x3 = 4.0f, y3 = 2.75f)
                horizontalLineTo(x = 4.75f)
                close()
                moveTo(x = 12.0f, y = 17.0f)
                lineTo(x = 12.3623f, y = 16.3433f)
                curveTo(x1 = 12.1368f, y1 = 16.2189f, x2 = 11.8632f, y2 = 16.2189f, x3 = 11.6377f, y3 = 16.3433f)
                lineTo(x = 12.0f, y = 17.0f)
                close()
                moveTo(x = 12.75f, y = 6.75f)
                curveTo(x1 = 12.75f, y1 = 6.33579f, x2 = 12.4142f, y2 = 6.0f, x3 = 12.0f, y3 = 6.0f)
                curveTo(x1 = 11.5858f, y1 = 6.0f, x2 = 11.25f, y2 = 6.33579f, x3 = 11.25f, y3 = 6.75f)
                horizontalLineTo(x = 12.75f)
                close()
                moveTo(x = 11.25f, y = 13.25f)
                curveTo(x1 = 11.25f, y1 = 13.6642f, x2 = 11.5858f, y2 = 14.0f, x3 = 12.0f, y3 = 14.0f)
                curveTo(x1 = 12.4142f, y1 = 14.0f, x2 = 12.75f, y2 = 13.6642f, x3 = 12.75f, y3 = 13.25f)
                horizontalLineTo(x = 11.25f)
                close()
                moveTo(x = 15.25f, y = 10.75f)
                curveTo(x1 = 15.6642f, y1 = 10.75f, x2 = 16.0f, y2 = 10.4142f, x3 = 16.0f, y3 = 10.0f)
                curveTo(x1 = 16.0f, y1 = 9.58579f, x2 = 15.6642f, y2 = 9.25f, x3 = 15.25f, y3 = 9.25f)
                verticalLineTo(y = 10.75f)
                close()
                moveTo(x = 8.75f, y = 9.25f)
                curveTo(x1 = 8.33579f, y1 = 9.25f, x2 = 8.0f, y2 = 9.58579f, x3 = 8.0f, y3 = 10.0f)
                curveTo(x1 = 8.0f, y1 = 10.4142f, x2 = 8.33579f, y2 = 10.75f, x3 = 8.75f, y3 = 10.75f)
                verticalLineTo(y = 9.25f)
                close()
                moveTo(x = 19.25f, y = 2.75f)
                horizontalLineTo(x = 18.5f)
                verticalLineTo(y = 21.0f)
                horizontalLineTo(x = 19.25f)
                horizontalLineTo(x = 20.0f)
                verticalLineTo(y = 2.75f)
                horizontalLineTo(x = 19.25f)
                close()
                moveTo(x = 4.75f, y = 21.0f)
                horizontalLineTo(x = 5.5f)
                verticalLineTo(y = 2.75f)
                horizontalLineTo(x = 4.75f)
                horizontalLineTo(x = 4.0f)
                verticalLineTo(y = 21.0f)
                horizontalLineTo(x = 4.75f)
                close()
                moveTo(x = 4.75f, y = 2.75f)
                verticalLineTo(y = 3.5f)
                horizontalLineTo(x = 19.25f)
                verticalLineTo(y = 2.75f)
                verticalLineTo(y = 2.0f)
                horizontalLineTo(x = 4.75f)
                verticalLineTo(y = 2.75f)
                close()
                moveTo(x = 19.25f, y = 21.0f)
                lineTo(x = 19.6123f, y = 20.3433f)
                lineTo(x = 12.3623f, y = 16.3433f)
                lineTo(x = 12.0f, y = 17.0f)
                lineTo(x = 11.6377f, y = 17.6567f)
                lineTo(x = 18.8877f, y = 21.6567f)
                lineTo(x = 19.25f, y = 21.0f)
                close()
                moveTo(x = 12.0f, y = 17.0f)
                lineTo(x = 11.6377f, y = 16.3433f)
                lineTo(x = 4.38769f, y = 20.3433f)
                lineTo(x = 4.75f, y = 21.0f)
                lineTo(x = 5.11231f, y = 21.6567f)
                lineTo(x = 12.3623f, y = 17.6567f)
                lineTo(x = 12.0f, y = 17.0f)
                close()
                moveTo(x = 12.0f, y = 6.75f)
                horizontalLineTo(x = 11.25f)
                verticalLineTo(y = 13.25f)
                horizontalLineTo(x = 12.0f)
                horizontalLineTo(x = 12.75f)
                verticalLineTo(y = 6.75f)
                horizontalLineTo(x = 12.0f)
                close()
                moveTo(x = 15.25f, y = 10.0f)
                verticalLineTo(y = 9.25f)
                lineTo(x = 8.75f, y = 9.25f)
                verticalLineTo(y = 10.0f)
                verticalLineTo(y = 10.75f)
                lineTo(x = 15.25f, y = 10.75f)
                verticalLineTo(y = 10.0f)
                close()
            }
        }.build().also { _bookmarkPlus = it }
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
                imageVector = BookmarkPlus,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bookmarkPlus: ImageVector? = null
