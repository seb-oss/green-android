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

val Headphones: ImageVector
    get() {
        val current = _headphones
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Headphones",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 4.5f, y = 12.0f)
                curveTo(x1 = 4.5f, y1 = 7.85786f, x2 = 7.85786f, y2 = 4.5f, x3 = 12.0f, y3 = 4.5f)
                curveTo(x1 = 16.1421f, y1 = 4.5f, x2 = 19.5f, y2 = 7.85786f, x3 = 19.5f, y3 = 12.0f)
                verticalLineTo(y = 13.0f)
                horizontalLineTo(x = 16.25f)
                curveTo(x1 = 15.8358f, y1 = 13.0f, x2 = 15.5f, y2 = 13.3358f, x3 = 15.5f, y3 = 13.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 15.5f, y1 = 20.6642f, x2 = 15.8358f, y2 = 21.0f, x3 = 16.25f, y3 = 21.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 21.0f, x2 = 21.0f, y2 = 20.6642f, x3 = 21.0f, y3 = 20.25f)
                verticalLineTo(y = 12.0f)
                curveTo(x1 = 21.0f, y1 = 7.282f, x2 = 17.3696f, y2 = 3.41192f, x3 = 12.75f, y3 = 3.03081f)
                verticalLineTo(y = 3.0f)
                horizontalLineTo(x = 12.0f)
                curveTo(x1 = 7.02944f, y1 = 3.0f, x2 = 3.0f, y2 = 7.02944f, x3 = 3.0f, y3 = 12.0f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 3.0f, y1 = 20.6642f, x2 = 3.33579f, y2 = 21.0f, x3 = 3.75f, y3 = 21.0f)
                horizontalLineTo(x = 7.75f)
                curveTo(x1 = 8.16421f, y1 = 21.0f, x2 = 8.5f, y2 = 20.6642f, x3 = 8.5f, y3 = 20.25f)
                verticalLineTo(y = 13.75f)
                curveTo(x1 = 8.5f, y1 = 13.3358f, x2 = 8.16421f, y2 = 13.0f, x3 = 7.75f, y3 = 13.0f)
                horizontalLineTo(x = 4.5f)
                verticalLineTo(y = 12.0f)
                close()
            }
        }.build().also { _headphones = it }
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
                imageVector = Headphones,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _headphones: ImageVector? = null
