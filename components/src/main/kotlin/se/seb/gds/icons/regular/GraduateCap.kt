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

internal val GraduateCap: ImageVector
    get() {
        val current = _graduateCap
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.GraduateCap",
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
                moveTo(x = 23.25f, y = 9.0f)
                lineTo(x = 12.0f, y = 14.25f)
                lineTo(x = 0.75f, y = 9.0f)
                lineTo(x = 12.0f, y = 3.75f)
                lineTo(x = 23.25f, y = 9.0f)
                close()
                moveTo(x = 23.25f, y = 9.0f)
                verticalLineTo(y = 15.25f)
                moveTo(x = 4.75002f, y = 10.9688f)
                verticalLineTo(y = 16.6406f)
                lineTo(x = 12.0f, y = 20.25f)
                lineTo(x = 19.25f, y = 16.6406f)
                verticalLineTo(y = 10.9688f)
            }
        }.build().also { _graduateCap = it }
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
                imageVector = GraduateCap,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _graduateCap: ImageVector? = null
