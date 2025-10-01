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

val ArrowRightCircle: ImageVector
    get() {
        val current = _arrowRightCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowRightCircle",
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
                curveTo(x1 = 17.5228f, y1 = 2.0f, x2 = 22.0f, y2 = 6.47715f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 17.5228f, x2 = 17.5228f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 6.47715f, y1 = 22.0f, x2 = 2.0f, y2 = 17.5228f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 6.47715f, x2 = 6.47715f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                close()
                moveTo(x = 13.5303f, y = 8.21967f)
                lineTo(x = 16.7803f, y = 11.4697f)
                curveTo(x1 = 17.0732f, y1 = 11.7626f, x2 = 17.0732f, y2 = 12.2374f, x3 = 16.7803f, y3 = 12.5303f)
                lineTo(x = 13.5303f, y = 15.7803f)
                curveTo(x1 = 13.2374f, y1 = 16.0732f, x2 = 12.7626f, y2 = 16.0732f, x3 = 12.4697f, y3 = 15.7803f)
                curveTo(x1 = 12.1768f, y1 = 15.4874f, x2 = 12.1768f, y2 = 15.0126f, x3 = 12.4697f, y3 = 14.7197f)
                lineTo(x = 14.4393f, y = 12.75f)
                horizontalLineTo(x = 7.75f)
                curveTo(x1 = 7.33579f, y1 = 12.75f, x2 = 7.0f, y2 = 12.4142f, x3 = 7.0f, y3 = 12.0f)
                curveTo(x1 = 7.0f, y1 = 11.5858f, x2 = 7.33579f, y2 = 11.25f, x3 = 7.75f, y3 = 11.25f)
                horizontalLineTo(x = 14.4393f)
                lineTo(x = 12.4697f, y = 9.28033f)
                curveTo(x1 = 12.1768f, y1 = 8.98744f, x2 = 12.1768f, y2 = 8.51256f, x3 = 12.4697f, y3 = 8.21967f)
                curveTo(x1 = 12.7626f, y1 = 7.92678f, x2 = 13.2374f, y2 = 7.92678f, x3 = 13.5303f, y3 = 8.21967f)
                close()
            }
        }.build().also { _arrowRightCircle = it }
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
                imageVector = ArrowRightCircle,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowRightCircle: ImageVector? = null
