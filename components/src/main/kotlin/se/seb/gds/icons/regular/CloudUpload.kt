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

val CloudUpload: ImageVector
    get() {
        val current = _cloudUpload
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CloudUpload",
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
                    moveTo(x = 12.0f, y = 19.25f)
                    verticalLineTo(y = 11.75f)
                    moveTo(x = 12.0f, y = 11.75f)
                    lineTo(x = 14.5f, y = 14.25f)
                    moveTo(x = 12.0f, y = 11.75f)
                    lineTo(x = 9.5f, y = 14.25f)
                    moveTo(x = 15.0f, y = 19.25f)
                    horizontalLineTo(x = 18.125f)
                    curveTo(x1 = 20.4032f, y1 = 19.25f, x2 = 22.25f, y2 = 17.4032f, x3 = 22.25f, y3 = 15.125f)
                    curveTo(x1 = 22.25f, y1 = 12.8468f, x2 = 20.4032f, y2 = 11.0f, x3 = 18.125f, y3 = 11.0f)
                    curveTo(x1 = 18.0814f, y1 = 11.0f, x2 = 18.038f, y2 = 11.0007f, x3 = 17.9948f, y3 = 11.002f)
                    curveTo(x1 = 17.9983f, y1 = 10.9184f, x2 = 18.0f, y2 = 10.8344f, x3 = 18.0f, y3 = 10.75f)
                    curveTo(x1 = 18.0f, y1 = 7.43629f, x2 = 15.3137f, y2 = 4.75f, x3 = 12.0f, y3 = 4.75f)
                    curveTo(x1 = 9.3716f, y1 = 4.75f, x2 = 7.13793f, y2 = 6.44009f, x3 = 6.32647f, y3 = 8.7928f)
                    curveTo(x1 = 3.74507f, y1 = 9.12339f, x2 = 1.75f, y2 = 11.3287f, x3 = 1.75f, y3 = 14.0f)
                    curveTo(x1 = 1.75f, y1 = 16.8995f, x2 = 4.10051f, y2 = 19.25f, x3 = 7.0f, y3 = 19.25f)
                    horizontalLineTo(x = 9.0f)
                }
            }.build()
            .also { _cloudUpload = it }
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
                imageVector = CloudUpload,
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
private var _cloudUpload: ImageVector? = null
