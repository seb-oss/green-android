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

val Robot: ImageVector
    get() {
        val current = _robot
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Robot",
                defaultWidth = 25.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 25.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 12.0f, y = 3.75f)
                    horizontalLineTo(x = 4.78125f)
                    verticalLineTo(y = 13.25f)
                    horizontalLineTo(x = 19.2188f)
                    verticalLineTo(y = 3.75f)
                    horizontalLineTo(x = 12.0f)
                    close()
                    moveTo(x = 12.0f, y = 3.75f)
                    verticalLineTo(y = 1.75f)
                    moveTo(x = 8.75f, y = 7.75f)
                    verticalLineTo(y = 9.25f)
                    moveTo(x = 15.25f, y = 7.75f)
                    verticalLineTo(y = 9.25f)
                    moveTo(x = 5.75f, y = 13.25f)
                    verticalLineTo(y = 14.25f)
                    moveTo(x = 5.75f, y = 14.25f)
                    verticalLineTo(y = 15.0f)
                    curveTo(
                        x1 = 5.75f,
                        y1 = 18.4518f,
                        x2 = 8.54822f,
                        y2 = 21.25f,
                        x3 = 12.0f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 15.4518f,
                        y1 = 21.25f,
                        x2 = 18.25f,
                        y2 = 18.4518f,
                        x3 = 18.25f,
                        y3 = 15.0f,
                    )
                    verticalLineTo(y = 14.25f)
                    moveTo(x = 5.75f, y = 14.25f)
                    lineTo(x = 3.75f, y = 16.25f)
                    moveTo(x = 18.25f, y = 14.25f)
                    verticalLineTo(y = 13.25f)
                    moveTo(x = 18.25f, y = 14.25f)
                    lineTo(x = 20.25f, y = 16.25f)
                }
            }.build()
            .also { _robot = it }
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
                modifier =
                Modifier
                    .width((25.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _robot: ImageVector? = null
