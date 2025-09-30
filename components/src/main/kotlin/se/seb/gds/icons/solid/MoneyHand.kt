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

val MoneyHand: ImageVector
    get() {
        val current = _moneyHand
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.MoneyHand",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 9.80806f, y = 8.8194f)
                    curveTo(x1 = 9.6085f, y1 = 8.24991f, x2 = 9.5f, y2 = 7.63763f, x3 = 9.5f, y3 = 7.0f)
                    curveTo(x1 = 9.5f, y1 = 4.54118f, x2 = 11.1135f, y2 = 2.45921f, x3 = 13.3395f, y3 = 1.75511f)
                    curveTo(x1 = 12.6816f, y1 = 1.27999f, x2 = 11.8735f, y2 = 1.0f, x3 = 11.0f, y3 = 1.0f)
                    curveTo(x1 = 8.79086f, y1 = 1.0f, x2 = 7.0f, y2 = 2.79086f, x3 = 7.0f, y3 = 5.0f)
                    curveTo(x1 = 7.0f, y1 = 6.79402f, x2 = 8.18105f, y2 = 8.31219f, x3 = 9.80806f, y3 = 8.8194f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 15.0f, y = 3.0f)
                    curveTo(x1 = 14.4815f, y1 = 3.0f, x2 = 13.9837f, y2 = 3.09916f, x3 = 13.5264f, y3 = 3.28047f)
                    curveTo(x1 = 12.0482f, y1 = 3.86648f, x2 = 11.0f, y2 = 5.30961f, x3 = 11.0f, y3 = 7.0f)
                    curveTo(x1 = 11.0f, y1 = 7.36293f, x2 = 11.0486f, y2 = 7.71607f, x3 = 11.1402f, y3 = 8.05257f)
                    curveTo(x1 = 11.6024f, y1 = 9.75034f, x2 = 13.154f, y2 = 11.0f, x3 = 15.0f, y3 = 11.0f)
                    curveTo(x1 = 17.2091f, y1 = 11.0f, x2 = 19.0f, y2 = 9.20914f, x3 = 19.0f, y3 = 7.0f)
                    curveTo(x1 = 19.0f, y1 = 4.79086f, x2 = 17.2091f, y2 = 3.0f, x3 = 15.0f, y3 = 3.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 12.75f)
                    curveTo(x1 = 2.0f, y1 = 12.3358f, x2 = 2.33579f, y2 = 12.0f, x3 = 2.75f, y3 = 12.0f)
                    horizontalLineTo(x = 6.75f)
                    curveTo(x1 = 7.16421f, y1 = 12.0f, x2 = 7.5f, y2 = 12.3358f, x3 = 7.5f, y3 = 12.75f)
                    verticalLineTo(y = 13.0392f)
                    curveTo(x1 = 9.96143f, y1 = 12.4632f, x2 = 12.035f, y2 = 12.2975f, x3 = 13.68f, y3 = 12.4037f)
                    curveTo(x1 = 15.4947f, y1 = 12.5208f, x2 = 16.9034f, y2 = 12.9775f, x3 = 17.6813f, y3 = 13.7011f)
                    curveTo(x1 = 17.9517f, y1 = 13.9526f, x2 = 18.1691f, y2 = 14.2611f, x3 = 18.2739f, y3 = 14.6137f)
                    curveTo(x1 = 18.4453f, y1 = 14.4886f, x2 = 18.6116f, y2 = 14.3614f, x3 = 18.7709f, y3 = 14.2348f)
                    curveTo(x1 = 19.8545f, y1 = 13.3737f, x2 = 21.5358f, y2 = 13.4192f, x3 = 22.4645f, y3 = 14.5816f)
                    curveTo(x1 = 23.1693f, y1 = 15.4638f, x2 = 23.2076f, y2 = 16.7652f, x3 = 22.4046f, y3 = 17.6494f)
                    curveTo(x1 = 19.9683f, y1 = 20.3322f, x2 = 16.881f, y2 = 22.174f, x3 = 12.958f, y3 = 21.987f)
                    curveTo(x1 = 12.0373f, y1 = 21.9431f, x2 = 10.9392f, y2 = 21.6633f, x3 = 10.1108f, y3 = 21.4137f)
                    curveTo(x1 = 9.68803f, y1 = 21.2863f, x2 = 9.31906f, y2 = 21.1616f, x3 = 9.05546f, y3 = 21.0687f)
                    curveTo(x1 = 8.93286f, y1 = 21.0255f, x2 = 8.83266f, y2 = 20.989f, x3 = 8.75998f, y3 = 20.9622f)
                    horizontalLineTo(x = 7.5f)
                    verticalLineTo(y = 21.25f)
                    curveTo(x1 = 7.5f, y1 = 21.6642f, x2 = 7.16421f, y2 = 22.0f, x3 = 6.75f, y3 = 22.0f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 22.0f, x2 = 2.0f, y2 = 21.6642f, x3 = 2.0f, y3 = 21.25f)
                    verticalLineTo(y = 12.75f)
                    close()
                    moveTo(x = 7.5f, y = 19.4622f)
                    horizontalLineTo(x = 8.89621f)
                    curveTo(x1 = 8.98866f, y1 = 19.4622f, x2 = 9.08031f, y2 = 19.4793f, x3 = 9.16654f, y3 = 19.5126f)
                    moveTo(x = 9.16654f, y = 19.5126f)
                    lineTo(x = 9.17151f, y = 19.5145f)
                    lineTo(x = 9.19003f, y = 19.5215f)
                    curveTo(x1 = 9.20679f, y1 = 19.5279f, x2 = 9.23225f, y2 = 19.5375f, x3 = 9.26561f, y3 = 19.5499f)
                    curveTo(x1 = 9.33236f, y1 = 19.5746f, x2 = 9.43061f, y2 = 19.6105f, x3 = 9.55405f, y3 = 19.654f)
                    curveTo(x1 = 9.80131f, y1 = 19.7412f, x2 = 10.1478f, y2 = 19.8582f, x3 = 10.5435f, y3 = 19.9774f)
                    curveTo(x1 = 11.3519f, y1 = 20.221f, x2 = 12.3026f, y2 = 20.454f, x3 = 13.0294f, y3 = 20.4887f)
                    curveTo(x1 = 16.3718f, y1 = 20.6481f, x2 = 19.0559f, y2 = 19.1056f, x3 = 21.2942f, y3 = 16.6409f)
                    curveTo(x1 = 21.5587f, y1 = 16.3496f, x2 = 21.579f, y2 = 15.8764f, x3 = 21.2926f, y3 = 15.5179f)
                    curveTo(x1 = 20.9434f, y1 = 15.0809f, x2 = 20.2228f, y2 = 14.997f, x3 = 19.7041f, y3 = 15.4092f)
                    curveTo(x1 = 18.8046f, y1 = 16.124f, x2 = 17.5353f, y2 = 16.993f, x3 = 16.2674f, y3 = 17.345f)
                    curveTo(x1 = 15.8427f, y1 = 17.4628f, x2 = 15.421f, y2 = 17.5556f, x3 = 15.0301f, y3 = 17.6285f)
                    curveTo(x1 = 14.449f, y1 = 17.7493f, x2 = 13.7966f, y2 = 17.8349f, x3 = 13.077f, y3 = 17.8813f)
                    lineTo(x = 13.0581f, y = 17.8826f)
                    lineTo(x = 13.0423f, y = 17.8836f)
                    lineTo(x = 13.0405f, y = 17.8837f)
                    lineTo(x = 13.0376f, y = 17.8839f)
                    lineTo(x = 13.0361f, y = 17.8839f)
                    curveTo(x1 = 12.6236f, y1 = 17.9068f, x2 = 12.2693f, y2 = 17.5917f, x3 = 12.245f, y3 = 17.1793f)
                    curveTo(x1 = 12.2207f, y1 = 16.7669f, x2 = 12.5345f, y2 = 16.4124f, x3 = 12.9468f, y3 = 16.3866f)
                    curveTo(x1 = 12.9593f, y1 = 16.3858f, x2 = 12.9717f, y2 = 16.385f, x3 = 12.9841f, y3 = 16.3842f)
                    lineTo(x = 13.0099f, y = 16.3825f)
                    curveTo(x1 = 13.0508f, y1 = 16.3796f, x2 = 13.1124f, y2 = 16.375f, x3 = 13.1918f, y3 = 16.368f)
                    curveTo(x1 = 13.3506f, y1 = 16.3542f, x2 = 13.5796f, y2 = 16.3313f, x3 = 13.8554f, y3 = 16.2955f)
                    curveTo(x1 = 14.1169f, y1 = 16.2615f, x2 = 14.4176f, y2 = 16.2164f, x3 = 14.7383f, y3 = 16.157f)
                    curveTo(x1 = 15.6669f, y1 = 15.9624f, x2 = 16.2644f, y2 = 15.6873f, x3 = 16.5867f, y3 = 15.4252f)
                    curveTo(x1 = 16.823f, y1 = 15.233f, x2 = 16.8404f, y2 = 15.1094f, x3 = 16.8416f, y3 = 15.0863f)
                    curveTo(x1 = 16.8425f, y1 = 15.0701f, x2 = 16.844f, y2 = 14.9709f, x3 = 16.6596f, y3 = 14.7994f)
                    curveTo(x1 = 16.2608f, y1 = 14.4283f, x2 = 15.2762f, y2 = 14.0098f, x3 = 13.5834f, y3 = 13.9006f)
                    curveTo(x1 = 12.04f, y1 = 13.8009f, x2 = 10.0003f, y2 = 13.9655f, x3 = 7.5f, y3 = 14.5819f)
                    verticalLineTo(y = 19.4622f)
                }
            }.build()
            .also { _moneyHand = it }
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
                imageVector = MoneyHand,
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
private var _moneyHand: ImageVector? = null
