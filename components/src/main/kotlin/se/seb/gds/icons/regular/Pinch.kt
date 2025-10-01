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

val Pinch: ImageVector
    get() {
        val current = _pinch
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Pinch",
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
                    moveTo(x = 2.2625f, y = 7.61719f)
                    curveTo(
                        x1 = 1.57917f,
                        y1 = 9.39555f,
                        x2 = 1.57917f,
                        y2 = 10.9951f,
                        x3 = 2.2625f,
                        y3 = 12.7734f,
                    )
                    moveTo(x = 16.0947f, y = 5.85437f)
                    lineTo(x = 11.6336f, y = 8.53244f)
                    lineTo(x = 9.57308f, y = 4.82159f)
                    curveTo(
                        x1 = 9.00409f,
                        y1 = 3.79686f,
                        x2 = 7.74391f,
                        y2 = 3.44577f,
                        x3 = 6.75838f,
                        y3 = 4.03739f,
                    )
                    curveTo(
                        x1 = 5.77286f,
                        y1 = 4.62902f,
                        x2 = 5.4352f,
                        y2 = 5.93933f,
                        x3 = 6.00419f,
                        y3 = 6.96405f,
                    )
                    lineTo(x = 9.09494f, y = 12.5303f)
                    lineTo(x = 7.87114f, y = 12.3365f)
                    curveTo(
                        x1 = 6.74613f,
                        y1 = 12.1584f,
                        x2 = 5.69523f,
                        y2 = 12.9622f,
                        x3 = 5.52389f,
                        y3 = 14.132f,
                    )
                    lineTo(x = 5.3375f, y = 15.4045f)
                    lineTo(x = 10.9198f, y = 19.0656f)
                    curveTo(
                        x1 = 13.2398f,
                        y1 = 20.5871f,
                        x2 = 16.1795f,
                        y2 = 20.6469f,
                        x3 = 18.5549f,
                        y3 = 19.2209f,
                    )
                    curveTo(
                        x1 = 22.0884f,
                        y1 = 17.0997f,
                        x2 = 23.2991f,
                        y2 = 12.4017f,
                        x3 = 21.259f,
                        y3 = 8.72766f,
                    )
                    lineTo(x = 20.3167f, y = 7.03066f)
                    curveTo(
                        x1 = 19.4632f,
                        y1 = 5.49357f,
                        x2 = 17.573f,
                        y2 = 4.96693f,
                        x3 = 16.0947f,
                        y3 = 5.85437f,
                    )
                    close()
                }
            }.build()
            .also { _pinch = it }
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
                imageVector = Pinch,
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
private var _pinch: ImageVector? = null
