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

val HomeRoof: ImageVector
    get() {
        val current = _homeRoof
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.HomeRoof",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.4366f, y = 1.89017f)
                    curveTo(x1 = 12.1756f, y1 = 1.70328f, x2 = 11.8245f, y2 = 1.70328f, x3 = 11.5635f, y3 = 1.89017f)
                    lineTo(x = 2.06347f, y = 8.69136f)
                    curveTo(x1 = 1.72667f, y1 = 8.93248f, x2 = 1.64911f, y2 = 9.40098f, x3 = 1.89023f, y3 = 9.73778f)
                    curveTo(x1 = 2.13135f, y1 = 10.0746f, x2 = 2.59984f, y2 = 10.1521f, x3 = 2.93664f, y3 = 9.91102f)
                    lineTo(x = 4.00003f, y = 9.14973f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 4.00003f, y1 = 20.6642f, x2 = 4.33582f, y2 = 21.0f, x3 = 4.75003f, y3 = 21.0f)
                    horizontalLineTo(x = 19.25f)
                    curveTo(x1 = 19.6642f, y1 = 21.0f, x2 = 20.0f, y2 = 20.6642f, x3 = 20.0f, y3 = 20.25f)
                    verticalLineTo(y = 9.14971f)
                    lineTo(x = 21.0634f, y = 9.91102f)
                    curveTo(x1 = 21.4002f, y1 = 10.1521f, x2 = 21.8687f, y2 = 10.0746f, x3 = 22.1099f, y3 = 9.73778f)
                    curveTo(x1 = 22.351f, y1 = 9.40098f, x2 = 22.2734f, y2 = 8.93248f, x3 = 21.9366f, y3 = 8.69136f)
                    lineTo(x = 12.4366f, y = 1.89017f)
                    close()
                }
            }.build()
            .also { _homeRoof = it }
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
                imageVector = HomeRoof,
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
private var _homeRoof: ImageVector? = null
