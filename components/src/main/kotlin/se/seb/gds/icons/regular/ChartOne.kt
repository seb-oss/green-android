package se.seb.gds.icons.regular

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

val ChartOne: ImageVector
    get() {
        val current = _chartOne
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ChartOne",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 9.25f, y = 3.75f)
                    lineTo(x = 10.0f, y = 3.75f)
                    lineTo(x = 10.0f, y = 3.0f)
                    lineTo(x = 9.25f, y = 3.0f)
                    lineTo(x = 9.25f, y = 3.75f)
                    close()
                    moveTo(x = 9.25f, y = 9.25f)
                    lineTo(x = 9.25f, y = 10.0f)
                    lineTo(x = 10.0f, y = 10.0f)
                    lineTo(x = 10.0f, y = 9.25f)
                    lineTo(x = 9.25f, y = 9.25f)
                    close()
                    moveTo(x = 3.75f, y = 9.25f)
                    lineTo(x = 3.0f, y = 9.25f)
                    verticalLineTo(y = 9.25f)
                    horizontalLineTo(x = 3.75f)
                    close()
                    moveTo(x = 3.75f, y = 3.75f)
                    lineTo(x = 3.75f, y = 3.0f)
                    lineTo(x = 3.0f, y = 3.0f)
                    lineTo(x = 3.0f, y = 3.75f)
                    lineTo(x = 3.75f, y = 3.75f)
                    close()
                    moveTo(x = 14.75f, y = 9.25f)
                    horizontalLineTo(x = 15.5f)
                    verticalLineTo(y = 8.5f)
                    lineTo(x = 14.75f, y = 8.5f)
                    lineTo(x = 14.75f, y = 9.25f)
                    close()
                    moveTo(x = 14.75f, y = 14.75f)
                    verticalLineTo(y = 15.5f)
                    horizontalLineTo(x = 15.5f)
                    verticalLineTo(y = 14.75f)
                    horizontalLineTo(x = 14.75f)
                    close()
                    moveTo(x = 20.25f, y = 14.75f)
                    horizontalLineTo(x = 21.0f)
                    verticalLineTo(y = 14.0f)
                    lineTo(x = 20.25f, y = 14.0f)
                    lineTo(x = 20.25f, y = 14.75f)
                    close()
                    moveTo(x = 20.25f, y = 20.25f)
                    verticalLineTo(y = 21.0f)
                    horizontalLineTo(x = 21.0f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 20.25f)
                    close()
                    moveTo(x = 3.75f, y = 20.25f)
                    horizontalLineTo(x = 3.0f)
                    verticalLineTo(y = 21.0f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 20.25f)
                    close()
                    moveTo(x = 4.5f, y = 1.75f)
                    curveTo(x1 = 4.5f, y1 = 1.33579f, x2 = 4.16421f, y2 = 1.0f, x3 = 3.75f, y3 = 1.0f)
                    curveTo(x1 = 3.33579f, y1 = 1.0f, x2 = 3.0f, y2 = 1.33579f, x3 = 3.0f, y3 = 1.75f)
                    horizontalLineTo(x = 4.5f)
                    close()
                    moveTo(x = 3.0f, y = 22.25f)
                    curveTo(x1 = 3.0f, y1 = 22.6642f, x2 = 3.33579f, y2 = 23.0f, x3 = 3.75f, y3 = 23.0f)
                    curveTo(x1 = 4.16421f, y1 = 23.0f, x2 = 4.5f, y2 = 22.6642f, x3 = 4.5f, y3 = 22.25f)
                    horizontalLineTo(x = 3.0f)
                    close()
                    moveTo(x = 8.5f, y = 3.75f)
                    lineTo(x = 8.5f, y = 9.25f)
                    lineTo(x = 10.0f, y = 9.25f)
                    lineTo(x = 10.0f, y = 3.75f)
                    lineTo(x = 8.5f, y = 3.75f)
                    close()
                    moveTo(x = 9.25f, y = 8.5f)
                    lineTo(x = 3.75f, y = 8.5f)
                    lineTo(x = 3.75f, y = 10.0f)
                    lineTo(x = 9.25f, y = 10.0f)
                    lineTo(x = 9.25f, y = 8.5f)
                    close()
                    moveTo(x = 4.5f, y = 9.25f)
                    lineTo(x = 4.5f, y = 3.75f)
                    lineTo(x = 3.0f, y = 3.75f)
                    lineTo(x = 3.0f, y = 9.25f)
                    lineTo(x = 4.5f, y = 9.25f)
                    close()
                    moveTo(x = 3.75f, y = 4.5f)
                    lineTo(x = 9.25f, y = 4.5f)
                    lineTo(x = 9.25f, y = 3.0f)
                    lineTo(x = 3.75f, y = 3.0f)
                    lineTo(x = 3.75f, y = 4.5f)
                    close()
                    moveTo(x = 14.0f, y = 9.25f)
                    verticalLineTo(y = 14.75f)
                    horizontalLineTo(x = 15.5f)
                    verticalLineTo(y = 9.25f)
                    horizontalLineTo(x = 14.0f)
                    close()
                    moveTo(x = 14.75f, y = 14.0f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 15.5f)
                    horizontalLineTo(x = 14.75f)
                    verticalLineTo(y = 14.0f)
                    close()
                    moveTo(x = 4.5f, y = 14.75f)
                    verticalLineTo(y = 9.25f)
                    horizontalLineTo(x = 3.0f)
                    verticalLineTo(y = 14.75f)
                    horizontalLineTo(x = 4.5f)
                    close()
                    moveTo(x = 3.75f, y = 10.0f)
                    lineTo(x = 14.75f, y = 10.0f)
                    lineTo(x = 14.75f, y = 8.5f)
                    lineTo(x = 3.75f, y = 8.5f)
                    lineTo(x = 3.75f, y = 10.0f)
                    close()
                    moveTo(x = 19.5f, y = 14.75f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 21.0f)
                    verticalLineTo(y = 14.75f)
                    horizontalLineTo(x = 19.5f)
                    close()
                    moveTo(x = 20.25f, y = 19.5f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 21.0f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 19.5f)
                    close()
                    moveTo(x = 4.5f, y = 20.25f)
                    verticalLineTo(y = 14.75f)
                    horizontalLineTo(x = 3.0f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 4.5f)
                    close()
                    moveTo(x = 3.75f, y = 15.5f)
                    lineTo(x = 20.25f, y = 15.5f)
                    lineTo(x = 20.25f, y = 14.0f)
                    lineTo(x = 3.75f, y = 14.0f)
                    lineTo(x = 3.75f, y = 15.5f)
                    close()
                    moveTo(x = 3.0f, y = 1.75f)
                    verticalLineTo(y = 22.25f)
                    horizontalLineTo(x = 4.5f)
                    verticalLineTo(y = 1.75f)
                    horizontalLineTo(x = 3.0f)
                    close()
                }
            }.build()
            .also { _chartOne = it }
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
                imageVector = ChartOne,
                contentDescription = null,
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chartOne: ImageVector? = null
