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

val Play: ImageVector
    get() {
        val current = _play
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Play",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 6.13434f, y = 2.10597f)
                curveTo(x1 = 5.90259f, y1 = 1.96766f, x2 = 5.6144f, y2 = 1.96454f, x3 = 5.3797f, y3 = 2.09779f)
                curveTo(x1 = 5.145f, y1 = 2.23104f, x2 = 5.0f, y2 = 2.48011f, x3 = 5.0f, y3 = 2.75f)
                verticalLineTo(y = 21.25f)
                curveTo(x1 = 5.0f, y1 = 21.5199f, x2 = 5.145f, y2 = 21.769f, x3 = 5.3797f, y3 = 21.9022f)
                curveTo(x1 = 5.6144f, y1 = 22.0355f, x2 = 5.90259f, y2 = 22.0323f, x3 = 6.13434f, y3 = 21.894f)
                lineTo(x = 21.6343f, y = 12.644f)
                curveTo(x1 = 21.8611f, y1 = 12.5087f, x2 = 22.0f, y2 = 12.2641f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 11.7359f, x2 = 21.8611f, y2 = 11.4913f, x3 = 21.6343f, y3 = 11.356f)
                lineTo(x = 6.13434f, y = 2.10597f)
                close()
            }
        }.build().also { _play = it }
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
                imageVector = Play,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _play: ImageVector? = null
