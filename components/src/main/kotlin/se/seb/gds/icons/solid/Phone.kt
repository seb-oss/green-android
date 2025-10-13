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

internal val Phone: ImageVector
    get() {
        val current = _phone
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Phone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 5.0f, y = 1.75f)
                curveTo(x1 = 5.0f, y1 = 1.33579f, x2 = 5.33579f, y2 = 1.0f, x3 = 5.75f, y3 = 1.0f)
                horizontalLineTo(x = 18.25f)
                curveTo(x1 = 18.6642f, y1 = 1.0f, x2 = 19.0f, y2 = 1.33579f, x3 = 19.0f, y3 = 1.75f)
                verticalLineTo(y = 22.25f)
                curveTo(x1 = 19.0f, y1 = 22.6642f, x2 = 18.6642f, y2 = 23.0f, x3 = 18.25f, y3 = 23.0f)
                horizontalLineTo(x = 5.75f)
                curveTo(x1 = 5.33579f, y1 = 23.0f, x2 = 5.0f, y2 = 22.6642f, x3 = 5.0f, y3 = 22.25f)
                verticalLineTo(y = 1.75f)
                close()
                moveTo(x = 9.75f, y = 18.5f)
                curveTo(x1 = 9.33579f, y1 = 18.5f, x2 = 9.0f, y2 = 18.8358f, x3 = 9.0f, y3 = 19.25f)
                curveTo(x1 = 9.0f, y1 = 19.6642f, x2 = 9.33579f, y2 = 20.0f, x3 = 9.75f, y3 = 20.0f)
                horizontalLineTo(x = 14.25f)
                curveTo(x1 = 14.6642f, y1 = 20.0f, x2 = 15.0f, y2 = 19.6642f, x3 = 15.0f, y3 = 19.25f)
                curveTo(x1 = 15.0f, y1 = 18.8358f, x2 = 14.6642f, y2 = 18.5f, x3 = 14.25f, y3 = 18.5f)
                horizontalLineTo(x = 9.75f)
                close()
            }
        }.build().also { _phone = it }
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
                imageVector = Phone,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _phone: ImageVector? = null
