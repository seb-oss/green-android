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

val Basket: ImageVector
    get() {
        val current = _basket
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Basket",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 1.75f, y = 2.0f)
                    curveTo(
                        x1 = 1.33579f,
                        y1 = 2.0f,
                        x2 = 1.0f,
                        y2 = 2.33579f,
                        x3 = 1.0f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 1.0f,
                        y1 = 3.16421f,
                        x2 = 1.33579f,
                        y2 = 3.5f,
                        x3 = 1.75f,
                        y3 = 3.5f,
                    )
                    horizontalLineTo(x = 2.88515f)
                    lineTo(x = 5.26456f, y = 15.3971f)
                    curveTo(
                        x1 = 5.33468f,
                        y1 = 15.7477f,
                        x2 = 5.64249f,
                        y2 = 16.0f,
                        x3 = 6.0f,
                        y3 = 16.0f,
                    )
                    horizontalLineTo(x = 19.5f)
                    curveTo(
                        x1 = 19.8618f,
                        y1 = 16.0f,
                        x2 = 20.172f,
                        y2 = 15.7417f,
                        x3 = 20.2376f,
                        y3 = 15.3859f,
                    )
                    lineTo(x = 21.9876f, y = 5.88587f)
                    curveTo(
                        x1 = 22.0279f,
                        y1 = 5.66686f,
                        x2 = 21.9689f,
                        y2 = 5.44125f,
                        x3 = 21.8264f,
                        y3 = 5.27011f,
                    )
                    curveTo(
                        x1 = 21.6839f,
                        y1 = 5.09897f,
                        x2 = 21.4727f,
                        y2 = 5.0f,
                        x3 = 21.25f,
                        y3 = 5.0f,
                    )
                    horizontalLineTo(x = 4.71485f)
                    lineTo(x = 4.23544f, y = 2.60291f)
                    curveTo(
                        x1 = 4.16532f,
                        y1 = 2.25234f,
                        x2 = 3.85751f,
                        y2 = 2.0f,
                        x3 = 3.5f,
                        y3 = 2.0f,
                    )
                    horizontalLineTo(x = 1.75f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 8.0f, y = 17.0f)
                    curveTo(
                        x1 = 6.89543f,
                        y1 = 17.0f,
                        x2 = 6.0f,
                        y2 = 17.8954f,
                        x3 = 6.0f,
                        y3 = 19.0f,
                    )
                    curveTo(
                        x1 = 6.0f,
                        y1 = 20.1046f,
                        x2 = 6.89543f,
                        y2 = 21.0f,
                        x3 = 8.0f,
                        y3 = 21.0f,
                    )
                    curveTo(
                        x1 = 9.10457f,
                        y1 = 21.0f,
                        x2 = 10.0f,
                        y2 = 20.1046f,
                        x3 = 10.0f,
                        y3 = 19.0f,
                    )
                    curveTo(
                        x1 = 10.0f,
                        y1 = 17.8954f,
                        x2 = 9.10457f,
                        y2 = 17.0f,
                        x3 = 8.0f,
                        y3 = 17.0f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 17.0f, y = 17.0f)
                    curveTo(
                        x1 = 15.8954f,
                        y1 = 17.0f,
                        x2 = 15.0f,
                        y2 = 17.8954f,
                        x3 = 15.0f,
                        y3 = 19.0f,
                    )
                    curveTo(
                        x1 = 15.0f,
                        y1 = 20.1046f,
                        x2 = 15.8954f,
                        y2 = 21.0f,
                        x3 = 17.0f,
                        y3 = 21.0f,
                    )
                    curveTo(
                        x1 = 18.1046f,
                        y1 = 21.0f,
                        x2 = 19.0f,
                        y2 = 20.1046f,
                        x3 = 19.0f,
                        y3 = 19.0f,
                    )
                    curveTo(
                        x1 = 19.0f,
                        y1 = 17.8954f,
                        x2 = 18.1046f,
                        y2 = 17.0f,
                        x3 = 17.0f,
                        y3 = 17.0f,
                    )
                    close()
                }
            }.build()
            .also { _basket = it }
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
                imageVector = Basket,
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
private var _basket: ImageVector? = null
