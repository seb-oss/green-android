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

internal val Book: ImageVector
    get() {
        val current = _book
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Book",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 6.75f, y = 2.0f)
                curveTo(x1 = 5.23122f, y1 = 2.0f, x2 = 4.0f, y2 = 3.23122f, x3 = 4.0f, y3 = 4.75f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 4.0f, y1 = 20.7688f, x2 = 5.23122f, y2 = 22.0f, x3 = 6.75f, y3 = 22.0f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.6642f, y1 = 22.0f, x2 = 20.0f, y2 = 21.6642f, x3 = 20.0f, y3 = 21.25f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 20.0f, y1 = 2.33579f, x2 = 19.6642f, y2 = 2.0f, x3 = 19.25f, y3 = 2.0f)
                horizontalLineTo(x = 6.75f)
                close()
                moveTo(x = 5.5f, y = 19.0f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 5.5f, y1 = 19.9404f, x2 = 6.05964f, y2 = 20.5f, x3 = 6.75f, y3 = 20.5f)
                horizontalLineTo(x = 18.5f)
                verticalLineTo(y = 17.5f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 6.17157f, y1 = 17.5f, x2 = 5.5f, y2 = 18.1716f, x3 = 5.5f, y3 = 19.0f)
                close()
                moveTo(x = 8.75f, y = 6.25f)
                curveTo(x1 = 8.33579f, y1 = 6.25f, x2 = 8.0f, y2 = 6.58579f, x3 = 8.0f, y3 = 7.0f)
                curveTo(x1 = 8.0f, y1 = 7.41421f, x2 = 8.33579f, y2 = 7.75f, x3 = 8.75f, y3 = 7.75f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 15.6642f, y1 = 7.75f, x2 = 16.0f, y2 = 7.41421f, x3 = 16.0f, y3 = 7.0f)
                curveTo(x1 = 16.0f, y1 = 6.58579f, x2 = 15.6642f, y2 = 6.25f, x3 = 15.25f, y3 = 6.25f)
                horizontalLineTo(x = 8.75f)
                close()
                moveTo(x = 8.0f, y = 11.0f)
                curveTo(x1 = 8.0f, y1 = 10.5858f, x2 = 8.33579f, y2 = 10.25f, x3 = 8.75f, y3 = 10.25f)
                horizontalLineTo(x = 12.25f)
                curveTo(x1 = 12.6642f, y1 = 10.25f, x2 = 13.0f, y2 = 10.5858f, x3 = 13.0f, y3 = 11.0f)
                curveTo(x1 = 13.0f, y1 = 11.4142f, x2 = 12.6642f, y2 = 11.75f, x3 = 12.25f, y3 = 11.75f)
                horizontalLineTo(x = 8.75f)
                curveTo(x1 = 8.33579f, y1 = 11.75f, x2 = 8.0f, y2 = 11.4142f, x3 = 8.0f, y3 = 11.0f)
                close()
            }
        }.build().also { _book = it }
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
                imageVector = Book,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _book: ImageVector? = null
