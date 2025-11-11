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

internal val TriangleExclamation: ImageVector
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
                moveTo(x = 9.63618f, y = 3.25787f)
                curveTo(x1 = 10.7021f, y1 = 1.46515f, x2 = 13.2977f, y2 = 1.46515f, x3 = 14.3636f, y3 = 3.25787f)
                lineTo(x = 21.8476f, y = 15.8446f)
                curveTo(x1 = 22.9376f, y1 = 17.6777f, x2 = 21.6165f, y2 = 20.0f, x3 = 19.4839f, y3 = 20.0f)
                horizontalLineTo(x = 4.51593f)
                curveTo(x1 = 2.38326f, y1 = 20.0f, x2 = 1.06225f, y2 = 17.6777f, x3 = 2.15221f, y3 = 15.8446f)
                lineTo(x = 9.63618f, y = 3.25787f)
                close()
                moveTo(x = 12.0f, y = 8.0f)
                curveTo(x1 = 12.4142f, y1 = 8.0f, x2 = 12.75f, y2 = 8.33579f, x3 = 12.75f, y3 = 8.75f)
                verticalLineTo(y = 12.75f)
                curveTo(x1 = 12.75f, y1 = 13.1642f, x2 = 12.4142f, y2 = 13.5f, x3 = 12.0f, y3 = 13.5f)
                curveTo(x1 = 11.5858f, y1 = 13.5f, x2 = 11.25f, y2 = 13.1642f, x3 = 11.25f, y3 = 12.75f)
                verticalLineTo(y = 8.75f)
                curveTo(x1 = 11.25f, y1 = 8.33579f, x2 = 11.5858f, y2 = 8.0f, x3 = 12.0f, y3 = 8.0f)
                close()
                moveTo(x = 13.0f, y = 15.5f)
                curveTo(x1 = 13.0f, y1 = 16.0523f, x2 = 12.5523f, y2 = 16.5f, x3 = 12.0f, y3 = 16.5f)
                curveTo(x1 = 11.4477f, y1 = 16.5f, x2 = 11.0f, y2 = 16.0523f, x3 = 11.0f, y3 = 15.5f)
                curveTo(x1 = 11.0f, y1 = 14.9477f, x2 = 11.4477f, y2 = 14.5f, x3 = 12.0f, y3 = 14.5f)
                curveTo(x1 = 12.5523f, y1 = 14.5f, x2 = 13.0f, y2 = 14.9477f, x3 = 13.0f, y3 = 15.5f)
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
