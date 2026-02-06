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

internal val ArrowBoxLeftAlt: ImageVector
    get() {
        val current = _arrowBoxLeftAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowBoxLeftAlt",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 20.7803f, y = 20.7803f)
                curveTo(x1 = 20.6397f, y1 = 20.921f, x2 = 20.4489f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 12.75f)
                curveTo(x1 = 12.3358f, y1 = 21.0f, x2 = 12.0f, y2 = 20.6642f, x3 = 12.0f, y3 = 20.25f)
                curveTo(x1 = 12.0f, y1 = 19.8358f, x2 = 12.3358f, y2 = 19.5f, x3 = 12.75f, y3 = 19.5f)
                horizontalLineTo(x = 19.5f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 12.75f)
                curveTo(x1 = 12.3358f, y1 = 4.5f, x2 = 12.0f, y2 = 4.16421f, x3 = 12.0f, y3 = 3.75f)
                curveTo(x1 = 12.0f, y1 = 3.33579f, x2 = 12.3358f, y2 = 3.0f, x3 = 12.75f, y3 = 3.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.4489f, y1 = 3.0f, x2 = 20.6397f, y2 = 3.07902f, x3 = 20.7803f, y3 = 3.21967f)
                curveTo(x1 = 20.921f, y1 = 3.36032f, x2 = 21.0f, y2 = 3.55109f, x3 = 21.0f, y3 = 3.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.4489f, x2 = 20.921f, y2 = 20.6397f, x3 = 20.7803f, y3 = 20.7803f)
                close()
                moveTo(x = 8.78033f, y = 17.0303f)
                curveTo(x1 = 8.48744f, y1 = 17.3232f, x2 = 8.01256f, y2 = 17.3232f, x3 = 7.71967f, y3 = 17.0303f)
                lineTo(x = 3.21967f, y = 12.5303f)
                curveTo(x1 = 2.92678f, y1 = 12.2374f, x2 = 2.92678f, y2 = 11.7626f, x3 = 3.21967f, y3 = 11.4697f)
                lineTo(x = 7.71967f, y = 6.96967f)
                curveTo(x1 = 8.01256f, y1 = 6.67678f, x2 = 8.48744f, y2 = 6.67677f, x3 = 8.78033f, y3 = 6.96967f)
                curveTo(x1 = 9.07322f, y1 = 7.26256f, x2 = 9.07322f, y2 = 7.73744f, x3 = 8.78033f, y3 = 8.03033f)
                lineTo(x = 5.56066f, y = 11.25f)
                lineTo(x = 15.0f, y = 11.25f)
                curveTo(x1 = 15.4142f, y1 = 11.25f, x2 = 15.75f, y2 = 11.5858f, x3 = 15.75f, y3 = 12.0f)
                curveTo(x1 = 15.75f, y1 = 12.4142f, x2 = 15.4142f, y2 = 12.75f, x3 = 15.0f, y3 = 12.75f)
                lineTo(x = 5.56066f, y = 12.75f)
                lineTo(x = 8.78033f, y = 15.9697f)
                curveTo(x1 = 9.07322f, y1 = 16.2626f, x2 = 9.07322f, y2 = 16.7374f, x3 = 8.78033f, y3 = 17.0303f)
                close()
            }
        }.build().also { _arrowBoxLeftAlt = it }
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
                imageVector = ArrowBoxLeftAlt,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowBoxLeftAlt: ImageVector? = null
