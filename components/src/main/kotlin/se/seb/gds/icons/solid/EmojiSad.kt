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

internal val EmojiSad: ImageVector
    get() {
        val current = _emojiSad
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.EmojiSad",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 6.47715f, x2 = 17.5228f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                close()
                moveTo(x = 9.70221f, y = 15.9519f)
                curveTo(x1 = 10.9714f, y1 = 14.6827f, x2 = 13.0292f, y2 = 14.6827f, x3 = 14.2984f, y3 = 15.9519f)
                curveTo(x1 = 14.5913f, y1 = 16.2448f, x2 = 15.0662f, y2 = 16.2448f, x3 = 15.3591f, y3 = 15.9519f)
                curveTo(x1 = 15.6519f, y1 = 15.659f, x2 = 15.6519f, y2 = 15.1841f, x3 = 15.3591f, y3 = 14.8912f)
                curveTo(x1 = 13.5041f, y1 = 13.0363f, x2 = 10.4965f, y2 = 13.0363f, x3 = 8.64154f, y3 = 14.8912f)
                curveTo(x1 = 8.34865f, y1 = 15.1841f, x2 = 8.34865f, y2 = 15.659f, x3 = 8.64154f, y3 = 15.9519f)
                curveTo(x1 = 8.93444f, y1 = 16.2448f, x2 = 9.40931f, y2 = 16.2448f, x3 = 9.70221f, y3 = 15.9519f)
                close()
                moveTo(x = 14.75f, y = 8.25f)
                curveTo(x1 = 14.0596f, y1 = 8.25f, x2 = 13.5f, y2 = 8.80964f, x3 = 13.5f, y3 = 9.5f)
                curveTo(x1 = 13.5f, y1 = 10.1904f, x2 = 14.0596f, y2 = 10.75f, x3 = 14.75f, y3 = 10.75f)
                curveTo(x1 = 15.4404f, y1 = 10.75f, x2 = 16.0f, y2 = 10.1904f, x3 = 16.0f, y3 = 9.5f)
                curveTo(x1 = 16.0f, y1 = 8.80964f, x2 = 15.4404f, y2 = 8.25f, x3 = 14.75f, y3 = 8.25f)
                close()
                moveTo(x = 8.0f, y = 9.5f)
                curveTo(x1 = 8.0f, y1 = 8.80964f, x2 = 8.55964f, y2 = 8.25f, x3 = 9.25f, y3 = 8.25f)
                curveTo(x1 = 9.94036f, y1 = 8.25f, x2 = 10.5f, y2 = 8.80964f, x3 = 10.5f, y3 = 9.5f)
                curveTo(x1 = 10.5f, y1 = 10.1904f, x2 = 9.94036f, y2 = 10.75f, x3 = 9.25f, y3 = 10.75f)
                curveTo(x1 = 8.55964f, y1 = 10.75f, x2 = 8.0f, y2 = 10.1904f, x3 = 8.0f, y3 = 9.5f)
                close()
            }
        }.build().also { _emojiSad = it }
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
                imageVector = EmojiSad,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _emojiSad: ImageVector? = null
