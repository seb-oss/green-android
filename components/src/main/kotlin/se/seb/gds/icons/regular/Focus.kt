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

val Focus: ImageVector
    get() {
        val current = _focus
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Focus",
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
                moveTo(x = 3.75f, y = 8.0f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 8.0f)
                moveTo(x = 3.75f, y = 16.0f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 8.0f)
                moveTo(x = 16.0f, y = 3.75f)
                horizontalLineTo(x = 20.25f)
                verticalLineTo(y = 8.0f)
                moveTo(x = 20.25f, y = 16.0f)
                verticalLineTo(y = 20.25f)
                horizontalLineTo(x = 16.0f)
                moveTo(x = 15.25f, y = 12.0f)
                curveTo(x1 = 15.25f, y1 = 13.7949f, x2 = 13.7949f, y2 = 15.25f, x3 = 12.0f, y3 = 15.25f)
                curveTo(x1 = 10.2051f, y1 = 15.25f, x2 = 8.75f, y2 = 13.7949f, x3 = 8.75f, y3 = 12.0f)
                curveTo(x1 = 8.75f, y1 = 10.2051f, x2 = 10.2051f, y2 = 8.75f, x3 = 12.0f, y3 = 8.75f)
                curveTo(x1 = 13.7949f, y1 = 8.75f, x2 = 15.25f, y2 = 10.2051f, x3 = 15.25f, y3 = 12.0f)
                close()
            }
        }.build().also { _focus = it }
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
                imageVector = Focus,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _focus: ImageVector? = null
