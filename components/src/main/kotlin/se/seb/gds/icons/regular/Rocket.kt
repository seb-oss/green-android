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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Rocket: ImageVector
    get() {
        val current = _rocket
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Rocket",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.86111f, y = 13.25f)
                horizontalLineTo(x = 3.25f)
                lineTo(x = 6.25f, y = 7.75f)
                horizontalLineTo(x = 11.2292f)
                moveTo(x = 6.86111f, y = 13.25f)
                lineTo(x = 10.75f, y = 17.1389f)
                moveTo(x = 6.86111f, y = 13.25f)
                lineTo(x = 11.2292f, y = 7.75f)
                moveTo(x = 10.75f, y = 17.1389f)
                verticalLineTo(y = 20.75f)
                lineTo(x = 16.25f, y = 17.75f)
                verticalLineTo(y = 12.7708f)
                moveTo(x = 10.75f, y = 17.1389f)
                lineTo(x = 16.25f, y = 12.7708f)
                moveTo(x = 16.25f, y = 12.7708f)
                curveTo(x1 = 19.3333f, y1 = 9.94444f, x2 = 21.25f, y2 = 6.86111f, x3 = 21.25f, y3 = 2.75f)
                curveTo(x1 = 17.1389f, y1 = 2.75f, x2 = 14.0556f, y2 = 4.66667f, x3 = 11.2292f, y3 = 7.75f)
                moveTo(x = 4.80556f, y = 21.25f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 19.1944f)
                curveTo(x1 = 2.75f, y1 = 18.0592f, x2 = 3.6703f, y2 = 17.1389f, x3 = 4.80556f, y3 = 17.1389f)
                curveTo(x1 = 5.94081f, y1 = 17.1389f, x2 = 6.86111f, y2 = 18.0592f, x3 = 6.86111f, y3 = 19.1944f)
                curveTo(x1 = 6.86111f, y1 = 20.3297f, x2 = 5.94081f, y2 = 21.25f, x3 = 4.80556f, y3 = 21.25f)
                close()
            }
        }.build().also { _rocket = it }
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
                imageVector = Rocket,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _rocket: ImageVector? = null
