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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val CloudySun: ImageVector
    get() {
        val current = _cloudySun
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CloudySun",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 22.25f, y = 9.75f)
                    horizontalLineTo(x = 23.25f)
                    moveTo(x = 15.25f, y = 2.75f)
                    verticalLineTo(y = 1.75f)
                    moveTo(x = 20.1997f, y = 4.80025f)
                    lineTo(x = 20.9069f, y = 4.09315f)
                    moveTo(x = 9.59375f, y = 4.09315f)
                    lineTo(x = 10.3009f, y = 4.80026f)
                    moveTo(x = 18.5495f, y = 12.0119f)
                    curveTo(x1 = 18.9914f, y1 = 11.3686f, x2 = 19.25f, y2 = 10.5895f, x3 = 19.25f, y3 = 9.75f)
                    curveTo(x1 = 19.25f, y1 = 7.54086f, x2 = 17.4591f, y2 = 5.75f, x3 = 15.25f, y3 = 5.75f)
                    curveTo(x1 = 13.2972f, y1 = 5.75f, x2 = 11.6713f, y2 = 7.14935f, x3 = 11.3202f, y3 = 9.0f)
                    moveTo(x = 16.625f, y = 11.95f)
                    curveTo(x1 = 15.867f, y1 = 11.95f, x2 = 15.1517f, y2 = 12.1333f, x3 = 14.5203f, y3 = 12.4583f)
                    curveTo(x1 = 13.872f, y1 = 11.0435f, x2 = 12.7092f, y2 = 9.91622f, x3 = 11.273f, y3 = 9.31871f)
                    curveTo(x1 = 10.547f, y1 = 9.01667f, x2 = 9.7512f, y2 = 8.85f, x3 = 8.91667f, y3 = 8.85f)
                    curveTo(x1 = 5.51091f, y1 = 8.85f, x2 = 2.75f, y2 = 11.6258f, x3 = 2.75f, y3 = 15.05f)
                    curveTo(x1 = 2.75f, y1 = 18.4742f, x2 = 5.51091f, y2 = 21.25f, x3 = 8.91667f, y3 = 21.25f)
                    horizontalLineTo(x = 16.625f)
                    curveTo(x1 = 19.1793f, y1 = 21.25f, x2 = 21.25f, y2 = 19.1681f, x3 = 21.25f, y3 = 16.6f)
                    curveTo(x1 = 21.25f, y1 = 14.6435f, x2 = 20.0481f, y2 = 12.9692f, x3 = 18.3462f, y3 = 12.2827f)
                    curveTo(x1 = 17.8142f, y1 = 12.0681f, x2 = 17.2333f, y2 = 11.95f, x3 = 16.625f, y3 = 11.95f)
                    close()
                }
            }.build()
            .also { _cloudySun = it }
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
                imageVector = CloudySun,
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
private var _cloudySun: ImageVector? = null
