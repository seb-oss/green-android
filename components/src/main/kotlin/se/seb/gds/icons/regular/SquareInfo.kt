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

val SquareInfo: ImageVector
    get() {
        val current = _squareInfo
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SquareInfo",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 20.25f, y = 3.75f)
                    horizontalLineTo(x = 21.0f)
                    curveTo(x1 = 21.0f, y1 = 3.33579f, x2 = 20.6642f, y2 = 3.0f, x3 = 20.25f, y3 = 3.0f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 20.25f, y = 20.25f)
                    verticalLineTo(y = 21.0f)
                    curveTo(x1 = 20.6642f, y1 = 21.0f, x2 = 21.0f, y2 = 20.6642f, x3 = 21.0f, y3 = 20.25f)
                    horizontalLineTo(x = 20.25f)
                    close()
                    moveTo(x = 3.75f, y = 20.25f)
                    horizontalLineTo(x = 3.0f)
                    curveTo(x1 = 3.0f, y1 = 20.6642f, x2 = 3.33579f, y2 = 21.0f, x3 = 3.75f, y3 = 21.0f)
                    verticalLineTo(y = 20.25f)
                    close()
                    moveTo(x = 3.75f, y = 3.75f)
                    verticalLineTo(y = 3.0f)
                    curveTo(x1 = 3.33579f, y1 = 3.0f, x2 = 3.0f, y2 = 3.33579f, x3 = 3.0f, y3 = 3.75f)
                    horizontalLineTo(x = 3.75f)
                    close()
                    moveTo(x = 10.75f, y = 10.25f)
                    curveTo(x1 = 10.3358f, y1 = 10.25f, x2 = 10.0f, y2 = 10.5858f, x3 = 10.0f, y3 = 11.0f)
                    curveTo(x1 = 10.0f, y1 = 11.4142f, x2 = 10.3358f, y2 = 11.75f, x3 = 10.75f, y3 = 11.75f)
                    verticalLineTo(y = 10.25f)
                    close()
                    moveTo(x = 12.0f, y = 11.0f)
                    lineTo(x = 12.75f, y = 11.0f)
                    curveTo(x1 = 12.75f, y1 = 10.5858f, x2 = 12.4142f, y2 = 10.25f, x3 = 12.0f, y3 = 10.25f)
                    verticalLineTo(y = 11.0f)
                    close()
                    moveTo(x = 11.25f, y = 16.25f)
                    curveTo(x1 = 11.25f, y1 = 16.6642f, x2 = 11.5858f, y2 = 17.0f, x3 = 12.0f, y3 = 17.0f)
                    curveTo(x1 = 12.4142f, y1 = 17.0f, x2 = 12.75f, y2 = 16.6642f, x3 = 12.75f, y3 = 16.25f)
                    lineTo(x = 11.25f, y = 16.25f)
                    close()
                    moveTo(x = 19.5f, y = 3.75f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 21.0f)
                    verticalLineTo(y = 3.75f)
                    horizontalLineTo(x = 19.5f)
                    close()
                    moveTo(x = 20.25f, y = 19.5f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 21.0f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 19.5f)
                    close()
                    moveTo(x = 4.5f, y = 20.25f)
                    verticalLineTo(y = 3.75f)
                    horizontalLineTo(x = 3.0f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 4.5f)
                    close()
                    moveTo(x = 3.75f, y = 4.5f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 3.0f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 4.5f)
                    close()
                    moveTo(x = 10.75f, y = 11.75f)
                    horizontalLineTo(x = 12.0f)
                    verticalLineTo(y = 10.25f)
                    horizontalLineTo(x = 10.75f)
                    verticalLineTo(y = 11.75f)
                    close()
                    moveTo(x = 11.25f, y = 11.0f)
                    lineTo(x = 11.25f, y = 16.25f)
                    lineTo(x = 12.75f, y = 16.25f)
                    lineTo(x = 12.75f, y = 11.0f)
                    lineTo(x = 11.25f, y = 11.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 0.25f,
                ) {
                    moveTo(x = 11.375f, y = 8.0f)
                    curveTo(x1 = 11.375f, y1 = 8.34518f, x2 = 11.6548f, y2 = 8.625f, x3 = 12.0f, y3 = 8.625f)
                    curveTo(x1 = 12.3452f, y1 = 8.625f, x2 = 12.625f, y2 = 8.34518f, x3 = 12.625f, y3 = 8.0f)
                    curveTo(x1 = 12.625f, y1 = 7.65482f, x2 = 12.3452f, y2 = 7.375f, x3 = 12.0f, y3 = 7.375f)
                    curveTo(x1 = 11.6548f, y1 = 7.375f, x2 = 11.375f, y2 = 7.65482f, x3 = 11.375f, y3 = 8.0f)
                    close()
                }
            }.build()
            .also { _squareInfo = it }
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
                imageVector = SquareInfo,
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
private var _squareInfo: ImageVector? = null
