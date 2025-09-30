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

val ShoppingBag: ImageVector
    get() {
        val current = _shoppingBag
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ShoppingBag",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 8.0f, y = 6.0f)
                    curveTo(x1 = 8.0f, y1 = 3.79086f, x2 = 9.79086f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    curveTo(x1 = 14.2091f, y1 = 2.0f, x2 = 16.0f, y2 = 3.79086f, x3 = 16.0f, y3 = 6.0f)
                    verticalLineTo(y = 7.0f)
                    horizontalLineTo(x = 17.75f)
                    curveTo(x1 = 18.1218f, y1 = 7.0f, x2 = 18.4374f, y2 = 7.27234f, x3 = 18.4919f, y3 = 7.64009f)
                    lineTo(x = 20.4919f, y = 21.1401f)
                    curveTo(x1 = 20.5239f, y1 = 21.3558f, x2 = 20.4603f, y2 = 21.5748f, x3 = 20.3179f, y3 = 21.7399f)
                    curveTo(x1 = 20.1754f, y1 = 21.9051f, x2 = 19.9681f, y2 = 22.0f, x3 = 19.75f, y3 = 22.0f)
                    horizontalLineTo(x = 4.25001f)
                    curveTo(x1 = 4.03191f, y1 = 22.0f, x2 = 3.82461f, y2 = 21.9051f, x3 = 3.68214f, y3 = 21.7399f)
                    curveTo(x1 = 3.53967f, y1 = 21.5748f, x2 = 3.47614f, y2 = 21.3558f, x3 = 3.5081f, y3 = 21.1401f)
                    lineTo(x = 5.5081f, y = 7.64009f)
                    curveTo(x1 = 5.56258f, y1 = 7.27234f, x2 = 5.87824f, y2 = 7.0f, x3 = 6.25001f, y3 = 7.0f)
                    horizontalLineTo(x = 8.0f)
                    verticalLineTo(y = 6.0f)
                    close()
                    moveTo(x = 9.5f, y = 7.0f)
                    horizontalLineTo(x = 14.5f)
                    verticalLineTo(y = 6.0f)
                    curveTo(x1 = 14.5f, y1 = 4.61929f, x2 = 13.3807f, y2 = 3.5f, x3 = 12.0f, y3 = 3.5f)
                    curveTo(x1 = 10.6193f, y1 = 3.5f, x2 = 9.5f, y2 = 4.61929f, x3 = 9.5f, y3 = 6.0f)
                    verticalLineTo(y = 7.0f)
                    close()
                }
            }.build()
            .also { _shoppingBag = it }
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
                imageVector = ShoppingBag,
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
private var _shoppingBag: ImageVector? = null
