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

val BarsTwo: ImageVector
    get() {
        val current = _barsTwo
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BarsTwo",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 7.25f)
                    curveTo(x1 = 2.0f, y1 = 6.83579f, x2 = 2.33579f, y2 = 6.5f, x3 = 2.75f, y3 = 6.5f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 6.5f, x2 = 22.0f, y2 = 6.83579f, x3 = 22.0f, y3 = 7.25f)
                    curveTo(x1 = 22.0f, y1 = 7.66421f, x2 = 21.6642f, y2 = 8.0f, x3 = 21.25f, y3 = 8.0f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 8.0f, x2 = 2.0f, y2 = 7.66421f, x3 = 2.0f, y3 = 7.25f)
                    close()
                    moveTo(x = 2.0f, y = 16.75f)
                    curveTo(x1 = 2.0f, y1 = 16.3358f, x2 = 2.33579f, y2 = 16.0f, x3 = 2.75f, y3 = 16.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 16.0f, x2 = 22.0f, y2 = 16.3358f, x3 = 22.0f, y3 = 16.75f)
                    curveTo(x1 = 22.0f, y1 = 17.1642f, x2 = 21.6642f, y2 = 17.5f, x3 = 21.25f, y3 = 17.5f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 17.5f, x2 = 2.0f, y2 = 17.1642f, x3 = 2.0f, y3 = 16.75f)
                    close()
                }
            }.build()
            .also { _barsTwo = it }
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
                imageVector = BarsTwo,
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
private var _barsTwo: ImageVector? = null
