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

val SettingsSliderVer: ImageVector
    get() {
        val current = _settingsSliderVer
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SettingsSliderVer",
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
                moveTo(x = 17.0f, y = 13.75f)
                verticalLineTo(y = 3.75f)
                moveTo(x = 17.0f, y = 13.75f)
                curveTo(x1 = 18.7956f, y1 = 13.75f, x2 = 20.25f, y2 = 15.2044f, x3 = 20.25f, y3 = 17.0f)
                curveTo(x1 = 20.25f, y1 = 18.7956f, x2 = 18.7956f, y2 = 20.25f, x3 = 17.0f, y3 = 20.25f)
                curveTo(x1 = 15.2044f, y1 = 20.25f, x2 = 13.75f, y2 = 18.7956f, x3 = 13.75f, y3 = 17.0f)
                curveTo(x1 = 13.75f, y1 = 15.2044f, x2 = 15.2044f, y2 = 13.75f, x3 = 17.0f, y3 = 13.75f)
                close()
                moveTo(x = 7.0f, y = 20.25f)
                verticalLineTo(y = 12.25f)
                moveTo(x = 7.0f, y = 12.25f)
                curveTo(x1 = 5.20438f, y1 = 12.25f, x2 = 3.75f, y2 = 10.7956f, x3 = 3.75f, y3 = 9.0f)
                curveTo(x1 = 3.75f, y1 = 7.20438f, x2 = 5.20438f, y2 = 5.75f, x3 = 7.0f, y3 = 5.75f)
                moveTo(x = 7.0f, y = 12.25f)
                curveTo(x1 = 8.79562f, y1 = 12.25f, x2 = 10.25f, y2 = 10.7956f, x3 = 10.25f, y3 = 9.0f)
                curveTo(x1 = 10.25f, y1 = 7.20438f, x2 = 8.79562f, y2 = 5.75f, x3 = 7.0f, y3 = 5.75f)
                moveTo(x = 7.0f, y = 5.75f)
                verticalLineTo(y = 3.75f)
            }
        }.build().also { _settingsSliderVer = it }
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
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _settingsSliderVer: ImageVector? = null
