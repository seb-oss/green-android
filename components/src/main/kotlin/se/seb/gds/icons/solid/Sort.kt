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

val Sort: ImageVector
    get() {
        val current = _sort
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Sort",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 4.75f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 4.33579f,
                        x2 = 2.33579f,
                        y2 = 4.0f,
                        x3 = 2.75f,
                        y3 = 4.0f,
                    )
                    horizontalLineTo(x = 21.25f)
                    curveTo(
                        x1 = 21.6642f,
                        y1 = 4.0f,
                        x2 = 22.0f,
                        y2 = 4.33579f,
                        x3 = 22.0f,
                        y3 = 4.75f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 5.16421f,
                        x2 = 21.6642f,
                        y2 = 5.5f,
                        x3 = 21.25f,
                        y3 = 5.5f,
                    )
                    horizontalLineTo(x = 2.75f)
                    curveTo(
                        x1 = 2.33579f,
                        y1 = 5.5f,
                        x2 = 2.0f,
                        y2 = 5.16421f,
                        x3 = 2.0f,
                        y3 = 4.75f,
                    )
                    close()
                    moveTo(x = 5.0f, y = 12.0f)
                    curveTo(
                        x1 = 5.0f,
                        y1 = 11.5858f,
                        x2 = 5.33579f,
                        y2 = 11.25f,
                        x3 = 5.75f,
                        y3 = 11.25f,
                    )
                    horizontalLineTo(x = 18.25f)
                    curveTo(
                        x1 = 18.6642f,
                        y1 = 11.25f,
                        x2 = 19.0f,
                        y2 = 11.5858f,
                        x3 = 19.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 19.0f,
                        y1 = 12.4142f,
                        x2 = 18.6642f,
                        y2 = 12.75f,
                        x3 = 18.25f,
                        y3 = 12.75f,
                    )
                    horizontalLineTo(x = 5.75f)
                    curveTo(
                        x1 = 5.33579f,
                        y1 = 12.75f,
                        x2 = 5.0f,
                        y2 = 12.4142f,
                        x3 = 5.0f,
                        y3 = 12.0f,
                    )
                    close()
                    moveTo(x = 8.0f, y = 19.25f)
                    curveTo(
                        x1 = 8.0f,
                        y1 = 18.8358f,
                        x2 = 8.33579f,
                        y2 = 18.5f,
                        x3 = 8.75f,
                        y3 = 18.5f,
                    )
                    horizontalLineTo(x = 15.25f)
                    curveTo(
                        x1 = 15.6642f,
                        y1 = 18.5f,
                        x2 = 16.0f,
                        y2 = 18.8358f,
                        x3 = 16.0f,
                        y3 = 19.25f,
                    )
                    curveTo(
                        x1 = 16.0f,
                        y1 = 19.6642f,
                        x2 = 15.6642f,
                        y2 = 20.0f,
                        x3 = 15.25f,
                        y3 = 20.0f,
                    )
                    horizontalLineTo(x = 8.75f)
                    curveTo(
                        x1 = 8.33579f,
                        y1 = 20.0f,
                        x2 = 8.0f,
                        y2 = 19.6642f,
                        x3 = 8.0f,
                        y3 = 19.25f,
                    )
                    close()
                }
            }.build()
            .also { _sort = it }
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
                imageVector = Sort,
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
private var _sort: ImageVector? = null
