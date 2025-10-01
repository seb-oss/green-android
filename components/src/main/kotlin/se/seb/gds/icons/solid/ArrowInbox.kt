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

val ArrowInbox: ImageVector
    get() {
        val current = _arrowInbox
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowInbox",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.75f, y = 14.0f)
                curveTo(x1 = 4.16421f, y1 = 14.0f, x2 = 4.5f, y2 = 14.3358f, x3 = 4.5f, y3 = 14.75f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 19.5f)
                verticalLineTo(y = 14.75f)
                curveTo(x1 = 19.5f, y1 = 14.3358f, x2 = 19.8358f, y2 = 14.0f, x3 = 20.25f, y3 = 14.0f)
                curveTo(x1 = 20.6642f, y1 = 14.0f, x2 = 21.0f, y2 = 14.3358f, x3 = 21.0f, y3 = 14.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                verticalLineTo(y = 14.75f)
                curveTo(x1 = 3.0f, y1 = 14.3358f, x2 = 3.33579f, y2 = 14.0f, x3 = 3.75f, y3 = 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 15.75f)
                curveTo(x1 = 12.1989f, y1 = 15.75f, x2 = 12.3897f, y2 = 15.671f, x3 = 12.5303f, y3 = 15.5303f)
                lineTo(x = 16.0303f, y = 12.0303f)
                curveTo(x1 = 16.3232f, y1 = 11.7374f, x2 = 16.3232f, y2 = 11.2626f, x3 = 16.0303f, y3 = 10.9697f)
                curveTo(x1 = 15.7374f, y1 = 10.6768f, x2 = 15.2626f, y2 = 10.6768f, x3 = 14.9697f, y3 = 10.9697f)
                lineTo(x = 12.75f, y = 13.1893f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 12.75f, y1 = 3.33579f, x2 = 12.4142f, y2 = 3.0f, x3 = 12.0f, y3 = 3.0f)
                curveTo(x1 = 11.5858f, y1 = 3.0f, x2 = 11.25f, y2 = 3.33579f, x3 = 11.25f, y3 = 3.75f)
                verticalLineTo(y = 13.1893f)
                lineTo(x = 9.03033f, y = 10.9697f)
                curveTo(x1 = 8.73744f, y1 = 10.6768f, x2 = 8.26256f, y2 = 10.6768f, x3 = 7.96967f, y3 = 10.9697f)
                curveTo(x1 = 7.67678f, y1 = 11.2626f, x2 = 7.67678f, y2 = 11.7374f, x3 = 7.96967f, y3 = 12.0303f)
                lineTo(x = 11.4697f, y = 15.5303f)
                curveTo(x1 = 11.6103f, y1 = 15.671f, x2 = 11.8011f, y2 = 15.75f, x3 = 12.0f, y3 = 15.75f)
                close()
            }
        }.build().also { _arrowInbox = it }
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
                imageVector = ArrowInbox,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowInbox: ImageVector? = null
