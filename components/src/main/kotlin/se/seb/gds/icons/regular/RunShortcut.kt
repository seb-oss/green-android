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
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val RunShortcut: ImageVector
    get() {
        val current = _runShortcut
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.RunShortcut",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            group(
                clipPathData = PathData {
                    // M 0 0
                    moveTo(x = 0.0f, y = 0.0f)
                    // h 24
                    horizontalLineToRelative(dx = 24.0f)
                    // v 24
                    verticalLineToRelative(dy = 24.0f)
                    // h -24z
                    horizontalLineToRelative(dx = -24.0f)
                    close()
                },
            ) {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 9.75f, y = 16.75f)
                    lineTo(x = 14.25f, y = 7.25f)
                    moveTo(x = 3.75f, y = 3.75f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 3.75f)
                    close()
                }
            }
        }.build().also { _runShortcut = it }
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
                imageVector = RunShortcut,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _runShortcut: ImageVector? = null
