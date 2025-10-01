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

val Tag: ImageVector
    get() {
        val current = _tag
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Tag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 2.0f, y = 2.75f)
                curveTo(x1 = 2.0f, y1 = 2.33579f, x2 = 2.33579f, y2 = 2.0f, x3 = 2.75f, y3 = 2.0f)
                horizontalLineTo(x = 12.0f)
                curveTo(x1 = 12.1989f, y1 = 2.0f, x2 = 12.3897f, y2 = 2.07902f, x3 = 12.5303f, y3 = 2.21967f)
                lineTo(x = 21.7803f, y = 11.4697f)
                curveTo(x1 = 22.0732f, y1 = 11.7626f, x2 = 22.0732f, y2 = 12.2374f, x3 = 21.7803f, y3 = 12.5303f)
                lineTo(x = 12.5303f, y = 21.7803f)
                curveTo(x1 = 12.2374f, y1 = 22.0732f, x2 = 11.7626f, y2 = 22.0732f, x3 = 11.4697f, y3 = 21.7803f)
                lineTo(x = 2.21967f, y = 12.5303f)
                curveTo(x1 = 2.07902f, y1 = 12.3897f, x2 = 2.0f, y2 = 12.1989f, x3 = 2.0f, y3 = 12.0f)
                verticalLineTo(y = 2.75f)
                close()
                moveTo(x = 7.5f, y = 9.0f)
                curveTo(x1 = 8.32843f, y1 = 9.0f, x2 = 9.0f, y2 = 8.32843f, x3 = 9.0f, y3 = 7.5f)
                curveTo(x1 = 9.0f, y1 = 6.67157f, x2 = 8.32843f, y2 = 6.0f, x3 = 7.5f, y3 = 6.0f)
                curveTo(x1 = 6.67157f, y1 = 6.0f, x2 = 6.0f, y2 = 6.67157f, x3 = 6.0f, y3 = 7.5f)
                curveTo(x1 = 6.0f, y1 = 8.32843f, x2 = 6.67157f, y2 = 9.0f, x3 = 7.5f, y3 = 9.0f)
                close()
            }
        }.build().also { _tag = it }
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
                imageVector = Tag,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _tag: ImageVector? = null
