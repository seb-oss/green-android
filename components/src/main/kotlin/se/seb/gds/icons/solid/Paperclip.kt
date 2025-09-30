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

val Paperclip: ImageVector
    get() {
        val current = _paperclip
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Paperclip",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 14.0f, y = 2.0f)
                    curveTo(x1 = 11.2386f, y1 = 2.0f, x2 = 9.0f, y2 = 4.23858f, x3 = 9.0f, y3 = 7.0f)
                    verticalLineTo(y = 14.875f)
                    curveTo(x1 = 9.0f, y1 = 16.4628f, x2 = 10.2872f, y2 = 17.75f, x3 = 11.875f, y3 = 17.75f)
                    curveTo(x1 = 13.4628f, y1 = 17.75f, x2 = 14.75f, y2 = 16.4628f, x3 = 14.75f, y3 = 14.875f)
                    verticalLineTo(y = 7.75f)
                    curveTo(x1 = 14.75f, y1 = 7.33579f, x2 = 14.4142f, y2 = 7.0f, x3 = 14.0f, y3 = 7.0f)
                    curveTo(x1 = 13.5858f, y1 = 7.0f, x2 = 13.25f, y2 = 7.33579f, x3 = 13.25f, y3 = 7.75f)
                    verticalLineTo(y = 14.875f)
                    curveTo(x1 = 13.25f, y1 = 15.6344f, x2 = 12.6344f, y2 = 16.25f, x3 = 11.875f, y3 = 16.25f)
                    curveTo(x1 = 11.1156f, y1 = 16.25f, x2 = 10.5f, y2 = 15.6344f, x3 = 10.5f, y3 = 14.875f)
                    verticalLineTo(y = 7.0f)
                    curveTo(x1 = 10.5f, y1 = 5.067f, x2 = 12.067f, y2 = 3.5f, x3 = 14.0f, y3 = 3.5f)
                    curveTo(x1 = 15.933f, y1 = 3.5f, x2 = 17.5f, y2 = 5.067f, x3 = 17.5f, y3 = 7.0f)
                    verticalLineTo(y = 15.25f)
                    curveTo(x1 = 17.5f, y1 = 18.1495f, x2 = 15.1495f, y2 = 20.5f, x3 = 12.25f, y3 = 20.5f)
                    horizontalLineTo(x = 11.75f)
                    curveTo(x1 = 8.85051f, y1 = 20.5f, x2 = 6.5f, y2 = 18.1495f, x3 = 6.5f, y3 = 15.25f)
                    verticalLineTo(y = 10.75f)
                    curveTo(x1 = 6.5f, y1 = 10.3358f, x2 = 6.16421f, y2 = 10.0f, x3 = 5.75f, y3 = 10.0f)
                    curveTo(x1 = 5.33579f, y1 = 10.0f, x2 = 5.0f, y2 = 10.3358f, x3 = 5.0f, y3 = 10.75f)
                    verticalLineTo(y = 15.25f)
                    curveTo(x1 = 5.0f, y1 = 18.9779f, x2 = 8.02208f, y2 = 22.0f, x3 = 11.75f, y3 = 22.0f)
                    horizontalLineTo(x = 12.25f)
                    curveTo(x1 = 15.9779f, y1 = 22.0f, x2 = 19.0f, y2 = 18.9779f, x3 = 19.0f, y3 = 15.25f)
                    verticalLineTo(y = 7.0f)
                    curveTo(x1 = 19.0f, y1 = 4.23858f, x2 = 16.7614f, y2 = 2.0f, x3 = 14.0f, y3 = 2.0f)
                    close()
                }
            }.build()
            .also { _paperclip = it }
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
                imageVector = Paperclip,
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
private var _paperclip: ImageVector? = null
