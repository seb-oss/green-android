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

internal val CircleInfo: ImageVector
    get() {
        val current = _circleInfo
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.CircleInfo",
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
                moveTo(x = 10.75f, y = 11.0f)
                horizontalLineTo(x = 12.0f)
                lineTo(x = 12.0f, y = 16.25f)
                moveTo(x = 21.25f, y = 12.0f)
                curveTo(x1 = 21.25f, y1 = 17.1086f, x2 = 17.1086f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                curveTo(x1 = 6.89137f, y1 = 21.25f, x2 = 2.75f, y2 = 17.1086f, x3 = 2.75f, y3 = 12.0f)
                curveTo(x1 = 2.75f, y1 = 6.89137f, x2 = 6.89137f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 17.1086f, y1 = 2.75f, x2 = 21.25f, y2 = 6.89137f, x3 = 21.25f, y3 = 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.25f,
            ) {
                moveTo(x = 12.0f, y = 7.375f)
                curveTo(x1 = 12.3452f, y1 = 7.375f, x2 = 12.625f, y2 = 7.65482f, x3 = 12.625f, y3 = 8.0f)
                curveTo(x1 = 12.625f, y1 = 8.34518f, x2 = 12.3452f, y2 = 8.625f, x3 = 12.0f, y3 = 8.625f)
                curveTo(x1 = 11.6548f, y1 = 8.625f, x2 = 11.375f, y2 = 8.34518f, x3 = 11.375f, y3 = 8.0f)
                curveTo(x1 = 11.375f, y1 = 7.65482f, x2 = 11.6548f, y2 = 7.375f, x3 = 12.0f, y3 = 7.375f)
                close()
            }
        }.build().also { _circleInfo = it }
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
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _circleInfo: ImageVector? = null
