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

val Carussel: ImageVector
    get() {
        val current = _carussel
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Carussel",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 5.75f, y = 3.75f)
                    curveTo(x1 = 5.75f, y1 = 3.33579f, x2 = 6.08579f, y2 = 3.0f, x3 = 6.5f, y3 = 3.0f)
                    horizontalLineTo(x = 17.5f)
                    curveTo(x1 = 17.9142f, y1 = 3.0f, x2 = 18.25f, y2 = 3.33579f, x3 = 18.25f, y3 = 3.75f)
                    verticalLineTo(y = 5.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.6642f, y1 = 5.0f, x2 = 22.0f, y2 = 5.33579f, x3 = 22.0f, y3 = 5.75f)
                    verticalLineTo(y = 18.25f)
                    curveTo(x1 = 22.0f, y1 = 18.6642f, x2 = 21.6642f, y2 = 19.0f, x3 = 21.25f, y3 = 19.0f)
                    horizontalLineTo(x = 18.25f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 18.25f, y1 = 20.6642f, x2 = 17.9142f, y2 = 21.0f, x3 = 17.5f, y3 = 21.0f)
                    horizontalLineTo(x = 6.5f)
                    curveTo(x1 = 6.08579f, y1 = 21.0f, x2 = 5.75f, y2 = 20.6642f, x3 = 5.75f, y3 = 20.25f)
                    verticalLineTo(y = 19.0f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(x1 = 2.33579f, y1 = 19.0f, x2 = 2.0f, y2 = 18.6642f, x3 = 2.0f, y3 = 18.25f)
                    verticalLineTo(y = 5.75f)
                    curveTo(x1 = 2.0f, y1 = 5.33579f, x2 = 2.33579f, y2 = 5.0f, x3 = 2.75f, y3 = 5.0f)
                    horizontalLineTo(x = 5.75f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 5.75f, y = 6.5f)
                    horizontalLineTo(x = 3.5f)
                    verticalLineTo(y = 17.5f)
                    horizontalLineTo(x = 5.75f)
                    verticalLineTo(y = 6.5f)
                    close()
                    moveTo(x = 18.25f, y = 17.5f)
                    horizontalLineTo(x = 20.5f)
                    verticalLineTo(y = 6.5f)
                    horizontalLineTo(x = 18.25f)
                    verticalLineTo(y = 17.5f)
                    close()
                }
            }.build()
            .also { _carussel = it }
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
                imageVector = Carussel,
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
private var _carussel: ImageVector? = null
