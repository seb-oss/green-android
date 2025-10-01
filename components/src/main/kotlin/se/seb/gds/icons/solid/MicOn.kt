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

val MicOn: ImageVector
    get() {
        val current = _micOn
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.MicOn",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 7.0f, y = 7.0f)
                curveTo(x1 = 7.0f, y1 = 4.23858f, x2 = 9.23858f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 14.7614f, y1 = 2.0f, x2 = 17.0f, y2 = 4.23858f, x3 = 17.0f, y3 = 7.0f)
                verticalLineTo(y = 11.5f)
                curveTo(x1 = 17.0f, y1 = 14.2614f, x2 = 14.7614f, y2 = 16.5f, x3 = 12.0f, y3 = 16.5f)
                curveTo(x1 = 9.23858f, y1 = 16.5f, x2 = 7.0f, y2 = 14.2614f, x3 = 7.0f, y3 = 11.5f)
                verticalLineTo(y = 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 5.81123f, y = 14.1997f)
                curveTo(x1 = 5.64539f, y1 = 13.8201f, x2 = 5.20326f, y2 = 13.6468f, x3 = 4.82369f, y3 = 13.8127f)
                curveTo(x1 = 4.44412f, y1 = 13.9785f, x2 = 4.27087f, y2 = 14.4207f, x3 = 4.4367f, y3 = 14.8002f)
                curveTo(x1 = 5.61403f, y1 = 17.4948f, x2 = 8.19054f, y2 = 19.4406f, x3 = 11.2499f, y3 = 19.7163f)
                verticalLineTo(y = 21.2499f)
                curveTo(x1 = 11.2499f, y1 = 21.6642f, x2 = 11.5857f, y2 = 21.9999f, x3 = 11.9999f, y3 = 21.9999f)
                curveTo(x1 = 12.4141f, y1 = 21.9999f, x2 = 12.7499f, y2 = 21.6642f, x3 = 12.7499f, y3 = 21.2499f)
                verticalLineTo(y = 19.7163f)
                curveTo(x1 = 15.8093f, y1 = 19.4406f, x2 = 18.3858f, y2 = 17.4948f, x3 = 19.5631f, y3 = 14.8002f)
                curveTo(x1 = 19.7289f, y1 = 14.4207f, x2 = 19.5557f, y2 = 13.9785f, x3 = 19.1761f, y3 = 13.8127f)
                curveTo(x1 = 18.7966f, y1 = 13.6468f, x2 = 18.3544f, y2 = 13.8201f, x3 = 18.1886f, y3 = 14.1997f)
                curveTo(x1 = 17.1463f, y1 = 16.5852f, x2 = 14.7667f, y2 = 18.2499f, x3 = 11.9999f, y3 = 18.2499f)
                curveTo(x1 = 9.23314f, y1 = 18.2499f, x2 = 6.85352f, y2 = 16.5852f, x3 = 5.81123f, y3 = 14.1997f)
                close()
            }
        }.build().also { _micOn = it }
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
                imageVector = MicOn,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _micOn: ImageVector? = null
