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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val Email: ImageVector
    get() {
        val current = _email
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Email",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 21.25f, y = 4.75f)
                horizontalLineTo(x = 22.0f)
                curveTo(x1 = 22.0f, y1 = 4.33579f, x2 = 21.6642f, y2 = 4.0f, x3 = 21.25f, y3 = 4.0f)
                verticalLineTo(y = 4.75f)
                close()
                moveTo(x = 21.25f, y = 19.25f)
                verticalLineTo(y = 20.0f)
                curveTo(x1 = 21.6642f, y1 = 20.0f, x2 = 22.0f, y2 = 19.6642f, x3 = 22.0f, y3 = 19.25f)
                horizontalLineTo(x = 21.25f)
                close()
                moveTo(x = 2.75f, y = 19.25f)
                horizontalLineTo(x = 2.0f)
                curveTo(x1 = 2.0f, y1 = 19.6642f, x2 = 2.33579f, y2 = 20.0f, x3 = 2.75f, y3 = 20.0f)
                verticalLineTo(y = 19.25f)
                close()
                moveTo(x = 2.75f, y = 4.75f)
                verticalLineTo(y = 4.0f)
                curveTo(x1 = 2.33579f, y1 = 4.0f, x2 = 2.0f, y2 = 4.33579f, x3 = 2.0f, y3 = 4.75f)
                horizontalLineTo(x = 2.75f)
                close()
                moveTo(x = 12.0f, y = 13.0f)
                lineTo(x = 11.5251f, y = 13.5805f)
                curveTo(x1 = 11.8013f, y1 = 13.8065f, x2 = 12.1987f, y2 = 13.8065f, x3 = 12.4749f, y3 = 13.5805f)
                lineTo(x = 12.0f, y = 13.0f)
                close()
                moveTo(x = 21.25f, y = 4.75f)
                horizontalLineTo(x = 20.5f)
                verticalLineTo(y = 19.25f)
                horizontalLineTo(x = 21.25f)
                horizontalLineTo(x = 22.0f)
                verticalLineTo(y = 4.75f)
                horizontalLineTo(x = 21.25f)
                close()
                moveTo(x = 21.25f, y = 19.25f)
                verticalLineTo(y = 18.5f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 19.25f)
                verticalLineTo(y = 20.0f)
                horizontalLineTo(x = 21.25f)
                verticalLineTo(y = 19.25f)
                close()
                moveTo(x = 2.75f, y = 19.25f)
                horizontalLineTo(x = 3.5f)
                verticalLineTo(y = 4.75f)
                horizontalLineTo(x = 2.75f)
                horizontalLineTo(x = 2.0f)
                verticalLineTo(y = 19.25f)
                horizontalLineTo(x = 2.75f)
                close()
                moveTo(x = 2.75f, y = 4.75f)
                verticalLineTo(y = 5.5f)
                horizontalLineTo(x = 21.25f)
                verticalLineTo(y = 4.75f)
                verticalLineTo(y = 4.0f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 4.75f)
                close()
                moveTo(x = 12.0f, y = 13.0f)
                lineTo(x = 12.4749f, y = 12.4195f)
                lineTo(x = 3.47493f, y = 5.0559f)
                lineTo(x = 3.0f, y = 5.63637f)
                lineTo(x = 2.52507f, y = 6.21684f)
                lineTo(x = 11.5251f, y = 13.5805f)
                lineTo(x = 12.0f, y = 13.0f)
                close()
                moveTo(x = 21.0f, y = 5.63637f)
                lineTo(x = 20.5251f, y = 5.0559f)
                lineTo(x = 11.5251f, y = 12.4195f)
                lineTo(x = 12.0f, y = 13.0f)
                lineTo(x = 12.4749f, y = 13.5805f)
                lineTo(x = 21.4749f, y = 6.21684f)
                lineTo(x = 21.0f, y = 5.63637f)
                close()
            }
        }.build().also { _email = it }
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
                imageVector = Email,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _email: ImageVector? = null
