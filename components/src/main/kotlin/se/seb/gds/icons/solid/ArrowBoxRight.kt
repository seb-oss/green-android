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

internal val ArrowBoxRight: ImageVector
    get() {
        val current = _arrowBoxRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowBoxRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 19.5f, y = 4.5f)
                lineTo(x = 14.75f, y = 4.5f)
                curveTo(x1 = 14.3358f, y1 = 4.5f, x2 = 14.0f, y2 = 4.16421f, x3 = 14.0f, y3 = 3.75f)
                curveTo(x1 = 14.0f, y1 = 3.33579f, x2 = 14.3358f, y2 = 3.0f, x3 = 14.75f, y3 = 3.0f)
                lineTo(x = 20.25f, y = 3.0f)
                curveTo(x1 = 20.4489f, y1 = 3.0f, x2 = 20.6397f, y2 = 3.07902f, x3 = 20.7803f, y3 = 3.21967f)
                curveTo(x1 = 20.921f, y1 = 3.36032f, x2 = 21.0f, y2 = 3.55109f, x3 = 21.0f, y3 = 3.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 14.75f)
                curveTo(x1 = 14.3358f, y1 = 21.0f, x2 = 14.0f, y2 = 20.6642f, x3 = 14.0f, y3 = 20.25f)
                curveTo(x1 = 14.0f, y1 = 19.8358f, x2 = 14.3358f, y2 = 19.5f, x3 = 14.75f, y3 = 19.5f)
                horizontalLineTo(x = 19.5f)
                verticalLineTo(y = 4.5f)
                close()
                moveTo(x = 10.9697f, y = 7.96967f)
                curveTo(x1 = 11.2626f, y1 = 7.67678f, x2 = 11.7374f, y2 = 7.67678f, x3 = 12.0303f, y3 = 7.96967f)
                lineTo(x = 15.5303f, y = 11.4697f)
                curveTo(x1 = 15.671f, y1 = 11.6103f, x2 = 15.75f, y2 = 11.8011f, x3 = 15.75f, y3 = 12.0f)
                curveTo(x1 = 15.75f, y1 = 12.1989f, x2 = 15.671f, y2 = 12.3897f, x3 = 15.5303f, y3 = 12.5303f)
                lineTo(x = 12.0303f, y = 16.0303f)
                curveTo(x1 = 11.7374f, y1 = 16.3232f, x2 = 11.2626f, y2 = 16.3232f, x3 = 10.9697f, y3 = 16.0303f)
                curveTo(x1 = 10.6768f, y1 = 15.7374f, x2 = 10.6768f, y2 = 15.2626f, x3 = 10.9697f, y3 = 14.9697f)
                lineTo(x = 13.1893f, y = 12.75f)
                lineTo(x = 3.75f, y = 12.75f)
                curveTo(x1 = 3.33579f, y1 = 12.75f, x2 = 3.0f, y2 = 12.4142f, x3 = 3.0f, y3 = 12.0f)
                curveTo(x1 = 3.0f, y1 = 11.5858f, x2 = 3.33579f, y2 = 11.25f, x3 = 3.75f, y3 = 11.25f)
                lineTo(x = 13.1893f, y = 11.25f)
                lineTo(x = 10.9697f, y = 9.03033f)
                curveTo(x1 = 10.6768f, y1 = 8.73744f, x2 = 10.6768f, y2 = 8.26257f, x3 = 10.9697f, y3 = 7.96967f)
                close()
            }
        }.build().also { _arrowBoxRight = it }
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
                imageVector = ArrowBoxRight,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowBoxRight: ImageVector? = null
