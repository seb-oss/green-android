package se.seb.gds.icons.solid

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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val BookmarkRemove: ImageVector
    get() {
        val current = _bookmarkRemove
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BookmarkRemove",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.75f, y = 2.0f)
                    curveTo(x1 = 4.33579f, y1 = 2.0f, x2 = 4.0f, y2 = 2.33579f, x3 = 4.0f, y3 = 2.75f)
                    verticalLineTo(y = 13.6282f)
                    lineTo(x = 1.49233f, y = 14.5456f)
                    curveTo(x1 = 1.10334f, y1 = 14.688f, x2 = 0.903363f, y2 = 15.1187f, x3 = 1.04568f, y3 = 15.5077f)
                    curveTo(x1 = 1.18799f, y1 = 15.8967f, x2 = 1.61871f, y2 = 16.0966f, x3 = 2.00771f, y3 = 15.9543f)
                    lineTo(x = 22.5077f, y = 8.45433f)
                    curveTo(x1 = 22.8967f, y1 = 8.31202f, x2 = 23.0967f, y2 = 7.8813f, x3 = 22.9544f, y3 = 7.4923f)
                    curveTo(x1 = 22.812f, y1 = 7.10331f, x2 = 22.3813f, y2 = 6.90333f, x3 = 21.9923f, y3 = 7.04565f)
                    lineTo(x = 20.0f, y = 7.77455f)
                    verticalLineTo(y = 2.75f)
                    curveTo(x1 = 20.0f, y1 = 2.33579f, x2 = 19.6642f, y2 = 2.0f, x3 = 19.25f, y3 = 2.0f)
                    horizontalLineTo(x = 4.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.0f, y = 21.25f)
                    verticalLineTo(y = 16.8227f)
                    lineTo(x = 20.0f, y = 10.969f)
                    verticalLineTo(y = 21.25f)
                    curveTo(x1 = 20.0f, y1 = 21.5153f, x2 = 19.8598f, y2 = 21.7609f, x3 = 19.6313f, y3 = 21.8958f)
                    curveTo(x1 = 19.4028f, y1 = 22.0307f, x2 = 19.12f, y2 = 22.0349f, x3 = 18.8877f, y3 = 21.9067f)
                    lineTo(x = 12.0f, y = 18.1066f)
                    lineTo(x = 5.11231f, y = 21.9067f)
                    curveTo(x1 = 4.87998f, y1 = 22.0349f, x2 = 4.5972f, y2 = 22.0307f, x3 = 4.36871f, y3 = 21.8958f)
                    curveTo(x1 = 4.14021f, y1 = 21.7609f, x2 = 4.0f, y2 = 21.5153f, x3 = 4.0f, y3 = 21.25f)
                    close()
                }
            }.build()
            .also { _bookmarkRemove = it }
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
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bookmarkRemove: ImageVector? = null
