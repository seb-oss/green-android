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

internal val Law: ImageVector
    get() {
        val current = _law
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Law",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.7501f, y = 2.75f)
                curveTo(x1 = 12.7501f, y1 = 2.33579f, x2 = 12.4143f, y2 = 2.0f, x3 = 12.0001f, y3 = 2.0f)
                curveTo(x1 = 11.5859f, y1 = 2.0f, x2 = 11.2501f, y2 = 2.33579f, x3 = 11.2501f, y3 = 2.75f)
                verticalLineTo(y = 4.0f)
                horizontalLineTo(x = 10.0001f)
                curveTo(x1 = 9.88365f, y1 = 4.0f, x2 = 9.76882f, y2 = 4.02711f, x3 = 9.66468f, y3 = 4.07918f)
                lineTo(x = 7.82304f, y = 5.0f)
                horizontalLineTo(x = 2.75009f)
                curveTo(x1 = 2.33587f, y1 = 5.0f, x2 = 2.00009f, y2 = 5.33579f, x3 = 2.00009f, y3 = 5.75f)
                curveTo(x1 = 2.00009f, y1 = 6.16421f, x2 = 2.33587f, y2 = 6.5f, x3 = 2.75009f, y3 = 6.5f)
                horizontalLineTo(x = 4.47674f)
                lineTo(x = 1.7849f, y = 15.0242f)
                curveTo(x1 = 1.67828f, y1 = 15.3618f, x2 = 1.82231f, y2 = 15.728f, x3 = 2.13038f, y3 = 15.9025f)
                curveTo(x1 = 3.25339f, y1 = 16.5388f, x2 = 4.36077f, y2 = 16.8825f, x3 = 5.50009f, y3 = 16.8825f)
                curveTo(x1 = 6.6394f, y1 = 16.8825f, x2 = 7.74678f, y2 = 16.5388f, x3 = 8.86979f, y3 = 15.9025f)
                curveTo(x1 = 9.17786f, y1 = 15.728f, x2 = 9.3219f, y2 = 15.3618f, x3 = 9.21527f, y3 = 15.0242f)
                lineTo(x = 6.52344f, y = 6.5f)
                horizontalLineTo(x = 8.00009f)
                curveTo(x1 = 8.11652f, y1 = 6.5f, x2 = 8.23135f, y2 = 6.47289f, x3 = 8.3355f, y3 = 6.42082f)
                lineTo(x = 10.1771f, y = 5.5f)
                horizontalLineTo(x = 11.2501f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 6.75009f)
                curveTo(x1 = 6.33587f, y1 = 19.5f, x2 = 6.00009f, y2 = 19.8358f, x3 = 6.00009f, y3 = 20.25f)
                curveTo(x1 = 6.00009f, y1 = 20.6642f, x2 = 6.33587f, y2 = 21.0f, x3 = 6.75009f, y3 = 21.0f)
                horizontalLineTo(x = 17.2501f)
                curveTo(x1 = 17.6643f, y1 = 21.0f, x2 = 18.0001f, y2 = 20.6642f, x3 = 18.0001f, y3 = 20.25f)
                curveTo(x1 = 18.0001f, y1 = 19.8358f, x2 = 17.6643f, y2 = 19.5f, x3 = 17.2501f, y3 = 19.5f)
                horizontalLineTo(x = 12.7501f)
                verticalLineTo(y = 5.5f)
                horizontalLineTo(x = 13.823f)
                lineTo(x = 15.6647f, y = 6.42082f)
                curveTo(x1 = 15.7688f, y1 = 6.47289f, x2 = 15.8837f, y2 = 6.5f, x3 = 16.0001f, y3 = 6.5f)
                horizontalLineTo(x = 17.4767f)
                lineTo(x = 14.7849f, y = 15.0242f)
                curveTo(x1 = 14.6783f, y1 = 15.3618f, x2 = 14.8223f, y2 = 15.728f, x3 = 15.1304f, y3 = 15.9025f)
                curveTo(x1 = 16.2534f, y1 = 16.5388f, x2 = 17.3608f, y2 = 16.8825f, x3 = 18.5001f, y3 = 16.8825f)
                curveTo(x1 = 19.6394f, y1 = 16.8825f, x2 = 20.7468f, y2 = 16.5388f, x3 = 21.8698f, y3 = 15.9025f)
                curveTo(x1 = 22.1779f, y1 = 15.728f, x2 = 22.3219f, y2 = 15.3618f, x3 = 22.2153f, y3 = 15.0242f)
                lineTo(x = 19.5234f, y = 6.5f)
                horizontalLineTo(x = 21.2501f)
                curveTo(x1 = 21.6643f, y1 = 6.5f, x2 = 22.0001f, y2 = 6.16421f, x3 = 22.0001f, y3 = 5.75f)
                curveTo(x1 = 22.0001f, y1 = 5.33579f, x2 = 21.6643f, y2 = 5.0f, x3 = 21.2501f, y3 = 5.0f)
                horizontalLineTo(x = 16.1771f)
                lineTo(x = 14.3355f, y = 4.07918f)
                curveTo(x1 = 14.2314f, y1 = 4.02711f, x2 = 14.1165f, y2 = 4.0f, x3 = 14.0001f, y3 = 4.0f)
                horizontalLineTo(x = 12.7501f)
                verticalLineTo(y = 2.75f)
                close()
            }
        }.build().also { _law = it }
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
                imageVector = Law,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _law: ImageVector? = null
