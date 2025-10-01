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

val Group: ImageVector
    get() {
        val current = _group
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Group",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.5f, y = 7.0f)
                curveTo(x1 = 3.5f, y1 = 4.79086f, x2 = 5.29086f, y2 = 3.0f, x3 = 7.5f, y3 = 3.0f)
                curveTo(x1 = 9.70914f, y1 = 3.0f, x2 = 11.5f, y2 = 4.79086f, x3 = 11.5f, y3 = 7.0f)
                curveTo(x1 = 11.5f, y1 = 9.20914f, x2 = 9.70914f, y2 = 11.0f, x3 = 7.5f, y3 = 11.0f)
                curveTo(x1 = 5.29086f, y1 = 11.0f, x2 = 3.5f, y2 = 9.20914f, x3 = 3.5f, y3 = 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 7.42857f, y = 12.0f)
                curveTo(x1 = 10.943f, y1 = 12.0f, x2 = 14.2314f, y2 = 14.8926f, x3 = 14.6053f, y3 = 20.1973f)
                curveTo(x1 = 14.6199f, y1 = 20.4048f, x2 = 14.5477f, y2 = 20.6091f, x3 = 14.4058f, y3 = 20.7613f)
                curveTo(x1 = 14.2639f, y1 = 20.9136f, x2 = 14.0652f, y2 = 21.0f, x3 = 13.8571f, y3 = 21.0f)
                horizontalLineTo(x = 1.0f)
                curveTo(x1 = 0.791928f, y1 = 21.0f, x2 = 0.593206f, y2 = 20.9136f, x3 = 0.451343f, y3 = 20.7613f)
                curveTo(x1 = 0.30948f, y1 = 20.6091f, x2 = 0.237227f, y2 = 20.4048f, x3 = 0.251858f, y3 = 20.1973f)
                curveTo(x1 = 0.625789f, y1 = 14.8926f, x2 = 3.91415f, y2 = 12.0f, x3 = 7.42857f, y3 = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 16.5f, y = 3.0f)
                curveTo(x1 = 14.2909f, y1 = 3.0f, x2 = 12.5f, y2 = 4.79086f, x3 = 12.5f, y3 = 7.0f)
                curveTo(x1 = 12.5f, y1 = 9.20914f, x2 = 14.2909f, y2 = 11.0f, x3 = 16.5f, y3 = 11.0f)
                curveTo(x1 = 18.7091f, y1 = 11.0f, x2 = 20.5f, y2 = 9.20914f, x3 = 20.5f, y3 = 7.0f)
                curveTo(x1 = 20.5f, y1 = 4.79086f, x2 = 18.7091f, y2 = 3.0f, x3 = 16.5f, y3 = 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 16.1017f, y = 20.0918f)
                curveTo(x1 = 16.1237f, y1 = 20.4031f, x2 = 16.0805f, y2 = 20.7119f, x3 = 15.9786f, y3 = 21.0f)
                horizontalLineTo(x = 22.9972f)
                curveTo(x1 = 23.2053f, y1 = 21.0f, x2 = 23.404f, y2 = 20.9136f, x3 = 23.5459f, y3 = 20.7613f)
                curveTo(x1 = 23.6877f, y1 = 20.6091f, x2 = 23.76f, y2 = 20.4048f, x3 = 23.7453f, y3 = 20.1973f)
                curveTo(x1 = 23.3714f, y1 = 14.8926f, x2 = 20.083f, y2 = 12.0f, x3 = 16.5686f, y3 = 12.0f)
                curveTo(x1 = 15.3801f, y1 = 12.0f, x2 = 14.2174f, y2 = 12.3308f, x3 = 13.1846f, y3 = 12.9739f)
                curveTo(x1 = 14.7974f, y1 = 14.6363f, x2 = 15.889f, y2 = 17.0736f, x3 = 16.1017f, y3 = 20.0918f)
                close()
            }
        }.build().also { _group = it }
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
                imageVector = Group,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _group: ImageVector? = null
