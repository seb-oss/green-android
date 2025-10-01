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

val Growth: ImageVector
    get() {
        val current = _growth
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Growth",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.75f, y = 3.0f)
                curveTo(x1 = 3.33579f, y1 = 3.0f, x2 = 3.0f, y2 = 3.33579f, x3 = 3.0f, y3 = 3.75f)
                verticalLineTo(y = 5.0f)
                curveTo(x1 = 3.0f, y1 = 9.28021f, x2 = 6.46979f, y2 = 12.75f, x3 = 10.75f, y3 = 12.75f)
                horizontalLineTo(x = 11.25f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 11.25f, y1 = 20.6642f, x2 = 11.5858f, y2 = 21.0f, x3 = 12.0f, y3 = 21.0f)
                curveTo(x1 = 12.4142f, y1 = 21.0f, x2 = 12.75f, y2 = 20.6642f, x3 = 12.75f, y3 = 20.25f)
                verticalLineTo(y = 16.0f)
                horizontalLineTo(x = 13.25f)
                curveTo(x1 = 17.5302f, y1 = 16.0f, x2 = 21.0f, y2 = 12.5302f, x3 = 21.0f, y3 = 8.25f)
                verticalLineTo(y = 6.75f)
                curveTo(x1 = 21.0f, y1 = 6.33579f, x2 = 20.6642f, y2 = 6.0f, x3 = 20.25f, y3 = 6.0f)
                horizontalLineTo(x = 19.0f)
                curveTo(x1 = 16.3562f, y1 = 6.0f, x2 = 14.0216f, y2 = 7.32382f, x3 = 12.6229f, y3 = 9.34475f)
                curveTo(x1 = 11.9618f, y1 = 5.73541f, x2 = 8.80036f, y2 = 3.0f, x3 = 5.0f, y3 = 3.0f)
                horizontalLineTo(x = 3.75f)
                close()
            }
        }.build().also { _growth = it }
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
                imageVector = Growth,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _growth: ImageVector? = null
