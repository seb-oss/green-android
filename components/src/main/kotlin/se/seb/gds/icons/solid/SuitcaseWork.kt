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

val SuitcaseWork: ImageVector
    get() {
        val current = _suitcaseWork
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SuitcaseWork",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 7.0f, y = 2.75f)
                curveTo(x1 = 7.0f, y1 = 2.33579f, x2 = 7.33579f, y2 = 2.0f, x3 = 7.75f, y3 = 2.0f)
                horizontalLineTo(x = 16.25f)
                curveTo(x1 = 16.6642f, y1 = 2.0f, x2 = 17.0f, y2 = 2.33579f, x3 = 17.0f, y3 = 2.75f)
                verticalLineTo(y = 6.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 6.0f, x2 = 22.0f, y2 = 6.33579f, x3 = 22.0f, y3 = 6.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 22.0f, y1 = 20.6642f, x2 = 21.6642f, y2 = 21.0f, x3 = 21.25f, y3 = 21.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.33579f, y1 = 21.0f, x2 = 2.0f, y2 = 20.6642f, x3 = 2.0f, y3 = 20.25f)
                verticalLineTo(y = 6.75f)
                curveTo(x1 = 2.0f, y1 = 6.33579f, x2 = 2.33579f, y2 = 6.0f, x3 = 2.75f, y3 = 6.0f)
                horizontalLineTo(x = 7.0f)
                verticalLineTo(y = 2.75f)
                close()
                moveTo(x = 8.5f, y = 6.0f)
                horizontalLineTo(x = 15.5f)
                verticalLineTo(y = 3.5f)
                horizontalLineTo(x = 8.5f)
                verticalLineTo(y = 6.0f)
                close()
            }
        }.build().also { _suitcaseWork = it }
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
                imageVector = SuitcaseWork,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _suitcaseWork: ImageVector? = null
