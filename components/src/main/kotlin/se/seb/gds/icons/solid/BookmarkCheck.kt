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

val BookmarkCheck: ImageVector
    get() {
        val current = _bookmarkCheck
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BookmarkCheck",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 4.0f, y = 2.75f)
                    curveTo(x1 = 4.0f, y1 = 2.33579f, x2 = 4.33579f, y2 = 2.0f, x3 = 4.75f, y3 = 2.0f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(x1 = 19.6642f, y1 = 2.0f, x2 = 20.0f, y2 = 2.33579f, x3 = 20.0f, y3 = 2.75f)
                    verticalLineTo(y = 21.0f)
                    curveTo(x1 = 20.0f, y1 = 21.2653f, x2 = 19.8598f, y2 = 21.5109f, x3 = 19.6313f, y3 = 21.6458f)
                    curveTo(x1 = 19.4028f, y1 = 21.7807f, x2 = 19.12f, y2 = 21.7849f, x3 = 18.8877f, y3 = 21.6567f)
                    lineTo(x = 12.0f, y = 17.8566f)
                    lineTo(x = 5.11231f, y = 21.6567f)
                    curveTo(x1 = 4.87997f, y1 = 21.7849f, x2 = 4.5972f, y2 = 21.7807f, x3 = 4.36871f, y3 = 21.6458f)
                    curveTo(x1 = 4.14021f, y1 = 21.5109f, x2 = 4.0f, y2 = 21.2653f, x3 = 4.0f, y3 = 21.0f)
                    verticalLineTo(y = 2.75f)
                    close()
                    moveTo(x = 15.3803f, y = 8.68033f)
                    curveTo(x1 = 15.6732f, y1 = 8.38744f, x2 = 15.6732f, y2 = 7.91256f, x3 = 15.3803f, y3 = 7.61967f)
                    curveTo(x1 = 15.0874f, y1 = 7.32678f, x2 = 14.6126f, y2 = 7.32678f, x3 = 14.3197f, y3 = 7.61967f)
                    lineTo(x = 11.0f, y = 10.9393f)
                    lineTo(x = 9.88033f, y = 9.81967f)
                    curveTo(x1 = 9.58744f, y1 = 9.52677f, x2 = 9.11256f, y2 = 9.52677f, x3 = 8.81967f, y3 = 9.81967f)
                    curveTo(x1 = 8.52677f, y1 = 10.1126f, x2 = 8.52677f, y2 = 10.5874f, x3 = 8.81967f, y3 = 10.8803f)
                    lineTo(x = 10.4697f, y = 12.5303f)
                    curveTo(x1 = 10.6103f, y1 = 12.671f, x2 = 10.8011f, y2 = 12.75f, x3 = 11.0f, y3 = 12.75f)
                    curveTo(x1 = 11.1989f, y1 = 12.75f, x2 = 11.3897f, y2 = 12.671f, x3 = 11.5303f, y3 = 12.5303f)
                    lineTo(x = 15.3803f, y = 8.68033f)
                    close()
                }
            }.build()
            .also { _bookmarkCheck = it }
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
                imageVector = BookmarkCheck,
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
private var _bookmarkCheck: ImageVector? = null
