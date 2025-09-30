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

val Pause: ImageVector
    get() {
        val current = _pause
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Pause",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.75f, y = 3.0f)
                    curveTo(x1 = 4.33579f, y1 = 3.0f, x2 = 4.0f, y2 = 3.33579f, x3 = 4.0f, y3 = 3.75f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 4.0f, y1 = 20.6642f, x2 = 4.33579f, y2 = 21.0f, x3 = 4.75f, y3 = 21.0f)
                    horizontalLineTo(x = 9.25f)
                    curveTo(x1 = 9.66421f, y1 = 21.0f, x2 = 10.0f, y2 = 20.6642f, x3 = 10.0f, y3 = 20.25f)
                    verticalLineTo(y = 3.75f)
                    curveTo(x1 = 10.0f, y1 = 3.33579f, x2 = 9.66421f, y2 = 3.0f, x3 = 9.25f, y3 = 3.0f)
                    horizontalLineTo(x = 4.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 14.75f, y = 3.0f)
                    curveTo(x1 = 14.3358f, y1 = 3.0f, x2 = 14.0f, y2 = 3.33579f, x3 = 14.0f, y3 = 3.75f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 14.0f, y1 = 20.6642f, x2 = 14.3358f, y2 = 21.0f, x3 = 14.75f, y3 = 21.0f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(x1 = 19.6642f, y1 = 21.0f, x2 = 20.0f, y2 = 20.6642f, x3 = 20.0f, y3 = 20.25f)
                    verticalLineTo(y = 3.75f)
                    curveTo(x1 = 20.0f, y1 = 3.33579f, x2 = 19.6642f, y2 = 3.0f, x3 = 19.25f, y3 = 3.0f)
                    horizontalLineTo(x = 14.75f)
                    close()
                }
            }.build()
            .also { _pause = it }
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
                imageVector = Pause,
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
private var _pause: ImageVector? = null
