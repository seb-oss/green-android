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

val UmbrellaSecurity: ImageVector
    get() {
        val current = _umbrellaSecurity
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.UmbrellaSecurity",
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
                    moveTo(x = 12.0f, y = 15.25f)
                    verticalLineTo(y = 19.3267f)
                    curveTo(
                        x1 = 12.0f,
                        y1 = 20.3889f,
                        x2 = 11.1389f,
                        y2 = 21.25f,
                        x3 = 10.0767f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 9.15988f,
                        y1 = 21.25f,
                        x2 = 8.37054f,
                        y2 = 20.6029f,
                        x3 = 8.19074f,
                        y3 = 19.7039f,
                    )
                    lineTo(x = 7.99996f, y = 18.75f)
                    moveTo(x = 12.0f, y = 2.75f)
                    verticalLineTo(y = 4.75f)
                    moveTo(x = 12.0f, y = 4.75f)
                    curveTo(
                        x1 = 7.43826f,
                        y1 = 4.75f,
                        x2 = 3.62751f,
                        y2 = 7.96518f,
                        x3 = 2.71021f,
                        y3 = 12.253f,
                    )
                    horizontalLineTo(x = 21.2897f)
                    curveTo(
                        x1 = 20.3724f,
                        y1 = 7.96518f,
                        x2 = 16.5617f,
                        y2 = 4.75f,
                        x3 = 12.0f,
                        y3 = 4.75f,
                    )
                    close()
                }
            }.build()
            .also { _umbrellaSecurity = it }
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
                imageVector = UmbrellaSecurity,
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
private var _umbrellaSecurity: ImageVector? = null
