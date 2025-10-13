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

internal val ChartPresentation: ImageVector
    get() {
        val current = _chartPresentation
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ChartPresentation",
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
                moveTo(x = 16.0f, y = 21.75f)
                lineTo(x = 15.1431f, y = 18.7507f)
                moveTo(x = 8.0f, y = 21.75f)
                lineTo(x = 8.85694f, y = 18.7507f)
                moveTo(x = 7.75f, y = 12.75f)
                verticalLineTo(y = 14.25f)
                moveTo(x = 12.0f, y = 7.75f)
                verticalLineTo(y = 14.25f)
                moveTo(x = 16.25f, y = 10.75f)
                verticalLineTo(y = 14.25f)
                moveTo(x = 21.25f, y = 3.75f)
                verticalLineTo(y = 18.25f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 21.25f)
                close()
            }
        }.build().also { _chartPresentation = it }
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
                imageVector = ChartPresentation,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _chartPresentation: ImageVector? = null
