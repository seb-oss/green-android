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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val PhoneDynamicIsland: ImageVector
    get() {
        val current = _phoneDynamicIsland
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.PhoneDynamicIsland",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 5.75f, y = 23.0f)
                curveTo(x1 = 5.33579f, y1 = 23.0f, x2 = 5.0f, y2 = 22.6642f, x3 = 5.0f, y3 = 22.25f)
                verticalLineTo(y = 1.75f)
                curveTo(x1 = 5.0f, y1 = 1.33579f, x2 = 5.33579f, y2 = 1.0f, x3 = 5.75f, y3 = 1.0f)
                horizontalLineTo(x = 18.25f)
                curveTo(x1 = 18.6642f, y1 = 1.0f, x2 = 19.0f, y2 = 1.33579f, x3 = 19.0f, y3 = 1.75f)
                verticalLineTo(y = 22.25f)
                curveTo(x1 = 19.0f, y1 = 22.6642f, x2 = 18.6642f, y2 = 23.0f, x3 = 18.25f, y3 = 23.0f)
                horizontalLineTo(x = 5.75f)
                close()
                moveTo(x = 10.75f, y = 3.49f)
                curveTo(x1 = 10.3358f, y1 = 3.49f, x2 = 10.0f, y2 = 3.82579f, x3 = 10.0f, y3 = 4.24f)
                curveTo(x1 = 10.0f, y1 = 4.65421f, x2 = 10.3358f, y2 = 4.99f, x3 = 10.75f, y3 = 4.99f)
                horizontalLineTo(x = 13.25f)
                curveTo(x1 = 13.6642f, y1 = 4.99f, x2 = 14.0f, y2 = 4.65421f, x3 = 14.0f, y3 = 4.24f)
                curveTo(x1 = 14.0f, y1 = 3.82579f, x2 = 13.6642f, y2 = 3.49f, x3 = 13.25f, y3 = 3.49f)
                horizontalLineTo(x = 10.75f)
                close()
            }
        }.build().also { _phoneDynamicIsland = it }
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
                imageVector = PhoneDynamicIsland,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _phoneDynamicIsland: ImageVector? = null
