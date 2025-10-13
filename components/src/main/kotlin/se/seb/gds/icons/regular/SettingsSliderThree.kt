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

internal val SettingsSliderThree: ImageVector
    get() {
        val current = _settingsSliderThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SettingsSliderThree",
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
                moveTo(x = 5.70142f, y = 20.254f)
                verticalLineTo(y = 14.0015f)
                moveTo(x = 5.70142f, y = 10.25f)
                verticalLineTo(y = 3.74707f)
                moveTo(x = 12.0f, y = 20.0038f)
                verticalLineTo(y = 12.7505f)
                moveTo(x = 12.0f, y = 8.99915f)
                verticalLineTo(y = 3.99707f)
                moveTo(x = 18.2986f, y = 20.2536f)
                verticalLineTo(y = 16.002f)
                moveTo(x = 18.2986f, y = 12.2508f)
                verticalLineTo(y = 3.74707f)
                moveTo(x = 3.74628f, y = 13.7515f)
                horizontalLineTo(x = 7.75f)
                moveTo(x = 10.0f, y = 9.24902f)
                horizontalLineTo(x = 14.0f)
                moveTo(x = 16.25f, y = 15.752f)
                horizontalLineTo(x = 20.25f)
            }
        }.build().also { _settingsSliderThree = it }
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
                imageVector = SettingsSliderThree,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _settingsSliderThree: ImageVector? = null
