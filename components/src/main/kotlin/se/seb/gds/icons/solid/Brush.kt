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

internal val Brush: ImageVector
    get() {
        val current = _brush
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Brush",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.9696f, y = 1.96967f)
                curveTo(x1 = 13.2625f, y1 = 1.67678f, x2 = 13.7374f, y2 = 1.67678f, x3 = 14.0302f, y3 = 1.96967f)
                lineTo(x = 18.0302f, y = 5.96967f)
                curveTo(x1 = 18.1709f, y1 = 6.11032f, x2 = 18.2499f, y2 = 6.30109f, x3 = 18.2499f, y3 = 6.5f)
                lineTo(x = 18.2499f, y = 7.75f)
                lineTo(x = 19.4999f, y = 7.75f)
                curveTo(x1 = 19.6988f, y1 = 7.75f, x2 = 19.8896f, y2 = 7.82902f, x3 = 20.0302f, y3 = 7.96967f)
                lineTo(x = 22.0302f, y = 9.96967f)
                curveTo(x1 = 22.3231f, y1 = 10.2626f, x2 = 22.3231f, y2 = 10.7374f, x3 = 22.0303f, y3 = 11.0303f)
                lineTo(x = 17.0304f, y = 16.0303f)
                curveTo(x1 = 17.0283f, y1 = 16.0323f, x2 = 17.0263f, y2 = 16.0343f, x3 = 17.0243f, y3 = 16.0363f)
                lineTo(x = 14.0302f, y = 19.0305f)
                curveTo(x1 = 13.8895f, y1 = 19.1712f, x2 = 13.6987f, y2 = 19.2502f, x3 = 13.4997f, y3 = 19.2501f)
                curveTo(x1 = 13.3007f, y1 = 19.2501f, x2 = 13.1099f, y2 = 19.171f, x3 = 12.9693f, y3 = 19.0302f)
                lineTo(x = 12.5918f, y = 18.6524f)
                curveTo(x1 = 11.7132f, y1 = 17.7729f, x2 = 10.288f, y2 = 17.7726f, x3 = 9.40899f, y3 = 18.6517f)
                lineTo(x = 6.03096f, y = 22.0299f)
                curveTo(x1 = 5.7381f, y1 = 22.3228f, x2 = 5.26329f, y2 = 22.3228f, x3 = 4.97037f, y3 = 22.03f)
                lineTo(x = 1.96983f, y = 19.0306f)
                curveTo(x1 = 1.82914f, y1 = 18.8899f, x2 = 1.75008f, y2 = 18.6992f, x3 = 1.75006f, y3 = 18.5002f)
                curveTo(x1 = 1.75004f, y1 = 18.3013f, x2 = 1.82905f, y2 = 18.1105f, x3 = 1.96971f, y3 = 17.9698f)
                lineTo(x = 5.34836f, y = 14.591f)
                curveTo(x1 = 6.22731f, y1 = 13.712f, x2 = 6.22692f, y2 = 12.2867f, x3 = 5.3475f, y3 = 11.4082f)
                lineTo(x = 4.96982f, y = 11.0309f)
                curveTo(x1 = 4.82905f, y1 = 10.8903f, x2 = 4.74993f, y2 = 10.6995f, x3 = 4.74988f, y3 = 10.5005f)
                curveTo(x1 = 4.74983f, y1 = 10.3016f, x2 = 4.82884f, y2 = 10.1107f, x3 = 4.96954f, y3 = 9.97001f)
                lineTo(x = 7.96041f, y = 6.979f)
                curveTo(x1 = 7.96344f, y1 = 6.97587f, x2 = 7.9665f, y2 = 6.97276f, x3 = 7.96958f, y3 = 6.96967f)
                lineTo(x = 12.9696f, y = 1.96967f)
                close()
                moveTo(x = 15.4393f, y = 15.5f)
                lineTo(x = 8.50001f, y = 8.56075f)
                lineTo(x = 6.55645f, y = 10.5044f)
                curveTo(x1 = 7.87157f, y1 = 11.9768f, x2 = 7.82258f, y2 = 14.238f, x3 = 6.40906f, y3 = 15.6516f)
                lineTo(x = 3.5608f, y = 18.5f)
                lineTo(x = 5.50049f, y = 20.439f)
                lineTo(x = 8.3483f, y = 17.591f)
                curveTo(x1 = 9.76192f, y1 = 16.1773f, x2 = 12.0233f, y2 = 16.1283f, x3 = 13.4958f, y3 = 17.4436f)
                lineTo(x = 15.4393f, y = 15.5f)
                close()
            }
        }.build().also { _brush = it }
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
                imageVector = Brush,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brush: ImageVector? = null
