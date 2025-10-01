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

val Sun: ImageVector
    get() {
        val current = _sun
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Sun",
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
                    moveTo(x = 12.0002f, y = 3.29083f)
                    verticalLineTo(y = 1.76758f)
                    moveTo(x = 5.8418f, y = 18.1586f)
                    lineTo(x = 4.7647f, y = 19.2357f)
                    moveTo(x = 12.0002f, y = 22.2327f)
                    verticalLineTo(y = 20.7094f)
                    moveTo(x = 19.2353f, y = 4.76468f)
                    lineTo(x = 18.1582f, y = 5.84179f)
                    moveTo(x = 20.709f, y = 12.0001f)
                    horizontalLineTo(x = 22.2322f)
                    moveTo(x = 18.1582f, y = 18.1586f)
                    lineTo(x = 19.2353f, y = 19.2357f)
                    moveTo(x = 1.76758f, y = 12.0001f)
                    horizontalLineTo(x = 3.29083f)
                    moveTo(x = 4.76462f, y = 4.76462f)
                    lineTo(x = 5.84173f, y = 5.84173f)
                    moveTo(x = 15.7123f, y = 8.28781f)
                    curveTo(
                        x1 = 17.7626f,
                        y1 = 10.3381f,
                        x2 = 17.7626f,
                        y2 = 13.6622f,
                        x3 = 15.7123f,
                        y3 = 15.7124f,
                    )
                    curveTo(
                        x1 = 13.6621f,
                        y1 = 17.7627f,
                        x2 = 10.3379f,
                        y2 = 17.7627f,
                        x3 = 8.28769f,
                        y3 = 15.7124f,
                    )
                    curveTo(
                        x1 = 6.23744f,
                        y1 = 13.6622f,
                        x2 = 6.23744f,
                        y2 = 10.3381f,
                        x3 = 8.28769f,
                        y3 = 8.28781f,
                    )
                    curveTo(
                        x1 = 10.3379f,
                        y1 = 6.23756f,
                        x2 = 13.6621f,
                        y2 = 6.23756f,
                        x3 = 15.7123f,
                        y3 = 8.28781f,
                    )
                    close()
                }
            }.build()
            .also { _sun = it }
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
                imageVector = Sun,
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
private var _sun: ImageVector? = null
