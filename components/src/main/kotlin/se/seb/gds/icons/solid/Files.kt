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

val Files: ImageVector
    get() {
        val current = _files
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Files",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 7.75f, y = 2.0f)
                    curveTo(
                        x1 = 7.33579f,
                        y1 = 2.0f,
                        x2 = 7.0f,
                        y2 = 2.33579f,
                        x3 = 7.0f,
                        y3 = 2.75f,
                    )
                    verticalLineTo(y = 5.0f)
                    horizontalLineTo(x = 4.75f)
                    curveTo(
                        x1 = 4.33579f,
                        y1 = 5.0f,
                        x2 = 4.0f,
                        y2 = 5.33579f,
                        x3 = 4.0f,
                        y3 = 5.75f,
                    )
                    verticalLineTo(y = 21.25f)
                    curveTo(
                        x1 = 4.0f,
                        y1 = 21.6642f,
                        x2 = 4.33579f,
                        y2 = 22.0f,
                        x3 = 4.75f,
                        y3 = 22.0f,
                    )
                    horizontalLineTo(x = 17.25f)
                    curveTo(
                        x1 = 17.6642f,
                        y1 = 22.0f,
                        x2 = 18.0f,
                        y2 = 21.6642f,
                        x3 = 18.0f,
                        y3 = 21.25f,
                    )
                    verticalLineTo(y = 19.0f)
                    horizontalLineTo(x = 20.25f)
                    curveTo(
                        x1 = 20.6642f,
                        y1 = 19.0f,
                        x2 = 21.0f,
                        y2 = 18.6642f,
                        x3 = 21.0f,
                        y3 = 18.25f,
                    )
                    verticalLineTo(y = 8.5f)
                    horizontalLineTo(x = 15.25f)
                    curveTo(
                        x1 = 14.8358f,
                        y1 = 8.5f,
                        x2 = 14.5f,
                        y2 = 8.16421f,
                        x3 = 14.5f,
                        y3 = 7.75f,
                    )
                    verticalLineTo(y = 2.0f)
                    horizontalLineTo(x = 7.75f)
                    close()
                    moveTo(x = 16.5f, y = 19.0f)
                    horizontalLineTo(x = 7.75f)
                    curveTo(
                        x1 = 7.33579f,
                        y1 = 19.0f,
                        x2 = 7.0f,
                        y2 = 18.6642f,
                        x3 = 7.0f,
                        y3 = 18.25f,
                    )
                    verticalLineTo(y = 6.5f)
                    horizontalLineTo(x = 5.5f)
                    verticalLineTo(y = 20.5f)
                    horizontalLineTo(x = 16.5f)
                    verticalLineTo(y = 19.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 16.0f, y = 2.43934f)
                    lineTo(x = 20.5607f, y = 7.0f)
                    horizontalLineTo(x = 16.0f)
                    verticalLineTo(y = 2.43934f)
                    close()
                }
            }.build()
            .also { _files = it }
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
                imageVector = Files,
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
private var _files: ImageVector? = null
