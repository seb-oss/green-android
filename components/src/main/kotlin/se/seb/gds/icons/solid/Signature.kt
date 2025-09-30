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

val Signature: ImageVector
    get() {
        val current = _signature
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Signature",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 9.87534f, y = 4.51214f)
                    curveTo(x1 = 9.50336f, y1 = 4.46674f, x2 = 9.10456f, y2 = 4.54361f, x3 = 8.68029f, y3 = 4.83164f)
                    curveTo(x1 = 8.0185f, y1 = 5.28093f, x2 = 7.69282f, y2 = 5.81131f, x3 = 7.56575f, y3 = 6.37531f)
                    curveTo(x1 = 7.43398f, y1 = 6.96018f, x2 = 7.50273f, y2 = 7.64473f, x3 = 7.751f, y3 = 8.39261f)
                    curveTo(x1 = 8.17418f, y1 = 9.66741f, x2 = 9.07177f, y2 = 10.9827f, x3 = 10.0159f, y3 = 12.0009f)
                    curveTo(x1 = 11.0534f, y1 = 11.0028f, x2 = 12.0988f, y2 = 10.348f, x3 = 13.1359f, y3 = 10.1698f)
                    curveTo(x1 = 13.0784f, y1 = 9.3278f, x2 = 12.9719f, y2 = 8.57532f, x3 = 12.8355f, y3 = 7.98283f)
                    curveTo(x1 = 12.5782f, y1 = 6.8651f, x2 = 11.9017f, y2 = 5.73271f, x3 = 11.0784f, y3 = 5.07198f)
                    curveTo(x1 = 10.6724f, y1 = 4.74617f, x2 = 10.2619f, y2 = 4.55932f, x3 = 9.87534f, y3 = 4.51214f)
                    close()
                    moveTo(x = 14.645f, y = 10.2658f)
                    curveTo(x1 = 14.5872f, y1 = 9.28339f, x2 = 14.466f, y2 = 8.37897f, x3 = 14.2973f, y3 = 7.64632f)
                    curveTo(x1 = 13.9734f, y1 = 6.23949f, x2 = 13.1336f, y2 = 4.79802f, x3 = 12.0172f, y3 = 3.90211f)
                    curveTo(x1 = 11.4533f, y1 = 3.44959f, x2 = 10.7881f, y2 = 3.11242f, x3 = 10.0571f, y3 = 3.02319f)
                    curveTo(x1 = 9.31147f, y1 = 2.93218f, x2 = 8.55082f, y2 = 3.10652f, x3 = 7.83776f, y3 = 3.59062f)
                    curveTo(x1 = 6.87726f, y1 = 4.2427f, x2 = 6.31748f, y2 = 5.09112f, x3 = 6.10243f, y3 = 6.04563f)
                    curveTo(x1 = 5.89208f, y1 = 6.97926f, x2 = 6.02455f, y2 = 7.95292f, x3 = 6.32739f, y3 = 8.86519f)
                    curveTo(x1 = 6.84661f, y1 = 10.4293f, x2 = 7.91381f, y2 = 11.9571f, x3 = 8.98936f, y3 = 13.0993f)
                    curveTo(x1 = 8.87344f, y1 = 13.2354f, x2 = 8.75694f, y2 = 13.3761f, x3 = 8.63988f, y3 = 13.5215f)
                    curveTo(x1 = 8.21596f, y1 = 14.0479f, x2 = 7.81588f, y2 = 14.7811f, x3 = 7.51333f, y3 = 15.5564f)
                    curveTo(x1 = 7.45679f, y1 = 15.7013f, x2 = 7.40294f, y2 = 15.8495f, x3 = 7.35249f, y3 = 16.0f)
                    horizontalLineTo(x = 1.75f)
                    curveTo(x1 = 1.33579f, y1 = 16.0f, x2 = 1.0f, y2 = 16.3358f, x3 = 1.0f, y3 = 16.75f)
                    curveTo(x1 = 1.0f, y1 = 17.1642f, x2 = 1.33579f, y2 = 17.5f, x3 = 1.75f, y3 = 17.5f)
                    horizontalLineTo(x = 6.99425f)
                    curveTo(x1 = 6.97086f, y1 = 17.6741f, x2 = 6.95471f, y2 = 17.847f, x3 = 6.94684f, y3 = 18.0174f)
                    curveTo(x1 = 6.91034f, y1 = 18.8071f, x2 = 7.04689f, y2 = 19.6895f, x3 = 7.64557f, y3 = 20.31f)
                    curveTo(x1 = 8.27924f, y1 = 20.9667f, x2 = 9.22496f, y2 = 21.128f, x3 = 10.3368f, y3 = 20.9045f)
                    curveTo(x1 = 12.0608f, y1 = 20.558f, x2 = 13.1186f, y2 = 19.1289f, x3 = 13.7479f, y3 = 17.5f)
                    horizontalLineTo(x = 22.25f)
                    curveTo(x1 = 22.6642f, y1 = 17.5f, x2 = 23.0f, y2 = 17.1642f, x3 = 23.0f, y3 = 16.75f)
                    curveTo(x1 = 23.0f, y1 = 16.3358f, x2 = 22.6642f, y2 = 16.0f, x3 = 22.25f, y3 = 16.0f)
                    horizontalLineTo(x = 14.2072f)
                    curveTo(x1 = 14.517f, y1 = 14.7009f, x2 = 14.6583f, y2 = 13.2862f, x3 = 14.6802f, y3 = 11.9486f)
                    curveTo(x1 = 15.2101f, y1 = 12.3213f, x2 = 15.749f, y2 = 13.044f, x3 = 16.249f, y3 = 14.2743f)
                    curveTo(x1 = 16.3661f, y1 = 14.5622f, x2 = 16.5605f, y2 = 14.9313f, x3 = 16.9266f, y3 = 15.1194f)
                    curveTo(x1 = 17.4035f, y1 = 15.3644f, x2 = 17.8384f, y2 = 15.1648f, x3 = 18.0774f, y3 = 14.9771f)
                    curveTo(x1 = 18.2993f, y1 = 14.8029f, x2 = 18.4749f, y2 = 14.5582f, x3 = 18.6071f, y3 = 14.3499f)
                    curveTo(x1 = 18.7478f, y1 = 14.1282f, x2 = 18.884f, y2 = 13.8742f, x3 = 19.0105f, y3 = 13.6292f)
                    curveTo(x1 = 19.0717f, y1 = 13.5105f, x2 = 19.1306f, y2 = 13.3946f, x3 = 19.1875f, y3 = 13.2825f)
                    curveTo(x1 = 19.2945f, y1 = 13.0717f, x2 = 19.3947f, y2 = 12.8742f, x3 = 19.4919f, y3 = 12.6962f)
                    curveTo(x1 = 19.4908f, y1 = 12.7614f, x2 = 19.4892f, y2 = 12.8306f, x3 = 19.4875f, y3 = 12.9044f)
                    curveTo(x1 = 19.4868f, y1 = 12.9352f, x2 = 19.4861f, y2 = 12.9667f, x3 = 19.4853f, y3 = 12.9991f)
                    lineTo(x = 19.4852f, y = 13.0038f)
                    curveTo(x1 = 19.4787f, y1 = 13.2987f, x2 = 19.469f, y2 = 13.737f, x3 = 19.5866f, y3 = 14.1043f)
                    curveTo(x1 = 19.6516f, y1 = 14.3075f, x2 = 19.7721f, y2 = 14.5471f, x3 = 20.0033f, y3 = 14.7329f)
                    curveTo(x1 = 20.243f, y1 = 14.9255f, x2 = 20.5266f, y2 = 15.0f, x3 = 20.8038f, y3 = 15.0f)
                    horizontalLineTo(x = 22.25f)
                    curveTo(x1 = 22.6642f, y1 = 15.0f, x2 = 23.0f, y2 = 14.6642f, x3 = 23.0f, y3 = 14.25f)
                    curveTo(x1 = 23.0f, y1 = 13.8358f, x2 = 22.6642f, y2 = 13.5f, x3 = 22.25f, y3 = 13.5f)
                    horizontalLineTo(x = 20.9908f)
                    curveTo(x1 = 20.9823f, y1 = 13.3967f, x2 = 20.9802f, y2 = 13.2473f, x3 = 20.985f, y3 = 13.0323f)
                    curveTo(x1 = 20.9857f, y1 = 13.0001f, x2 = 20.9866f, y2 = 12.9663f, x3 = 20.9875f, y3 = 12.9311f)
                    curveTo(x1 = 20.9947f, y1 = 12.65f, x2 = 21.0042f, y2 = 12.28f, x3 = 20.9538f, y3 = 11.9513f)
                    curveTo(x1 = 20.897f, y1 = 11.5806f, x2 = 20.7329f, y2 = 11.0451f, x3 = 20.192f, y3 = 10.7564f)
                    curveTo(x1 = 19.7413f, y1 = 10.5158f, x2 = 19.3099f, y2 = 10.6614f, x3 = 19.0389f, y3 = 10.8531f)
                    curveTo(x1 = 18.7986f, y1 = 11.023f, x2 = 18.6114f, y2 = 11.2692f, x3 = 18.4727f, y3 = 11.4782f)
                    curveTo(x1 = 18.2483f, y1 = 11.8162f, x2 = 18.0218f, y2 = 12.2634f, x3 = 17.823f, y3 = 12.6558f)
                    curveTo(x1 = 17.7726f, y1 = 12.7553f, x2 = 17.7239f, y2 = 12.8514f, x3 = 17.6776f, y3 = 12.9412f)
                    curveTo(x1 = 17.6058f, y1 = 13.0802f, x2 = 17.538f, y2 = 13.2079f, x3 = 17.4735f, y3 = 13.3225f)
                    curveTo(x1 = 16.7871f, y1 = 11.7906f, x2 = 15.8661f, y2 = 10.654f, x3 = 14.645f, y3 = 10.2658f)
                    close()
                    moveTo(x = 19.4333f, y = 12.0339f)
                    curveTo(x1 = 19.4334f, y1 = 12.0337f, x2 = 19.4347f, y2 = 12.0354f, x3 = 19.4368f, y3 = 12.0398f)
                    curveTo(x1 = 19.4342f, y1 = 12.0363f, x2 = 19.4332f, y2 = 12.0341f, x3 = 19.4333f, y3 = 12.0339f)
                    close()
                    moveTo(x = 13.1829f, y = 11.6957f)
                    curveTo(x1 = 12.6142f, y1 = 11.8502f, x2 = 11.9242f, y2 = 12.2569f, x3 = 11.1093f, y3 = 13.0306f)
                    curveTo(x1 = 11.2701f, y1 = 13.1596f, x2 = 11.4233f, y2 = 13.2718f, x3 = 11.5659f, y3 = 13.3659f)
                    curveTo(x1 = 11.9116f, y1 = 13.5941f, x2 = 12.0069f, y2 = 14.0593f, x3 = 11.7787f, y3 = 14.405f)
                    curveTo(x1 = 11.5506f, y1 = 14.7507f, x2 = 11.0853f, y2 = 14.846f, x3 = 10.7396f, y3 = 14.6179f)
                    curveTo(x1 = 10.5271f, y1 = 14.4776f, x2 = 10.3066f, y2 = 14.3132f, x3 = 10.0827f, y3 = 14.1291f)
                    curveTo(x1 = 9.99204f, y1 = 14.2366f, x2 = 9.9005f, y2 = 14.3476f, x3 = 9.80813f, y3 = 14.4623f)
                    curveTo(x1 = 9.52053f, y1 = 14.8194f, x2 = 9.20748f, y2 = 15.3679f, x3 = 8.95117f, y3 = 16.0f)
                    horizontalLineTo(x = 12.6597f)
                    curveTo(x1 = 13.0175f, y1 = 14.6772f, x2 = 13.1748f, y2 = 13.148f, x3 = 13.1829f, y3 = 11.6957f)
                    close()
                    moveTo(x = 12.117f, y = 17.5f)
                    horizontalLineTo(x = 8.51163f)
                    curveTo(x1 = 8.47659f, y1 = 17.7027f, x2 = 8.45388f, y2 = 17.8996f, x3 = 8.44524f, y3 = 18.0866f)
                    curveTo(x1 = 8.41625f, y1 = 18.7138f, x2 = 8.54929f, y2 = 19.0863f, x3 = 8.72501f, y3 = 19.2685f)
                    curveTo(x1 = 8.86575f, y1 = 19.4143f, x2 = 9.19924f, y2 = 19.6032f, x3 = 10.0412f, y3 = 19.4339f)
                    curveTo(x1 = 10.8933f, y1 = 19.2627f, x2 = 11.5906f, y2 = 18.5976f, x3 = 12.117f, y3 = 17.5f)
                    close()
                    moveTo(x = 1.21967f, y = 10.2197f)
                    curveTo(x1 = 1.51256f, y1 = 9.92679f, x2 = 1.98744f, y2 = 9.92679f, x3 = 2.28033f, y3 = 10.2197f)
                    lineTo(x = 3.5f, y = 11.4394f)
                    lineTo(x = 4.71967f, y = 10.2197f)
                    curveTo(x1 = 5.01256f, y1 = 9.92679f, x2 = 5.48744f, y2 = 9.92679f, x3 = 5.78033f, y3 = 10.2197f)
                    curveTo(x1 = 6.07322f, y1 = 10.5126f, x2 = 6.07322f, y2 = 10.9874f, x3 = 5.78033f, y3 = 11.2803f)
                    lineTo(x = 4.56066f, y = 12.5f)
                    lineTo(x = 5.78033f, y = 13.7197f)
                    curveTo(x1 = 6.07322f, y1 = 14.0126f, x2 = 6.07322f, y2 = 14.4874f, x3 = 5.78033f, y3 = 14.7803f)
                    curveTo(x1 = 5.48744f, y1 = 15.0732f, x2 = 5.01256f, y2 = 15.0732f, x3 = 4.71967f, y3 = 14.7803f)
                    lineTo(x = 3.5f, y = 13.5607f)
                    lineTo(x = 2.28033f, y = 14.7803f)
                    curveTo(x1 = 1.98744f, y1 = 15.0732f, x2 = 1.51256f, y2 = 15.0732f, x3 = 1.21967f, y3 = 14.7803f)
                    curveTo(x1 = 0.926777f, y1 = 14.4874f, x2 = 0.926777f, y2 = 14.0126f, x3 = 1.21967f, y3 = 13.7197f)
                    lineTo(x = 2.43934f, y = 12.5f)
                    lineTo(x = 1.21967f, y = 11.2803f)
                    curveTo(x1 = 0.926777f, y1 = 10.9874f, x2 = 0.926777f, y2 = 10.5126f, x3 = 1.21967f, y3 = 10.2197f)
                    close()
                }
            }.build()
            .also { _signature = it }
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
                imageVector = Signature,
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
private var _signature: ImageVector? = null
