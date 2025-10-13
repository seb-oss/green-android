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

internal val CircleCheck: ImageVector
    get() {
        val current = _circleCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.CircleCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 6.47715f, x2 = 17.5228f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                close()
                moveTo(x = 15.5805f, y = 9.97493f)
                curveTo(x1 = 15.8428f, y1 = 9.65434f, x2 = 15.7955f, y2 = 9.18183f, x3 = 15.4749f, y3 = 8.91953f)
                curveTo(x1 = 15.1543f, y1 = 8.65724f, x2 = 14.6818f, y2 = 8.70449f, x3 = 14.4195f, y3 = 9.02507f)
                lineTo(x = 10.4443f, y = 13.8837f)
                lineTo(x = 9.03033f, y = 12.4697f)
                curveTo(x1 = 8.73744f, y1 = 12.1768f, x2 = 8.26256f, y2 = 12.1768f, x3 = 7.96967f, y3 = 12.4697f)
                curveTo(x1 = 7.67678f, y1 = 12.7626f, x2 = 7.67678f, y2 = 13.2374f, x3 = 7.96967f, y3 = 13.5303f)
                lineTo(x = 9.96967f, y = 15.5303f)
                curveTo(x1 = 10.1195f, y1 = 15.6802f, x2 = 10.3257f, y2 = 15.7596f, x3 = 10.5374f, y3 = 15.7491f)
                curveTo(x1 = 10.749f, y1 = 15.7385f, x2 = 10.9463f, y2 = 15.6389f, x3 = 11.0805f, y3 = 15.4749f)
                lineTo(x = 15.5805f, y = 9.97493f)
                close()
            }
        }.build().also { _circleCheck = it }
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
                imageVector = CircleCheck,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _circleCheck: ImageVector? = null
