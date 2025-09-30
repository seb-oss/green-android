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

val MagnifyingGlass: ImageVector
    get() {
        val current = _magnifyingGlass
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.MagnifyingGlass",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 11.0f, y = 16.0f)
                    curveTo(x1 = 13.7614f, y1 = 16.0f, x2 = 16.0f, y2 = 13.7614f, x3 = 16.0f, y3 = 11.0f)
                    curveTo(x1 = 16.0f, y1 = 8.23858f, x2 = 13.7614f, y2 = 6.0f, x3 = 11.0f, y3 = 6.0f)
                    curveTo(x1 = 8.23858f, y1 = 6.0f, x2 = 6.0f, y2 = 8.23858f, x3 = 6.0f, y3 = 11.0f)
                    curveTo(x1 = 6.0f, y1 = 13.7614f, x2 = 8.23858f, y2 = 16.0f, x3 = 11.0f, y3 = 16.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 11.0f, y = 4.5f)
                    curveTo(x1 = 7.41015f, y1 = 4.5f, x2 = 4.5f, y2 = 7.41015f, x3 = 4.5f, y3 = 11.0f)
                    curveTo(x1 = 4.5f, y1 = 14.5899f, x2 = 7.41015f, y2 = 17.5f, x3 = 11.0f, y3 = 17.5f)
                    curveTo(x1 = 12.7951f, y1 = 17.5f, x2 = 14.4191f, y2 = 16.7733f, x3 = 15.5962f, y3 = 15.5962f)
                    curveTo(x1 = 16.7733f, y1 = 14.4191f, x2 = 17.5f, y2 = 12.7951f, x3 = 17.5f, y3 = 11.0f)
                    curveTo(x1 = 17.5f, y1 = 7.41015f, x2 = 14.5899f, y2 = 4.5f, x3 = 11.0f, y3 = 4.5f)
                    close()
                    moveTo(x = 3.0f, y = 11.0f)
                    curveTo(x1 = 3.0f, y1 = 6.58172f, x2 = 6.58172f, y2 = 3.0f, x3 = 11.0f, y3 = 3.0f)
                    curveTo(x1 = 15.4183f, y1 = 3.0f, x2 = 19.0f, y2 = 6.58172f, x3 = 19.0f, y3 = 11.0f)
                    curveTo(x1 = 19.0f, y1 = 12.9388f, x2 = 18.3096f, y2 = 14.7174f, x3 = 17.1624f, y3 = 16.1017f)
                    lineTo(x = 20.7803f, y = 19.7197f)
                    curveTo(x1 = 21.0732f, y1 = 20.0126f, x2 = 21.0732f, y2 = 20.4874f, x3 = 20.7803f, y3 = 20.7803f)
                    curveTo(x1 = 20.4874f, y1 = 21.0732f, x2 = 20.0126f, y2 = 21.0732f, x3 = 19.7197f, y3 = 20.7803f)
                    lineTo(x = 16.1017f, y = 17.1624f)
                    curveTo(x1 = 14.7174f, y1 = 18.3096f, x2 = 12.9388f, y2 = 19.0f, x3 = 11.0f, y3 = 19.0f)
                    curveTo(x1 = 6.58172f, y1 = 19.0f, x2 = 3.0f, y2 = 15.4183f, x3 = 3.0f, y3 = 11.0f)
                    close()
                }
            }.build()
            .also { _magnifyingGlass = it }
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
                imageVector = MagnifyingGlass,
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
private var _magnifyingGlass: ImageVector? = null
