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

val BookmarkDelete: ImageVector
    get() {
        val current = _bookmarkDelete
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BookmarkDelete",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 4.75f, y = 2.0f)
                    curveTo(x1 = 4.33579f, y1 = 2.0f, x2 = 4.0f, y2 = 2.33579f, x3 = 4.0f, y3 = 2.75f)
                    verticalLineTo(y = 21.0f)
                    curveTo(x1 = 4.0f, y1 = 21.2653f, x2 = 4.14021f, y2 = 21.5109f, x3 = 4.36871f, y3 = 21.6458f)
                    curveTo(x1 = 4.5972f, y1 = 21.7807f, x2 = 4.87997f, y2 = 21.7849f, x3 = 5.11231f, y3 = 21.6567f)
                    lineTo(x = 12.0f, y = 17.8566f)
                    lineTo(x = 18.8877f, y = 21.6567f)
                    curveTo(x1 = 19.12f, y1 = 21.7849f, x2 = 19.4028f, y2 = 21.7807f, x3 = 19.6313f, y3 = 21.6458f)
                    curveTo(x1 = 19.8598f, y1 = 21.5109f, x2 = 20.0f, y2 = 21.2653f, x3 = 20.0f, y3 = 21.0f)
                    verticalLineTo(y = 2.75f)
                    curveTo(x1 = 20.0f, y1 = 2.33579f, x2 = 19.6642f, y2 = 2.0f, x3 = 19.25f, y3 = 2.0f)
                    horizontalLineTo(x = 4.75f)
                    close()
                    moveTo(x = 14.8284f, y = 7.17612f)
                    curveTo(x1 = 15.1213f, y1 = 7.46901f, x2 = 15.1213f, y2 = 7.94389f, x3 = 14.8284f, y3 = 8.23678f)
                    lineTo(x = 13.0607f, y = 10.0045f)
                    lineTo(x = 14.8284f, y = 11.7723f)
                    curveTo(x1 = 15.1213f, y1 = 12.0652f, x2 = 15.1213f, y2 = 12.5401f, x3 = 14.8284f, y3 = 12.833f)
                    curveTo(x1 = 14.5355f, y1 = 13.1259f, x2 = 14.0607f, y2 = 13.1259f, x3 = 13.7678f, y3 = 12.833f)
                    lineTo(x = 12.0f, y = 11.0652f)
                    lineTo(x = 10.2322f, y = 12.833f)
                    curveTo(x1 = 9.93934f, y1 = 13.1259f, x2 = 9.46446f, y2 = 13.1259f, x3 = 9.17157f, y3 = 12.833f)
                    curveTo(x1 = 8.87868f, y1 = 12.5401f, x2 = 8.87868f, y2 = 12.0652f, x3 = 9.17157f, y3 = 11.7723f)
                    lineTo(x = 10.9393f, y = 10.0045f)
                    lineTo(x = 9.17157f, y = 8.23678f)
                    curveTo(x1 = 8.87868f, y1 = 7.94389f, x2 = 8.87868f, y2 = 7.46901f, x3 = 9.17157f, y3 = 7.17612f)
                    curveTo(x1 = 9.46447f, y1 = 6.88322f, x2 = 9.93934f, y2 = 6.88322f, x3 = 10.2322f, y3 = 7.17612f)
                    lineTo(x = 12.0f, y = 8.94389f)
                    lineTo(x = 13.7678f, y = 7.17612f)
                    curveTo(x1 = 14.0607f, y1 = 6.88323f, x2 = 14.5355f, y2 = 6.88323f, x3 = 14.8284f, y3 = 7.17612f)
                    close()
                }
            }.build()
            .also { _bookmarkDelete = it }
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
                imageVector = BookmarkDelete,
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
private var _bookmarkDelete: ImageVector? = null
