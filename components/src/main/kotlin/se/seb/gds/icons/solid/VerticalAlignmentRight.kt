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

internal val VerticalAlignmentRight: ImageVector
    get() {
        val current = _verticalAlignmentRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.VerticalAlignmentRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 21.0f, y = 3.75f)
                curveTo(x1 = 21.0f, y1 = 3.33579f, x2 = 20.6642f, y2 = 3.0f, x3 = 20.25f, y3 = 3.0f)
                curveTo(x1 = 19.8358f, y1 = 3.0f, x2 = 19.5f, y2 = 3.33579f, x3 = 19.5f, y3 = 3.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 19.5f, y1 = 20.6642f, x2 = 19.8358f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                curveTo(x1 = 20.6642f, y1 = 21.0f, x2 = 21.0f, y2 = 20.6642f, x3 = 21.0f, y3 = 20.25f)
                verticalLineTo(y = 3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.75f, y = 6.0f)
                curveTo(x1 = 3.33579f, y1 = 6.0f, x2 = 3.0f, y2 = 6.33579f, x3 = 3.0f, y3 = 6.75f)
                verticalLineTo(y = 10.25f)
                curveTo(x1 = 3.0f, y1 = 10.6642f, x2 = 3.33579f, y2 = 11.0f, x3 = 3.75f, y3 = 11.0f)
                horizontalLineTo(x = 17.25f)
                curveTo(x1 = 17.6642f, y1 = 11.0f, x2 = 18.0f, y2 = 10.6642f, x3 = 18.0f, y3 = 10.25f)
                verticalLineTo(y = 6.75f)
                curveTo(x1 = 18.0f, y1 = 6.33579f, x2 = 17.6642f, y2 = 6.0f, x3 = 17.25f, y3 = 6.0f)
                horizontalLineTo(x = 3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 7.75f, y = 13.0f)
                curveTo(x1 = 7.33579f, y1 = 13.0f, x2 = 7.0f, y2 = 13.3358f, x3 = 7.0f, y3 = 13.75f)
                verticalLineTo(y = 17.25f)
                curveTo(x1 = 7.0f, y1 = 17.6642f, x2 = 7.33579f, y2 = 18.0f, x3 = 7.75f, y3 = 18.0f)
                horizontalLineTo(x = 17.25f)
                curveTo(x1 = 17.6642f, y1 = 18.0f, x2 = 18.0f, y2 = 17.6642f, x3 = 18.0f, y3 = 17.25f)
                verticalLineTo(y = 13.75f)
                curveTo(x1 = 18.0f, y1 = 13.3358f, x2 = 17.6642f, y2 = 13.0f, x3 = 17.25f, y3 = 13.0f)
                horizontalLineTo(x = 7.75f)
                close()
            }
        }.build().also { _verticalAlignmentRight = it }
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
                imageVector = VerticalAlignmentRight,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _verticalAlignmentRight: ImageVector? = null
