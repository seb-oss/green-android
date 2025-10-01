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

val CloudDownload: ImageVector
    get() {
        val current = _cloudDownload
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CloudDownload",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 5.77996f, y = 8.12427f)
                    curveTo(
                        x1 = 6.80396f,
                        y1 = 5.70153f,
                        x2 = 9.20241f,
                        y2 = 4.0f,
                        x3 = 12.0f,
                        y3 = 4.0f,
                    )
                    curveTo(
                        x1 = 15.5725f,
                        y1 = 4.0f,
                        x2 = 18.4969f,
                        y2 = 6.77542f,
                        x3 = 18.7344f,
                        y3 = 10.2877f,
                    )
                    curveTo(
                        x1 = 21.1392f,
                        y1 = 10.5876f,
                        x2 = 23.0f,
                        y2 = 12.639f,
                        x3 = 23.0f,
                        y3 = 15.125f,
                    )
                    curveTo(
                        x1 = 23.0f,
                        y1 = 17.8174f,
                        x2 = 20.8174f,
                        y2 = 20.0f,
                        x3 = 18.125f,
                        y3 = 20.0f,
                    )
                    horizontalLineTo(x = 7.0f)
                    curveTo(
                        x1 = 3.68629f,
                        y1 = 20.0f,
                        x2 = 1.0f,
                        y2 = 17.3137f,
                        x3 = 1.0f,
                        y3 = 14.0f,
                    )
                    curveTo(
                        x1 = 1.0f,
                        y1 = 11.1041f,
                        x2 = 3.05102f,
                        y2 = 8.68825f,
                        x3 = 5.77996f,
                        y3 = 8.12427f,
                    )
                    close()
                    moveTo(x = 11.25f, y = 8.75f)
                    curveTo(
                        x1 = 11.25f,
                        y1 = 8.33579f,
                        x2 = 11.5858f,
                        y2 = 8.0f,
                        x3 = 12.0f,
                        y3 = 8.0f,
                    )
                    curveTo(
                        x1 = 12.4142f,
                        y1 = 8.0f,
                        x2 = 12.75f,
                        y2 = 8.33579f,
                        x3 = 12.75f,
                        y3 = 8.75f,
                    )
                    verticalLineTo(y = 14.4393f)
                    lineTo(x = 13.9697f, y = 13.2197f)
                    curveTo(
                        x1 = 14.2626f,
                        y1 = 12.9268f,
                        x2 = 14.7374f,
                        y2 = 12.9268f,
                        x3 = 15.0303f,
                        y3 = 13.2197f,
                    )
                    curveTo(
                        x1 = 15.3232f,
                        y1 = 13.5126f,
                        x2 = 15.3232f,
                        y2 = 13.9874f,
                        x3 = 15.0303f,
                        y3 = 14.2803f,
                    )
                    lineTo(x = 12.5303f, y = 16.7803f)
                    curveTo(
                        x1 = 12.2374f,
                        y1 = 17.0732f,
                        x2 = 11.7626f,
                        y2 = 17.0732f,
                        x3 = 11.4697f,
                        y3 = 16.7803f,
                    )
                    lineTo(x = 8.96967f, y = 14.2803f)
                    curveTo(
                        x1 = 8.67678f,
                        y1 = 13.9874f,
                        x2 = 8.67678f,
                        y2 = 13.5126f,
                        x3 = 8.96967f,
                        y3 = 13.2197f,
                    )
                    curveTo(
                        x1 = 9.26256f,
                        y1 = 12.9268f,
                        x2 = 9.73744f,
                        y2 = 12.9268f,
                        x3 = 10.0303f,
                        y3 = 13.2197f,
                    )
                    lineTo(x = 11.25f, y = 14.4393f)
                    verticalLineTo(y = 8.75f)
                    close()
                }
            }.build()
            .also { _cloudDownload = it }
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
                imageVector = CloudDownload,
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
private var _cloudDownload: ImageVector? = null
