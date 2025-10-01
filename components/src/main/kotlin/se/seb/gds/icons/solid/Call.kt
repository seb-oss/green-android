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

val Call: ImageVector
    get() {
        val current = _call
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Call",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.75188f, y = 3.0f)
                curveTo(x1 = 3.34208f, y1 = 3.0f, x2 = 3.00815f, y2 = 3.32893f, x3 = 3.00197f, y3 = 3.73869f)
                curveTo(x1 = 3.00066f, y1 = 3.82564f, x2 = 3.0f, y2 = 3.91275f, x3 = 3.0f, y3 = 4.0f)
                curveTo(x1 = 3.0f, y1 = 7.10297f, x2 = 3.83203f, y2 = 10.0139f, x3 = 5.28566f, y3 = 12.5194f)
                curveTo(x1 = 6.77436f, y1 = 15.0853f, x2 = 8.9147f, y2 = 17.2256f, x3 = 11.4806f, y3 = 18.7143f)
                curveTo(x1 = 13.9861f, y1 = 20.168f, x2 = 16.897f, y2 = 21.0f, x3 = 20.0f, y3 = 21.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 21.0f, x2 = 21.0f, y2 = 20.6642f, x3 = 21.0f, y3 = 20.25f)
                verticalLineTo(y = 15.0f)
                curveTo(x1 = 21.0f, y1 = 14.6673f, x2 = 20.7808f, y2 = 14.3744f, x3 = 20.4616f, y3 = 14.2805f)
                lineTo(x = 16.2116f, y = 13.0305f)
                curveTo(x1 = 15.943f, y1 = 12.9515f, x2 = 15.6528f, y2 = 13.0286f, x3 = 15.459f, y3 = 13.2306f)
                lineTo(x = 14.0423f, y = 14.7063f)
                curveTo(x1 = 12.0524f, y1 = 13.5965f, x2 = 10.4035f, y2 = 11.9476f, x3 = 9.29367f, y3 = 9.95774f)
                lineTo(x = 10.7694f, y = 8.54104f)
                curveTo(x1 = 10.9714f, y1 = 8.34717f, x2 = 11.0485f, y2 = 8.05695f, x3 = 10.9695f, y3 = 7.78838f)
                lineTo(x = 9.71952f, y = 3.53838f)
                curveTo(x1 = 9.62565f, y1 = 3.21919f, x2 = 9.33271f, y2 = 3.0f, x3 = 9.0f, y3 = 3.0f)
                horizontalLineTo(x = 3.75188f)
                close()
            }
        }.build().also { _call = it }
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
                imageVector = Call,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _call: ImageVector? = null
