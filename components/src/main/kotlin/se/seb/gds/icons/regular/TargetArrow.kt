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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val TargetArrow: ImageVector
    get() {
        val current = _targetArrow
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.TargetArrow",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.75f, y = 2.0f)
                    lineTo(x = 18.4668f, y = 1.77944f)
                    curveTo(x1 = 18.3884f, y1 = 1.52448f, x2 = 18.1804f, y2 = 1.33038f, x3 = 17.9207f, y3 = 1.26968f)
                    curveTo(x1 = 17.6609f, y1 = 1.20898f, x2 = 17.3885f, y2 = 1.29081f, x3 = 17.2051f, y3 = 1.4846f)
                    lineTo(x = 17.75f, y = 2.0f)
                    close()
                    moveTo(x = 18.75f, y = 5.25f)
                    lineTo(x = 18.0332f, y = 5.47056f)
                    curveTo(x1 = 18.1062f, y1 = 5.70796f, x2 = 18.292f, y2 = 5.89379f, x3 = 18.5294f, y3 = 5.96683f)
                    lineTo(x = 18.75f, y = 5.25f)
                    close()
                    moveTo(x = 22.0f, y = 6.25f)
                    lineTo(x = 22.5154f, y = 6.79485f)
                    curveTo(x1 = 22.7092f, y1 = 6.61154f, x2 = 22.791f, y2 = 6.33909f, x3 = 22.7303f, y3 = 6.07934f)
                    curveTo(x1 = 22.6696f, y1 = 5.81958f, x2 = 22.4755f, y2 = 5.61161f, x3 = 22.2206f, y3 = 5.53317f)
                    lineTo(x = 22.0f, y = 6.25f)
                    close()
                    moveTo(x = 18.3f, y = 9.75f)
                    verticalLineTo(y = 10.5f)
                    curveTo(x1 = 18.4917f, y1 = 10.5f, x2 = 18.6761f, y2 = 10.4266f, x3 = 18.8154f, y3 = 10.2949f)
                    lineTo(x = 18.3f, y = 9.75f)
                    close()
                    moveTo(x = 14.25f, y = 5.7f)
                    lineTo(x = 13.7051f, y = 5.1846f)
                    curveTo(x1 = 13.5734f, y1 = 5.32387f, x2 = 13.5f, y2 = 5.5083f, x3 = 13.5f, y3 = 5.7f)
                    horizontalLineTo(x = 14.25f)
                    close()
                    moveTo(x = 11.4697f, y = 11.4697f)
                    curveTo(x1 = 11.1768f, y1 = 11.7626f, x2 = 11.1768f, y2 = 12.2374f, x3 = 11.4697f, y3 = 12.5303f)
                    curveTo(x1 = 11.7626f, y1 = 12.8232f, x2 = 12.2374f, y2 = 12.8232f, x3 = 12.5303f, y3 = 12.5303f)
                    lineTo(x = 12.0f, y = 12.0f)
                    lineTo(x = 11.4697f, y = 11.4697f)
                    close()
                    moveTo(x = 11.1435f, y = 7.55755f)
                    curveTo(x1 = 11.5501f, y1 = 7.47828f, x2 = 11.8154f, y2 = 7.08444f, x3 = 11.7361f, y3 = 6.67789f)
                    curveTo(x1 = 11.6569f, y1 = 6.27133f, x2 = 11.263f, y2 = 6.00601f, x3 = 10.8565f, y3 = 6.08528f)
                    lineTo(x = 11.0f, y = 6.82141f)
                    lineTo(x = 11.1435f, y = 7.55755f)
                    close()
                    moveTo(x = 17.9147f, y = 13.1437f)
                    curveTo(x1 = 17.994f, y1 = 12.7371f, x2 = 17.7287f, y2 = 12.3433f, x3 = 17.3221f, y3 = 12.264f)
                    curveTo(x1 = 16.9156f, y1 = 12.1847f, x2 = 16.5217f, y2 = 12.45f, x3 = 16.4425f, y3 = 12.8566f)
                    lineTo(x = 17.1786f, y = 13.0001f)
                    lineTo(x = 17.9147f, y = 13.1437f)
                    close()
                    moveTo(x = 12.4601f, y = 3.51222f)
                    curveTo(x1 = 12.8737f, y1 = 3.53425f, x2 = 13.2269f, y2 = 3.2168f, x3 = 13.2489f, y3 = 2.80318f)
                    curveTo(x1 = 13.271f, y1 = 2.38955f, x2 = 12.9535f, y2 = 2.03638f, x3 = 12.5399f, y3 = 2.01435f)
                    lineTo(x = 12.5f, y = 2.76328f)
                    lineTo(x = 12.4601f, y = 3.51222f)
                    close()
                    moveTo(x = 21.9857f, y = 11.4601f)
                    curveTo(x1 = 21.9636f, y1 = 11.0465f, x2 = 21.6105f, y2 = 10.729f, x3 = 21.1968f, y3 = 10.7511f)
                    curveTo(x1 = 20.7832f, y1 = 10.7731f, x2 = 20.4657f, y2 = 11.1263f, x3 = 20.4878f, y3 = 11.5399f)
                    lineTo(x = 21.2367f, y = 11.5f)
                    lineTo(x = 21.9857f, y = 11.4601f)
                    close()
                    moveTo(x = 17.75f, y = 2.0f)
                    lineTo(x = 17.0332f, y = 2.22056f)
                    lineTo(x = 18.0332f, y = 5.47056f)
                    lineTo(x = 18.75f, y = 5.25f)
                    lineTo(x = 19.4668f, y = 5.02944f)
                    lineTo(x = 18.4668f, y = 1.77944f)
                    lineTo(x = 17.75f, y = 2.0f)
                    close()
                    moveTo(x = 18.75f, y = 5.25f)
                    lineTo(x = 18.5294f, y = 5.96683f)
                    lineTo(x = 21.7794f, y = 6.96683f)
                    lineTo(x = 22.0f, y = 6.25f)
                    lineTo(x = 22.2206f, y = 5.53317f)
                    lineTo(x = 18.9706f, y = 4.53317f)
                    lineTo(x = 18.75f, y = 5.25f)
                    close()
                    moveTo(x = 22.0f, y = 6.25f)
                    lineTo(x = 21.4846f, y = 5.70515f)
                    lineTo(x = 17.7846f, y = 9.20515f)
                    lineTo(x = 18.3f, y = 9.75f)
                    lineTo(x = 18.8154f, y = 10.2949f)
                    lineTo(x = 22.5154f, y = 6.79485f)
                    lineTo(x = 22.0f, y = 6.25f)
                    close()
                    moveTo(x = 18.3f, y = 9.75f)
                    verticalLineTo(y = 9.0f)
                    horizontalLineTo(x = 14.25f)
                    verticalLineTo(y = 9.75f)
                    verticalLineTo(y = 10.5f)
                    horizontalLineTo(x = 18.3f)
                    verticalLineTo(y = 9.75f)
                    close()
                    moveTo(x = 14.25f, y = 9.75f)
                    horizontalLineTo(x = 15.0f)
                    verticalLineTo(y = 5.7f)
                    horizontalLineTo(x = 14.25f)
                    horizontalLineTo(x = 13.5f)
                    verticalLineTo(y = 9.75f)
                    horizontalLineTo(x = 14.25f)
                    close()
                    moveTo(x = 14.25f, y = 5.7f)
                    lineTo(x = 14.7949f, y = 6.2154f)
                    lineTo(x = 18.2949f, y = 2.5154f)
                    lineTo(x = 17.75f, y = 2.0f)
                    lineTo(x = 17.2051f, y = 1.4846f)
                    lineTo(x = 13.7051f, y = 5.1846f)
                    lineTo(x = 14.25f, y = 5.7f)
                    close()
                    moveTo(x = 14.25f, y = 9.75f)
                    lineTo(x = 13.7197f, y = 9.21967f)
                    lineTo(x = 11.4697f, y = 11.4697f)
                    lineTo(x = 12.0f, y = 12.0f)
                    lineTo(x = 12.5303f, y = 12.5303f)
                    lineTo(x = 14.7803f, y = 10.2803f)
                    lineTo(x = 14.25f, y = 9.75f)
                    close()
                    moveTo(x = 12.013f, y = 17.25f)
                    verticalLineTo(y = 16.5f)
                    curveTo(x1 = 9.52054f, y1 = 16.5f, x2 = 7.5f, y2 = 14.4795f, x3 = 7.5f, y3 = 11.987f)
                    horizontalLineTo(x = 6.75f)
                    horizontalLineTo(x = 6.0f)
                    curveTo(x1 = 6.0f, y1 = 15.3079f, x2 = 8.69211f, y2 = 18.0f, x3 = 12.013f, y3 = 18.0f)
                    verticalLineTo(y = 17.25f)
                    close()
                    moveTo(x = 6.75f, y = 11.987f)
                    horizontalLineTo(x = 7.5f)
                    curveTo(x1 = 7.5f, y1 = 9.79253f, x2 = 9.06706f, y2 = 7.96241f, x3 = 11.1435f, y3 = 7.55755f)
                    lineTo(x = 11.0f, y = 6.82141f)
                    lineTo(x = 10.8565f, y = 6.08528f)
                    curveTo(x1 = 8.08896f, y1 = 6.62487f, x2 = 6.0f, y2 = 9.06117f, x3 = 6.0f, y3 = 11.987f)
                    horizontalLineTo(x = 6.75f)
                    close()
                    moveTo(x = 17.1786f, y = 13.0001f)
                    lineTo(x = 16.4425f, y = 12.8566f)
                    curveTo(x1 = 16.0376f, y1 = 14.933f, x2 = 14.2075f, y2 = 16.5f, x3 = 12.013f, y3 = 16.5f)
                    verticalLineTo(y = 17.25f)
                    verticalLineTo(y = 18.0f)
                    curveTo(x1 = 14.9388f, y1 = 18.0f, x2 = 17.3751f, y2 = 15.9111f, x3 = 17.9147f, y3 = 13.1437f)
                    lineTo(x = 17.1786f, y = 13.0001f)
                    close()
                    moveTo(x = 21.25f, y = 12.0f)
                    horizontalLineTo(x = 20.5f)
                    curveTo(x1 = 20.5f, y1 = 16.6944f, x2 = 16.6944f, y2 = 20.5f, x3 = 12.0f, y3 = 20.5f)
                    verticalLineTo(y = 21.25f)
                    verticalLineTo(y = 22.0f)
                    curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                    horizontalLineTo(x = 21.25f)
                    close()
                    moveTo(x = 12.0f, y = 21.25f)
                    verticalLineTo(y = 20.5f)
                    curveTo(x1 = 7.30558f, y1 = 20.5f, x2 = 3.5f, y2 = 16.6944f, x3 = 3.5f, y3 = 12.0f)
                    horizontalLineTo(x = 2.75f)
                    horizontalLineTo(x = 2.0f)
                    curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    verticalLineTo(y = 21.25f)
                    close()
                    moveTo(x = 2.75f, y = 12.0f)
                    horizontalLineTo(x = 3.5f)
                    curveTo(x1 = 3.5f, y1 = 7.30558f, x2 = 7.30558f, y2 = 3.5f, x3 = 12.0f, y3 = 3.5f)
                    verticalLineTo(y = 2.75f)
                    verticalLineTo(y = 2.0f)
                    curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                    horizontalLineTo(x = 2.75f)
                    close()
                    moveTo(x = 12.0f, y = 2.75f)
                    verticalLineTo(y = 3.5f)
                    curveTo(x1 = 12.1544f, y1 = 3.5f, x2 = 12.3078f, y2 = 3.50411f, x3 = 12.4601f, y3 = 3.51222f)
                    lineTo(x = 12.5f, y = 2.76328f)
                    lineTo(x = 12.5399f, y = 2.01435f)
                    curveTo(x1 = 12.3611f, y1 = 2.00482f, x2 = 12.1811f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    verticalLineTo(y = 2.75f)
                    close()
                    moveTo(x = 21.2367f, y = 11.5f)
                    lineTo(x = 20.4878f, y = 11.5399f)
                    curveTo(x1 = 20.4959f, y1 = 11.6922f, x2 = 20.5f, y2 = 11.8456f, x3 = 20.5f, y3 = 12.0f)
                    horizontalLineTo(x = 21.25f)
                    horizontalLineTo(x = 22.0f)
                    curveTo(x1 = 22.0f, y1 = 11.8189f, x2 = 21.9952f, y2 = 11.6389f, x3 = 21.9857f, y3 = 11.4601f)
                    lineTo(x = 21.2367f, y = 11.5f)
                    close()
                }
            }.build()
            .also { _targetArrow = it }
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
                imageVector = TargetArrow,
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
private var _targetArrow: ImageVector? = null
