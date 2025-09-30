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

val Clock: ImageVector
    get() {
        val current = _clock
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Clock",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 12.0f, y = 22.0f)
                    curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 6.47715f, x2 = 17.5228f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    close()
                    moveTo(x = 12.75f, y = 7.75f)
                    curveTo(x1 = 12.75f, y1 = 7.33579f, x2 = 12.4142f, y2 = 7.0f, x3 = 12.0f, y3 = 7.0f)
                    curveTo(x1 = 11.5858f, y1 = 7.0f, x2 = 11.25f, y2 = 7.33579f, x3 = 11.25f, y3 = 7.75f)
                    verticalLineTo(y = 12.0f)
                    curveTo(x1 = 11.25f, y1 = 12.1989f, x2 = 11.329f, y2 = 12.3897f, x3 = 11.4697f, y3 = 12.5303f)
                    lineTo(x = 14.2197f, y = 15.2803f)
                    curveTo(x1 = 14.5126f, y1 = 15.5732f, x2 = 14.9874f, y2 = 15.5732f, x3 = 15.2803f, y3 = 15.2803f)
                    curveTo(x1 = 15.5732f, y1 = 14.9874f, x2 = 15.5732f, y2 = 14.5126f, x3 = 15.2803f, y3 = 14.2197f)
                    lineTo(x = 12.75f, y = 11.6893f)
                    verticalLineTo(y = 7.75f)
                    close()
                }
            }.build()
            .also { _clock = it }
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
                imageVector = Clock,
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
private var _clock: ImageVector? = null
