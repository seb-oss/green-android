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

internal val LightBulb: ImageVector
    get() {
        val current = _lightBulb
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.LightBulb",
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
                moveTo(x = 8.74799f, y = 15.4838f)
                verticalLineTo(y = 18.25f)
                horizontalLineTo(x = 15.2504f)
                verticalLineTo(y = 15.4838f)
                moveTo(x = 8.74799f, y = 15.4838f)
                curveTo(x1 = 8.33548f, y1 = 15.2765f, x2 = 7.94548f, y2 = 15.031f, x3 = 7.58263f, y3 = 14.7519f)
                curveTo(x1 = 5.85907f, y1 = 13.4264f, x2 = 4.74829f, y2 = 11.3433f, x3 = 4.74829f, y3 = 9.00089f)
                curveTo(x1 = 4.74829f, y1 = 4.99633f, x2 = 7.99462f, y2 = 1.75f, x3 = 11.9992f, y3 = 1.75f)
                curveTo(x1 = 16.0037f, y1 = 1.75f, x2 = 19.2501f, y2 = 4.99633f, x3 = 19.2501f, y3 = 9.00089f)
                curveTo(x1 = 19.2501f, y1 = 11.3433f, x2 = 18.1393f, y2 = 13.4264f, x3 = 16.4157f, y3 = 14.7519f)
                curveTo(x1 = 16.0529f, y1 = 15.031f, x2 = 15.6629f, y2 = 15.2765f, x3 = 15.2504f, y3 = 15.4838f)
                moveTo(x = 8.74799f, y = 15.4838f)
                horizontalLineTo(x = 15.2504f)
                moveTo(x = 8.75006f, y = 21.25f)
                horizontalLineTo(x = 15.2501f)
            }
        }.build().also { _lightBulb = it }
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
                imageVector = LightBulb,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lightBulb: ImageVector? = null
