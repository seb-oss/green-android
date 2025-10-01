package se.seb.gds.icons.solid

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
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
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.75f, y = 19.9692f)
                verticalLineTo(y = 21.25f)
                curveTo(x1 = 12.75f, y1 = 21.6642f, x2 = 12.4142f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 11.5858f, y1 = 22.0f, x2 = 11.25f, y2 = 21.6642f, x3 = 11.25f, y3 = 21.25f)
                verticalLineTo(y = 19.9692f)
                curveTo(x1 = 6.63035f, y1 = 19.5881f, x2 = 3.0f, y2 = 15.718f, x3 = 3.0f, y3 = 11.0f)
                curveTo(x1 = 3.0f, y1 = 6.02944f, x2 = 7.02944f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 16.9706f, y1 = 2.0f, x2 = 21.0f, y2 = 6.02944f, x3 = 21.0f, y3 = 11.0f)
                curveTo(x1 = 21.0f, y1 = 15.718f, x2 = 17.3696f, y2 = 19.5881f, x3 = 12.75f, y3 = 19.9692f)
                close()
                moveTo(x = 11.25f, y = 18.463f)
                verticalLineTo(y = 15.3107f)
                lineTo(x = 9.21967f, y = 13.2803f)
                curveTo(x1 = 8.92678f, y1 = 12.9874f, x2 = 8.92678f, y2 = 12.5126f, x3 = 9.21967f, y3 = 12.2197f)
                curveTo(x1 = 9.51256f, y1 = 11.9268f, x2 = 9.98744f, y2 = 11.9268f, x3 = 10.2803f, y3 = 12.2197f)
                lineTo(x = 12.0f, y = 13.9393f)
                lineTo(x = 14.7197f, y = 11.2197f)
                curveTo(x1 = 15.0126f, y1 = 10.9268f, x2 = 15.4874f, y2 = 10.9268f, x3 = 15.7803f, y3 = 11.2197f)
                curveTo(x1 = 16.0732f, y1 = 11.5126f, x2 = 16.0732f, y2 = 11.9874f, x3 = 15.7803f, y3 = 12.2803f)
                lineTo(x = 12.75f, y = 15.3107f)
                verticalLineTo(y = 18.463f)
                curveTo(x1 = 12.5033f, y1 = 18.4875f, x2 = 12.2531f, y2 = 18.5f, x3 = 12.0f, y3 = 18.5f)
                curveTo(x1 = 11.7469f, y1 = 18.5f, x2 = 11.4967f, y2 = 18.4875f, x3 = 11.25f, y3 = 18.463f)
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
