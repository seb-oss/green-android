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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Scissors: ImageVector
    get() {
        val current = _scissors
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Scissors",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 6.0f, y = 3.0f)
                    curveTo(x1 = 3.79086f, y1 = 3.0f, x2 = 2.0f, y2 = 4.79086f, x3 = 2.0f, y3 = 7.0f)
                    curveTo(x1 = 2.0f, y1 = 9.20914f, x2 = 3.79086f, y2 = 11.0f, x3 = 6.0f, y3 = 11.0f)
                    curveTo(x1 = 7.11278f, y1 = 11.0f, x2 = 8.11943f, y2 = 10.5456f, x3 = 8.84453f, y3 = 9.81224f)
                    lineTo(x = 11.8831f, y = 12.0f)
                    lineTo(x = 8.84453f, y = 14.1878f)
                    curveTo(x1 = 8.11943f, y1 = 13.4544f, x2 = 7.11278f, y2 = 13.0f, x3 = 6.0f, y3 = 13.0f)
                    curveTo(x1 = 3.79086f, y1 = 13.0f, x2 = 2.0f, y2 = 14.7909f, x3 = 2.0f, y3 = 17.0f)
                    curveTo(x1 = 2.0f, y1 = 19.2091f, x2 = 3.79086f, y2 = 21.0f, x3 = 6.0f, y3 = 21.0f)
                    curveTo(x1 = 8.20914f, y1 = 21.0f, x2 = 10.0f, y2 = 19.2091f, x3 = 10.0f, y3 = 17.0f)
                    curveTo(x1 = 10.0f, y1 = 16.444f, x2 = 9.88657f, y2 = 15.9145f, x3 = 9.68159f, y3 = 15.4334f)
                    lineTo(x = 22.5469f, y = 6.17042f)
                    lineTo(x = 21.0f, y = 5.43582f)
                    lineTo(x = 13.1667f, y = 11.0758f)
                    lineTo(x = 9.68159f, y = 8.56657f)
                    curveTo(x1 = 9.88657f, y1 = 8.08546f, x2 = 10.0f, y2 = 7.55598f, x3 = 10.0f, y3 = 7.0f)
                    curveTo(x1 = 10.0f, y1 = 4.79086f, x2 = 8.20914f, y2 = 3.0f, x3 = 6.0f, y3 = 3.0f)
                    close()
                    moveTo(x = 3.5f, y = 7.0f)
                    curveTo(x1 = 3.5f, y1 = 5.61929f, x2 = 4.61929f, y2 = 4.5f, x3 = 6.0f, y3 = 4.5f)
                    curveTo(x1 = 7.38071f, y1 = 4.5f, x2 = 8.5f, y2 = 5.61929f, x3 = 8.5f, y3 = 7.0f)
                    curveTo(x1 = 8.5f, y1 = 8.38071f, x2 = 7.38071f, y2 = 9.5f, x3 = 6.0f, y3 = 9.5f)
                    curveTo(x1 = 4.61929f, y1 = 9.5f, x2 = 3.5f, y2 = 8.38071f, x3 = 3.5f, y3 = 7.0f)
                    close()
                    moveTo(x = 3.5f, y = 17.0f)
                    curveTo(x1 = 3.5f, y1 = 15.6193f, x2 = 4.61929f, y2 = 14.5f, x3 = 6.0f, y3 = 14.5f)
                    curveTo(x1 = 7.38071f, y1 = 14.5f, x2 = 8.5f, y2 = 15.6193f, x3 = 8.5f, y3 = 17.0f)
                    curveTo(x1 = 8.5f, y1 = 18.3807f, x2 = 7.38071f, y2 = 19.5f, x3 = 6.0f, y3 = 19.5f)
                    curveTo(x1 = 4.61929f, y1 = 19.5f, x2 = 3.5f, y2 = 18.3807f, x3 = 3.5f, y3 = 17.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 21.0f, y = 18.5642f)
                    lineTo(x = 14.4502f, y = 13.8483f)
                    lineTo(x = 15.7338f, y = 12.9242f)
                    lineTo(x = 22.5469f, y = 17.8296f)
                    lineTo(x = 21.0f, y = 18.5642f)
                    close()
                }
            }.build()
            .also { _scissors = it }
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
                imageVector = Scissors,
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
private var _scissors: ImageVector? = null
