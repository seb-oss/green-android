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

val Euro: ImageVector
    get() {
        val current = _euro
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Euro",
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
                    moveTo(x = 7.75f, y = 12.0f)
                    horizontalLineTo(x = 10.75f)
                    moveTo(x = 14.3021f, y = 9.0f)
                    curveTo(
                        x1 = 13.7136f,
                        y1 = 8.22784f,
                        x2 = 12.8995f,
                        y2 = 7.75f,
                        x3 = 12.0f,
                        y3 = 7.75f,
                    )
                    curveTo(
                        x1 = 10.2051f,
                        y1 = 7.75f,
                        x2 = 8.75f,
                        y2 = 9.65279f,
                        x3 = 8.75f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 8.75f,
                        y1 = 14.3472f,
                        x2 = 10.2051f,
                        y2 = 16.25f,
                        x3 = 12.0f,
                        y3 = 16.25f,
                    )
                    curveTo(
                        x1 = 12.8995f,
                        y1 = 16.25f,
                        x2 = 13.7136f,
                        y2 = 15.7722f,
                        x3 = 14.3021f,
                        y3 = 15.0f,
                    )
                    moveTo(x = 21.25f, y = 12.0f)
                    curveTo(
                        x1 = 21.25f,
                        y1 = 17.1086f,
                        x2 = 17.1086f,
                        y2 = 21.25f,
                        x3 = 12.0f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 6.89137f,
                        y1 = 21.25f,
                        x2 = 2.75f,
                        y2 = 17.1086f,
                        x3 = 2.75f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 2.75f,
                        y1 = 6.89137f,
                        x2 = 6.89137f,
                        y2 = 2.75f,
                        x3 = 12.0f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 17.1086f,
                        y1 = 2.75f,
                        x2 = 21.25f,
                        y2 = 6.89137f,
                        x3 = 21.25f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _euro = it }
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
                modifier =
                Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _euro: ImageVector? = null
