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

val Barcode: ImageVector
    get() {
        val current = _barcode
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Barcode",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 2.0f, y = 4.75f)
                curveTo(x1 = 2.0f, y1 = 4.33579f, x2 = 2.33579f, y2 = 4.0f, x3 = 2.75f, y3 = 4.0f)
                horizontalLineTo(x = 7.25f)
                curveTo(x1 = 7.66421f, y1 = 4.0f, x2 = 8.0f, y2 = 4.33579f, x3 = 8.0f, y3 = 4.75f)
                curveTo(x1 = 8.0f, y1 = 5.16421f, x2 = 7.66421f, y2 = 5.5f, x3 = 7.25f, y3 = 5.5f)
                horizontalLineTo(x = 3.5f)
                verticalLineTo(y = 9.25f)
                curveTo(x1 = 3.5f, y1 = 9.66421f, x2 = 3.16421f, y2 = 10.0f, x3 = 2.75f, y3 = 10.0f)
                curveTo(x1 = 2.33579f, y1 = 10.0f, x2 = 2.0f, y2 = 9.66421f, x3 = 2.0f, y3 = 9.25f)
                verticalLineTo(y = 4.75f)
                close()
                moveTo(x = 16.0f, y = 4.75f)
                curveTo(x1 = 16.0f, y1 = 4.33579f, x2 = 16.3358f, y2 = 4.0f, x3 = 16.75f, y3 = 4.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 4.0f, x2 = 22.0f, y2 = 4.33579f, x3 = 22.0f, y3 = 4.75f)
                verticalLineTo(y = 9.25f)
                curveTo(x1 = 22.0f, y1 = 9.66421f, x2 = 21.6642f, y2 = 10.0f, x3 = 21.25f, y3 = 10.0f)
                curveTo(x1 = 20.8358f, y1 = 10.0f, x2 = 20.5f, y2 = 9.66421f, x3 = 20.5f, y3 = 9.25f)
                verticalLineTo(y = 5.5f)
                horizontalLineTo(x = 16.75f)
                curveTo(x1 = 16.3358f, y1 = 5.5f, x2 = 16.0f, y2 = 5.16421f, x3 = 16.0f, y3 = 4.75f)
                close()
                moveTo(x = 7.75f, y = 9.0f)
                curveTo(x1 = 8.16421f, y1 = 9.0f, x2 = 8.5f, y2 = 9.33579f, x3 = 8.5f, y3 = 9.75f)
                verticalLineTo(y = 14.25f)
                curveTo(x1 = 8.5f, y1 = 14.6642f, x2 = 8.16421f, y2 = 15.0f, x3 = 7.75f, y3 = 15.0f)
                curveTo(x1 = 7.33579f, y1 = 15.0f, x2 = 7.0f, y2 = 14.6642f, x3 = 7.0f, y3 = 14.25f)
                verticalLineTo(y = 9.75f)
                curveTo(x1 = 7.0f, y1 = 9.33579f, x2 = 7.33579f, y2 = 9.0f, x3 = 7.75f, y3 = 9.0f)
                close()
                moveTo(x = 12.0f, y = 9.0f)
                curveTo(x1 = 12.4142f, y1 = 9.0f, x2 = 12.75f, y2 = 9.33579f, x3 = 12.75f, y3 = 9.75f)
                verticalLineTo(y = 12.25f)
                curveTo(x1 = 12.75f, y1 = 12.6642f, x2 = 12.4142f, y2 = 13.0f, x3 = 12.0f, y3 = 13.0f)
                curveTo(x1 = 11.5858f, y1 = 13.0f, x2 = 11.25f, y2 = 12.6642f, x3 = 11.25f, y3 = 12.25f)
                verticalLineTo(y = 9.75f)
                curveTo(x1 = 11.25f, y1 = 9.33579f, x2 = 11.5858f, y2 = 9.0f, x3 = 12.0f, y3 = 9.0f)
                close()
                moveTo(x = 16.25f, y = 9.0f)
                curveTo(x1 = 16.6642f, y1 = 9.0f, x2 = 17.0f, y2 = 9.33579f, x3 = 17.0f, y3 = 9.75f)
                verticalLineTo(y = 14.25f)
                curveTo(x1 = 17.0f, y1 = 14.6642f, x2 = 16.6642f, y2 = 15.0f, x3 = 16.25f, y3 = 15.0f)
                curveTo(x1 = 15.8358f, y1 = 15.0f, x2 = 15.5f, y2 = 14.6642f, x3 = 15.5f, y3 = 14.25f)
                verticalLineTo(y = 9.75f)
                curveTo(x1 = 15.5f, y1 = 9.33579f, x2 = 15.8358f, y2 = 9.0f, x3 = 16.25f, y3 = 9.0f)
                close()
                moveTo(x = 2.75f, y = 14.0f)
                curveTo(x1 = 3.16421f, y1 = 14.0f, x2 = 3.5f, y2 = 14.3358f, x3 = 3.5f, y3 = 14.75f)
                verticalLineTo(y = 18.5f)
                horizontalLineTo(x = 7.25f)
                curveTo(x1 = 7.66421f, y1 = 18.5f, x2 = 8.0f, y2 = 18.8358f, x3 = 8.0f, y3 = 19.25f)
                curveTo(x1 = 8.0f, y1 = 19.6642f, x2 = 7.66421f, y2 = 20.0f, x3 = 7.25f, y3 = 20.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 20.0f, x2 = 2.0f, y2 = 19.6642f, x3 = 2.0f, y3 = 19.25f)
                verticalLineTo(y = 14.75f)
                curveTo(x1 = 2.0f, y1 = 14.3358f, x2 = 2.33579f, y2 = 14.0f, x3 = 2.75f, y3 = 14.0f)
                close()
                moveTo(x = 21.25f, y = 14.0f)
                curveTo(x1 = 21.6642f, y1 = 14.0f, x2 = 22.0f, y2 = 14.3358f, x3 = 22.0f, y3 = 14.75f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 22.0f, y1 = 19.6642f, x2 = 21.6642f, y2 = 20.0f, x3 = 21.25f, y3 = 20.0f)
                horizontalLineTo(x = 16.75f)
                curveTo(x1 = 16.3358f, y1 = 20.0f, x2 = 16.0f, y2 = 19.6642f, x3 = 16.0f, y3 = 19.25f)
                curveTo(x1 = 16.0f, y1 = 18.8358f, x2 = 16.3358f, y2 = 18.5f, x3 = 16.75f, y3 = 18.5f)
                horizontalLineTo(x = 20.5f)
                verticalLineTo(y = 14.75f)
                curveTo(x1 = 20.5f, y1 = 14.3358f, x2 = 20.8358f, y2 = 14.0f, x3 = 21.25f, y3 = 14.0f)
                close()
            }
        }.build().also { _barcode = it }
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
                imageVector = Barcode,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _barcode: ImageVector? = null
