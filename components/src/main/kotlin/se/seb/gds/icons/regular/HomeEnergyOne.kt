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

val HomeEnergyOne: ImageVector
    get() {
        val current = _homeEnergyOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.HomeEnergyOne",
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
                moveTo(x = 19.25f, y = 7.94038f)
                lineTo(x = 12.0f, y = 2.75f)
                lineTo(x = 4.74997f, y = 7.9404f)
                moveTo(x = 19.25f, y = 7.94038f)
                lineTo(x = 21.5f, y = 9.55119f)
                moveTo(x = 19.25f, y = 7.94038f)
                verticalLineTo(y = 10.5952f)
                moveTo(x = 4.74997f, y = 7.9404f)
                lineTo(x = 2.5f, y = 9.55119f)
                moveTo(x = 4.74997f, y = 7.9404f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 12.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.25f, y = 12.0f)
                curveTo(x1 = 9.25f, y1 = 10.4812f, x2 = 10.4812f, y2 = 9.25f, x3 = 12.0f, y3 = 9.25f)
                curveTo(x1 = 13.5188f, y1 = 9.25f, x2 = 14.75f, y2 = 10.4812f, x3 = 14.75f, y3 = 12.0f)
                curveTo(x1 = 14.75f, y1 = 13.5188f, x2 = 13.5188f, y2 = 14.75f, x3 = 12.0f, y3 = 14.75f)
                curveTo(x1 = 10.4812f, y1 = 14.75f, x2 = 9.25f, y2 = 13.5188f, x3 = 9.25f, y3 = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.0184f, y = 14.0218f)
                curveTo(x1 = 19.0184f, y1 = 13.5324f, x2 = 18.4181f, y2 = 13.3132f, x3 = 18.1151f, y3 = 13.692f)
                lineTo(x = 15.1161f, y = 17.441f)
                curveTo(x1 = 14.844f, y1 = 17.781f, x2 = 15.0806f, y2 = 18.2916f, x3 = 15.5102f, y3 = 18.2916f)
                horizontalLineTo(x = 16.9816f)
                verticalLineTo(y = 20.4782f)
                curveTo(x1 = 16.9816f, y1 = 20.9676f, x2 = 17.5819f, y2 = 21.1868f, x3 = 17.8849f, y3 = 20.808f)
                lineTo(x = 20.8839f, y = 17.059f)
                curveTo(x1 = 21.156f, y1 = 16.719f, x2 = 20.9194f, y2 = 16.2084f, x3 = 20.4898f, y3 = 16.2084f)
                horizontalLineTo(x = 19.0184f)
                verticalLineTo(y = 14.0218f)
                close()
            }
        }.build().also { _homeEnergyOne = it }
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
                imageVector = HomeEnergyOne,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _homeEnergyOne: ImageVector? = null
