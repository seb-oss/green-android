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

val CalendarCheck: ImageVector
    get() {
        val current = _calendarCheck
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CalendarCheck",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 8.5f, y = 2.75f)
                    curveTo(
                        x1 = 8.5f,
                        y1 = 2.33579f,
                        x2 = 8.16421f,
                        y2 = 2.0f,
                        x3 = 7.75f,
                        y3 = 2.0f,
                    )
                    curveTo(
                        x1 = 7.33579f,
                        y1 = 2.0f,
                        x2 = 7.0f,
                        y2 = 2.33579f,
                        x3 = 7.0f,
                        y3 = 2.75f,
                    )
                    verticalLineTo(y = 4.0f)
                    horizontalLineTo(x = 3.75f)
                    curveTo(
                        x1 = 3.33579f,
                        y1 = 4.0f,
                        x2 = 3.0f,
                        y2 = 4.33579f,
                        x3 = 3.0f,
                        y3 = 4.75f,
                    )
                    verticalLineTo(y = 20.25f)
                    curveTo(
                        x1 = 3.0f,
                        y1 = 20.6642f,
                        x2 = 3.33579f,
                        y2 = 21.0f,
                        x3 = 3.75f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 11.25f)
                    curveTo(
                        x1 = 11.6642f,
                        y1 = 21.0f,
                        x2 = 12.0f,
                        y2 = 20.6642f,
                        x3 = 12.0f,
                        y3 = 20.25f,
                    )
                    curveTo(
                        x1 = 12.0f,
                        y1 = 19.8358f,
                        x2 = 11.6642f,
                        y2 = 19.5f,
                        x3 = 11.25f,
                        y3 = 19.5f,
                    )
                    horizontalLineTo(x = 4.5f)
                    verticalLineTo(y = 10.0f)
                    horizontalLineTo(x = 19.5f)
                    verticalLineTo(y = 12.25f)
                    curveTo(
                        x1 = 19.5f,
                        y1 = 12.6642f,
                        x2 = 19.8358f,
                        y2 = 13.0f,
                        x3 = 20.25f,
                        y3 = 13.0f,
                    )
                    curveTo(
                        x1 = 20.6642f,
                        y1 = 13.0f,
                        x2 = 21.0f,
                        y2 = 12.6642f,
                        x3 = 21.0f,
                        y3 = 12.25f,
                    )
                    verticalLineTo(y = 4.75f)
                    curveTo(
                        x1 = 21.0f,
                        y1 = 4.33579f,
                        x2 = 20.6642f,
                        y2 = 4.0f,
                        x3 = 20.25f,
                        y3 = 4.0f,
                    )
                    horizontalLineTo(x = 17.0f)
                    verticalLineTo(y = 2.75f)
                    curveTo(
                        x1 = 17.0f,
                        y1 = 2.33579f,
                        x2 = 16.6642f,
                        y2 = 2.0f,
                        x3 = 16.25f,
                        y3 = 2.0f,
                    )
                    curveTo(
                        x1 = 15.8358f,
                        y1 = 2.0f,
                        x2 = 15.5f,
                        y2 = 2.33579f,
                        x3 = 15.5f,
                        y3 = 2.75f,
                    )
                    verticalLineTo(y = 4.0f)
                    horizontalLineTo(x = 8.5f)
                    verticalLineTo(y = 2.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 21.8391f, y = 16.2142f)
                    curveTo(
                        x1 = 22.0955f,
                        y1 = 15.8888f,
                        x2 = 22.0395f,
                        y2 = 15.4172f,
                        x3 = 21.7142f,
                        y3 = 15.1609f,
                    )
                    curveTo(
                        x1 = 21.3888f,
                        y1 = 14.9045f,
                        x2 = 20.9172f,
                        y2 = 14.9605f,
                        x3 = 20.6609f,
                        y3 = 15.2858f,
                    )
                    lineTo(x = 16.8541f, y = 20.1176f)
                    lineTo(x = 15.2844f, y = 18.5237f)
                    curveTo(
                        x1 = 14.9937f,
                        y1 = 18.2286f,
                        x2 = 14.5189f,
                        y2 = 18.225f,
                        x3 = 14.2237f,
                        y3 = 18.5156f,
                    )
                    curveTo(
                        x1 = 13.9286f,
                        y1 = 18.8063f,
                        x2 = 13.925f,
                        y2 = 19.2811f,
                        x3 = 14.2156f,
                        y3 = 19.5763f,
                    )
                    lineTo(x = 16.3823f, y = 21.7763f)
                    curveTo(
                        x1 = 16.5334f,
                        y1 = 21.9297f,
                        x2 = 16.7431f,
                        y2 = 22.0107f,
                        x3 = 16.9581f,
                        y3 = 21.9989f,
                    )
                    curveTo(
                        x1 = 17.173f,
                        y1 = 21.987f,
                        x2 = 17.3725f,
                        y2 = 21.8833f,
                        x3 = 17.5058f,
                        y3 = 21.7142f,
                    )
                    lineTo(x = 21.8391f, y = 16.2142f)
                    close()
                }
            }.build()
            .also { _calendarCheck = it }
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
                imageVector = CalendarCheck,
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
private var _calendarCheck: ImageVector? = null
