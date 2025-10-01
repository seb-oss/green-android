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

val Unlocked: ImageVector
    get() {
        val current = _unlocked
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Unlocked",
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
                moveTo(x = 12.0f, y = 14.0f)
                verticalLineTo(y = 17.0f)
                moveTo(x = 7.75f, y = 9.75f)
                verticalLineTo(y = 7.0f)
                curveTo(x1 = 7.75f, y1 = 4.65279f, x2 = 9.65279f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 14.0926f, y1 = 2.75f, x2 = 15.832f, y2 = 4.26237f, x3 = 16.1847f, y3 = 6.25371f)
                moveTo(x = 4.75f, y = 9.75f)
                horizontalLineTo(x = 19.25f)
                verticalLineTo(y = 21.25f)
                horizontalLineTo(x = 4.75f)
                verticalLineTo(y = 9.75f)
                close()
            }
        }.build().also { _unlocked = it }
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
                imageVector = Unlocked,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _unlocked: ImageVector? = null
