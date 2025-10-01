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

val BulletList: ImageVector
    get() {
        val current = _bulletList
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BulletList",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 5.75f, y = 4.5f)
                curveTo(x1 = 4.23122f, y1 = 4.5f, x2 = 3.0f, y2 = 5.73122f, x3 = 3.0f, y3 = 7.25f)
                curveTo(x1 = 3.0f, y1 = 8.76878f, x2 = 4.23122f, y2 = 10.0f, x3 = 5.75f, y3 = 10.0f)
                curveTo(x1 = 7.26878f, y1 = 10.0f, x2 = 8.5f, y2 = 8.76878f, x3 = 8.5f, y3 = 7.25f)
                curveTo(x1 = 8.5f, y1 = 5.73122f, x2 = 7.26878f, y2 = 4.5f, x3 = 5.75f, y3 = 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.75f, y = 6.5f)
                curveTo(x1 = 11.3358f, y1 = 6.5f, x2 = 11.0f, y2 = 6.83579f, x3 = 11.0f, y3 = 7.25f)
                curveTo(x1 = 11.0f, y1 = 7.66421f, x2 = 11.3358f, y2 = 8.0f, x3 = 11.75f, y3 = 8.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 8.0f, x2 = 21.0f, y2 = 7.66421f, x3 = 21.0f, y3 = 7.25f)
                curveTo(x1 = 21.0f, y1 = 6.83579f, x2 = 20.6642f, y2 = 6.5f, x3 = 20.25f, y3 = 6.5f)
                horizontalLineTo(x = 11.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 5.75f, y = 14.0f)
                curveTo(x1 = 4.23122f, y1 = 14.0f, x2 = 3.0f, y2 = 15.2312f, x3 = 3.0f, y3 = 16.75f)
                curveTo(x1 = 3.0f, y1 = 18.2688f, x2 = 4.23122f, y2 = 19.5f, x3 = 5.75f, y3 = 19.5f)
                curveTo(x1 = 7.26878f, y1 = 19.5f, x2 = 8.5f, y2 = 18.2688f, x3 = 8.5f, y3 = 16.75f)
                curveTo(x1 = 8.5f, y1 = 15.2312f, x2 = 7.26878f, y2 = 14.0f, x3 = 5.75f, y3 = 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.75f, y = 16.0f)
                curveTo(x1 = 11.3358f, y1 = 16.0f, x2 = 11.0f, y2 = 16.3358f, x3 = 11.0f, y3 = 16.75f)
                curveTo(x1 = 11.0f, y1 = 17.1642f, x2 = 11.3358f, y2 = 17.5f, x3 = 11.75f, y3 = 17.5f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 17.5f, x2 = 21.0f, y2 = 17.1642f, x3 = 21.0f, y3 = 16.75f)
                curveTo(x1 = 21.0f, y1 = 16.3358f, x2 = 20.6642f, y2 = 16.0f, x3 = 20.25f, y3 = 16.0f)
                horizontalLineTo(x = 11.75f)
                close()
            }
        }.build().also { _bulletList = it }
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
                imageVector = BulletList,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bulletList: ImageVector? = null
