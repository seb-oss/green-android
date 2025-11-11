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

internal val TriangleExclamation: ImageVector
    get() {
        val current = _triangleExclamation
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.TriangleExclamation",
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
                moveTo(x = 12.0f, y = 8.75f)
                verticalLineTo(y = 12.75f)
                moveTo(x = 12.0f, y = 15.5f)
                verticalLineTo(y = 15.49f)
                moveTo(x = 12.25f, y = 15.5f)
                curveTo(x1 = 12.25f, y1 = 15.6381f, x2 = 12.1381f, y2 = 15.75f, x3 = 12.0f, y3 = 15.75f)
                curveTo(x1 = 11.8619f, y1 = 15.75f, x2 = 11.75f, y2 = 15.6381f, x3 = 11.75f, y3 = 15.5f)
                curveTo(x1 = 11.75f, y1 = 15.3619f, x2 = 11.8619f, y2 = 15.25f, x3 = 12.0f, y3 = 15.25f)
                curveTo(x1 = 12.1381f, y1 = 15.25f, x2 = 12.25f, y2 = 15.3619f, x3 = 12.25f, y3 = 15.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Square,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.79693f, y = 16.2279f)
                lineTo(x = 10.2809f, y = 3.64118f)
                curveTo(x1 = 11.0561f, y1 = 2.33738f, x2 = 12.9438f, y2 = 2.33738f, x3 = 13.719f, y3 = 3.64118f)
                lineTo(x = 21.203f, y = 16.2279f)
                curveTo(x1 = 21.9957f, y1 = 17.561f, x2 = 21.035f, y2 = 19.25f, x3 = 19.484f, y3 = 19.25f)
                horizontalLineTo(x = 4.516f)
                curveTo(x1 = 2.96497f, y1 = 19.25f, x2 = 2.00424f, y2 = 17.561f, x3 = 2.79693f, y3 = 16.2279f)
                close()
            }
        }.build().also { _triangleExclamation = it }
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
                imageVector = TriangleExclamation,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _triangleExclamation: ImageVector? = null
