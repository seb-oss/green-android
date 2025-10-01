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

val Headphones: ImageVector
    get() {
        val current = _headphones
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Headphones",
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
                    moveTo(x = 3.75f, y = 13.75f)
                    verticalLineTo(y = 12.0f)
                    curveTo(
                        x1 = 3.75f,
                        y1 = 7.44365f,
                        x2 = 7.44365f,
                        y2 = 3.75f,
                        x3 = 12.0f,
                        y3 = 3.75f,
                    )
                    curveTo(
                        x1 = 16.5563f,
                        y1 = 3.75f,
                        x2 = 20.25f,
                        y2 = 7.44365f,
                        x3 = 20.25f,
                        y3 = 12.0f,
                    )
                    verticalLineTo(y = 13.75f)
                    moveTo(x = 3.75f, y = 13.75f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 7.75f)
                    verticalLineTo(y = 13.75f)
                    horizontalLineTo(x = 3.75f)
                    close()
                    moveTo(x = 20.25f, y = 13.75f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 16.25f)
                    verticalLineTo(y = 13.75f)
                    horizontalLineTo(x = 20.25f)
                    close()
                }
            }.build()
            .also { _headphones = it }
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
                imageVector = Headphones,
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
private var _headphones: ImageVector? = null
