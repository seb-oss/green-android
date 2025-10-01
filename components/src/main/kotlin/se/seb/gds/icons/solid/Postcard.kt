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

val Postcard: ImageVector
    get() {
        val current = _postcard
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Postcard",
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
                    verticalLineTo(y = 19.25f)
                    curveTo(
                        x1 = 22.0f,
                        y1 = 19.6642f,
                        x2 = 21.6642f,
                        y2 = 20.0f,
                        x3 = 21.25f,
                        y3 = 20.0f,
                    )
                    horizontalLineTo(x = 2.75f)
                    curveTo(
                        x1 = 2.33579f,
                        y1 = 20.0f,
                        x2 = 2.0f,
                        y2 = 19.6642f,
                        x3 = 2.0f,
                        y3 = 19.25f,
                    )
                    verticalLineTo(y = 4.75f)
                    close()
                    moveTo(x = 6.0f, y = 9.75f)
                    curveTo(
                        x1 = 6.0f,
                        y1 = 9.33579f,
                        x2 = 6.33579f,
                        y2 = 9.0f,
                        x3 = 6.75f,
                        y3 = 9.0f,
                    )
                    horizontalLineTo(x = 11.25f)
                    curveTo(
                        x1 = 11.6642f,
                        y1 = 9.0f,
                        x2 = 12.0f,
                        y2 = 9.33579f,
                        x3 = 12.0f,
                        y3 = 9.75f,
                    )
                    curveTo(
                        x1 = 12.0f,
                        y1 = 10.1642f,
                        x2 = 11.6642f,
                        y2 = 10.5f,
                        x3 = 11.25f,
                        y3 = 10.5f,
                    )
                    horizontalLineTo(x = 6.75f)
                    curveTo(
                        x1 = 6.33579f,
                        y1 = 10.5f,
                        x2 = 6.0f,
                        y2 = 10.1642f,
                        x3 = 6.0f,
                        y3 = 9.75f,
                    )
                    close()
                    moveTo(x = 14.0f, y = 9.75f)
                    curveTo(
                        x1 = 14.0f,
                        y1 = 9.33579f,
                        x2 = 14.3358f,
                        y2 = 9.0f,
                        x3 = 14.75f,
                        y3 = 9.0f,
                    )
                    horizontalLineTo(x = 17.25f)
                    curveTo(
                        x1 = 17.6642f,
                        y1 = 9.0f,
                        x2 = 18.0f,
                        y2 = 9.33579f,
                        x3 = 18.0f,
                        y3 = 9.75f,
                    )
                    verticalLineTo(y = 13.25f)
                    curveTo(
                        x1 = 18.0f,
                        y1 = 13.6642f,
                        x2 = 17.6642f,
                        y2 = 14.0f,
                        x3 = 17.25f,
                        y3 = 14.0f,
                    )
                    horizontalLineTo(x = 14.75f)
                    curveTo(
                        x1 = 14.3358f,
                        y1 = 14.0f,
                        x2 = 14.0f,
                        y2 = 13.6642f,
                        x3 = 14.0f,
                        y3 = 13.25f,
                    )
                    verticalLineTo(y = 9.75f)
                    close()
                    moveTo(x = 6.0f, y = 12.75f)
                    curveTo(
                        x1 = 6.0f,
                        y1 = 12.3358f,
                        x2 = 6.33579f,
                        y2 = 12.0f,
                        x3 = 6.75f,
                        y3 = 12.0f,
                    )
                    horizontalLineTo(x = 9.27f)
                    curveTo(
                        x1 = 9.68421f,
                        y1 = 12.0f,
                        x2 = 10.02f,
                        y2 = 12.3358f,
                        x3 = 10.02f,
                        y3 = 12.75f,
                    )
                    curveTo(
                        x1 = 10.02f,
                        y1 = 13.1642f,
                        x2 = 9.68422f,
                        y2 = 13.5f,
                        x3 = 9.27f,
                        y3 = 13.5f,
                    )
                    horizontalLineTo(x = 6.75f)
                    curveTo(
                        x1 = 6.33579f,
                        y1 = 13.5f,
                        x2 = 6.0f,
                        y2 = 13.1642f,
                        x3 = 6.0f,
                        y3 = 12.75f,
                    )
                    close()
                }
            }.build()
            .also { _postcard = it }
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
                imageVector = Postcard,
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
private var _postcard: ImageVector? = null
