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

val Pdf: ImageVector
    get() {
        val current = _pdf
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Pdf",
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
                    moveTo(x = 4.75f, y = 11.25f)
                    verticalLineTo(y = 3.75f)
                    horizontalLineTo(x = 15.0f)
                    lineTo(x = 19.25f, y = 8.0f)
                    verticalLineTo(y = 11.25f)
                    moveTo(x = 13.75f, y = 4.25f)
                    verticalLineTo(y = 9.25f)
                    horizontalLineTo(x = 18.75f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 3.75f, y = 20.25f)
                    verticalLineTo(y = 14.75f)
                    horizontalLineTo(x = 5.75f)
                    curveTo(
                        x1 = 6.57843f,
                        y1 = 14.75f,
                        x2 = 7.25f,
                        y2 = 15.4216f,
                        x3 = 7.25f,
                        y3 = 16.25f,
                    )
                    curveTo(
                        x1 = 7.25f,
                        y1 = 17.0784f,
                        x2 = 6.57843f,
                        y2 = 17.75f,
                        x3 = 5.75f,
                        y3 = 17.75f,
                    )
                    horizontalLineTo(x = 4.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 9.75f, y = 14.75f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 11.25f)
                    curveTo(
                        x1 = 12.3333f,
                        y1 = 20.25f,
                        x2 = 14.0f,
                        y2 = 19.7f,
                        x3 = 14.0f,
                        y3 = 17.5f,
                    )
                    curveTo(
                        x1 = 14.0f,
                        y1 = 15.3f,
                        x2 = 12.3333f,
                        y2 = 14.75f,
                        x3 = 11.25f,
                        y3 = 14.75f,
                    )
                    horizontalLineTo(x = 9.75f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 20.25f, y = 14.75f)
                    horizontalLineTo(x = 16.75f)
                    verticalLineTo(y = 20.25f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 16.75f, y = 17.75f)
                    horizontalLineTo(x = 19.25f)
                }
            }.build()
            .also { _pdf = it }
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
                imageVector = Pdf,
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
private var _pdf: ImageVector? = null
