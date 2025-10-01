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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val EmojiSmiley: ImageVector
    get() {
        val current = _emojiSmiley
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.EmojiSmiley",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 12.0f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 6.47715f,
                        x2 = 6.47715f,
                        y2 = 2.0f,
                        x3 = 12.0f,
                        y3 = 2.0f,
                    )
                    curveTo(
                        x1 = 17.5228f,
                        y1 = 2.0f,
                        x2 = 22.0f,
                        y2 = 6.47715f,
                        x3 = 22.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 17.5228f,
                        x2 = 17.5228f,
                        y2 = 22.0f,
                        x3 = 12.0f,
                        y3 = 22.0f,
                    )
                    curveTo(
                        x1 = 6.47715f,
                        y1 = 22.0f,
                        x2 = 2.0f,
                        y2 = 17.5228f,
                        x3 = 2.0f,
                        y3 = 12.0f,
                    )
                    close()
                    moveTo(x = 9.5f, y = 10.5f)
                    curveTo(
                        x1 = 10.3284f,
                        y1 = 10.5f,
                        x2 = 11.0f,
                        y2 = 9.82843f,
                        x3 = 11.0f,
                        y3 = 9.0f,
                    )
                    curveTo(
                        x1 = 11.0f,
                        y1 = 8.17157f,
                        x2 = 10.3284f,
                        y2 = 7.5f,
                        x3 = 9.5f,
                        y3 = 7.5f,
                    )
                    curveTo(
                        x1 = 8.67157f,
                        y1 = 7.5f,
                        x2 = 8.0f,
                        y2 = 8.17157f,
                        x3 = 8.0f,
                        y3 = 9.0f,
                    )
                    curveTo(
                        x1 = 8.0f,
                        y1 = 9.82843f,
                        x2 = 8.67157f,
                        y2 = 10.5f,
                        x3 = 9.5f,
                        y3 = 10.5f,
                    )
                    close()
                    moveTo(x = 16.0f, y = 9.0f)
                    curveTo(
                        x1 = 16.0f,
                        y1 = 9.82843f,
                        x2 = 15.3284f,
                        y2 = 10.5f,
                        x3 = 14.5f,
                        y3 = 10.5f,
                    )
                    curveTo(
                        x1 = 13.6716f,
                        y1 = 10.5f,
                        x2 = 13.0f,
                        y2 = 9.82843f,
                        x3 = 13.0f,
                        y3 = 9.0f,
                    )
                    curveTo(
                        x1 = 13.0f,
                        y1 = 8.17157f,
                        x2 = 13.6716f,
                        y2 = 7.5f,
                        x3 = 14.5f,
                        y3 = 7.5f,
                    )
                    curveTo(
                        x1 = 15.3284f,
                        y1 = 7.5f,
                        x2 = 16.0f,
                        y2 = 8.17157f,
                        x3 = 16.0f,
                        y3 = 9.0f,
                    )
                    close()
                    moveTo(x = 6.25f, y = 12.0f)
                    curveTo(
                        x1 = 6.25f,
                        y1 = 11.5858f,
                        x2 = 5.91421f,
                        y2 = 11.25f,
                        x3 = 5.5f,
                        y3 = 11.25f,
                    )
                    curveTo(
                        x1 = 5.08579f,
                        y1 = 11.25f,
                        x2 = 4.75f,
                        y2 = 11.5858f,
                        x3 = 4.75f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 4.75f,
                        y1 = 16.0041f,
                        x2 = 7.99594f,
                        y2 = 19.25f,
                        x3 = 12.0f,
                        y3 = 19.25f,
                    )
                    curveTo(
                        x1 = 16.0041f,
                        y1 = 19.25f,
                        x2 = 19.25f,
                        y2 = 16.0041f,
                        x3 = 19.25f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 19.25f,
                        y1 = 11.5858f,
                        x2 = 18.9142f,
                        y2 = 11.25f,
                        x3 = 18.5f,
                        y3 = 11.25f,
                    )
                    curveTo(
                        x1 = 18.0858f,
                        y1 = 11.25f,
                        x2 = 17.75f,
                        y2 = 11.5858f,
                        x3 = 17.75f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 17.75f,
                        y1 = 15.1756f,
                        x2 = 15.1756f,
                        y2 = 17.75f,
                        x3 = 12.0f,
                        y3 = 17.75f,
                    )
                    curveTo(
                        x1 = 8.82436f,
                        y1 = 17.75f,
                        x2 = 6.25f,
                        y2 = 15.1756f,
                        x3 = 6.25f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _emojiSmiley = it }
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
                imageVector = EmojiSmiley,
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
private var _emojiSmiley: ImageVector? = null
