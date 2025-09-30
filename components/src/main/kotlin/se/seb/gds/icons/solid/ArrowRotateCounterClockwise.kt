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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val ArrowRotateCounterClockwise: ImageVector
    get() {
        val current = _arrowRotateCounterClockwise
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ArrowRotateCounterClockwise",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 19.5215f, y = 12.0f)
                    curveTo(x1 = 19.5215f, y1 = 7.85786f, x2 = 16.1636f, y2 = 4.5f, x3 = 12.0215f, y3 = 4.5f)
                    curveTo(x1 = 10.5588f, y1 = 4.5f, x2 = 9.39898f, y2 = 4.85088f, x3 = 8.36602f, y3 = 5.4849f)
                    curveTo(x1 = 7.64586f, y1 = 5.92693f, x2 = 6.97194f, y2 = 6.51595f, x3 = 6.29372f, y3 = 7.25f)
                    horizontalLineTo(x = 8.75f)
                    curveTo(x1 = 9.16422f, y1 = 7.25f, x2 = 9.5f, y2 = 7.58579f, x3 = 9.5f, y3 = 8.0f)
                    curveTo(x1 = 9.5f, y1 = 8.41421f, x2 = 9.16422f, y2 = 8.75f, x3 = 8.75f, y3 = 8.75f)
                    horizontalLineTo(x = 4.75f)
                    curveTo(x1 = 4.33579f, y1 = 8.75f, x2 = 4.0f, y2 = 8.41421f, x3 = 4.0f, y3 = 8.0f)
                    verticalLineTo(y = 4.0f)
                    curveTo(x1 = 4.0f, y1 = 3.58579f, x2 = 4.33579f, y2 = 3.25f, x3 = 4.75f, y3 = 3.25f)
                    curveTo(x1 = 5.16422f, y1 = 3.25f, x2 = 5.5f, y2 = 3.58579f, x3 = 5.5f, y3 = 4.0f)
                    verticalLineTo(y = 5.90758f)
                    curveTo(x1 = 6.15142f, y1 = 5.24074f, x2 = 6.83402f, y2 = 4.66521f, x3 = 7.58136f, y3 = 4.20651f)
                    curveTo(x1 = 8.85858f, y1 = 3.42256f, x2 = 10.2915f, y2 = 3.0f, x3 = 12.0215f, y3 = 3.0f)
                    curveTo(x1 = 16.9921f, y1 = 3.0f, x2 = 21.0215f, y2 = 7.02944f, x3 = 21.0215f, y3 = 12.0f)
                    curveTo(x1 = 21.0215f, y1 = 16.9706f, x2 = 16.9921f, y2 = 21.0f, x3 = 12.0215f, y3 = 21.0f)
                    curveTo(x1 = 8.10166f, y1 = 21.0f, x2 = 4.76895f, y2 = 18.4945f, x3 = 3.5338f, y3 = 14.9999f)
                    curveTo(x1 = 3.39576f, y1 = 14.6094f, x2 = 3.60046f, y2 = 14.1809f, x3 = 3.99099f, y3 = 14.0429f)
                    curveTo(x1 = 4.38153f, y1 = 13.9048f, x2 = 4.81002f, y2 = 14.1095f, x3 = 4.94806f, y3 = 14.5001f)
                    curveTo(x1 = 5.97801f, y1 = 17.4141f, x2 = 8.75711f, y2 = 19.5f, x3 = 12.0215f, y3 = 19.5f)
                    curveTo(x1 = 16.1636f, y1 = 19.5f, x2 = 19.5215f, y2 = 16.1421f, x3 = 19.5215f, y3 = 12.0f)
                    close()
                }
            }.build()
            .also { _arrowRotateCounterClockwise = it }
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
                imageVector = ArrowRotateCounterClockwise,
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
private var _arrowRotateCounterClockwise: ImageVector? = null
