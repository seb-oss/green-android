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

val ArrowUp: ImageVector
    get() {
        val current = _arrowUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.0f, y = 3.0f)
                curveTo(x1 = 12.3315f, y1 = 3.0f, x2 = 12.6494f, y2 = 3.1317f, x3 = 12.8839f, y3 = 3.36612f)
                lineTo(x = 18.6339f, y = 9.11612f)
                curveTo(x1 = 19.122f, y1 = 9.60427f, x2 = 19.122f, y2 = 10.3957f, x3 = 18.6339f, y3 = 10.8839f)
                curveTo(x1 = 18.1457f, y1 = 11.372f, x2 = 17.3543f, y2 = 11.372f, x3 = 16.8661f, y3 = 10.8839f)
                lineTo(x = 13.25f, y = 7.26776f)
                verticalLineTo(y = 19.75f)
                curveTo(x1 = 13.25f, y1 = 20.4404f, x2 = 12.6903f, y2 = 21.0f, x3 = 12.0f, y3 = 21.0f)
                curveTo(x1 = 11.3096f, y1 = 21.0f, x2 = 10.75f, y2 = 20.4404f, x3 = 10.75f, y3 = 19.75f)
                verticalLineTo(y = 7.26777f)
                lineTo(x = 7.13388f, y = 10.8839f)
                curveTo(x1 = 6.64573f, y1 = 11.372f, x2 = 5.85427f, y2 = 11.372f, x3 = 5.36612f, y3 = 10.8839f)
                curveTo(x1 = 4.87796f, y1 = 10.3957f, x2 = 4.87796f, y2 = 9.60427f, x3 = 5.36612f, y3 = 9.11612f)
                lineTo(x = 11.1161f, y = 3.36612f)
                curveTo(x1 = 11.3505f, y1 = 3.1317f, x2 = 11.6685f, y2 = 3.0f, x3 = 12.0f, y3 = 3.0f)
                close()
            }
        }.build().also { _arrowUp = it }
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
                imageVector = ArrowUp,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowUp: ImageVector? = null
