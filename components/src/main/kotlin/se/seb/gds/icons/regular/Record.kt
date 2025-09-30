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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Record: ImageVector
    get() {
        val current = _record
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Record",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 12.0f, y = 3.5f)
                    curveTo(x1 = 7.30558f, y1 = 3.5f, x2 = 3.5f, y2 = 7.30558f, x3 = 3.5f, y3 = 12.0f)
                    curveTo(x1 = 3.5f, y1 = 16.6944f, x2 = 7.30558f, y2 = 20.5f, x3 = 12.0f, y3 = 20.5f)
                    curveTo(x1 = 16.6944f, y1 = 20.5f, x2 = 20.5f, y2 = 16.6944f, x3 = 20.5f, y3 = 12.0f)
                    curveTo(x1 = 20.5f, y1 = 7.30558f, x2 = 16.6944f, y2 = 3.5f, x3 = 12.0f, y3 = 3.5f)
                    close()
                    moveTo(x = 2.0f, y = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 6.47715f, x2 = 6.47715f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    curveTo(x1 = 17.5228f, y1 = 2.0f, x2 = 22.0f, y2 = 6.47715f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 17.5228f, x2 = 17.5228f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    curveTo(x1 = 6.47715f, y1 = 22.0f, x2 = 2.0f, y2 = 17.5228f, x3 = 2.0f, y3 = 12.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 16.0f, y = 12.0f)
                    curveTo(x1 = 16.0f, y1 = 14.2091f, x2 = 14.2091f, y2 = 16.0f, x3 = 12.0f, y3 = 16.0f)
                    curveTo(x1 = 9.79086f, y1 = 16.0f, x2 = 8.0f, y2 = 14.2091f, x3 = 8.0f, y3 = 12.0f)
                    curveTo(x1 = 8.0f, y1 = 9.79086f, x2 = 9.79086f, y2 = 8.0f, x3 = 12.0f, y3 = 8.0f)
                    curveTo(x1 = 14.2091f, y1 = 8.0f, x2 = 16.0f, y2 = 9.79086f, x3 = 16.0f, y3 = 12.0f)
                    close()
                }
            }.build()
            .also { _record = it }
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
                imageVector = Record,
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
private var _record: ImageVector? = null
