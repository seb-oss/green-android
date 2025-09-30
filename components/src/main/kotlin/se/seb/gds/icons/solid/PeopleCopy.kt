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

val PeopleCopy: ImageVector
    get() {
        val current = _peopleCopy
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PeopleCopy",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.75f, y = 2.0f)
                    curveTo(x1 = 2.33579f, y1 = 2.0f, x2 = 2.0f, y2 = 2.33579f, x3 = 2.0f, y3 = 2.75f)
                    verticalLineTo(y = 17.25f)
                    curveTo(x1 = 2.0f, y1 = 17.6642f, x2 = 2.33579f, y2 = 18.0f, x3 = 2.75f, y3 = 18.0f)
                    horizontalLineTo(x = 6.0f)
                    verticalLineTo(y = 21.25f)
                    curveTo(x1 = 6.0f, y1 = 21.6642f, x2 = 6.33579f, y2 = 22.0f, x3 = 6.75f, y3 = 22.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 22.0f, x2 = 22.0f, y2 = 21.6642f, x3 = 22.0f, y3 = 21.25f)
                    verticalLineTo(y = 6.75f)
                    curveTo(x1 = 22.0f, y1 = 6.33579f, x2 = 21.6642f, y2 = 6.0f, x3 = 21.25f, y3 = 6.0f)
                    horizontalLineTo(x = 18.0f)
                    verticalLineTo(y = 2.75f)
                    curveTo(x1 = 18.0f, y1 = 2.33579f, x2 = 17.6642f, y2 = 2.0f, x3 = 17.25f, y3 = 2.0f)
                    horizontalLineTo(x = 2.75f)
                    close()
                    moveTo(x = 6.75f, y = 6.0f)
                    horizontalLineTo(x = 16.5f)
                    verticalLineTo(y = 3.5f)
                    horizontalLineTo(x = 3.5f)
                    verticalLineTo(y = 16.5f)
                    horizontalLineTo(x = 6.0f)
                    verticalLineTo(y = 6.75f)
                    curveTo(x1 = 6.0f, y1 = 6.33579f, x2 = 6.33579f, y2 = 6.0f, x3 = 6.75f, y3 = 6.0f)
                    close()
                    moveTo(x = 14.0f, y = 16.5f)
                    curveTo(x1 = 11.8261f, y1 = 16.5f, x2 = 9.95493f, y2 = 18.0081f, x3 = 9.11653f, y3 = 20.1744f)
                    curveTo(x1 = 9.05507f, y1 = 20.3332f, x2 = 9.17533f, y2 = 20.5f, x3 = 9.34561f, y3 = 20.5f)
                    horizontalLineTo(x = 18.6544f)
                    curveTo(x1 = 18.8247f, y1 = 20.5f, x2 = 18.9449f, y2 = 20.3332f, x3 = 18.8835f, y3 = 20.1744f)
                    curveTo(x1 = 18.0451f, y1 = 18.0081f, x2 = 16.1738f, y2 = 16.5f, x3 = 14.0f, y3 = 16.5f)
                    close()
                    moveTo(x = 14.0f, y = 15.0f)
                    curveTo(x1 = 15.3807f, y1 = 15.0f, x2 = 16.5f, y2 = 13.8807f, x3 = 16.5f, y3 = 12.5f)
                    curveTo(x1 = 16.5f, y1 = 11.1193f, x2 = 15.3807f, y2 = 10.0f, x3 = 14.0f, y3 = 10.0f)
                    curveTo(x1 = 12.6193f, y1 = 10.0f, x2 = 11.5f, y2 = 11.1193f, x3 = 11.5f, y3 = 12.5f)
                    curveTo(x1 = 11.5f, y1 = 13.8807f, x2 = 12.6193f, y2 = 15.0f, x3 = 14.0f, y3 = 15.0f)
                    close()
                }
            }.build()
            .also { _peopleCopy = it }
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
                imageVector = PeopleCopy,
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
private var _peopleCopy: ImageVector? = null
