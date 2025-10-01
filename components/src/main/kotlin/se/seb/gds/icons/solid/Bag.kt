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

val Bag: ImageVector
    get() {
        val current = _bag
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Bag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 8.0022f, y = 3.0f)
                curveTo(x1 = 7.58798f, y1 = 3.0f, x2 = 7.2522f, y2 = 3.33579f, x3 = 7.2522f, y3 = 3.75f)
                verticalLineTo(y = 7.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 7.0f, x2 = 2.0f, y2 = 7.33579f, x3 = 2.0f, y3 = 7.75f)
                verticalLineTo(y = 12.0f)
                horizontalLineTo(x = 22.0f)
                verticalLineTo(y = 7.75f)
                curveTo(x1 = 22.0f, y1 = 7.33579f, x2 = 21.6642f, y2 = 7.0f, x3 = 21.25f, y3 = 7.0f)
                horizontalLineTo(x = 16.7522f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 16.7522f, y1 = 3.33579f, x2 = 16.4164f, y2 = 3.0f, x3 = 16.0022f, y3 = 3.0f)
                horizontalLineTo(x = 8.0022f)
                close()
                moveTo(x = 15.2522f, y = 7.0f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 8.7522f)
                verticalLineTo(y = 7.0f)
                horizontalLineTo(x = 15.2522f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 2.0f, y = 20.25f)
                verticalLineTo(y = 13.5f)
                horizontalLineTo(x = 11.2507f)
                lineTo(x = 11.2522f, y = 15.2507f)
                curveTo(x1 = 11.2526f, y1 = 15.6649f, x2 = 11.5886f, y2 = 16.0004f, x3 = 12.0029f, y3 = 16.0f)
                curveTo(x1 = 12.4171f, y1 = 15.9996f, x2 = 12.7526f, y2 = 15.6636f, x3 = 12.7522f, y3 = 15.2493f)
                lineTo(x = 12.7507f, y = 13.5f)
                horizontalLineTo(x = 22.0f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 22.0f, y1 = 20.6642f, x2 = 21.6642f, y2 = 21.0f, x3 = 21.25f, y3 = 21.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 21.0f, x2 = 2.0f, y2 = 20.6642f, x3 = 2.0f, y3 = 20.25f)
                close()
            }
        }.build().also { _bag = it }
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
                imageVector = Bag,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bag: ImageVector? = null
