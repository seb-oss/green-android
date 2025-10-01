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

val CircleMinus: ImageVector
    get() {
        val current = _circleMinus
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CircleMinus",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.0f, y = 12.0f)
                    curveTo(
                        x1 = 2.0f,
                        y1 = 6.47715f,
                        x2 = 6.47715f,
                        y2 = 2.0f,
                        x3 = 12.0f,
                        y3 = 2.0f,
                    )
                    curveTo(
                        x1 = 17.5228f,
                        y1 = 2.0f,
                        x2 = 22.0f,
                        y2 = 6.47715f,
                        x3 = 22.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 22.0f,
                        y1 = 17.5228f,
                        x2 = 17.5228f,
                        y2 = 22.0f,
                        x3 = 12.0f,
                        y3 = 22.0f,
                    )
                    curveTo(
                        x1 = 6.47715f,
                        y1 = 22.0f,
                        x2 = 2.0f,
                        y2 = 17.5228f,
                        x3 = 2.0f,
                        y3 = 12.0f,
                    )
                    close()
                    moveTo(x = 16.2426f, y = 12.7505f)
                    curveTo(
                        x1 = 16.6569f,
                        y1 = 12.7505f,
                        x2 = 16.9926f,
                        y2 = 12.4147f,
                        x3 = 16.9926f,
                        y3 = 12.0005f,
                    )
                    curveTo(
                        x1 = 16.9926f,
                        y1 = 11.5862f,
                        x2 = 16.6569f,
                        y2 = 11.2505f,
                        x3 = 16.2426f,
                        y3 = 11.2505f,
                    )
                    horizontalLineTo(x = 7.75736f)
                    curveTo(
                        x1 = 7.34315f,
                        y1 = 11.2505f,
                        x2 = 7.00736f,
                        y2 = 11.5862f,
                        x3 = 7.00736f,
                        y3 = 12.0005f,
                    )
                    curveTo(
                        x1 = 7.00736f,
                        y1 = 12.4147f,
                        x2 = 7.34315f,
                        y2 = 12.7505f,
                        x3 = 7.75736f,
                        y3 = 12.7505f,
                    )
                    horizontalLineTo(x = 16.2426f)
                    close()
                }
            }.build()
            .also { _circleMinus = it }
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
                imageVector = CircleMinus,
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
private var _circleMinus: ImageVector? = null
