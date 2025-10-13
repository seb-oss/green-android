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

internal val InboxEmpty: ImageVector
    get() {
        val current = _inboxEmpty
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.InboxEmpty",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 5.39161f, y = 4.0f)
                horizontalLineTo(x = 18.6084f)
                lineTo(x = 23.0f, y = 12.569f)
                verticalLineTo(y = 20.0f)
                horizontalLineTo(x = 1.0f)
                verticalLineTo(y = 12.569f)
                lineTo(x = 5.39161f, y = 4.0f)
                close()
                moveTo(x = 21.5f, y = 13.5f)
                verticalLineTo(y = 18.5f)
                horizontalLineTo(x = 2.5f)
                verticalLineTo(y = 13.5f)
                horizontalLineTo(x = 8.04306f)
                lineTo(x = 9.58056f, y = 15.5f)
                horizontalLineTo(x = 14.4194f)
                lineTo(x = 15.9569f, y = 13.5f)
                horizontalLineTo(x = 21.5f)
                close()
            }
        }.build().also { _inboxEmpty = it }
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
                imageVector = InboxEmpty,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _inboxEmpty: ImageVector? = null
