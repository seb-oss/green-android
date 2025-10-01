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

val Key: ImageVector
    get() {
        val current = _key
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Key",
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
                moveTo(x = 1.75f, y = 12.0f)
                curveTo(x1 = 1.75f, y1 = 14.8995f, x2 = 4.10051f, y2 = 17.25f, x3 = 7.0f, y3 = 17.25f)
                curveTo(x1 = 8.69095f, y1 = 17.25f, x2 = 10.1952f, y2 = 16.4506f, x3 = 11.1554f, y3 = 15.2091f)
                curveTo(x1 = 11.3677f, y1 = 14.9345f, x2 = 11.6844f, y2 = 14.75f, x3 = 12.0315f, y3 = 14.75f)
                horizontalLineTo(x = 13.7132f)
                curveTo(x1 = 13.9006f, y1 = 14.75f, x2 = 14.0843f, y2 = 14.6973f, x3 = 14.2432f, y3 = 14.598f)
                lineTo(x = 15.47f, y = 13.8312f)
                curveTo(x1 = 15.7943f, y1 = 13.6286f, x2 = 16.2057f, y2 = 13.6286f, x3 = 16.53f, y3 = 13.8312f)
                lineTo(x = 17.7568f, y = 14.598f)
                curveTo(x1 = 17.9157f, y1 = 14.6973f, x2 = 18.0994f, y2 = 14.75f, x3 = 18.2868f, y3 = 14.75f)
                horizontalLineTo(x = 20.0261f)
                curveTo(x1 = 20.3261f, y1 = 14.75f, x2 = 20.6101f, y2 = 14.6154f, x3 = 20.8001f, y3 = 14.3832f)
                lineTo(x = 22.2319f, y = 12.6332f)
                curveTo(x1 = 22.5333f, y1 = 12.2649f, x2 = 22.5333f, y2 = 11.7351f, x3 = 22.2319f, y3 = 11.3668f)
                lineTo(x = 20.8001f, y = 9.61676f)
                curveTo(x1 = 20.6101f, y1 = 9.38463f, x2 = 20.3261f, y2 = 9.25f, x3 = 20.0261f, y3 = 9.25f)
                horizontalLineTo(x = 12.0315f)
                curveTo(x1 = 11.6844f, y1 = 9.25f, x2 = 11.3677f, y2 = 9.06549f, x3 = 11.1554f, y3 = 8.79095f)
                curveTo(x1 = 10.1952f, y1 = 7.54942f, x2 = 8.69095f, y2 = 6.75f, x3 = 7.0f, y3 = 6.75f)
                curveTo(x1 = 4.10051f, y1 = 6.75f, x2 = 1.75f, y2 = 9.10051f, x3 = 1.75f, y3 = 12.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.75f, y = 12.0f)
                curveTo(x1 = 7.75f, y1 = 12.4142f, x2 = 7.41421f, y2 = 12.75f, x3 = 7.0f, y3 = 12.75f)
                curveTo(x1 = 6.58579f, y1 = 12.75f, x2 = 6.25f, y2 = 12.4142f, x3 = 6.25f, y3 = 12.0f)
                curveTo(x1 = 6.25f, y1 = 11.5858f, x2 = 6.58579f, y2 = 11.25f, x3 = 7.0f, y3 = 11.25f)
                curveTo(x1 = 7.41421f, y1 = 11.25f, x2 = 7.75f, y2 = 11.5858f, x3 = 7.75f, y3 = 12.0f)
                close()
            }
        }.build().also { _key = it }
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
                imageVector = Key,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _key: ImageVector? = null
