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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Pause: ImageVector
    get() {
        val current = _pause
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Pause",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 4.75f, y = 4.75f)
                    curveTo(x1 = 4.75f, y1 = 4.19772f, x2 = 5.19772f, y2 = 3.75f, x3 = 5.75f, y3 = 3.75f)
                    horizontalLineTo(x = 8.25f)
                    curveTo(x1 = 8.80228f, y1 = 3.75f, x2 = 9.25f, y2 = 4.19772f, x3 = 9.25f, y3 = 4.75f)
                    verticalLineTo(y = 19.25f)
                    curveTo(x1 = 9.25f, y1 = 19.8023f, x2 = 8.80228f, y2 = 20.25f, x3 = 8.25f, y3 = 20.25f)
                    horizontalLineTo(x = 5.75f)
                    curveTo(x1 = 5.19772f, y1 = 20.25f, x2 = 4.75f, y2 = 19.8023f, x3 = 4.75f, y3 = 19.25f)
                    verticalLineTo(y = 4.75f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 14.75f, y = 4.75f)
                    curveTo(x1 = 14.75f, y1 = 4.19772f, x2 = 15.1977f, y2 = 3.75f, x3 = 15.75f, y3 = 3.75f)
                    horizontalLineTo(x = 18.25f)
                    curveTo(x1 = 18.8023f, y1 = 3.75f, x2 = 19.25f, y2 = 4.19772f, x3 = 19.25f, y3 = 4.75f)
                    verticalLineTo(y = 19.25f)
                    curveTo(x1 = 19.25f, y1 = 19.8023f, x2 = 18.8023f, y2 = 20.25f, x3 = 18.25f, y3 = 20.25f)
                    horizontalLineTo(x = 15.75f)
                    curveTo(x1 = 15.1977f, y1 = 20.25f, x2 = 14.75f, y2 = 19.8023f, x3 = 14.75f, y3 = 19.25f)
                    verticalLineTo(y = 4.75f)
                    close()
                }
            }.build()
            .also { _pause = it }
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
                imageVector = Pause,
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
private var _pause: ImageVector? = null
