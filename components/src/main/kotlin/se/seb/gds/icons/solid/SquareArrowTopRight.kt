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

val SquareArrowTopRight: ImageVector
    get() {
        val current = _squareArrowTopRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SquareArrowTopRight",
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
                horizontalLineTo(x = 9.25f)
                curveTo(x1 = 9.66421f, y1 = 3.0f, x2 = 10.0f, y2 = 3.33579f, x3 = 10.0f, y3 = 3.75f)
                curveTo(x1 = 10.0f, y1 = 4.16421f, x2 = 9.66421f, y2 = 4.5f, x3 = 9.25f, y3 = 4.5f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 19.5f)
                verticalLineTo(y = 14.75f)
                curveTo(x1 = 19.5f, y1 = 14.3358f, x2 = 19.8358f, y2 = 14.0f, x3 = 20.25f, y3 = 14.0f)
                curveTo(x1 = 20.6642f, y1 = 14.0f, x2 = 21.0f, y2 = 14.3358f, x3 = 21.0f, y3 = 14.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 13.0f, y = 3.75f)
                curveTo(x1 = 13.0f, y1 = 3.33579f, x2 = 13.3358f, y2 = 3.0f, x3 = 13.75f, y3 = 3.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 3.0f, x2 = 21.0f, y2 = 3.33579f, x3 = 21.0f, y3 = 3.75f)
                verticalLineTo(y = 10.25f)
                curveTo(x1 = 21.0f, y1 = 10.6642f, x2 = 20.6642f, y2 = 11.0f, x3 = 20.25f, y3 = 11.0f)
                curveTo(x1 = 19.8358f, y1 = 11.0f, x2 = 19.5f, y2 = 10.6642f, x3 = 19.5f, y3 = 10.25f)
                verticalLineTo(y = 5.56066f)
                lineTo(x = 11.5303f, y = 13.5303f)
                curveTo(x1 = 11.2374f, y1 = 13.8232f, x2 = 10.7626f, y2 = 13.8232f, x3 = 10.4697f, y3 = 13.5303f)
                curveTo(x1 = 10.1768f, y1 = 13.2374f, x2 = 10.1768f, y2 = 12.7626f, x3 = 10.4697f, y3 = 12.4697f)
                lineTo(x = 18.4393f, y = 4.5f)
                horizontalLineTo(x = 13.75f)
                curveTo(x1 = 13.3358f, y1 = 4.5f, x2 = 13.0f, y2 = 4.16421f, x3 = 13.0f, y3 = 3.75f)
                close()
            }
        }.build().also { _squareArrowTopRight = it }
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
                imageVector = SquareArrowTopRight,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _squareArrowTopRight: ImageVector? = null
