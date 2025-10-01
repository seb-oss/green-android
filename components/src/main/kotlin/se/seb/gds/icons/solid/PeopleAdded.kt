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

val PeopleAdded: ImageVector
    get() {
        val current = _peopleAdded
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.PeopleAdded",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 9.51472f, y1 = 2.0f, x2 = 7.5f, y2 = 4.01472f, x3 = 7.5f, y3 = 6.5f)
                curveTo(x1 = 7.5f, y1 = 8.98528f, x2 = 9.51472f, y2 = 11.0f, x3 = 12.0f, y3 = 11.0f)
                curveTo(x1 = 14.4853f, y1 = 11.0f, x2 = 16.5f, y2 = 8.98528f, x3 = 16.5f, y3 = 6.5f)
                curveTo(x1 = 16.5f, y1 = 4.01472f, x2 = 14.4853f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.6589f, y = 14.6956f)
                curveTo(x1 = 16.2284f, y1 = 13.3348f, x2 = 14.2839f, y2 = 12.5f, x3 = 12.0f, y3 = 12.5f)
                curveTo(x1 = 7.38415f, y1 = 12.5f, x2 = 4.15473f, y2 = 15.9097f, x3 = 3.7533f, y3 = 20.1798f)
                curveTo(x1 = 3.73354f, y1 = 20.39f, x2 = 3.80328f, y2 = 20.5988f, x3 = 3.94541f, y3 = 20.7549f)
                curveTo(x1 = 4.08754f, y1 = 20.911f, x2 = 4.28888f, y2 = 21.0f, x3 = 4.5f, y3 = 21.0f)
                horizontalLineTo(x = 14.2001f)
                lineTo(x = 13.4001f, y = 20.4f)
                curveTo(x1 = 12.406f, y1 = 19.6544f, x2 = 12.2045f, y2 = 18.2441f, x3 = 12.9501f, y3 = 17.25f)
                curveTo(x1 = 13.6957f, y1 = 16.2559f, x2 = 15.106f, y2 = 16.0544f, x3 = 16.1001f, y3 = 16.8f)
                lineTo(x = 16.3043f, y = 16.9531f)
                lineTo(x = 17.6589f, y = 14.6956f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 20.8932f, y = 15.1359f)
                curveTo(x1 = 21.1063f, y1 = 14.7807f, x2 = 20.9911f, y2 = 14.32f, x3 = 20.6359f, y3 = 14.1069f)
                curveTo(x1 = 20.2807f, y1 = 13.8938f, x2 = 19.82f, y2 = 14.0089f, x3 = 19.6069f, y3 = 14.3641f)
                lineTo(x = 16.7348f, y = 19.151f)
                lineTo(x = 15.2f, y = 18.0f)
                curveTo(x1 = 14.8687f, y1 = 17.7515f, x2 = 14.3986f, y2 = 17.8186f, x3 = 14.15f, y3 = 18.15f)
                curveTo(x1 = 13.9015f, y1 = 18.4814f, x2 = 13.9687f, y2 = 18.9515f, x3 = 14.3f, y3 = 19.2f)
                lineTo(x = 16.5f, y = 20.85f)
                curveTo(x1 = 16.6699f, y1 = 20.9774f, x2 = 16.8858f, y2 = 21.0268f, x3 = 17.0942f, y3 = 20.986f)
                curveTo(x1 = 17.3026f, y1 = 20.9452f, x2 = 17.4839f, y2 = 20.8179f, x3 = 17.5932f, y3 = 20.6359f)
                lineTo(x = 20.8932f, y = 15.1359f)
                close()
            }
        }.build().also { _peopleAdded = it }
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
                imageVector = PeopleAdded,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _peopleAdded: ImageVector? = null
