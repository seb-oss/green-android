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

val TrashCan: ImageVector
    get() {
        val current = _trashCan
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.TrashCan",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 8.32501f, y = 5.0f)
                    curveTo(
                        x1 = 8.67247f,
                        y1 = 3.28832f,
                        x2 = 10.1858f,
                        y2 = 2.0f,
                        x3 = 12.0f,
                        y3 = 2.0f,
                    )
                    curveTo(
                        x1 = 13.8142f,
                        y1 = 2.0f,
                        x2 = 15.3275f,
                        y2 = 3.28832f,
                        x3 = 15.675f,
                        y3 = 5.0f,
                    )
                    horizontalLineTo(x = 20.25f)
                    curveTo(
                        x1 = 20.6642f,
                        y1 = 5.0f,
                        x2 = 21.0f,
                        y2 = 5.33579f,
                        x3 = 21.0f,
                        y3 = 5.75f,
                    )
                    curveTo(
                        x1 = 21.0f,
                        y1 = 6.16421f,
                        x2 = 20.6642f,
                        y2 = 6.5f,
                        x3 = 20.25f,
                        y3 = 6.5f,
                    )
                    horizontalLineTo(x = 19.0f)
                    verticalLineTo(y = 21.25f)
                    curveTo(
                        x1 = 19.0f,
                        y1 = 21.6642f,
                        x2 = 18.6642f,
                        y2 = 22.0f,
                        x3 = 18.25f,
                        y3 = 22.0f,
                    )
                    horizontalLineTo(x = 5.75f)
                    curveTo(
                        x1 = 5.33579f,
                        y1 = 22.0f,
                        x2 = 5.0f,
                        y2 = 21.6642f,
                        x3 = 5.0f,
                        y3 = 21.25f,
                    )
                    verticalLineTo(y = 6.5f)
                    horizontalLineTo(x = 3.75f)
                    curveTo(
                        x1 = 3.33579f,
                        y1 = 6.5f,
                        x2 = 3.0f,
                        y2 = 6.16421f,
                        x3 = 3.0f,
                        y3 = 5.75f,
                    )
                    curveTo(
                        x1 = 3.0f,
                        y1 = 5.33579f,
                        x2 = 3.33579f,
                        y2 = 5.0f,
                        x3 = 3.75f,
                        y3 = 5.0f,
                    )
                    horizontalLineTo(x = 8.32501f)
                    close()
                    moveTo(x = 9.87803f, y = 5.0f)
                    curveTo(
                        x1 = 10.1869f,
                        y1 = 4.12611f,
                        x2 = 11.0203f,
                        y2 = 3.5f,
                        x3 = 12.0f,
                        y3 = 3.5f,
                    )
                    curveTo(
                        x1 = 12.9797f,
                        y1 = 3.5f,
                        x2 = 13.8131f,
                        y2 = 4.12611f,
                        x3 = 14.122f,
                        y3 = 5.0f,
                    )
                    horizontalLineTo(x = 9.87803f)
                    close()
                    moveTo(x = 10.0f, y = 10.0f)
                    curveTo(
                        x1 = 10.4142f,
                        y1 = 10.0f,
                        x2 = 10.75f,
                        y2 = 10.3358f,
                        x3 = 10.75f,
                        y3 = 10.75f,
                    )
                    verticalLineTo(y = 16.25f)
                    curveTo(
                        x1 = 10.75f,
                        y1 = 16.6642f,
                        x2 = 10.4142f,
                        y2 = 17.0f,
                        x3 = 10.0f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 9.58579f,
                        y1 = 17.0f,
                        x2 = 9.25f,
                        y2 = 16.6642f,
                        x3 = 9.25f,
                        y3 = 16.25f,
                    )
                    verticalLineTo(y = 10.75f)
                    curveTo(
                        x1 = 9.25f,
                        y1 = 10.3358f,
                        x2 = 9.58579f,
                        y2 = 10.0f,
                        x3 = 10.0f,
                        y3 = 10.0f,
                    )
                    close()
                    moveTo(x = 14.0f, y = 10.0f)
                    curveTo(
                        x1 = 14.4142f,
                        y1 = 10.0f,
                        x2 = 14.75f,
                        y2 = 10.3358f,
                        x3 = 14.75f,
                        y3 = 10.75f,
                    )
                    verticalLineTo(y = 16.25f)
                    curveTo(
                        x1 = 14.75f,
                        y1 = 16.6642f,
                        x2 = 14.4142f,
                        y2 = 17.0f,
                        x3 = 14.0f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 13.5858f,
                        y1 = 17.0f,
                        x2 = 13.25f,
                        y2 = 16.6642f,
                        x3 = 13.25f,
                        y3 = 16.25f,
                    )
                    verticalLineTo(y = 10.75f)
                    curveTo(
                        x1 = 13.25f,
                        y1 = 10.3358f,
                        x2 = 13.5858f,
                        y2 = 10.0f,
                        x3 = 14.0f,
                        y3 = 10.0f,
                    )
                    close()
                }
            }.build()
            .also { _trashCan = it }
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
                imageVector = TrashCan,
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
private var _trashCan: ImageVector? = null
