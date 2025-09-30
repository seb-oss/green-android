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

val Sun: ImageVector
    get() {
        val current = _sun
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Sun",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.7502f, y = 1.76758f)
                    curveTo(x1 = 12.7502f, y1 = 1.35336f, x2 = 12.4144f, y2 = 1.01758f, x3 = 12.0002f, y3 = 1.01758f)
                    curveTo(x1 = 11.5859f, y1 = 1.01758f, x2 = 11.2502f, y2 = 1.35336f, x3 = 11.2502f, y3 = 1.76758f)
                    verticalLineTo(y = 3.29083f)
                    curveTo(x1 = 11.2502f, y1 = 3.70505f, x2 = 11.5859f, y2 = 4.04083f, x3 = 12.0002f, y3 = 4.04083f)
                    curveTo(x1 = 12.4144f, y1 = 4.04083f, x2 = 12.7502f, y2 = 3.70505f, x3 = 12.7502f, y3 = 3.29083f)
                    verticalLineTo(y = 1.76758f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.23437f, y = 18.7054f)
                    curveTo(x1 = 3.94148f, y1 = 18.9983f, x2 = 3.94148f, y2 = 19.4732f, x3 = 4.23437f, y3 = 19.7661f)
                    curveTo(x1 = 4.52726f, y1 = 20.059f, x2 = 5.00214f, y2 = 20.059f, x3 = 5.29503f, y3 = 19.7661f)
                    lineTo(x = 6.37213f, y = 18.689f)
                    curveTo(x1 = 6.66503f, y1 = 18.3961f, x2 = 6.66503f, y2 = 17.9212f, x3 = 6.37213f, y3 = 17.6283f)
                    curveTo(x1 = 6.07924f, y1 = 17.3354f, x2 = 5.60437f, y2 = 17.3354f, x3 = 5.31147f, y3 = 17.6283f)
                    lineTo(x = 4.23437f, y = 18.7054f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.0002f, y = 19.9594f)
                    curveTo(x1 = 12.4144f, y1 = 19.9594f, x2 = 12.7502f, y2 = 20.2952f, x3 = 12.7502f, y3 = 20.7094f)
                    verticalLineTo(y = 22.2327f)
                    curveTo(x1 = 12.7502f, y1 = 22.6469f, x2 = 12.4144f, y2 = 22.9827f, x3 = 12.0002f, y3 = 22.9827f)
                    curveTo(x1 = 11.5859f, y1 = 22.9827f, x2 = 11.2502f, y2 = 22.6469f, x3 = 11.2502f, y3 = 22.2327f)
                    verticalLineTo(y = 20.7094f)
                    curveTo(x1 = 11.2502f, y1 = 20.2952f, x2 = 11.5859f, y2 = 19.9594f, x3 = 12.0002f, y3 = 19.9594f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.6279f, y = 5.31146f)
                    curveTo(x1 = 17.335f, y1 = 5.60435f, x2 = 17.335f, y2 = 6.07922f, x3 = 17.6279f, y3 = 6.37212f)
                    curveTo(x1 = 17.9208f, y1 = 6.66501f, x2 = 18.3956f, y2 = 6.66501f, x3 = 18.6885f, y3 = 6.37212f)
                    lineTo(x = 19.7656f, y = 5.29501f)
                    curveTo(x1 = 20.0585f, y1 = 5.00212f, x2 = 20.0585f, y2 = 4.52724f, x3 = 19.7656f, y3 = 4.23435f)
                    curveTo(x1 = 19.4727f, y1 = 3.94146f, x2 = 18.9979f, y2 = 3.94146f, x3 = 18.705f, y3 = 4.23435f)
                    lineTo(x = 17.6279f, y = 5.31146f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 19.959f, y = 12.0001f)
                    curveTo(x1 = 19.959f, y1 = 11.5859f, x2 = 20.2948f, y2 = 11.2501f, x3 = 20.709f, y3 = 11.2501f)
                    horizontalLineTo(x = 22.2322f)
                    curveTo(x1 = 22.6465f, y1 = 11.2501f, x2 = 22.9822f, y2 = 11.5859f, x3 = 22.9822f, y3 = 12.0001f)
                    curveTo(x1 = 22.9822f, y1 = 12.4144f, x2 = 22.6465f, y2 = 12.7501f, x3 = 22.2322f, y3 = 12.7501f)
                    horizontalLineTo(x = 20.709f)
                    curveTo(x1 = 20.2948f, y1 = 12.7501f, x2 = 19.959f, y2 = 12.4144f, x3 = 19.959f, y3 = 12.0001f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 18.6885f, y = 17.6282f)
                    curveTo(x1 = 18.3956f, y1 = 17.3353f, x2 = 17.9208f, y2 = 17.3353f, x3 = 17.6279f, y3 = 17.6282f)
                    curveTo(x1 = 17.335f, y1 = 17.9211f, x2 = 17.335f, y2 = 18.396f, x3 = 17.6279f, y3 = 18.6889f)
                    lineTo(x = 18.705f, y = 19.766f)
                    curveTo(x1 = 18.9979f, y1 = 20.0589f, x2 = 19.4727f, y2 = 20.0589f, x3 = 19.7656f, y3 = 19.766f)
                    curveTo(x1 = 20.0585f, y1 = 19.4731f, x2 = 20.0585f, y2 = 18.9982f, x3 = 19.7656f, y3 = 18.7053f)
                    lineTo(x = 18.6885f, y = 17.6282f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 1.01758f, y = 12.0001f)
                    curveTo(x1 = 1.01758f, y1 = 11.5859f, x2 = 1.35336f, y2 = 11.2501f, x3 = 1.76758f, y3 = 11.2501f)
                    horizontalLineTo(x = 3.29083f)
                    curveTo(x1 = 3.70505f, y1 = 11.2501f, x2 = 4.04083f, y2 = 11.5859f, x3 = 4.04083f, y3 = 12.0001f)
                    curveTo(x1 = 4.04083f, y1 = 12.4143f, x2 = 3.70505f, y2 = 12.7501f, x3 = 3.29083f, y3 = 12.7501f)
                    horizontalLineTo(x = 1.76758f)
                    curveTo(x1 = 1.35336f, y1 = 12.7501f, x2 = 1.01758f, y2 = 12.4143f, x3 = 1.01758f, y3 = 12.0001f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 5.29495f, y = 4.23429f)
                    curveTo(x1 = 5.00206f, y1 = 3.9414f, x2 = 4.52718f, y2 = 3.9414f, x3 = 4.23429f, y3 = 4.23429f)
                    curveTo(x1 = 3.9414f, y1 = 4.52718f, x2 = 3.9414f, y2 = 5.00206f, x3 = 4.23429f, y3 = 5.29495f)
                    lineTo(x = 5.3114f, y = 6.37206f)
                    curveTo(x1 = 5.60429f, y1 = 6.66495f, x2 = 6.07916f, y2 = 6.66495f, x3 = 6.37206f, y3 = 6.37206f)
                    curveTo(x1 = 6.66495f, y1 = 6.07916f, x2 = 6.66495f, y2 = 5.60429f, x3 = 6.37206f, y3 = 5.3114f)
                    lineTo(x = 5.29495f, y = 4.23429f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 7.75736f, y = 7.75736f)
                    curveTo(x1 = 10.1005f, y1 = 5.41421f, x2 = 13.8995f, y2 = 5.41421f, x3 = 16.2426f, y3 = 7.75736f)
                    curveTo(x1 = 18.5858f, y1 = 10.1005f, x2 = 18.5858f, y2 = 13.8995f, x3 = 16.2426f, y3 = 16.2426f)
                    curveTo(x1 = 13.8995f, y1 = 18.5858f, x2 = 10.1005f, y2 = 18.5858f, x3 = 7.75736f, y3 = 16.2426f)
                    curveTo(x1 = 5.41421f, y1 = 13.8995f, x2 = 5.41421f, y2 = 10.1005f, x3 = 7.75736f, y3 = 7.75736f)
                    close()
                }
            }.build()
            .also { _sun = it }
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
                imageVector = Sun,
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
private var _sun: ImageVector? = null
