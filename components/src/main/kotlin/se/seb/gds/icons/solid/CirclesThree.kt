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

val CirclesThree: ImageVector
    get() {
        val current = _circlesThree
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CirclesThree",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 22.0f, y = 14.0f)
                    curveTo(x1 = 22.0f, y1 = 17.866f, x2 = 18.866f, y2 = 21.0f, x3 = 15.0f, y3 = 21.0f)
                    curveTo(x1 = 11.134f, y1 = 21.0f, x2 = 8.0f, y2 = 17.866f, x3 = 8.0f, y3 = 14.0f)
                    curveTo(x1 = 8.0f, y1 = 10.134f, x2 = 11.134f, y2 = 7.0f, x3 = 15.0f, y3 = 7.0f)
                    curveTo(x1 = 18.866f, y1 = 7.0f, x2 = 22.0f, y2 = 10.134f, x3 = 22.0f, y3 = 14.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 14.3807f, y = 5.52222f)
                    curveTo(x1 = 9.9754f, y1 = 5.83942f, x2 = 6.5f, y2 = 9.51385f, x3 = 6.5f, y3 = 14.0f)
                    curveTo(x1 = 6.5f, y1 = 14.9402f, x2 = 6.65266f, y2 = 15.8448f, x3 = 6.93455f, y3 = 16.6903f)
                    curveTo(x1 = 4.07675f, y1 = 15.809f, x2 = 2.0f, y2 = 13.147f, x3 = 2.0f, y3 = 10.0f)
                    curveTo(x1 = 2.0f, y1 = 6.13401f, x2 = 5.13401f, y2 = 3.0f, x3 = 9.0f, y3 = 3.0f)
                    curveTo(x1 = 11.1629f, y1 = 3.0f, x2 = 13.0967f, y2 = 3.98095f, x3 = 14.3807f, y3 = 5.52222f)
                    close()
                }
            }.build()
            .also { _circlesThree = it }
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
                imageVector = CirclesThree,
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
private var _circlesThree: ImageVector? = null
