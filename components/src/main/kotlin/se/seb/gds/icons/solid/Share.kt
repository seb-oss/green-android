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

val Share: ImageVector
    get() {
        val current = _share
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Share",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.0f, y = 2.0f)
                curveTo(x1 = 14.7909f, y1 = 2.0f, x2 = 13.0f, y2 = 3.79086f, x3 = 13.0f, y3 = 6.0f)
                curveTo(x1 = 13.0f, y1 = 6.41005f, x2 = 13.0617f, y2 = 6.80569f, x3 = 13.1763f, y3 = 7.17815f)
                lineTo(x = 9.11967f, y = 9.49624f)
                curveTo(x1 = 8.38653f, y1 = 8.58393f, x2 = 7.26146f, y2 = 8.0f, x3 = 6.0f, y3 = 8.0f)
                curveTo(x1 = 3.79086f, y1 = 8.0f, x2 = 2.0f, y2 = 9.79086f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 14.2091f, x2 = 3.79086f, y2 = 16.0f, x3 = 6.0f, y3 = 16.0f)
                curveTo(x1 = 7.26154f, y1 = 16.0f, x2 = 8.38667f, y2 = 15.416f, x3 = 9.1198f, y3 = 14.5036f)
                lineTo(x = 13.1764f, y = 16.8216f)
                curveTo(x1 = 13.0617f, y1 = 17.1942f, x2 = 13.0f, y2 = 17.5899f, x3 = 13.0f, y3 = 18.0f)
                curveTo(x1 = 13.0f, y1 = 20.2091f, x2 = 14.7909f, y2 = 22.0f, x3 = 17.0f, y3 = 22.0f)
                curveTo(x1 = 19.2091f, y1 = 22.0f, x2 = 21.0f, y2 = 20.2091f, x3 = 21.0f, y3 = 18.0f)
                curveTo(x1 = 21.0f, y1 = 15.7909f, x2 = 19.2091f, y2 = 14.0f, x3 = 17.0f, y3 = 14.0f)
                curveTo(x1 = 15.7385f, y1 = 14.0f, x2 = 14.6134f, y2 = 14.5839f, x3 = 13.8803f, y3 = 15.4963f)
                lineTo(x = 9.82366f, y = 13.1782f)
                curveTo(x1 = 9.9383f, y1 = 12.8057f, x2 = 10.0f, y2 = 12.4101f, x3 = 10.0f, y3 = 12.0f)
                curveTo(x1 = 10.0f, y1 = 11.5899f, x2 = 9.93827f, y2 = 11.1941f, x3 = 9.8236f, y3 = 10.8216f)
                lineTo(x = 13.8802f, y = 8.50357f)
                curveTo(x1 = 14.6133f, y1 = 9.41599f, x2 = 15.7385f, y2 = 10.0f, x3 = 17.0f, y3 = 10.0f)
                curveTo(x1 = 19.2091f, y1 = 10.0f, x2 = 21.0f, y2 = 8.20914f, x3 = 21.0f, y3 = 6.0f)
                curveTo(x1 = 21.0f, y1 = 3.79086f, x2 = 19.2091f, y2 = 2.0f, x3 = 17.0f, y3 = 2.0f)
                close()
            }
        }.build().also { _share = it }
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
                imageVector = Share,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _share: ImageVector? = null
