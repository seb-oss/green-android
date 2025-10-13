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

internal val FolderUpload: ImageVector
    get() {
        val current = _folderUpload
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.FolderUpload",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 2.0f, y = 3.75f)
                curveTo(x1 = 2.0f, y1 = 3.33579f, x2 = 2.33579f, y2 = 3.0f, x3 = 2.75f, y3 = 3.0f)
                horizontalLineTo(x = 10.0f)
                curveTo(x1 = 10.2508f, y1 = 3.0f, x2 = 10.4849f, y2 = 3.12533f, x3 = 10.624f, y3 = 3.33397f)
                lineTo(x = 12.4014f, y = 6.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 6.0f, x2 = 22.0f, y2 = 6.33579f, x3 = 22.0f, y3 = 6.75f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 22.0f, y1 = 19.6642f, x2 = 21.6642f, y2 = 20.0f, x3 = 21.25f, y3 = 20.0f)
                horizontalLineTo(x = 12.75f)
                verticalLineTo(y = 14.8107f)
                lineTo(x = 13.9697f, y = 16.0303f)
                curveTo(x1 = 14.2626f, y1 = 16.3232f, x2 = 14.7374f, y2 = 16.3232f, x3 = 15.0303f, y3 = 16.0303f)
                curveTo(x1 = 15.3232f, y1 = 15.7374f, x2 = 15.3232f, y2 = 15.2626f, x3 = 15.0303f, y3 = 14.9697f)
                lineTo(x = 12.5303f, y = 12.4697f)
                curveTo(x1 = 12.2374f, y1 = 12.1768f, x2 = 11.7626f, y2 = 12.1768f, x3 = 11.4697f, y3 = 12.4697f)
                lineTo(x = 8.96967f, y = 14.9697f)
                curveTo(x1 = 8.67678f, y1 = 15.2626f, x2 = 8.67678f, y2 = 15.7374f, x3 = 8.96967f, y3 = 16.0303f)
                curveTo(x1 = 9.26256f, y1 = 16.3232f, x2 = 9.73744f, y2 = 16.3232f, x3 = 10.0303f, y3 = 16.0303f)
                lineTo(x = 11.25f, y = 14.8107f)
                verticalLineTo(y = 20.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 20.0f, x2 = 2.0f, y2 = 19.6642f, x3 = 2.0f, y3 = 19.25f)
                verticalLineTo(y = 3.75f)
                close()
            }
        }.build().also { _folderUpload = it }
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
                imageVector = FolderUpload,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _folderUpload: ImageVector? = null
