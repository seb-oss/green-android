package se.seb.gds.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Calculator: ImageVector
    get() {
        val current = _calculator
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Calculator",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 4.75f, y = 7.75f)
                    verticalLineTo(y = 21.25f)
                    horizontalLineTo(x = 19.25f)
                    verticalLineTo(y = 7.75f)
                    moveTo(x = 4.75f, y = 7.75f)
                    horizontalLineTo(x = 19.25f)
                    moveTo(x = 4.75f, y = 7.75f)
                    verticalLineTo(y = 2.75f)
                    horizontalLineTo(x = 19.25f)
                    verticalLineTo(y = 7.75f)
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 0.5f,
                ) {
                    moveTo(x = 9.5f, y = 16.0f)
                    curveTo(
                        x1 = 9.91421f,
                        y1 = 16.0f,
                        x2 = 10.25f,
                        y2 = 16.3358f,
                        x3 = 10.25f,
                        y3 = 16.75f,
                    )
                    curveTo(
                        x1 = 10.25f,
                        y1 = 17.1642f,
                        x2 = 9.91421f,
                        y2 = 17.5f,
                        x3 = 9.5f,
                        y3 = 17.5f,
                    )
                    curveTo(
                        x1 = 9.08579f,
                        y1 = 17.5f,
                        x2 = 8.75f,
                        y2 = 17.1642f,
                        x3 = 8.75f,
                        y3 = 16.75f,
                    )
                    curveTo(
                        x1 = 8.75f,
                        y1 = 16.3358f,
                        x2 = 9.08579f,
                        y2 = 16.0f,
                        x3 = 9.5f,
                        y3 = 16.0f,
                    )
                    close()
                    moveTo(x = 14.5f, y = 16.0f)
                    curveTo(
                        x1 = 14.9142f,
                        y1 = 16.0f,
                        x2 = 15.25f,
                        y2 = 16.3358f,
                        x3 = 15.25f,
                        y3 = 16.75f,
                    )
                    curveTo(
                        x1 = 15.25f,
                        y1 = 17.1642f,
                        x2 = 14.9142f,
                        y2 = 17.5f,
                        x3 = 14.5f,
                        y3 = 17.5f,
                    )
                    curveTo(
                        x1 = 14.0858f,
                        y1 = 17.5f,
                        x2 = 13.75f,
                        y2 = 17.1642f,
                        x3 = 13.75f,
                        y3 = 16.75f,
                    )
                    curveTo(
                        x1 = 13.75f,
                        y1 = 16.3358f,
                        x2 = 14.0858f,
                        y2 = 16.0f,
                        x3 = 14.5f,
                        y3 = 16.0f,
                    )
                    close()
                    moveTo(x = 9.5f, y = 11.5f)
                    curveTo(
                        x1 = 9.91421f,
                        y1 = 11.5f,
                        x2 = 10.25f,
                        y2 = 11.8358f,
                        x3 = 10.25f,
                        y3 = 12.25f,
                    )
                    curveTo(
                        x1 = 10.25f,
                        y1 = 12.6642f,
                        x2 = 9.91421f,
                        y2 = 13.0f,
                        x3 = 9.5f,
                        y3 = 13.0f,
                    )
                    curveTo(
                        x1 = 9.08579f,
                        y1 = 13.0f,
                        x2 = 8.75f,
                        y2 = 12.6642f,
                        x3 = 8.75f,
                        y3 = 12.25f,
                    )
                    curveTo(
                        x1 = 8.75f,
                        y1 = 11.8358f,
                        x2 = 9.08579f,
                        y2 = 11.5f,
                        x3 = 9.5f,
                        y3 = 11.5f,
                    )
                    close()
                    moveTo(x = 14.5f, y = 11.5f)
                    curveTo(
                        x1 = 14.9142f,
                        y1 = 11.5f,
                        x2 = 15.25f,
                        y2 = 11.8358f,
                        x3 = 15.25f,
                        y3 = 12.25f,
                    )
                    curveTo(
                        x1 = 15.25f,
                        y1 = 12.6642f,
                        x2 = 14.9142f,
                        y2 = 13.0f,
                        x3 = 14.5f,
                        y3 = 13.0f,
                    )
                    curveTo(
                        x1 = 14.0858f,
                        y1 = 13.0f,
                        x2 = 13.75f,
                        y2 = 12.6642f,
                        x3 = 13.75f,
                        y3 = 12.25f,
                    )
                    curveTo(
                        x1 = 13.75f,
                        y1 = 11.8358f,
                        x2 = 14.0858f,
                        y2 = 11.5f,
                        x3 = 14.5f,
                        y3 = 11.5f,
                    )
                    close()
                }
            }.build()
            .also { _calculator = it }
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
                imageVector = Calculator,
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
private var _calculator: ImageVector? = null
