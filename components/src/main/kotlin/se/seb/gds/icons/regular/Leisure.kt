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

internal val Leisure: ImageVector
    get() {
        val current = _leisure
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Leisure",
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
                moveTo(x = 8.5f, y = 9.25f)
                horizontalLineTo(x = 9.0f)
                moveTo(x = 13.5f, y = 9.25f)
                horizontalLineTo(x = 14.0f)
                moveTo(x = 17.4492f, y = 12.7507f)
                curveTo(x1 = 17.1168f, y1 = 15.1864f, x2 = 15.1897f, y2 = 17.1146f, x3 = 12.7545f, y3 = 17.4487f)
                moveTo(x = 9.25f, y = 9.25f)
                curveTo(x1 = 9.25f, y1 = 9.52614f, x2 = 9.02614f, y2 = 9.75f, x3 = 8.75f, y3 = 9.75f)
                curveTo(x1 = 8.47386f, y1 = 9.75f, x2 = 8.25f, y2 = 9.52614f, x3 = 8.25f, y3 = 9.25f)
                curveTo(x1 = 8.25f, y1 = 8.97386f, x2 = 8.47386f, y2 = 8.75f, x3 = 8.75f, y3 = 8.75f)
                curveTo(x1 = 9.02614f, y1 = 8.75f, x2 = 9.25f, y2 = 8.97386f, x3 = 9.25f, y3 = 9.25f)
                close()
                moveTo(x = 14.25f, y = 9.25f)
                curveTo(x1 = 14.25f, y1 = 9.52614f, x2 = 14.0261f, y2 = 9.75f, x3 = 13.75f, y3 = 9.75f)
                curveTo(x1 = 13.4739f, y1 = 9.75f, x2 = 13.25f, y2 = 9.52614f, x3 = 13.25f, y3 = 9.25f)
                curveTo(x1 = 13.25f, y1 = 8.97386f, x2 = 13.4739f, y2 = 8.75f, x3 = 13.75f, y3 = 8.75f)
                curveTo(x1 = 14.0261f, y1 = 8.75f, x2 = 14.25f, y2 = 8.97386f, x3 = 14.25f, y3 = 9.25f)
                close()
                moveTo(x = 21.25f, y = 12.0f)
                curveTo(x1 = 21.25f, y1 = 17.1086f, x2 = 17.1086f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                curveTo(x1 = 6.89137f, y1 = 21.25f, x2 = 2.75f, y2 = 17.1086f, x3 = 2.75f, y3 = 12.0f)
                curveTo(x1 = 2.75f, y1 = 6.89137f, x2 = 6.89137f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 17.1086f, y1 = 2.75f, x2 = 21.25f, y2 = 6.89137f, x3 = 21.25f, y3 = 12.0f)
                close()
            }
        }.build().also { _leisure = it }
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
                imageVector = Leisure,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _leisure: ImageVector? = null
