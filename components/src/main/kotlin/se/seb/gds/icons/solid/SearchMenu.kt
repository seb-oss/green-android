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

val SearchMenu: ImageVector
    get() {
        val current = _searchMenu
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SearchMenu",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 8.0f, y = 12.0f)
                    curveTo(x1 = 8.0f, y1 = 8.13401f, x2 = 11.134f, y2 = 5.0f, x3 = 15.0f, y3 = 5.0f)
                    curveTo(x1 = 18.866f, y1 = 5.0f, x2 = 22.0f, y2 = 8.13401f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 13.6628f, x2 = 21.4202f, y2 = 15.1902f, x3 = 20.4518f, y3 = 16.3911f)
                    lineTo(x = 22.7803f, y = 18.7197f)
                    curveTo(x1 = 23.0732f, y1 = 19.0126f, x2 = 23.0732f, y2 = 19.4874f, x3 = 22.7803f, y3 = 19.7803f)
                    curveTo(x1 = 22.4874f, y1 = 20.0732f, x2 = 22.0126f, y2 = 20.0732f, x3 = 21.7197f, y3 = 19.7803f)
                    lineTo(x = 19.3911f, y = 17.4518f)
                    curveTo(x1 = 18.1902f, y1 = 18.4202f, x2 = 16.6628f, y2 = 19.0f, x3 = 15.0f, y3 = 19.0f)
                    curveTo(x1 = 11.134f, y1 = 19.0f, x2 = 8.0f, y2 = 15.866f, x3 = 8.0f, y3 = 12.0f)
                    close()
                    moveTo(x = 11.25f, y = 12.0f)
                    curveTo(x1 = 11.25f, y1 = 9.92893f, x2 = 12.9289f, y2 = 8.25f, x3 = 15.0f, y3 = 8.25f)
                    curveTo(x1 = 15.4142f, y1 = 8.25f, x2 = 15.75f, y2 = 7.91421f, x3 = 15.75f, y3 = 7.5f)
                    curveTo(x1 = 15.75f, y1 = 7.08579f, x2 = 15.4142f, y2 = 6.75f, x3 = 15.0f, y3 = 6.75f)
                    curveTo(x1 = 12.1005f, y1 = 6.75f, x2 = 9.75f, y2 = 9.1005f, x3 = 9.75f, y3 = 12.0f)
                    curveTo(x1 = 9.75f, y1 = 12.4142f, x2 = 10.0858f, y2 = 12.75f, x3 = 10.5f, y3 = 12.75f)
                    curveTo(x1 = 10.9142f, y1 = 12.75f, x2 = 11.25f, y2 = 12.4142f, x3 = 11.25f, y3 = 12.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 2.0f, y = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 11.5858f, x2 = 2.33579f, y2 = 11.25f, x3 = 2.75f, y3 = 11.25f)
                    horizontalLineTo(x = 5.25f)
                    curveTo(x1 = 5.66421f, y1 = 11.25f, x2 = 6.0f, y2 = 11.5858f, x3 = 6.0f, y3 = 12.0f)
                    curveTo(x1 = 6.0f, y1 = 12.4142f, x2 = 5.66421f, y2 = 12.75f, x3 = 5.25f, y3 = 12.75f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 12.75f, x2 = 2.0f, y2 = 12.4142f, x3 = 2.0f, y3 = 12.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 2.75f, y = 6.0f)
                    curveTo(x1 = 2.33579f, y1 = 6.0f, x2 = 2.0f, y2 = 6.33579f, x3 = 2.0f, y3 = 6.75f)
                    curveTo(x1 = 2.0f, y1 = 7.16421f, x2 = 2.33579f, y2 = 7.5f, x3 = 2.75f, y3 = 7.5f)
                    horizontalLineTo(x = 6.25f)
                    curveTo(x1 = 6.66421f, y1 = 7.5f, x2 = 7.0f, y2 = 7.16421f, x3 = 7.0f, y3 = 6.75f)
                    curveTo(x1 = 7.0f, y1 = 6.33579f, x2 = 6.66421f, y2 = 6.0f, x3 = 6.25f, y3 = 6.0f)
                    horizontalLineTo(x = 2.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 2.0f, y = 17.25f)
                    curveTo(x1 = 2.0f, y1 = 16.8358f, x2 = 2.33579f, y2 = 16.5f, x3 = 2.75f, y3 = 16.5f)
                    horizontalLineTo(x = 6.25f)
                    curveTo(x1 = 6.66421f, y1 = 16.5f, x2 = 7.0f, y2 = 16.8358f, x3 = 7.0f, y3 = 17.25f)
                    curveTo(x1 = 7.0f, y1 = 17.6642f, x2 = 6.66421f, y2 = 18.0f, x3 = 6.25f, y3 = 18.0f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 18.0f, x2 = 2.0f, y2 = 17.6642f, x3 = 2.0f, y3 = 17.25f)
                    close()
                }
            }.build()
            .also { _searchMenu = it }
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
                imageVector = SearchMenu,
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
private var _searchMenu: ImageVector? = null
