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

internal val Store: ImageVector
    get() {
        val current = _store
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Store",
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
                moveTo(x = 20.25f, y = 12.0f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 3.75002f)
                verticalLineTo(y = 12.0f)
                moveTo(x = 9.50002f, y = 3.75f)
                horizontalLineTo(x = 14.5001f)
                moveTo(x = 9.50002f, y = 3.75f)
                lineTo(x = 8.90899f, y = 8.77398f)
                curveTo(x1 = 8.69131f, y1 = 10.6243f, x2 = 10.137f, y2 = 12.25f, x3 = 12.0001f, y3 = 12.25f)
                curveTo(x1 = 13.8631f, y1 = 12.25f, x2 = 15.3088f, y2 = 10.6243f, x3 = 15.0911f, y3 = 8.77397f)
                lineTo(x = 14.5001f, y = 3.75f)
                moveTo(x = 9.50002f, y = 3.75f)
                horizontalLineTo(x = 4.41668f)
                lineTo(x = 2.97236f, y = 8.35377f)
                curveTo(x1 = 2.36638f, y1 = 10.2853f, x2 = 3.8091f, y2 = 12.25f, x3 = 5.83349f, y3 = 12.25f)
                curveTo(x1 = 7.35405f, y1 = 12.25f, x2 = 8.63391f, y2 = 11.1119f, x3 = 8.81158f, y3 = 9.60174f)
                lineTo(x = 9.50002f, y = 3.75f)
                close()
                moveTo(x = 14.5001f, y = 3.75f)
                horizontalLineTo(x = 19.5833f)
                lineTo(x = 21.0277f, y = 8.35377f)
                curveTo(x1 = 21.6337f, y1 = 10.2853f, x2 = 20.1909f, y2 = 12.25f, x3 = 18.1665f, y3 = 12.25f)
                curveTo(x1 = 16.646f, y1 = 12.25f, x2 = 15.3661f, y2 = 11.1119f, x3 = 15.1885f, y3 = 9.60174f)
                lineTo(x = 14.5001f, y = 3.75f)
                close()
            }
        }.build().also { _store = it }
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
                imageVector = Store,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _store: ImageVector? = null
