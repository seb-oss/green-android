package se.seb.gds.icons.regular

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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val ReadingList: ImageVector
    get() {
        val current = _readingList
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ReadingList",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 0.75f, y = 9.75f)
                horizontalLineTo(x = 2.0f)
                moveTo(x = 23.25f, y = 9.75f)
                horizontalLineTo(x = 22.0f)
                moveTo(x = 14.0612f, y = 9.28239f)
                curveTo(x1 = 13.4507f, y1 = 8.94319f, x2 = 12.7479f, y2 = 8.75f, x3 = 12.0f, y3 = 8.75f)
                curveTo(x1 = 11.2521f, y1 = 8.75f, x2 = 10.5493f, y2 = 8.94319f, x3 = 9.93881f, y3 = 9.28239f)
                moveTo(x = 10.25f, y = 12.0f)
                curveTo(x1 = 10.25f, y1 = 14.3472f, x2 = 8.34721f, y2 = 16.25f, x3 = 6.0f, y3 = 16.25f)
                curveTo(x1 = 3.65279f, y1 = 16.25f, x2 = 1.75f, y2 = 14.3472f, x3 = 1.75f, y3 = 12.0f)
                curveTo(x1 = 1.75f, y1 = 9.65279f, x2 = 3.65279f, y2 = 7.75f, x3 = 6.0f, y3 = 7.75f)
                curveTo(x1 = 8.34721f, y1 = 7.75f, x2 = 10.25f, y2 = 9.65279f, x3 = 10.25f, y3 = 12.0f)
                close()
                moveTo(x = 22.25f, y = 12.0f)
                curveTo(x1 = 22.25f, y1 = 14.3472f, x2 = 20.3472f, y2 = 16.25f, x3 = 18.0f, y3 = 16.25f)
                curveTo(x1 = 15.6528f, y1 = 16.25f, x2 = 13.75f, y2 = 14.3472f, x3 = 13.75f, y3 = 12.0f)
                curveTo(x1 = 13.75f, y1 = 9.65279f, x2 = 15.6528f, y2 = 7.75f, x3 = 18.0f, y3 = 7.75f)
                curveTo(x1 = 20.3472f, y1 = 7.75f, x2 = 22.25f, y2 = 9.65279f, x3 = 22.25f, y3 = 12.0f)
                close()
            }
        }.build().also { _readingList = it }
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
                imageVector = ReadingList,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _readingList: ImageVector? = null
