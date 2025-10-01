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

val ChartPresentation: ImageVector
    get() {
        val current = _chartPresentation
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ChartPresentation",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 3.75f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 3.33579f,
                        x2 = 2.33579f,
                        y2 = 3.0f,
                        x3 = 2.75f,
                        y3 = 3.0f,
                    )
                    horizontalLineTo(x = 21.25f)
                    curveTo(
                        x1 = 21.6642f,
                        y1 = 3.0f,
                        x2 = 22.0f,
                        y2 = 3.33579f,
                        x3 = 22.0f,
                        y3 = 3.75f,
                    )
                    verticalLineTo(y = 18.25f)
                    curveTo(
                        x1 = 22.0f,
                        y1 = 18.6642f,
                        x2 = 21.6642f,
                        y2 = 19.0f,
                        x3 = 21.25f,
                        y3 = 19.0f,
                    )
                    horizontalLineTo(x = 15.9943f)
                    lineTo(x = 16.7211f, y = 21.544f)
                    curveTo(
                        x1 = 16.8349f,
                        y1 = 21.9422f,
                        x2 = 16.6043f,
                        y2 = 22.3573f,
                        x3 = 16.206f,
                        y3 = 22.4711f,
                    )
                    curveTo(
                        x1 = 15.8078f,
                        y1 = 22.5849f,
                        x2 = 15.3927f,
                        y2 = 22.3543f,
                        x3 = 15.2789f,
                        y3 = 21.956f,
                    )
                    lineTo(x = 14.4343f, y = 19.0f)
                    horizontalLineTo(x = 9.56573f)
                    lineTo(x = 8.72114f, y = 21.956f)
                    curveTo(
                        x1 = 8.60735f,
                        y1 = 22.3543f,
                        x2 = 8.19224f,
                        y2 = 22.5849f,
                        x3 = 7.79396f,
                        y3 = 22.4711f,
                    )
                    curveTo(
                        x1 = 7.39568f,
                        y1 = 22.3573f,
                        x2 = 7.16506f,
                        y2 = 21.9422f,
                        x3 = 7.27886f,
                        y3 = 21.544f,
                    )
                    lineTo(x = 8.0057f, y = 19.0f)
                    horizontalLineTo(x = 2.75f)
                    curveTo(
                        x1 = 2.33579f,
                        y1 = 19.0f,
                        x2 = 2.0f,
                        y2 = 18.6642f,
                        x3 = 2.0f,
                        y3 = 18.25f,
                    )
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 8.5f, y = 12.75f)
                    curveTo(
                        x1 = 8.5f,
                        y1 = 12.3358f,
                        x2 = 8.16421f,
                        y2 = 12.0f,
                        x3 = 7.75f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 7.33579f,
                        y1 = 12.0f,
                        x2 = 7.0f,
                        y2 = 12.3358f,
                        x3 = 7.0f,
                        y3 = 12.75f,
                    )
                    verticalLineTo(y = 14.25f)
                    curveTo(
                        x1 = 7.0f,
                        y1 = 14.6642f,
                        x2 = 7.33579f,
                        y2 = 15.0f,
                        x3 = 7.75f,
                        y3 = 15.0f,
                    )
                    curveTo(
                        x1 = 8.16421f,
                        y1 = 15.0f,
                        x2 = 8.5f,
                        y2 = 14.6642f,
                        x3 = 8.5f,
                        y3 = 14.25f,
                    )
                    verticalLineTo(y = 12.75f)
                    close()
                    moveTo(x = 12.0f, y = 7.0f)
                    curveTo(
                        x1 = 12.4142f,
                        y1 = 7.0f,
                        x2 = 12.75f,
                        y2 = 7.33579f,
                        x3 = 12.75f,
                        y3 = 7.75f,
                    )
                    verticalLineTo(y = 14.25f)
                    curveTo(
                        x1 = 12.75f,
                        y1 = 14.6642f,
                        x2 = 12.4142f,
                        y2 = 15.0f,
                        x3 = 12.0f,
                        y3 = 15.0f,
                    )
                    curveTo(
                        x1 = 11.5858f,
                        y1 = 15.0f,
                        x2 = 11.25f,
                        y2 = 14.6642f,
                        x3 = 11.25f,
                        y3 = 14.25f,
                    )
                    verticalLineTo(y = 7.75f)
                    curveTo(
                        x1 = 11.25f,
                        y1 = 7.33579f,
                        x2 = 11.5858f,
                        y2 = 7.0f,
                        x3 = 12.0f,
                        y3 = 7.0f,
                    )
                    close()
                    moveTo(x = 17.0f, y = 10.75f)
                    curveTo(
                        x1 = 17.0f,
                        y1 = 10.3358f,
                        x2 = 16.6642f,
                        y2 = 10.0f,
                        x3 = 16.25f,
                        y3 = 10.0f,
                    )
                    curveTo(
                        x1 = 15.8358f,
                        y1 = 10.0f,
                        x2 = 15.5f,
                        y2 = 10.3358f,
                        x3 = 15.5f,
                        y3 = 10.75f,
                    )
                    verticalLineTo(y = 14.25f)
                    curveTo(
                        x1 = 15.5f,
                        y1 = 14.6642f,
                        x2 = 15.8358f,
                        y2 = 15.0f,
                        x3 = 16.25f,
                        y3 = 15.0f,
                    )
                    curveTo(
                        x1 = 16.6642f,
                        y1 = 15.0f,
                        x2 = 17.0f,
                        y2 = 14.6642f,
                        x3 = 17.0f,
                        y3 = 14.25f,
                    )
                    verticalLineTo(y = 10.75f)
                    close()
                }
            }.build()
            .also { _chartPresentation = it }
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
                imageVector = ChartPresentation,
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
private var _chartPresentation: ImageVector? = null
