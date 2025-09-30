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

val SquareCheck: ImageVector
    get() {
        val current = _squareCheck
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SquareCheck",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 3.0f, y = 3.75f)
                    curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                    horizontalLineTo(x = 20.25f)
                    curveTo(x1 = 20.6642f, y1 = 3.0f, x2 = 21.0f, y2 = 3.33579f, x3 = 21.0f, y3 = 3.75f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                    horizontalLineTo(x = 3.75f)
                    curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 16.0271f, y = 10.4445f)
                    curveTo(x1 = 16.32f, y1 = 10.1516f, x2 = 16.32f, y2 = 9.67676f, x3 = 16.0271f, y3 = 9.38386f)
                    curveTo(x1 = 15.7342f, y1 = 9.09097f, x2 = 15.2593f, y2 = 9.09097f, x3 = 14.9664f, y3 = 9.38386f)
                    lineTo(x = 10.9968f, y = 13.3535f)
                    lineTo(x = 9.52711f, y = 11.8839f)
                    curveTo(x1 = 9.23421f, y1 = 11.591f, x2 = 8.75934f, y2 = 11.591f, x3 = 8.46645f, y3 = 11.8839f)
                    curveTo(x1 = 8.17355f, y1 = 12.1768f, x2 = 8.17355f, y2 = 12.6516f, x3 = 8.46645f, y3 = 12.9445f)
                    lineTo(x = 10.4664f, y = 14.9445f)
                    curveTo(x1 = 10.7593f, y1 = 15.2374f, x2 = 11.2342f, y2 = 15.2374f, x3 = 11.5271f, y3 = 14.9445f)
                    lineTo(x = 16.0271f, y = 10.4445f)
                    close()
                }
            }.build()
            .also { _squareCheck = it }
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
                imageVector = SquareCheck,
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
private var _squareCheck: ImageVector? = null
