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

internal val LightBulbSimple: ImageVector
    get() {
        val current = _lightBulbSimple
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.LightBulbSimple",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Square,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.74799f, y = 17.75f)
                verticalLineTo(y = 16.4838f)
                curveTo(x1 = 8.33548f, y1 = 16.2765f, x2 = 7.94548f, y2 = 16.031f, x3 = 7.58263f, y3 = 15.7519f)
                curveTo(x1 = 5.85907f, y1 = 14.4264f, x2 = 4.74829f, y2 = 12.3433f, x3 = 4.74829f, y3 = 10.0009f)
                curveTo(x1 = 4.74829f, y1 = 5.99633f, x2 = 7.99462f, y2 = 2.75f, x3 = 11.9992f, y3 = 2.75f)
                curveTo(x1 = 16.0037f, y1 = 2.75f, x2 = 19.2501f, y2 = 5.99633f, x3 = 19.2501f, y3 = 10.0009f)
                curveTo(x1 = 19.2501f, y1 = 12.3433f, x2 = 18.1393f, y2 = 14.4264f, x3 = 16.4157f, y3 = 15.7519f)
                curveTo(x1 = 16.0529f, y1 = 16.031f, x2 = 15.6629f, y2 = 16.2765f, x3 = 15.2504f, y3 = 16.4838f)
                verticalLineTo(y = 17.75f)
                moveTo(x = 8.74799f, y = 17.75f)
                verticalLineTo(y = 18.9988f)
                curveTo(x1 = 8.74799f, y1 = 20.7944f, x2 = 10.2036f, y2 = 22.25f, x3 = 11.9992f, y3 = 22.25f)
                curveTo(x1 = 13.7948f, y1 = 22.25f, x2 = 15.2504f, y2 = 20.7944f, x3 = 15.2504f, y3 = 18.9988f)
                verticalLineTo(y = 17.75f)
                moveTo(x = 8.74799f, y = 17.75f)
                horizontalLineTo(x = 15.2504f)
            }
        }.build().also { _lightBulbSimple = it }
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
                imageVector = LightBulbSimple,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lightBulbSimple: ImageVector? = null
