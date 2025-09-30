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

val ThumbsUp: ImageVector
    get() {
        val current = _thumbsUp
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ThumbsUp",
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
                    moveTo(x = 6.75f, y = 10.75f)
                    horizontalLineTo(x = 2.75f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 6.75f)
                    moveTo(x = 6.75f, y = 20.25f)
                    verticalLineTo(y = 11.0f)
                    lineTo(x = 11.0f, y = 2.75f)
                    horizontalLineTo(x = 11.6156f)
                    curveTo(x1 = 12.843f, y1 = 2.75f, x2 = 13.7808f, y2 = 3.84535f, x3 = 13.5917f, y3 = 5.0581f)
                    lineTo(x = 13.0161f, y = 8.75f)
                    horizontalLineTo(x = 18.2589f)
                    curveTo(x1 = 20.0956f, y1 = 8.75f, x2 = 21.5011f, y2 = 10.3856f, x3 = 21.2248f, y3 = 12.2013f)
                    lineTo(x = 20.3878f, y = 17.7013f)
                    curveTo(x1 = 20.1648f, y1 = 19.167f, x2 = 18.9046f, y2 = 20.25f, x3 = 17.422f, y3 = 20.25f)
                    horizontalLineTo(x = 6.75f)
                    close()
                }
            }.build()
            .also { _thumbsUp = it }
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
                imageVector = ThumbsUp,
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
private var _thumbsUp: ImageVector? = null
