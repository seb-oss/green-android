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

val BubbleAnnotation: ImageVector
    get() {
        val current = _bubbleAnnotation
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BubbleAnnotation",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 2.7522f, y = 3.75f)
                    horizontalLineTo(x = 21.2522f)
                    verticalLineTo(y = 18.25f)
                    horizontalLineTo(x = 12.0022f)
                    lineTo(x = 7.0022f, y = 21.0f)
                    verticalLineTo(y = 18.25f)
                    horizontalLineTo(x = 2.7522f)
                    verticalLineTo(y = 3.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineWidth = 0.5f,
                ) {
                    moveTo(x = 7.5f, y = 10.25f)
                    curveTo(
                        x1 = 7.91421f,
                        y1 = 10.25f,
                        x2 = 8.25f,
                        y2 = 10.5858f,
                        x3 = 8.25f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 8.25f,
                        y1 = 11.4142f,
                        x2 = 7.91421f,
                        y2 = 11.75f,
                        x3 = 7.5f,
                        y3 = 11.75f,
                    )
                    curveTo(
                        x1 = 7.08579f,
                        y1 = 11.75f,
                        x2 = 6.75f,
                        y2 = 11.4142f,
                        x3 = 6.75f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 6.75f,
                        y1 = 10.5858f,
                        x2 = 7.08579f,
                        y2 = 10.25f,
                        x3 = 7.5f,
                        y3 = 10.25f,
                    )
                    close()
                    moveTo(x = 12.0f, y = 10.25f)
                    curveTo(
                        x1 = 12.4142f,
                        y1 = 10.25f,
                        x2 = 12.75f,
                        y2 = 10.5858f,
                        x3 = 12.75f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 12.75f,
                        y1 = 11.4142f,
                        x2 = 12.4142f,
                        y2 = 11.75f,
                        x3 = 12.0f,
                        y3 = 11.75f,
                    )
                    curveTo(
                        x1 = 11.5858f,
                        y1 = 11.75f,
                        x2 = 11.25f,
                        y2 = 11.4142f,
                        x3 = 11.25f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 11.25f,
                        y1 = 10.5858f,
                        x2 = 11.5858f,
                        y2 = 10.25f,
                        x3 = 12.0f,
                        y3 = 10.25f,
                    )
                    close()
                    moveTo(x = 16.5f, y = 10.25f)
                    curveTo(
                        x1 = 16.9142f,
                        y1 = 10.25f,
                        x2 = 17.25f,
                        y2 = 10.5858f,
                        x3 = 17.25f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 17.25f,
                        y1 = 11.4142f,
                        x2 = 16.9142f,
                        y2 = 11.75f,
                        x3 = 16.5f,
                        y3 = 11.75f,
                    )
                    curveTo(
                        x1 = 16.0858f,
                        y1 = 11.75f,
                        x2 = 15.75f,
                        y2 = 11.4142f,
                        x3 = 15.75f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 15.75f,
                        y1 = 10.5858f,
                        x2 = 16.0858f,
                        y2 = 10.25f,
                        x3 = 16.5f,
                        y3 = 10.25f,
                    )
                    close()
                }
            }.build()
            .also { _bubbleAnnotation = it }
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
                imageVector = BubbleAnnotation,
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
private var _bubbleAnnotation: ImageVector? = null
