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

val FolderPaper: ImageVector
    get() {
        val current = _folderPaper
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.FolderPaper",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.0f, y = 3.75f)
                curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                horizontalLineTo(x = 16.25f)
                curveTo(x1 = 16.6642f, y1 = 3.0f, x2 = 17.0f, y2 = 3.33579f, x3 = 17.0f, y3 = 3.75f)
                verticalLineTo(y = 5.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 5.0f, x2 = 21.0f, y2 = 5.33579f, x3 = 21.0f, y3 = 5.75f)
                verticalLineTo(y = 10.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 10.0f, x2 = 22.0f, y2 = 10.3358f, x3 = 22.0f, y3 = 10.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 22.0f, y1 = 20.6642f, x2 = 21.6642f, y2 = 21.0f, x3 = 21.25f, y3 = 21.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 21.0f, x2 = 2.0f, y2 = 20.6642f, x3 = 2.0f, y3 = 20.25f)
                verticalLineTo(y = 7.75f)
                curveTo(x1 = 2.0f, y1 = 7.33579f, x2 = 2.33579f, y2 = 7.0f, x3 = 2.75f, y3 = 7.0f)
                horizontalLineTo(x = 3.0f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 19.5f, y = 10.0f)
                verticalLineTo(y = 6.5f)
                horizontalLineTo(x = 17.0f)
                verticalLineTo(y = 10.0f)
                horizontalLineTo(x = 19.5f)
                close()
                moveTo(x = 15.5f, y = 10.0f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 7.0f)
                horizontalLineTo(x = 8.75f)
                curveTo(x1 = 8.94891f, y1 = 7.0f, x2 = 9.13968f, y2 = 7.07902f, x3 = 9.28033f, y3 = 7.21967f)
                lineTo(x = 12.0607f, y = 10.0f)
                horizontalLineTo(x = 15.5f)
                close()
            }
        }.build().also { _folderPaper = it }
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
                imageVector = FolderPaper,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _folderPaper: ImageVector? = null
