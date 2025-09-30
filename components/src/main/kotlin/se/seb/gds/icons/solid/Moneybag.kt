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

val Moneybag: ImageVector
    get() {
        val current = _moneybag
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Moneybag",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 3.85123f, y = 19.0302f)
                    curveTo(x1 = 3.29425f, y1 = 18.1904f, x2 = 3.00001f, y2 = 17.178f, x3 = 3.0f, y3 = 16.0f)
                    curveTo(x1 = 3.45007f, y1 = 12.8495f, x2 = 4.71037f, y2 = 10.5093f, x3 = 7.51024f, y3 = 8.25f)
                    horizontalLineTo(x = 16.5f)
                    verticalLineTo(y = 8.18559f)
                    curveTo(x1 = 19.2411f, y1 = 10.42f, x2 = 20.5413f, y2 = 12.7892f, x3 = 21.0f, y3 = 16.0f)
                    curveTo(x1 = 21.0f, y1 = 17.178f, x2 = 20.7058f, y2 = 18.1904f, x3 = 20.1488f, y3 = 19.0302f)
                    curveTo(x1 = 19.5957f, y1 = 19.8642f, x2 = 18.8228f, y2 = 20.469f, x3 = 17.9544f, y3 = 20.9025f)
                    curveTo(x1 = 16.2468f, y1 = 21.7548f, x2 = 14.0585f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    curveTo(x1 = 9.94146f, y1 = 22.0f, x2 = 7.75317f, y2 = 21.7548f, x3 = 6.04565f, y3 = 20.9025f)
                    curveTo(x1 = 5.17717f, y1 = 20.469f, x2 = 4.40435f, y2 = 19.8642f, x3 = 3.85123f, y3 = 19.0302f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 16.3342f, y = 3.97272f)
                    curveTo(x1 = 16.502f, y1 = 3.5253f, x2 = 16.3325f, y2 = 3.01495f, x3 = 15.901f, y3 = 2.80978f)
                    curveTo(x1 = 14.7376f, y1 = 2.25667f, x2 = 13.433f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    curveTo(x1 = 10.567f, y1 = 2.0f, x2 = 9.26242f, y2 = 2.25667f, x3 = 8.09902f, y3 = 2.80978f)
                    curveTo(x1 = 7.66747f, y1 = 3.01495f, x2 = 7.49799f, y2 = 3.5253f, x3 = 7.66577f, y3 = 3.97272f)
                    lineTo(x = 8.70225f, y = 6.73666f)
                    lineTo(x = 8.66667f, y = 6.75f)
                    horizontalLineTo(x = 15.3333f)
                    lineTo(x = 15.2978f, y = 6.73666f)
                    lineTo(x = 16.3342f, y = 3.97272f)
                    close()
                }
            }.build()
            .also { _moneybag = it }
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
                imageVector = Moneybag,
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
private var _moneybag: ImageVector? = null
