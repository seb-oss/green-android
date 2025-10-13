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

internal val ArrowRightUpCircle: ImageVector
    get() {
        val current = _arrowRightUpCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowRightUpCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                curveTo(x1 = 22.0f, y1 = 6.47715f, x2 = 17.5228f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                close()
                moveTo(x = 16.0f, y = 8.75f)
                curveTo(x1 = 16.0f, y1 = 8.33579f, x2 = 15.6642f, y2 = 8.0f, x3 = 15.25f, y3 = 8.0f)
                horizontalLineTo(x = 9.75f)
                curveTo(x1 = 9.33579f, y1 = 8.0f, x2 = 9.0f, y2 = 8.33579f, x3 = 9.0f, y3 = 8.75f)
                curveTo(x1 = 9.0f, y1 = 9.16421f, x2 = 9.33579f, y2 = 9.5f, x3 = 9.75f, y3 = 9.5f)
                horizontalLineTo(x = 13.4393f)
                lineTo(x = 8.21967f, y = 14.7197f)
                curveTo(x1 = 7.92678f, y1 = 15.0126f, x2 = 7.92678f, y2 = 15.4874f, x3 = 8.21967f, y3 = 15.7803f)
                curveTo(x1 = 8.51256f, y1 = 16.0732f, x2 = 8.98744f, y2 = 16.0732f, x3 = 9.28033f, y3 = 15.7803f)
                lineTo(x = 14.5f, y = 10.5607f)
                verticalLineTo(y = 14.25f)
                curveTo(x1 = 14.5f, y1 = 14.6642f, x2 = 14.8358f, y2 = 15.0f, x3 = 15.25f, y3 = 15.0f)
                curveTo(x1 = 15.6642f, y1 = 15.0f, x2 = 16.0f, y2 = 14.6642f, x3 = 16.0f, y3 = 14.25f)
                verticalLineTo(y = 8.75f)
                close()
            }
        }.build().also { _arrowRightUpCircle = it }
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
                imageVector = ArrowRightUpCircle,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowRightUpCircle: ImageVector? = null
