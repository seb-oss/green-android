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

val Jpg: ImageVector
    get() {
        val current = _jpg
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Jpg",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 13.0f, y = 3.0f)
                    horizontalLineTo(x = 4.75f)
                    curveTo(
                        x1 = 4.33579f,
                        y1 = 3.0f,
                        x2 = 4.0f,
                        y2 = 3.33579f,
                        x3 = 4.0f,
                        y3 = 3.75f,
                    )
                    verticalLineTo(y = 12.0f)
                    horizontalLineTo(x = 20.0f)
                    verticalLineTo(y = 10.0f)
                    horizontalLineTo(x = 13.75f)
                    curveTo(
                        x1 = 13.3358f,
                        y1 = 10.0f,
                        x2 = 13.0f,
                        y2 = 9.66421f,
                        x3 = 13.0f,
                        y3 = 9.25f,
                    )
                    verticalLineTo(y = 3.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 20.0f, y = 8.5f)
                    verticalLineTo(y = 8.0f)
                    curveTo(
                        x1 = 20.0f,
                        y1 = 7.80109f,
                        x2 = 19.921f,
                        y2 = 7.61032f,
                        x3 = 19.7803f,
                        y3 = 7.46967f,
                    )
                    lineTo(x = 15.5303f, y = 3.21967f)
                    curveTo(
                        x1 = 15.3897f,
                        y1 = 3.07902f,
                        x2 = 15.1989f,
                        y2 = 3.0f,
                        x3 = 15.0f,
                        y3 = 3.0f,
                    )
                    horizontalLineTo(x = 14.5f)
                    verticalLineTo(y = 8.5f)
                    horizontalLineTo(x = 20.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 6.5f, y = 14.0f)
                    curveTo(
                        x1 = 6.91421f,
                        y1 = 14.0f,
                        x2 = 7.25f,
                        y2 = 14.3358f,
                        x3 = 7.25f,
                        y3 = 14.75f,
                    )
                    verticalLineTo(y = 18.75f)
                    curveTo(
                        x1 = 7.25f,
                        y1 = 19.9926f,
                        x2 = 6.24264f,
                        y2 = 21.0f,
                        x3 = 5.0f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 4.5f)
                    curveTo(
                        x1 = 4.08579f,
                        y1 = 21.0f,
                        x2 = 3.75f,
                        y2 = 20.6642f,
                        x3 = 3.75f,
                        y3 = 20.25f,
                    )
                    curveTo(
                        x1 = 3.75f,
                        y1 = 19.8358f,
                        x2 = 4.08579f,
                        y2 = 19.5f,
                        x3 = 4.5f,
                        y3 = 19.5f,
                    )
                    horizontalLineTo(x = 5.0f)
                    curveTo(
                        x1 = 5.41421f,
                        y1 = 19.5f,
                        x2 = 5.75f,
                        y2 = 19.1642f,
                        x3 = 5.75f,
                        y3 = 18.75f,
                    )
                    verticalLineTo(y = 14.75f)
                    curveTo(
                        x1 = 5.75f,
                        y1 = 14.3358f,
                        x2 = 6.08579f,
                        y2 = 14.0f,
                        x3 = 6.5f,
                        y3 = 14.0f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 8.75f, y = 14.75f)
                    curveTo(
                        x1 = 8.75f,
                        y1 = 14.3358f,
                        x2 = 9.08579f,
                        y2 = 14.0f,
                        x3 = 9.5f,
                        y3 = 14.0f,
                    )
                    horizontalLineTo(x = 11.25f)
                    curveTo(
                        x1 = 12.4926f,
                        y1 = 14.0f,
                        x2 = 13.5f,
                        y2 = 15.0074f,
                        x3 = 13.5f,
                        y3 = 16.25f,
                    )
                    curveTo(
                        x1 = 13.5f,
                        y1 = 17.4926f,
                        x2 = 12.4926f,
                        y2 = 18.5f,
                        x3 = 11.25f,
                        y3 = 18.5f,
                    )
                    horizontalLineTo(x = 10.25f)
                    verticalLineTo(y = 20.25f)
                    curveTo(
                        x1 = 10.25f,
                        y1 = 20.6642f,
                        x2 = 9.91421f,
                        y2 = 21.0f,
                        x3 = 9.5f,
                        y3 = 21.0f,
                    )
                    curveTo(
                        x1 = 9.08579f,
                        y1 = 21.0f,
                        x2 = 8.75f,
                        y2 = 20.6642f,
                        x3 = 8.75f,
                        y3 = 20.25f,
                    )
                    verticalLineTo(y = 14.75f)
                    close()
                    moveTo(x = 10.25f, y = 17.0f)
                    horizontalLineTo(x = 11.25f)
                    curveTo(
                        x1 = 11.6642f,
                        y1 = 17.0f,
                        x2 = 12.0f,
                        y2 = 16.6642f,
                        x3 = 12.0f,
                        y3 = 16.25f,
                    )
                    curveTo(
                        x1 = 12.0f,
                        y1 = 15.8358f,
                        x2 = 11.6642f,
                        y2 = 15.5f,
                        x3 = 11.25f,
                        y3 = 15.5f,
                    )
                    horizontalLineTo(x = 10.25f)
                    verticalLineTo(y = 17.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 17.7537f, y = 15.524f)
                    curveTo(
                        x1 = 17.5581f,
                        y1 = 15.4756f,
                        x2 = 17.3575f,
                        y2 = 15.4641f,
                        x3 = 17.2209f,
                        y3 = 15.4725f,
                    )
                    curveTo(
                        x1 = 16.5734f,
                        y1 = 15.512f,
                        x2 = 15.75f,
                        y2 = 16.2463f,
                        x3 = 15.75f,
                        y3 = 17.5494f,
                    )
                    curveTo(
                        x1 = 15.75f,
                        y1 = 18.8354f,
                        x2 = 16.4961f,
                        y2 = 19.5275f,
                        x3 = 17.3256f,
                        y3 = 19.53f,
                    )
                    curveTo(
                        x1 = 17.784f,
                        y1 = 19.5237f,
                        x2 = 18.2137f,
                        y2 = 19.4123f,
                        x3 = 18.5f,
                        y3 = 19.2287f,
                    )
                    verticalLineTo(y = 18.5761f)
                    horizontalLineTo(x = 18.1561f)
                    curveTo(
                        x1 = 17.7419f,
                        y1 = 18.5761f,
                        x2 = 17.4061f,
                        y2 = 18.2403f,
                        x3 = 17.4061f,
                        y3 = 17.8261f,
                    )
                    curveTo(
                        x1 = 17.4061f,
                        y1 = 17.4119f,
                        x2 = 17.7419f,
                        y2 = 17.0761f,
                        x3 = 18.1561f,
                        y3 = 17.0761f,
                    )
                    horizontalLineTo(x = 19.25f)
                    curveTo(
                        x1 = 19.6642f,
                        y1 = 17.0761f,
                        x2 = 20.0f,
                        y2 = 17.4119f,
                        x3 = 20.0f,
                        y3 = 17.8261f,
                    )
                    verticalLineTo(y = 19.573f)
                    curveTo(
                        x1 = 20.0f,
                        y1 = 19.7606f,
                        x2 = 19.9297f,
                        y2 = 19.9414f,
                        x3 = 19.803f,
                        y3 = 20.0797f,
                    )
                    curveTo(
                        x1 = 19.1385f,
                        y1 = 20.8051f,
                        x2 = 18.0966f,
                        y2 = 21.0207f,
                        x3 = 17.3391f,
                        y3 = 21.0299f,
                    )
                    lineTo(x = 17.3299f, y = 21.03f)
                    curveTo(
                        x1 = 15.4566f,
                        y1 = 21.03f,
                        x2 = 14.25f,
                        y2 = 19.4349f,
                        x3 = 14.25f,
                        y3 = 17.5494f,
                    )
                    curveTo(
                        x1 = 14.25f,
                        y1 = 15.6788f,
                        x2 = 15.4836f,
                        y2 = 14.0758f,
                        x3 = 17.1294f,
                        y3 = 13.9752f,
                    )
                    curveTo(
                        x1 = 17.4074f,
                        y1 = 13.9583f,
                        x2 = 17.7611f,
                        y2 = 13.9806f,
                        x3 = 18.114f,
                        y3 = 14.0679f,
                    )
                    curveTo(
                        x1 = 18.4605f,
                        y1 = 14.1537f,
                        x2 = 18.8732f,
                        y2 = 14.3188f,
                        x3 = 19.1993f,
                        y3 = 14.6375f,
                    )
                    curveTo(
                        x1 = 19.4955f,
                        y1 = 14.9271f,
                        x2 = 19.501f,
                        y2 = 15.4019f,
                        x3 = 19.2115f,
                        y3 = 15.6981f,
                    )
                    curveTo(
                        x1 = 18.9219f,
                        y1 = 15.9944f,
                        x2 = 18.4471f,
                        y2 = 15.9998f,
                        x3 = 18.1509f,
                        y3 = 15.7103f,
                    )
                    curveTo(
                        x1 = 18.0857f,
                        y1 = 15.6466f,
                        x2 = 17.9557f,
                        y2 = 15.574f,
                        x3 = 17.7537f,
                        y3 = 15.524f,
                    )
                    close()
                }
            }.build()
            .also { _jpg = it }
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
                imageVector = Jpg,
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
private var _jpg: ImageVector? = null
