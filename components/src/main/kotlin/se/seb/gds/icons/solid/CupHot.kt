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

val CupHot: ImageVector
    get() {
        val current = _cupHot
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.CupHot",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 7.0f, y = 2.0f)
                curveTo(x1 = 7.41421f, y1 = 2.0f, x2 = 7.75f, y2 = 2.33579f, x3 = 7.75f, y3 = 2.75f)
                verticalLineTo(y = 5.25f)
                curveTo(x1 = 7.75f, y1 = 5.66421f, x2 = 7.41421f, y2 = 6.0f, x3 = 7.0f, y3 = 6.0f)
                curveTo(x1 = 6.58579f, y1 = 6.0f, x2 = 6.25f, y2 = 5.66421f, x3 = 6.25f, y3 = 5.25f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 6.25f, y1 = 2.33579f, x2 = 6.58579f, y2 = 2.0f, x3 = 7.0f, y3 = 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 11.0f, y = 2.0f)
                curveTo(x1 = 11.4142f, y1 = 2.0f, x2 = 11.75f, y2 = 2.33579f, x3 = 11.75f, y3 = 2.75f)
                verticalLineTo(y = 5.25f)
                curveTo(x1 = 11.75f, y1 = 5.66421f, x2 = 11.4142f, y2 = 6.0f, x3 = 11.0f, y3 = 6.0f)
                curveTo(x1 = 10.5858f, y1 = 6.0f, x2 = 10.25f, y2 = 5.66421f, x3 = 10.25f, y3 = 5.25f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 10.25f, y1 = 2.33579f, x2 = 10.5858f, y2 = 2.0f, x3 = 11.0f, y3 = 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 15.0f, y = 2.0f)
                curveTo(x1 = 15.4142f, y1 = 2.0f, x2 = 15.75f, y2 = 2.33579f, x3 = 15.75f, y3 = 2.75f)
                verticalLineTo(y = 5.25f)
                curveTo(x1 = 15.75f, y1 = 5.66421f, x2 = 15.4142f, y2 = 6.0f, x3 = 15.0f, y3 = 6.0f)
                curveTo(x1 = 14.5858f, y1 = 6.0f, x2 = 14.25f, y2 = 5.66421f, x3 = 14.25f, y3 = 5.25f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 14.25f, y1 = 2.33579f, x2 = 14.5858f, y2 = 2.0f, x3 = 15.0f, y3 = 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 4.75f, y = 7.0f)
                curveTo(x1 = 4.33579f, y1 = 7.0f, x2 = 4.0f, y2 = 7.33579f, x3 = 4.0f, y3 = 7.75f)
                verticalLineTo(y = 21.25f)
                curveTo(x1 = 4.0f, y1 = 21.6642f, x2 = 4.33579f, y2 = 22.0f, x3 = 4.75f, y3 = 22.0f)
                horizontalLineTo(x = 17.25f)
                curveTo(x1 = 17.6642f, y1 = 22.0f, x2 = 18.0f, y2 = 21.6642f, x3 = 18.0f, y3 = 21.25f)
                verticalLineTo(y = 16.0f)
                horizontalLineTo(x = 18.5f)
                curveTo(x1 = 20.433f, y1 = 16.0f, x2 = 22.0f, y2 = 14.433f, x3 = 22.0f, y3 = 12.5f)
                curveTo(x1 = 22.0f, y1 = 10.567f, x2 = 20.433f, y2 = 9.0f, x3 = 18.5f, y3 = 9.0f)
                horizontalLineTo(x = 18.0f)
                verticalLineTo(y = 7.75f)
                curveTo(x1 = 18.0f, y1 = 7.33579f, x2 = 17.6642f, y2 = 7.0f, x3 = 17.25f, y3 = 7.0f)
                horizontalLineTo(x = 4.75f)
                close()
                moveTo(x = 18.0f, y = 10.5f)
                verticalLineTo(y = 14.5f)
                horizontalLineTo(x = 18.5f)
                curveTo(x1 = 19.6046f, y1 = 14.5f, x2 = 20.5f, y2 = 13.6046f, x3 = 20.5f, y3 = 12.5f)
                curveTo(x1 = 20.5f, y1 = 11.3954f, x2 = 19.6046f, y2 = 10.5f, x3 = 18.5f, y3 = 10.5f)
                horizontalLineTo(x = 18.0f)
                close()
            }
        }.build().also { _cupHot = it }
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
                imageVector = CupHot,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _cupHot: ImageVector? = null
