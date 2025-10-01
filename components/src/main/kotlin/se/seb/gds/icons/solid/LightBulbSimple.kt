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

val LightBulbSimple: ImageVector
    get() {
        val current = _lightBulbSimple
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.LightBulbSimple",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 3.99823f, y = 10.0009f)
                    curveTo(
                        x1 = 3.99823f,
                        y1 = 5.58212f,
                        x2 = 7.58035f,
                        y2 = 2.0f,
                        x3 = 11.9991f,
                        y3 = 2.0f,
                    )
                    curveTo(
                        x1 = 16.4179f,
                        y1 = 2.0f,
                        x2 = 20.0f,
                        y2 = 5.58212f,
                        x3 = 20.0f,
                        y3 = 10.0009f,
                    )
                    curveTo(
                        x1 = 20.0f,
                        y1 = 12.5861f,
                        x2 = 18.7731f,
                        y2 = 14.885f,
                        x3 = 16.8729f,
                        y3 = 16.3465f,
                    )
                    curveTo(
                        x1 = 16.5959f,
                        y1 = 16.5595f,
                        x2 = 16.3045f,
                        y2 = 16.7549f,
                        x3 = 16.0003f,
                        y3 = 16.9308f,
                    )
                    verticalLineTo(y = 17.0f)
                    horizontalLineTo(x = 7.99793f)
                    verticalLineTo(y = 16.9308f)
                    curveTo(
                        x1 = 7.69377f,
                        y1 = 16.7549f,
                        x2 = 7.40234f,
                        y2 = 16.5595f,
                        x3 = 7.12534f,
                        y3 = 16.3465f,
                    )
                    curveTo(
                        x1 = 5.22513f,
                        y1 = 14.885f,
                        x2 = 3.99823f,
                        y2 = 12.5861f,
                        x3 = 3.99823f,
                        y3 = 10.0009f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 7.99793f, y = 18.5f)
                    verticalLineTo(y = 18.9988f)
                    curveTo(
                        x1 = 7.99793f,
                        y1 = 21.2086f,
                        x2 = 9.78932f,
                        y2 = 23.0f,
                        x3 = 11.9991f,
                        y3 = 23.0f,
                    )
                    curveTo(
                        x1 = 14.2089f,
                        y1 = 23.0f,
                        x2 = 16.0003f,
                        y2 = 21.2086f,
                        x3 = 16.0003f,
                        y3 = 18.9988f,
                    )
                    verticalLineTo(y = 18.5f)
                    horizontalLineTo(x = 7.99793f)
                    close()
                }
            }.build()
            .also { _lightBulbSimple = it }
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
                imageVector = LightBulbSimple,
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
private var _lightBulbSimple: ImageVector? = null
