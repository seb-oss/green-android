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

val Growth: ImageVector
    get() {
        val current = _growth
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Growth",
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
                    moveTo(x = 12.0f, y = 12.0f)
                    verticalLineTo(y = 10.75f)
                    curveTo(
                        x1 = 12.0f,
                        y1 = 6.88401f,
                        x2 = 8.86599f,
                        y2 = 3.75f,
                        x3 = 5.0f,
                        y3 = 3.75f,
                    )
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 5.0f)
                    curveTo(
                        x1 = 3.75f,
                        y1 = 8.86599f,
                        x2 = 6.88401f,
                        y2 = 12.0f,
                        x3 = 10.75f,
                        y3 = 12.0f,
                    )
                    horizontalLineTo(x = 12.0f)
                    close()
                    moveTo(x = 12.0f, y = 12.0f)
                    verticalLineTo(y = 20.25f)
                    moveTo(x = 19.0f, y = 6.75f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 8.25f)
                    curveTo(
                        x1 = 20.25f,
                        y1 = 12.116f,
                        x2 = 17.116f,
                        y2 = 15.25f,
                        x3 = 13.25f,
                        y3 = 15.25f,
                    )
                    horizontalLineTo(x = 12.0f)
                    verticalLineTo(y = 13.75f)
                    curveTo(
                        x1 = 12.0f,
                        y1 = 9.88401f,
                        x2 = 15.134f,
                        y2 = 6.75f,
                        x3 = 19.0f,
                        y3 = 6.75f,
                    )
                    close()
                }
            }.build()
            .also { _growth = it }
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
                imageVector = Growth,
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
private var _growth: ImageVector? = null
