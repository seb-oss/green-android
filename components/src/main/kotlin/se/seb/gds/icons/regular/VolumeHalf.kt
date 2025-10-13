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

internal val VolumeHalf: ImageVector
    get() {
        val current = _volumeHalf
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.VolumeHalf",
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
                moveTo(x = 15.8891f, y = 8.11133f)
                curveTo(x1 = 16.8844f, y1 = 9.10663f, x2 = 17.5f, y2 = 10.4816f, x3 = 17.5f, y3 = 12.0004f)
                curveTo(x1 = 17.5f, y1 = 13.5192f, x2 = 16.8844f, y2 = 14.8942f, x3 = 15.8891f, y3 = 15.8895f)
                moveTo(x = 1.75f, y = 7.75f)
                horizontalLineTo(x = 6.0f)
                lineTo(x = 12.25f, y = 3.75f)
                verticalLineTo(y = 20.25f)
                lineTo(x = 6.0f, y = 16.25f)
                horizontalLineTo(x = 1.75f)
                verticalLineTo(y = 7.75f)
                close()
            }
        }.build().also { _volumeHalf = it }
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
                imageVector = VolumeHalf,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _volumeHalf: ImageVector? = null
