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

internal val Folder: ImageVector
    get() {
        val current = _folder
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Folder",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 2.75f, y = 3.0f)
                curveTo(x1 = 2.33579f, y1 = 3.0f, x2 = 2.0f, y2 = 3.33579f, x3 = 2.0f, y3 = 3.75f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 2.0f, y1 = 19.6642f, x2 = 2.33579f, y2 = 20.0f, x3 = 2.75f, y3 = 20.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 20.0f, x2 = 22.0f, y2 = 19.6642f, x3 = 22.0f, y3 = 19.25f)
                verticalLineTo(y = 6.75f)
                curveTo(x1 = 22.0f, y1 = 6.33579f, x2 = 21.6642f, y2 = 6.0f, x3 = 21.25f, y3 = 6.0f)
                horizontalLineTo(x = 12.4014f)
                lineTo(x = 10.624f, y = 3.33397f)
                curveTo(x1 = 10.4849f, y1 = 3.12533f, x2 = 10.2508f, y2 = 3.0f, x3 = 10.0f, y3 = 3.0f)
                horizontalLineTo(x = 2.75f)
                close()
            }
        }.build().also { _folder = it }
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
                imageVector = Folder,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _folder: ImageVector? = null
