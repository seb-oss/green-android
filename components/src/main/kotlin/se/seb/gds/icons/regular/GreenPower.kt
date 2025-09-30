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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val GreenPower: ImageVector
    get() {
        val current = _greenPower
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.GreenPower",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 3.74771f, y = 20.2422f)
                    lineTo(x = 6.16196f, y = 17.828f)
                    moveTo(x = 6.16196f, y = 17.828f)
                    curveTo(x1 = -0.373669f, y1 = 9.93872f, x2 = 6.83882f, y2 = 0.665628f, x3 = 19.7181f, y3 = 4.27183f)
                    curveTo(x1 = 23.3243f, y1 = 17.1512f, x2 = 14.0511f, y2 = 24.3636f, x3 = 6.16196f, y3 = 17.828f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 13.5184f, y = 8.27183f)
                    curveTo(x1 = 13.5184f, y1 = 7.78239f, x2 = 12.9181f, y2 = 7.56324f, x3 = 12.6151f, y3 = 7.94204f)
                    lineTo(x = 9.61607f, y = 11.691f)
                    curveTo(x1 = 9.34405f, y1 = 12.031f, x2 = 9.58059f, y2 = 12.5416f, x3 = 10.0102f, y3 = 12.5416f)
                    horizontalLineTo(x = 11.4816f)
                    verticalLineTo(y = 14.7282f)
                    curveTo(x1 = 11.4816f, y1 = 15.2176f, x2 = 12.0819f, y2 = 15.4368f, x3 = 12.3849f, y3 = 15.058f)
                    lineTo(x = 15.3839f, y = 11.309f)
                    curveTo(x1 = 15.656f, y1 = 10.969f, x2 = 15.4194f, y2 = 10.4584f, x3 = 14.9898f, y3 = 10.4584f)
                    horizontalLineTo(x = 13.5184f)
                    verticalLineTo(y = 8.27183f)
                    close()
                }
            }.build()
            .also { _greenPower = it }
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
                imageVector = GreenPower,
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
private var _greenPower: ImageVector? = null
