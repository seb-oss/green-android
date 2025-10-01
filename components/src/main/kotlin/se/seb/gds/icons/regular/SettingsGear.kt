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

val SettingsGear: ImageVector
    get() {
        val current = _settingsGear
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SettingsGear",
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
                    moveTo(x = 9.225f, y = 5.525f)
                    lineTo(x = 6.21875f, y = 4.83125f)
                    lineTo(x = 4.83125f, y = 6.21875f)
                    lineTo(x = 5.525f, y = 9.225f)
                    lineTo(x = 2.75f, y = 11.075f)
                    verticalLineTo(y = 12.925f)
                    lineTo(x = 5.525f, y = 14.775f)
                    lineTo(x = 4.83125f, y = 17.7812f)
                    lineTo(x = 6.21875f, y = 19.1687f)
                    lineTo(x = 9.225f, y = 18.475f)
                    lineTo(x = 11.075f, y = 21.25f)
                    horizontalLineTo(x = 12.925f)
                    lineTo(x = 14.775f, y = 18.475f)
                    lineTo(x = 17.7812f, y = 19.1687f)
                    lineTo(x = 19.1687f, y = 17.7812f)
                    lineTo(x = 18.475f, y = 14.775f)
                    lineTo(x = 21.25f, y = 12.925f)
                    verticalLineTo(y = 11.075f)
                    lineTo(x = 18.475f, y = 9.225f)
                    lineTo(x = 19.1687f, y = 6.21875f)
                    lineTo(x = 17.7812f, y = 4.83125f)
                    lineTo(x = 14.775f, y = 5.525f)
                    lineTo(x = 12.925f, y = 2.75f)
                    horizontalLineTo(x = 11.075f)
                    lineTo(x = 9.225f, y = 5.525f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 14.75f, y = 12.0f)
                    curveTo(
                        x1 = 14.75f,
                        y1 = 13.5188f,
                        x2 = 13.5188f,
                        y2 = 14.75f,
                        x3 = 12.0f,
                        y3 = 14.75f,
                    )
                    curveTo(
                        x1 = 10.4812f,
                        y1 = 14.75f,
                        x2 = 9.25f,
                        y2 = 13.5188f,
                        x3 = 9.25f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 9.25f,
                        y1 = 10.4812f,
                        x2 = 10.4812f,
                        y2 = 9.25f,
                        x3 = 12.0f,
                        y3 = 9.25f,
                    )
                    curveTo(
                        x1 = 13.5188f,
                        y1 = 9.25f,
                        x2 = 14.75f,
                        y2 = 10.4812f,
                        x3 = 14.75f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _settingsGear = it }
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
                imageVector = SettingsGear,
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
private var _settingsGear: ImageVector? = null
