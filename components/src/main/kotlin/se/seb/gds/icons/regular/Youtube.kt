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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Youtube: ImageVector
    get() {
        val current = _youtube
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Youtube",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 20.2043f, y = 4.00776f)
                curveTo(x1 = 21.1084f, y1 = 4.28763f, x2 = 21.8189f, y2 = 5.10925f, x3 = 22.0609f, y3 = 6.15475f)
                curveTo(x1 = 22.4982f, y1 = 8.04786f, x2 = 22.5f, y2 = 12.0f, x3 = 22.5f, y3 = 12.0f)
                curveTo(x1 = 22.5f, y1 = 12.0f, x2 = 22.5f, y2 = 15.9522f, x3 = 22.0609f, y3 = 17.8453f)
                curveTo(x1 = 21.8189f, y1 = 18.8908f, x2 = 21.1084f, y2 = 19.7124f, x3 = 20.2043f, y3 = 19.9922f)
                curveTo(x1 = 18.5673f, y1 = 20.5f, x2 = 12.0f, y2 = 20.5f, x3 = 12.0f, y3 = 20.5f)
                curveTo(x1 = 12.0f, y1 = 20.5f, x2 = 5.43274f, y2 = 20.5f, x3 = 3.79568f, y3 = 19.9922f)
                curveTo(x1 = 2.89159f, y1 = 19.7124f, x2 = 2.1811f, y2 = 18.8908f, x3 = 1.93908f, y3 = 17.8453f)
                curveTo(x1 = 1.5f, y1 = 15.9522f, x2 = 1.5f, y2 = 12.0f, x3 = 1.5f, y3 = 12.0f)
                curveTo(x1 = 1.5f, y1 = 12.0f, x2 = 1.5f, y2 = 8.04786f, x3 = 1.93908f, y3 = 6.15475f)
                curveTo(x1 = 2.1811f, y1 = 5.10925f, x2 = 2.89159f, y2 = 4.28763f, x3 = 3.79568f, y3 = 4.00776f)
                curveTo(x1 = 5.43274f, y1 = 3.5f, x2 = 12.0f, y2 = 3.5f, x3 = 12.0f, y3 = 3.5f)
                curveTo(x1 = 12.0f, y1 = 3.5f, x2 = 18.5673f, y2 = 3.5f, x3 = 20.2043f, y3 = 4.00776f)
                close()
                moveTo(x = 15.5134f, y = 12.0003f)
                lineTo(x = 9.79785f, y = 15.2999f)
                verticalLineTo(y = 8.70065f)
                lineTo(x = 15.5134f, y = 12.0003f)
                close()
            }
        }.build().also { _youtube = it }
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
                imageVector = Youtube,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _youtube: ImageVector? = null
