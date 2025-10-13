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

internal val ArrowRotateRightLeft: ImageVector
    get() {
        val current = _arrowRotateRightLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.ArrowRotateRightLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 6.3448f, y = 17.0f)
                curveTo(x1 = 7.73561f, y1 = 18.5332f, x2 = 9.77612f, y2 = 19.5f, x3 = 12.0f, y3 = 19.5f)
                curveTo(x1 = 16.1421f, y1 = 19.5f, x2 = 19.5f, y2 = 16.1421f, x3 = 19.5f, y3 = 12.0f)
                curveTo(x1 = 19.5f, y1 = 11.6819f, x2 = 19.4802f, y2 = 11.3687f, x3 = 19.4419f, y3 = 11.0616f)
                curveTo(x1 = 19.3907f, y1 = 10.6505f, x2 = 19.6823f, y2 = 10.2758f, x3 = 20.0934f, y3 = 10.2245f)
                curveTo(x1 = 20.5044f, y1 = 10.1733f, x2 = 20.8792f, y2 = 10.4649f, x3 = 20.9304f, y3 = 10.8759f)
                curveTo(x1 = 20.9764f, y1 = 11.2445f, x2 = 21.0f, y2 = 11.6197f, x3 = 21.0f, y3 = 12.0f)
                curveTo(x1 = 21.0f, y1 = 16.9706f, x2 = 16.9706f, y2 = 21.0f, x3 = 12.0f, y3 = 21.0f)
                curveTo(x1 = 9.4791f, y1 = 21.0f, x2 = 7.1554f, y2 = 19.9626f, x3 = 5.5f, y3 = 18.2888f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 5.5f, y1 = 20.6642f, x2 = 5.16421f, y2 = 21.0f, x3 = 4.75f, y3 = 21.0f)
                curveTo(x1 = 4.33579f, y1 = 21.0f, x2 = 4.0f, y2 = 20.6642f, x3 = 4.0f, y3 = 20.25f)
                verticalLineTo(y = 16.25f)
                curveTo(x1 = 4.0f, y1 = 15.8358f, x2 = 4.33579f, y2 = 15.5f, x3 = 4.75f, y3 = 15.5f)
                horizontalLineTo(x = 8.75f)
                curveTo(x1 = 9.16421f, y1 = 15.5f, x2 = 9.5f, y2 = 15.8358f, x3 = 9.5f, y3 = 16.25f)
                curveTo(x1 = 9.5f, y1 = 16.6642f, x2 = 9.16421f, y2 = 17.0f, x3 = 8.75f, y3 = 17.0f)
                horizontalLineTo(x = 6.3448f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 4.55806f, y = 12.9384f)
                curveTo(x1 = 4.60932f, y1 = 13.3495f, x2 = 4.31766f, y2 = 13.7242f, x3 = 3.90663f, y3 = 13.7755f)
                curveTo(x1 = 3.4956f, y1 = 13.8267f, x2 = 3.12085f, y2 = 13.5351f, x3 = 3.06959f, y3 = 13.1241f)
                curveTo(x1 = 3.02364f, y1 = 12.7555f, x2 = 3.0f, y2 = 12.3803f, x3 = 3.0f, y3 = 12.0f)
                curveTo(x1 = 3.0f, y1 = 7.02944f, x2 = 7.02944f, y2 = 3.0f, x3 = 12.0f, y3 = 3.0f)
                curveTo(x1 = 14.5269f, y1 = 3.0f, x2 = 16.8557f, y2 = 4.04238f, x3 = 18.5118f, y3 = 5.72322f)
                verticalLineTo(y = 3.75f)
                curveTo(x1 = 18.5118f, y1 = 3.33579f, x2 = 18.8476f, y2 = 3.0f, x3 = 19.2618f, y3 = 3.0f)
                curveTo(x1 = 19.6761f, y1 = 3.0f, x2 = 20.0118f, y2 = 3.33579f, x3 = 20.0118f, y3 = 3.75f)
                verticalLineTo(y = 7.75f)
                curveTo(x1 = 20.0118f, y1 = 8.16421f, x2 = 19.6761f, y2 = 8.5f, x3 = 19.2618f, y3 = 8.5f)
                horizontalLineTo(x = 15.2618f)
                curveTo(x1 = 14.8476f, y1 = 8.5f, x2 = 14.5118f, y2 = 8.16421f, x3 = 14.5118f, y3 = 7.75f)
                curveTo(x1 = 14.5118f, y1 = 7.33579f, x2 = 14.8476f, y2 = 7.0f, x3 = 15.2618f, y3 = 7.0f)
                horizontalLineTo(x = 17.6552f)
                curveTo(x1 = 16.2644f, y1 = 5.46681f, x2 = 14.2239f, y2 = 4.5f, x3 = 12.0f, y3 = 4.5f)
                curveTo(x1 = 7.85786f, y1 = 4.5f, x2 = 4.5f, y2 = 7.85786f, x3 = 4.5f, y3 = 12.0f)
                curveTo(x1 = 4.5f, y1 = 12.3181f, x2 = 4.51977f, y2 = 12.6313f, x3 = 4.55806f, y3 = 12.9384f)
                close()
            }
        }.build().also { _arrowRotateRightLeft = it }
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
                imageVector = ArrowRotateRightLeft,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _arrowRotateRightLeft: ImageVector? = null
