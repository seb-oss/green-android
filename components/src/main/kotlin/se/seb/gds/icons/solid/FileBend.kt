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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val FileBend: ImageVector
    get() {
        val current = _fileBend
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.FileBend",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
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
        }.build().also { _fileBend = it }
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
                imageVector = FileBend,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _fileBend: ImageVector? = null
