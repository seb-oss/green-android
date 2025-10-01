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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Bubbles: ImageVector
    get() {
        val current = _bubbles
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Bubbles",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 21.2522f, y = 3.0f)
                    curveTo(
                        x1 = 21.6664f,
                        y1 = 3.0f,
                        x2 = 22.0022f,
                        y2 = 3.33579f,
                        x3 = 22.0022f,
                        y3 = 3.75f,
                    )
                    verticalLineTo(y = 14.25f)
                    curveTo(
                        x1 = 22.0022f,
                        y1 = 14.6642f,
                        x2 = 21.6664f,
                        y2 = 15.0f,
                        x3 = 21.2522f,
                        y3 = 15.0f,
                    )
                    horizontalLineTo(x = 18.0022f)
                    verticalLineTo(y = 18.25f)
                    curveTo(
                        x1 = 18.0022f,
                        y1 = 18.6642f,
                        x2 = 17.6664f,
                        y2 = 19.0f,
                        x3 = 17.2522f,
                        y3 = 19.0f,
                    )
                    horizontalLineTo(x = 10.6965f)
                    lineTo(x = 6.36643f, y = 21.4056f)
                    curveTo(
                        x1 = 6.13413f,
                        y1 = 21.5347f,
                        x2 = 5.85088f,
                        y2 = 21.5312f,
                        x3 = 5.62185f,
                        y3 = 21.3964f,
                    )
                    curveTo(
                        x1 = 5.39282f,
                        y1 = 21.2616f,
                        x2 = 5.2522f,
                        y2 = 21.0157f,
                        x3 = 5.2522f,
                        y3 = 20.75f,
                    )
                    verticalLineTo(y = 19.0f)
                    horizontalLineTo(x = 2.7522f)
                    curveTo(
                        x1 = 2.33798f,
                        y1 = 19.0f,
                        x2 = 2.0022f,
                        y2 = 18.6642f,
                        x3 = 2.0022f,
                        y3 = 18.25f,
                    )
                    verticalLineTo(y = 7.75f)
                    curveTo(
                        x1 = 2.0022f,
                        y1 = 7.33579f,
                        x2 = 2.33798f,
                        y2 = 7.0f,
                        x3 = 2.7522f,
                        y3 = 7.0f,
                    )
                    horizontalLineTo(x = 6.2522f)
                    verticalLineTo(y = 3.75f)
                    curveTo(
                        x1 = 6.2522f,
                        y1 = 3.33579f,
                        x2 = 6.58798f,
                        y2 = 3.0f,
                        x3 = 7.0022f,
                        y3 = 3.0f,
                    )
                    horizontalLineTo(x = 21.2522f)
                    close()
                    moveTo(x = 7.7522f, y = 7.0f)
                    horizontalLineTo(x = 17.2522f)
                    curveTo(
                        x1 = 17.6664f,
                        y1 = 7.0f,
                        x2 = 18.0022f,
                        y2 = 7.33579f,
                        x3 = 18.0022f,
                        y3 = 7.75f,
                    )
                    verticalLineTo(y = 13.5f)
                    horizontalLineTo(x = 20.5022f)
                    verticalLineTo(y = 4.5f)
                    horizontalLineTo(x = 7.7522f)
                    verticalLineTo(y = 7.0f)
                    close()
                }
            }.build()
            .also { _bubbles = it }
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
                imageVector = Bubbles,
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
private var _bubbles: ImageVector? = null
