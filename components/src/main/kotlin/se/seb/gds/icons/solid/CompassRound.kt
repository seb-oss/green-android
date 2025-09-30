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

val CompassRound: ImageVector
    get() {
        val current = _compassRound
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CompassRound",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 6.47715f, x2 = 6.47715f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    curveTo(x1 = 17.5228f, y1 = 2.0f, x2 = 22.0f, y2 = 6.47715f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 17.5228f, x2 = 17.5228f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    curveTo(x1 = 6.47715f, y1 = 22.0f, x2 = 2.0f, y2 = 17.5228f, x3 = 2.0f, y3 = 12.0f)
                    close()
                    moveTo(x = 15.7652f, y = 8.23484f)
                    curveTo(x1 = 15.8603f, y1 = 8.33f, x2 = 15.8972f, y2 = 8.46885f, x3 = 15.8618f, y3 = 8.59868f)
                    lineTo(x = 14.3618f, y = 14.0987f)
                    curveTo(x1 = 14.3269f, y1 = 14.2268f, x2 = 14.2268f, y2 = 14.3269f, x3 = 14.0987f, y3 = 14.3618f)
                    lineTo(x = 8.59868f, y = 15.8618f)
                    curveTo(x1 = 8.46885f, y1 = 15.8972f, x2 = 8.33f, y2 = 15.8603f, x3 = 8.23484f, y3 = 15.7652f)
                    curveTo(x1 = 8.13969f, y1 = 15.67f, x2 = 8.10281f, y2 = 15.5312f, x3 = 8.13822f, y3 = 15.4013f)
                    lineTo(x = 9.63822f, y = 9.90134f)
                    curveTo(x1 = 9.67316f, y1 = 9.77324f, x2 = 9.77324f, y2 = 9.67316f, x3 = 9.90134f, y3 = 9.63822f)
                    lineTo(x = 15.4013f, y = 8.13822f)
                    curveTo(x1 = 15.5312f, y1 = 8.10281f, x2 = 15.67f, y2 = 8.13969f, x3 = 15.7652f, y3 = 8.23484f)
                    close()
                }
            }.build()
            .also { _compassRound = it }
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
                imageVector = CompassRound,
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
private var _compassRound: ImageVector? = null
