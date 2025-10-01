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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val TextEdit: ImageVector
    get() {
        val current = _textEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.TextEdit",
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
                moveTo(x = 1.75f, y = 5.75f)
                horizontalLineTo(x = 9.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 1.75f, y = 9.75f)
                horizontalLineTo(x = 6.25f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.1424f, y = 3.71967f)
                curveTo(x1 = 18.8495f, y1 = 3.42678f, x2 = 18.3746f, y2 = 3.42678f, x3 = 18.0817f, y3 = 3.71967f)
                lineTo(x = 7.21967f, y = 14.5817f)
                curveTo(x1 = 7.07902f, y1 = 14.7224f, x2 = 7.0f, y2 = 14.9132f, x3 = 7.0f, y3 = 15.1121f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 7.0f, y1 = 19.6642f, x2 = 7.33579f, y2 = 20.0f, x3 = 7.75f, y3 = 20.0f)
                horizontalLineTo(x = 11.8879f)
                curveTo(x1 = 12.0868f, y1 = 20.0f, x2 = 12.2776f, y2 = 19.921f, x3 = 12.4183f, y3 = 19.7803f)
                lineTo(x = 23.2803f, y = 8.91826f)
                curveTo(x1 = 23.5732f, y1 = 8.62537f, x2 = 23.5732f, y2 = 8.15049f, x3 = 23.2803f, y3 = 7.8576f)
                lineTo(x = 19.1424f, y = 3.71967f)
                close()
            }
        }.build().also { _textEdit = it }
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
                imageVector = TextEdit,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _textEdit: ImageVector? = null
