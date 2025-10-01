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

val DotGridOneHorizontal: ImageVector
    get() {
        val current = _dotGridOneHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.DotGridOneHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.75f, y = 10.25f)
                curveTo(x1 = 2.7835f, y1 = 10.25f, x2 = 2.0f, y2 = 11.0335f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 12.9665f, x2 = 2.7835f, y2 = 13.75f, x3 = 3.75f, y3 = 13.75f)
                curveTo(x1 = 4.7165f, y1 = 13.75f, x2 = 5.5f, y2 = 12.9665f, x3 = 5.5f, y3 = 12.0f)
                curveTo(x1 = 5.5f, y1 = 11.0335f, x2 = 4.7165f, y2 = 10.25f, x3 = 3.75f, y3 = 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 10.25f)
                curveTo(x1 = 11.0335f, y1 = 10.25f, x2 = 10.25f, y2 = 11.0335f, x3 = 10.25f, y3 = 12.0f)
                curveTo(x1 = 10.25f, y1 = 12.9665f, x2 = 11.0335f, y2 = 13.75f, x3 = 12.0f, y3 = 13.75f)
                curveTo(x1 = 12.9665f, y1 = 13.75f, x2 = 13.75f, y2 = 12.9665f, x3 = 13.75f, y3 = 12.0f)
                curveTo(x1 = 13.75f, y1 = 11.0335f, x2 = 12.9665f, y2 = 10.25f, x3 = 12.0f, y3 = 10.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 20.25f, y = 10.25f)
                curveTo(x1 = 19.2835f, y1 = 10.25f, x2 = 18.5f, y2 = 11.0335f, x3 = 18.5f, y3 = 12.0f)
                curveTo(x1 = 18.5f, y1 = 12.9665f, x2 = 19.2835f, y2 = 13.75f, x3 = 20.25f, y3 = 13.75f)
                curveTo(x1 = 21.2165f, y1 = 13.75f, x2 = 22.0f, y2 = 12.9665f, x3 = 22.0f, y3 = 12.0f)
                curveTo(x1 = 22.0f, y1 = 11.0335f, x2 = 21.2165f, y2 = 10.25f, x3 = 20.25f, y3 = 10.25f)
                close()
            }
        }.build().also { _dotGridOneHorizontal = it }
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
                imageVector = DotGridOneHorizontal,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _dotGridOneHorizontal: ImageVector? = null
