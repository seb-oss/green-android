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

val ChargingStation: ImageVector
    get() {
        val current = _chargingStation
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ChargingStation",
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
                    moveTo(x = 13.25f, y = 14.75f)
                    verticalLineTo(y = 3.75f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 14.75f)
                    moveTo(x = 13.25f, y = 14.75f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 14.75f)
                    moveTo(x = 13.25f, y = 14.75f)
                    horizontalLineTo(x = 3.75f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 3.75f, y = 20.25f)
                    horizontalLineTo(x = 20.25f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 16.75f, y = 10.75f)
                    verticalLineTo(y = 16.25f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 7.25f)
                    lineTo(x = 17.25f, y = 4.75f)
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 9.31469f, y = 6.91746f)
                    curveTo(x1 = 9.31469f, y1 = 6.52592f, x2 = 8.83448f, y2 = 6.35059f, x3 = 8.59206f, y3 = 6.65363f)
                    lineTo(x = 6.19283f, y = 9.65281f)
                    curveTo(x1 = 5.97521f, y1 = 9.92484f, x2 = 6.16445f, y2 = 10.3333f, x3 = 6.5081f, y3 = 10.3333f)
                    horizontalLineTo(x = 7.68526f)
                    verticalLineTo(y = 12.0825f)
                    curveTo(x1 = 7.68526f, y1 = 12.4741f, x2 = 8.16548f, y2 = 12.6494f, x3 = 8.4079f, y3 = 12.3464f)
                    lineTo(x = 10.8071f, y = 9.34719f)
                    curveTo(x1 = 11.0247f, y1 = 9.07516f, x2 = 10.8355f, y2 = 8.66673f, x3 = 10.4918f, y3 = 8.66673f)
                    horizontalLineTo(x = 9.31469f)
                    verticalLineTo(y = 6.91746f)
                    close()
                }
            }.build()
            .also { _chargingStation = it }
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
                imageVector = ChargingStation,
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
private var _chargingStation: ImageVector? = null
