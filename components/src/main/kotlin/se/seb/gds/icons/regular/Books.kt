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

val Books: ImageVector
    get() {
        val current = _books
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Books",
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
                    moveTo(x = 6.75f, y = 20.25f)
                    verticalLineTo(y = 5.75f)
                    horizontalLineTo(x = 2.75f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 6.75f)
                    close()
                    moveTo(x = 6.75f, y = 20.25f)
                    horizontalLineTo(x = 13.25f)
                    verticalLineTo(y = 3.75f)
                    horizontalLineTo(x = 6.75f)
                    verticalLineTo(y = 20.25f)
                    close()
                    moveTo(x = 6.75f, y = 7.875f)
                    horizontalLineTo(x = 13.25f)
                    moveTo(x = 6.75f, y = 16.125f)
                    horizontalLineTo(x = 13.25f)
                    moveTo(x = 14.0f, y = 7.25f)
                    lineTo(x = 18.3467f, y = 6.08531f)
                    lineTo(x = 21.8407f, y = 19.1253f)
                    lineTo(x = 17.4941f, y = 20.29f)
                    lineTo(x = 14.0f, y = 7.25f)
                    close()
                }
            }.build()
            .also { _books = it }
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
                imageVector = Books,
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
private var _books: ImageVector? = null
