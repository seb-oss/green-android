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

val Solar: ImageVector
    get() {
        val current = _solar
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Solar",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 15.3355f, y = 3.02009f)
                    horizontalLineTo(x = 8.66455f)
                    curveTo(x1 = 8.26143f, y1 = 3.11531f, x2 = 8.01183f, y2 = 3.5193f, x3 = 8.10706f, y3 = 3.92242f)
                    curveTo(x1 = 8.52378f, y1 = 5.68657f, x2 = 10.1076f, y2 = 7.0f, x3 = 12.0f, y3 = 7.0f)
                    curveTo(x1 = 13.8924f, y1 = 7.0f, x2 = 15.4762f, y2 = 5.68657f, x3 = 15.8929f, y3 = 3.92242f)
                    curveTo(x1 = 15.9882f, y1 = 3.5193f, x2 = 15.7386f, y2 = 3.11531f, x3 = 15.3355f, y3 = 3.02009f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 3.75f, y = 3.0f)
                    curveTo(x1 = 3.33579f, y1 = 3.0f, x2 = 3.0f, y2 = 3.33579f, x3 = 3.0f, y3 = 3.75f)
                    curveTo(x1 = 3.0f, y1 = 4.16421f, x2 = 3.33579f, y2 = 4.5f, x3 = 3.75f, y3 = 4.5f)
                    horizontalLineTo(x = 5.25f)
                    curveTo(x1 = 5.66422f, y1 = 4.5f, x2 = 6.0f, y2 = 4.16421f, x3 = 6.0f, y3 = 3.75f)
                    curveTo(x1 = 6.0f, y1 = 3.33579f, x2 = 5.66422f, y2 = 3.0f, x3 = 5.25f, y3 = 3.0f)
                    horizontalLineTo(x = 3.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 18.75f, y = 3.0f)
                    curveTo(x1 = 18.3358f, y1 = 3.0f, x2 = 18.0f, y2 = 3.33579f, x3 = 18.0f, y3 = 3.75f)
                    curveTo(x1 = 18.0f, y1 = 4.16421f, x2 = 18.3358f, y2 = 4.5f, x3 = 18.75f, y3 = 4.5f)
                    horizontalLineTo(x = 20.25f)
                    curveTo(x1 = 20.6642f, y1 = 4.5f, x2 = 21.0f, y2 = 4.16421f, x3 = 21.0f, y3 = 3.75f)
                    curveTo(x1 = 21.0f, y1 = 3.33579f, x2 = 20.6642f, y2 = 3.0f, x3 = 20.25f, y3 = 3.0f)
                    horizontalLineTo(x = 18.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 8.03033f, y = 8.53033f)
                    curveTo(x1 = 8.32323f, y1 = 8.23744f, x2 = 8.32323f, y2 = 7.76256f, x3 = 8.03033f, y3 = 7.46967f)
                    curveTo(x1 = 7.73744f, y1 = 7.17678f, x2 = 7.26257f, y2 = 7.17678f, x3 = 6.96967f, y3 = 7.46967f)
                    lineTo(x = 5.96967f, y = 8.46967f)
                    curveTo(x1 = 5.67678f, y1 = 8.76256f, x2 = 5.67678f, y2 = 9.23744f, x3 = 5.96967f, y3 = 9.53033f)
                    curveTo(x1 = 6.26257f, y1 = 9.82322f, x2 = 6.73744f, y2 = 9.82322f, x3 = 7.03033f, y3 = 9.53033f)
                    lineTo(x = 8.03033f, y = 8.53033f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.0303f, y = 7.46967f)
                    curveTo(x1 = 16.7374f, y1 = 7.17678f, x2 = 16.2626f, y2 = 7.17678f, x3 = 15.9697f, y3 = 7.46967f)
                    curveTo(x1 = 15.6768f, y1 = 7.76256f, x2 = 15.6768f, y2 = 8.23744f, x3 = 15.9697f, y3 = 8.53033f)
                    lineTo(x = 16.9697f, y = 9.53033f)
                    curveTo(x1 = 17.2626f, y1 = 9.82322f, x2 = 17.7374f, y2 = 9.82322f, x3 = 18.0303f, y3 = 9.53033f)
                    curveTo(x1 = 18.3232f, y1 = 9.23744f, x2 = 18.3232f, y2 = 8.76256f, x3 = 18.0303f, y3 = 8.46967f)
                    lineTo(x = 17.0303f, y = 7.46967f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.75f, y = 9.75f)
                    curveTo(x1 = 12.75f, y1 = 9.33579f, x2 = 12.4142f, y2 = 9.0f, x3 = 12.0f, y3 = 9.0f)
                    curveTo(x1 = 11.5858f, y1 = 9.0f, x2 = 11.25f, y2 = 9.33579f, x3 = 11.25f, y3 = 9.75f)
                    verticalLineTo(y = 11.25f)
                    curveTo(x1 = 11.25f, y1 = 11.6642f, x2 = 11.5858f, y2 = 12.0f, x3 = 12.0f, y3 = 12.0f)
                    curveTo(x1 = 12.4142f, y1 = 12.0f, x2 = 12.75f, y2 = 11.6642f, x3 = 12.75f, y3 = 11.25f)
                    verticalLineTo(y = 9.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 4.80556f, y = 15.0f)
                    curveTo(x1 = 4.51195f, y1 = 15.0f, x2 = 4.24535f, y2 = 15.1713f, x3 = 4.12336f, y3 = 15.4384f)
                    lineTo(x = 2.06781f, y = 19.9384f)
                    curveTo(x1 = 1.96175f, y1 = 20.1705f, x2 = 1.98106f, y2 = 20.4407f, x3 = 2.11904f, y3 = 20.6555f)
                    curveTo(x1 = 2.25703f, y1 = 20.8702f, x2 = 2.49476f, y2 = 21.0f, x3 = 2.75f, y3 = 21.0f)
                    horizontalLineTo(x = 10.75f)
                    curveTo(x1 = 11.0261f, y1 = 21.0f, x2 = 11.25f, y2 = 20.7761f, x3 = 11.25f, y3 = 20.5f)
                    verticalLineTo(y = 15.5f)
                    curveTo(x1 = 11.25f, y1 = 15.2239f, x2 = 11.0261f, y2 = 15.0f, x3 = 10.75f, y3 = 15.0f)
                    horizontalLineTo(x = 4.80556f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 13.25f, y = 15.0f)
                    curveTo(x1 = 12.9739f, y1 = 15.0f, x2 = 12.75f, y2 = 15.2239f, x3 = 12.75f, y3 = 15.5f)
                    verticalLineTo(y = 20.5f)
                    curveTo(x1 = 12.75f, y1 = 20.7761f, x2 = 12.9739f, y2 = 21.0f, x3 = 13.25f, y3 = 21.0f)
                    horizontalLineTo(x = 21.25f)
                    curveTo(x1 = 21.5052f, y1 = 21.0f, x2 = 21.743f, y2 = 20.8702f, x3 = 21.881f, y3 = 20.6555f)
                    curveTo(x1 = 22.0189f, y1 = 20.4407f, x2 = 22.0383f, y2 = 20.1705f, x3 = 21.9322f, y3 = 19.9384f)
                    lineTo(x = 19.8766f, y = 15.4384f)
                    curveTo(x1 = 19.7547f, y1 = 15.1713f, x2 = 19.488f, y2 = 15.0f, x3 = 19.1944f, y3 = 15.0f)
                    horizontalLineTo(x = 13.25f)
                    close()
                }
            }.build()
            .also { _solar = it }
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
                imageVector = Solar,
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
private var _solar: ImageVector? = null
