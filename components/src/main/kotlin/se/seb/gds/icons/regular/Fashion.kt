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

val Fashion: ImageVector
    get() {
        val current = _fashion
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Fashion",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 20.7125f, y = 11.5768f)
                    lineTo(x = 22.25f, y = 7.25f)
                    lineTo(x = 15.075f, y = 3.75f)
                    curveTo(
                        x1 = 14.0732f,
                        y1 = 7.01444f,
                        x2 = 9.92685f,
                        y2 = 7.01444f,
                        x3 = 8.925f,
                        y3 = 3.75f,
                    )
                    lineTo(x = 1.75f, y = 7.25f)
                    lineTo(x = 3.2875f, y = 11.5768f)
                    lineTo(x = 5.75f, y = 10.45f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 18.25f)
                    verticalLineTo(y = 10.45f)
                    lineTo(x = 20.7125f, y = 11.5768f)
                    close()
                }
            }.build()
            .also { _fashion = it }
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
                imageVector = Fashion,
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
private var _fashion: ImageVector? = null
