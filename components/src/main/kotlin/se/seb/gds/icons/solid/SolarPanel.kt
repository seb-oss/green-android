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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val SolarPanel: ImageVector
    get() {
        val current = _solarPanel
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SolarPanel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.75f, y = 15.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.4735f, y1 = 15.0f, x2 = 20.6853f, y2 = 14.9003f, x3 = 20.8278f, y3 = 14.7281f)
                curveTo(x1 = 20.9703f, y1 = 14.556f, x2 = 21.0286f, y2 = 14.3292f, x3 = 20.9868f, y3 = 14.1097f)
                lineTo(x = 20.1563f, y = 9.75f)
                horizontalLineTo(x = 12.75f)
                verticalLineTo(y = 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.25f, y = 15.0f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 4.75f)
                curveTo(x1 = 4.33579f, y1 = 19.5f, x2 = 4.0f, y2 = 19.8358f, x3 = 4.0f, y3 = 20.25f)
                curveTo(x1 = 4.0f, y1 = 20.6642f, x2 = 4.33579f, y2 = 21.0f, x3 = 4.75f, y3 = 21.0f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.6642f, y1 = 21.0f, x2 = 20.0f, y2 = 20.6642f, x3 = 20.0f, y3 = 20.25f)
                curveTo(x1 = 20.0f, y1 = 19.8358f, x2 = 19.6642f, y2 = 19.5f, x3 = 19.25f, y3 = 19.5f)
                horizontalLineTo(x = 12.75f)
                verticalLineTo(y = 15.0f)
                horizontalLineTo(x = 11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.25f, y = 15.0f)
                verticalLineTo(y = 9.75f)
                horizontalLineTo(x = 3.84366f)
                lineTo(x = 3.01325f, y = 14.1097f)
                curveTo(x1 = 2.97143f, y1 = 14.3292f, x2 = 3.02971f, y2 = 14.556f, x3 = 3.17219f, y3 = 14.7281f)
                curveTo(x1 = 3.31467f, y1 = 14.9003f, x2 = 3.52652f, y2 = 15.0f, x3 = 3.75001f, y3 = 15.0f)
                horizontalLineTo(x = 11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.75f, y = 8.25f)
                horizontalLineTo(x = 19.8706f)
                lineTo(x = 18.9868f, y = 3.60967f)
                curveTo(x1 = 18.9194f, y1 = 3.25593f, x2 = 18.6101f, y2 = 3.0f, x3 = 18.25f, y3 = 3.0f)
                horizontalLineTo(x = 12.75f)
                verticalLineTo(y = 8.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.25f, y = 3.0f)
                verticalLineTo(y = 8.25f)
                horizontalLineTo(x = 4.12938f)
                lineTo(x = 5.01325f, y = 3.60967f)
                curveTo(x1 = 5.08063f, y1 = 3.25593f, x2 = 5.38991f, y2 = 3.0f, x3 = 5.75001f, y3 = 3.0f)
                horizontalLineTo(x = 11.25f)
                close()
            }
        }.build().also { _solarPanel = it }
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
                imageVector = SolarPanel,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _solarPanel: ImageVector? = null
