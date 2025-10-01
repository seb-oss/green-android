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

val BatteryLoading: ImageVector
    get() {
        val current = _batteryLoading
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BatteryLoading",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 1.75f, y = 5.0f)
                    horizontalLineTo(x = 11.8125f)
                    lineTo(x = 6.9f, y = 11.55f)
                    curveTo(
                        x1 = 6.72955f,
                        y1 = 11.7773f,
                        x2 = 6.70214f,
                        y2 = 12.0813f,
                        x3 = 6.82918f,
                        y3 = 12.3354f,
                    )
                    curveTo(
                        x1 = 6.95622f,
                        y1 = 12.5895f,
                        x2 = 7.21592f,
                        y2 = 12.75f,
                        x3 = 7.5f,
                        y3 = 12.75f,
                    )
                    horizontalLineTo(x = 12.0f)
                    lineTo(x = 7.3125f, y = 19.0f)
                    horizontalLineTo(x = 1.75f)
                    curveTo(
                        x1 = 1.33579f,
                        y1 = 19.0f,
                        x2 = 1.0f,
                        y2 = 18.6642f,
                        x3 = 1.0f,
                        y3 = 18.25f,
                    )
                    verticalLineTo(y = 5.75f)
                    curveTo(
                        x1 = 1.0f,
                        y1 = 5.33579f,
                        x2 = 1.33579f,
                        y2 = 5.0f,
                        x3 = 1.75f,
                        y3 = 5.0f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 19.25f, y = 19.0f)
                    horizontalLineTo(x = 9.1875f)
                    lineTo(x = 14.1f, y = 12.45f)
                    curveTo(
                        x1 = 14.2704f,
                        y1 = 12.2227f,
                        x2 = 14.2979f,
                        y2 = 11.9187f,
                        x3 = 14.1708f,
                        y3 = 11.6646f,
                    )
                    curveTo(
                        x1 = 14.0438f,
                        y1 = 11.4105f,
                        x2 = 13.7841f,
                        y2 = 11.25f,
                        x3 = 13.5f,
                        y3 = 11.25f,
                    )
                    horizontalLineTo(x = 9.0f)
                    lineTo(x = 13.6875f, y = 5.0f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(
                        x1 = 19.6642f,
                        y1 = 5.0f,
                        x2 = 20.0f,
                        y2 = 5.33579f,
                        x3 = 20.0f,
                        y3 = 5.75f,
                    )
                    verticalLineTo(y = 8.0f)
                    horizontalLineTo(x = 22.25f)
                    curveTo(
                        x1 = 22.6642f,
                        y1 = 8.0f,
                        x2 = 23.0f,
                        y2 = 8.33579f,
                        x3 = 23.0f,
                        y3 = 8.75f,
                    )
                    verticalLineTo(y = 15.25f)
                    curveTo(
                        x1 = 23.0f,
                        y1 = 15.6642f,
                        x2 = 22.6642f,
                        y2 = 16.0f,
                        x3 = 22.25f,
                        y3 = 16.0f,
                    )
                    horizontalLineTo(x = 20.0f)
                    verticalLineTo(y = 18.25f)
                    curveTo(
                        x1 = 20.0f,
                        y1 = 18.6642f,
                        x2 = 19.6642f,
                        y2 = 19.0f,
                        x3 = 19.25f,
                        y3 = 19.0f,
                    )
                    close()
                    moveTo(x = 20.0f, y = 14.5f)
                    horizontalLineTo(x = 21.5f)
                    verticalLineTo(y = 9.5f)
                    horizontalLineTo(x = 20.0f)
                    verticalLineTo(y = 14.5f)
                    close()
                }
            }.build()
            .also { _batteryLoading = it }
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
                imageVector = BatteryLoading,
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
private var _batteryLoading: ImageVector? = null
