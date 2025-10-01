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

val PlayCircle: ImageVector
    get() {
        val current = _playCircle
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PlayCircle",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 12.0f, y = 22.0f)
                    curveTo(
                        x1 = 17.5228f,
                        y1 = 22.0f,
                        x2 = 22.0f,
                        y2 = 17.5228f,
                        x3 = 22.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 6.47715f,
                        x2 = 17.5228f,
                        y2 = 2.0f,
                        x3 = 12.0f,
                        y3 = 2.0f,
                    )
                    curveTo(
                        x1 = 6.47715f,
                        y1 = 2.0f,
                        x2 = 2.0f,
                        y2 = 6.47715f,
                        x3 = 2.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 2.0f,
                        y1 = 17.5228f,
                        x2 = 6.47715f,
                        y2 = 22.0f,
                        x3 = 12.0f,
                        y3 = 22.0f,
                    )
                    close()
                    moveTo(x = 10.7817f, y = 8.78296f)
                    curveTo(
                        x1 = 10.4498f,
                        y1 = 8.55666f,
                        x2 = 10.0f,
                        y2 = 8.79436f,
                        x3 = 10.0f,
                        y3 = 9.19607f,
                    )
                    verticalLineTo(y = 14.8039f)
                    curveTo(
                        x1 = 10.0f,
                        y1 = 15.2056f,
                        x2 = 10.4498f,
                        y2 = 15.4433f,
                        x3 = 10.7817f,
                        y3 = 15.217f,
                    )
                    lineTo(x = 14.8941f, y = 12.4131f)
                    curveTo(
                        x1 = 15.1852f,
                        y1 = 12.2146f,
                        x2 = 15.1852f,
                        y2 = 11.7854f,
                        x3 = 14.8941f,
                        y3 = 11.5869f,
                    )
                    lineTo(x = 10.7817f, y = 8.78296f)
                    close()
                }
            }.build()
            .also { _playCircle = it }
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
                imageVector = PlayCircle,
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
private var _playCircle: ImageVector? = null
