package se.seb.gds.icons.regular

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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val ThumbsDown: ImageVector
    get() {
        val current = _thumbsDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ThumbsDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.2521f, y = 13.25f)
                horizontalLineTo(x = 21.25f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 17.2521f)
                moveTo(x = 17.2521f, y = 3.75f)
                verticalLineTo(y = 13.0f)
                lineTo(x = 13.0043f, y = 21.25f)
                horizontalLineTo(x = 12.389f)
                curveTo(x1 = 11.1622f, y1 = 21.25f, x2 = 10.2249f, y2 = 20.1546f, x3 = 10.4139f, y3 = 18.9419f)
                lineTo(x = 10.9892f, y = 15.25f)
                horizontalLineTo(x = 5.74908f)
                curveTo(x1 = 3.91335f, y1 = 15.25f, x2 = 2.50859f, y2 = 13.6144f, x3 = 2.78476f, y3 = 11.7987f)
                lineTo(x = 3.62128f, y = 6.29867f)
                curveTo(x1 = 3.84421f, y1 = 4.83298f, x2 = 5.1038f, y2 = 3.75f, x3 = 6.5856f, y3 = 3.75f)
                horizontalLineTo(x = 17.2521f)
                close()
            }
        }.build().also { _thumbsDown = it }
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
                imageVector = ThumbsDown,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _thumbsDown: ImageVector? = null
