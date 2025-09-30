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

val SunsetArrowDown: ImageVector
    get() {
        val current = _sunsetArrowDown
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SunsetArrowDown",
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
                    moveTo(x = 2.75391f, y = 20.25f)
                    horizontalLineTo(x = 21.2539f)
                    moveTo(x = 12.0f, y = 8.0f)
                    verticalLineTo(y = 2.75f)
                    moveTo(x = 2.75f, y = 16.25f)
                    horizontalLineTo(x = 4.25f)
                    moveTo(x = 19.75f, y = 16.25f)
                    horizontalLineTo(x = 21.25f)
                    moveTo(x = 17.9375f, y = 11.0184f)
                    lineTo(x = 19.0866f, y = 10.0542f)
                    moveTo(x = 4.91406f, y = 10.0542f)
                    lineTo(x = 6.06313f, y = 11.0184f)
                    moveTo(x = 9.5f, y = 6.0f)
                    lineTo(x = 12.0f, y = 8.5f)
                    lineTo(x = 14.5f, y = 6.0f)
                    moveTo(x = 7.75f, y = 16.25f)
                    verticalLineTo(y = 16.0f)
                    curveTo(x1 = 7.75f, y1 = 13.6528f, x2 = 9.65279f, y2 = 11.75f, x3 = 12.0f, y3 = 11.75f)
                    curveTo(x1 = 14.3472f, y1 = 11.75f, x2 = 16.25f, y2 = 13.6528f, x3 = 16.25f, y3 = 16.0f)
                    verticalLineTo(y = 16.25f)
                }
            }.build()
            .also { _sunsetArrowDown = it }
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
                imageVector = SunsetArrowDown,
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
private var _sunsetArrowDown: ImageVector? = null
