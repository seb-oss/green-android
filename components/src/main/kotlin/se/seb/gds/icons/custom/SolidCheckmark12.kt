package se.seb.gds.icons.custom

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
import se.seb.gds.theme.GdsTheme

internal val SolidCheckmark12: ImageVector
    get() {
        val current = _solidCheckmark12
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SolidCheckmark12",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF027839)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 1.375f, y = 7.54688f)
                lineTo(x = 4.5f, y = 10.125f)
                lineTo(x = 10.625f, y = 1.875f)
            }
        }.build().also { _solidCheckmark12 = it }
    }

@Preview
@Composable
private fun IconPreview() {
    GdsTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                imageVector = SolidCheckmark12,
                contentDescription = null,
                modifier = Modifier
                    .width((12.0).dp)
                    .height((12.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _solidCheckmark12: ImageVector? = null
