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

val CircleBan: ImageVector
    get() {
        val current = _circleBan
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.CircleBan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 18.5209f, y = 4.4184f)
                curveTo(x1 = 16.7701f, y1 = 2.91114f, x2 = 14.4915f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 14.4915f, x2 = 2.91114f, y2 = 16.7701f, x3 = 4.4184f, y3 = 18.5209f)
                lineTo(x = 18.5209f, y = 4.4184f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.5816f, y = 5.47906f)
                lineTo(x = 5.47906f, y = 19.5816f)
                curveTo(x1 = 7.22987f, y1 = 21.0889f, x2 = 9.50853f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 9.50853f, x2 = 21.0889f, y2 = 7.22987f, x3 = 19.5816f, y3 = 5.47906f)
                close()
            }
        }.build().also { _circleBan = it }
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
                imageVector = CircleBan,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _circleBan: ImageVector? = null
