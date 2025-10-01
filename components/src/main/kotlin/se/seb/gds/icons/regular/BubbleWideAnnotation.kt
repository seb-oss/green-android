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

val BubbleWideAnnotation: ImageVector
    get() {
        val current = _bubbleWideAnnotation
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BubbleWideAnnotation",
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
                    moveTo(x = 2.75f, y = 3.75f)
                    horizontalLineTo(x = 21.25f)
                    verticalLineTo(y = 18.25f)
                    horizontalLineTo(x = 15.0155f)
                    lineTo(x = 11.9979f, y = 20.75f)
                    lineTo(x = 9.0155f, y = 18.25f)
                    horizontalLineTo(x = 2.75f)
                    verticalLineTo(y = 3.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineWidth = 0.75f,
                ) {
                    moveTo(x = 6.625f, y = 11.0f)
                    curveTo(
                        x1 = 6.625f,
                        y1 = 11.4832f,
                        x2 = 7.01675f,
                        y2 = 11.875f,
                        x3 = 7.5f,
                        y3 = 11.875f,
                    )
                    curveTo(
                        x1 = 7.98325f,
                        y1 = 11.875f,
                        x2 = 8.375f,
                        y2 = 11.4832f,
                        x3 = 8.375f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 8.375f,
                        y1 = 10.5168f,
                        x2 = 7.98325f,
                        y2 = 10.125f,
                        x3 = 7.5f,
                        y3 = 10.125f,
                    )
                    curveTo(
                        x1 = 7.01675f,
                        y1 = 10.125f,
                        x2 = 6.625f,
                        y2 = 10.5168f,
                        x3 = 6.625f,
                        y3 = 11.0f,
                    )
                    close()
                    moveTo(x = 11.125f, y = 11.0f)
                    curveTo(
                        x1 = 11.125f,
                        y1 = 11.4832f,
                        x2 = 11.5168f,
                        y2 = 11.875f,
                        x3 = 12.0f,
                        y3 = 11.875f,
                    )
                    curveTo(
                        x1 = 12.4832f,
                        y1 = 11.875f,
                        x2 = 12.875f,
                        y2 = 11.4832f,
                        x3 = 12.875f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 12.875f,
                        y1 = 10.5168f,
                        x2 = 12.4832f,
                        y2 = 10.125f,
                        x3 = 12.0f,
                        y3 = 10.125f,
                    )
                    curveTo(
                        x1 = 11.5168f,
                        y1 = 10.125f,
                        x2 = 11.125f,
                        y2 = 10.5168f,
                        x3 = 11.125f,
                        y3 = 11.0f,
                    )
                    close()
                    moveTo(x = 15.625f, y = 11.0f)
                    curveTo(
                        x1 = 15.625f,
                        y1 = 11.4832f,
                        x2 = 16.0168f,
                        y2 = 11.875f,
                        x3 = 16.5f,
                        y3 = 11.875f,
                    )
                    curveTo(
                        x1 = 16.9832f,
                        y1 = 11.875f,
                        x2 = 17.375f,
                        y2 = 11.4832f,
                        x3 = 17.375f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 17.375f,
                        y1 = 10.5168f,
                        x2 = 16.9832f,
                        y2 = 10.125f,
                        x3 = 16.5f,
                        y3 = 10.125f,
                    )
                    curveTo(
                        x1 = 16.0168f,
                        y1 = 10.125f,
                        x2 = 15.625f,
                        y2 = 10.5168f,
                        x3 = 15.625f,
                        y3 = 11.0f,
                    )
                    close()
                }
            }.build()
            .also { _bubbleWideAnnotation = it }
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
                imageVector = BubbleWideAnnotation,
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
private var _bubbleWideAnnotation: ImageVector? = null
