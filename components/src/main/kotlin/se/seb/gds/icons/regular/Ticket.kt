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

val Ticket: ImageVector
    get() {
        val current = _ticket
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Ticket",
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
                moveTo(x = 15.25f, y = 7.75f)
                verticalLineTo(y = 8.25f)
                moveTo(x = 15.25f, y = 11.75f)
                verticalLineTo(y = 12.25f)
                moveTo(x = 15.25f, y = 15.75f)
                verticalLineTo(y = 16.25f)
                moveTo(x = 2.75f, y = 4.75f)
                horizontalLineTo(x = 21.25f)
                verticalLineTo(y = 9.25f)
                curveTo(x1 = 18.5f, y1 = 10.0f, x2 = 18.5f, y2 = 14.0f, x3 = 21.25f, y3 = 14.75f)
                verticalLineTo(y = 19.25f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 14.75f)
                curveTo(x1 = 5.5f, y1 = 14.0f, x2 = 5.5f, y2 = 10.0f, x3 = 2.75f, y3 = 9.25f)
                verticalLineTo(y = 4.75f)
                close()
            }
        }.build().also { _ticket = it }
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
                imageVector = Ticket,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _ticket: ImageVector? = null
