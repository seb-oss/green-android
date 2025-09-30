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
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Leisure: ImageVector
    get() {
        val current = _leisure
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Leisure",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 6.47715f, x2 = 6.47715f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    curveTo(x1 = 17.5228f, y1 = 2.0f, x2 = 22.0f, y2 = 6.47715f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 17.5228f, x2 = 17.5228f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    curveTo(x1 = 6.47715f, y1 = 22.0f, x2 = 2.0f, y2 = 17.5228f, x3 = 2.0f, y3 = 12.0f)
                    close()
                    moveTo(x = 8.75f, y = 10.5f)
                    curveTo(x1 = 9.44036f, y1 = 10.5f, x2 = 10.0f, y2 = 9.94036f, x3 = 10.0f, y3 = 9.25f)
                    curveTo(x1 = 10.0f, y1 = 8.55964f, x2 = 9.44036f, y2 = 8.0f, x3 = 8.75f, y3 = 8.0f)
                    curveTo(x1 = 8.05964f, y1 = 8.0f, x2 = 7.5f, y2 = 8.55964f, x3 = 7.5f, y3 = 9.25f)
                    curveTo(x1 = 7.5f, y1 = 9.94036f, x2 = 8.05964f, y2 = 10.5f, x3 = 8.75f, y3 = 10.5f)
                    close()
                    moveTo(x = 15.0f, y = 9.25f)
                    curveTo(x1 = 15.0f, y1 = 9.94036f, x2 = 14.4404f, y2 = 10.5f, x3 = 13.75f, y3 = 10.5f)
                    curveTo(x1 = 13.0596f, y1 = 10.5f, x2 = 12.5f, y2 = 9.94036f, x3 = 12.5f, y3 = 9.25f)
                    curveTo(x1 = 12.5f, y1 = 8.55964f, x2 = 13.0596f, y2 = 8.0f, x3 = 13.75f, y3 = 8.0f)
                    curveTo(x1 = 14.4404f, y1 = 8.0f, x2 = 15.0f, y2 = 8.55964f, x3 = 15.0f, y3 = 9.25f)
                    close()
                    moveTo(x = 18.1915f, y = 12.8575f)
                    curveTo(x1 = 18.2479f, y1 = 12.4471f, x2 = 17.9609f, y2 = 12.0688f, x3 = 17.5505f, y3 = 12.0124f)
                    curveTo(x1 = 17.1402f, y1 = 11.956f, x2 = 16.7618f, y2 = 12.243f, x3 = 16.7055f, y3 = 12.6534f)
                    curveTo(x1 = 16.4168f, y1 = 14.7547f, x2 = 14.7511f, y2 = 16.4193f, x3 = 12.6492f, y3 = 16.7061f)
                    curveTo(x1 = 12.2388f, y1 = 16.7621f, x2 = 11.9515f, y2 = 17.1402f, x3 = 12.0075f, y3 = 17.5506f)
                    curveTo(x1 = 12.0635f, y1 = 17.961f, x2 = 12.4416f, y2 = 18.2483f, x3 = 12.852f, y3 = 18.1923f)
                    curveTo(x1 = 15.6209f, y1 = 17.8144f, x2 = 17.8113f, y2 = 15.6257f, x3 = 18.1915f, y3 = 12.8575f)
                    close()
                }
            }.build()
            .also { _leisure = it }
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
                imageVector = Leisure,
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
private var _leisure: ImageVector? = null
