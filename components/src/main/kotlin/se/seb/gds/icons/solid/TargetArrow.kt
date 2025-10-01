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
                    moveTo(x = 18.4668f, y = 1.77945f)
                    curveTo(
                        x1 = 18.3884f,
                        y1 = 1.5245f,
                        x2 = 18.1804f,
                        y2 = 1.33039f,
                        x3 = 17.9207f,
                        y3 = 1.26969f,
                    )
                    curveTo(
                        x1 = 17.6609f,
                        y1 = 1.20899f,
                        x2 = 17.3885f,
                        y2 = 1.29083f,
                        x3 = 17.2051f,
                        y3 = 1.48462f,
                    )
                    lineTo(x = 13.7051f, y = 5.18462f)
                    curveTo(
                        x1 = 13.5734f,
                        y1 = 5.32388f,
                        x2 = 13.5f,
                        y2 = 5.50831f,
                        x3 = 13.5f,
                        y3 = 5.70002f,
                    )
                    verticalLineTo(y = 9.43936f)
                    lineTo(x = 11.4697f, y = 11.4697f)
                    curveTo(
                        x1 = 11.1768f,
                        y1 = 11.7626f,
                        x2 = 11.1768f,
                        y2 = 12.2375f,
                        x3 = 11.4697f,
                        y3 = 12.5303f,
                    )
                    curveTo(
                        x1 = 11.7626f,
                        y1 = 12.8232f,
                        x2 = 12.2374f,
                        y2 = 12.8232f,
                        x3 = 12.5303f,
                        y3 = 12.5303f,
                    )
                    lineTo(x = 14.5607f, y = 10.5f)
                    horizontalLineTo(x = 18.3f)
                    curveTo(
                        x1 = 18.4917f,
                        y1 = 10.5f,
                        x2 = 18.6761f,
                        y2 = 10.4266f,
                        x3 = 18.8154f,
                        y3 = 10.2949f,
                    )
                    lineTo(x = 22.5154f, y = 6.79487f)
                    curveTo(
                        x1 = 22.7092f,
                        y1 = 6.61156f,
                        x2 = 22.791f,
                        y2 = 6.33911f,
                        x3 = 22.7303f,
                        y3 = 6.07935f,
                    )
                    curveTo(
                        x1 = 22.6696f,
                        y1 = 5.8196f,
                        x2 = 22.4755f,
                        y2 = 5.61163f,
                        x3 = 22.2206f,
                        y3 = 5.53318f,
                    )
                    lineTo(x = 19.3501f, y = 4.64995f)
                    lineTo(x = 18.4668f, y = 1.77945f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 11.7361f, y = 6.67693f)
                    curveTo(
                        x1 = 11.8154f,
                        y1 = 7.08348f,
                        x2 = 11.5501f,
                        y2 = 7.47732f,
                        x3 = 11.1435f,
                        y3 = 7.55659f,
                    )
                    curveTo(
                        x1 = 9.06706f,
                        y1 = 7.96145f,
                        x2 = 7.5f,
                        y2 = 9.79157f,
                        x3 = 7.5f,
                        y3 = 11.9861f,
                    )
                    curveTo(
                        x1 = 7.5f,
                        y1 = 14.4785f,
                        x2 = 9.52054f,
                        y2 = 16.4991f,
                        x3 = 12.013f,
                        y3 = 16.4991f,
                    )
                    curveTo(
                        x1 = 14.2075f,
                        y1 = 16.4991f,
                        x2 = 16.0376f,
                        y2 = 14.932f,
                        x3 = 16.4425f,
                        y3 = 12.8556f,
                    )
                    curveTo(
                        x1 = 16.5217f,
                        y1 = 12.4491f,
                        x2 = 16.9156f,
                        y2 = 12.1838f,
                        x3 = 17.3221f,
                        y3 = 12.263f,
                    )
                    curveTo(
                        x1 = 17.7287f,
                        y1 = 12.3423f,
                        x2 = 17.994f,
                        y2 = 12.7361f,
                        x3 = 17.9147f,
                        y3 = 13.1427f,
                    )
                    curveTo(
                        x1 = 17.3751f,
                        y1 = 15.9102f,
                        x2 = 14.9388f,
                        y2 = 17.9991f,
                        x3 = 12.013f,
                        y3 = 17.9991f,
                    )
                    curveTo(
                        x1 = 8.69211f,
                        y1 = 17.9991f,
                        x2 = 6.0f,
                        y2 = 15.307f,
                        x3 = 6.0f,
                        y3 = 11.9861f,
                    )
                    curveTo(
                        x1 = 6.0f,
                        y1 = 9.06021f,
                        x2 = 8.08896f,
                        y2 = 6.62391f,
                        x3 = 10.8565f,
                        y3 = 6.08431f,
                    )
                    curveTo(
                        x1 = 11.263f,
                        y1 = 6.00505f,
                        x2 = 11.6569f,
                        y2 = 6.27037f,
                        x3 = 11.7361f,
                        y3 = 6.67693f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 3.5f, y = 12.0f)
                    curveTo(
                        x1 = 3.5f,
                        y1 = 7.30558f,
                        x2 = 7.30558f,
                        y2 = 3.5f,
                        x3 = 12.0f,
                        y3 = 3.5f,
                    )
                    curveTo(
                        x1 = 12.1544f,
                        y1 = 3.5f,
                        x2 = 12.3078f,
                        y2 = 3.50411f,
                        x3 = 12.4601f,
                        y3 = 3.51222f,
                    )
                    curveTo(
                        x1 = 12.8737f,
                        y1 = 3.53425f,
                        x2 = 13.2269f,
                        y2 = 3.2168f,
                        x3 = 13.2489f,
                        y3 = 2.80318f,
                    )
                    curveTo(
                        x1 = 13.271f,
                        y1 = 2.38955f,
                        x2 = 12.9535f,
                        y2 = 2.03638f,
                        x3 = 12.5399f,
                        y3 = 2.01434f,
                    )
                    curveTo(
                        x1 = 12.3611f,
                        y1 = 2.00482f,
                        x2 = 12.1811f,
                        y2 = 2.0f,
                        x3 = 12.0f,
                        y3 = 2.0f,
                    )
                    curveTo(
                        x1 = 6.47715f,
                        y1 = 2.0f,
                        x2 = 2.0f,
                        y2 = 6.47715f,
                        x3 = 2.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 2.0f,
                        y1 = 17.5228f,
                        x2 = 6.47715f,
                        y2 = 22.0f,
                        x3 = 12.0f,
                        y3 = 22.0f,
                    )
                    curveTo(
                        x1 = 17.5228f,
                        y1 = 22.0f,
                        x2 = 22.0f,
                        y2 = 17.5228f,
                        x3 = 22.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 11.8189f,
                        x2 = 21.9952f,
                        y2 = 11.6389f,
                        x3 = 21.9857f,
                        y3 = 11.4601f,
                    )
                    curveTo(
                        x1 = 21.9636f,
                        y1 = 11.0465f,
                        x2 = 21.6105f,
                        y2 = 10.729f,
                        x3 = 21.1968f,
                        y3 = 10.7511f,
                    )
                    curveTo(
                        x1 = 20.7832f,
                        y1 = 10.7731f,
                        x2 = 20.4657f,
                        y2 = 11.1263f,
                        x3 = 20.4878f,
                        y3 = 11.5399f,
                    )
                    curveTo(
                        x1 = 20.4959f,
                        y1 = 11.6922f,
                        x2 = 20.5f,
                        y2 = 11.8456f,
                        x3 = 20.5f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 20.5f,
                        y1 = 16.6944f,
                        x2 = 16.6944f,
                        y2 = 20.5f,
                        x3 = 12.0f,
                        y3 = 20.5f,
                    )
                    curveTo(
                        x1 = 7.30558f,
                        y1 = 20.5f,
                        x2 = 3.5f,
                        y2 = 16.6944f,
                        x3 = 3.5f,
                        y3 = 12.0f,
                    )
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
