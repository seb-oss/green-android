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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val Paperclip: ImageVector
    get() {
        val current = _paperclip
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Paperclip",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.75f, y = 10.75f)
                verticalLineTo(y = 15.25f)
                curveTo(x1 = 5.75f, y1 = 18.5637f, x2 = 8.43629f, y2 = 21.25f, x3 = 11.75f, y3 = 21.25f)
                horizontalLineTo(x = 12.25f)
                curveTo(x1 = 15.5637f, y1 = 21.25f, x2 = 18.25f, y2 = 18.5637f, x3 = 18.25f, y3 = 15.25f)
                verticalLineTo(y = 7.0f)
                curveTo(x1 = 18.25f, y1 = 4.65279f, x2 = 16.3472f, y2 = 2.75f, x3 = 14.0f, y3 = 2.75f)
                curveTo(x1 = 11.6528f, y1 = 2.75f, x2 = 9.75f, y2 = 4.65279f, x3 = 9.75f, y3 = 7.0f)
                verticalLineTo(y = 14.875f)
                curveTo(x1 = 9.75f, y1 = 16.0486f, x2 = 10.7014f, y2 = 17.0f, x3 = 11.875f, y3 = 17.0f)
                curveTo(x1 = 13.0486f, y1 = 17.0f, x2 = 14.0f, y2 = 16.0486f, x3 = 14.0f, y3 = 14.875f)
                verticalLineTo(y = 7.75f)
            }
        }.build().also { _paperclip = it }
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
                imageVector = Paperclip,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _paperclip: ImageVector? = null
