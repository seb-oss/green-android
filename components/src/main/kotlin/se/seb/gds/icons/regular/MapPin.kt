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

val MapPin: ImageVector
    get() {
        val current = _mapPin
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.MapPin",
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
                    moveTo(x = 14.75f, y = 10.0f)
                    curveTo(x1 = 14.75f, y1 = 11.5188f, x2 = 13.5188f, y2 = 12.75f, x3 = 12.0f, y3 = 12.75f)
                    curveTo(x1 = 10.4812f, y1 = 12.75f, x2 = 9.25f, y2 = 11.5188f, x3 = 9.25f, y3 = 10.0f)
                    curveTo(x1 = 9.25f, y1 = 8.48122f, x2 = 10.4812f, y2 = 7.25f, x3 = 12.0f, y3 = 7.25f)
                    curveTo(x1 = 13.5188f, y1 = 7.25f, x2 = 14.75f, y2 = 8.48122f, x3 = 14.75f, y3 = 10.0f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 19.25f, y = 10.0f)
                    curveTo(x1 = 19.25f, y1 = 16.0755f, x2 = 12.0f, y2 = 21.3929f, x3 = 12.0f, y3 = 21.3929f)
                    curveTo(x1 = 12.0f, y1 = 21.3929f, x2 = 4.75f, y2 = 16.0755f, x3 = 4.75f, y3 = 10.0f)
                    curveTo(x1 = 4.75f, y1 = 5.99594f, x2 = 7.99594f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                    curveTo(x1 = 16.0041f, y1 = 2.75f, x2 = 19.25f, y2 = 5.99594f, x3 = 19.25f, y3 = 10.0f)
                    close()
                }
            }.build()
            .also { _mapPin = it }
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
                imageVector = MapPin,
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
private var _mapPin: ImageVector? = null
