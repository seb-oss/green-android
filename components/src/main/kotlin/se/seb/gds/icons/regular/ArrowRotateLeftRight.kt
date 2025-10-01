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

val ArrowRotateLeftRight: ImageVector
    get() {
        val current = _arrowRotateLeftRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowRotateLeftRight",
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
                moveTo(x = 19.2618f, y = 20.25f)
                verticalLineTo(y = 16.25f)
                horizontalLineTo(x = 15.2618f)
                moveTo(x = 4.75f, y = 3.75f)
                verticalLineTo(y = 7.75f)
                horizontalLineTo(x = 8.75f)
                moveTo(x = 3.81383f, y = 10.9688f)
                curveTo(x1 = 3.7717f, y1 = 11.3066f, x2 = 3.75f, y2 = 11.6508f, x3 = 3.75f, y3 = 12.0f)
                curveTo(x1 = 3.75f, y1 = 16.5563f, x2 = 7.44365f, y2 = 20.25f, x3 = 12.0f, y3 = 20.25f)
                curveTo(x1 = 14.6766f, y1 = 20.25f, x2 = 17.1111f, y2 = 18.9754f, x3 = 18.6322f, y3 = 17.0f)
                moveTo(x = 20.1862f, y = 13.0312f)
                curveTo(x1 = 20.2283f, y1 = 12.6934f, x2 = 20.25f, y2 = 12.3492f, x3 = 20.25f, y3 = 12.0f)
                curveTo(x1 = 20.25f, y1 = 7.44365f, x2 = 16.5563f, y2 = 3.75f, x3 = 12.0f, y3 = 3.75f)
                curveTo(x1 = 9.32342f, y1 = 3.75f, x2 = 6.88887f, y2 = 5.02463f, x3 = 5.36784f, y3 = 7.0f)
            }
        }.build().also { _arrowRotateLeftRight = it }
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
                imageVector = ArrowRotateLeftRight,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowRotateLeftRight: ImageVector? = null
