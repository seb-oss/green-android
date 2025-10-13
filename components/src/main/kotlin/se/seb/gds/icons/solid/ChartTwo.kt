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

internal val ChartTwo: ImageVector
    get() {
        val current = _chartTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChartTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 10.75f, y = 3.00098f)
                curveTo(x1 = 10.3358f, y1 = 3.00098f, x2 = 10.0f, y2 = 3.33676f, x3 = 10.0f, y3 = 3.75098f)
                verticalLineTo(y = 20.2539f)
                curveTo(x1 = 10.0f, y1 = 20.6681f, x2 = 10.3358f, y2 = 21.0039f, x3 = 10.75f, y3 = 21.0039f)
                horizontalLineTo(x = 14.25f)
                curveTo(x1 = 14.6642f, y1 = 21.0039f, x2 = 15.0f, y2 = 20.6681f, x3 = 15.0f, y3 = 20.2539f)
                verticalLineTo(y = 3.75098f)
                curveTo(x1 = 15.0f, y1 = 3.33676f, x2 = 14.6642f, y2 = 3.00098f, x3 = 14.25f, y3 = 3.00098f)
                horizontalLineTo(x = 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.75f, y = 13.0039f)
                curveTo(x1 = 3.33579f, y1 = 13.0039f, x2 = 3.0f, y2 = 13.3397f, x3 = 3.0f, y3 = 13.7539f)
                verticalLineTo(y = 20.2539f)
                curveTo(x1 = 3.0f, y1 = 20.6681f, x2 = 3.33579f, y2 = 21.0039f, x3 = 3.75f, y3 = 21.0039f)
                horizontalLineTo(x = 7.25f)
                curveTo(x1 = 7.66421f, y1 = 21.0039f, x2 = 8.0f, y2 = 20.6681f, x3 = 8.0f, y3 = 20.2539f)
                verticalLineTo(y = 13.7539f)
                curveTo(x1 = 8.0f, y1 = 13.3397f, x2 = 7.66421f, y2 = 13.0039f, x3 = 7.25f, y3 = 13.0039f)
                horizontalLineTo(x = 3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.0f, y = 8.75f)
                curveTo(x1 = 17.0f, y1 = 8.33579f, x2 = 17.3358f, y2 = 8.0f, x3 = 17.75f, y3 = 8.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 8.0f, x2 = 22.0f, y2 = 8.33579f, x3 = 22.0f, y3 = 8.75f)
                verticalLineTo(y = 20.2539f)
                curveTo(x1 = 22.0f, y1 = 20.6681f, x2 = 21.6642f, y2 = 21.0039f, x3 = 21.25f, y3 = 21.0039f)
                horizontalLineTo(x = 17.75f)
                curveTo(x1 = 17.3358f, y1 = 21.0039f, x2 = 17.0f, y2 = 20.6681f, x3 = 17.0f, y3 = 20.2539f)
                verticalLineTo(y = 8.75f)
                close()
            }
        }.build().also { _chartTwo = it }
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
                imageVector = ChartTwo,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chartTwo: ImageVector? = null
