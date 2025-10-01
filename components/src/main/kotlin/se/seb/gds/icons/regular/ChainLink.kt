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

val ChainLink: ImageVector
    get() {
        val current = _chainLink
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ChainLink",
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
                    moveTo(x = 9.75027f, y = 5.52371f)
                    lineTo(x = 10.7168f, y = 4.55722f)
                    curveTo(
                        x1 = 13.1264f,
                        y1 = 2.14759f,
                        x2 = 17.0332f,
                        y2 = 2.14759f,
                        x3 = 19.4428f,
                        y3 = 4.55722f,
                    )
                    curveTo(
                        x1 = 21.8524f,
                        y1 = 6.96684f,
                        x2 = 21.8524f,
                        y2 = 10.8736f,
                        x3 = 19.4428f,
                        y3 = 13.2832f,
                    )
                    lineTo(x = 18.4742f, y = 14.2519f)
                    moveTo(x = 5.52886f, y = 9.74513f)
                    lineTo(x = 4.55722f, y = 10.7168f)
                    curveTo(
                        x1 = 2.14759f,
                        y1 = 13.1264f,
                        x2 = 2.1476f,
                        y2 = 17.0332f,
                        x3 = 4.55722f,
                        y3 = 19.4428f,
                    )
                    curveTo(
                        x1 = 6.96684f,
                        y1 = 21.8524f,
                        x2 = 10.8736f,
                        y2 = 21.8524f,
                        x3 = 13.2832f,
                        y3 = 19.4428f,
                    )
                    lineTo(x = 14.2478f, y = 18.4782f)
                    moveTo(x = 9.5f, y = 14.5f)
                    lineTo(x = 14.5f, y = 9.5f)
                }
            }.build()
            .also { _chainLink = it }
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
                imageVector = ChainLink,
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
private var _chainLink: ImageVector? = null
