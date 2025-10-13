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

internal val History: ImageVector
    get() {
        val current = _history
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.History",
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
                moveTo(x = 12.0f, y = 7.75f)
                verticalLineTo(y = 12.0f)
                lineTo(x = 15.5f, y = 15.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.75f, y = 4.75f)
                verticalLineTo(y = 8.75f)
                horizontalLineTo(x = 6.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.25f, y = 15.0833f)
                curveTo(x1 = 4.52169f, y1 = 18.676f, x2 = 7.95303f, y2 = 21.25f, x3 = 11.9864f, y3 = 21.25f)
                curveTo(x1 = 17.1026f, y1 = 21.25f, x2 = 21.25f, y2 = 17.1086f, x3 = 21.25f, y3 = 12.0f)
                curveTo(x1 = 21.25f, y1 = 6.89137f, x2 = 17.1026f, y2 = 2.75f, x3 = 11.9864f, y3 = 2.75f)
                curveTo(x1 = 8.14808f, y1 = 2.75f, x2 = 4.85497f, y2 = 5.08106f, x3 = 3.44947f, y3 = 8.40278f)
            }
        }.build().also { _history = it }
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
                imageVector = History,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _history: ImageVector? = null
