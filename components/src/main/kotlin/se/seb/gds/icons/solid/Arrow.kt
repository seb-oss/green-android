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

val Arrow: ImageVector
    get() {
        val current = _arrow
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Arrow",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 13.0f, y = 21.0f)
                    curveTo(x1 = 13.5523f, y1 = 21.0f, x2 = 14.0f, y2 = 20.5523f, x3 = 14.0f, y3 = 20.0f)
                    curveTo(x1 = 14.0f, y1 = 19.4477f, x2 = 13.5523f, y2 = 19.0f, x3 = 13.0f, y3 = 19.0f)
                    curveTo(x1 = 12.4477f, y1 = 19.0f, x2 = 12.0f, y2 = 19.4477f, x3 = 12.0f, y3 = 20.0f)
                    curveTo(x1 = 12.0f, y1 = 20.5523f, x2 = 12.4477f, y2 = 21.0f, x3 = 13.0f, y3 = 21.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 21.0f, y = 11.0f)
                    curveTo(x1 = 21.0f, y1 = 10.4477f, x2 = 20.5523f, y2 = 9.99999f, x3 = 20.0f, y3 = 9.99999f)
                    curveTo(x1 = 19.4477f, y1 = 9.99999f, x2 = 19.0f, y2 = 10.4477f, x3 = 19.0f, y3 = 11.0f)
                    curveTo(x1 = 19.0f, y1 = 11.5523f, x2 = 19.4477f, y2 = 12.0f, x3 = 20.0f, y3 = 12.0f)
                    curveTo(x1 = 20.5523f, y1 = 12.0f, x2 = 21.0f, y2 = 11.5523f, x3 = 21.0f, y3 = 11.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 19.9295f, y = 14.2679f)
                    curveTo(x1 = 20.4078f, y1 = 14.5441f, x2 = 20.5716f, y2 = 15.1557f, x3 = 20.2955f, y3 = 15.634f)
                    curveTo(x1 = 20.0193f, y1 = 16.1123f, x2 = 19.4078f, y2 = 16.2761f, x3 = 18.9295f, y3 = 16.0f)
                    curveTo(x1 = 18.4512f, y1 = 15.7238f, x2 = 18.2873f, y2 = 15.1123f, x3 = 18.5634f, y3 = 14.634f)
                    curveTo(x1 = 18.8396f, y1 = 14.1557f, x2 = 19.4512f, y2 = 13.9918f, x3 = 19.9295f, y3 = 14.2679f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.3676f, y = 19.2942f)
                    curveTo(x1 = 17.8459f, y1 = 19.0181f, x2 = 18.0098f, y2 = 18.4065f, x3 = 17.7336f, y3 = 17.9282f)
                    curveTo(x1 = 17.4575f, y1 = 17.4499f, x2 = 16.8459f, y2 = 17.286f, x3 = 16.3676f, y3 = 17.5621f)
                    curveTo(x1 = 15.8893f, y1 = 17.8383f, x2 = 15.7254f, y2 = 18.4499f, x3 = 16.0016f, y3 = 18.9282f)
                    curveTo(x1 = 16.2777f, y1 = 19.4065f, x2 = 16.8893f, y2 = 19.5703f, x3 = 17.3676f, y3 = 19.2942f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 18.9269f, y = 7.99998f)
                    curveTo(x1 = 18.4487f, y1 = 8.27612f, x2 = 17.8371f, y2 = 8.11225f, x3 = 17.5609f, y3 = 7.63396f)
                    curveTo(x1 = 17.2848f, y1 = 7.15566f, x2 = 17.4487f, y2 = 6.54407f, x3 = 17.9269f, y3 = 6.26793f)
                    curveTo(x1 = 18.4052f, y1 = 5.99179f, x2 = 19.0168f, y2 = 6.15566f, x3 = 19.293f, y3 = 6.63396f)
                    curveTo(x1 = 19.5691f, y1 = 7.11225f, x2 = 19.4052f, y2 = 7.72384f, x3 = 18.9269f, y3 = 7.99998f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 12.0f, y = 4.5f)
                    curveTo(x1 = 7.85786f, y1 = 4.5f, x2 = 4.5f, y2 = 7.85786f, x3 = 4.5f, y3 = 12.0f)
                    curveTo(x1 = 4.5f, y1 = 14.8771f, x2 = 6.12022f, y2 = 17.3772f, x3 = 8.5f, y3 = 18.6352f)
                    verticalLineTo(y = 14.75f)
                    curveTo(x1 = 8.5f, y1 = 14.3358f, x2 = 8.83579f, y2 = 14.0f, x3 = 9.25f, y3 = 14.0f)
                    curveTo(x1 = 9.66421f, y1 = 14.0f, x2 = 10.0f, y2 = 14.3358f, x3 = 10.0f, y3 = 14.75f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 10.0f, y1 = 20.6642f, x2 = 9.66421f, y2 = 21.0f, x3 = 9.25f, y3 = 21.0f)
                    horizontalLineTo(x = 3.75f)
                    curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                    curveTo(x1 = 3.0f, y1 = 19.8358f, x2 = 3.33579f, y2 = 19.5f, x3 = 3.75f, y3 = 19.5f)
                    horizontalLineTo(x = 7.02362f)
                    curveTo(x1 = 4.59903f, y1 = 17.8881f, x2 = 3.0f, y2 = 15.1314f, x3 = 3.0f, y3 = 12.0f)
                    curveTo(x1 = 3.0f, y1 = 7.02944f, x2 = 7.02944f, y2 = 3.0f, x3 = 12.0f, y3 = 3.0f)
                    curveTo(x1 = 13.2572f, y1 = 3.0f, x2 = 14.4561f, y2 = 3.25823f, x3 = 15.5449f, y3 = 3.72524f)
                    curveTo(x1 = 15.9256f, y1 = 3.88852f, x2 = 16.1018f, y2 = 4.32948f, x3 = 15.9386f, y3 = 4.71016f)
                    curveTo(x1 = 15.7753f, y1 = 5.09083f, x2 = 15.3343f, y2 = 5.26707f, x3 = 14.9536f, y3 = 5.10379f)
                    curveTo(x1 = 14.0482f, y1 = 4.71543f, x2 = 13.0502f, y2 = 4.5f, x3 = 12.0f, y3 = 4.5f)
                    close()
                }
            }.build()
            .also { _arrow = it }
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
                imageVector = Arrow,
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
private var _arrow: ImageVector? = null
