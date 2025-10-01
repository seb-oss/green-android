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

val ArrowRotateClockwise: ImageVector
    get() {
        val current = _arrowRotateClockwise
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowRotateClockwise",
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
                    moveTo(x = 19.7596f, y = 14.75f)
                    curveTo(
                        x1 = 18.627f,
                        y1 = 17.9543f,
                        x2 = 15.5711f,
                        y2 = 20.25f,
                        x3 = 11.979f,
                        y3 = 20.25f,
                    )
                    curveTo(
                        x1 = 7.42266f,
                        y1 = 20.25f,
                        x2 = 3.729f,
                        y2 = 16.5563f,
                        x3 = 3.729f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 3.729f,
                        y1 = 7.44365f,
                        x2 = 7.42266f,
                        y2 = 3.75f,
                        x3 = 11.979f,
                        y3 = 3.75f,
                    )
                    curveTo(
                        x1 = 14.7962f,
                        y1 = 3.75f,
                        x2 = 16.6791f,
                        y2 = 4.95438f,
                        x3 = 18.5f,
                        y3 = 7.00891f,
                    )
                    moveTo(x = 19.25f, y = 4.0f)
                    verticalLineTo(y = 8.0f)
                    horizontalLineTo(x = 15.25f)
                }
            }.build()
            .also { _arrowRotateClockwise = it }
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
                imageVector = ArrowRotateClockwise,
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
private var _arrowRotateClockwise: ImageVector? = null
