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

internal val Lightning: ImageVector
    get() {
        val current = _lightning
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Lightning",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 8.75f, y = 2.0f)
                curveTo(x1 = 8.46592f, y1 = 2.0f, x2 = 8.20622f, y2 = 2.1605f, x3 = 8.07918f, y3 = 2.41459f)
                lineTo(x = 3.07918f, y = 12.4146f)
                curveTo(x1 = 2.96293f, y1 = 12.6471f, x2 = 2.97536f, y2 = 12.9232f, x3 = 3.11201f, y3 = 13.1443f)
                curveTo(x1 = 3.24867f, y1 = 13.3654f, x2 = 3.49007f, y2 = 13.5f, x3 = 3.75f, y3 = 13.5f)
                horizontalLineTo(x = 7.93406f)
                lineTo(x = 6.02284f, y = 21.0663f)
                curveTo(x1 = 5.94205f, y1 = 21.3862f, x2 = 6.07973f, y2 = 21.7212f, x3 = 6.36205f, y3 = 21.8919f)
                curveTo(x1 = 6.64437f, y1 = 22.0625f, x2 = 7.00504f, y2 = 22.0286f, x3 = 7.25066f, y3 = 21.8084f)
                lineTo(x = 21.7507f, y = 8.80843f)
                curveTo(x1 = 21.9821f, y1 = 8.60095f, x2 = 22.0615f, y2 = 8.27225f, x3 = 21.9505f, y3 = 7.98197f)
                curveTo(x1 = 21.8394f, y1 = 7.69169f, x2 = 21.5608f, y2 = 7.5f, x3 = 21.25f, y3 = 7.5f)
                horizontalLineTo(x = 16.4635f)
                lineTo(x = 18.6708f, y = 3.08541f)
                curveTo(x1 = 18.7871f, y1 = 2.85292f, x2 = 18.7746f, y2 = 2.57681f, x3 = 18.638f, y3 = 2.3557f)
                curveTo(x1 = 18.5013f, y1 = 2.13459f, x2 = 18.2599f, y2 = 2.0f, x3 = 18.0f, y3 = 2.0f)
                horizontalLineTo(x = 8.75f)
                close()
            }
        }.build().also { _lightning = it }
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
                imageVector = Lightning,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lightning: ImageVector? = null
