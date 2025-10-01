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

val ReceiptBill: ImageVector
    get() {
        val current = _receiptBill
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ReceiptBill",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 4.0f, y = 2.75f)
                    curveTo(
                        x1 = 4.0f,
                        y1 = 2.33579f,
                        x2 = 4.33579f,
                        y2 = 2.0f,
                        x3 = 4.75f,
                        y3 = 2.0f,
                    )
                    horizontalLineTo(x = 19.25f)
                    curveTo(
                        x1 = 19.6642f,
                        y1 = 2.0f,
                        x2 = 20.0f,
                        y2 = 2.33579f,
                        x3 = 20.0f,
                        y3 = 2.75f,
                    )
                    verticalLineTo(y = 21.25f)
                    curveTo(
                        x1 = 20.0f,
                        y1 = 21.544f,
                        x2 = 19.8283f,
                        y2 = 21.8108f,
                        x3 = 19.5607f,
                        y3 = 21.9326f,
                    )
                    curveTo(
                        x1 = 19.2931f,
                        y1 = 22.0544f,
                        x2 = 18.9791f,
                        y2 = 22.0086f,
                        x3 = 18.7574f,
                        y3 = 21.8156f,
                    )
                    lineTo(x = 16.6924f, y = 20.017f)
                    lineTo(x = 14.8539f, y = 21.7899f)
                    curveTo(
                        x1 = 14.5634f,
                        y1 = 22.07f,
                        x2 = 14.1033f,
                        y2 = 22.07f,
                        x3 = 13.8127f,
                        y3 = 21.7899f,
                    )
                    lineTo(x = 12.0f, y = 20.0419f)
                    lineTo(x = 10.1873f, y = 21.7899f)
                    curveTo(
                        x1 = 9.89674f,
                        y1 = 22.07f,
                        x2 = 9.4366f,
                        y2 = 22.07f,
                        x3 = 9.14606f,
                        y3 = 21.7899f,
                    )
                    lineTo(x = 7.30756f, y = 20.017f)
                    lineTo(x = 5.24259f, y = 21.8156f)
                    curveTo(
                        x1 = 5.02091f,
                        y1 = 22.0086f,
                        x2 = 4.70687f,
                        y2 = 22.0544f,
                        x3 = 4.43931f,
                        y3 = 21.9326f,
                    )
                    curveTo(
                        x1 = 4.17175f,
                        y1 = 21.8108f,
                        x2 = 4.0f,
                        y2 = 21.544f,
                        x3 = 4.0f,
                        y3 = 21.25f,
                    )
                    verticalLineTo(y = 2.75f)
                    close()
                    moveTo(x = 8.0f, y = 7.75f)
                    curveTo(
                        x1 = 8.0f,
                        y1 = 7.33579f,
                        x2 = 8.33579f,
                        y2 = 7.0f,
                        x3 = 8.75f,
                        y3 = 7.0f,
                    )
                    horizontalLineTo(x = 15.25f)
                    curveTo(
                        x1 = 15.6642f,
                        y1 = 7.0f,
                        x2 = 16.0f,
                        y2 = 7.33579f,
                        x3 = 16.0f,
                        y3 = 7.75f,
                    )
                    curveTo(
                        x1 = 16.0f,
                        y1 = 8.16421f,
                        x2 = 15.6642f,
                        y2 = 8.5f,
                        x3 = 15.25f,
                        y3 = 8.5f,
                    )
                    horizontalLineTo(x = 8.75f)
                    curveTo(
                        x1 = 8.33579f,
                        y1 = 8.5f,
                        x2 = 8.0f,
                        y2 = 8.16421f,
                        x3 = 8.0f,
                        y3 = 7.75f,
                    )
                    close()
                    moveTo(x = 8.0f, y = 11.75f)
                    curveTo(
                        x1 = 8.0f,
                        y1 = 11.3358f,
                        x2 = 8.33579f,
                        y2 = 11.0f,
                        x3 = 8.75f,
                        y3 = 11.0f,
                    )
                    horizontalLineTo(x = 11.25f)
                    curveTo(
                        x1 = 11.6642f,
                        y1 = 11.0f,
                        x2 = 12.0f,
                        y2 = 11.3358f,
                        x3 = 12.0f,
                        y3 = 11.75f,
                    )
                    curveTo(
                        x1 = 12.0f,
                        y1 = 12.1642f,
                        x2 = 11.6642f,
                        y2 = 12.5f,
                        x3 = 11.25f,
                        y3 = 12.5f,
                    )
                    horizontalLineTo(x = 8.75f)
                    curveTo(
                        x1 = 8.33579f,
                        y1 = 12.5f,
                        x2 = 8.0f,
                        y2 = 12.1642f,
                        x3 = 8.0f,
                        y3 = 11.75f,
                    )
                    close()
                }
            }.build()
            .also { _receiptBill = it }
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
                imageVector = ReceiptBill,
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
private var _receiptBill: ImageVector? = null
