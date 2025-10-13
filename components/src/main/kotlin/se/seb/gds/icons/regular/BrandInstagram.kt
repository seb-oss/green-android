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

internal val BrandInstagram: ImageVector
    get() {
        val current = _brandInstagram
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.BrandInstagram",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 4.21173f)
                curveTo(x1 = 14.5365f, y1 = 4.21173f, x2 = 14.837f, y2 = 4.22123f, x3 = 15.8389f, y3 = 4.267f)
                curveTo(x1 = 16.4411f, y1 = 4.27427f, x2 = 17.0377f, y2 = 4.38499f, x3 = 17.6024f, y3 = 4.59432f)
                curveTo(x1 = 18.0151f, y1 = 4.74662f, x2 = 18.3884f, y2 = 4.9895f, x3 = 18.6949f, y3 = 5.30509f)
                curveTo(x1 = 19.0105f, y1 = 5.61156f, x2 = 19.2534f, y2 = 5.98488f, x3 = 19.4057f, y3 = 6.39759f)
                curveTo(x1 = 19.615f, y1 = 6.96235f, x2 = 19.7257f, y2 = 7.55888f, x3 = 19.733f, y3 = 8.16114f)
                curveTo(x1 = 19.7788f, y1 = 9.16295f, x2 = 19.7883f, y2 = 9.4635f, x3 = 19.7883f, y3 = 12.0f)
                curveTo(x1 = 19.7883f, y1 = 14.5365f, x2 = 19.7788f, y2 = 14.837f, x3 = 19.733f, y3 = 15.8389f)
                curveTo(x1 = 19.7257f, y1 = 16.4411f, x2 = 19.615f, y2 = 17.0377f, x3 = 19.4057f, y3 = 17.6024f)
                curveTo(x1 = 19.2476f, y1 = 18.0122f, x2 = 19.0055f, y2 = 18.3844f, x3 = 18.6949f, y3 = 18.6949f)
                curveTo(x1 = 18.3844f, y1 = 19.0055f, x2 = 18.0122f, y2 = 19.2476f, x3 = 17.6024f, y3 = 19.4057f)
                curveTo(x1 = 17.0377f, y1 = 19.615f, x2 = 16.4411f, y2 = 19.7257f, x3 = 15.8389f, y3 = 19.733f)
                curveTo(x1 = 14.837f, y1 = 19.7788f, x2 = 14.5365f, y2 = 19.7883f, x3 = 12.0f, y3 = 19.7883f)
                curveTo(x1 = 9.4635f, y1 = 19.7883f, x2 = 9.16295f, y2 = 19.7788f, x3 = 8.16114f, y3 = 19.733f)
                curveTo(x1 = 7.55859f, y1 = 19.7258f, x2 = 6.96176f, y2 = 19.6151f, x3 = 6.39673f, y3 = 19.4057f)
                curveTo(x1 = 5.98433f, y1 = 19.2533f, x2 = 5.61132f, y2 = 19.0104f, x3 = 5.30509f, y3 = 18.6949f)
                curveTo(x1 = 4.9895f, y1 = 18.3884f, x2 = 4.74662f, y2 = 18.0151f, x3 = 4.59432f, y3 = 17.6024f)
                curveTo(x1 = 4.38499f, y1 = 17.0377f, x2 = 4.27427f, y2 = 16.4411f, x3 = 4.267f, y3 = 15.8389f)
                curveTo(x1 = 4.22123f, y1 = 14.837f, x2 = 4.21173f, y2 = 14.5365f, x3 = 4.21173f, y3 = 12.0f)
                curveTo(x1 = 4.21173f, y1 = 9.4635f, x2 = 4.22123f, y2 = 9.16295f, x3 = 4.267f, y3 = 8.16114f)
                curveTo(x1 = 4.27427f, y1 = 7.55888f, x2 = 4.38499f, y2 = 6.96235f, x3 = 4.59432f, y3 = 6.39759f)
                curveTo(x1 = 4.74662f, y1 = 5.98488f, x2 = 4.9895f, y2 = 5.61156f, x3 = 5.30509f, y3 = 5.30509f)
                curveTo(x1 = 5.61156f, y1 = 4.9895f, x2 = 5.98488f, y2 = 4.74662f, x3 = 6.39759f, y3 = 4.59432f)
                curveTo(x1 = 6.96235f, y1 = 4.38499f, x2 = 7.55888f, y2 = 4.27427f, x3 = 8.16114f, y3 = 4.267f)
                curveTo(x1 = 9.16295f, y1 = 4.22123f, x2 = 9.4635f, y2 = 4.21173f, x3 = 12.0f, y3 = 4.21173f)
                close()
                moveTo(x = 12.0f, y = 2.5f)
                curveTo(x1 = 9.42032f, y1 = 2.5f, x2 = 9.09645f, y2 = 2.51123f, x3 = 8.08341f, y3 = 2.557f)
                curveTo(x1 = 7.29535f, y1 = 2.57272f, x2 = 6.51567f, y2 = 2.72194f, x3 = 5.7775f, y3 = 2.99832f)
                curveTo(x1 = 5.1433f, y1 = 3.2371f, x2 = 4.56886f, y2 = 3.61141f, x3 = 4.09427f, y3 = 4.09514f)
                curveTo(x1 = 3.61096f, y1 = 4.56956f, x2 = 3.23695f, y2 = 5.14369f, x3 = 2.99832f, y3 = 5.7775f)
                curveTo(x1 = 2.72224f, y1 = 6.51572f, x2 = 2.57331f, y2 = 7.2954f, x3 = 2.55786f, y3 = 8.08341f)
                curveTo(x1 = 2.51036f, y1 = 9.09645f, x2 = 2.5f, y2 = 9.42032f, x3 = 2.5f, y3 = 12.0f)
                curveTo(x1 = 2.5f, y1 = 14.5797f, x2 = 2.51123f, y2 = 14.9035f, x3 = 2.557f, y3 = 15.9166f)
                curveTo(x1 = 2.57272f, y1 = 16.7046f, x2 = 2.72194f, y2 = 17.4843f, x3 = 2.99832f, y3 = 18.2225f)
                curveTo(x1 = 3.2371f, y1 = 18.8567f, x2 = 3.61141f, y2 = 19.4311f, x3 = 4.09514f, y3 = 19.9057f)
                curveTo(x1 = 4.56956f, y1 = 20.389f, x2 = 5.14369f, y2 = 20.763f, x3 = 5.7775f, y3 = 21.0017f)
                curveTo(x1 = 6.51572f, y1 = 21.2778f, x2 = 7.2954f, y2 = 21.4267f, x3 = 8.08341f, y3 = 21.4421f)
                curveTo(x1 = 9.09645f, y1 = 21.4896f, x2 = 9.42032f, y2 = 21.5f, x3 = 12.0f, y3 = 21.5f)
                curveTo(x1 = 14.5797f, y1 = 21.5f, x2 = 14.9035f, y2 = 21.4888f, x3 = 15.9166f, y3 = 21.443f)
                curveTo(x1 = 16.7046f, y1 = 21.4273f, x2 = 17.4843f, y2 = 21.2781f, x3 = 18.2225f, y3 = 21.0017f)
                curveTo(x1 = 18.8538f, y1 = 20.7576f, x2 = 19.4271f, y2 = 20.3843f, x3 = 19.9057f, y3 = 19.9057f)
                curveTo(x1 = 20.3843f, y1 = 19.4271f, x2 = 20.7576f, y2 = 18.8538f, x3 = 21.0017f, y3 = 18.2225f)
                curveTo(x1 = 21.2778f, y1 = 17.4843f, x2 = 21.4267f, y2 = 16.7046f, x3 = 21.4421f, y3 = 15.9166f)
                curveTo(x1 = 21.4896f, y1 = 14.9035f, x2 = 21.5f, y2 = 14.5797f, x3 = 21.5f, y3 = 12.0f)
                curveTo(x1 = 21.5f, y1 = 9.42032f, x2 = 21.4888f, y2 = 9.09645f, x3 = 21.443f, y3 = 8.08341f)
                curveTo(x1 = 21.4273f, y1 = 7.29535f, x2 = 21.2781f, y2 = 6.51567f, x3 = 21.0017f, y3 = 5.7775f)
                curveTo(x1 = 20.7629f, y1 = 5.1433f, x2 = 20.3886f, y2 = 4.56886f, x3 = 19.9049f, y3 = 4.09427f)
                curveTo(x1 = 19.4304f, y1 = 3.61096f, x2 = 18.8563f, y2 = 3.23695f, x3 = 18.2225f, y3 = 2.99832f)
                curveTo(x1 = 17.4843f, y1 = 2.72224f, x2 = 16.7046f, y2 = 2.57331f, x3 = 15.9166f, y3 = 2.55786f)
                curveTo(x1 = 14.9035f, y1 = 2.51036f, x2 = 14.5797f, y2 = 2.5f, x3 = 12.0f, y3 = 2.5f)
                close()
                moveTo(x = 12.0f, y = 7.12132f)
                curveTo(x1 = 11.0351f, y1 = 7.12132f, x2 = 10.0918f, y2 = 7.40745f, x3 = 9.28955f, y3 = 7.94352f)
                curveTo(x1 = 8.48725f, y1 = 8.4796f, x2 = 7.86194f, y2 = 9.24155f, x3 = 7.49269f, y3 = 10.133f)
                curveTo(x1 = 7.12343f, y1 = 11.0245f, x2 = 7.02682f, y2 = 12.0054f, x3 = 7.21506f, y3 = 12.9518f)
                curveTo(x1 = 7.40331f, y1 = 13.8982f, x2 = 7.86796f, y2 = 14.7675f, x3 = 8.55025f, y3 = 15.4497f)
                curveTo(x1 = 9.23255f, y1 = 16.132f, x2 = 10.1018f, y2 = 16.5967f, x3 = 11.0482f, y3 = 16.7849f)
                curveTo(x1 = 11.9946f, y1 = 16.9732f, x2 = 12.9755f, y2 = 16.8766f, x3 = 13.867f, y3 = 16.5073f)
                curveTo(x1 = 14.7585f, y1 = 16.1381f, x2 = 15.5204f, y2 = 15.5127f, x3 = 16.0565f, y3 = 14.7105f)
                curveTo(x1 = 16.5926f, y1 = 13.9082f, x2 = 16.8787f, y2 = 12.9649f, x3 = 16.8787f, y3 = 12.0f)
                curveTo(x1 = 16.8787f, y1 = 10.7061f, x2 = 16.3647f, y2 = 9.46518f, x3 = 15.4497f, y3 = 8.55025f)
                curveTo(x1 = 14.5348f, y1 = 7.63532f, x2 = 13.2939f, y2 = 7.12132f, x3 = 12.0f, y3 = 7.12132f)
                close()
                moveTo(x = 12.0f, y = 15.167f)
                curveTo(x1 = 11.3736f, y1 = 15.167f, x2 = 10.7613f, y2 = 14.9812f, x3 = 10.2405f, y3 = 14.6332f)
                curveTo(x1 = 9.71973f, y1 = 14.2852f, x2 = 9.31382f, y2 = 13.7906f, x3 = 9.07412f, y3 = 13.2119f)
                curveTo(x1 = 8.83442f, y1 = 12.6333f, x2 = 8.7717f, y2 = 11.9965f, x3 = 8.8939f, y3 = 11.3822f)
                curveTo(x1 = 9.0161f, y1 = 10.7678f, x2 = 9.31772f, y2 = 10.2035f, x3 = 9.76063f, y3 = 9.76063f)
                curveTo(x1 = 10.2035f, y1 = 9.31772f, x2 = 10.7678f, y2 = 9.0161f, x3 = 11.3822f, y3 = 8.8939f)
                curveTo(x1 = 11.9965f, y1 = 8.7717f, x2 = 12.6333f, y2 = 8.83442f, x3 = 13.2119f, y3 = 9.07412f)
                curveTo(x1 = 13.7906f, y1 = 9.31382f, x2 = 14.2852f, y2 = 9.71973f, x3 = 14.6332f, y3 = 10.2405f)
                curveTo(x1 = 14.9812f, y1 = 10.7613f, x2 = 15.167f, y2 = 11.3736f, x3 = 15.167f, y3 = 12.0f)
                curveTo(x1 = 15.167f, y1 = 12.8399f, x2 = 14.8333f, y2 = 13.6455f, x3 = 14.2394f, y3 = 14.2394f)
                curveTo(x1 = 13.6455f, y1 = 14.8333f, x2 = 12.8399f, y2 = 15.167f, x3 = 12.0f, y3 = 15.167f)
                close()
                moveTo(x = 17.0713f, y = 5.78873f)
                curveTo(x1 = 16.8458f, y1 = 5.78873f, x2 = 16.6254f, y2 = 5.85559f, x3 = 16.4379f, y3 = 5.98085f)
                curveTo(x1 = 16.2505f, y1 = 6.10612f, x2 = 16.1043f, y2 = 6.28416f, x3 = 16.0181f, y3 = 6.49247f)
                curveTo(x1 = 15.9318f, y1 = 6.70078f, x2 = 15.9092f, y2 = 6.92999f, x3 = 15.9532f, y3 = 7.15113f)
                curveTo(x1 = 15.9972f, y1 = 7.37227f, x2 = 16.1057f, y2 = 7.5754f, x3 = 16.2652f, y3 = 7.73483f)
                curveTo(x1 = 16.4246f, y1 = 7.89426f, x2 = 16.6277f, y2 = 8.00284f, x3 = 16.8489f, y3 = 8.04682f)
                curveTo(x1 = 17.07f, y1 = 8.09081f, x2 = 17.2992f, y2 = 8.06823f, x3 = 17.5075f, y3 = 7.98195f)
                curveTo(x1 = 17.7158f, y1 = 7.89567f, x2 = 17.8939f, y2 = 7.74955f, x3 = 18.0191f, y3 = 7.56208f)
                curveTo(x1 = 18.1444f, y1 = 7.37461f, x2 = 18.2113f, y2 = 7.1542f, x3 = 18.2113f, y3 = 6.92873f)
                curveTo(x1 = 18.2113f, y1 = 6.62638f, x2 = 18.0912f, y2 = 6.33642f, x3 = 17.8774f, y3 = 6.12263f)
                curveTo(x1 = 17.6636f, y1 = 5.90883f, x2 = 17.3736f, y2 = 5.78873f, x3 = 17.0713f, y3 = 5.78873f)
                close()
            }
        }.build().also { _brandInstagram = it }
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
                imageVector = BrandInstagram,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _brandInstagram: ImageVector? = null
