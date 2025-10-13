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

internal val Megaphone: ImageVector
    get() {
        val current = _megaphone
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Megaphone",
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
                moveTo(x = 18.2478f, y = 14.0f)
                curveTo(x1 = 19.9047f, y1 = 14.0f, x2 = 21.2478f, y2 = 12.6569f, x3 = 21.2478f, y3 = 11.0f)
                curveTo(x1 = 21.2478f, y1 = 9.34315f, x2 = 19.9047f, y2 = 8.0f, x3 = 18.2478f, y3 = 8.0f)
                moveTo(x = 12.5771f, y = 18.25f)
                curveTo(x1 = 12.1653f, y1 = 19.4152f, x2 = 11.054f, y2 = 20.25f, x3 = 9.7478f, y3 = 20.25f)
                curveTo(x1 = 8.09095f, y1 = 20.25f, x2 = 6.7478f, y2 = 18.9069f, x3 = 6.7478f, y3 = 17.25f)
                verticalLineTo(y = 15.75f)
                moveTo(x = 6.75f, y = 6.25f)
                verticalLineTo(y = 15.75f)
                moveTo(x = 18.2478f, y = 2.75f)
                verticalLineTo(y = 19.25f)
                lineTo(x = 2.7478f, y = 14.4643f)
                verticalLineTo(y = 7.53571f)
                lineTo(x = 18.2478f, y = 2.75f)
                close()
            }
        }.build().also { _megaphone = it }
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
                imageVector = Megaphone,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _megaphone: ImageVector? = null
