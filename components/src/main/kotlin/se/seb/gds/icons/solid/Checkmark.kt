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

internal val Checkmark: ImageVector
    get() {
        val current = _checkmark
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Checkmark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 21.7425f, y = 2.99442f)
                curveTo(x1 = 22.2979f, y1 = 3.40452f, x2 = 22.4156f, y2 = 4.18717f, x3 = 22.0055f, y3 = 4.74251f)
                lineTo(x = 10.0055f, y = 20.9925f)
                curveTo(x1 = 9.80427f, y1 = 21.2651f, x2 = 9.501f, y2 = 21.4442f, x3 = 9.16518f, y3 = 21.489f)
                curveTo(x1 = 8.82936f, y1 = 21.5338f, x2 = 8.48974f, y2 = 21.4403f, x3 = 8.22411f, y3 = 21.23f)
                lineTo(x = 2.22411f, y = 16.48f)
                curveTo(x1 = 1.68284f, y1 = 16.0515f, x2 = 1.59143f, y2 = 15.2654f, x3 = 2.01993f, y3 = 14.7241f)
                curveTo(x1 = 2.44844f, y1 = 14.1828f, x2 = 3.2346f, y2 = 14.0914f, x3 = 3.77587f, y3 = 14.5199f)
                lineTo(x = 8.76235f, y = 18.4675f)
                lineTo(x = 19.9944f, y = 3.2574f)
                curveTo(x1 = 20.4045f, y1 = 2.70206f, x2 = 21.1872f, y2 = 2.58432f, x3 = 21.7425f, y3 = 2.99442f)
                close()
            }
        }.build().also { _checkmark = it }
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
                imageVector = Checkmark,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _checkmark: ImageVector? = null
