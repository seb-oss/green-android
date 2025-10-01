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

val ThumbsUp: ImageVector
    get() {
        val current = _thumbsUp
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ThumbsUp",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 11.0f, y = 2.0f)
                    curveTo(
                        x1 = 10.7192f,
                        y1 = 2.0f,
                        x2 = 10.4619f,
                        y2 = 2.15688f,
                        x3 = 10.3333f,
                        y3 = 2.40653f,
                    )
                    lineTo(x = 6.42148f, y = 10.0f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(
                        x1 = 2.33579f,
                        y1 = 10.0f,
                        x2 = 2.0f,
                        y2 = 10.3358f,
                        x3 = 2.0f,
                        y3 = 10.75f,
                    )
                    verticalLineTo(y = 20.25f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 20.6642f,
                        x2 = 2.33579f,
                        y2 = 21.0f,
                        x3 = 2.75f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 17.422f)
                    curveTo(
                        x1 = 19.2752f,
                        y1 = 21.0f,
                        x2 = 20.8505f,
                        y2 = 19.6463f,
                        x3 = 21.1293f,
                        y3 = 17.8142f,
                    )
                    lineTo(x = 21.9663f, y = 12.3142f)
                    curveTo(
                        x1 = 22.3117f,
                        y1 = 10.0444f,
                        x2 = 20.5548f,
                        y2 = 8.0f,
                        x3 = 18.2589f,
                        y3 = 8.0f,
                    )
                    horizontalLineTo(x = 13.8921f)
                    lineTo(x = 14.3328f, y = 5.17364f)
                    curveTo(
                        x1 = 14.5928f,
                        y1 = 3.50611f,
                        x2 = 13.3033f,
                        y2 = 2.0f,
                        x3 = 11.6156f,
                        y3 = 2.0f,
                    )
                    horizontalLineTo(x = 11.0f)
                    close()
                    moveTo(x = 6.0f, y = 11.5f)
                    verticalLineTo(y = 19.5f)
                    horizontalLineTo(x = 3.5f)
                    verticalLineTo(y = 11.5f)
                    horizontalLineTo(x = 6.0f)
                    close()
                }
            }.build()
            .also { _thumbsUp = it }
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
                imageVector = ThumbsUp,
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
private var _thumbsUp: ImageVector? = null
