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

internal val Cursor: ImageVector
    get() {
        val current = _cursor
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Cursor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.50475f, y = 2.54461f)
                curveTo(x1 = 3.23125f, y1 = 2.44584f, x2 = 2.92531f, y2 = 2.51407f, x3 = 2.71969f, y3 = 2.71969f)
                curveTo(x1 = 2.51407f, y1 = 2.92531f, x2 = 2.44584f, y2 = 3.23125f, x3 = 2.54461f, y3 = 3.50475f)
                lineTo(x = 9.22516f, y = 22.0048f)
                curveTo(x1 = 9.32942f, y1 = 22.2935f, x2 = 9.59909f, y2 = 22.4895f, x3 = 9.90588f, y3 = 22.4996f)
                curveTo(x1 = 10.2127f, y1 = 22.5097f, x2 = 10.4947f, y2 = 22.3319f, x3 = 10.6177f, y3 = 22.0506f)
                lineTo(x = 14.0973f, y = 14.0973f)
                lineTo(x = 22.0506f, y = 10.6177f)
                curveTo(x1 = 22.3319f, y1 = 10.4947f, x2 = 22.5097f, y2 = 10.2127f, x3 = 22.4996f, y3 = 9.90588f)
                curveTo(x1 = 22.4895f, y1 = 9.59909f, x2 = 22.2935f, y2 = 9.32942f, x3 = 22.0048f, y3 = 9.22516f)
                lineTo(x = 3.50475f, y = 2.54461f)
                close()
            }
        }.build().also { _cursor = it }
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
                imageVector = Cursor,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cursor: ImageVector? = null
