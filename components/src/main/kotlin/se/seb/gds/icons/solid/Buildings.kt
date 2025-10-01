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

val Buildings: ImageVector
    get() {
        val current = _buildings
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Buildings",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 3.0f, y = 3.75f)
                    curveTo(
                        x1 = 3.0f,
                        y1 = 3.33579f,
                        x2 = 3.33579f,
                        y2 = 3.0f,
                        x3 = 3.75f,
                        y3 = 3.0f,
                    )
                    horizontalLineTo(x = 14.25f)
                    curveTo(
                        x1 = 14.6642f,
                        y1 = 3.0f,
                        x2 = 15.0f,
                        y2 = 3.33579f,
                        x3 = 15.0f,
                        y3 = 3.75f,
                    )
                    verticalLineTo(y = 7.25f)
                    horizontalLineTo(x = 20.25f)
                    curveTo(
                        x1 = 20.6642f,
                        y1 = 7.25f,
                        x2 = 21.0f,
                        y2 = 7.58579f,
                        x3 = 21.0f,
                        y3 = 8.0f,
                    )
                    verticalLineTo(y = 18.5f)
                    horizontalLineTo(x = 22.25f)
                    curveTo(
                        x1 = 22.6642f,
                        y1 = 18.5f,
                        x2 = 23.0f,
                        y2 = 18.8358f,
                        x3 = 23.0f,
                        y3 = 19.25f,
                    )
                    curveTo(
                        x1 = 23.0f,
                        y1 = 19.6642f,
                        x2 = 22.6642f,
                        y2 = 20.0f,
                        x3 = 22.25f,
                        y3 = 20.0f,
                    )
                    horizontalLineTo(x = 1.75f)
                    curveTo(
                        x1 = 1.33579f,
                        y1 = 20.0f,
                        x2 = 1.0f,
                        y2 = 19.6642f,
                        x3 = 1.0f,
                        y3 = 19.25f,
                    )
                    curveTo(
                        x1 = 1.0f,
                        y1 = 18.8358f,
                        x2 = 1.33579f,
                        y2 = 18.5f,
                        x3 = 1.75f,
                        y3 = 18.5f,
                    )
                    horizontalLineTo(x = 3.0f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 15.0f, y = 18.5f)
                    horizontalLineTo(x = 19.5f)
                    verticalLineTo(y = 8.75f)
                    horizontalLineTo(x = 15.0f)
                    verticalLineTo(y = 18.5f)
                    close()
                    moveTo(x = 7.0f, y = 8.75f)
                    curveTo(
                        x1 = 7.0f,
                        y1 = 8.33579f,
                        x2 = 7.33579f,
                        y2 = 8.0f,
                        x3 = 7.75f,
                        y3 = 8.0f,
                    )
                    horizontalLineTo(x = 10.25f)
                    curveTo(
                        x1 = 10.6642f,
                        y1 = 8.0f,
                        x2 = 11.0f,
                        y2 = 8.33579f,
                        x3 = 11.0f,
                        y3 = 8.75f,
                    )
                    curveTo(
                        x1 = 11.0f,
                        y1 = 9.16421f,
                        x2 = 10.6642f,
                        y2 = 9.5f,
                        x3 = 10.25f,
                        y3 = 9.5f,
                    )
                    horizontalLineTo(x = 7.75f)
                    curveTo(
                        x1 = 7.33579f,
                        y1 = 9.5f,
                        x2 = 7.0f,
                        y2 = 9.16421f,
                        x3 = 7.0f,
                        y3 = 8.75f,
                    )
                    close()
                    moveTo(x = 7.0f, y = 12.75f)
                    curveTo(
                        x1 = 7.0f,
                        y1 = 12.3358f,
                        x2 = 7.33579f,
                        y2 = 12.0f,
                        x3 = 7.75f,
                        y3 = 12.0f,
                    )
                    horizontalLineTo(x = 10.25f)
                    curveTo(
                        x1 = 10.6642f,
                        y1 = 12.0f,
                        x2 = 11.0f,
                        y2 = 12.3358f,
                        x3 = 11.0f,
                        y3 = 12.75f,
                    )
                    curveTo(
                        x1 = 11.0f,
                        y1 = 13.1642f,
                        x2 = 10.6642f,
                        y2 = 13.5f,
                        x3 = 10.25f,
                        y3 = 13.5f,
                    )
                    horizontalLineTo(x = 7.75f)
                    curveTo(
                        x1 = 7.33579f,
                        y1 = 13.5f,
                        x2 = 7.0f,
                        y2 = 13.1642f,
                        x3 = 7.0f,
                        y3 = 12.75f,
                    )
                    close()
                }
            }.build()
            .also { _buildings = it }
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
                imageVector = Buildings,
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
private var _buildings: ImageVector? = null
