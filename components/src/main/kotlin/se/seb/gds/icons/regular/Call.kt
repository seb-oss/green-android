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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Call: ImageVector
    get() {
        val current = _call
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Call",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 10.25f, y = 8.0f)
                    lineTo(x = 9.0f, y = 3.75f)
                    horizontalLineTo(x = 7.00236f)
                    horizontalLineTo(x = 3.75188f)
                    curveTo(x1 = 3.75063f, y1 = 3.83318f, x2 = 3.75f, y2 = 3.91652f, x3 = 3.75f, y3 = 4.0f)
                    curveTo(x1 = 3.75f, y1 = 6.96726f, x2 = 4.54531f, y2 = 9.74877f, x3 = 5.93438f, y3 = 12.143f)
                    curveTo(x1 = 7.35756f, y1 = 14.596f, x2 = 9.40402f, y2 = 16.6424f, x3 = 11.857f, y3 = 18.0656f)
                    curveTo(x1 = 14.2512f, y1 = 19.4547f, x2 = 17.0327f, y2 = 20.25f, x3 = 20.0f, y3 = 20.25f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 15.0f)
                    lineTo(x = 16.0f, y = 13.75f)
                    lineTo(x = 14.1918f, y = 15.6335f)
                    curveTo(x1 = 11.6758f, y1 = 14.3749f, x2 = 9.62505f, y2 = 12.3242f, x3 = 8.36647f, y3 = 9.80819f)
                    lineTo(x = 10.25f, y = 8.0f)
                    close()
                }
            }.build()
            .also { _call = it }
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
                imageVector = Call,
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
private var _call: ImageVector? = null
