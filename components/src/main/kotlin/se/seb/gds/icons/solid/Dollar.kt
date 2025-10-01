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

val Dollar: ImageVector
    get() {
        val current = _dollar
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Dollar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 2.0f, y = 12.0f)
                curveTo(x1 = 2.0f, y1 = 6.47715f, x2 = 6.47715f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 17.5228f, y1 = 2.0f, x2 = 22.0f, y2 = 6.47715f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 17.5228f, x2 = 17.5228f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 6.47715f, y1 = 22.0f, x2 = 2.0f, y2 = 17.5228f, x3 = 2.0f, y3 = 12.0f)
                close()
                moveTo(x = 12.0f, y = 5.59722f)
                curveTo(x1 = 12.4142f, y1 = 5.59722f, x2 = 12.75f, y2 = 5.93301f, x3 = 12.75f, y3 = 6.34722f)
                verticalLineTo(y = 7.21059f)
                curveTo(x1 = 13.6067f, y1 = 7.37687f, x2 = 14.3618f, y2 = 7.82497f, x3 = 14.8335f, y3 = 8.4772f)
                curveTo(x1 = 15.0762f, y1 = 8.81286f, x2 = 15.0008f, y2 = 9.28172f, x3 = 14.6652f, y3 = 9.52443f)
                curveTo(x1 = 14.3295f, y1 = 9.76714f, x2 = 13.8606f, y2 = 9.69179f, x3 = 13.6179f, y3 = 9.35613f)
                curveTo(x1 = 13.3349f, y1 = 8.96473f, x2 = 12.7471f, y2 = 8.63889f, x3 = 12.0f, y3 = 8.63889f)
                horizontalLineTo(x = 11.7145f)
                curveTo(x1 = 10.7025f, y1 = 8.63889f, x2 = 10.1806f, y2 = 9.26867f, x3 = 10.1806f, y3 = 9.71605f)
                verticalLineTo(y = 9.79449f)
                curveTo(x1 = 10.1806f, y1 = 10.1375f, x2 = 10.4302f, y2 = 10.5643f, x3 = 11.0258f, y3 = 10.8026f)
                lineTo(x = 13.5312f, y = 11.8047f)
                curveTo(x1 = 14.5496f, y1 = 12.212f, x2 = 15.3194f, y2 = 13.105f, x3 = 15.3194f, y3 = 14.2055f)
                curveTo(x1 = 15.3194f, y1 = 15.6253f, x2 = 14.107f, y2 = 16.6021f, x3 = 12.75f, y3 = 16.8166f)
                verticalLineTo(y = 17.6528f)
                curveTo(x1 = 12.75f, y1 = 18.067f, x2 = 12.4142f, y2 = 18.4028f, x3 = 12.0f, y3 = 18.4028f)
                curveTo(x1 = 11.5858f, y1 = 18.4028f, x2 = 11.25f, y2 = 18.067f, x3 = 11.25f, y3 = 17.6528f)
                verticalLineTo(y = 16.7894f)
                curveTo(x1 = 10.3933f, y1 = 16.6231f, x2 = 9.63816f, y2 = 16.175f, x3 = 9.16654f, y3 = 15.5228f)
                curveTo(x1 = 8.92383f, y1 = 15.1871f, x2 = 8.99918f, y2 = 14.7183f, x3 = 9.33484f, y3 = 14.4756f)
                curveTo(x1 = 9.6705f, y1 = 14.2329f, x2 = 10.1394f, y2 = 14.3082f, x3 = 10.3821f, y3 = 14.6439f)
                curveTo(x1 = 10.6651f, y1 = 15.0353f, x2 = 11.2529f, y2 = 15.3611f, x3 = 12.0f, y3 = 15.3611f)
                horizontalLineTo(x = 12.1874f)
                curveTo(x1 = 13.2536f, y1 = 15.3611f, x2 = 13.8194f, y2 = 14.6962f, x3 = 13.8194f, y3 = 14.2055f)
                curveTo(x1 = 13.8194f, y1 = 13.8625f, x2 = 13.5698f, y2 = 13.4357f, x3 = 12.9742f, y3 = 13.1974f)
                lineTo(x = 10.4688f, y = 12.1953f)
                curveTo(x1 = 9.45045f, y1 = 11.788f, x2 = 8.68056f, y2 = 10.895f, x3 = 8.68056f, y3 = 9.79449f)
                verticalLineTo(y = 9.71605f)
                curveTo(x1 = 8.68056f, y1 = 8.30663f, x2 = 9.90675f, y2 = 7.35168f, x3 = 11.25f, y3 = 7.17029f)
                verticalLineTo(y = 6.34722f)
                curveTo(x1 = 11.25f, y1 = 5.93301f, x2 = 11.5858f, y2 = 5.59722f, x3 = 12.0f, y3 = 5.59722f)
                close()
            }
        }.build().also { _dollar = it }
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
                imageVector = Dollar,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _dollar: ImageVector? = null
