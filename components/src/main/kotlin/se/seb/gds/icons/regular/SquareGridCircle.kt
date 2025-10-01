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

val SquareGridCircle: ImageVector
    get() {
        val current = _squareGridCircle
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SquareGridCircle",
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
                    moveTo(x = 3.75f, y = 3.75f)
                    horizontalLineTo(x = 10.25f)
                    verticalLineTo(y = 10.25f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 3.75f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 3.75f, y = 13.75f)
                    horizontalLineTo(x = 10.25f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 13.75f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 13.75f, y = 17.0f)
                    curveTo(
                        x1 = 13.75f,
                        y1 = 15.2051f,
                        x2 = 15.2051f,
                        y2 = 13.75f,
                        x3 = 17.0f,
                        y3 = 13.75f,
                    )
                    curveTo(
                        x1 = 18.7949f,
                        y1 = 13.75f,
                        x2 = 20.25f,
                        y2 = 15.2051f,
                        x3 = 20.25f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 20.25f,
                        y1 = 18.7949f,
                        x2 = 18.7949f,
                        y2 = 20.25f,
                        x3 = 17.0f,
                        y3 = 20.25f,
                    )
                    curveTo(
                        x1 = 15.2051f,
                        y1 = 20.25f,
                        x2 = 13.75f,
                        y2 = 18.7949f,
                        x3 = 13.75f,
                        y3 = 17.0f,
                    )
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 13.75f, y = 3.75f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 10.25f)
                    horizontalLineTo(x = 13.75f)
                    verticalLineTo(y = 3.75f)
                    close()
                }
            }.build()
            .also { _squareGridCircle = it }
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
                imageVector = SquareGridCircle,
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
private var _squareGridCircle: ImageVector? = null
