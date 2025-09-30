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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val ArrowShareLeft: ImageVector
    get() {
        val current = _arrowShareLeft
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowShareLeft",
                defaultWidth = 25.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 25.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 2.75f, y = 12.0f)
                    lineTo(x = 12.25f, y = 3.75f)
                    verticalLineTo(y = 8.5f)
                    curveTo(x1 = 20.75f, y1 = 8.5f, x2 = 23.0f, y2 = 11.75f, x3 = 23.0f, y3 = 20.25f)
                    curveTo(x1 = 21.5f, y1 = 17.25f, x2 = 20.75f, y2 = 15.5f, x3 = 12.25f, y3 = 15.5f)
                    verticalLineTo(y = 20.25f)
                    lineTo(x = 2.75f, y = 12.0f)
                    close()
                }
            }.build()
            .also { _arrowShareLeft = it }
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
                imageVector = ArrowShareLeft,
                contentDescription = null,
                modifier =
                    Modifier
                        .width((25.0).dp)
                        .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowShareLeft: ImageVector? = null
