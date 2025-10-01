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

val ReadingList: ImageVector
    get() {
        val current = _readingList
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ReadingList",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 6.0f, y = 7.0f)
                    curveTo(
                        x1 = 4.36337f,
                        y1 = 7.0f,
                        x2 = 2.91098f,
                        y2 = 7.78677f,
                        x3 = 1.99972f,
                        y3 = 9.0f,
                    )
                    horizontalLineTo(x = 0.75f)
                    curveTo(
                        x1 = 0.335786f,
                        y1 = 9.0f,
                        x2 = 0.0f,
                        y2 = 9.33579f,
                        x3 = 0.0f,
                        y3 = 9.75f,
                    )
                    curveTo(
                        x1 = 0.0f,
                        y1 = 10.1642f,
                        x2 = 0.335786f,
                        y2 = 10.5f,
                        x3 = 0.75f,
                        y3 = 10.5f,
                    )
                    horizontalLineTo(x = 1.22911f)
                    curveTo(
                        x1 = 1.08024f,
                        y1 = 10.9739f,
                        x2 = 1.0f,
                        y2 = 11.4779f,
                        x3 = 1.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 1.0f,
                        y1 = 14.7614f,
                        x2 = 3.23858f,
                        y2 = 17.0f,
                        x3 = 6.0f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 8.76142f,
                        y1 = 17.0f,
                        x2 = 11.0f,
                        y2 = 14.7614f,
                        x3 = 11.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 11.0f,
                        y1 = 11.2245f,
                        x2 = 10.823f,
                        y2 = 10.4891f,
                        x3 = 10.5072f,
                        y3 = 9.8332f,
                    )
                    curveTo(
                        x1 = 10.9597f,
                        y1 = 9.61946f,
                        x2 = 11.4654f,
                        y2 = 9.5f,
                        x3 = 12.0f,
                        y3 = 9.5f,
                    )
                    curveTo(
                        x1 = 12.5346f,
                        y1 = 9.5f,
                        x2 = 13.0403f,
                        y2 = 9.61946f,
                        x3 = 13.4928f,
                        y3 = 9.83321f,
                    )
                    curveTo(
                        x1 = 13.177f,
                        y1 = 10.4891f,
                        x2 = 13.0f,
                        y2 = 11.2245f,
                        x3 = 13.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 13.0f,
                        y1 = 14.7614f,
                        x2 = 15.2386f,
                        y2 = 17.0f,
                        x3 = 18.0f,
                        y3 = 17.0f,
                    )
                    curveTo(
                        x1 = 20.7614f,
                        y1 = 17.0f,
                        x2 = 23.0f,
                        y2 = 14.7614f,
                        x3 = 23.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 23.0f,
                        y1 = 11.4779f,
                        x2 = 22.9198f,
                        y2 = 10.9739f,
                        x3 = 22.7709f,
                        y3 = 10.5f,
                    )
                    horizontalLineTo(x = 23.25f)
                    curveTo(
                        x1 = 23.6642f,
                        y1 = 10.5f,
                        x2 = 24.0f,
                        y2 = 10.1642f,
                        x3 = 24.0f,
                        y3 = 9.75f,
                    )
                    curveTo(
                        x1 = 24.0f,
                        y1 = 9.33579f,
                        x2 = 23.6642f,
                        y2 = 9.0f,
                        x3 = 23.25f,
                        y3 = 9.0f,
                    )
                    horizontalLineTo(x = 22.0003f)
                    curveTo(
                        x1 = 21.089f,
                        y1 = 7.78677f,
                        x2 = 19.6366f,
                        y2 = 7.0f,
                        x3 = 18.0f,
                        y3 = 7.0f,
                    )
                    curveTo(
                        x1 = 16.5586f,
                        y1 = 7.0f,
                        x2 = 15.2599f,
                        y2 = 7.61041f,
                        x3 = 14.3482f,
                        y3 = 8.58476f,
                    )
                    curveTo(
                        x1 = 13.6477f,
                        y1 = 8.21159f,
                        x2 = 12.8479f,
                        y2 = 8.0f,
                        x3 = 12.0f,
                        y3 = 8.0f,
                    )
                    curveTo(
                        x1 = 11.1521f,
                        y1 = 8.0f,
                        x2 = 10.3523f,
                        y2 = 8.21159f,
                        x3 = 9.65182f,
                        y3 = 8.58476f,
                    )
                    curveTo(
                        x1 = 8.74012f,
                        y1 = 7.61041f,
                        x2 = 7.44138f,
                        y2 = 7.0f,
                        x3 = 6.0f,
                        y3 = 7.0f,
                    )
                    close()
                }
            }.build()
            .also { _readingList = it }
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
                imageVector = ReadingList,
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
private var _readingList: ImageVector? = null
