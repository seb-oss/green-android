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

val CircleQuestionmark: ImageVector
    get() {
        val current = _circleQuestionmark
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CircleQuestionmark",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 12.0f, y = 2.0f)
                    curveTo(
                        x1 = 6.47715f,
                        y1 = 2.0f,
                        x2 = 2.0f,
                        y2 = 6.47715f,
                        x3 = 2.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 2.0f,
                        y1 = 17.5228f,
                        x2 = 6.47715f,
                        y2 = 22.0f,
                        x3 = 12.0f,
                        y3 = 22.0f,
                    )
                    curveTo(
                        x1 = 17.5228f,
                        y1 = 22.0f,
                        x2 = 22.0f,
                        y2 = 17.5228f,
                        x3 = 22.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 6.47715f,
                        x2 = 17.5228f,
                        y2 = 2.0f,
                        x3 = 12.0f,
                        y3 = 2.0f,
                    )
                    close()
                    moveTo(x = 9.0f, y = 7.75f)
                    curveTo(
                        x1 = 9.0f,
                        y1 = 7.33579f,
                        x2 = 9.33579f,
                        y2 = 7.0f,
                        x3 = 9.75f,
                        y3 = 7.0f,
                    )
                    horizontalLineTo(x = 14.25f)
                    curveTo(
                        x1 = 14.6642f,
                        y1 = 7.0f,
                        x2 = 15.0f,
                        y2 = 7.33579f,
                        x3 = 15.0f,
                        y3 = 7.75f,
                    )
                    verticalLineTo(y = 10.5f)
                    curveTo(
                        x1 = 15.0f,
                        y1 = 10.7508f,
                        x2 = 14.8747f,
                        y2 = 10.9849f,
                        x3 = 14.666f,
                        y3 = 11.124f,
                    )
                    lineTo(x = 12.75f, y = 12.4014f)
                    verticalLineTo(y = 13.25f)
                    curveTo(
                        x1 = 12.75f,
                        y1 = 13.6642f,
                        x2 = 12.4142f,
                        y2 = 14.0f,
                        x3 = 12.0f,
                        y3 = 14.0f,
                    )
                    curveTo(
                        x1 = 11.5858f,
                        y1 = 14.0f,
                        x2 = 11.25f,
                        y2 = 13.6642f,
                        x3 = 11.25f,
                        y3 = 13.25f,
                    )
                    verticalLineTo(y = 12.0f)
                    curveTo(
                        x1 = 11.25f,
                        y1 = 11.7492f,
                        x2 = 11.3753f,
                        y2 = 11.5151f,
                        x3 = 11.584f,
                        y3 = 11.376f,
                    )
                    lineTo(x = 13.5f, y = 10.0986f)
                    verticalLineTo(y = 8.5f)
                    horizontalLineTo(x = 10.5f)
                    verticalLineTo(y = 9.25f)
                    curveTo(
                        x1 = 10.5f,
                        y1 = 9.66421f,
                        x2 = 10.1642f,
                        y2 = 10.0f,
                        x3 = 9.75f,
                        y3 = 10.0f,
                    )
                    curveTo(
                        x1 = 9.33579f,
                        y1 = 10.0f,
                        x2 = 9.0f,
                        y2 = 9.66421f,
                        x3 = 9.0f,
                        y3 = 9.25f,
                    )
                    verticalLineTo(y = 7.75f)
                    close()
                    moveTo(x = 12.0f, y = 15.0f)
                    curveTo(
                        x1 = 11.4477f,
                        y1 = 15.0f,
                        x2 = 11.0f,
                        y2 = 15.4477f,
                        x3 = 11.0f,
                        y3 = 16.0f,
                    )
                    curveTo(
                        x1 = 11.0f,
                        y1 = 16.5523f,
                        x2 = 11.4477f,
                        y2 = 17.0f,
                        x3 = 12.0f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 12.5523f,
                        y1 = 17.0f,
                        x2 = 13.0f,
                        y2 = 16.5523f,
                        x3 = 13.0f,
                        y3 = 16.0f,
                    )
                    curveTo(
                        x1 = 13.0f,
                        y1 = 15.4477f,
                        x2 = 12.5523f,
                        y2 = 15.0f,
                        x3 = 12.0f,
                        y3 = 15.0f,
                    )
                    close()
                }
            }.build()
            .also { _circleQuestionmark = it }
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
                imageVector = CircleQuestionmark,
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
private var _circleQuestionmark: ImageVector? = null
