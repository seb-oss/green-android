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

val Tennis: ImageVector
    get() {
        val current = _tennis
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Tennis",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 2.0f, y = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 9.28189f, x2 = 3.08445f, y2 = 6.81707f, x3 = 4.84428f, y3 = 5.0146f)
                    curveTo(x1 = 7.05362f, y1 = 6.54963f, x2 = 8.5f, y2 = 9.10591f, x3 = 8.5f, y3 = 12.0f)
                    curveTo(x1 = 8.5f, y1 = 14.8941f, x2 = 7.05362f, y2 = 17.4504f, x3 = 4.84428f, y3 = 18.9854f)
                    curveTo(x1 = 3.08445f, y1 = 17.1829f, x2 = 2.0f, y2 = 14.7181f, x3 = 2.0f, y3 = 12.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 10.0f, y = 12.0f)
                    curveTo(x1 = 10.0f, y1 = 8.72836f, x2 = 8.42889f, y2 = 5.82368f, x3 = 6.0f, y3 = 3.99927f)
                    curveTo(x1 = 7.67132f, y1 = 2.74389f, x2 = 9.74879f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    curveTo(x1 = 14.2512f, y1 = 2.0f, x2 = 16.3287f, y2 = 2.74389f, x3 = 18.0f, y3 = 3.99927f)
                    curveTo(x1 = 15.5711f, y1 = 5.82368f, x2 = 14.0f, y2 = 8.72837f, x3 = 14.0f, y3 = 12.0f)
                    curveTo(x1 = 14.0f, y1 = 15.2716f, x2 = 15.5711f, y2 = 18.1763f, x3 = 18.0f, y3 = 20.0007f)
                    curveTo(x1 = 16.3287f, y1 = 21.2561f, x2 = 14.2512f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    curveTo(x1 = 9.74879f, y1 = 22.0f, x2 = 7.67132f, y2 = 21.2561f, x3 = 6.0f, y3 = 20.0007f)
                    curveTo(x1 = 8.42889f, y1 = 18.1763f, x2 = 10.0f, y2 = 15.2716f, x3 = 10.0f, y3 = 12.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 19.1557f, y = 5.0146f)
                    curveTo(x1 = 20.9156f, y1 = 6.81707f, x2 = 22.0f, y2 = 9.28189f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 14.7181f, x2 = 20.9156f, y2 = 17.1829f, x3 = 19.1557f, y3 = 18.9854f)
                    curveTo(x1 = 16.9464f, y1 = 17.4504f, x2 = 15.5f, y2 = 14.8941f, x3 = 15.5f, y3 = 12.0f)
                    curveTo(x1 = 15.5f, y1 = 9.10591f, x2 = 16.9464f, y2 = 6.54963f, x3 = 19.1557f, y3 = 5.0146f)
                    close()
                }
            }.build()
            .also { _tennis = it }
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
                imageVector = Tennis,
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
private var _tennis: ImageVector? = null
