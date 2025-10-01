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

val ChainLink: ImageVector
    get() {
        val current = _chainLink
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChainLink",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 18.9125f, y = 5.08755f)
                curveTo(x1 = 16.7957f, y1 = 2.97082f, x2 = 13.3638f, y2 = 2.97082f, x3 = 11.2471f, y3 = 5.08755f)
                lineTo(x = 9.75027f, y = 6.58437f)
                lineTo(x = 8.68961f, y = 5.52371f)
                lineTo(x = 10.1864f, y = 4.02689f)
                curveTo(x1 = 12.889f, y1 = 1.32437f, x2 = 17.2706f, y2 = 1.32437f, x3 = 19.9731f, y3 = 4.02689f)
                curveTo(x1 = 22.6756f, y1 = 6.7294f, x2 = 22.6756f, y2 = 11.111f, x3 = 19.9731f, y3 = 13.8136f)
                lineTo(x = 18.4742f, y = 15.3125f)
                lineTo(x = 17.4135f, y = 14.2519f)
                lineTo(x = 18.9125f, y = 12.7529f)
                curveTo(x1 = 21.0292f, y1 = 10.6362f, x2 = 21.0292f, y2 = 7.20428f, x3 = 18.9125f, y3 = 5.08755f)
                close()
                moveTo(x = 15.5607f, y = 9.5f)
                lineTo(x = 9.5f, y = 15.5607f)
                lineTo(x = 8.43934f, y = 14.5f)
                lineTo(x = 14.5f, y = 8.43934f)
                lineTo(x = 15.5607f, y = 9.5f)
                close()
                moveTo(x = 6.58952f, y = 9.74513f)
                lineTo(x = 5.08755f, y = 11.2471f)
                curveTo(x1 = 2.97082f, y1 = 13.3638f, x2 = 2.97082f, y2 = 16.7957f, x3 = 5.08755f, y3 = 18.9125f)
                curveTo(x1 = 7.20428f, y1 = 21.0292f, x2 = 10.6362f, y2 = 21.0292f, x3 = 12.7529f, y3 = 18.9125f)
                lineTo(x = 14.2478f, y = 17.4176f)
                lineTo(x = 15.3084f, y = 18.4782f)
                lineTo(x = 13.8136f, y = 19.9731f)
                curveTo(x1 = 11.1111f, y1 = 22.6756f, x2 = 6.72941f, y2 = 22.6756f, x3 = 4.02689f, y3 = 19.9731f)
                curveTo(x1 = 1.32437f, y1 = 17.2706f, x2 = 1.32437f, y2 = 12.889f, x3 = 4.02689f, y3 = 10.1864f)
                lineTo(x = 5.52886f, y = 8.68446f)
                lineTo(x = 6.58952f, y = 9.74513f)
                close()
            }
        }.build().also { _chainLink = it }
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
                imageVector = ChainLink,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chainLink: ImageVector? = null
