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

val Euro: ImageVector
    get() {
        val current = _euro
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Euro",
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
                curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 6.47715f, x2 = 17.5228f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                close()
                moveTo(x = 7.0f, y = 12.0f)
                curveTo(x1 = 7.0f, y1 = 11.5858f, x2 = 7.33579f, y2 = 11.25f, x3 = 7.75f, y3 = 11.25f)
                horizontalLineTo(x = 8.0444f)
                curveTo(x1 = 8.16779f, y1 = 10.2172f, x2 = 8.54317f, y2 = 9.27539f, x3 = 9.10613f, y3 = 8.53921f)
                curveTo(x1 = 9.80338f, y1 = 7.62743f, x2 = 10.8198f, y2 = 7.0f, x3 = 12.0f, y3 = 7.0f)
                curveTo(x1 = 13.1829f, y1 = 7.0f, x2 = 14.2012f, y2 = 7.63026f, x3 = 14.8986f, y3 = 8.5454f)
                curveTo(x1 = 15.1497f, y1 = 8.87485f, x2 = 15.0861f, y2 = 9.34546f, x3 = 14.7567f, y3 = 9.59652f)
                curveTo(x1 = 14.4272f, y1 = 9.84759f, x2 = 13.9566f, y2 = 9.78405f, x3 = 13.7055f, y3 = 9.4546f)
                curveTo(x1 = 13.2261f, y1 = 8.82543f, x2 = 12.616f, y2 = 8.5f, x3 = 12.0f, y3 = 8.5f)
                curveTo(x1 = 11.3853f, y1 = 8.5f, x2 = 10.7767f, y2 = 8.82397f, x3 = 10.2977f, y3 = 9.45038f)
                curveTo(x1 = 9.93935f, y1 = 9.91896f, x2 = 9.67116f, y2 = 10.5393f, x3 = 9.55846f, y3 = 11.25f)
                horizontalLineTo(x = 10.75f)
                curveTo(x1 = 11.1642f, y1 = 11.25f, x2 = 11.5f, y2 = 11.5858f, x3 = 11.5f, y3 = 12.0f)
                curveTo(x1 = 11.5f, y1 = 12.4142f, x2 = 11.1642f, y2 = 12.75f, x3 = 10.75f, y3 = 12.75f)
                horizontalLineTo(x = 9.55846f)
                curveTo(x1 = 9.67116f, y1 = 13.4607f, x2 = 9.93935f, y2 = 14.081f, x3 = 10.2977f, y3 = 14.5496f)
                curveTo(x1 = 10.7767f, y1 = 15.176f, x2 = 11.3853f, y2 = 15.5f, x3 = 12.0f, y3 = 15.5f)
                curveTo(x1 = 12.616f, y1 = 15.5f, x2 = 13.2261f, y2 = 15.1746f, x3 = 13.7055f, y3 = 14.5454f)
                curveTo(x1 = 13.9566f, y1 = 14.216f, x2 = 14.4272f, y2 = 14.1524f, x3 = 14.7567f, y3 = 14.4035f)
                curveTo(x1 = 15.0861f, y1 = 14.6545f, x2 = 15.1497f, y2 = 15.1251f, x3 = 14.8986f, y3 = 15.4546f)
                curveTo(x1 = 14.2012f, y1 = 16.3697f, x2 = 13.1829f, y2 = 17.0f, x3 = 12.0f, y3 = 17.0f)
                curveTo(x1 = 10.8198f, y1 = 17.0f, x2 = 9.80338f, y2 = 16.3726f, x3 = 9.10613f, y3 = 15.4608f)
                curveTo(x1 = 8.54317f, y1 = 14.7246f, x2 = 8.16779f, y2 = 13.7828f, x3 = 8.0444f, y3 = 12.75f)
                horizontalLineTo(x = 7.75f)
                curveTo(x1 = 7.33579f, y1 = 12.75f, x2 = 7.0f, y2 = 12.4142f, x3 = 7.0f, y3 = 12.0f)
                close()
            }
        }.build().also { _euro = it }
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
                imageVector = Euro,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _euro: ImageVector? = null
