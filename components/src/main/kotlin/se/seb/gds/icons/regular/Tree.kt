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

val Tree: ImageVector
    get() {
        val current = _tree
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Tree",
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
                moveTo(x = 12.0f, y = 21.25f)
                verticalLineTo(y = 15.0f)
                moveTo(x = 12.0f, y = 15.0f)
                lineTo(x = 9.75f, y = 12.75f)
                moveTo(x = 12.0f, y = 15.0f)
                lineTo(x = 15.25f, y = 11.75f)
                moveTo(x = 20.25f, y = 11.0f)
                curveTo(x1 = 20.25f, y1 = 15.5563f, x2 = 16.5563f, y2 = 19.25f, x3 = 12.0f, y3 = 19.25f)
                curveTo(x1 = 7.44365f, y1 = 19.25f, x2 = 3.75f, y2 = 15.5563f, x3 = 3.75f, y3 = 11.0f)
                curveTo(x1 = 3.75f, y1 = 6.44365f, x2 = 7.44365f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 16.5563f, y1 = 2.75f, x2 = 20.25f, y2 = 6.44365f, x3 = 20.25f, y3 = 11.0f)
                close()
            }
        }.build().also { _tree = it }
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
                imageVector = Tree,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _tree: ImageVector? = null
