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

val BrandFirefox: ImageVector
    get() {
        val current = _brandFirefox
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BrandFirefox",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 19.9861f, y = 5.93204f)
                    curveTo(x1 = 19.6582f, y1 = 5.49639f, x2 = 19.2959f, y2 = 5.08998f, x3 = 18.9033f, y3 = 4.71639f)
                    curveTo(x1 = 18.6518f, y1 = 4.46922f, x2 = 18.3849f, y2 = 4.24044f, x3 = 18.1053f, y3 = 4.02976f)
                    curveTo(x1 = 17.6325f, y1 = 3.62714f, x2 = 17.0852f, y2 = 3.28196f, x3 = 16.4588f, y3 = 3.01119f)
                    curveTo(x1 = 15.1932f, y1 = 2.38816f, x2 = 13.8082f, y2 = 2.04377f, x3 = 12.3971f, y3 = 2.00221f)
                    curveTo(x1 = 10.0758f, y1 = 1.95564f, x2 = 8.47202f, y2 = 2.65422f, x3 = 7.56437f, y3 = 3.21614f)
                    lineTo(x = 7.56351f, y = 3.21665f)
                    curveTo(x1 = 7.2422f, y1 = 3.40751f, x2 = 6.94361f, y2 = 3.63438f, x3 = 6.67351f, y3 = 3.89286f)
                    curveTo(x1 = 8.26744f, y1 = 2.99996f, x2 = 10.1164f, y2 = 2.64952f, x3 = 11.925f, y3 = 2.90284f)
                    curveTo(x1 = 15.4605f, y1 = 3.36767f, x2 = 18.693f, y2 = 6.12288f, x3 = 18.693f, y3 = 9.75843f)
                    curveTo(x1 = 18.693f, y1 = 12.5557f, x2 = 16.5353f, y2 = 14.6923f, x3 = 14.0085f, y3 = 14.5388f)
                    curveTo(x1 = 10.2548f, y1 = 14.3134f, x2 = 9.30854f, y2 = 10.4564f, x3 = 11.2613f, y3 = 8.78993f)
                    curveTo(x1 = 10.7348f, y1 = 8.67648f, x2 = 9.74529f, y2 = 8.89888f, x3 = 9.05629f, y3 = 9.93074f)
                    curveTo(x1 = 8.43804f, y1 = 10.8574f, x2 = 8.47304f, y2 = 12.2875f, x3 = 8.85454f, y3 = 13.3021f)
                    curveTo(x1 = 8.61066f, y1 = 12.8017f, x2 = 8.44502f, y2 = 12.2667f, x3 = 8.36351f, y3 = 11.7159f)
                    curveTo(x1 = 7.86951f, y1 = 8.37243f, x2 = 10.1108f, y2 = 5.52105f, x3 = 12.166f, y3 = 4.81502f)
                    curveTo(x1 = 11.0573f, y1 = 3.84478f, x2 = 8.27901f, y2 = 3.91065f, x3 = 6.21126f, y3 = 5.43464f)
                    curveTo(x1 = 5.0117f, y1 = 6.31878f, x2 = 4.15157f, y2 = 7.57434f, x3 = 3.69519f, y3 = 9.07024f)
                    curveTo(x1 = 3.82576f, y1 = 7.89096f, x2 = 4.17641f, y2 = 6.74632f, x3 = 4.72931f, y3 = 5.69611f)
                    curveTo(x1 = 4.03706f, y1 = 6.05501f, x2 = 3.15556f, y2 = 7.19005f, x3 = 2.72056f, y3 = 8.24144f)
                    curveTo(x1 = 2.08734f, y1 = 9.84559f, x2 = 1.86408f, y2 = 11.5828f, x3 = 2.07106f, y3 = 13.2953f)
                    lineTo(x = 2.0839f, y = 13.4085f)
                    curveTo(x1 = 2.09422f, y1 = 13.5003f, x2 = 2.10451f, y2 = 13.592f, x3 = 2.11656f, y3 = 13.6832f)
                    curveTo(x1 = 2.37578f, y1 = 15.1786f, x2 = 2.97026f, y2 = 16.5955f, x3 = 3.85523f, y3 = 17.8274f)
                    curveTo(x1 = 4.7402f, y1 = 19.0593f, x2 = 5.8926f, y2 = 20.074f, x3 = 7.22567f, y3 = 20.7951f)
                    curveTo(x1 = 8.55874f, y1 = 21.5162f, x2 = 10.0377f, y2 = 21.925f, x3 = 11.5513f, y3 = 21.9906f)
                    curveTo(x1 = 13.0649f, y1 = 22.0562f, x2 = 14.5736f, y2 = 21.777f, x3 = 15.9639f, y3 = 21.174f)
                    curveTo(x1 = 17.3542f, y1 = 20.5709f, x2 = 18.5898f, y2 = 19.6597f, x3 = 19.5777f, y3 = 18.5091f)
                    curveTo(x1 = 20.5656f, y1 = 17.3584f, x2 = 21.28f, y2 = 15.9982f, x3 = 21.6672f, y3 = 14.5308f)
                    curveTo(x1 = 22.0544f, y1 = 13.0635f, x2 = 22.1043f, y2 = 11.5273f, x3 = 21.8131f, y3 = 10.0379f)
                    curveTo(x1 = 21.5219f, y1 = 8.54844f, x2 = 20.8972f, y2 = 7.1446f, x3 = 19.9861f, y3 = 5.93204f)
                    close()
                }
            }.build()
            .also { _brandFirefox = it }
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
                imageVector = BrandFirefox,
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
private var _brandFirefox: ImageVector? = null
