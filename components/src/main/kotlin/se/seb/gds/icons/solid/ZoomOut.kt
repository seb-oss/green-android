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

val ZoomOut: ImageVector
    get() {
        val current = _zoomOut
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ZoomOut",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 11.0f, y = 3.0f)
                curveTo(x1 = 6.58172f, y1 = 3.0f, x2 = 3.0f, y2 = 6.58172f, x3 = 3.0f, y3 = 11.0f)
                curveTo(x1 = 3.0f, y1 = 15.4183f, x2 = 6.58172f, y2 = 19.0f, x3 = 11.0f, y3 = 19.0f)
                curveTo(x1 = 12.9388f, y1 = 19.0f, x2 = 14.7174f, y2 = 18.3096f, x3 = 16.1017f, y3 = 17.1624f)
                lineTo(x = 19.4701f, y = 20.5307f)
                curveTo(x1 = 19.763f, y1 = 20.8236f, x2 = 20.2379f, y2 = 20.8236f, x3 = 20.5307f, y3 = 20.5307f)
                curveTo(x1 = 20.8236f, y1 = 20.2379f, x2 = 20.8236f, y2 = 19.763f, x3 = 20.5307f, y3 = 19.4701f)
                lineTo(x = 17.1624f, y = 16.1017f)
                curveTo(x1 = 18.3096f, y1 = 14.7174f, x2 = 19.0f, y2 = 12.9388f, x3 = 19.0f, y3 = 11.0f)
                curveTo(x1 = 19.0f, y1 = 6.58172f, x2 = 15.4183f, y2 = 3.0f, x3 = 11.0f, y3 = 3.0f)
                close()
                moveTo(x = 15.0f, y = 11.0f)
                curveTo(x1 = 15.0f, y1 = 11.4142f, x2 = 14.6642f, y2 = 11.75f, x3 = 14.25f, y3 = 11.75f)
                horizontalLineTo(x = 7.75f)
                curveTo(x1 = 7.33579f, y1 = 11.75f, x2 = 7.0f, y2 = 11.4142f, x3 = 7.0f, y3 = 11.0f)
                curveTo(x1 = 7.0f, y1 = 10.5858f, x2 = 7.33579f, y2 = 10.25f, x3 = 7.75f, y3 = 10.25f)
                lineTo(x = 14.25f, y = 10.25f)
                curveTo(x1 = 14.6642f, y1 = 10.25f, x2 = 15.0f, y2 = 10.5858f, x3 = 15.0f, y3 = 11.0f)
                close()
            }
        }.build().also { _zoomOut = it }
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
                imageVector = ZoomOut,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _zoomOut: ImageVector? = null
