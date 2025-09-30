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

val Book: ImageVector
    get() {
        val current = _book
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Book",
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
                    moveTo(x = 19.25f, y = 12.0f)
                    verticalLineTo(y = 16.75f)
                    horizontalLineTo(x = 7.0f)
                    curveTo(x1 = 5.75736f, y1 = 16.75f, x2 = 4.75f, y2 = 17.7574f, x3 = 4.75f, y3 = 19.0f)
                    curveTo(x1 = 4.75f, y1 = 20.2426f, x2 = 5.75736f, y2 = 21.25f, x3 = 7.0f, y3 = 21.25f)
                    horizontalLineTo(x = 10.0f)
                    moveTo(x = 8.75f, y = 7.0f)
                    horizontalLineTo(x = 15.25f)
                    moveTo(x = 8.75f, y = 11.0f)
                    horizontalLineTo(x = 12.25f)
                    moveTo(x = 6.75f, y = 2.75f)
                    horizontalLineTo(x = 19.25f)
                    verticalLineTo(y = 21.25f)
                    horizontalLineTo(x = 6.75f)
                    curveTo(x1 = 5.64543f, y1 = 21.25f, x2 = 4.75f, y2 = 20.3546f, x3 = 4.75f, y3 = 19.25f)
                    verticalLineTo(y = 4.75f)
                    curveTo(x1 = 4.75f, y1 = 3.64543f, x2 = 5.64543f, y2 = 2.75f, x3 = 6.75f, y3 = 2.75f)
                    close()
                }
            }.build()
            .also { _book = it }
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
                imageVector = Book,
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
private var _book: ImageVector? = null
