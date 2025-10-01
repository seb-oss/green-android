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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val EmojiAngry: ImageVector
    get() {
        val current = _emojiAngry
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.EmojiAngry",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 12.0f)
                moveToRelative(dx = -9.25f, dy = 0.0f)
                arcToRelative(a = 9.25f, b = 9.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 18.5f, dy1 = 0.0f)
                arcToRelative(a = 9.25f, b = 9.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -18.5f, dy1 = 0.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFFFFF)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.17188f, y = 16.0073f)
                curveTo(x1 = 10.734f, y1 = 14.4452f, x2 = 13.2666f, y2 = 14.4452f, x3 = 14.8287f, y3 = 16.0073f)
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                moveTo(x = 8.95209f, y = 7.5543f)
                curveTo(x1 = 8.80082f, y1 = 7.40589f, x2 = 8.60645f, y2 = 7.33394f, x3 = 8.40025f, y3 = 7.37072f)
                curveTo(x1 = 8.19472f, y1 = 7.40654f, x2 = 7.99421f, y2 = 7.54811f, x3 = 7.85435f, y3 = 7.74786f)
                curveTo(x1 = 7.71448f, y1 = 7.94761f, x2 = 7.65003f, y2 = 8.18444f, x3 = 7.68666f, y3 = 8.38983f)
                curveTo(x1 = 7.72263f, y1 = 8.59617f, x2 = 7.85671f, y2 = 8.75421f, x3 = 8.04791f, y3 = 8.8456f)
                curveTo(x1 = 8.09464f, y1 = 8.8683f, x2 = 8.13859f, y2 = 8.88905f, x3 = 8.18525f, y3 = 8.9117f)
                curveTo(x1 = 9.00668f, y1 = 9.30646f, x2 = 9.82915f, y2 = 9.70195f, x3 = 10.6506f, y3 = 10.0967f)
                curveTo(x1 = 10.6972f, y1 = 10.1194f, x2 = 10.7412f, y2 = 10.1401f, x3 = 10.7879f, y3 = 10.1628f)
                curveTo(x1 = 10.8488f, y1 = 10.1919f, x2 = 10.9245f, y2 = 10.1951f, x3 = 10.9948f, y3 = 10.1768f)
                curveTo(x1 = 11.0652f, y1 = 10.1582f, x2 = 11.1245f, y2 = 10.1198f, x3 = 11.1631f, y3 = 10.0646f)
                curveTo(x1 = 11.2017f, y1 = 10.0095f, x2 = 11.2176f, y2 = 9.94071f, x3 = 11.2109f, y3 = 9.86816f)
                curveTo(x1 = 11.204f, y1 = 9.7959f, x2 = 11.1752f, y2 = 9.72582f, x3 = 11.127f, y3 = 9.67856f)
                curveTo(x1 = 11.0897f, y1 = 9.64241f, x2 = 11.0551f, y2 = 9.60821f, x3 = 11.0179f, y3 = 9.57211f)
                curveTo(x1 = 10.366f, y1 = 8.93523f, x2 = 9.71307f, y2 = 8.29763f, x3 = 9.06118f, y3 = 7.66075f)
                curveTo(x1 = 9.02393f, y1 = 7.62465f, x2 = 8.98941f, y2 = 7.59045f, x3 = 8.95209f, y3 = 7.5543f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                moveTo(x = 15.9095f, y = 8.8456f)
                curveTo(x1 = 16.1007f, y1 = 8.75421f, x2 = 16.2348f, y2 = 8.59617f, x3 = 16.2708f, y3 = 8.38983f)
                curveTo(x1 = 16.3074f, y1 = 8.18444f, x2 = 16.243f, y2 = 7.94761f, x3 = 16.1031f, y3 = 7.74786f)
                curveTo(x1 = 15.9632f, y1 = 7.54811f, x2 = 15.7627f, y2 = 7.40654f, x3 = 15.5572f, y3 = 7.37072f)
                curveTo(x1 = 15.351f, y1 = 7.33394f, x2 = 15.1566f, y2 = 7.40589f, x3 = 15.0054f, y3 = 7.5543f)
                curveTo(x1 = 14.9681f, y1 = 7.59045f, x2 = 14.9335f, y2 = 7.62465f, x3 = 14.8963f, y3 = 7.66075f)
                curveTo(x1 = 14.2444f, y1 = 8.29763f, x2 = 13.5914f, y2 = 8.93523f, x3 = 12.9396f, y3 = 9.57211f)
                curveTo(x1 = 12.9023f, y1 = 9.60821f, x2 = 12.8678f, y2 = 9.64241f, x3 = 12.8305f, y3 = 9.67856f)
                curveTo(x1 = 12.7823f, y1 = 9.72582f, x2 = 12.7534f, y2 = 9.7959f, x3 = 12.7466f, y3 = 9.86816f)
                curveTo(x1 = 12.7399f, y1 = 9.94071f, x2 = 12.7558f, y2 = 10.0095f, x3 = 12.7944f, y3 = 10.0646f)
                curveTo(x1 = 12.833f, y1 = 10.1198f, x2 = 12.8922f, y2 = 10.1582f, x3 = 12.9627f, y3 = 10.1768f)
                curveTo(x1 = 13.0329f, y1 = 10.1951f, x2 = 13.1086f, y2 = 10.1919f, x3 = 13.1695f, y3 = 10.1628f)
                curveTo(x1 = 13.2163f, y1 = 10.1401f, x2 = 13.2602f, y2 = 10.1194f, x3 = 13.3069f, y3 = 10.0967f)
                curveTo(x1 = 14.1283f, y1 = 9.70195f, x2 = 14.9508f, y2 = 9.30646f, x3 = 15.7722f, y3 = 8.9117f)
                curveTo(x1 = 15.8189f, y1 = 8.88905f, x2 = 15.8628f, y2 = 8.8683f, x3 = 15.9095f, y3 = 8.8456f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFFFFF)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.5f, y = 11.5f)
                horizontalLineTo(x = 15.0f)
                moveTo(x = 15.25f, y = 11.5f)
                curveTo(x1 = 15.25f, y1 = 11.7761f, x2 = 15.0261f, y2 = 12.0f, x3 = 14.75f, y3 = 12.0f)
                curveTo(x1 = 14.4739f, y1 = 12.0f, x2 = 14.25f, y2 = 11.7761f, x3 = 14.25f, y3 = 11.5f)
                curveTo(x1 = 14.25f, y1 = 11.2239f, x2 = 14.4739f, y2 = 11.0f, x3 = 14.75f, y3 = 11.0f)
                curveTo(x1 = 15.0261f, y1 = 11.0f, x2 = 15.25f, y2 = 11.2239f, x3 = 15.25f, y3 = 11.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFFFFF)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 11.5f)
                horizontalLineTo(x = 9.5f)
                moveTo(x = 9.75f, y = 11.5f)
                curveTo(x1 = 9.75f, y1 = 11.7761f, x2 = 9.52614f, y2 = 12.0f, x3 = 9.25f, y3 = 12.0f)
                curveTo(x1 = 8.97386f, y1 = 12.0f, x2 = 8.75f, y2 = 11.7761f, x3 = 8.75f, y3 = 11.5f)
                curveTo(x1 = 8.75f, y1 = 11.2239f, x2 = 8.97386f, y2 = 11.0f, x3 = 9.25f, y3 = 11.0f)
                curveTo(x1 = 9.52614f, y1 = 11.0f, x2 = 9.75f, y2 = 11.2239f, x3 = 9.75f, y3 = 11.5f)
                close()
            }
        }.build().also { _emojiAngry = it }
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
                imageVector = EmojiAngry,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _emojiAngry: ImageVector? = null
