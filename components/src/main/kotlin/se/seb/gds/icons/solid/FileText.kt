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

internal val FileText: ImageVector
    get() {
        val current = _fileText
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.FileText",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                horizontalLineTo(x = 4.75f)
                curveTo(x1 = 4.33579f, y1 = 2.0f, x2 = 4.0f, y2 = 2.33579f, x3 = 4.0f, y3 = 2.75f)
                verticalLineTo(y = 21.25f)
                curveTo(x1 = 4.0f, y1 = 21.6642f, x2 = 4.33579f, y2 = 22.0f, x3 = 4.75f, y3 = 22.0f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.6642f, y1 = 22.0f, x2 = 20.0f, y2 = 21.6642f, x3 = 20.0f, y3 = 21.25f)
                verticalLineTo(y = 10.0f)
                horizontalLineTo(x = 12.75f)
                curveTo(x1 = 12.3358f, y1 = 10.0f, x2 = 12.0f, y2 = 9.66421f, x3 = 12.0f, y3 = 9.25f)
                verticalLineTo(y = 2.0f)
                close()
                moveTo(x = 8.0f, y = 14.25f)
                curveTo(x1 = 8.0f, y1 = 13.8358f, x2 = 8.33579f, y2 = 13.5f, x3 = 8.75f, y3 = 13.5f)
                horizontalLineTo(x = 12.25f)
                curveTo(x1 = 12.6642f, y1 = 13.5f, x2 = 13.0f, y2 = 13.8358f, x3 = 13.0f, y3 = 14.25f)
                curveTo(x1 = 13.0f, y1 = 14.6642f, x2 = 12.6642f, y2 = 15.0f, x3 = 12.25f, y3 = 15.0f)
                horizontalLineTo(x = 8.75f)
                curveTo(x1 = 8.33579f, y1 = 15.0f, x2 = 8.0f, y2 = 14.6642f, x3 = 8.0f, y3 = 14.25f)
                close()
                moveTo(x = 8.75f, y = 17.5f)
                curveTo(x1 = 8.33579f, y1 = 17.5f, x2 = 8.0f, y2 = 17.8358f, x3 = 8.0f, y3 = 18.25f)
                curveTo(x1 = 8.0f, y1 = 18.6642f, x2 = 8.33579f, y2 = 19.0f, x3 = 8.75f, y3 = 19.0f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 15.6642f, y1 = 19.0f, x2 = 16.0f, y2 = 18.6642f, x3 = 16.0f, y3 = 18.25f)
                curveTo(x1 = 16.0f, y1 = 17.8358f, x2 = 15.6642f, y2 = 17.5f, x3 = 15.25f, y3 = 17.5f)
                horizontalLineTo(x = 8.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.5607f, y = 8.5f)
                lineTo(x = 13.5f, y = 2.43934f)
                verticalLineTo(y = 8.5f)
                horizontalLineTo(x = 19.5607f)
                close()
            }
        }.build().also { _fileText = it }
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
                imageVector = FileText,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _fileText: ImageVector? = null
