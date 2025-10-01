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

val Pinch: ImageVector
    get() {
        val current = _pinch
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Pinch",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 11.3869f, y = 8.21721f)
                    lineTo(x = 16.2667f, y = 5.29567f)
                    curveTo(
                        x1 = 17.8838f,
                        y1 = 4.32756f,
                        x2 = 19.9515f,
                        y2 = 4.90208f,
                        x3 = 20.8851f,
                        y3 = 6.5789f,
                    )
                    lineTo(x = 21.9158f, y = 8.43017f)
                    curveTo(
                        x1 = 24.1473f,
                        y1 = 12.4382f,
                        x2 = 22.823f,
                        y2 = 17.5633f,
                        x3 = 18.9579f,
                        y3 = 19.8773f,
                    )
                    curveTo(
                        x1 = 16.3595f,
                        y1 = 21.4329f,
                        x2 = 13.1439f,
                        y2 = 21.3677f,
                        x3 = 10.6061f,
                        y3 = 19.7079f,
                    )
                    lineTo(x = 5.03468f, y = 16.0638f)
                    curveTo(
                        x1 = 4.70855f,
                        y1 = 15.8505f,
                        x2 = 4.53605f,
                        y2 = 15.4672f,
                        x3 = 4.59267f,
                        y3 = 15.0816f,
                    )
                    lineTo(x = 4.70368f, y = 14.3258f)
                    curveTo(
                        x1 = 4.89111f,
                        y1 = 13.0497f,
                        x2 = 6.04065f,
                        y2 = 12.1728f,
                        x3 = 7.27126f,
                        y3 = 12.3671f,
                    )
                    lineTo(x = 8.60993f, y = 12.5785f)
                    lineTo(x = 5.22907f, y = 6.50624f)
                    curveTo(
                        x1 = 4.60667f,
                        y1 = 5.38836f,
                        x2 = 4.97603f,
                        y2 = 3.95893f,
                        x3 = 6.05405f,
                        y3 = 3.31352f,
                    )
                    curveTo(
                        x1 = 7.13208f,
                        y1 = 2.66811f,
                        x2 = 8.51055f,
                        y2 = 3.05113f,
                        x3 = 9.13295f,
                        y3 = 4.16901f,
                    )
                    lineTo(x = 11.3869f, y = 8.21721f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.53151f, y = 6.91709f)
                    curveTo(
                        x1 = 2.91816f,
                        y1 = 7.06566f,
                        x2 = 3.11117f,
                        y2 = 7.49955f,
                        x3 = 2.9626f,
                        y3 = 7.8862f,
                    )
                    curveTo(
                        x1 = 2.3458f,
                        y1 = 9.49139f,
                        x2 = 2.3458f,
                        y2 = 10.8992f,
                        x3 = 2.9626f,
                        y3 = 12.5044f,
                    )
                    curveTo(
                        x1 = 3.11117f,
                        y1 = 12.8911f,
                        x2 = 2.91816f,
                        y2 = 13.325f,
                        x3 = 2.53151f,
                        y3 = 13.4735f,
                    )
                    curveTo(
                        x1 = 2.14486f,
                        y1 = 13.6221f,
                        x2 = 1.71098f,
                        y2 = 13.4291f,
                        x3 = 1.5624f,
                        y3 = 13.0424f,
                    )
                    curveTo(
                        x1 = 0.812532f,
                        y1 = 11.0909f,
                        x2 = 0.812532f,
                        y2 = 9.29971f,
                        x3 = 1.5624f,
                        y3 = 7.34818f,
                    )
                    curveTo(
                        x1 = 1.71098f,
                        y1 = 6.96152f,
                        x2 = 2.14486f,
                        y2 = 6.76852f,
                        x3 = 2.53151f,
                        y3 = 6.91709f,
                    )
                    close()
                }
            }.build()
            .also { _pinch = it }
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
                imageVector = Pinch,
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
private var _pinch: ImageVector? = null
