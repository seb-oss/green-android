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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val InboxEmpty: ImageVector
    get() {
        val current = _inboxEmpty
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.InboxEmpty",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 2.0f, y = 12.75f)
                    horizontalLineTo(x = 8.4125f)
                    lineTo(x = 9.95f, y = 14.75f)
                    horizontalLineTo(x = 14.05f)
                    lineTo(x = 15.5875f, y = 12.75f)
                    horizontalLineTo(x = 22.0f)
                    moveTo(x = 22.25f, y = 12.75f)
                    lineTo(x = 18.15f, y = 4.75f)
                    horizontalLineTo(x = 5.85f)
                    lineTo(x = 1.75f, y = 12.75f)
                    verticalLineTo(y = 19.25f)
                    horizontalLineTo(x = 22.25f)
                    verticalLineTo(y = 12.75f)
                    close()
                }
            }.build()
            .also { _inboxEmpty = it }
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
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _inboxEmpty: ImageVector? = null
