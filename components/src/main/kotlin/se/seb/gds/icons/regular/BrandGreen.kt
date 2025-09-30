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
                    moveTo(x = 20.7999f, y = 7.0f)
                    curveTo(x1 = 17.0999f, y1 = 7.0f, x2 = 13.8999f, y2 = 9.1f, x3 = 12.1999f, y3 = 12.2f)
                    curveTo(x1 = 11.9999f, y1 = 10.2f, x2 = 11.1999f, y2 = 8.4f, x3 = 10.0999f, y3 = 6.8f)
                    curveTo(x1 = 8.69995f, y1 = 4.7f, x2 = 6.59995f, y2 = 3.1f, x3 = 4.29995f, y3 = 2.2f)
                    lineTo(x = 3.69995f, y = 2.0f)
                    lineTo(x = 3.49995f, y = 2.5f)
                    curveTo(x1 = 2.59995f, y1 = 3.9f, x2 = 2.09995f, y2 = 5.5f, x3 = 1.99995f, y3 = 7.2f)
                    curveTo(x1 = 1.89995f, y1 = 8.9f, x2 = 2.29995f, y2 = 10.5f, x3 = 2.99995f, y3 = 12.1f)
                    curveTo(x1 = 3.69995f, y1 = 13.6f, x2 = 4.79995f, y2 = 14.9f, x3 = 6.19995f, y3 = 15.8f)
                    curveTo(x1 = 7.49995f, y1 = 16.8f, x2 = 9.09995f, y2 = 17.4f, x3 = 10.6999f, y3 = 17.5f)
                    curveTo(x1 = 10.3999f, y1 = 19.0f, x2 = 9.99995f, y2 = 21.0f, x3 = 9.99995f, y3 = 21.0f)
                    verticalLineTo(y = 21.1f)
                    curveTo(x1 = 9.99995f, y1 = 21.2f, x2 = 9.99995f, y2 = 21.2f, x3 = 10.0999f, y3 = 21.3f)
                    curveTo(x1 = 10.0999f, y1 = 21.3f, x2 = 10.0999f, y2 = 21.4f, x3 = 10.1999f, y3 = 21.4f)
                    curveTo(x1 = 10.2999f, y1 = 21.4f, x2 = 10.2999f, y2 = 21.4f, x3 = 10.3999f, y3 = 21.4f)
                    horizontalLineTo(x = 11.4999f)
                    curveTo(x1 = 11.5999f, y1 = 21.4f, x2 = 11.6999f, y2 = 21.4f, x3 = 11.7999f, y3 = 21.4f)
                    curveTo(x1 = 11.8999f, y1 = 21.3f, x2 = 11.8999f, y2 = 21.2f, x3 = 11.8999f, y3 = 21.1f)
                    curveTo(x1 = 11.8999f, y1 = 21.1f, x2 = 12.0999f, y2 = 18.8f, x3 = 12.1999f, y3 = 17.6f)
                    curveTo(x1 = 17.2999f, y1 = 17.3f, x2 = 21.3999f, y2 = 13.0f, x3 = 21.3999f, y3 = 7.7f)
                    verticalLineTo(y = 7.0f)
                    horizontalLineTo(x = 20.7999f)
                    close()
                    moveTo(x = 3.29995f, y = 7.7f)
                    curveTo(x1 = 3.29995f, y1 = 6.3f, x2 = 3.69995f, y2 = 4.9f, x3 = 4.29995f, y3 = 3.7f)
                    curveTo(x1 = 8.39995f, y1 = 5.5f, x2 = 11.0999f, y2 = 9.6f, x3 = 11.0999f, y3 = 14.1f)
                    curveTo(x1 = 11.0999f, y1 = 14.8f, x2 = 10.9999f, y2 = 15.5f, x3 = 10.8999f, y3 = 16.2f)
                    curveTo(x1 = 8.79995f, y1 = 16.0f, x2 = 6.89995f, y2 = 15.0f, x3 = 5.49995f, y3 = 13.4f)
                    curveTo(x1 = 4.09995f, y1 = 11.9f, x2 = 3.29995f, y2 = 9.8f, x3 = 3.29995f, y3 = 7.7f)
                    close()
                    moveTo(x = 12.3999f, y = 16.2f)
                    curveTo(x1 = 12.6999f, y1 = 12.1f, x2 = 15.9999f, y2 = 8.7f, x3 = 20.0999f, y3 = 8.4f)
                    curveTo(x1 = 19.7999f, y1 = 12.6f, x2 = 16.4999f, y2 = 15.9f, x3 = 12.3999f, y3 = 16.2f)
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
