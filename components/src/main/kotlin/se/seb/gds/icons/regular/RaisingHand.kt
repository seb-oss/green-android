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

val RaisingHand: ImageVector
    get() {
        val current = _raisingHand
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.RaisingHand",
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
                    moveTo(x = 7.75f, y = 11.25f)
                    verticalLineTo(y = 7.25f)
                    curveTo(
                        x1 = 7.75f,
                        y1 = 6.42157f,
                        x2 = 7.07843f,
                        y2 = 5.75f,
                        x3 = 6.25f,
                        y3 = 5.75f,
                    )
                    curveTo(
                        x1 = 5.42157f,
                        y1 = 5.75f,
                        x2 = 4.75f,
                        y2 = 6.42157f,
                        x3 = 4.75f,
                        y3 = 7.25f,
                    )
                    verticalLineTo(y = 13.75f)
                    curveTo(
                        x1 = 4.75f,
                        y1 = 17.8921f,
                        x2 = 8.10786f,
                        y2 = 21.25f,
                        x3 = 12.25f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 16.3921f,
                        y1 = 21.25f,
                        x2 = 19.75f,
                        y2 = 17.8921f,
                        x3 = 19.75f,
                        y3 = 13.75f,
                    )
                    verticalLineTo(y = 8.0f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(
                        x1 = 18.2065f,
                        y1 = 8.0f,
                        x2 = 17.2875f,
                        y2 = 8.53275f,
                        x3 = 16.75f,
                        y3 = 9.3411f,
                    )
                    moveTo(x = 7.75f, y = 8.75f)
                    verticalLineTo(y = 5.25f)
                    curveTo(
                        x1 = 7.75f,
                        y1 = 4.42157f,
                        x2 = 8.42157f,
                        y2 = 3.75f,
                        x3 = 9.25f,
                        y3 = 3.75f,
                    )
                    curveTo(
                        x1 = 10.0784f,
                        y1 = 3.75f,
                        x2 = 10.75f,
                        y2 = 4.42157f,
                        x3 = 10.75f,
                        y3 = 5.25f,
                    )
                    verticalLineTo(y = 10.25f)
                    moveTo(x = 10.75f, y = 7.75f)
                    verticalLineTo(y = 4.25f)
                    curveTo(
                        x1 = 10.75f,
                        y1 = 3.42157f,
                        x2 = 11.4216f,
                        y2 = 2.75f,
                        x3 = 12.25f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 13.0784f,
                        y1 = 2.75f,
                        x2 = 13.75f,
                        y2 = 3.42157f,
                        x3 = 13.75f,
                        y3 = 4.25f,
                    )
                    verticalLineTo(y = 5.25f)
                    moveTo(x = 13.75f, y = 10.25f)
                    verticalLineTo(y = 5.25f)
                    moveTo(x = 13.75f, y = 5.25f)
                    curveTo(
                        x1 = 13.75f,
                        y1 = 4.42157f,
                        x2 = 14.4216f,
                        y2 = 3.75f,
                        x3 = 15.25f,
                        y3 = 3.75f,
                    )
                    curveTo(
                        x1 = 16.0784f,
                        y1 = 3.75f,
                        x2 = 16.75f,
                        y2 = 4.42157f,
                        x3 = 16.75f,
                        y3 = 5.25f,
                    )
                    verticalLineTo(y = 9.3411f)
                    moveTo(x = 13.75f, y = 16.0f)
                    curveTo(
                        x1 = 13.75f,
                        y1 = 14.4901f,
                        x2 = 14.6693f,
                        y2 = 13.1323f,
                        x3 = 16.0712f,
                        y3 = 12.5715f,
                    )
                    lineTo(x = 16.25f, y = 12.5f)
                    verticalLineTo(y = 11.0f)
                    curveTo(
                        x1 = 16.25f,
                        y1 = 10.3866f,
                        x2 = 16.4341f,
                        y2 = 9.81626f,
                        x3 = 16.75f,
                        y3 = 9.3411f,
                    )
                }
            }.build()
            .also { _raisingHand = it }
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
                imageVector = RaisingHand,
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
private var _raisingHand: ImageVector? = null
