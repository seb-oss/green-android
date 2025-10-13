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

internal val Law: ImageVector
    get() {
        val current = _law
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Law",
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
                moveTo(x = 12.0f, y = 2.75f)
                verticalLineTo(y = 20.25f)
                moveTo(x = 12.0f, y = 20.25f)
                horizontalLineTo(x = 6.75f)
                moveTo(x = 12.0f, y = 20.25f)
                horizontalLineTo(x = 17.25f)
                moveTo(x = 2.75f, y = 5.75f)
                horizontalLineTo(x = 8.0f)
                lineTo(x = 10.0f, y = 4.75f)
                horizontalLineTo(x = 14.0f)
                lineTo(x = 16.0f, y = 5.75f)
                horizontalLineTo(x = 21.25f)
                moveTo(x = 5.5f, y = 5.75f)
                lineTo(x = 2.5f, y = 15.25f)
                curveTo(x1 = 4.57693f, y1 = 16.4267f, x2 = 6.42307f, y2 = 16.4267f, x3 = 8.5f, y3 = 15.25f)
                lineTo(x = 5.5f, y = 5.75f)
                close()
                moveTo(x = 18.5f, y = 5.75f)
                lineTo(x = 15.5f, y = 15.25f)
                curveTo(x1 = 17.5769f, y1 = 16.4267f, x2 = 19.4231f, y2 = 16.4267f, x3 = 21.5f, y3 = 15.25f)
                lineTo(x = 18.5f, y = 5.75f)
                close()
            }
        }.build().also { _law = it }
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
                imageVector = Law,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _law: ImageVector? = null
