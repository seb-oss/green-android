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

internal val BookmarkRemove: ImageVector
    get() {
        val current = _bookmarkRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BookmarkRemove",
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
                moveTo(x = 1.75f, y = 15.25f)
                lineTo(x = 4.75f, y = 14.1524f)
                moveTo(x = 22.25f, y = 7.75f)
                lineTo(x = 19.25f, y = 8.84756f)
                moveTo(x = 19.25f, y = 8.84756f)
                verticalLineTo(y = 2.75f)
                horizontalLineTo(x = 4.75f)
                verticalLineTo(y = 14.1524f)
                moveTo(x = 19.25f, y = 8.84756f)
                lineTo(x = 4.75f, y = 14.1524f)
                moveTo(x = 19.25f, y = 12.75f)
                verticalLineTo(y = 21.25f)
                lineTo(x = 12.0f, y = 17.25f)
                lineTo(x = 4.75f, y = 21.25f)
                verticalLineTo(y = 18.25f)
            }
        }.build().also { _bookmarkRemove = it }
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
                imageVector = BookmarkRemove,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bookmarkRemove: ImageVector? = null
