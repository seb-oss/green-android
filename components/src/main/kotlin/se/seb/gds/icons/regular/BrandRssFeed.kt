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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val BrandRssFeed: ImageVector
    get() {
        val current = _brandRssFeed
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BrandRssFeed",
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
                curveTo(x1 = 21.5004f, y1 = 8.21565f, x2 = 21.5004f, y2 = 7.98912f, x3 = 21.4994f, y3 = 7.76259f)
                curveTo(x1 = 21.4983f, y1 = 7.57154f, x2 = 21.4962f, y2 = 7.38047f, x3 = 21.4909f, y3 = 7.18941f)
                curveTo(x1 = 21.4799f, y1 = 6.77299f, x2 = 21.4551f, y2 = 6.3534f, x3 = 21.3812f, y3 = 5.94172f)
                curveTo(x1 = 21.3062f, y1 = 5.52371f, x2 = 21.1832f, y2 = 5.13473f, x3 = 20.9901f, y3 = 4.75472f)
                curveTo(x1 = 20.8001f, y1 = 4.38157f, x2 = 20.552f, y2 = 4.04062f, x3 = 20.2559f, y3 = 3.74453f)
                curveTo(x1 = 19.9598f, y1 = 3.44844f, x2 = 19.6183f, y2 = 3.20038f, x3 = 19.2452f, y3 = 3.01037f)
                curveTo(x1 = 18.8657f, y1 = 2.8172f, x2 = 18.4767f, y2 = 2.69475f, x3 = 18.0593f, y3 = 2.61928f)
                curveTo(x1 = 17.6476f, y1 = 2.54539f, x2 = 17.2275f, y2 = 2.52058f, x3 = 16.811f, y3 = 2.5095f)
                curveTo(x1 = 16.62f, y1 = 2.50422f, x2 = 16.4289f, y2 = 2.50211f, x3 = 16.2378f, y3 = 2.50106f)
                curveTo(x1 = 16.0109f, y1 = 2.5f, x2 = 15.7839f, y2 = 2.5f, x3 = 15.557f, y3 = 2.5f)
                horizontalLineTo(x = 8.44344f)
                curveTo(x1 = 8.2165f, y1 = 2.5f, x2 = 7.98954f, y2 = 2.5f, x3 = 7.76259f, y3 = 2.50106f)
                curveTo(x1 = 7.57153f, y1 = 2.50211f, x2 = 7.38047f, y2 = 2.50422f, x3 = 7.18941f, y3 = 2.5095f)
                curveTo(x1 = 6.77299f, y1 = 2.52111f, x2 = 6.35287f, y2 = 2.54539f, x3 = 5.94119f, y3 = 2.61981f)
                curveTo(x1 = 5.52318f, y1 = 2.69475f, x2 = 5.13473f, y2 = 2.81773f, x3 = 4.75525f, y3 = 3.0109f)
                curveTo(x1 = 4.3821f, y1 = 3.20091f, x2 = 4.04062f, y2 = 3.44897f, x3 = 3.74453f, y3 = 3.74506f)
                curveTo(x1 = 3.44844f, y1 = 4.04115f, x2 = 3.20038f, y2 = 4.3821f, x3 = 3.01037f, y3 = 4.75525f)
                curveTo(x1 = 2.8172f, y1 = 5.13526f, x2 = 2.69423f, y2 = 5.52424f, x3 = 2.61928f, y3 = 5.94225f)
                curveTo(x1 = 2.54539f, y1 = 6.35392f, x2 = 2.52058f, y2 = 6.77404f, x3 = 2.5095f, y3 = 7.18994f)
                curveTo(x1 = 2.50422f, y1 = 7.381f, x2 = 2.50211f, y2 = 7.57206f, x3 = 2.50106f, y3 = 7.76312f)
                curveTo(x1 = 2.5f, y1 = 7.98954f, x2 = 2.5f, y2 = 8.21649f, x3 = 2.5f, y3 = 8.44344f)
                verticalLineTo(y = 15.5565f)
                curveTo(x1 = 2.5f, y1 = 15.7834f, x2 = 2.5f, y2 = 16.0104f, x3 = 2.50106f, y3 = 16.2373f)
                curveTo(x1 = 2.50211f, y1 = 16.4284f, x2 = 2.50422f, y2 = 16.6194f, x3 = 2.5095f, y3 = 16.8105f)
                curveTo(x1 = 2.52058f, y1 = 17.2269f, x2 = 2.54539f, y2 = 17.6465f, x3 = 2.61928f, y3 = 18.0582f)
                curveTo(x1 = 2.69423f, y1 = 18.4762f, x2 = 2.8172f, y2 = 18.8652f, x3 = 3.01037f, y3 = 19.2452f)
                curveTo(x1 = 3.20038f, y1 = 19.6183f, x2 = 3.44844f, y2 = 19.9593f, x3 = 3.74453f, y3 = 20.2554f)
                curveTo(x1 = 4.04062f, y1 = 20.5515f, x2 = 4.3821f, y2 = 20.7995f, x3 = 4.75525f, y3 = 20.9895f)
                curveTo(x1 = 5.13473f, y1 = 21.1827f, x2 = 5.52371f, y2 = 21.3052f, x3 = 5.94119f, y3 = 21.3806f)
                curveTo(x1 = 6.35287f, y1 = 21.4545f, x2 = 6.77299f, y2 = 21.4793f, x3 = 7.18941f, y3 = 21.4904f)
                curveTo(x1 = 7.38047f, y1 = 21.4957f, x2 = 7.57153f, y2 = 21.4978f, x3 = 7.76259f, y3 = 21.4989f)
                curveTo(x1 = 7.94412f, y1 = 21.5001f, x2 = 8.12565f, y2 = 21.5f, x3 = 8.30717f, y3 = 21.5f)
                lineTo(x = 15.5565f, y = 21.4999f)
                curveTo(x1 = 15.7834f, y1 = 21.4999f, x2 = 16.0104f, y2 = 21.4999f, x3 = 16.2373f, y3 = 21.4989f)
                curveTo(x1 = 16.4284f, y1 = 21.4978f, x2 = 16.6194f, y2 = 21.4957f, x3 = 16.8105f, y3 = 21.4904f)
                curveTo(x1 = 17.2269f, y1 = 21.4793f, x2 = 17.647f, y2 = 21.4545f, x3 = 18.0587f, y3 = 21.3806f)
                curveTo(x1 = 18.4767f, y1 = 21.3057f, x2 = 18.8652f, y2 = 21.1827f, x3 = 19.2447f, y3 = 20.9895f)
                curveTo(x1 = 19.6178f, y1 = 20.7995f, x2 = 19.9593f, y2 = 20.5515f, x3 = 20.2554f, y3 = 20.2554f)
                curveTo(x1 = 20.5515f, y1 = 19.9593f, x2 = 20.7995f, y2 = 19.6183f, x3 = 20.9895f, y3 = 19.2452f)
                curveTo(x1 = 21.1827f, y1 = 18.8652f, x2 = 21.3057f, y2 = 18.4762f, x3 = 21.3806f, y3 = 18.0582f)
                curveTo(x1 = 21.4545f, y1 = 17.6465f, x2 = 21.4793f, y2 = 17.2264f, x3 = 21.4904f, y3 = 16.8105f)
                curveTo(x1 = 21.4957f, y1 = 16.6194f, x2 = 21.4978f, y2 = 16.4284f, x3 = 21.4989f, y3 = 16.2373f)
                curveTo(x1 = 21.5001f, y1 = 16.0558f, x2 = 21.5f, y2 = 15.8743f, x3 = 21.5f, y3 = 15.6927f)
                lineTo(x = 21.5004f, y = 8.44218f)
                close()
                moveTo(x = 7.5f, y = 18.0f)
                curveTo(x1 = 8.32843f, y1 = 18.0f, x2 = 9.0f, y2 = 17.3284f, x3 = 9.0f, y3 = 16.5f)
                curveTo(x1 = 9.0f, y1 = 15.6716f, x2 = 8.32843f, y2 = 15.0f, x3 = 7.5f, y3 = 15.0f)
                curveTo(x1 = 6.67157f, y1 = 15.0f, x2 = 6.0f, y2 = 15.6716f, x3 = 6.0f, y3 = 16.5f)
                curveTo(x1 = 6.0f, y1 = 17.3284f, x2 = 6.67157f, y2 = 18.0f, x3 = 7.5f, y3 = 18.0f)
                close()
                moveTo(x = 12.0f, y = 18.0f)
                curveTo(x1 = 12.0f, y1 = 14.6863f, x2 = 9.31371f, y2 = 12.0f, x3 = 6.0f, y3 = 12.0f)
                verticalLineTo(y = 10.0f)
                curveTo(x1 = 10.4183f, y1 = 10.0f, x2 = 14.0f, y2 = 13.5817f, x3 = 14.0f, y3 = 18.0f)
                horizontalLineTo(x = 12.0f)
                close()
                moveTo(x = 6.0f, y = 8.0f)
                curveTo(x1 = 11.5228f, y1 = 8.0f, x2 = 16.0f, y2 = 12.4772f, x3 = 16.0f, y3 = 18.0f)
                horizontalLineTo(x = 18.0f)
                curveTo(x1 = 18.0f, y1 = 11.3726f, x2 = 12.6274f, y2 = 6.0f, x3 = 6.0f, y3 = 6.0f)
                verticalLineTo(y = 8.0f)
                close()
            }
        }.build().also { _brandRssFeed = it }
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
                imageVector = BrandRssFeed,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brandRssFeed: ImageVector? = null
