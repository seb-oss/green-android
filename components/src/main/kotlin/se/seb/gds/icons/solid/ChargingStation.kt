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
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 8.59206f, y = 6.65363f)
                    curveTo(
                        x1 = 8.83448f,
                        y1 = 6.35059f,
                        x2 = 9.31469f,
                        y2 = 6.52592f,
                        x3 = 9.31469f,
                        y3 = 6.91746f,
                    )
                    verticalLineTo(y = 8.66673f)
                    horizontalLineTo(x = 10.4918f)
                    curveTo(
                        x1 = 10.8355f,
                        y1 = 8.66673f,
                        x2 = 11.0247f,
                        y2 = 9.07516f,
                        x3 = 10.8071f,
                        y3 = 9.34719f,
                    )
                    lineTo(x = 8.4079f, y = 12.3464f)
                    curveTo(
                        x1 = 8.16547f,
                        y1 = 12.6494f,
                        x2 = 7.68526f,
                        y2 = 12.4741f,
                        x3 = 7.68526f,
                        y3 = 12.0825f,
                    )
                    verticalLineTo(y = 10.3333f)
                    horizontalLineTo(x = 6.5081f)
                    curveTo(
                        x1 = 6.16445f,
                        y1 = 10.3333f,
                        x2 = 5.97521f,
                        y2 = 9.92484f,
                        x3 = 6.19283f,
                        y3 = 9.65281f,
                    )
                    lineTo(x = 8.59206f, y = 6.65363f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 3.0f, y = 3.75f)
                    curveTo(
                        x1 = 3.0f,
                        y1 = 3.33579f,
                        x2 = 3.33579f,
                        y2 = 3.0f,
                        x3 = 3.75f,
                        y3 = 3.0f,
                    )
                    horizontalLineTo(x = 13.25f)
                    curveTo(
                        x1 = 13.6642f,
                        y1 = 3.0f,
                        x2 = 14.0f,
                        y2 = 3.33579f,
                        x3 = 14.0f,
                        y3 = 3.75f,
                    )
                    verticalLineTo(y = 19.5f)
                    horizontalLineTo(x = 20.25f)
                    curveTo(
                        x1 = 20.6642f,
                        y1 = 19.5f,
                        x2 = 21.0f,
                        y2 = 19.8358f,
                        x3 = 21.0f,
                        y3 = 20.25f,
                    )
                    curveTo(
                        x1 = 21.0f,
                        y1 = 20.6642f,
                        x2 = 20.6642f,
                        y2 = 21.0f,
                        x3 = 20.25f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 3.75f)
                    curveTo(
                        x1 = 3.33579f,
                        y1 = 21.0f,
                        x2 = 3.0f,
                        y2 = 20.6642f,
                        x3 = 3.0f,
                        y3 = 20.25f,
                    )
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 4.5f, y = 4.5f)
                    verticalLineTo(y = 14.0f)
                    horizontalLineTo(x = 12.5f)
                    verticalLineTo(y = 4.5f)
                    horizontalLineTo(x = 4.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 16.6738f, y = 4.26988f)
                    curveTo(
                        x1 = 16.939f,
                        y1 = 3.95167f,
                        x2 = 17.4119f,
                        y2 = 3.90868f,
                        x3 = 17.7301f,
                        y3 = 4.17385f,
                    )
                    lineTo(x = 20.7301f, y = 6.67385f)
                    curveTo(
                        x1 = 20.9011f,
                        y1 = 6.81635f,
                        x2 = 21.0f,
                        y2 = 7.02743f,
                        x3 = 21.0f,
                        y3 = 7.25002f,
                    )
                    verticalLineTo(y = 16.25f)
                    curveTo(
                        x1 = 21.0f,
                        y1 = 16.6642f,
                        x2 = 20.6642f,
                        y2 = 17.0f,
                        x3 = 20.25f,
                        y3 = 17.0f,
                    )
                    horizontalLineTo(x = 16.75f)
                    curveTo(
                        x1 = 16.3358f,
                        y1 = 17.0f,
                        x2 = 16.0f,
                        y2 = 16.6642f,
                        x3 = 16.0f,
                        y3 = 16.25f,
                    )
                    verticalLineTo(y = 10.75f)
                    curveTo(
                        x1 = 16.0f,
                        y1 = 10.3358f,
                        x2 = 16.3358f,
                        y2 = 10.0f,
                        x3 = 16.75f,
                        y3 = 10.0f,
                    )
                    curveTo(
                        x1 = 17.1642f,
                        y1 = 10.0f,
                        x2 = 17.5f,
                        y2 = 10.3358f,
                        x3 = 17.5f,
                        y3 = 10.75f,
                    )
                    verticalLineTo(y = 15.5f)
                    horizontalLineTo(x = 19.5f)
                    verticalLineTo(y = 7.6013f)
                    lineTo(x = 16.7699f, y = 5.32618f)
                    curveTo(
                        x1 = 16.4517f,
                        y1 = 5.06101f,
                        x2 = 16.4087f,
                        y2 = 4.58809f,
                        x3 = 16.6738f,
                        y3 = 4.26988f,
                    )
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
