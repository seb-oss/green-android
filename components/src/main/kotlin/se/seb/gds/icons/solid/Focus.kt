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

val Focus: ImageVector
    get() {
        val current = _focus
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Focus",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 3.0f, y = 3.75f)
                    curveTo(
                        x1 = 3.0f,
                        y1 = 3.33579f,
                        x2 = 3.33579f,
                        y2 = 3.0f,
                        x3 = 3.75f,
                        y3 = 3.0f,
                    )
                    horizontalLineTo(x = 8.0f)
                    curveTo(
                        x1 = 8.41421f,
                        y1 = 3.0f,
                        x2 = 8.75f,
                        y2 = 3.33579f,
                        x3 = 8.75f,
                        y3 = 3.75f,
                    )
                    curveTo(
                        x1 = 8.75f,
                        y1 = 4.16421f,
                        x2 = 8.41421f,
                        y2 = 4.5f,
                        x3 = 8.0f,
                        y3 = 4.5f,
                    )
                    horizontalLineTo(x = 4.5f)
                    verticalLineTo(y = 8.0f)
                    curveTo(
                        x1 = 4.5f,
                        y1 = 8.41421f,
                        x2 = 4.16421f,
                        y2 = 8.75f,
                        x3 = 3.75f,
                        y3 = 8.75f,
                    )
                    curveTo(
                        x1 = 3.33579f,
                        y1 = 8.75f,
                        x2 = 3.0f,
                        y2 = 8.41421f,
                        x3 = 3.0f,
                        y3 = 8.0f,
                    )
                    verticalLineTo(y = 3.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 15.25f, y = 3.75f)
                    curveTo(
                        x1 = 15.25f,
                        y1 = 3.33579f,
                        x2 = 15.5858f,
                        y2 = 3.0f,
                        x3 = 16.0f,
                        y3 = 3.0f,
                    )
                    horizontalLineTo(x = 20.25f)
                    curveTo(
                        x1 = 20.6642f,
                        y1 = 3.0f,
                        x2 = 21.0f,
                        y2 = 3.33579f,
                        x3 = 21.0f,
                        y3 = 3.75f,
                    )
                    verticalLineTo(y = 8.0f)
                    curveTo(
                        x1 = 21.0f,
                        y1 = 8.41421f,
                        x2 = 20.6642f,
                        y2 = 8.75f,
                        x3 = 20.25f,
                        y3 = 8.75f,
                    )
                    curveTo(
                        x1 = 19.8358f,
                        y1 = 8.75f,
                        x2 = 19.5f,
                        y2 = 8.41421f,
                        x3 = 19.5f,
                        y3 = 8.0f,
                    )
                    verticalLineTo(y = 4.5f)
                    horizontalLineTo(x = 16.0f)
                    curveTo(
                        x1 = 15.5858f,
                        y1 = 4.5f,
                        x2 = 15.25f,
                        y2 = 4.16421f,
                        x3 = 15.25f,
                        y3 = 3.75f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 3.75f, y = 15.25f)
                    curveTo(
                        x1 = 4.16421f,
                        y1 = 15.25f,
                        x2 = 4.5f,
                        y2 = 15.5858f,
                        x3 = 4.5f,
                        y3 = 16.0f,
                    )
                    verticalLineTo(y = 19.5f)
                    horizontalLineTo(x = 8.0f)
                    curveTo(
                        x1 = 8.41421f,
                        y1 = 19.5f,
                        x2 = 8.75f,
                        y2 = 19.8358f,
                        x3 = 8.75f,
                        y3 = 20.25f,
                    )
                    curveTo(
                        x1 = 8.75f,
                        y1 = 20.6642f,
                        x2 = 8.41421f,
                        y2 = 21.0f,
                        x3 = 8.0f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 3.75f)
                    curveTo(
                        x1 = 3.33579f,
                        y1 = 21.0f,
                        x2 = 3.0f,
                        y2 = 20.6642f,
                        x3 = 3.0f,
                        y3 = 20.25f,
                    )
                    verticalLineTo(y = 16.0f)
                    curveTo(
                        x1 = 3.0f,
                        y1 = 15.5858f,
                        x2 = 3.33579f,
                        y2 = 15.25f,
                        x3 = 3.75f,
                        y3 = 15.25f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 20.25f, y = 15.25f)
                    curveTo(
                        x1 = 20.6642f,
                        y1 = 15.25f,
                        x2 = 21.0f,
                        y2 = 15.5858f,
                        x3 = 21.0f,
                        y3 = 16.0f,
                    )
                    verticalLineTo(y = 20.25f)
                    curveTo(
                        x1 = 21.0f,
                        y1 = 20.6642f,
                        x2 = 20.6642f,
                        y2 = 21.0f,
                        x3 = 20.25f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 16.0f)
                    curveTo(
                        x1 = 15.5858f,
                        y1 = 21.0f,
                        x2 = 15.25f,
                        y2 = 20.6642f,
                        x3 = 15.25f,
                        y3 = 20.25f,
                    )
                    curveTo(
                        x1 = 15.25f,
                        y1 = 19.8358f,
                        x2 = 15.5858f,
                        y2 = 19.5f,
                        x3 = 16.0f,
                        y3 = 19.5f,
                    )
                    horizontalLineTo(x = 19.5f)
                    verticalLineTo(y = 16.0f)
                    curveTo(
                        x1 = 19.5f,
                        y1 = 15.5858f,
                        x2 = 19.8358f,
                        y2 = 15.25f,
                        x3 = 20.25f,
                        y3 = 15.25f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.0f, y = 8.0f)
                    curveTo(
                        x1 = 9.79086f,
                        y1 = 8.0f,
                        x2 = 8.0f,
                        y2 = 9.79086f,
                        x3 = 8.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 8.0f,
                        y1 = 14.2091f,
                        x2 = 9.79086f,
                        y2 = 16.0f,
                        x3 = 12.0f,
                        y3 = 16.0f,
                    )
                    curveTo(
                        x1 = 14.2091f,
                        y1 = 16.0f,
                        x2 = 16.0f,
                        y2 = 14.2091f,
                        x3 = 16.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 16.0f,
                        y1 = 9.79086f,
                        x2 = 14.2091f,
                        y2 = 8.0f,
                        x3 = 12.0f,
                        y3 = 8.0f,
                    )
                    close()
                }
            }.build()
            .also { _focus = it }
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
                imageVector = Focus,
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
private var _focus: ImageVector? = null
