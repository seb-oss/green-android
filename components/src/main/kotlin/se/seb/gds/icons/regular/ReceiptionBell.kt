package se.seb.gds.icons.regular

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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val ReceiptionBell: ImageVector
    get() {
        val current = _receiptionBell
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ReceiptionBell",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 12.0f, y = 6.75f)
                    curveTo(
                        x1 = 7.44365f,
                        y1 = 6.75f,
                        x2 = 3.75f,
                        y2 = 10.6172f,
                        x3 = 3.75f,
                        y3 = 16.2891f,
                    )
                    verticalLineTo(y = 17.25f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 16.2891f)
                    curveTo(
                        x1 = 20.25f,
                        y1 = 10.6172f,
                        x2 = 16.5563f,
                        y2 = 6.75f,
                        x3 = 12.0f,
                        y3 = 6.75f,
                    )
                    close()
                    moveTo(x = 12.0f, y = 6.75f)
                    verticalLineTo(y = 3.75f)
                    moveTo(x = 3.7478f, y = 20.25f)
                    horizontalLineTo(x = 20.2478f)
                    moveTo(x = 12.0f, y = 17.5f)
                    verticalLineTo(y = 20.25f)
                    moveTo(x = 9.75f, y = 3.75f)
                    horizontalLineTo(x = 14.25f)
                }
            }.build()
            .also { _receiptionBell = it }
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
                modifier =
                Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _receiptionBell: ImageVector? = null
