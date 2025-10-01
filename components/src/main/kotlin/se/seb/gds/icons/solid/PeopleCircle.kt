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

val PeopleCircle: ImageVector
    get() {
        val current = _peopleCircle
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PeopleCircle",
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
                        y1 = 14.897f,
                        x2 = 3.23192f,
                        y2 = 17.5063f,
                        x3 = 5.20047f,
                        y3 = 19.3326f,
                    )
                    curveTo(
                        x1 = 6.98474f,
                        y1 = 20.9879f,
                        x2 = 9.37418f,
                        y2 = 22.0f,
                        x3 = 12.0f,
                        y3 = 22.0f,
                    )
                    curveTo(
                        x1 = 14.6258f,
                        y1 = 22.0f,
                        x2 = 17.0153f,
                        y2 = 20.9879f,
                        x3 = 18.7995f,
                        y3 = 19.3326f,
                    )
                    curveTo(
                        x1 = 20.7681f,
                        y1 = 17.5063f,
                        x2 = 22.0f,
                        y2 = 14.897f,
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
                    moveTo(x = 5.97605f, y = 17.9968f)
                    curveTo(
                        x1 = 7.29919f,
                        y1 = 16.174f,
                        x2 = 9.41114f,
                        y2 = 15.0f,
                        x3 = 12.0f,
                        y3 = 15.0f,
                    )
                    curveTo(
                        x1 = 14.5889f,
                        y1 = 15.0f,
                        x2 = 16.7008f,
                        y2 = 16.174f,
                        x3 = 18.0239f,
                        y3 = 17.9968f,
                    )
                    curveTo(
                        x1 = 16.4847f,
                        y1 = 19.543f,
                        x2 = 14.3541f,
                        y2 = 20.5f,
                        x3 = 12.0f,
                        y3 = 20.5f,
                    )
                    curveTo(
                        x1 = 9.64589f,
                        y1 = 20.5f,
                        x2 = 7.51531f,
                        y2 = 19.543f,
                        x3 = 5.97605f,
                        y3 = 17.9968f,
                    )
                    close()
                    moveTo(x = 15.0f, y = 10.0f)
                    curveTo(
                        x1 = 15.0f,
                        y1 = 11.6569f,
                        x2 = 13.6569f,
                        y2 = 13.0f,
                        x3 = 12.0f,
                        y3 = 13.0f,
                    )
                    curveTo(
                        x1 = 10.3431f,
                        y1 = 13.0f,
                        x2 = 9.0f,
                        y2 = 11.6569f,
                        x3 = 9.0f,
                        y3 = 10.0f,
                    )
                    curveTo(
                        x1 = 9.0f,
                        y1 = 8.34315f,
                        x2 = 10.3431f,
                        y2 = 7.0f,
                        x3 = 12.0f,
                        y3 = 7.0f,
                    )
                    curveTo(
                        x1 = 13.6569f,
                        y1 = 7.0f,
                        x2 = 15.0f,
                        y2 = 8.34315f,
                        x3 = 15.0f,
                        y3 = 10.0f,
                    )
                    close()
                }
            }.build()
            .also { _peopleCircle = it }
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
                imageVector = PeopleCircle,
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
private var _peopleCircle: ImageVector? = null
