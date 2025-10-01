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

val History: ImageVector
    get() {
        val current = _history
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.History",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 4.47239f, y = 8.0f)
                horizontalLineTo(x = 6.75f)
                curveTo(x1 = 7.16421f, y1 = 8.0f, x2 = 7.5f, y2 = 8.33579f, x3 = 7.5f, y3 = 8.75f)
                curveTo(x1 = 7.5f, y1 = 9.16421f, x2 = 7.16421f, y2 = 9.5f, x3 = 6.75f, y3 = 9.5f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 9.5f, x2 = 2.0f, y2 = 9.16421f, x3 = 2.0f, y3 = 8.75f)
                verticalLineTo(y = 4.75f)
                curveTo(x1 = 2.0f, y1 = 4.33579f, x2 = 2.33579f, y2 = 4.0f, x3 = 2.75f, y3 = 4.0f)
                curveTo(x1 = 3.16421f, y1 = 4.0f, x2 = 3.5f, y2 = 4.33579f, x3 = 3.5f, y3 = 4.75f)
                verticalLineTo(y = 6.68977f)
                curveTo(x1 = 5.27085f, y1 = 3.87322f, x2 = 8.4092f, y2 = 2.0f, x3 = 11.9864f, y3 = 2.0f)
                curveTo(x1 = 17.5157f, y1 = 2.0f, x2 = 22.0f, y2 = 6.47612f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 17.5239f, x2 = 17.5157f, y2 = 22.0f, x3 = 11.9864f, y3 = 22.0f)
                curveTo(x1 = 7.626f, y1 = 22.0f, x2 = 3.91756f, y2 = 19.2169f, x3 = 2.54299f, y3 = 15.3336f)
                curveTo(x1 = 2.40477f, y1 = 14.9431f, x2 = 2.60927f, y2 = 14.5145f, x3 = 2.99974f, y3 = 14.3763f)
                curveTo(x1 = 3.39021f, y1 = 14.2381f, x2 = 3.8188f, y2 = 14.4426f, x3 = 3.95701f, y3 = 14.8331f)
                curveTo(x1 = 5.12582f, y1 = 18.1351f, x2 = 8.28007f, y2 = 20.5f, x3 = 11.9864f, y3 = 20.5f)
                curveTo(x1 = 16.6894f, y1 = 20.5f, x2 = 20.5f, y2 = 16.6934f, x3 = 20.5f, y3 = 12.0f)
                curveTo(x1 = 20.5f, y1 = 7.30661f, x2 = 16.6894f, y2 = 3.5f, x3 = 11.9864f, y3 = 3.5f)
                curveTo(x1 = 8.73357f, y1 = 3.5f, x2 = 5.90591f, y2 = 5.32143f, x3 = 4.47239f, y3 = 8.0f)
                close()
                moveTo(x = 12.0f, y = 7.0f)
                curveTo(x1 = 12.4142f, y1 = 7.0f, x2 = 12.75f, y2 = 7.33579f, x3 = 12.75f, y3 = 7.75f)
                verticalLineTo(y = 11.6893f)
                lineTo(x = 16.0303f, y = 14.9697f)
                curveTo(x1 = 16.3232f, y1 = 15.2626f, x2 = 16.3232f, y2 = 15.7374f, x3 = 16.0303f, y3 = 16.0303f)
                curveTo(x1 = 15.7374f, y1 = 16.3232f, x2 = 15.2626f, y2 = 16.3232f, x3 = 14.9697f, y3 = 16.0303f)
                lineTo(x = 11.4697f, y = 12.5303f)
                curveTo(x1 = 11.329f, y1 = 12.3897f, x2 = 11.25f, y2 = 12.1989f, x3 = 11.25f, y3 = 12.0f)
                verticalLineTo(y = 7.75f)
                curveTo(x1 = 11.25f, y1 = 7.33579f, x2 = 11.5858f, y2 = 7.0f, x3 = 12.0f, y3 = 7.0f)
                close()
            }
        }.build().also { _history = it }
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
                imageVector = History,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _history: ImageVector? = null
