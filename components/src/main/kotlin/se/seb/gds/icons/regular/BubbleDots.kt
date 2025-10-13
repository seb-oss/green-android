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

internal val BubbleDots: ImageVector
    get() {
        val current = _bubbleDots
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BubbleDots",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.75f, y = 3.75f)
                horizontalLineTo(x = 20.25f)
                verticalLineTo(y = 18.25f)
                horizontalLineTo(x = 15.0155f)
                lineTo(x = 11.9979f, y = 20.75f)
                lineTo(x = 9.0155f, y = 18.25f)
                horizontalLineTo(x = 3.75f)
                verticalLineTo(y = 3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Square,
                strokeLineWidth = 0.5f,
            ) {
                moveTo(x = 7.25f, y = 11.25f)
                curveTo(x1 = 7.25f, y1 = 11.6642f, x2 = 7.58579f, y2 = 12.0f, x3 = 8.0f, y3 = 12.0f)
                curveTo(x1 = 8.41421f, y1 = 12.0f, x2 = 8.75f, y2 = 11.6642f, x3 = 8.75f, y3 = 11.25f)
                curveTo(x1 = 8.75f, y1 = 10.8358f, x2 = 8.41421f, y2 = 10.5f, x3 = 8.0f, y3 = 10.5f)
                curveTo(x1 = 7.58579f, y1 = 10.5f, x2 = 7.25f, y2 = 10.8358f, x3 = 7.25f, y3 = 11.25f)
                close()
                moveTo(x = 11.25f, y = 11.25f)
                curveTo(x1 = 11.25f, y1 = 11.6642f, x2 = 11.5858f, y2 = 12.0f, x3 = 12.0f, y3 = 12.0f)
                curveTo(x1 = 12.4142f, y1 = 12.0f, x2 = 12.75f, y2 = 11.6642f, x3 = 12.75f, y3 = 11.25f)
                curveTo(x1 = 12.75f, y1 = 10.8358f, x2 = 12.4142f, y2 = 10.5f, x3 = 12.0f, y3 = 10.5f)
                curveTo(x1 = 11.5858f, y1 = 10.5f, x2 = 11.25f, y2 = 10.8358f, x3 = 11.25f, y3 = 11.25f)
                close()
                moveTo(x = 15.25f, y = 11.25f)
                curveTo(x1 = 15.25f, y1 = 11.6642f, x2 = 15.5858f, y2 = 12.0f, x3 = 16.0f, y3 = 12.0f)
                curveTo(x1 = 16.4142f, y1 = 12.0f, x2 = 16.75f, y2 = 11.6642f, x3 = 16.75f, y3 = 11.25f)
                curveTo(x1 = 16.75f, y1 = 10.8358f, x2 = 16.4142f, y2 = 10.5f, x3 = 16.0f, y3 = 10.5f)
                curveTo(x1 = 15.5858f, y1 = 10.5f, x2 = 15.25f, y2 = 10.8358f, x3 = 15.25f, y3 = 11.25f)
                close()
            }
        }.build().also { _bubbleDots = it }
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
                imageVector = BubbleDots,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bubbleDots: ImageVector? = null
