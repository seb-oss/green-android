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

val ChevronBottom: ImageVector
    get() {
        val current = _chevronBottom
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ChevronBottom",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 3.46967f, y = 8.46967f)
                    curveTo(
                        x1 = 3.76256f,
                        y1 = 8.17678f,
                        x2 = 4.23744f,
                        y2 = 8.17678f,
                        x3 = 4.53033f,
                        y3 = 8.46967f,
                    )
                    lineTo(x = 12.0f, y = 15.9393f)
                    lineTo(x = 19.4697f, y = 8.46967f)
                    curveTo(
                        x1 = 19.7626f,
                        y1 = 8.17678f,
                        x2 = 20.2374f,
                        y2 = 8.17678f,
                        x3 = 20.5303f,
                        y3 = 8.46967f,
                    )
                    curveTo(
                        x1 = 20.8232f,
                        y1 = 8.76256f,
                        x2 = 20.8232f,
                        y2 = 9.23744f,
                        x3 = 20.5303f,
                        y3 = 9.53033f,
                    )
                    lineTo(x = 12.5303f, y = 17.5303f)
                    curveTo(
                        x1 = 12.3897f,
                        y1 = 17.671f,
                        x2 = 12.1989f,
                        y2 = 17.75f,
                        x3 = 12.0f,
                        y3 = 17.75f,
                    )
                    curveTo(
                        x1 = 11.8011f,
                        y1 = 17.75f,
                        x2 = 11.6103f,
                        y2 = 17.671f,
                        x3 = 11.4697f,
                        y3 = 17.5303f,
                    )
                    lineTo(x = 3.46967f, y = 9.53033f)
                    curveTo(
                        x1 = 3.17678f,
                        y1 = 9.23744f,
                        x2 = 3.17678f,
                        y2 = 8.76256f,
                        x3 = 3.46967f,
                        y3 = 8.46967f,
                    )
                    close()
                }
            }.build()
            .also { _chevronBottom = it }
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
                imageVector = ChevronBottom,
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
private var _chevronBottom: ImageVector? = null
