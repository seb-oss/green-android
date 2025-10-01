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
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Pension: ImageVector
    get() {
        val current = _pension
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Pension",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                group(
                    clipPathData =
                    PathData {
                        // M 0 0
                        moveTo(x = 0.0f, y = 0.0f)
                        // h 24
                        horizontalLineToRelative(dx = 24.0f)
                        // v 24
                        verticalLineToRelative(dy = 24.0f)
                        // h -24z
                        horizontalLineToRelative(dx = -24.0f)
                        close()
                    },
                ) {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                        strokeLineWidth = 1.5f,
                    ) {
                        moveTo(x = 16.625f, y = 20.0107f)
                        lineTo(x = 11.6146f, y = 11.3324f)
                        moveTo(x = 7.37499f, y = 3.98926f)
                        curveTo(
                            x1 = 2.95079f,
                            y1 = 6.54357f,
                            x2 = 1.43494f,
                            y2 = 12.2008f,
                            x3 = 3.98926f,
                            y3 = 16.625f,
                        )
                        curveTo(
                            x1 = 5.25553f,
                            y1 = 14.7071f,
                            x2 = 7.03569f,
                            y2 = 13.6794f,
                            x3 = 8.88471f,
                            y3 = 13.7986f,
                        )
                        moveTo(x = 7.37499f, y = 3.98926f)
                        curveTo(
                            x1 = 11.7992f,
                            y1 = 1.43494f,
                            x2 = 17.4564f,
                            y2 = 2.95079f,
                            x3 = 20.0107f,
                            y3 = 7.37499f,
                        )
                        curveTo(
                            x1 = 17.7167f,
                            y1 = 7.51266f,
                            x2 = 15.9365f,
                            y2 = 8.54047f,
                            x3 = 15.1153f,
                            y3 = 10.2014f,
                        )
                        moveTo(x = 7.37499f, y = 3.98926f)
                        curveTo(
                            x1 = 5.65447f,
                            y1 = 4.9826f,
                            x2 = 6.33039f,
                            y2 = 9.3744f,
                            x3 = 8.88471f,
                            y3 = 13.7986f,
                        )
                        moveTo(x = 7.37499f, y = 3.98926f)
                        curveTo(
                            x1 = 9.09552f,
                            y1 = 2.99591f,
                            x2 = 12.561f,
                            y2 = 5.77717f,
                            x3 = 15.1153f,
                            y3 = 10.2014f,
                        )
                        moveTo(x = 8.88471f, y = 13.7986f)
                        curveTo(
                            x1 = 9.74036f,
                            y1 = 12.7112f,
                            x2 = 10.6132f,
                            y2 = 11.9106f,
                            x3 = 11.6146f,
                            y3 = 11.3324f,
                        )
                        moveTo(x = 15.1153f, y = 10.2014f)
                        curveTo(
                            x1 = 13.7457f,
                            y1 = 10.3987f,
                            x2 = 12.6159f,
                            y2 = 10.7543f,
                            x3 = 11.6146f,
                            y3 = 11.3324f,
                        )
                    }
                }
            }.build()
            .also { _pension = it }
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
                imageVector = Pension,
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
private var _pension: ImageVector? = null
