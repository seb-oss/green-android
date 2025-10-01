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

val Car: ImageVector
    get() {
        val current = _car
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Car",
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
                moveTo(x = 2.25f, y = 10.75f)
                lineTo(x = 6.0f, y = 4.75f)
                horizontalLineTo(x = 18.0f)
                lineTo(x = 21.75f, y = 10.75f)
                moveTo(x = 2.25f, y = 10.75f)
                horizontalLineTo(x = 0.75f)
                moveTo(x = 2.25f, y = 10.75f)
                verticalLineTo(y = 19.25f)
                horizontalLineTo(x = 5.75f)
                verticalLineTo(y = 17.1786f)
                horizontalLineTo(x = 18.25f)
                verticalLineTo(y = 19.25f)
                horizontalLineTo(x = 21.75f)
                verticalLineTo(y = 10.75f)
                moveTo(x = 21.75f, y = 10.75f)
                horizontalLineTo(x = 23.25f)
                moveTo(x = 5.75f, y = 13.0357f)
                horizontalLineTo(x = 7.75f)
                moveTo(x = 16.25f, y = 13.0357f)
                horizontalLineTo(x = 18.25f)
            }
        }.build().also { _car = it }
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
                imageVector = Car,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _car: ImageVector? = null
