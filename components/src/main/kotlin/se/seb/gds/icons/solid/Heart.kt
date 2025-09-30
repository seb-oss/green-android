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

val Heart: ImageVector
    get() {
        val current = _heart
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Heart",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.3674f, y = 21.404f)
                    curveTo(x1 = 21.0872f, y1 = 16.5047f, x2 = 23.0863f, y2 = 10.7671f, x3 = 21.5175f, y3 = 6.84578f)
                    curveTo(x1 = 20.7503f, y1 = 4.92821f, x2 = 19.1426f, y2 = 3.55922f, x3 = 17.2527f, y3 = 3.1368f)
                    curveTo(x1 = 15.5343f, y1 = 2.75271f, x2 = 13.6399f, y2 = 3.16312f, x3 = 12.0f, y3 = 4.54956f)
                    curveTo(x1 = 10.3601f, y1 = 3.16312f, x2 = 8.46574f, y2 = 2.75271f, x3 = 6.74731f, y3 = 3.13681f)
                    curveTo(x1 = 4.85744f, y1 = 3.55922f, x2 = 3.24973f, y2 = 4.92822f, x3 = 2.48258f, y3 = 6.8458f)
                    curveTo(x1 = 0.913781f, y1 = 10.7672f, x2 = 2.91292f, y2 = 16.5047f, x3 = 11.6327f, y3 = 21.404f)
                    curveTo(x1 = 11.8608f, y1 = 21.5322f, x2 = 12.1393f, y2 = 21.5322f, x3 = 12.3674f, y3 = 21.404f)
                    close()
                }
            }.build()
            .also { _heart = it }
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
                imageVector = Heart,
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
private var _heart: ImageVector? = null
