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

internal val MagnifyingGlass: ImageVector
    get() {
        val current = _magnifyingGlass
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.MagnifyingGlass",
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
                moveTo(x = 20.0f, y = 20.0f)
                lineTo(x = 16.1265f, y = 16.1265f)
                moveTo(x = 16.1265f, y = 16.1265f)
                curveTo(x1 = 17.4385f, y1 = 14.8145f, x2 = 18.25f, y2 = 13.002f, x3 = 18.25f, y3 = 11.0f)
                curveTo(x1 = 18.25f, y1 = 6.99594f, x2 = 15.0041f, y2 = 3.75f, x3 = 11.0f, y3 = 3.75f)
                curveTo(x1 = 6.99594f, y1 = 3.75f, x2 = 3.75f, y2 = 6.99594f, x3 = 3.75f, y3 = 11.0f)
                curveTo(x1 = 3.75f, y1 = 15.0041f, x2 = 6.99594f, y2 = 18.25f, x3 = 11.0f, y3 = 18.25f)
                curveTo(x1 = 13.002f, y1 = 18.25f, x2 = 14.8145f, y2 = 17.4385f, x3 = 16.1265f, y3 = 16.1265f)
                close()
            }
        }.build().also { _magnifyingGlass = it }
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
                imageVector = MagnifyingGlass,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _magnifyingGlass: ImageVector? = null
