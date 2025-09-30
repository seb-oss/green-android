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

val PencilWave: ImageVector
    get() {
        val current = _pencilWave
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PencilWave",
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
                    moveTo(x = 21.0f, y = 18.0f)
                    curveTo(x1 = 21.0f, y1 = 18.0f, x2 = 19.666f, y2 = 19.5444f, x3 = 18.166f, y3 = 19.5444f)
                    curveTo(x1 = 16.666f, y1 = 19.5444f, x2 = 15.4594f, y2 = 18.115f, x3 = 13.9866f, y3 = 18.115f)
                    curveTo(x1 = 12.5138f, y1 = 18.115f, x2 = 11.6598f, y2 = 18.786f, x3 = 10.75f, y3 = 19.75f)
                    moveTo(x = 17.0f, y = 2.75f)
                    lineTo(x = 20.25f, y = 6.0f)
                    lineTo(x = 6.0f, y = 20.25f)
                    horizontalLineTo(x = 2.75f)
                    verticalLineTo(y = 17.0f)
                    lineTo(x = 17.0f, y = 2.75f)
                    close()
                }
            }.build()
            .also { _pencilWave = it }
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
                imageVector = PencilWave,
                contentDescription = null,
                modifier =
                    Modifier
                        .width((24.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _pencilWave: ImageVector? = null
