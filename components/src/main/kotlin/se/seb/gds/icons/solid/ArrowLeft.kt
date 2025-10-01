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

val ArrowLeft: ImageVector
    get() {
        val current = _arrowLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 10.8839f, y = 18.6339f)
                curveTo(x1 = 10.3957f, y1 = 19.122f, x2 = 9.60427f, y2 = 19.122f, x3 = 9.11612f, y3 = 18.6339f)
                lineTo(x = 3.36612f, y = 12.8839f)
                curveTo(x1 = 3.1317f, y1 = 12.6495f, x2 = 3.0f, y2 = 12.3315f, x3 = 3.0f, y3 = 12.0f)
                curveTo(x1 = 3.0f, y1 = 11.6685f, x2 = 3.13169f, y2 = 11.3506f, x3 = 3.36612f, y3 = 11.1161f)
                lineTo(x = 9.11612f, y = 5.36612f)
                curveTo(x1 = 9.60427f, y1 = 4.87796f, x2 = 10.3957f, y2 = 4.87796f, x3 = 10.8839f, y3 = 5.36612f)
                curveTo(x1 = 11.372f, y1 = 5.85427f, x2 = 11.372f, y2 = 6.64573f, x3 = 10.8839f, y3 = 7.13388f)
                lineTo(x = 7.26776f, y = 10.75f)
                horizontalLineTo(x = 19.75f)
                curveTo(x1 = 20.4404f, y1 = 10.75f, x2 = 21.0f, y2 = 11.3097f, x3 = 21.0f, y3 = 12.0f)
                curveTo(x1 = 21.0f, y1 = 12.6904f, x2 = 20.4404f, y2 = 13.25f, x3 = 19.75f, y3 = 13.25f)
                horizontalLineTo(x = 7.26777f)
                lineTo(x = 10.8839f, y = 16.8661f)
                curveTo(x1 = 11.372f, y1 = 17.3543f, x2 = 11.372f, y2 = 18.1457f, x3 = 10.8839f, y3 = 18.6339f)
                close()
            }
        }.build().also { _arrowLeft = it }
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
                imageVector = ArrowLeft,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowLeft: ImageVector? = null
