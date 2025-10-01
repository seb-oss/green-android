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

val ChevronTopSmall: ImageVector
    get() {
        val current = _chevronTopSmall
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ChevronTopSmall",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 11.4697f, y = 9.46967f)
                    curveTo(
                        x1 = 11.7626f,
                        y1 = 9.17678f,
                        x2 = 12.2374f,
                        y2 = 9.17678f,
                        x3 = 12.5303f,
                        y3 = 9.46967f,
                    )
                    lineTo(x = 16.5303f, y = 13.4697f)
                    curveTo(
                        x1 = 16.8232f,
                        y1 = 13.7626f,
                        x2 = 16.8232f,
                        y2 = 14.2374f,
                        x3 = 16.5303f,
                        y3 = 14.5303f,
                    )
                    curveTo(
                        x1 = 16.2374f,
                        y1 = 14.8232f,
                        x2 = 15.7626f,
                        y2 = 14.8232f,
                        x3 = 15.4697f,
                        y3 = 14.5303f,
                    )
                    lineTo(x = 12.0f, y = 11.0607f)
                    lineTo(x = 8.53033f, y = 14.5303f)
                    curveTo(
                        x1 = 8.23744f,
                        y1 = 14.8232f,
                        x2 = 7.76256f,
                        y2 = 14.8232f,
                        x3 = 7.46967f,
                        y3 = 14.5303f,
                    )
                    curveTo(
                        x1 = 7.17678f,
                        y1 = 14.2374f,
                        x2 = 7.17678f,
                        y2 = 13.7626f,
                        x3 = 7.46967f,
                        y3 = 13.4697f,
                    )
                    lineTo(x = 11.4697f, y = 9.46967f)
                    close()
                }
            }.build()
            .also { _chevronTopSmall = it }
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
                imageVector = ChevronTopSmall,
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
private var _chevronTopSmall: ImageVector? = null
