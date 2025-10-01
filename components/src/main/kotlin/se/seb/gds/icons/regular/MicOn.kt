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

val MicOn: ImageVector
    get() {
        val current = _micOn
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.MicOn",
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
                    moveTo(x = 12.0f, y = 19.0f)
                    curveTo(
                        x1 = 15.0754f,
                        y1 = 19.0f,
                        x2 = 17.7186f,
                        y2 = 17.1489f,
                        x3 = 18.8759f,
                        y3 = 14.5f,
                    )
                    moveTo(x = 12.0f, y = 19.0f)
                    curveTo(
                        x1 = 8.92448f,
                        y1 = 19.0f,
                        x2 = 6.28136f,
                        y2 = 17.1489f,
                        x3 = 5.12402f,
                        y3 = 14.5f,
                    )
                    moveTo(x = 12.0f, y = 19.0f)
                    verticalLineTo(y = 21.25f)
                    moveTo(x = 12.0f, y = 15.75f)
                    curveTo(
                        x1 = 9.65274f,
                        y1 = 15.75f,
                        x2 = 7.74995f,
                        y2 = 13.8472f,
                        x3 = 7.74995f,
                        y3 = 11.5f,
                    )
                    verticalLineTo(y = 7.0f)
                    curveTo(
                        x1 = 7.74995f,
                        y1 = 4.65279f,
                        x2 = 9.65274f,
                        y2 = 2.75f,
                        x3 = 12.0f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 14.3472f,
                        y1 = 2.75f,
                        x2 = 16.25f,
                        y2 = 4.65279f,
                        x3 = 16.25f,
                        y3 = 7.0f,
                    )
                    verticalLineTo(y = 11.5f)
                    curveTo(
                        x1 = 16.25f,
                        y1 = 13.8472f,
                        x2 = 14.3472f,
                        y2 = 15.75f,
                        x3 = 12.0f,
                        y3 = 15.75f,
                    )
                    close()
                }
            }.build()
            .also { _micOn = it }
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
                imageVector = MicOn,
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
private var _micOn: ImageVector? = null
