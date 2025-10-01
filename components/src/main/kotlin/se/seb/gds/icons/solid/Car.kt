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

val Car: ImageVector
    get() {
        val current = _car
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Car",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 5.364f, y = 4.3525f)
                curveTo(x1 = 5.50106f, y1 = 4.13321f, x2 = 5.74141f, y2 = 4.0f, x3 = 6.0f, y3 = 4.0f)
                horizontalLineTo(x = 18.0f)
                curveTo(x1 = 18.2586f, y1 = 4.0f, x2 = 18.4989f, y2 = 4.13321f, x3 = 18.636f, y3 = 4.3525f)
                lineTo(x = 22.1657f, y = 10.0f)
                horizontalLineTo(x = 23.25f)
                curveTo(x1 = 23.6642f, y1 = 10.0f, x2 = 24.0f, y2 = 10.3358f, x3 = 24.0f, y3 = 10.75f)
                curveTo(x1 = 24.0f, y1 = 11.1642f, x2 = 23.6642f, y2 = 11.5f, x3 = 23.25f, y3 = 11.5f)
                horizontalLineTo(x = 22.5f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 22.5f, y1 = 19.6642f, x2 = 22.1642f, y2 = 20.0f, x3 = 21.75f, y3 = 20.0f)
                horizontalLineTo(x = 18.25f)
                curveTo(x1 = 17.8358f, y1 = 20.0f, x2 = 17.5f, y2 = 19.6642f, x3 = 17.5f, y3 = 19.25f)
                verticalLineTo(y = 17.9286f)
                horizontalLineTo(x = 6.5f)
                verticalLineTo(y = 19.25f)
                curveTo(x1 = 6.5f, y1 = 19.6642f, x2 = 6.16421f, y2 = 20.0f, x3 = 5.75f, y3 = 20.0f)
                horizontalLineTo(x = 2.25f)
                curveTo(x1 = 1.83579f, y1 = 20.0f, x2 = 1.5f, y2 = 19.6642f, x3 = 1.5f, y3 = 19.25f)
                verticalLineTo(y = 11.5f)
                horizontalLineTo(x = 0.75f)
                curveTo(x1 = 0.335786f, y1 = 11.5f, x2 = 0.0f, y2 = 11.1642f, x3 = 0.0f, y3 = 10.75f)
                curveTo(x1 = 0.0f, y1 = 10.3358f, x2 = 0.335786f, y2 = 10.0f, x3 = 0.75f, y3 = 10.0f)
                horizontalLineTo(x = 1.83431f)
                lineTo(x = 5.364f, y = 4.3525f)
                close()
                moveTo(x = 5.0f, y = 13.0357f)
                curveTo(x1 = 5.0f, y1 = 12.6215f, x2 = 5.33579f, y2 = 12.2857f, x3 = 5.75f, y3 = 12.2857f)
                horizontalLineTo(x = 7.75f)
                curveTo(x1 = 8.16421f, y1 = 12.2857f, x2 = 8.5f, y2 = 12.6215f, x3 = 8.5f, y3 = 13.0357f)
                curveTo(x1 = 8.5f, y1 = 13.4499f, x2 = 8.16421f, y2 = 13.7857f, x3 = 7.75f, y3 = 13.7857f)
                horizontalLineTo(x = 5.75f)
                curveTo(x1 = 5.33579f, y1 = 13.7857f, x2 = 5.0f, y2 = 13.4499f, x3 = 5.0f, y3 = 13.0357f)
                close()
                moveTo(x = 15.5f, y = 13.0357f)
                curveTo(x1 = 15.5f, y1 = 12.6215f, x2 = 15.8358f, y2 = 12.2857f, x3 = 16.25f, y3 = 12.2857f)
                horizontalLineTo(x = 18.25f)
                curveTo(x1 = 18.6642f, y1 = 12.2857f, x2 = 19.0f, y2 = 12.6215f, x3 = 19.0f, y3 = 13.0357f)
                curveTo(x1 = 19.0f, y1 = 13.4499f, x2 = 18.6642f, y2 = 13.7857f, x3 = 18.25f, y3 = 13.7857f)
                horizontalLineTo(x = 16.25f)
                curveTo(x1 = 15.8358f, y1 = 13.7857f, x2 = 15.5f, y2 = 13.4499f, x3 = 15.5f, y3 = 13.0357f)
                close()
            }
        }.build().also { _car = it }
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
                imageVector = Car,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _car: ImageVector? = null
