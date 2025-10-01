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

val Pin: ImageVector
    get() {
        val current = _pin
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Pin",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 15.0303f, y = 2.21967f)
                    curveTo(
                        x1 = 14.8692f,
                        y1 = 2.0585f,
                        x2 = 14.6434f,
                        y2 = 1.97937f,
                        x3 = 14.4169f,
                        y3 = 2.00462f,
                    )
                    curveTo(
                        x1 = 14.1904f,
                        y1 = 2.02988f,
                        x2 = 13.9876f,
                        y2 = 2.15679f,
                        x3 = 13.8659f,
                        y3 = 2.34951f,
                    )
                    lineTo(x = 11.0111f, y = 6.86968f)
                    lineTo(x = 3.51976f, y = 9.28622f)
                    curveTo(
                        x1 = 3.27115f,
                        y1 = 9.36642f,
                        x2 = 3.08218f,
                        y2 = 9.5702f,
                        x3 = 3.02092f,
                        y3 = 9.82415f,
                    )
                    curveTo(
                        x1 = 2.95967f,
                        y1 = 10.0781f,
                        x2 = 3.03497f,
                        y2 = 10.3456f,
                        x3 = 3.21969f,
                        y3 = 10.5303f,
                    )
                    lineTo(x = 7.81436f, y = 15.125f)
                    lineTo(x = 3.21969f, y = 19.7197f)
                    curveTo(
                        x1 = 2.92679f,
                        y1 = 20.0126f,
                        x2 = 2.92679f,
                        y2 = 20.4874f,
                        x3 = 3.21969f,
                        y3 = 20.7803f,
                    )
                    curveTo(
                        x1 = 3.51258f,
                        y1 = 21.0732f,
                        x2 = 3.98745f,
                        y2 = 21.0732f,
                        x3 = 4.28035f,
                        y3 = 20.7803f,
                    )
                    lineTo(x = 8.87502f, y = 16.1857f)
                    lineTo(x = 13.4697f, y = 20.7803f)
                    curveTo(
                        x1 = 13.6544f,
                        y1 = 20.9651f,
                        x2 = 13.9219f,
                        y2 = 21.0403f,
                        x3 = 14.1759f,
                        y3 = 20.9791f,
                    )
                    curveTo(
                        x1 = 14.4298f,
                        y1 = 20.9178f,
                        x2 = 14.6336f,
                        y2 = 20.7289f,
                        x3 = 14.7138f,
                        y3 = 20.4803f,
                    )
                    lineTo(x = 17.1303f, y = 12.989f)
                    lineTo(x = 21.6505f, y = 10.1341f)
                    curveTo(
                        x1 = 21.8432f,
                        y1 = 10.0124f,
                        x2 = 21.9701f,
                        y2 = 9.80965f,
                        x3 = 21.9954f,
                        y3 = 9.58311f,
                    )
                    curveTo(
                        x1 = 22.0207f,
                        y1 = 9.35658f,
                        x2 = 21.9415f,
                        y2 = 9.13085f,
                        x3 = 21.7803f,
                        y3 = 8.96968f,
                    )
                    lineTo(x = 15.0303f, y = 2.21967f)
                    close()
                }
            }.build()
            .also { _pin = it }
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
                imageVector = Pin,
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
private var _pin: ImageVector? = null
