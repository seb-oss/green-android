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
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val RunShortcut: ImageVector
    get() {
        val current = _runShortcut
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.RunShortcut",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            group(
                clipPathData = PathData {
                    // M 0 0
                    moveTo(x = 0.0f, y = 0.0f)
                    // h 24
                    horizontalLineToRelative(dx = 24.0f)
                    // v 24
                    verticalLineToRelative(dy = 24.0f)
                    // h -24z
                    horizontalLineToRelative(dx = -24.0f)
                    close()
                },
            ) {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 3.0f, y = 3.75f)
                    curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                    horizontalLineTo(x = 20.25f)
                    curveTo(x1 = 20.6642f, y1 = 3.0f, x2 = 21.0f, y2 = 3.33579f, x3 = 21.0f, y3 = 3.75f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 21.0f, y1 = 20.6642f, x2 = 20.6642f, y2 = 21.0f, x3 = 20.25f, y3 = 21.0f)
                    horizontalLineTo(x = 3.75f)
                    curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 14.5711f, y = 6.5722f)
                    curveTo(x1 = 14.9454f, y1 = 6.74952f, x2 = 15.1051f, y2 = 7.19672f, x3 = 14.9278f, y3 = 7.57106f)
                    lineTo(x = 10.4278f, y = 17.0711f)
                    curveTo(x1 = 10.2505f, y1 = 17.4454f, x2 = 9.80328f, y2 = 17.6051f, x3 = 9.42894f, y3 = 17.4278f)
                    curveTo(x1 = 9.05459f, y1 = 17.2505f, x2 = 8.89488f, y2 = 16.8033f, x3 = 9.0722f, y3 = 16.4289f)
                    lineTo(x = 13.5722f, y = 6.92894f)
                    curveTo(x1 = 13.7495f, y1 = 6.55459f, x2 = 14.1967f, y2 = 6.39488f, x3 = 14.5711f, y3 = 6.5722f)
                    close()
                }
            }
        }.build().also { _runShortcut = it }
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
                imageVector = RunShortcut,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _runShortcut: ImageVector? = null
