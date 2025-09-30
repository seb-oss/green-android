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

val Office: ImageVector
    get() {
        val current = _office
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Office",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 6.0f, y = 4.75f)
                    curveTo(x1 = 6.0f, y1 = 4.33579f, x2 = 6.33579f, y2 = 4.0f, x3 = 6.75f, y3 = 4.0f)
                    horizontalLineTo(x = 17.25f)
                    curveTo(x1 = 17.6642f, y1 = 4.0f, x2 = 18.0f, y2 = 4.33579f, x3 = 18.0f, y3 = 4.75f)
                    verticalLineTo(y = 8.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 8.0f, x2 = 22.0f, y2 = 8.33579f, x3 = 22.0f, y3 = 8.75f)
                    verticalLineTo(y = 18.5f)
                    horizontalLineTo(x = 22.25f)
                    curveTo(x1 = 22.6642f, y1 = 18.5f, x2 = 23.0f, y2 = 18.8358f, x3 = 23.0f, y3 = 19.25f)
                    curveTo(x1 = 23.0f, y1 = 19.6642f, x2 = 22.6642f, y2 = 20.0f, x3 = 22.25f, y3 = 20.0f)
                    horizontalLineTo(x = 1.75f)
                    curveTo(x1 = 1.33579f, y1 = 20.0f, x2 = 1.0f, y2 = 19.6642f, x3 = 1.0f, y3 = 19.25f)
                    curveTo(x1 = 1.0f, y1 = 18.8358f, x2 = 1.33579f, y2 = 18.5f, x3 = 1.75f, y3 = 18.5f)
                    horizontalLineTo(x = 2.0f)
                    verticalLineTo(y = 8.75f)
                    curveTo(x1 = 2.0f, y1 = 8.33579f, x2 = 2.33579f, y2 = 8.0f, x3 = 2.75f, y3 = 8.0f)
                    horizontalLineTo(x = 6.0f)
                    verticalLineTo(y = 4.75f)
                    close()
                    moveTo(x = 6.0f, y = 9.5f)
                    horizontalLineTo(x = 3.5f)
                    verticalLineTo(y = 18.5f)
                    horizontalLineTo(x = 6.0f)
                    verticalLineTo(y = 9.5f)
                    close()
                    moveTo(x = 18.0f, y = 18.5f)
                    horizontalLineTo(x = 20.5f)
                    verticalLineTo(y = 9.5f)
                    horizontalLineTo(x = 18.0f)
                    verticalLineTo(y = 18.5f)
                    close()
                    moveTo(x = 14.0f, y = 18.5f)
                    verticalLineTo(y = 15.0f)
                    horizontalLineTo(x = 10.0f)
                    verticalLineTo(y = 18.5f)
                    horizontalLineTo(x = 14.0f)
                    close()
                }
            }.build()
            .also { _office = it }
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
                imageVector = Office,
                contentDescription = null,
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _office: ImageVector? = null
