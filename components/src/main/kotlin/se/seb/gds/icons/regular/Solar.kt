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

internal val Solar: ImageVector
    get() {
        val current = _solar
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Solar",
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
                moveTo(x = 12.0f, y = 15.75f)
                horizontalLineTo(x = 19.1944f)
                lineTo(x = 21.25f, y = 20.25f)
                horizontalLineTo(x = 12.0f)
                moveTo(x = 12.0f, y = 15.75f)
                horizontalLineTo(x = 4.80556f)
                lineTo(x = 2.75f, y = 20.25f)
                horizontalLineTo(x = 12.0f)
                moveTo(x = 12.0f, y = 15.75f)
                verticalLineTo(y = 20.25f)
                moveTo(x = 12.0f, y = 9.75f)
                verticalLineTo(y = 11.25f)
                moveTo(x = 18.75f, y = 3.75f)
                horizontalLineTo(x = 20.25f)
                moveTo(x = 3.75f, y = 3.75f)
                horizontalLineTo(x = 5.25f)
                moveTo(x = 7.5f, y = 8.0f)
                lineTo(x = 6.5f, y = 9.0f)
                moveTo(x = 16.5f, y = 8.0f)
                lineTo(x = 17.5f, y = 9.0f)
                moveTo(x = 8.83697f, y = 3.75f)
                curveTo(x1 = 9.17555f, y1 = 5.18335f, x2 = 10.4632f, y2 = 6.25f, x3 = 12.0f, y3 = 6.25f)
                curveTo(x1 = 13.5368f, y1 = 6.25f, x2 = 14.8245f, y2 = 5.18335f, x3 = 15.163f, y3 = 3.75f)
            }
        }.build().also { _solar = it }
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
                imageVector = Solar,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _solar: ImageVector? = null
