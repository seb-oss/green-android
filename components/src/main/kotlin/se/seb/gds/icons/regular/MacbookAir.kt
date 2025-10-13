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

internal val MacbookAir: ImageVector
    get() {
        val current = _macbookAir
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.MacbookAir",
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
                moveTo(x = 21.25f, y = 13.75f)
                verticalLineTo(y = 4.75f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 13.75f)
                moveTo(x = 1.75f, y = 16.75f)
                verticalLineTo(y = 18.25f)
                curveTo(x1 = 1.75f, y1 = 18.8023f, x2 = 2.19772f, y2 = 19.25f, x3 = 2.75f, y3 = 19.25f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.8023f, y1 = 19.25f, x2 = 22.25f, y2 = 18.8023f, x3 = 22.25f, y3 = 18.25f)
                verticalLineTo(y = 16.75f)
                horizontalLineTo(x = 15.075f)
                lineTo(x = 14.1f, y = 17.25f)
                horizontalLineTo(x = 10.0f)
                lineTo(x = 8.925f, y = 16.75f)
                horizontalLineTo(x = 1.75f)
                close()
            }
        }.build().also { _macbookAir = it }
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
                imageVector = MacbookAir,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _macbookAir: ImageVector? = null
