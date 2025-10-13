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

internal val Refund: ImageVector
    get() {
        val current = _refund
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Refund",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 7.28033f, y = 3.78033f)
                curveTo(x1 = 7.57322f, y1 = 3.48744f, x2 = 7.57322f, y2 = 3.01256f, x3 = 7.28033f, y3 = 2.71967f)
                curveTo(x1 = 6.98744f, y1 = 2.42678f, x2 = 6.51256f, y2 = 2.42678f, x3 = 6.21967f, y3 = 2.71967f)
                lineTo(x = 3.21967f, y = 5.71967f)
                curveTo(x1 = 2.92678f, y1 = 6.01256f, x2 = 2.92678f, y2 = 6.48744f, x3 = 3.21967f, y3 = 6.78033f)
                lineTo(x = 6.21967f, y = 9.78033f)
                curveTo(x1 = 6.51256f, y1 = 10.0732f, x2 = 6.98744f, y2 = 10.0732f, x3 = 7.28033f, y3 = 9.78033f)
                curveTo(x1 = 7.57322f, y1 = 9.48744f, x2 = 7.57322f, y2 = 9.01256f, x3 = 7.28033f, y3 = 8.71967f)
                lineTo(x = 5.56066f, y = 7.0f)
                horizontalLineTo(x = 14.25f)
                curveTo(x1 = 17.2876f, y1 = 7.0f, x2 = 19.75f, y2 = 9.46243f, x3 = 19.75f, y3 = 12.5f)
                curveTo(x1 = 19.75f, y1 = 15.5376f, x2 = 17.2876f, y2 = 18.0f, x3 = 14.25f, y3 = 18.0f)
                horizontalLineTo(x = 5.75f)
                curveTo(x1 = 5.33579f, y1 = 18.0f, x2 = 5.0f, y2 = 18.3358f, x3 = 5.0f, y3 = 18.75f)
                curveTo(x1 = 5.0f, y1 = 19.1642f, x2 = 5.33579f, y2 = 19.5f, x3 = 5.75f, y3 = 19.5f)
                horizontalLineTo(x = 14.25f)
                curveTo(x1 = 18.116f, y1 = 19.5f, x2 = 21.25f, y2 = 16.366f, x3 = 21.25f, y3 = 12.5f)
                curveTo(x1 = 21.25f, y1 = 8.63401f, x2 = 18.116f, y2 = 5.5f, x3 = 14.25f, y3 = 5.5f)
                horizontalLineTo(x = 5.56066f)
                lineTo(x = 7.28033f, y = 3.78033f)
                close()
            }
        }.build().also { _refund = it }
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
                imageVector = Refund,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _refund: ImageVector? = null
