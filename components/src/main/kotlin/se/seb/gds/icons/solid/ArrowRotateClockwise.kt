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

val ArrowRotateClockwise: ImageVector
    get() {
        val current = _arrowRotateClockwise
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowRotateClockwise",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.47852f, y = 12.0f)
                    curveTo(
                        x1 = 4.47852f,
                        y1 = 7.85786f,
                        x2 = 7.83638f,
                        y2 = 4.5f,
                        x3 = 11.9785f,
                        y3 = 4.5f,
                    )
                    curveTo(
                        x1 = 13.4412f,
                        y1 = 4.5f,
                        x2 = 14.601f,
                        y2 = 4.85088f,
                        x3 = 15.634f,
                        y3 = 5.4849f,
                    )
                    curveTo(
                        x1 = 16.3541f,
                        y1 = 5.92693f,
                        x2 = 17.0281f,
                        y2 = 6.51595f,
                        x3 = 17.7063f,
                        y3 = 7.25f,
                    )
                    horizontalLineTo(x = 15.25f)
                    curveTo(
                        x1 = 14.8358f,
                        y1 = 7.25f,
                        x2 = 14.5f,
                        y2 = 7.58579f,
                        x3 = 14.5f,
                        y3 = 8.0f,
                    )
                    curveTo(
                        x1 = 14.5f,
                        y1 = 8.41421f,
                        x2 = 14.8358f,
                        y2 = 8.75f,
                        x3 = 15.25f,
                        y3 = 8.75f,
                    )
                    horizontalLineTo(x = 19.25f)
                    curveTo(
                        x1 = 19.6642f,
                        y1 = 8.75f,
                        x2 = 20.0f,
                        y2 = 8.41421f,
                        x3 = 20.0f,
                        y3 = 8.0f,
                    )
                    verticalLineTo(y = 4.0f)
                    curveTo(
                        x1 = 20.0f,
                        y1 = 3.58579f,
                        x2 = 19.6642f,
                        y2 = 3.25f,
                        x3 = 19.25f,
                        y3 = 3.25f,
                    )
                    curveTo(
                        x1 = 18.8358f,
                        y1 = 3.25f,
                        x2 = 18.5f,
                        y2 = 3.58579f,
                        x3 = 18.5f,
                        y3 = 4.0f,
                    )
                    verticalLineTo(y = 5.90758f)
                    curveTo(
                        x1 = 17.8486f,
                        y1 = 5.24074f,
                        x2 = 17.166f,
                        y2 = 4.66521f,
                        x3 = 16.4186f,
                        y3 = 4.20651f,
                    )
                    curveTo(
                        x1 = 15.1414f,
                        y1 = 3.42256f,
                        x2 = 13.7085f,
                        y2 = 3.0f,
                        x3 = 11.9785f,
                        y3 = 3.0f,
                    )
                    curveTo(
                        x1 = 7.00795f,
                        y1 = 3.0f,
                        x2 = 2.97852f,
                        y2 = 7.02944f,
                        x3 = 2.97852f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 2.97852f,
                        y1 = 16.9706f,
                        x2 = 7.00795f,
                        y2 = 21.0f,
                        x3 = 11.9785f,
                        y3 = 21.0f,
                    )
                    curveTo(
                        x1 = 15.8983f,
                        y1 = 21.0f,
                        x2 = 19.2311f,
                        y2 = 18.4945f,
                        x3 = 20.4662f,
                        y3 = 14.9999f,
                    )
                    curveTo(
                        x1 = 20.6042f,
                        y1 = 14.6094f,
                        x2 = 20.3995f,
                        y2 = 14.1809f,
                        x3 = 20.009f,
                        y3 = 14.0429f,
                    )
                    curveTo(
                        x1 = 19.6185f,
                        y1 = 13.9048f,
                        x2 = 19.19f,
                        y2 = 14.1095f,
                        x3 = 19.0519f,
                        y3 = 14.5001f,
                    )
                    curveTo(
                        x1 = 18.022f,
                        y1 = 17.4141f,
                        x2 = 15.2429f,
                        y2 = 19.5f,
                        x3 = 11.9785f,
                        y3 = 19.5f,
                    )
                    curveTo(
                        x1 = 7.83638f,
                        y1 = 19.5f,
                        x2 = 4.47852f,
                        y2 = 16.1421f,
                        x3 = 4.47852f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _arrowRotateClockwise = it }
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
                imageVector = ArrowRotateClockwise,
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
private var _arrowRotateClockwise: ImageVector? = null
