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

val Flag: ImageVector
    get() {
        val current = _flag
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Flag",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 11.7975f, y = 15.8054f)
                    curveTo(
                        x1 = 9.60407f,
                        y1 = 15.1904f,
                        x2 = 7.66645f,
                        y2 = 14.6672f,
                        x3 = 5.5f,
                        y3 = 15.5659f,
                    )
                    verticalLineTo(y = 21.25f)
                    curveTo(
                        x1 = 5.5f,
                        y1 = 21.6642f,
                        x2 = 5.16421f,
                        y2 = 22.0f,
                        x3 = 4.75f,
                        y3 = 22.0f,
                    )
                    curveTo(
                        x1 = 4.33579f,
                        y1 = 22.0f,
                        x2 = 4.0f,
                        y2 = 21.6642f,
                        x3 = 4.0f,
                        y3 = 21.25f,
                    )
                    verticalLineTo(y = 3.77775f)
                    curveTo(
                        x1 = 4.0f,
                        y1 = 3.49237f,
                        x2 = 4.16195f,
                        y2 = 3.23172f,
                        x3 = 4.41781f,
                        y3 = 3.10532f,
                    )
                    curveTo(
                        x1 = 7.30137f,
                        y1 = 1.68079f,
                        x2 = 9.86003f,
                        y2 = 2.39852f,
                        x3 = 12.1345f,
                        y3 = 3.03652f,
                    )
                    lineTo(x = 12.2025f, y = 3.0556f)
                    curveTo(
                        x1 = 14.5359f,
                        y1 = 3.70992f,
                        x2 = 16.5799f,
                        y2 = 4.2603f,
                        x3 = 18.9178f,
                        y3 = 3.10532f,
                    )
                    curveTo(
                        x1 = 19.1503f,
                        y1 = 2.99048f,
                        x2 = 19.4256f,
                        y2 = 3.00386f,
                        x3 = 19.6458f,
                        y3 = 3.14071f,
                    )
                    curveTo(
                        x1 = 19.8661f,
                        y1 = 3.27755f,
                        x2 = 20.0f,
                        y2 = 3.51845f,
                        x3 = 20.0f,
                        y3 = 3.77775f,
                    )
                    verticalLineTo(y = 15.0833f)
                    curveTo(
                        x1 = 20.0f,
                        y1 = 15.3687f,
                        x2 = 19.838f,
                        y2 = 15.6293f,
                        x3 = 19.5822f,
                        y3 = 15.7557f,
                    )
                    curveTo(
                        x1 = 16.6986f,
                        y1 = 17.1803f,
                        x2 = 14.14f,
                        y2 = 16.4625f,
                        x3 = 11.8655f,
                        y3 = 15.8245f,
                    )
                    lineTo(x = 11.7975f, y = 15.8054f)
                    close()
                }
            }.build()
            .also { _flag = it }
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
                imageVector = Flag,
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
private var _flag: ImageVector? = null
