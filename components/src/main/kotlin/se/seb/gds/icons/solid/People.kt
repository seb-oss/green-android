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

val People: ImageVector
    get() {
        val current = _people
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.People",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 6.5f, y = 7.5f)
                curveTo(x1 = 6.5f, y1 = 4.46243f, x2 = 8.96243f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 15.0376f, y1 = 2.0f, x2 = 17.5f, y2 = 4.46243f, x3 = 17.5f, y3 = 7.5f)
                curveTo(x1 = 17.5f, y1 = 10.5376f, x2 = 15.0376f, y2 = 13.0f, x3 = 12.0f, y3 = 13.0f)
                curveTo(x1 = 8.96243f, y1 = 13.0f, x2 = 6.5f, y2 = 10.5376f, x3 = 6.5f, y3 = 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.74416f, y = 21.0f)
                curveTo(x1 = 3.32995f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                verticalLineTo(y = 18.75f)
                curveTo(x1 = 3.0f, y1 = 16.1266f, x2 = 5.12665f, y2 = 14.0f, x3 = 7.75f, y3 = 14.0f)
                horizontalLineTo(x = 16.25f)
                curveTo(x1 = 18.8734f, y1 = 14.0f, x2 = 21.0f, y2 = 16.1266f, x3 = 21.0f, y3 = 18.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.67f, y2 = 21.0f, x3 = 20.2558f, y3 = 21.0f)
                curveTo(x1 = 17.0815f, y1 = 21.0f, x2 = 6.91849f, y2 = 21.0f, x3 = 3.74416f, y3 = 21.0f)
                close()
            }
        }.build().also { _people = it }
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
                imageVector = People,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _people: ImageVector? = null
