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

val Unlocked: ImageVector
    get() {
        val current = _unlocked
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Unlocked",
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
                        x1 = 9.23858f,
                        y1 = 2.0f,
                        x2 = 7.0f,
                        y2 = 4.23858f,
                        x3 = 7.0f,
                        y3 = 7.0f,
                    )
                    verticalLineTo(y = 9.0f)
                    horizontalLineTo(x = 4.75f)
                    curveTo(
                        x1 = 4.33579f,
                        y1 = 9.0f,
                        x2 = 4.0f,
                        y2 = 9.33579f,
                        x3 = 4.0f,
                        y3 = 9.75f,
                    )
                    verticalLineTo(y = 21.25f)
                    curveTo(
                        x1 = 4.0f,
                        y1 = 21.6642f,
                        x2 = 4.33579f,
                        y2 = 22.0f,
                        x3 = 4.75f,
                        y3 = 22.0f,
                    )
                    horizontalLineTo(x = 19.25f)
                    curveTo(
                        x1 = 19.6642f,
                        y1 = 22.0f,
                        x2 = 20.0f,
                        y2 = 21.6642f,
                        x3 = 20.0f,
                        y3 = 21.25f,
                    )
                    verticalLineTo(y = 9.75f)
                    curveTo(
                        x1 = 20.0f,
                        y1 = 9.33579f,
                        x2 = 19.6642f,
                        y2 = 9.0f,
                        x3 = 19.25f,
                        y3 = 9.0f,
                    )
                    horizontalLineTo(x = 8.5f)
                    verticalLineTo(y = 7.0f)
                    curveTo(x1 = 8.5f, y1 = 5.067f, x2 = 10.067f, y2 = 3.5f, x3 = 12.0f, y3 = 3.5f)
                    curveTo(
                        x1 = 13.7225f,
                        y1 = 3.5f,
                        x2 = 15.1558f,
                        y2 = 4.7451f,
                        x3 = 15.4462f,
                        y3 = 6.38452f,
                    )
                    curveTo(
                        x1 = 15.5184f,
                        y1 = 6.79239f,
                        x2 = 15.9076f,
                        y2 = 7.06446f,
                        x3 = 16.3155f,
                        y3 = 6.99222f,
                    )
                    curveTo(
                        x1 = 16.7234f,
                        y1 = 6.91997f,
                        x2 = 16.9954f,
                        y2 = 6.53076f,
                        x3 = 16.9232f,
                        y3 = 6.1229f,
                    )
                    curveTo(
                        x1 = 16.5081f,
                        y1 = 3.77964f,
                        x2 = 14.4627f,
                        y2 = 2.0f,
                        x3 = 12.0f,
                        y3 = 2.0f,
                    )
                    close()
                    moveTo(x = 12.0f, y = 13.25f)
                    curveTo(
                        x1 = 12.4142f,
                        y1 = 13.25f,
                        x2 = 12.75f,
                        y2 = 13.5858f,
                        x3 = 12.75f,
                        y3 = 14.0f,
                    )
                    verticalLineTo(y = 17.0f)
                    curveTo(
                        x1 = 12.75f,
                        y1 = 17.4142f,
                        x2 = 12.4142f,
                        y2 = 17.75f,
                        x3 = 12.0f,
                        y3 = 17.75f,
                    )
                    curveTo(
                        x1 = 11.5858f,
                        y1 = 17.75f,
                        x2 = 11.25f,
                        y2 = 17.4142f,
                        x3 = 11.25f,
                        y3 = 17.0f,
                    )
                    verticalLineTo(y = 14.0f)
                    curveTo(
                        x1 = 11.25f,
                        y1 = 13.5858f,
                        x2 = 11.5858f,
                        y2 = 13.25f,
                        x3 = 12.0f,
                        y3 = 13.25f,
                    )
                    close()
                }
            }.build()
            .also { _unlocked = it }
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
                imageVector = Unlocked,
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
private var _unlocked: ImageVector? = null
