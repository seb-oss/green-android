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

val HomeOpen: ImageVector
    get() {
        val current = _homeOpen
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.HomeOpen",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.4749f, y = 1.66953f)
                    curveTo(x1 = 12.1987f, y1 = 1.44349f, x2 = 11.8013f, y2 = 1.44349f, x3 = 11.5251f, y3 = 1.66953f)
                    lineTo(x = 3.27507f, y = 8.41953f)
                    curveTo(x1 = 3.10097f, y1 = 8.56198f, x2 = 3.0f, y2 = 8.77505f, x3 = 3.0f, y3 = 9.0f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 3.0f, y1 = 20.6642f, x2 = 3.33579f, y2 = 21.0f, x3 = 3.75f, y3 = 21.0f)
                    horizontalLineTo(x = 9.25f)
                    curveTo(x1 = 9.66421f, y1 = 21.0f, x2 = 10.0f, y2 = 20.6642f, x3 = 10.0f, y3 = 20.25f)
                    verticalLineTo(y = 15.0f)
                    horizontalLineTo(x = 14.0f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 14.0f, y1 = 20.6642f, x2 = 14.3358f, y2 = 21.0f, x3 = 14.75f, y3 = 21.0f)
                    horizontalLineTo(x = 20.25f)
                    curveTo(x1 = 20.6642f, y1 = 21.0f, x2 = 21.0f, y2 = 20.6642f, x3 = 21.0f, y3 = 20.25f)
                    verticalLineTo(y = 9.0f)
                    curveTo(x1 = 21.0f, y1 = 8.77505f, x2 = 20.899f, y2 = 8.56198f, x3 = 20.7249f, y3 = 8.41953f)
                    lineTo(x = 12.4749f, y = 1.66953f)
                    close()
                }
            }.build()
            .also { _homeOpen = it }
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
                imageVector = HomeOpen,
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
private var _homeOpen: ImageVector? = null
