package se.seb.gds.icons.regular

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
                    moveTo(x = 3.75f, y = 9.0f)
                    lineTo(x = 3.27507f, y = 8.41953f)
                    curveTo(x1 = 3.10097f, y1 = 8.56198f, x2 = 3.0f, y2 = 8.77505f, x3 = 3.0f, y3 = 9.0f)
                    horizontalLineTo(x = 3.75f)
                    close()
                    moveTo(x = 20.25f, y = 9.0f)
                    horizontalLineTo(x = 21.0f)
                    curveTo(x1 = 21.0f, y1 = 8.77505f, x2 = 20.899f, y2 = 8.56198f, x3 = 20.7249f, y3 = 8.41953f)
                    lineTo(x = 20.25f, y = 9.0f)
                    close()
                    moveTo(x = 20.25f, y = 20.25f)
                    verticalLineTo(y = 21.0f)
                    curveTo(x1 = 20.6642f, y1 = 21.0f, x2 = 21.0f, y2 = 20.6642f, x3 = 21.0f, y3 = 20.25f)
                    horizontalLineTo(x = 20.25f)
                    close()
                    moveTo(x = 3.75f, y = 20.25f)
                    horizontalLineTo(x = 3.0f)
                    curveTo(x1 = 3.0f, y1 = 20.6642f, x2 = 3.33579f, y2 = 21.0f, x3 = 3.75f, y3 = 21.0f)
                    verticalLineTo(y = 20.25f)
                    close()
                    moveTo(x = 12.0f, y = 2.25f)
                    lineTo(x = 12.4749f, y = 1.66953f)
                    curveTo(x1 = 12.1987f, y1 = 1.44349f, x2 = 11.8013f, y2 = 1.44349f, x3 = 11.5251f, y3 = 1.66953f)
                    lineTo(x = 12.0f, y = 2.25f)
                    close()
                    moveTo(x = 9.75f, y = 14.75f)
                    verticalLineTo(y = 14.0f)
                    curveTo(x1 = 9.33579f, y1 = 14.0f, x2 = 9.0f, y2 = 14.3358f, x3 = 9.0f, y3 = 14.75f)
                    horizontalLineTo(x = 9.75f)
                    close()
                    moveTo(x = 14.25f, y = 14.75f)
                    horizontalLineTo(x = 15.0f)
                    curveTo(x1 = 15.0f, y1 = 14.3358f, x2 = 14.6642f, y2 = 14.0f, x3 = 14.25f, y3 = 14.0f)
                    verticalLineTo(y = 14.75f)
                    close()
                    moveTo(x = 14.25f, y = 20.25f)
                    horizontalLineTo(x = 13.5f)
                    curveTo(x1 = 13.5f, y1 = 20.6642f, x2 = 13.8358f, y2 = 21.0f, x3 = 14.25f, y3 = 21.0f)
                    verticalLineTo(y = 20.25f)
                    close()
                    moveTo(x = 9.75f, y = 20.25f)
                    verticalLineTo(y = 21.0f)
                    curveTo(x1 = 10.1642f, y1 = 21.0f, x2 = 10.5f, y2 = 20.6642f, x3 = 10.5f, y3 = 20.25f)
                    horizontalLineTo(x = 9.75f)
                    close()
                    moveTo(x = 20.25f, y = 9.0f)
                    horizontalLineTo(x = 19.5f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 20.25f)
                    horizontalLineTo(x = 21.0f)
                    verticalLineTo(y = 9.0f)
                    horizontalLineTo(x = 20.25f)
                    close()
                    moveTo(x = 3.75f, y = 20.25f)
                    horizontalLineTo(x = 4.5f)
                    verticalLineTo(y = 9.0f)
                    horizontalLineTo(x = 3.75f)
                    horizontalLineTo(x = 3.0f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 3.75f)
                    close()
                    moveTo(x = 3.75f, y = 9.0f)
                    lineTo(x = 4.22493f, y = 9.58047f)
                    lineTo(x = 12.4749f, y = 2.83047f)
                    lineTo(x = 12.0f, y = 2.25f)
                    lineTo(x = 11.5251f, y = 1.66953f)
                    lineTo(x = 3.27507f, y = 8.41953f)
                    lineTo(x = 3.75f, y = 9.0f)
                    close()
                    moveTo(x = 12.0f, y = 2.25f)
                    lineTo(x = 11.5251f, y = 2.83047f)
                    lineTo(x = 19.7751f, y = 9.58047f)
                    lineTo(x = 20.25f, y = 9.0f)
                    lineTo(x = 20.7249f, y = 8.41953f)
                    lineTo(x = 12.4749f, y = 1.66953f)
                    lineTo(x = 12.0f, y = 2.25f)
                    close()
                    moveTo(x = 9.75f, y = 14.75f)
                    verticalLineTo(y = 15.5f)
                    horizontalLineTo(x = 14.25f)
                    verticalLineTo(y = 14.75f)
                    verticalLineTo(y = 14.0f)
                    horizontalLineTo(x = 9.75f)
                    verticalLineTo(y = 14.75f)
                    close()
                    moveTo(x = 14.25f, y = 14.75f)
                    horizontalLineTo(x = 13.5f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 14.25f)
                    horizontalLineTo(x = 15.0f)
                    verticalLineTo(y = 14.75f)
                    horizontalLineTo(x = 14.25f)
                    close()
                    moveTo(x = 9.75f, y = 20.25f)
                    horizontalLineTo(x = 10.5f)
                    verticalLineTo(y = 14.75f)
                    horizontalLineTo(x = 9.75f)
                    horizontalLineTo(x = 9.0f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 9.75f)
                    close()
                    moveTo(x = 9.75f, y = 20.25f)
                    verticalLineTo(y = 19.5f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 20.25f)
                    verticalLineTo(y = 21.0f)
                    horizontalLineTo(x = 9.75f)
                    verticalLineTo(y = 20.25f)
                    close()
                    moveTo(x = 14.25f, y = 20.25f)
                    verticalLineTo(y = 21.0f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 20.25f)
                    verticalLineTo(y = 19.5f)
                    horizontalLineTo(x = 14.25f)
                    verticalLineTo(y = 20.25f)
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
