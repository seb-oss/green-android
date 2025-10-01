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

val TriangleExclamation: ImageVector
    get() {
        val current = _triangleExclamation
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.TriangleExclamation",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 12.2652f, y1 = 2.0f, x2 = 12.5108f, y2 = 2.1401f, x3 = 12.6457f, y3 = 2.36845f)
                lineTo(x = 22.3957f, y = 18.8685f)
                curveTo(x1 = 22.5327f, y1 = 19.1003f, x2 = 22.5349f, y2 = 19.3878f, x3 = 22.4014f, y3 = 19.6217f)
                curveTo(x1 = 22.2679f, y1 = 19.8556f, x2 = 22.0193f, y2 = 20.0f, x3 = 21.75f, y3 = 20.0f)
                horizontalLineTo(x = 2.25f)
                curveTo(x1 = 1.9807f, y1 = 20.0f, x2 = 1.73207f, y2 = 19.8556f, x3 = 1.59859f, y3 = 19.6217f)
                curveTo(x1 = 1.46512f, y1 = 19.3878f, x2 = 1.4673f, y2 = 19.1003f, x3 = 1.60431f, y3 = 18.8685f)
                lineTo(x = 11.3543f, y = 2.36845f)
                curveTo(x1 = 11.4892f, y1 = 2.1401f, x2 = 11.7348f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                close()
                moveTo(x = 12.0f, y = 9.0f)
                curveTo(x1 = 12.4142f, y1 = 9.0f, x2 = 12.75f, y2 = 9.33579f, x3 = 12.75f, y3 = 9.75f)
                verticalLineTo(y = 13.25f)
                curveTo(x1 = 12.75f, y1 = 13.6642f, x2 = 12.4142f, y2 = 14.0f, x3 = 12.0f, y3 = 14.0f)
                curveTo(x1 = 11.5858f, y1 = 14.0f, x2 = 11.25f, y2 = 13.6642f, x3 = 11.25f, y3 = 13.25f)
                verticalLineTo(y = 9.75f)
                curveTo(x1 = 11.25f, y1 = 9.33579f, x2 = 11.5858f, y2 = 9.0f, x3 = 12.0f, y3 = 9.0f)
                close()
                moveTo(x = 13.0f, y = 15.75f)
                curveTo(x1 = 13.0f, y1 = 16.3023f, x2 = 12.5523f, y2 = 16.75f, x3 = 12.0f, y3 = 16.75f)
                curveTo(x1 = 11.4477f, y1 = 16.75f, x2 = 11.0f, y2 = 16.3023f, x3 = 11.0f, y3 = 15.75f)
                curveTo(x1 = 11.0f, y1 = 15.1977f, x2 = 11.4477f, y2 = 14.75f, x3 = 12.0f, y3 = 14.75f)
                curveTo(x1 = 12.5523f, y1 = 14.75f, x2 = 13.0f, y2 = 15.1977f, x3 = 13.0f, y3 = 15.75f)
                close()
            }
        }.build().also { _triangleExclamation = it }
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
                imageVector = TriangleExclamation,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _triangleExclamation: ImageVector? = null
