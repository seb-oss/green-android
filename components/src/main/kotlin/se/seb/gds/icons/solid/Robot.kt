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

val Robot: ImageVector
    get() {
        val current = _robot
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Robot",
            defaultWidth = 25.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 25.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 1.0f)
                curveTo(x1 = 12.4142f, y1 = 1.0f, x2 = 12.75f, y2 = 1.33579f, x3 = 12.75f, y3 = 1.75f)
                verticalLineTo(y = 3.0f)
                horizontalLineTo(x = 19.2188f)
                curveTo(x1 = 19.633f, y1 = 3.0f, x2 = 19.9688f, y2 = 3.33579f, x3 = 19.9688f, y3 = 3.75f)
                verticalLineTo(y = 13.25f)
                curveTo(x1 = 19.9688f, y1 = 13.6642f, x2 = 19.633f, y2 = 14.0f, x3 = 19.2188f, y3 = 14.0f)
                horizontalLineTo(x = 19.0607f)
                lineTo(x = 20.7803f, y = 15.7197f)
                curveTo(x1 = 21.0732f, y1 = 16.0126f, x2 = 21.0732f, y2 = 16.4874f, x3 = 20.7803f, y3 = 16.7803f)
                curveTo(x1 = 20.4874f, y1 = 17.0732f, x2 = 20.0126f, y2 = 17.0732f, x3 = 19.7197f, y3 = 16.7803f)
                lineTo(x = 18.9304f, y = 15.991f)
                curveTo(x1 = 18.449f, y1 = 19.3877f, x2 = 15.5296f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 8.47043f, y1 = 22.0f, x2 = 5.55099f, y2 = 19.3877f, x3 = 5.06961f, y3 = 15.991f)
                lineTo(x = 4.28033f, y = 16.7803f)
                curveTo(x1 = 3.98744f, y1 = 17.0732f, x2 = 3.51256f, y2 = 17.0732f, x3 = 3.21967f, y3 = 16.7803f)
                curveTo(x1 = 2.92678f, y1 = 16.4874f, x2 = 2.92678f, y2 = 16.0126f, x3 = 3.21967f, y3 = 15.7197f)
                lineTo(x = 4.93934f, y = 14.0f)
                horizontalLineTo(x = 4.78125f)
                curveTo(x1 = 4.36704f, y1 = 14.0f, x2 = 4.03125f, y2 = 13.6642f, x3 = 4.03125f, y3 = 13.25f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 4.03125f, y1 = 3.33579f, x2 = 4.36704f, y2 = 3.0f, x3 = 4.78125f, y3 = 3.0f)
                horizontalLineTo(x = 11.25f)
                verticalLineTo(y = 1.75f)
                curveTo(x1 = 11.25f, y1 = 1.33579f, x2 = 11.5858f, y2 = 1.0f, x3 = 12.0f, y3 = 1.0f)
                close()
                moveTo(x = 5.53125f, y = 12.5f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 18.4688f)
                verticalLineTo(y = 12.5f)
                horizontalLineTo(x = 5.53125f)
                close()
                moveTo(x = 8.75f, y = 7.0f)
                curveTo(x1 = 9.16421f, y1 = 7.0f, x2 = 9.5f, y2 = 7.33579f, x3 = 9.5f, y3 = 7.75f)
                verticalLineTo(y = 9.25f)
                curveTo(x1 = 9.5f, y1 = 9.66421f, x2 = 9.16421f, y2 = 10.0f, x3 = 8.75f, y3 = 10.0f)
                curveTo(x1 = 8.33579f, y1 = 10.0f, x2 = 8.0f, y2 = 9.66421f, x3 = 8.0f, y3 = 9.25f)
                verticalLineTo(y = 7.75f)
                curveTo(x1 = 8.0f, y1 = 7.33579f, x2 = 8.33579f, y2 = 7.0f, x3 = 8.75f, y3 = 7.0f)
                close()
                moveTo(x = 15.25f, y = 7.0f)
                curveTo(x1 = 15.6642f, y1 = 7.0f, x2 = 16.0f, y2 = 7.33579f, x3 = 16.0f, y3 = 7.75f)
                verticalLineTo(y = 9.25f)
                curveTo(x1 = 16.0f, y1 = 9.66421f, x2 = 15.6642f, y2 = 10.0f, x3 = 15.25f, y3 = 10.0f)
                curveTo(x1 = 14.8358f, y1 = 10.0f, x2 = 14.5f, y2 = 9.66421f, x3 = 14.5f, y3 = 9.25f)
                verticalLineTo(y = 7.75f)
                curveTo(x1 = 14.5f, y1 = 7.33579f, x2 = 14.8358f, y2 = 7.0f, x3 = 15.25f, y3 = 7.0f)
                close()
            }
        }.build().also { _robot = it }
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
                imageVector = Robot,
                contentDescription = null,
                modifier = Modifier
                    .width((25.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _robot: ImageVector? = null
