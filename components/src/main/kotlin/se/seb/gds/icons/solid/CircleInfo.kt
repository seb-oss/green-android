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

val CircleInfo: ImageVector
    get() {
        val current = _circleInfo
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CircleInfo",
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
                    curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 6.47715f, x2 = 17.5228f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    close()
                    moveTo(x = 10.0f, y = 11.0f)
                    curveTo(x1 = 10.0f, y1 = 10.5858f, x2 = 10.3358f, y2 = 10.25f, x3 = 10.75f, y3 = 10.25f)
                    horizontalLineTo(x = 12.0f)
                    curveTo(x1 = 12.4142f, y1 = 10.25f, x2 = 12.75f, y2 = 10.5858f, x3 = 12.75f, y3 = 11.0f)
                    lineTo(x = 12.75f, y = 16.25f)
                    curveTo(x1 = 12.75f, y1 = 16.6642f, x2 = 12.4142f, y2 = 17.0f, x3 = 12.0f, y3 = 17.0f)
                    curveTo(x1 = 11.5858f, y1 = 17.0f, x2 = 11.25f, y2 = 16.6642f, x3 = 11.25f, y3 = 16.25f)
                    lineTo(x = 11.25f, y = 11.75f)
                    horizontalLineTo(x = 10.75f)
                    curveTo(x1 = 10.3358f, y1 = 11.75f, x2 = 10.0f, y2 = 11.4142f, x3 = 10.0f, y3 = 11.0f)
                    close()
                    moveTo(x = 12.0f, y = 7.25f)
                    curveTo(x1 = 11.5858f, y1 = 7.25f, x2 = 11.25f, y2 = 7.58579f, x3 = 11.25f, y3 = 8.0f)
                    curveTo(x1 = 11.25f, y1 = 8.41421f, x2 = 11.5858f, y2 = 8.75f, x3 = 12.0f, y3 = 8.75f)
                    curveTo(x1 = 12.4142f, y1 = 8.75f, x2 = 12.75f, y2 = 8.41421f, x3 = 12.75f, y3 = 8.0f)
                    curveTo(x1 = 12.75f, y1 = 7.58579f, x2 = 12.4142f, y2 = 7.25f, x3 = 12.0f, y3 = 7.25f)
                    close()
                }
            }.build()
            .also { _circleInfo = it }
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
                imageVector = CircleInfo,
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
private var _circleInfo: ImageVector? = null
