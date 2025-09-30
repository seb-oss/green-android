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

val Push: ImageVector
    get() {
        val current = _push
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Push",
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
                    moveTo(x = 4.52778f, y = 17.2499f)
                    lineTo(x = 1.75f, y = 20.1071f)
                    moveTo(x = 6.75f, y = 19.5356f)
                    lineTo(x = 5.08333f, y = 21.2499f)
                    moveTo(x = 2.75f, y = 12.2499f)
                    curveTo(x1 = 2.75f, y1 = 12.2499f, x2 = 6.51997f, y2 = 14.0199f, x3 = 8.25f, y3 = 15.7499f)
                    curveTo(x1 = 9.98003f, y1 = 17.48f, x2 = 11.75f, y2 = 21.2499f, x3 = 11.75f, y3 = 21.2499f)
                    lineTo(x = 15.25f, y = 17.9999f)
                    verticalLineTo(y = 14.9999f)
                    curveTo(x1 = 19.25f, y1 = 12.9999f, x2 = 21.75f, y2 = 9.74992f, x3 = 21.25f, y3 = 2.74992f)
                    curveTo(x1 = 14.25f, y1 = 2.24992f, x2 = 11.0f, y2 = 4.74993f, x3 = 9.0f, y3 = 8.74994f)
                    horizontalLineTo(x = 6.0f)
                    lineTo(x = 2.75f, y = 12.2499f)
                    close()
                    moveTo(x = 17.25f, y = 8.49992f)
                    curveTo(x1 = 17.25f, y1 = 9.46642f, x2 = 16.4665f, y2 = 10.2499f, x3 = 15.5f, y3 = 10.2499f)
                    curveTo(x1 = 14.5335f, y1 = 10.2499f, x2 = 13.75f, y2 = 9.46642f, x3 = 13.75f, y3 = 8.49992f)
                    curveTo(x1 = 13.75f, y1 = 7.53342f, x2 = 14.5335f, y2 = 6.74992f, x3 = 15.5f, y3 = 6.74992f)
                    curveTo(x1 = 16.4665f, y1 = 6.74992f, x2 = 17.25f, y2 = 7.53342f, x3 = 17.25f, y3 = 8.49992f)
                    close()
                }
            }.build()
            .also { _push = it }
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
                imageVector = Push,
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
private var _push: ImageVector? = null
