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

val Ticket: ImageVector
    get() {
        val current = _ticket
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Ticket",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 4.75f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 4.33579f,
                        x2 = 2.33579f,
                        y2 = 4.0f,
                        x3 = 2.75f,
                        y3 = 4.0f,
                    )
                    horizontalLineTo(x = 21.25f)
                    curveTo(
                        x1 = 21.6642f,
                        y1 = 4.0f,
                        x2 = 22.0f,
                        y2 = 4.33579f,
                        x3 = 22.0f,
                        y3 = 4.75f,
                    )
                    verticalLineTo(y = 9.25f)
                    curveTo(
                        x1 = 22.0f,
                        y1 = 9.58821f,
                        x2 = 21.7736f,
                        y2 = 9.88458f,
                        x3 = 21.4473f,
                        y3 = 9.97357f,
                    )
                    curveTo(
                        x1 = 19.4342f,
                        y1 = 10.5226f,
                        x2 = 19.4342f,
                        y2 = 13.4774f,
                        x3 = 21.4473f,
                        y3 = 14.0264f,
                    )
                    curveTo(
                        x1 = 21.7736f,
                        y1 = 14.1154f,
                        x2 = 22.0f,
                        y2 = 14.4118f,
                        x3 = 22.0f,
                        y3 = 14.75f,
                    )
                    verticalLineTo(y = 19.25f)
                    curveTo(
                        x1 = 22.0f,
                        y1 = 19.6642f,
                        x2 = 21.6642f,
                        y2 = 20.0f,
                        x3 = 21.25f,
                        y3 = 20.0f,
                    )
                    horizontalLineTo(x = 2.75f)
                    curveTo(
                        x1 = 2.33579f,
                        y1 = 20.0f,
                        x2 = 2.0f,
                        y2 = 19.6642f,
                        x3 = 2.0f,
                        y3 = 19.25f,
                    )
                    verticalLineTo(y = 14.75f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 14.4118f,
                        x2 = 2.22637f,
                        y2 = 14.1154f,
                        x3 = 2.55266f,
                        y3 = 14.0264f,
                    )
                    curveTo(
                        x1 = 4.56578f,
                        y1 = 13.4774f,
                        x2 = 4.56578f,
                        y2 = 10.5226f,
                        x3 = 2.55266f,
                        y3 = 9.97357f,
                    )
                    curveTo(
                        x1 = 2.22637f,
                        y1 = 9.88458f,
                        x2 = 2.0f,
                        y2 = 9.58821f,
                        x3 = 2.0f,
                        y3 = 9.25f,
                    )
                    verticalLineTo(y = 4.75f)
                    close()
                    moveTo(x = 15.25f, y = 7.0f)
                    curveTo(
                        x1 = 15.6642f,
                        y1 = 7.0f,
                        x2 = 16.0f,
                        y2 = 7.33579f,
                        x3 = 16.0f,
                        y3 = 7.75f,
                    )
                    verticalLineTo(y = 8.25f)
                    curveTo(
                        x1 = 16.0f,
                        y1 = 8.66421f,
                        x2 = 15.6642f,
                        y2 = 9.0f,
                        x3 = 15.25f,
                        y3 = 9.0f,
                    )
                    curveTo(
                        x1 = 14.8358f,
                        y1 = 9.0f,
                        x2 = 14.5f,
                        y2 = 8.66421f,
                        x3 = 14.5f,
                        y3 = 8.25f,
                    )
                    verticalLineTo(y = 7.75f)
                    curveTo(
                        x1 = 14.5f,
                        y1 = 7.33579f,
                        x2 = 14.8358f,
                        y2 = 7.0f,
                        x3 = 15.25f,
                        y3 = 7.0f,
                    )
                    close()
                    moveTo(x = 15.25f, y = 11.0f)
                    curveTo(
                        x1 = 15.6642f,
                        y1 = 11.0f,
                        x2 = 16.0f,
                        y2 = 11.3358f,
                        x3 = 16.0f,
                        y3 = 11.75f,
                    )
                    verticalLineTo(y = 12.25f)
                    curveTo(
                        x1 = 16.0f,
                        y1 = 12.6642f,
                        x2 = 15.6642f,
                        y2 = 13.0f,
                        x3 = 15.25f,
                        y3 = 13.0f,
                    )
                    curveTo(
                        x1 = 14.8358f,
                        y1 = 13.0f,
                        x2 = 14.5f,
                        y2 = 12.6642f,
                        x3 = 14.5f,
                        y3 = 12.25f,
                    )
                    verticalLineTo(y = 11.75f)
                    curveTo(
                        x1 = 14.5f,
                        y1 = 11.3358f,
                        x2 = 14.8358f,
                        y2 = 11.0f,
                        x3 = 15.25f,
                        y3 = 11.0f,
                    )
                    close()
                    moveTo(x = 15.25f, y = 15.0f)
                    curveTo(
                        x1 = 15.6642f,
                        y1 = 15.0f,
                        x2 = 16.0f,
                        y2 = 15.3358f,
                        x3 = 16.0f,
                        y3 = 15.75f,
                    )
                    verticalLineTo(y = 16.25f)
                    curveTo(
                        x1 = 16.0f,
                        y1 = 16.6642f,
                        x2 = 15.6642f,
                        y2 = 17.0f,
                        x3 = 15.25f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 14.8358f,
                        y1 = 17.0f,
                        x2 = 14.5f,
                        y2 = 16.6642f,
                        x3 = 14.5f,
                        y3 = 16.25f,
                    )
                    verticalLineTo(y = 15.75f)
                    curveTo(
                        x1 = 14.5f,
                        y1 = 15.3358f,
                        x2 = 14.8358f,
                        y2 = 15.0f,
                        x3 = 15.25f,
                        y3 = 15.0f,
                    )
                    close()
                }
            }.build()
            .also { _ticket = it }
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
                imageVector = Ticket,
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
private var _ticket: ImageVector? = null
