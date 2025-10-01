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

val Poop: ImageVector
    get() {
        val current = _poop
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Poop",
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
                    moveTo(x = 9.25f, y = 9.75f)
                    horizontalLineTo(x = 7.5f)
                    curveTo(
                        x1 = 5.98122f,
                        y1 = 9.75f,
                        x2 = 4.75f,
                        y2 = 10.9812f,
                        x3 = 4.75f,
                        y3 = 12.5f,
                    )
                    curveTo(
                        x1 = 4.75f,
                        y1 = 13.2064f,
                        x2 = 5.01633f,
                        y2 = 13.8506f,
                        x3 = 5.45405f,
                        y3 = 14.3376f,
                    )
                    moveTo(x = 13.75f, y = 9.75f)
                    horizontalLineTo(x = 16.5f)
                    curveTo(
                        x1 = 18.0188f,
                        y1 = 9.75f,
                        x2 = 19.25f,
                        y2 = 10.9812f,
                        x3 = 19.25f,
                        y3 = 12.5f,
                    )
                    curveTo(
                        x1 = 19.25f,
                        y1 = 13.2308f,
                        x2 = 18.965f,
                        y2 = 13.895f,
                        x3 = 18.5f,
                        y3 = 14.3875f,
                    )
                    moveTo(x = 12.25f, y = 14.75f)
                    horizontalLineTo(x = 5.5f)
                    curveTo(
                        x1 = 3.98122f,
                        y1 = 14.75f,
                        x2 = 2.75f,
                        y2 = 15.9812f,
                        x3 = 2.75f,
                        y3 = 17.5f,
                    )
                    curveTo(
                        x1 = 2.75f,
                        y1 = 19.0188f,
                        x2 = 3.98122f,
                        y2 = 20.25f,
                        x3 = 5.5f,
                        y3 = 20.25f,
                    )
                    horizontalLineTo(x = 18.5f)
                    curveTo(
                        x1 = 20.0188f,
                        y1 = 20.25f,
                        x2 = 21.25f,
                        y2 = 19.0188f,
                        x3 = 21.25f,
                        y3 = 17.5f,
                    )
                    curveTo(
                        x1 = 21.25f,
                        y1 = 15.9812f,
                        x2 = 20.0188f,
                        y2 = 14.75f,
                        x3 = 18.5f,
                        y3 = 14.75f,
                    )
                    horizontalLineTo(x = 16.75f)
                    moveTo(x = 7.5f, y = 9.38747f)
                    curveTo(
                        x1 = 7.03504f,
                        y1 = 8.89496f,
                        x2 = 6.75f,
                        y2 = 8.23077f,
                        x3 = 6.75f,
                        y3 = 7.5f,
                    )
                    curveTo(
                        x1 = 6.75f,
                        y1 = 5.98122f,
                        x2 = 7.98122f,
                        y2 = 4.75f,
                        x3 = 9.5f,
                        y3 = 4.75f,
                    )
                    horizontalLineTo(x = 13.0f)
                    verticalLineTo(y = 2.75f)
                    curveTo(
                        x1 = 15.3472f,
                        y1 = 2.75f,
                        x2 = 17.25f,
                        y2 = 4.42893f,
                        x3 = 17.25f,
                        y3 = 6.5f,
                    )
                    curveTo(
                        x1 = 17.25f,
                        y1 = 7.66147f,
                        x2 = 16.6516f,
                        y2 = 8.69962f,
                        x3 = 15.7119f,
                        y3 = 9.38747f,
                    )
                }
            }.build()
            .also { _poop = it }
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
                imageVector = Poop,
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
private var _poop: ImageVector? = null
