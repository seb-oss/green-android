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

val Moon: ImageVector
    get() {
        val current = _moon
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Moon",
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
                    moveTo(x = 21.248f, y = 11.8112f)
                    curveTo(x1 = 20.1888f, y1 = 12.56f, x2 = 18.8957f, y2 = 13.0f, x3 = 17.4999f, y3 = 13.0f)
                    curveTo(x1 = 13.91f, y1 = 13.0f, x2 = 10.9999f, y2 = 10.0899f, x3 = 10.9999f, y3 = 6.5f)
                    curveTo(x1 = 10.9999f, y1 = 5.10416f, x2 = 11.4399f, y2 = 3.81108f, x3 = 12.1887f, y3 = 2.75189f)
                    curveTo(x1 = 12.1259f, y1 = 2.75063f, x2 = 12.063f, y2 = 2.75f, x3 = 11.9999f, y3 = 2.75f)
                    curveTo(x1 = 6.89124f, y1 = 2.75f, x2 = 2.74988f, y2 = 6.89137f, x3 = 2.74988f, y3 = 12.0f)
                    curveTo(x1 = 2.74988f, y1 = 17.1086f, x2 = 6.89124f, y2 = 21.25f, x3 = 11.9999f, y3 = 21.25f)
                    curveTo(x1 = 17.1085f, y1 = 21.25f, x2 = 21.2499f, y2 = 17.1086f, x3 = 21.2499f, y3 = 12.0f)
                    curveTo(x1 = 21.2499f, y1 = 11.9369f, x2 = 21.2492f, y2 = 11.874f, x3 = 21.248f, y3 = 11.8112f)
                    close()
                }
            }.build()
            .also { _moon = it }
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
                imageVector = Moon,
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
private var _moon: ImageVector? = null
