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

val MicOff: ImageVector
    get() {
        val current = _micOff
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.MicOff",
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
                    moveTo(x = 16.25f, y = 11.5f)
                    verticalLineTo(y = 7.0f)
                    curveTo(
                        x1 = 16.25f,
                        y1 = 4.65279f,
                        x2 = 14.3472f,
                        y2 = 2.75f,
                        x3 = 12.0f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 10.6334f,
                        y1 = 2.75f,
                        x2 = 9.41741f,
                        y2 = 3.39504f,
                        x3 = 8.63994f,
                        y3 = 4.39727f,
                    )
                    moveTo(x = 3.0f, y = 3.0f)
                    lineTo(x = 7.75f, y = 7.75f)
                    moveTo(x = 7.75f, y = 7.75f)
                    verticalLineTo(y = 11.5f)
                    curveTo(
                        x1 = 7.75f,
                        y1 = 13.8472f,
                        x2 = 9.65279f,
                        y2 = 15.75f,
                        x3 = 12.0f,
                        y3 = 15.75f,
                    )
                    curveTo(
                        x1 = 13.0463f,
                        y1 = 15.75f,
                        x2 = 14.0043f,
                        y2 = 15.3719f,
                        x3 = 14.7449f,
                        y3 = 14.7449f,
                    )
                    moveTo(x = 7.75f, y = 7.75f)
                    lineTo(x = 14.7449f, y = 14.7449f)
                    moveTo(x = 14.7449f, y = 14.7449f)
                    lineTo(x = 17.0474f, y = 17.0474f)
                    moveTo(x = 21.0f, y = 21.0f)
                    lineTo(x = 17.0474f, y = 17.0474f)
                    moveTo(x = 12.0f, y = 19.0f)
                    curveTo(
                        x1 = 8.92453f,
                        y1 = 19.0f,
                        x2 = 6.2814f,
                        y2 = 17.1489f,
                        x3 = 5.12407f,
                        y3 = 14.5f,
                    )
                    moveTo(x = 12.0f, y = 19.0f)
                    verticalLineTo(y = 21.25f)
                    moveTo(x = 12.0f, y = 19.0f)
                    curveTo(
                        x1 = 13.9439f,
                        y1 = 19.0f,
                        x2 = 15.715f,
                        y2 = 18.2605f,
                        x3 = 17.0474f,
                        y3 = 17.0474f,
                    )
                }
            }.build()
            .also { _micOff = it }
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
                imageVector = MicOff,
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
private var _micOff: ImageVector? = null
