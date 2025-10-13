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

internal val Direction: ImageVector
    get() {
        val current = _direction
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Direction",
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
                moveTo(x = 12.0f, y = 9.0f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 19.25f)
                lineTo(x = 21.25f, y = 6.5f)
                lineTo(x = 19.25f, y = 9.0f)
                horizontalLineTo(x = 12.0f)
                close()
                moveTo(x = 12.0f, y = 9.0f)
                verticalLineTo(y = 14.0f)
                moveTo(x = 12.0f, y = 9.0f)
                horizontalLineTo(x = 4.75f)
                lineTo(x = 2.75f, y = 11.5f)
                lineTo(x = 4.75f, y = 14.0f)
                horizontalLineTo(x = 12.0f)
                moveTo(x = 12.0f, y = 14.0f)
                verticalLineTo(y = 20.25f)
                moveTo(x = 12.0f, y = 20.25f)
                horizontalLineTo(x = 7.75f)
                moveTo(x = 12.0f, y = 20.25f)
                horizontalLineTo(x = 16.25f)
            }
        }.build().also { _direction = it }
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
                imageVector = Direction,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _direction: ImageVector? = null
