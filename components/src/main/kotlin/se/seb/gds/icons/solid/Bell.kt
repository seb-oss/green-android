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

internal val Bell: ImageVector
    get() {
        val current = _bell
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Bell",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 8.13655f, y1 = 2.0f, x2 = 4.94782f, y2 = 5.0198f, x3 = 4.75447f, y3 = 8.87114f)
                lineTo(x = 4.556f, y = 12.8003f)
                lineTo(x = 3.0834f, y = 15.6563f)
                curveTo(x1 = 3.02859f, y1 = 15.7626f, x2 = 3.0f, y2 = 15.8804f, x3 = 3.0f, y3 = 16.0f)
                verticalLineTo(y = 17.25f)
                curveTo(x1 = 3.0f, y1 = 17.6642f, x2 = 3.33579f, y2 = 18.0f, x3 = 3.75f, y3 = 18.0f)
                horizontalLineTo(x = 7.30888f)
                curveTo(x1 = 7.66846f, y1 = 20.267f, x2 = 9.63185f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 14.3682f, y1 = 22.0f, x2 = 16.3315f, y2 = 20.267f, x3 = 16.6911f, y3 = 18.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 18.0f, x2 = 21.0f, y2 = 17.6642f, x3 = 21.0f, y3 = 17.25f)
                verticalLineTo(y = 16.0f)
                curveTo(x1 = 21.0f, y1 = 15.8804f, x2 = 20.9714f, y2 = 15.7626f, x3 = 20.9166f, y3 = 15.6563f)
                lineTo(x = 19.444f, y = 12.8003f)
                lineTo(x = 19.2455f, y = 8.87139f)
                curveTo(x1 = 19.0522f, y1 = 5.02005f, x2 = 15.8634f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                close()
                moveTo(x = 12.0f, y = 20.5f)
                curveTo(x1 = 10.4632f, y1 = 20.5f, x2 = 9.17555f, y2 = 19.4333f, x3 = 8.83697f, y3 = 18.0f)
                horizontalLineTo(x = 15.163f)
                curveTo(x1 = 14.8245f, y1 = 19.4333f, x2 = 13.5368f, y2 = 20.5f, x3 = 12.0f, y3 = 20.5f)
                close()
            }
        }.build().also { _bell = it }
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
                imageVector = Bell,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bell: ImageVector? = null
