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
                    moveTo(x = 12.25f, y = 3.75f)
                    curveTo(x1 = 7.55558f, y1 = 3.75f, x2 = 3.75f, y2 = 7.55558f, x3 = 3.75f, y3 = 12.25f)
                    curveTo(x1 = 3.75f, y1 = 16.9444f, x2 = 7.55558f, y2 = 20.75f, x3 = 12.25f, y3 = 20.75f)
                    curveTo(x1 = 16.9444f, y1 = 20.75f, x2 = 20.75f, y2 = 16.9444f, x3 = 20.75f, y3 = 12.25f)
                    curveTo(x1 = 20.75f, y1 = 7.55558f, x2 = 16.9444f, y2 = 3.75f, x3 = 12.25f, y3 = 3.75f)
                    close()
                    moveTo(x = 2.25f, y = 12.25f)
                    curveTo(x1 = 2.25f, y1 = 6.72715f, x2 = 6.72715f, y2 = 2.25f, x3 = 12.25f, y3 = 2.25f)
                    curveTo(x1 = 17.7728f, y1 = 2.25f, x2 = 22.25f, y2 = 6.72715f, x3 = 22.25f, y3 = 12.25f)
                    curveTo(x1 = 22.25f, y1 = 17.7728f, x2 = 17.7728f, y2 = 22.25f, x3 = 12.25f, y3 = 22.25f)
                    curveTo(x1 = 6.72715f, y1 = 22.25f, x2 = 2.25f, y2 = 17.7728f, x3 = 2.25f, y3 = 12.25f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 10.25f, y = 15.0539f)
                    verticalLineTo(y = 9.44607f)
                    curveTo(x1 = 10.25f, y1 = 9.04436f, x2 = 10.6998f, y2 = 8.80666f, x3 = 11.0317f, y3 = 9.03295f)
                    lineTo(x = 15.1441f, y = 11.8369f)
                    curveTo(x1 = 15.4352f, y1 = 12.0354f, x2 = 15.4352f, y2 = 12.4646f, x3 = 15.1441f, y3 = 12.6631f)
                    lineTo(x = 11.0317f, y = 15.467f)
                    curveTo(x1 = 10.6998f, y1 = 15.6933f, x2 = 10.25f, y2 = 15.4556f, x3 = 10.25f, y3 = 15.0539f)
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
