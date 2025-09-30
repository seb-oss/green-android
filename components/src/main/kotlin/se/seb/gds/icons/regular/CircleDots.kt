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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val CircleDots: ImageVector
    get() {
        val current = _circleDots
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CircleDots",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 8.0f, y = 12.0f)
                    verticalLineTo(y = 11.99f)
                    moveTo(x = 8.25f, y = 12.0f)
                    curveTo(x1 = 8.25f, y1 = 12.1381f, x2 = 8.13807f, y2 = 12.25f, x3 = 8.0f, y3 = 12.25f)
                    curveTo(x1 = 7.86193f, y1 = 12.25f, x2 = 7.75f, y2 = 12.1381f, x3 = 7.75f, y3 = 12.0f)
                    curveTo(x1 = 7.75f, y1 = 11.8619f, x2 = 7.86193f, y2 = 11.75f, x3 = 8.0f, y3 = 11.75f)
                    curveTo(x1 = 8.13807f, y1 = 11.75f, x2 = 8.25f, y2 = 11.8619f, x3 = 8.25f, y3 = 12.0f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 12.0f, y = 12.0f)
                    verticalLineTo(y = 11.99f)
                    moveTo(x = 12.25f, y = 12.0f)
                    curveTo(x1 = 12.25f, y1 = 12.1381f, x2 = 12.1381f, y2 = 12.25f, x3 = 12.0f, y3 = 12.25f)
                    curveTo(x1 = 11.8619f, y1 = 12.25f, x2 = 11.75f, y2 = 12.1381f, x3 = 11.75f, y3 = 12.0f)
                    curveTo(x1 = 11.75f, y1 = 11.8619f, x2 = 11.8619f, y2 = 11.75f, x3 = 12.0f, y3 = 11.75f)
                    curveTo(x1 = 12.1381f, y1 = 11.75f, x2 = 12.25f, y2 = 11.8619f, x3 = 12.25f, y3 = 12.0f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 16.0f, y = 12.0f)
                    verticalLineTo(y = 11.99f)
                    moveTo(x = 16.25f, y = 12.0f)
                    curveTo(x1 = 16.25f, y1 = 12.1381f, x2 = 16.1381f, y2 = 12.25f, x3 = 16.0f, y3 = 12.25f)
                    curveTo(x1 = 15.8619f, y1 = 12.25f, x2 = 15.75f, y2 = 12.1381f, x3 = 15.75f, y3 = 12.0f)
                    curveTo(x1 = 15.75f, y1 = 11.8619f, x2 = 15.8619f, y2 = 11.75f, x3 = 16.0f, y3 = 11.75f)
                    curveTo(x1 = 16.1381f, y1 = 11.75f, x2 = 16.25f, y2 = 11.8619f, x3 = 16.25f, y3 = 12.0f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 21.25f, y = 12.0f)
                    curveTo(x1 = 21.25f, y1 = 17.1086f, x2 = 17.1086f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                    curveTo(x1 = 6.89137f, y1 = 21.25f, x2 = 2.75f, y2 = 17.1086f, x3 = 2.75f, y3 = 12.0f)
                    curveTo(x1 = 2.75f, y1 = 6.89137f, x2 = 6.89137f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                    curveTo(x1 = 17.1086f, y1 = 2.75f, x2 = 21.25f, y2 = 6.89137f, x3 = 21.25f, y3 = 12.0f)
                    close()
                }
            }.build()
            .also { _circleDots = it }
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
                imageVector = CircleDots,
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
private var _circleDots: ImageVector? = null
