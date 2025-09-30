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

val SquareMinus: ImageVector
    get() {
        val current = _squareMinus
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SquareMinus",
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
                    moveTo(x = 15.25f, y = 12.7502f)
                    curveTo(x1 = 15.6642f, y1 = 12.7502f, x2 = 16.0f, y2 = 12.4144f, x3 = 16.0f, y3 = 12.0002f)
                    curveTo(x1 = 16.0f, y1 = 11.586f, x2 = 15.6642f, y2 = 11.2502f, x3 = 15.25f, y3 = 11.2502f)
                    horizontalLineTo(x = 8.75736f)
                    curveTo(x1 = 8.34314f, y1 = 11.2502f, x2 = 8.00736f, y2 = 11.586f, x3 = 8.00736f, y3 = 12.0002f)
                    curveTo(x1 = 8.00736f, y1 = 12.4144f, x2 = 8.34314f, y2 = 12.7502f, x3 = 8.75736f, y3 = 12.7502f)
                    horizontalLineTo(x = 15.25f)
                    close()
                }
            }.build()
            .also { _squareMinus = it }
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
                imageVector = SquareMinus,
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
private var _squareMinus: ImageVector? = null
