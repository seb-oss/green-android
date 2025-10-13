package se.seb.gds.icons.solid

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val Invite: ImageVector
    get() {
        val current = _invite
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Invite",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 4.0f, y = 2.75f)
                curveTo(x1 = 4.0f, y1 = 2.33579f, x2 = 4.33579f, y2 = 2.0f, x3 = 4.75f, y3 = 2.0f)
                horizontalLineTo(x = 19.25f)
                curveTo(x1 = 19.6642f, y1 = 2.0f, x2 = 20.0f, y2 = 2.33579f, x3 = 20.0f, y3 = 2.75f)
                verticalLineTo(y = 10.3669f)
                lineTo(x = 21.0186f, y = 10.0366f)
                curveTo(x1 = 21.2469f, y1 = 9.96254f, x2 = 21.4969f, y2 = 10.0022f, x3 = 21.691f, y3 = 10.1434f)
                curveTo(x1 = 21.8851f, y1 = 10.2845f, x2 = 22.0f, y2 = 10.51f, x3 = 22.0f, y3 = 10.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 22.0f, y1 = 20.6642f, x2 = 21.6642f, y2 = 21.0f, x3 = 21.25f, y3 = 21.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 21.0f, x2 = 2.0f, y2 = 20.6642f, x3 = 2.0f, y3 = 20.25f)
                verticalLineTo(y = 10.75f)
                curveTo(x1 = 2.0f, y1 = 10.51f, x2 = 2.11487f, y2 = 10.2845f, x3 = 2.309f, y3 = 10.1434f)
                curveTo(x1 = 2.50313f, y1 = 10.0022f, x2 = 2.75308f, y2 = 9.96254f, x3 = 2.98138f, y3 = 10.0366f)
                lineTo(x = 4.0f, y = 10.3669f)
                verticalLineTo(y = 2.75f)
                close()
                moveTo(x = 5.5f, y = 10.8534f)
                lineTo(x = 12.0f, y = 12.9615f)
                lineTo(x = 18.5f, y = 10.8534f)
                verticalLineTo(y = 3.5f)
                horizontalLineTo(x = 5.5f)
                verticalLineTo(y = 10.8534f)
                close()
                moveTo(x = 9.0f, y = 7.75f)
                curveTo(x1 = 9.0f, y1 = 7.33579f, x2 = 9.33579f, y2 = 7.0f, x3 = 9.75f, y3 = 7.0f)
                horizontalLineTo(x = 14.25f)
                curveTo(x1 = 14.6642f, y1 = 7.0f, x2 = 15.0f, y2 = 7.33579f, x3 = 15.0f, y3 = 7.75f)
                curveTo(x1 = 15.0f, y1 = 8.16421f, x2 = 14.6642f, y2 = 8.5f, x3 = 14.25f, y3 = 8.5f)
                horizontalLineTo(x = 9.75f)
                curveTo(x1 = 9.33579f, y1 = 8.5f, x2 = 9.0f, y2 = 8.16421f, x3 = 9.0f, y3 = 7.75f)
                close()
            }
        }.build().also { _invite = it }
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
                imageVector = Invite,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _invite: ImageVector? = null
