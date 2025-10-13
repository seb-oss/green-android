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

internal val FileChart: ImageVector
    get() {
        val current = _fileChart
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.FileChart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 4.75f, y = 2.0f)
                horizontalLineTo(x = 12.0f)
                verticalLineTo(y = 9.25f)
                curveTo(x1 = 12.0f, y1 = 9.66421f, x2 = 12.3358f, y2 = 10.0f, x3 = 12.75f, y3 = 10.0f)
                horizontalLineTo(x = 20.0f)
                verticalLineTo(y = 21.25f)
                curveTo(x1 = 20.0f, y1 = 21.6642f, x2 = 19.6642f, y2 = 22.0f, x3 = 19.25f, y3 = 22.0f)
                horizontalLineTo(x = 4.75f)
                curveTo(x1 = 4.33579f, y1 = 22.0f, x2 = 4.0f, y2 = 21.6642f, x3 = 4.0f, y3 = 21.25f)
                verticalLineTo(y = 2.75f)
                curveTo(x1 = 4.0f, y1 = 2.33579f, x2 = 4.33579f, y2 = 2.0f, x3 = 4.75f, y3 = 2.0f)
                close()
                moveTo(x = 9.25f, y = 16.75f)
                curveTo(x1 = 9.25f, y1 = 16.3358f, x2 = 8.91421f, y2 = 16.0f, x3 = 8.5f, y3 = 16.0f)
                curveTo(x1 = 8.08579f, y1 = 16.0f, x2 = 7.75f, y2 = 16.3358f, x3 = 7.75f, y3 = 16.75f)
                verticalLineTo(y = 18.25f)
                curveTo(x1 = 7.75f, y1 = 18.6642f, x2 = 8.08579f, y2 = 19.0f, x3 = 8.5f, y3 = 19.0f)
                curveTo(x1 = 8.91421f, y1 = 19.0f, x2 = 9.25f, y2 = 18.6642f, x3 = 9.25f, y3 = 18.25f)
                verticalLineTo(y = 16.75f)
                close()
                moveTo(x = 12.0f, y = 13.0f)
                curveTo(x1 = 12.4142f, y1 = 13.0f, x2 = 12.75f, y2 = 13.3358f, x3 = 12.75f, y3 = 13.75f)
                verticalLineTo(y = 18.25f)
                curveTo(x1 = 12.75f, y1 = 18.6642f, x2 = 12.4142f, y2 = 19.0f, x3 = 12.0f, y3 = 19.0f)
                curveTo(x1 = 11.5858f, y1 = 19.0f, x2 = 11.25f, y2 = 18.6642f, x3 = 11.25f, y3 = 18.25f)
                verticalLineTo(y = 13.75f)
                curveTo(x1 = 11.25f, y1 = 13.3358f, x2 = 11.5858f, y2 = 13.0f, x3 = 12.0f, y3 = 13.0f)
                close()
                moveTo(x = 16.25f, y = 15.75f)
                curveTo(x1 = 16.25f, y1 = 15.3358f, x2 = 15.9142f, y2 = 15.0f, x3 = 15.5f, y3 = 15.0f)
                curveTo(x1 = 15.0858f, y1 = 15.0f, x2 = 14.75f, y2 = 15.3358f, x3 = 14.75f, y3 = 15.75f)
                verticalLineTo(y = 18.25f)
                curveTo(x1 = 14.75f, y1 = 18.6642f, x2 = 15.0858f, y2 = 19.0f, x3 = 15.5f, y3 = 19.0f)
                curveTo(x1 = 15.9142f, y1 = 19.0f, x2 = 16.25f, y2 = 18.6642f, x3 = 16.25f, y3 = 18.25f)
                verticalLineTo(y = 15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 13.5f, y = 2.43934f)
                lineTo(x = 19.5607f, y = 8.5f)
                horizontalLineTo(x = 13.5f)
                verticalLineTo(y = 2.43934f)
                close()
            }
        }.build().also { _fileChart = it }
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
                imageVector = FileChart,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _fileChart: ImageVector? = null
