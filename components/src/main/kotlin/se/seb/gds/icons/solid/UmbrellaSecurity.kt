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

internal val UmbrellaSecurity: ImageVector
    get() {
        val current = _umbrellaSecurity
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.UmbrellaSecurity",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.75f, y = 2.75f)
                curveTo(x1 = 12.75f, y1 = 2.33579f, x2 = 12.4142f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 11.5858f, y1 = 2.0f, x2 = 11.25f, y2 = 2.33579f, x3 = 11.25f, y3 = 2.75f)
                verticalLineTo(y = 4.02707f)
                curveTo(x1 = 6.66452f, y1 = 4.35893f, x2 = 2.91655f, y2 = 7.70682f, x3 = 1.97754f, y3 = 12.0961f)
                curveTo(x1 = 1.93017f, y1 = 12.3176f, x2 = 1.98538f, y2 = 12.5486f, x3 = 2.12777f, y3 = 12.7246f)
                curveTo(x1 = 2.27017f, y1 = 12.9007f, x2 = 2.48449f, y2 = 13.003f, x3 = 2.71094f, y3 = 13.003f)
                horizontalLineTo(x = 21.2904f)
                curveTo(x1 = 21.5169f, y1 = 13.003f, x2 = 21.7312f, y2 = 12.9007f, x3 = 21.8736f, y3 = 12.7246f)
                curveTo(x1 = 22.016f, y1 = 12.5486f, x2 = 22.0712f, y2 = 12.3176f, x3 = 22.0239f, y3 = 12.0961f)
                curveTo(x1 = 21.0847f, y1 = 7.70638f, x2 = 17.3361f, y2 = 4.35825f, x3 = 12.75f, y3 = 4.02697f)
                verticalLineTo(y = 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.7501f, y = 15.25f)
                curveTo(x1 = 12.7501f, y1 = 14.8358f, x2 = 12.4144f, y2 = 14.5f, x3 = 12.0001f, y3 = 14.5f)
                curveTo(x1 = 11.5859f, y1 = 14.5f, x2 = 11.2501f, y2 = 14.8358f, x3 = 11.2501f, y3 = 15.25f)
                verticalLineTo(y = 19.3267f)
                curveTo(x1 = 11.2501f, y1 = 19.9747f, x2 = 10.7248f, y2 = 20.5f, x3 = 10.0769f, y3 = 20.5f)
                curveTo(x1 = 9.51758f, y1 = 20.5f, x2 = 9.03605f, y2 = 20.1052f, x3 = 8.92636f, y3 = 19.5568f)
                lineTo(x = 8.73558f, y = 18.6029f)
                curveTo(x1 = 8.65435f, y1 = 18.1967f, x2 = 8.25923f, y2 = 17.9333f, x3 = 7.85306f, y3 = 18.0146f)
                curveTo(x1 = 7.44689f, y1 = 18.0958f, x2 = 7.18348f, y2 = 18.4909f, x3 = 7.26471f, y3 = 18.8971f)
                lineTo(x = 7.45549f, y = 19.851f)
                curveTo(x1 = 7.7054f, y1 = 21.1005f, x2 = 8.80256f, y2 = 22.0f, x3 = 10.0769f, y3 = 22.0f)
                curveTo(x1 = 11.5533f, y1 = 22.0f, x2 = 12.7501f, y2 = 20.8031f, x3 = 12.7501f, y3 = 19.3267f)
                verticalLineTo(y = 15.25f)
                close()
            }
        }.build().also { _umbrellaSecurity = it }
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
                imageVector = UmbrellaSecurity,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _umbrellaSecurity: ImageVector? = null
