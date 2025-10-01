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

val BrandAppleMusic: ImageVector
    get() {
        val current = _brandAppleMusic
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BrandAppleMusic",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 21.5004f, y = 8.44218f)
                verticalLineTo(y = 8.44344f)
                horizontalLineTo(x = 21.4999f)
                verticalLineTo(y = 15.5565f)
                curveTo(x1 = 21.4999f, y1 = 15.6019f, x2 = 21.4999f, y2 = 15.6473f, x3 = 21.5f, y3 = 15.6927f)
                curveTo(x1 = 21.5f, y1 = 15.8743f, x2 = 21.5001f, y2 = 16.0558f, x3 = 21.4989f, y3 = 16.2373f)
                curveTo(x1 = 21.4978f, y1 = 16.4284f, x2 = 21.4957f, y2 = 16.6194f, x3 = 21.4904f, y3 = 16.8105f)
                curveTo(x1 = 21.4793f, y1 = 17.2264f, x2 = 21.4545f, y2 = 17.6465f, x3 = 21.3806f, y3 = 18.0582f)
                curveTo(x1 = 21.3057f, y1 = 18.4762f, x2 = 21.1827f, y2 = 18.8652f, x3 = 20.9895f, y3 = 19.2452f)
                curveTo(x1 = 20.7995f, y1 = 19.6183f, x2 = 20.5515f, y2 = 19.9593f, x3 = 20.2554f, y3 = 20.2554f)
                curveTo(x1 = 19.9593f, y1 = 20.5515f, x2 = 19.6178f, y2 = 20.7995f, x3 = 19.2447f, y3 = 20.9895f)
                curveTo(x1 = 18.8652f, y1 = 21.1827f, x2 = 18.4767f, y2 = 21.3057f, x3 = 18.0587f, y3 = 21.3806f)
                curveTo(x1 = 17.647f, y1 = 21.4545f, x2 = 17.2269f, y2 = 21.4793f, x3 = 16.8105f, y3 = 21.4904f)
                curveTo(x1 = 16.6194f, y1 = 21.4957f, x2 = 16.4284f, y2 = 21.4978f, x3 = 16.2373f, y3 = 21.4989f)
                curveTo(x1 = 16.0104f, y1 = 21.4999f, x2 = 15.7834f, y2 = 21.4999f, x3 = 15.5565f, y3 = 21.4999f)
                horizontalLineTo(x = 8.44344f)
                curveTo(x1 = 8.39802f, y1 = 21.4999f, x2 = 8.3526f, y2 = 21.4999f, x3 = 8.30717f, y3 = 21.5f)
                curveTo(x1 = 8.12565f, y1 = 21.5f, x2 = 7.94412f, y2 = 21.5001f, x3 = 7.76259f, y3 = 21.4989f)
                curveTo(x1 = 7.57153f, y1 = 21.4978f, x2 = 7.38047f, y2 = 21.4957f, x3 = 7.18941f, y3 = 21.4904f)
                curveTo(x1 = 6.77299f, y1 = 21.4793f, x2 = 6.35287f, y2 = 21.4545f, x3 = 5.94119f, y3 = 21.3806f)
                curveTo(x1 = 5.52371f, y1 = 21.3052f, x2 = 5.13473f, y2 = 21.1827f, x3 = 4.75525f, y3 = 20.9895f)
                curveTo(x1 = 4.3821f, y1 = 20.7995f, x2 = 4.04062f, y2 = 20.5515f, x3 = 3.74453f, y3 = 20.2554f)
                curveTo(x1 = 3.44844f, y1 = 19.9593f, x2 = 3.20038f, y2 = 19.6183f, x3 = 3.01037f, y3 = 19.2452f)
                curveTo(x1 = 2.8172f, y1 = 18.8652f, x2 = 2.69423f, y2 = 18.4762f, x3 = 2.61928f, y3 = 18.0582f)
                curveTo(x1 = 2.54539f, y1 = 17.6465f, x2 = 2.52058f, y2 = 17.2269f, x3 = 2.5095f, y3 = 16.8105f)
                curveTo(x1 = 2.50422f, y1 = 16.6194f, x2 = 2.50211f, y2 = 16.4284f, x3 = 2.50106f, y3 = 16.2373f)
                curveTo(x1 = 2.5f, y1 = 16.0104f, x2 = 2.5f, y2 = 15.7834f, x3 = 2.5f, y3 = 15.5565f)
                verticalLineTo(y = 8.44344f)
                curveTo(x1 = 2.5f, y1 = 8.2165f, x2 = 2.5f, y2 = 7.98954f, x3 = 2.50106f, y3 = 7.76312f)
                curveTo(x1 = 2.50211f, y1 = 7.57206f, x2 = 2.50422f, y2 = 7.381f, x3 = 2.5095f, y3 = 7.18994f)
                curveTo(x1 = 2.52058f, y1 = 6.77404f, x2 = 2.54539f, y2 = 6.35392f, x3 = 2.61928f, y3 = 5.94225f)
                curveTo(x1 = 2.69423f, y1 = 5.52424f, x2 = 2.8172f, y2 = 5.13526f, x3 = 3.01037f, y3 = 4.75525f)
                curveTo(x1 = 3.20038f, y1 = 4.3821f, x2 = 3.44844f, y2 = 4.04115f, x3 = 3.74453f, y3 = 3.74506f)
                curveTo(x1 = 4.04062f, y1 = 3.44897f, x2 = 4.3821f, y2 = 3.20091f, x3 = 4.75525f, y3 = 3.0109f)
                curveTo(x1 = 5.13473f, y1 = 2.81773f, x2 = 5.52318f, y2 = 2.69475f, x3 = 5.94119f, y3 = 2.61981f)
                curveTo(x1 = 6.35287f, y1 = 2.54539f, x2 = 6.77299f, y2 = 2.52111f, x3 = 7.18941f, y3 = 2.5095f)
                curveTo(x1 = 7.38047f, y1 = 2.50422f, x2 = 7.57153f, y2 = 2.50211f, x3 = 7.76259f, y3 = 2.50106f)
                curveTo(x1 = 7.98954f, y1 = 2.5f, x2 = 8.21649f, y2 = 2.5f, x3 = 8.44344f, y3 = 2.5f)
                horizontalLineTo(x = 15.557f)
                curveTo(x1 = 15.7839f, y1 = 2.5f, x2 = 16.0109f, y2 = 2.5f, x3 = 16.2378f, y3 = 2.50106f)
                curveTo(x1 = 16.4289f, y1 = 2.50211f, x2 = 16.62f, y2 = 2.50422f, x3 = 16.811f, y3 = 2.5095f)
                curveTo(x1 = 17.2275f, y1 = 2.52058f, x2 = 17.6476f, y2 = 2.54539f, x3 = 18.0593f, y3 = 2.61928f)
                curveTo(x1 = 18.4767f, y1 = 2.69475f, x2 = 18.8657f, y2 = 2.8172f, x3 = 19.2452f, y3 = 3.01037f)
                curveTo(x1 = 19.6183f, y1 = 3.20038f, x2 = 19.9598f, y2 = 3.44844f, x3 = 20.2559f, y3 = 3.74453f)
                curveTo(x1 = 20.552f, y1 = 4.04062f, x2 = 20.8001f, y2 = 4.38157f, x3 = 20.9901f, y3 = 4.75472f)
                curveTo(x1 = 21.1832f, y1 = 5.13473f, x2 = 21.3062f, y2 = 5.52371f, x3 = 21.3812f, y3 = 5.94172f)
                curveTo(x1 = 21.4551f, y1 = 6.3534f, x2 = 21.4799f, y2 = 6.77299f, x3 = 21.4909f, y3 = 7.18941f)
                curveTo(x1 = 21.4962f, y1 = 7.38048f, x2 = 21.4983f, y2 = 7.57154f, x3 = 21.4994f, y3 = 7.7626f)
                curveTo(x1 = 21.5004f, y1 = 7.98912f, x2 = 21.5004f, y2 = 8.21565f, x3 = 21.5004f, y3 = 8.44218f)
                close()
                moveTo(x = 15.4314f, y = 5.48938f)
                curveTo(x1 = 15.4805f, y1 = 5.47935f, x2 = 15.8885f, y2 = 5.40705f, x3 = 15.9344f, y3 = 5.40282f)
                curveTo(x1 = 16.24f, y1 = 5.37643f, x2 = 16.4115f, y2 = 5.577f, x3 = 16.4105f, y3 = 5.90211f)
                verticalLineTo(y = 14.8645f)
                curveTo(x1 = 16.4105f, y1 = 15.1052f, x2 = 16.4083f, y2 = 15.3232f, x3 = 16.3577f, y3 = 15.5644f)
                curveTo(x1 = 16.3086f, y1 = 15.7982f, x2 = 16.2194f, y2 = 16.0183f, x3 = 16.0811f, y3 = 16.2162f)
                curveTo(x1 = 15.9434f, y1 = 16.4136f, x2 = 15.7671f, y2 = 16.5756f, x3 = 15.5612f, y3 = 16.697f)
                curveTo(x1 = 15.3533f, y1 = 16.82f, x2 = 15.1348f, y2 = 16.8902f, x3 = 14.9015f, y3 = 16.9372f)
                curveTo(x1 = 14.4634f, y1 = 17.0253f, x2 = 14.1637f, y2 = 17.0453f, x3 = 13.8823f, y3 = 16.9889f)
                curveTo(x1 = 13.6111f, y1 = 16.934f, x2 = 13.3809f, y2 = 16.8094f, x3 = 13.1967f, y3 = 16.6405f)
                curveTo(x1 = 12.9239f, y1 = 16.3909f, x2 = 12.7539f, y2 = 16.0531f, x3 = 12.717f, y3 = 15.7f)
                curveTo(x1 = 12.6737f, y1 = 15.2862f, x2 = 12.8109f, y2 = 14.8445f, x3 = 13.1218f, y3 = 14.5188f)
                curveTo(x1 = 13.2785f, y1 = 14.3541f, x2 = 13.4754f, y2 = 14.2243f, x3 = 13.7383f, y3 = 14.1224f)
                curveTo(x1 = 14.0132f, y1 = 14.0158f, x2 = 14.3167f, y2 = 13.952f, x3 = 14.7833f, y3 = 13.858f)
                lineTo(x = 15.1522f, y = 13.7836f)
                curveTo(x1 = 15.3142f, y1 = 13.7509f, x2 = 15.4525f, y2 = 13.7097f, x3 = 15.5644f, y3 = 13.573f)
                curveTo(x1 = 15.6774f, y1 = 13.4358f, x2 = 15.6789f, y2 = 13.268f, x3 = 15.6789f, y3 = 13.1022f)
                verticalLineTo(y = 8.91738f)
                curveTo(x1 = 15.6789f, y1 = 8.59701f, x2 = 15.5349f, y2 = 8.50992f, x3 = 15.2293f, y3 = 8.56851f)
                curveTo(x1 = 15.0102f, y1 = 8.61126f, x2 = 10.3161f, y2 = 9.55812f, x3 = 10.3161f, y3 = 9.55812f)
                curveTo(x1 = 10.0511f, y1 = 9.62251f, x2 = 9.95822f, y2 = 9.70906f, x3 = 9.95822f, y3 = 10.0373f)
                verticalLineTo(y = 16.1676f)
                curveTo(x1 = 9.95822f, y1 = 16.4083f, x2 = 9.94608f, y2 = 16.6263f, x3 = 9.89541f, y3 = 16.8675f)
                curveTo(x1 = 9.84633f, y1 = 17.1013f, x2 = 9.75713f, y2 = 17.3214f, x3 = 9.61885f, y3 = 17.5193f)
                curveTo(x1 = 9.4811f, y1 = 17.7167f, x2 = 9.30482f, y2 = 17.8787f, x3 = 9.09898f, y3 = 18.0001f)
                curveTo(x1 = 8.89103f, y1 = 18.1231f, x2 = 8.67252f, y2 = 18.1965f, x3 = 8.43924f, y3 = 18.2434f)
                curveTo(x1 = 8.00117f, y1 = 18.3321f, x2 = 7.70139f, y2 = 18.3516f, x3 = 7.42008f, y3 = 18.2952f)
                curveTo(x1 = 7.14879f, y1 = 18.2408f, x2 = 6.91868f, y2 = 18.1125f, x3 = 6.73448f, y3 = 17.9436f)
                curveTo(x1 = 6.46161f, y1 = 17.694f, x2 = 6.30275f, y2 = 17.3562f, x3 = 6.2658f, y3 = 17.0031f)
                curveTo(x1 = 6.22252f, y1 = 16.5893f, x2 = 6.34866f, y2 = 16.1476f, x3 = 6.65953f, y3 = 15.8219f)
                curveTo(x1 = 6.81629f, y1 = 15.6573f, x2 = 7.01315f, y2 = 15.5274f, x3 = 7.27599f, y3 = 15.4256f)
                curveTo(x1 = 7.55097f, y1 = 15.3189f, x2 = 7.85445f, y2 = 15.2551f, x3 = 8.32101f, y3 = 15.1611f)
                lineTo(x = 8.68994f, y = 15.0867f)
                curveTo(x1 = 8.85197f, y1 = 15.054f, x2 = 8.99025f, y2 = 15.0128f, x3 = 9.10214f, y3 = 14.8761f)
                curveTo(x1 = 9.21404f, y1 = 14.7394f, x2 = 9.22723f, y2 = 14.579f, x3 = 9.22723f, y3 = 14.4138f)
                verticalLineTo(y = 7.34562f)
                curveTo(x1 = 9.22723f, y1 = 7.25062f, x2 = 9.23515f, y2 = 7.18623f, x3 = 9.2399f, y3 = 7.15456f)
                curveTo(x1 = 9.26259f, y1 = 7.00572f, x2 = 9.32223f, y2 = 6.878f, x3 = 9.4299f, y3 = 6.78775f)
                curveTo(x1 = 9.5191f, y1 = 6.7128f, x2 = 9.63468f, y2 = 6.66055f, x3 = 9.78194f, y3 = 6.62941f)
                lineTo(x = 9.78405f, y = 6.62888f)
                lineTo(x = 15.4314f, y = 5.48938f)
                close()
            }
        }.build().also { _brandAppleMusic = it }
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
                imageVector = BrandAppleMusic,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brandAppleMusic: ImageVector? = null
