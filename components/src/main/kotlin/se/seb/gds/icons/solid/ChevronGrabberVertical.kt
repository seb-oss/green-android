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

val ChevronGrabberVertical: ImageVector
    get() {
        val current = _chevronGrabberVertical
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ChevronGrabberVertical",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 11.4697f, y = 4.46967f)
                    curveTo(
                        x1 = 11.7626f,
                        y1 = 4.17678f,
                        x2 = 12.2374f,
                        y2 = 4.17678f,
                        x3 = 12.5303f,
                        y3 = 4.46967f,
                    )
                    lineTo(x = 16.5303f, y = 8.46967f)
                    curveTo(
                        x1 = 16.8232f,
                        y1 = 8.76256f,
                        x2 = 16.8232f,
                        y2 = 9.23744f,
                        x3 = 16.5303f,
                        y3 = 9.53033f,
                    )
                    curveTo(
                        x1 = 16.2374f,
                        y1 = 9.82322f,
                        x2 = 15.7626f,
                        y2 = 9.82322f,
                        x3 = 15.4697f,
                        y3 = 9.53033f,
                    )
                    lineTo(x = 12.0f, y = 6.06066f)
                    lineTo(x = 8.53033f, y = 9.53033f)
                    curveTo(
                        x1 = 8.23744f,
                        y1 = 9.82322f,
                        x2 = 7.76256f,
                        y2 = 9.82322f,
                        x3 = 7.46967f,
                        y3 = 9.53033f,
                    )
                    curveTo(
                        x1 = 7.17678f,
                        y1 = 9.23744f,
                        x2 = 7.17678f,
                        y2 = 8.76256f,
                        x3 = 7.46967f,
                        y3 = 8.46967f,
                    )
                    lineTo(x = 11.4697f, y = 4.46967f)
                    close()
                    moveTo(x = 7.46967f, y = 14.4697f)
                    curveTo(
                        x1 = 7.76256f,
                        y1 = 14.1768f,
                        x2 = 8.23744f,
                        y2 = 14.1768f,
                        x3 = 8.53033f,
                        y3 = 14.4697f,
                    )
                    lineTo(x = 12.0f, y = 17.9393f)
                    lineTo(x = 15.4697f, y = 14.4697f)
                    curveTo(
                        x1 = 15.7626f,
                        y1 = 14.1768f,
                        x2 = 16.2374f,
                        y2 = 14.1768f,
                        x3 = 16.5303f,
                        y3 = 14.4697f,
                    )
                    curveTo(
                        x1 = 16.8232f,
                        y1 = 14.7626f,
                        x2 = 16.8232f,
                        y2 = 15.2374f,
                        x3 = 16.5303f,
                        y3 = 15.5303f,
                    )
                    lineTo(x = 12.5303f, y = 19.5303f)
                    curveTo(
                        x1 = 12.2374f,
                        y1 = 19.8232f,
                        x2 = 11.7626f,
                        y2 = 19.8232f,
                        x3 = 11.4697f,
                        y3 = 19.5303f,
                    )
                    lineTo(x = 7.46967f, y = 15.5303f)
                    curveTo(
                        x1 = 7.17678f,
                        y1 = 15.2374f,
                        x2 = 7.17678f,
                        y2 = 14.7626f,
                        x3 = 7.46967f,
                        y3 = 14.4697f,
                    )
                    close()
                }
            }.build()
            .also { _chevronGrabberVertical = it }
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
                imageVector = ChevronGrabberVertical,
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
private var _chevronGrabberVertical: ImageVector? = null
