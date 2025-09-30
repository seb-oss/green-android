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

val Tennis: ImageVector
    get() {
        val current = _tennis
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Tennis",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 6.0f, y = 4.9597f)
                    curveTo(x1 = 7.98887f, y1 = 6.65632f, x2 = 9.25f, y2 = 9.18088f, x3 = 9.25f, y3 = 12.0f)
                    curveTo(x1 = 9.25f, y1 = 14.8191f, x2 = 7.98887f, y2 = 17.3437f, x3 = 6.0f, y3 = 19.0403f)
                    moveTo(x = 6.0f, y = 4.9597f)
                    curveTo(x1 = 4.01113f, y1 = 6.65632f, x2 = 2.75f, y2 = 9.18088f, x3 = 2.75f, y3 = 12.0f)
                    curveTo(x1 = 2.75f, y1 = 14.8191f, x2 = 4.01113f, y2 = 17.3437f, x3 = 6.0f, y3 = 19.0403f)
                    moveTo(x = 6.0f, y = 4.9597f)
                    curveTo(x1 = 7.61524f, y1 = 3.58181f, x2 = 9.71048f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                    curveTo(x1 = 14.2895f, y1 = 2.75f, x2 = 16.3848f, y2 = 3.58181f, x3 = 18.0f, y3 = 4.9597f)
                    moveTo(x = 6.0f, y = 19.0403f)
                    curveTo(x1 = 7.61524f, y1 = 20.4182f, x2 = 9.71048f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                    curveTo(x1 = 14.2895f, y1 = 21.25f, x2 = 16.3848f, y2 = 20.4182f, x3 = 18.0f, y3 = 19.0403f)
                    moveTo(x = 18.0f, y = 4.9597f)
                    curveTo(x1 = 16.0111f, y1 = 6.65632f, x2 = 14.75f, y2 = 9.18088f, x3 = 14.75f, y3 = 12.0f)
                    curveTo(x1 = 14.75f, y1 = 14.8191f, x2 = 16.0111f, y2 = 17.3437f, x3 = 18.0f, y3 = 19.0403f)
                    moveTo(x = 18.0f, y = 4.9597f)
                    curveTo(x1 = 19.9889f, y1 = 6.65632f, x2 = 21.25f, y2 = 9.18088f, x3 = 21.25f, y3 = 12.0f)
                    curveTo(x1 = 21.25f, y1 = 14.8191f, x2 = 19.9889f, y2 = 17.3437f, x3 = 18.0f, y3 = 19.0403f)
                }
            }.build()
            .also { _tennis = it }
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
                imageVector = Tennis,
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
private var _tennis: ImageVector? = null
