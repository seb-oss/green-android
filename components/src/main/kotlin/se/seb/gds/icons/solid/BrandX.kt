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

val BrandX: ImageVector
    get() {
        val current = _brandX
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BrandX",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.4033f, y = 3.5f)
                horizontalLineTo(x = 20.2852f)
                lineTo(x = 13.989f, y = 10.701f)
                lineTo(x = 21.396f, y = 20.5f)
                horizontalLineTo(x = 15.5964f)
                lineTo(x = 11.054f, y = 14.557f)
                lineTo(x = 5.85637f, y = 20.5f)
                horizontalLineTo(x = 2.97269f)
                lineTo(x = 9.70709f, y = 12.7977f)
                lineTo(x = 2.60156f, y = 3.5f)
                horizontalLineTo(x = 8.54839f)
                lineTo(x = 12.6544f, y = 8.93215f)
                lineTo(x = 17.4033f, y = 3.5f)
                close()
                moveTo(x = 16.3918f, y = 18.7738f)
                horizontalLineTo(x = 17.9887f)
                lineTo(x = 7.68067f, y = 5.13549f)
                horizontalLineTo(x = 5.96702f)
                lineTo(x = 16.3918f, y = 18.7738f)
                close()
            }
        }.build().also { _brandX = it }
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
                imageVector = BrandX,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brandX: ImageVector? = null
