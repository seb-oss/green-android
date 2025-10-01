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

val RaisingHand: ImageVector
    get() {
        val current = _raisingHand
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.RaisingHand",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 13.0577f, y = 2.0f)
                curveTo(x1 = 12.4417f, y1 = 2.0f, x2 = 11.9423f, y2 = 2.49746f, x3 = 11.9423f, y3 = 3.11111f)
                verticalLineTo(y = 10.3333f)
                curveTo(x1 = 11.9423f, y1 = 10.6402f, x2 = 11.6926f, y2 = 10.8889f, x3 = 11.3846f, y3 = 10.8889f)
                curveTo(x1 = 11.0766f, y1 = 10.8889f, x2 = 10.8269f, y2 = 10.6402f, x3 = 10.8269f, y3 = 10.3333f)
                verticalLineTo(y = 4.22222f)
                curveTo(x1 = 10.8269f, y1 = 3.60857f, x2 = 10.3275f, y2 = 3.11111f, x3 = 9.71154f, y3 = 3.11111f)
                curveTo(x1 = 9.09553f, y1 = 3.11111f, x2 = 8.59615f, y2 = 3.60857f, x3 = 8.59615f, y3 = 4.22222f)
                verticalLineTo(y = 11.4444f)
                curveTo(x1 = 8.59615f, y1 = 11.7513f, x2 = 8.34647f, y2 = 12.0f, x3 = 8.03846f, y3 = 12.0f)
                curveTo(x1 = 7.73046f, y1 = 12.0f, x2 = 7.48077f, y2 = 11.7513f, x3 = 7.48077f, y3 = 11.4444f)
                verticalLineTo(y = 6.44444f)
                curveTo(x1 = 7.48077f, y1 = 5.8308f, x2 = 6.98139f, y2 = 5.33333f, x3 = 6.36538f, y3 = 5.33333f)
                curveTo(x1 = 5.74937f, y1 = 5.33333f, x2 = 5.25f, y2 = 5.8308f, x3 = 5.25f, y3 = 6.44444f)
                verticalLineTo(y = 14.7778f)
                curveTo(x1 = 5.25f, y1 = 18.7665f, x2 = 8.49594f, y2 = 22.0f, x3 = 12.5f, y3 = 22.0f)
                curveTo(x1 = 16.5041f, y1 = 22.0f, x2 = 19.75f, y2 = 18.7665f, x3 = 19.75f, y3 = 14.7778f)
                verticalLineTo(y = 8.11111f)
                curveTo(x1 = 19.2412f, y1 = 8.11111f, x2 = 18.7658f, y2 = 8.24637f, x3 = 18.3562f, y3 = 8.48239f)
                curveTo(x1 = 17.5212f, y1 = 8.96352f, x2 = 16.9615f, y2 = 9.86142f, x3 = 16.9615f, y3 = 10.8889f)
                verticalLineTo(y = 12.3416f)
                curveTo(x1 = 16.9615f, y1 = 12.698f, x2 = 16.7437f, y2 = 13.0185f, x3 = 16.4115f, y3 = 13.1508f)
                curveTo(x1 = 15.0596f, y1 = 13.6896f, x2 = 14.1731f, y2 = 14.9939f, x3 = 14.1731f, y3 = 16.4444f)
                curveTo(x1 = 14.1731f, y1 = 16.7513f, x2 = 13.9234f, y2 = 17.0f, x3 = 13.6154f, y3 = 17.0f)
                curveTo(x1 = 13.3074f, y1 = 17.0f, x2 = 13.0577f, y2 = 16.7513f, x3 = 13.0577f, y3 = 16.4444f)
                curveTo(x1 = 13.0577f, y1 = 14.5942f, x2 = 14.1561f, y2 = 12.925f, x3 = 15.8462f, y3 = 12.1825f)
                verticalLineTo(y = 10.8889f)
                curveTo(x1 = 15.8462f, y1 = 9.56668f, x2 = 16.5088f, y2 = 8.3992f, x3 = 17.5192f, y3 = 7.69713f)
                verticalLineTo(y = 4.22222f)
                curveTo(x1 = 17.5192f, y1 = 3.60857f, x2 = 17.0199f, y2 = 3.11111f, x3 = 16.4038f, y3 = 3.11111f)
                curveTo(x1 = 15.7878f, y1 = 3.11111f, x2 = 15.2885f, y2 = 3.60857f, x3 = 15.2885f, y3 = 4.22222f)
                verticalLineTo(y = 10.3333f)
                curveTo(x1 = 15.2885f, y1 = 10.6402f, x2 = 15.0388f, y2 = 10.8889f, x3 = 14.7308f, y3 = 10.8889f)
                curveTo(x1 = 14.4228f, y1 = 10.8889f, x2 = 14.1731f, y2 = 10.6402f, x3 = 14.1731f, y3 = 10.3333f)
                verticalLineTo(y = 3.11111f)
                curveTo(x1 = 14.1731f, y1 = 2.49746f, x2 = 13.6737f, y2 = 2.0f, x3 = 13.0577f, y3 = 2.0f)
                close()
            }
        }.build().also { _raisingHand = it }
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
                imageVector = RaisingHand,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _raisingHand: ImageVector? = null
