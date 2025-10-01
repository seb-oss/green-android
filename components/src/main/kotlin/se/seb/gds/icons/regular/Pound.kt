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

val Pound: ImageVector
    get() {
        val current = _pound
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Pound",
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
                    moveTo(x = 14.5f, y = 7.50108f)
                    curveTo(
                        x1 = 14.0061f,
                        y1 = 7.03638f,
                        x2 = 13.3306f,
                        y2 = 6.75f,
                        x3 = 12.5856f,
                        y3 = 6.75f,
                    )
                    curveTo(
                        x1 = 11.0725f,
                        y1 = 6.75f,
                        x2 = 9.8459f,
                        y2 = 7.93147f,
                        x3 = 9.8459f,
                        y3 = 9.38889f,
                    )
                    curveTo(
                        x1 = 9.8459f,
                        y1 = 10.8463f,
                        x2 = 11.0f,
                        y2 = 12.0f,
                        x3 = 11.0f,
                        y3 = 12.0f,
                    )
                    lineTo(x = 10.9889f, y = 12.0278f)
                    moveTo(x = 14.2295f, y = 16.25f)
                    horizontalLineTo(x = 9.29795f)
                    lineTo(x = 10.9889f, y = 12.0278f)
                    moveTo(x = 10.9889f, y = 12.0278f)
                    horizontalLineTo(x = 8.75f)
                    moveTo(x = 10.9889f, y = 12.0278f)
                    horizontalLineTo(x = 14.2295f)
                    moveTo(x = 21.25f, y = 12.0f)
                    curveTo(
                        x1 = 21.25f,
                        y1 = 17.1086f,
                        x2 = 17.1086f,
                        y2 = 21.25f,
                        x3 = 12.0f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 6.89137f,
                        y1 = 21.25f,
                        x2 = 2.75f,
                        y2 = 17.1086f,
                        x3 = 2.75f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 2.75f,
                        y1 = 6.89137f,
                        x2 = 6.89137f,
                        y2 = 2.75f,
                        x3 = 12.0f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 17.1086f,
                        y1 = 2.75f,
                        x2 = 21.25f,
                        y2 = 6.89137f,
                        x3 = 21.25f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _pound = it }
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
                imageVector = Pound,
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
private var _pound: ImageVector? = null
