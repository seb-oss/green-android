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

val FolderAddRight: ImageVector
    get() {
        val current = _folderAddRight
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.FolderAddRight",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 10.0f, y = 3.0f)
                    curveTo(x1 = 10.2508f, y1 = 3.0f, x2 = 10.4849f, y2 = 3.12533f, x3 = 10.624f, y3 = 3.33397f)
                    lineTo(x = 12.1787f, y = 5.66603f)
                    curveTo(x1 = 12.3178f, y1 = 5.87467f, x2 = 12.552f, y2 = 6.0f, x3 = 12.8028f, y3 = 6.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 6.0f, x2 = 22.0f, y2 = 6.33579f, x3 = 22.0f, y3 = 6.75f)
                    verticalLineTo(y = 12.5278f)
                    curveTo(x1 = 20.9385f, y1 = 11.5777f, x2 = 19.5367f, y2 = 11.0f, x3 = 18.0f, y3 = 11.0f)
                    curveTo(x1 = 14.6863f, y1 = 11.0f, x2 = 12.0f, y2 = 13.6863f, x3 = 12.0f, y3 = 17.0f)
                    curveTo(x1 = 12.0f, y1 = 18.0929f, x2 = 12.2922f, y2 = 19.1175f, x3 = 12.8027f, y3 = 20.0f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 20.0f, x2 = 2.0f, y2 = 19.6642f, x3 = 2.0f, y3 = 19.25f)
                    verticalLineTo(y = 3.75f)
                    curveTo(x1 = 2.0f, y1 = 3.33579f, x2 = 2.33579f, y2 = 3.0f, x3 = 2.75f, y3 = 3.0f)
                    horizontalLineTo(x = 10.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 18.0f, y = 13.0f)
                    curveTo(x1 = 18.4142f, y1 = 13.0f, x2 = 18.75f, y2 = 13.3358f, x3 = 18.75f, y3 = 13.75f)
                    verticalLineTo(y = 16.25f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 16.25f, x2 = 22.0f, y2 = 16.5858f, x3 = 22.0f, y3 = 17.0f)
                    curveTo(x1 = 22.0f, y1 = 17.4142f, x2 = 21.6642f, y2 = 17.75f, x3 = 21.25f, y3 = 17.75f)
                    horizontalLineTo(x = 18.75f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 18.75f, y1 = 20.6642f, x2 = 18.4142f, y2 = 21.0f, x3 = 18.0f, y3 = 21.0f)
                    curveTo(x1 = 17.5858f, y1 = 21.0f, x2 = 17.25f, y2 = 20.6642f, x3 = 17.25f, y3 = 20.25f)
                    verticalLineTo(y = 17.75f)
                    horizontalLineTo(x = 14.75f)
                    curveTo(x1 = 14.3358f, y1 = 17.75f, x2 = 14.0f, y2 = 17.4142f, x3 = 14.0f, y3 = 17.0f)
                    curveTo(x1 = 14.0f, y1 = 16.5858f, x2 = 14.3358f, y2 = 16.25f, x3 = 14.75f, y3 = 16.25f)
                    horizontalLineTo(x = 17.25f)
                    verticalLineTo(y = 13.75f)
                    curveTo(x1 = 17.25f, y1 = 13.3358f, x2 = 17.5858f, y2 = 13.0f, x3 = 18.0f, y3 = 13.0f)
                    close()
                }
            }.build()
            .also { _folderAddRight = it }
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
                imageVector = FolderAddRight,
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
private var _folderAddRight: ImageVector? = null
