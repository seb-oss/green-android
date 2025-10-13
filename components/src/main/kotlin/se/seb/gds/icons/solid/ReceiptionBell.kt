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

internal val ReceiptionBell: ImageVector
    get() {
        val current = _receiptionBell
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ReceiptionBell",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 14.25f, y = 4.5f)
                horizontalLineTo(x = 12.75f)
                verticalLineTo(y = 6.03193f)
                curveTo(x1 = 17.4354f, y1 = 6.43365f, x2 = 21.0f, y2 = 10.5874f, x3 = 21.0f, y3 = 16.2891f)
                verticalLineTo(y = 17.25f)
                curveTo(x1 = 21.0f, y1 = 17.6642f, x2 = 20.6642f, y2 = 18.0f, x3 = 20.25f, y3 = 18.0f)
                horizontalLineTo(x = 12.75f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 20.248f)
                curveTo(x1 = 20.6623f, y1 = 19.5f, x2 = 20.998f, y2 = 19.8358f, x3 = 20.998f, y3 = 20.25f)
                curveTo(x1 = 20.998f, y1 = 20.6642f, x2 = 20.6623f, y2 = 21.0f, x3 = 20.248f, y3 = 21.0f)
                horizontalLineTo(x = 3.74805f)
                curveTo(x1 = 3.33383f, y1 = 21.0f, x2 = 2.99805f, y2 = 20.6642f, x3 = 2.99805f, y3 = 20.25f)
                curveTo(x1 = 2.99805f, y1 = 19.8358f, x2 = 3.33383f, y2 = 19.5f, x3 = 3.74805f, y3 = 19.5f)
                horizontalLineTo(x = 11.25f)
                verticalLineTo(y = 18.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 18.0f, x2 = 3.0f, y2 = 17.6642f, x3 = 3.0f, y3 = 17.25f)
                verticalLineTo(y = 16.2891f)
                curveTo(x1 = 3.0f, y1 = 10.5874f, x2 = 6.56459f, y2 = 6.43365f, x3 = 11.25f, y3 = 6.03193f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 9.75f)
                curveTo(x1 = 9.33579f, y1 = 4.5f, x2 = 9.0f, y2 = 4.16421f, x3 = 9.0f, y3 = 3.75f)
                curveTo(x1 = 9.0f, y1 = 3.33579f, x2 = 9.33579f, y2 = 3.0f, x3 = 9.75f, y3 = 3.0f)
                horizontalLineTo(x = 14.25f)
                curveTo(x1 = 14.6642f, y1 = 3.0f, x2 = 15.0f, y2 = 3.33579f, x3 = 15.0f, y3 = 3.75f)
                curveTo(x1 = 15.0f, y1 = 4.16421f, x2 = 14.6642f, y2 = 4.5f, x3 = 14.25f, y3 = 4.5f)
                close()
            }
        }.build().also { _receiptionBell = it }
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
                imageVector = ReceiptionBell,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _receiptionBell: ImageVector? = null
