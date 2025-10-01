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

val Bookmark: ImageVector
    get() {
        val current = _bookmark
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Bookmark",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.75f, y = 2.0f)
                    curveTo(
                        x1 = 4.33579f,
                        y1 = 2.0f,
                        x2 = 4.0f,
                        y2 = 2.33579f,
                        x3 = 4.0f,
                        y3 = 2.75f,
                    )
                    verticalLineTo(y = 21.25f)
                    curveTo(
                        x1 = 4.0f,
                        y1 = 21.5153f,
                        x2 = 4.14021f,
                        y2 = 21.7609f,
                        x3 = 4.36871f,
                        y3 = 21.8958f,
                    )
                    curveTo(
                        x1 = 4.5972f,
                        y1 = 22.0307f,
                        x2 = 4.87998f,
                        y2 = 22.0349f,
                        x3 = 5.11231f,
                        y3 = 21.9067f,
                    )
                    lineTo(x = 12.0f, y = 18.1066f)
                    lineTo(x = 18.8877f, y = 21.9067f)
                    curveTo(
                        x1 = 19.12f,
                        y1 = 22.0349f,
                        x2 = 19.4028f,
                        y2 = 22.0307f,
                        x3 = 19.6313f,
                        y3 = 21.8958f,
                    )
                    curveTo(
                        x1 = 19.8598f,
                        y1 = 21.7609f,
                        x2 = 20.0f,
                        y2 = 21.5153f,
                        x3 = 20.0f,
                        y3 = 21.25f,
                    )
                    verticalLineTo(y = 2.75f)
                    curveTo(
                        x1 = 20.0f,
                        y1 = 2.33579f,
                        x2 = 19.6642f,
                        y2 = 2.0f,
                        x3 = 19.25f,
                        y3 = 2.0f,
                    )
                    horizontalLineTo(x = 4.75f)
                    close()
                }
            }.build()
            .also { _bookmark = it }
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
                imageVector = Bookmark,
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
private var _bookmark: ImageVector? = null
