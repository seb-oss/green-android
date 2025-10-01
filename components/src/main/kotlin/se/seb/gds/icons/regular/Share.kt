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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Share: ImageVector
    get() {
        val current = _share
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Share",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 9.00003f, y = 10.4286f)
                    lineTo(x = 14.0f, y = 7.57141f)
                    moveTo(x = 9.00003f, y = 13.5714f)
                    lineTo(x = 14.0f, y = 16.4286f)
                    moveTo(x = 20.25f, y = 6.0f)
                    curveTo(
                        x1 = 20.25f,
                        y1 = 7.79493f,
                        x2 = 18.7949f,
                        y2 = 9.25f,
                        x3 = 17.0f,
                        y3 = 9.25f,
                    )
                    curveTo(
                        x1 = 15.2051f,
                        y1 = 9.25f,
                        x2 = 13.75f,
                        y2 = 7.79493f,
                        x3 = 13.75f,
                        y3 = 6.0f,
                    )
                    curveTo(
                        x1 = 13.75f,
                        y1 = 4.20507f,
                        x2 = 15.2051f,
                        y2 = 2.75f,
                        x3 = 17.0f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 18.7949f,
                        y1 = 2.75f,
                        x2 = 20.25f,
                        y2 = 4.20507f,
                        x3 = 20.25f,
                        y3 = 6.0f,
                    )
                    close()
                    moveTo(x = 20.25f, y = 18.0f)
                    curveTo(
                        x1 = 20.25f,
                        y1 = 19.7949f,
                        x2 = 18.7949f,
                        y2 = 21.25f,
                        x3 = 17.0f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 15.2051f,
                        y1 = 21.25f,
                        x2 = 13.75f,
                        y2 = 19.7949f,
                        x3 = 13.75f,
                        y3 = 18.0f,
                    )
                    curveTo(
                        x1 = 13.75f,
                        y1 = 16.2051f,
                        x2 = 15.2051f,
                        y2 = 14.75f,
                        x3 = 17.0f,
                        y3 = 14.75f,
                    )
                    curveTo(
                        x1 = 18.7949f,
                        y1 = 14.75f,
                        x2 = 20.25f,
                        y2 = 16.2051f,
                        x3 = 20.25f,
                        y3 = 18.0f,
                    )
                    close()
                    moveTo(x = 9.25f, y = 12.0f)
                    curveTo(
                        x1 = 9.25f,
                        y1 = 13.7949f,
                        x2 = 7.79493f,
                        y2 = 15.25f,
                        x3 = 6.0f,
                        y3 = 15.25f,
                    )
                    curveTo(
                        x1 = 4.20507f,
                        y1 = 15.25f,
                        x2 = 2.75f,
                        y2 = 13.7949f,
                        x3 = 2.75f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 2.75f,
                        y1 = 10.2051f,
                        x2 = 4.20507f,
                        y2 = 8.75f,
                        x3 = 6.0f,
                        y3 = 8.75f,
                    )
                    curveTo(
                        x1 = 7.79493f,
                        y1 = 8.75f,
                        x2 = 9.25f,
                        y2 = 10.2051f,
                        x3 = 9.25f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _share = it }
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
                imageVector = Share,
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
private var _share: ImageVector? = null
