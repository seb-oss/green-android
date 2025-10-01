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

val BrandGreen: ImageVector
    get() {
        val current = _brandGreen
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BrandGreen",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 20.8f, y = 7.0f)
                    curveTo(x1 = 17.1f, y1 = 7.0f, x2 = 13.9f, y2 = 9.1f, x3 = 12.2f, y3 = 12.2f)
                    curveTo(x1 = 12.0f, y1 = 10.2f, x2 = 11.2f, y2 = 8.4f, x3 = 10.1f, y3 = 6.8f)
                    curveTo(
                        x1 = 8.70001f,
                        y1 = 4.7f,
                        x2 = 6.60001f,
                        y2 = 3.1f,
                        x3 = 4.30001f,
                        y3 = 2.2f,
                    )
                    lineTo(x = 3.70001f, y = 2.0f)
                    lineTo(x = 3.50001f, y = 2.5f)
                    curveTo(
                        x1 = 2.60001f,
                        y1 = 3.9f,
                        x2 = 2.10001f,
                        y2 = 5.5f,
                        x3 = 2.00001f,
                        y3 = 7.2f,
                    )
                    curveTo(
                        x1 = 1.90001f,
                        y1 = 8.9f,
                        x2 = 2.30001f,
                        y2 = 10.5f,
                        x3 = 3.00001f,
                        y3 = 12.1f,
                    )
                    curveTo(
                        x1 = 3.70001f,
                        y1 = 13.6f,
                        x2 = 4.80001f,
                        y2 = 14.9f,
                        x3 = 6.20001f,
                        y3 = 15.8f,
                    )
                    curveTo(
                        x1 = 7.50001f,
                        y1 = 16.8f,
                        x2 = 9.10001f,
                        y2 = 17.4f,
                        x3 = 10.7f,
                        y3 = 17.5f,
                    )
                    curveTo(x1 = 10.4f, y1 = 19.0f, x2 = 10.0f, y2 = 21.0f, x3 = 10.0f, y3 = 21.0f)
                    verticalLineTo(y = 21.1f)
                    curveTo(x1 = 10.0f, y1 = 21.2f, x2 = 10.0f, y2 = 21.2f, x3 = 10.1f, y3 = 21.3f)
                    curveTo(x1 = 10.1f, y1 = 21.3f, x2 = 10.1f, y2 = 21.4f, x3 = 10.2f, y3 = 21.4f)
                    curveTo(x1 = 10.3f, y1 = 21.4f, x2 = 10.3f, y2 = 21.4f, x3 = 10.4f, y3 = 21.4f)
                    horizontalLineTo(x = 11.5f)
                    curveTo(x1 = 11.6f, y1 = 21.4f, x2 = 11.7f, y2 = 21.4f, x3 = 11.8f, y3 = 21.4f)
                    curveTo(x1 = 11.9f, y1 = 21.3f, x2 = 11.9f, y2 = 21.2f, x3 = 11.9f, y3 = 21.1f)
                    curveTo(x1 = 11.9f, y1 = 21.1f, x2 = 12.1f, y2 = 18.8f, x3 = 12.2f, y3 = 17.6f)
                    curveTo(x1 = 17.3f, y1 = 17.3f, x2 = 21.4f, y2 = 13.0f, x3 = 21.4f, y3 = 7.7f)
                    verticalLineTo(y = 7.0f)
                    horizontalLineTo(x = 20.8f)
                    close()
                }
            }.build()
            .also { _brandGreen = it }
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
                imageVector = BrandGreen,
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
private var _brandGreen: ImageVector? = null
