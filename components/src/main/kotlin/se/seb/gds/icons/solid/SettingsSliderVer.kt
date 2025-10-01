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

val SettingsSliderVer: ImageVector
    get() {
        val current = _settingsSliderVer
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SettingsSliderVer",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.75f, y = 13.0701f)
                    curveTo(
                        x1 = 19.6011f,
                        y1 = 13.421f,
                        x2 = 21.0f,
                        y2 = 15.0465f,
                        x3 = 21.0f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 21.0f,
                        y1 = 19.2098f,
                        x2 = 19.2098f,
                        y2 = 21.0f,
                        x3 = 17.0f,
                        y3 = 21.0f,
                    )
                    curveTo(
                        x1 = 14.7902f,
                        y1 = 21.0f,
                        x2 = 13.0f,
                        y2 = 19.2098f,
                        x3 = 13.0f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 13.0f,
                        y1 = 15.0465f,
                        x2 = 14.3989f,
                        y2 = 13.421f,
                        x3 = 16.25f,
                        y3 = 13.0701f,
                    )
                    verticalLineTo(y = 3.75f)
                    curveTo(
                        x1 = 16.25f,
                        y1 = 3.33579f,
                        x2 = 16.5858f,
                        y2 = 3.0f,
                        x3 = 17.0f,
                        y3 = 3.0f,
                    )
                    curveTo(
                        x1 = 17.4142f,
                        y1 = 3.0f,
                        x2 = 17.75f,
                        y2 = 3.33579f,
                        x3 = 17.75f,
                        y3 = 3.75f,
                    )
                    verticalLineTo(y = 13.0701f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 7.0f, y = 21.0f)
                    curveTo(
                        x1 = 6.58579f,
                        y1 = 21.0f,
                        x2 = 6.25f,
                        y2 = 20.6642f,
                        x3 = 6.25f,
                        y3 = 20.25f,
                    )
                    verticalLineTo(y = 12.9299f)
                    curveTo(
                        x1 = 4.3989f,
                        y1 = 12.579f,
                        x2 = 3.0f,
                        y2 = 10.9535f,
                        x3 = 3.0f,
                        y3 = 9.0f,
                    )
                    curveTo(
                        x1 = 3.0f,
                        y1 = 7.04652f,
                        x2 = 4.3989f,
                        y2 = 5.421f,
                        x3 = 6.25f,
                        y3 = 5.07014f,
                    )
                    verticalLineTo(y = 3.75f)
                    curveTo(
                        x1 = 6.25f,
                        y1 = 3.33579f,
                        x2 = 6.58579f,
                        y2 = 3.0f,
                        x3 = 7.0f,
                        y3 = 3.0f,
                    )
                    curveTo(
                        x1 = 7.41421f,
                        y1 = 3.0f,
                        x2 = 7.75f,
                        y2 = 3.33579f,
                        x3 = 7.75f,
                        y3 = 3.75f,
                    )
                    verticalLineTo(y = 5.07014f)
                    curveTo(
                        x1 = 9.6011f,
                        y1 = 5.421f,
                        x2 = 11.0f,
                        y2 = 7.04652f,
                        x3 = 11.0f,
                        y3 = 9.0f,
                    )
                    curveTo(
                        x1 = 11.0f,
                        y1 = 10.9535f,
                        x2 = 9.6011f,
                        y2 = 12.579f,
                        x3 = 7.75f,
                        y3 = 12.9299f,
                    )
                    verticalLineTo(y = 20.25f)
                    curveTo(
                        x1 = 7.75f,
                        y1 = 20.6642f,
                        x2 = 7.41421f,
                        y2 = 21.0f,
                        x3 = 7.0f,
                        y3 = 21.0f,
                    )
                    close()
                }
            }.build()
            .also { _settingsSliderVer = it }
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
                imageVector = SettingsSliderVer,
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
private var _settingsSliderVer: ImageVector? = null
