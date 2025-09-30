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

val MenuSidebar: ImageVector
    get() {
        val current = _menuSidebar
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.MenuSidebar",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 6.0f, y = 8.5f)
                    curveTo(x1 = 6.0f, y1 = 9.05228f, x2 = 6.44772f, y2 = 9.5f, x3 = 7.0f, y3 = 9.5f)
                    curveTo(x1 = 7.55229f, y1 = 9.5f, x2 = 8.0f, y2 = 9.05228f, x3 = 8.0f, y3 = 8.5f)
                    curveTo(x1 = 8.0f, y1 = 7.94772f, x2 = 7.55229f, y2 = 7.5f, x3 = 7.0f, y3 = 7.5f)
                    curveTo(x1 = 6.44772f, y1 = 7.5f, x2 = 6.0f, y2 = 7.94772f, x3 = 6.0f, y3 = 8.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 6.0f, y = 12.0f)
                    curveTo(x1 = 6.0f, y1 = 12.5523f, x2 = 6.44771f, y2 = 13.0f, x3 = 7.0f, y3 = 13.0f)
                    curveTo(x1 = 7.55228f, y1 = 13.0f, x2 = 8.0f, y2 = 12.5523f, x3 = 8.0f, y3 = 12.0f)
                    curveTo(x1 = 8.0f, y1 = 11.4477f, x2 = 7.55229f, y2 = 11.0f, x3 = 7.0f, y3 = 11.0f)
                    curveTo(x1 = 6.44772f, y1 = 11.0f, x2 = 6.0f, y2 = 11.4477f, x3 = 6.0f, y3 = 12.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 6.0f, y = 15.5f)
                    curveTo(x1 = 6.0f, y1 = 16.0523f, x2 = 6.44771f, y2 = 16.5f, x3 = 7.0f, y3 = 16.5f)
                    curveTo(x1 = 7.55228f, y1 = 16.5f, x2 = 8.0f, y2 = 16.0523f, x3 = 8.0f, y3 = 15.5f)
                    curveTo(x1 = 8.0f, y1 = 14.9477f, x2 = 7.55228f, y2 = 14.5f, x3 = 7.0f, y3 = 14.5f)
                    curveTo(x1 = 6.44771f, y1 = 14.5f, x2 = 6.0f, y2 = 14.9477f, x3 = 6.0f, y3 = 15.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 4.75f)
                    curveTo(x1 = 2.0f, y1 = 4.33579f, x2 = 2.33579f, y2 = 4.0f, x3 = 2.75f, y3 = 4.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 4.0f, x2 = 22.0f, y2 = 4.33579f, x3 = 22.0f, y3 = 4.75f)
                    verticalLineTo(y = 19.25f)
                    curveTo(x1 = 22.0f, y1 = 19.6642f, x2 = 21.6642f, y2 = 20.0f, x3 = 21.25f, y3 = 20.0f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 20.0f, x2 = 2.0f, y2 = 19.6642f, x3 = 2.0f, y3 = 19.25f)
                    verticalLineTo(y = 4.75f)
                    close()
                    moveTo(x = 3.5f, y = 5.5f)
                    verticalLineTo(y = 18.5f)
                    horizontalLineTo(x = 10.5f)
                    verticalLineTo(y = 5.5f)
                    horizontalLineTo(x = 3.5f)
                    close()
                }
            }.build()
            .also { _menuSidebar = it }
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
                imageVector = MenuSidebar,
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
private var _menuSidebar: ImageVector? = null
