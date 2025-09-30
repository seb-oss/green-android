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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Fashion: ImageVector
    get() {
        val current = _fashion
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Fashion",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 9.642f, y = 3.52996f)
                    curveTo(x1 = 9.57767f, y1 = 3.32033f, x2 = 9.42482f, y2 = 3.14936f, x3 = 9.22368f, y3 = 3.06204f)
                    curveTo(x1 = 9.02254f, y1 = 2.97471f, x2 = 8.79327f, y2 = 2.97979f, x3 = 8.59619f, y3 = 3.07592f)
                    lineTo(x = 1.42119f, y = 6.57592f)
                    curveTo(x1 = 1.07817f, y1 = 6.74325f, x2 = 0.915507f, y2 = 7.1415f, x3 = 1.0433f, y3 = 7.50112f)
                    lineTo(x = 2.5808f, y = 10.8279f)
                    curveTo(x1 = 2.65123f, y1 = 11.0261f, x2 = 2.80164f, y2 = 11.1856f, x3 = 2.99536f, y3 = 11.2676f)
                    curveTo(x1 = 3.18908f, y1 = 11.3495f, x2 = 3.40831f, y2 = 11.3463f, x3 = 3.59957f, y3 = 11.2588f)
                    lineTo(x = 5.00001f, y = 10.618f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 5.00001f, y1 = 20.6642f, x2 = 5.33579f, y2 = 21.0f, x3 = 5.75001f, y3 = 21.0f)
                    horizontalLineTo(x = 18.25f)
                    curveTo(x1 = 18.6642f, y1 = 21.0f, x2 = 19.0f, y2 = 20.6642f, x3 = 19.0f, y3 = 20.25f)
                    verticalLineTo(y = 10.618f)
                    lineTo(x = 20.4004f, y = 11.2588f)
                    curveTo(x1 = 20.5917f, y1 = 11.3463f, x2 = 20.8109f, y2 = 11.3495f, x3 = 21.0047f, y3 = 11.2676f)
                    curveTo(x1 = 21.1984f, y1 = 11.1856f, x2 = 21.3488f, y2 = 11.0261f, x3 = 21.4192f, y3 = 10.8279f)
                    lineTo(x = 22.9567f, y = 7.50112f)
                    curveTo(x1 = 23.0845f, y1 = 7.1415f, x2 = 22.9218f, y2 = 6.74325f, x3 = 22.5788f, y3 = 6.57592f)
                    lineTo(x = 15.4038f, y = 3.07592f)
                    curveTo(x1 = 15.2067f, y1 = 2.97979f, x2 = 14.9775f, y2 = 2.97471f, x3 = 14.7763f, y3 = 3.06204f)
                    curveTo(x1 = 14.5752f, y1 = 3.14936f, x2 = 14.4223f, y2 = 3.32033f, x3 = 14.358f, y3 = 3.52996f)
                    curveTo(x1 = 13.9516f, y1 = 4.85432f, x2 = 12.9502f, y2 = 5.44833f, x3 = 12.0f, y3 = 5.44833f)
                    curveTo(x1 = 11.0498f, y1 = 5.44833f, x2 = 10.0484f, y2 = 4.85432f, x3 = 9.642f, y3 = 3.52996f)
                    close()
                }
            }.build()
            .also { _fashion = it }
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
                imageVector = Fashion,
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
private var _fashion: ImageVector? = null
