package se.seb.gds.icons.solid

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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val KnifeSpoon: ImageVector
    get() {
        val current = _knifeSpoon
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.KnifeSpoon",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.0f, y = 2.75f)
                    curveTo(
                        x1 = 15.7463f,
                        y1 = 2.75f,
                        x2 = 14.669f,
                        y2 = 3.42888f,
                        x3 = 13.9303f,
                        y3 = 4.39093f,
                    )
                    curveTo(
                        x1 = 13.1911f,
                        y1 = 5.35359f,
                        x2 = 12.75f,
                        y2 = 6.64303f,
                        x3 = 12.75f,
                        y3 = 8.00758f,
                    )
                    curveTo(
                        x1 = 12.75f,
                        y1 = 10.4237f,
                        x2 = 14.1789f,
                        y2 = 12.5161f,
                        x3 = 16.25f,
                        y3 = 12.927f,
                    )
                    verticalLineTo(y = 21.0f)
                    horizontalLineTo(x = 17.75f)
                    verticalLineTo(y = 12.927f)
                    curveTo(
                        x1 = 19.8211f,
                        y1 = 12.5161f,
                        x2 = 21.25f,
                        y2 = 10.4237f,
                        x3 = 21.25f,
                        y3 = 8.00758f,
                    )
                    curveTo(
                        x1 = 21.25f,
                        y1 = 6.64303f,
                        x2 = 20.8089f,
                        y2 = 5.35359f,
                        x3 = 20.0697f,
                        y3 = 4.39093f,
                    )
                    curveTo(
                        x1 = 19.331f,
                        y1 = 3.42888f,
                        x2 = 18.2537f,
                        y2 = 2.75f,
                        x3 = 17.0f,
                        y3 = 2.75f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.5f, y = 3.0f)
                    horizontalLineTo(x = 3.0f)
                    verticalLineTo(y = 9.0f)
                    curveTo(
                        x1 = 3.0f,
                        y1 = 10.9528f,
                        x2 = 4.39935f,
                        y2 = 12.5787f,
                        x3 = 6.25f,
                        y3 = 12.9298f,
                    )
                    verticalLineTo(y = 21.0f)
                    horizontalLineTo(x = 7.75f)
                    verticalLineTo(y = 12.9298f)
                    curveTo(
                        x1 = 9.60065f,
                        y1 = 12.5787f,
                        x2 = 11.0f,
                        y2 = 10.9528f,
                        x3 = 11.0f,
                        y3 = 9.0f,
                    )
                    verticalLineTo(y = 3.0f)
                    horizontalLineTo(x = 9.5f)
                    verticalLineTo(y = 9.0f)
                    curveTo(
                        x1 = 9.5f,
                        y1 = 10.3807f,
                        x2 = 8.38071f,
                        y2 = 11.5f,
                        x3 = 7.0f,
                        y3 = 11.5f,
                    )
                    curveTo(
                        x1 = 5.61929f,
                        y1 = 11.5f,
                        x2 = 4.5f,
                        y2 = 10.3807f,
                        x3 = 4.5f,
                        y3 = 9.0f,
                    )
                    verticalLineTo(y = 3.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 7.75f, y = 3.0f)
                    horizontalLineTo(x = 6.25f)
                    verticalLineTo(y = 10.0f)
                    horizontalLineTo(x = 7.75f)
                    verticalLineTo(y = 3.0f)
                    close()
                }
            }.build()
            .also { _knifeSpoon = it }
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
                imageVector = KnifeSpoon,
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
private var _knifeSpoon: ImageVector? = null
