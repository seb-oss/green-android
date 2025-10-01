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

val Ai: ImageVector
    get() {
        val current = _ai
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Ai",
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
                    moveTo(x = 19.25f, y = 13.0f)
                    curveTo(
                        x1 = 14.1955f,
                        y1 = 13.4375f,
                        x2 = 11.4375f,
                        y2 = 16.1955f,
                        x3 = 11.0f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 10.544f,
                        y1 = 16.1169f,
                        x2 = 7.80041f,
                        y2 = 13.5721f,
                        x3 = 2.75f,
                        y3 = 13.0f,
                    )
                    curveTo(
                        x1 = 7.88024f,
                        y1 = 12.4083f,
                        x2 = 10.4083f,
                        y2 = 9.88024f,
                        x3 = 11.0f,
                        y3 = 4.75f,
                    )
                    curveTo(
                        x1 = 11.5721f,
                        y1 = 9.80041f,
                        x2 = 14.1169f,
                        y2 = 12.544f,
                        x3 = 19.25f,
                        y3 = 13.0f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 19.7898f, y = 1.25884f)
                    curveTo(
                        x1 = 19.7731f,
                        y1 = 1.11151f,
                        x2 = 19.6486f,
                        y2 = 1.00015f,
                        x3 = 19.5003f,
                        y3 = 1.0f,
                    )
                    curveTo(
                        x1 = 19.352f,
                        y1 = 0.999849f,
                        x2 = 19.2272f,
                        y2 = 1.11096f,
                        x3 = 19.2103f,
                        y3 = 1.25825f,
                    )
                    curveTo(
                        x1 = 19.0998f,
                        y1 = 2.21602f,
                        x2 = 18.8134f,
                        y2 = 2.8895f,
                        x3 = 18.3515f,
                        y3 = 3.35146f,
                    )
                    curveTo(
                        x1 = 17.8895f,
                        y1 = 3.81343f,
                        x2 = 17.216f,
                        y2 = 4.09979f,
                        x3 = 16.2582f,
                        y3 = 4.21025f,
                    )
                    curveTo(
                        x1 = 16.111f,
                        y1 = 4.22724f,
                        x2 = 15.9998f,
                        y2 = 4.35203f,
                        x3 = 16.0f,
                        y3 = 4.5003f,
                    )
                    curveTo(
                        x1 = 16.0002f,
                        y1 = 4.64857f,
                        x2 = 16.1115f,
                        y2 = 4.77313f,
                        x3 = 16.2588f,
                        y3 = 4.78981f,
                    )
                    curveTo(
                        x1 = 17.2008f,
                        y1 = 4.89651f,
                        x2 = 17.8886f,
                        y2 = 5.18275f,
                        x3 = 18.3615f,
                        y3 = 5.64713f,
                    )
                    curveTo(
                        x1 = 18.8327f,
                        y1 = 6.10977f,
                        x2 = 19.125f,
                        y2 = 6.7831f,
                        x3 = 19.2095f,
                        y3 = 7.73414f,
                    )
                    curveTo(
                        x1 = 19.2229f,
                        y1 = 7.88476f,
                        x2 = 19.3491f,
                        y2 = 8.00017f,
                        x3 = 19.5003f,
                        y3 = 8.0f,
                    )
                    curveTo(
                        x1 = 19.6515f,
                        y1 = 7.99983f,
                        x2 = 19.7775f,
                        y2 = 7.88413f,
                        x3 = 19.7906f,
                        y3 = 7.73349f,
                    )
                    curveTo(
                        x1 = 19.8716f,
                        y1 = 6.79809f,
                        x2 = 20.1636f,
                        y2 = 6.11059f,
                        x3 = 20.6371f,
                        y3 = 5.6371f,
                    )
                    curveTo(
                        x1 = 21.1106f,
                        y1 = 5.16361f,
                        x2 = 21.7981f,
                        y2 = 4.87155f,
                        x3 = 22.7335f,
                        y3 = 4.79058f,
                    )
                    curveTo(
                        x1 = 22.8841f,
                        y1 = 4.77754f,
                        x2 = 22.9998f,
                        y2 = 4.65154f,
                        x3 = 23.0f,
                        y3 = 4.50033f,
                    )
                    curveTo(
                        x1 = 23.0002f,
                        y1 = 4.34912f,
                        x2 = 22.8848f,
                        y2 = 4.22286f,
                        x3 = 22.7341f,
                        y3 = 4.20948f,
                    )
                    curveTo(
                        x1 = 21.7831f,
                        y1 = 4.125f,
                        x2 = 21.1098f,
                        y2 = 3.83266f,
                        x3 = 20.6471f,
                        y3 = 3.36151f,
                    )
                    curveTo(
                        x1 = 20.1827f,
                        y1 = 2.88857f,
                        x2 = 19.8965f,
                        y2 = 2.20078f,
                        x3 = 19.7898f,
                        y3 = 1.25884f,
                    )
                    close()
                }
            }.build()
            .also { _ai = it }
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
                imageVector = Ai,
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
private var _ai: ImageVector? = null
