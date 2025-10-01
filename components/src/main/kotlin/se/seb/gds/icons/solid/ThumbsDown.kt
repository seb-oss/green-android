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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val ThumbsDown: ImageVector
    get() {
        val current = _thumbsDown
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ThumbsDown",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 18.0021f, y = 4.5f)
                    verticalLineTo(y = 12.5f)
                    horizontalLineTo(x = 20.5f)
                    verticalLineTo(y = 4.5f)
                    horizontalLineTo(x = 18.0021f)
                    close()
                    moveTo(x = 17.5808f, y = 14.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(
                        x1 = 21.6642f,
                        y1 = 14.0f,
                        x2 = 22.0f,
                        y2 = 13.6642f,
                        x3 = 22.0f,
                        y3 = 13.25f,
                    )
                    verticalLineTo(y = 3.75f)
                    curveTo(
                        x1 = 22.0f,
                        y1 = 3.33579f,
                        x2 = 21.6642f,
                        y2 = 3.0f,
                        x3 = 21.25f,
                        y3 = 3.0f,
                    )
                    horizontalLineTo(x = 6.58563f)
                    curveTo(
                        x1 = 4.73288f,
                        y1 = 3.0f,
                        x2 = 3.15846f,
                        y2 = 4.35403f,
                        x3 = 2.87984f,
                        y3 = 6.1859f,
                    )
                    lineTo(x = 2.04331f, y = 11.6859f)
                    curveTo(
                        x1 = 1.69817f,
                        y1 = 13.9552f,
                        x2 = 3.45378f,
                        y2 = 16.0f,
                        x3 = 5.74911f,
                        y3 = 16.0f,
                    )
                    horizontalLineTo(x = 10.1133f)
                    lineTo(x = 9.67283f, y = 18.8264f)
                    curveTo(
                        x1 = 9.41305f,
                        y1 = 20.4935f,
                        x2 = 10.7015f,
                        y2 = 22.0f,
                        x3 = 12.389f,
                        y3 = 22.0f,
                    )
                    horizontalLineTo(x = 13.0043f)
                    curveTo(
                        x1 = 13.2852f,
                        y1 = 22.0f,
                        x2 = 13.5425f,
                        y2 = 21.8431f,
                        x3 = 13.6711f,
                        y3 = 21.5933f,
                    )
                    lineTo(x = 17.5808f, y = 14.0f)
                    close()
                }
            }.build()
            .also { _thumbsDown = it }
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
                modifier =
                Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _thumbsDown: ImageVector? = null
