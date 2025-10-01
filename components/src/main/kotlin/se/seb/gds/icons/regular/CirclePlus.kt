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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val CirclePlus: ImageVector
    get() {
        val current = _circlePlus
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CirclePlus",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 16.2426f, y = 12.0005f)
                    horizontalLineTo(x = 7.75736f)
                    moveTo(x = 12.0f, y = 16.2431f)
                    verticalLineTo(y = 7.75781f)
                    moveTo(x = 21.25f, y = 12.0f)
                    curveTo(
                        x1 = 21.25f,
                        y1 = 17.1086f,
                        x2 = 17.1086f,
                        y2 = 21.25f,
                        x3 = 12.0f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 6.89137f,
                        y1 = 21.25f,
                        x2 = 2.75f,
                        y2 = 17.1086f,
                        x3 = 2.75f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 2.75f,
                        y1 = 6.89137f,
                        x2 = 6.89137f,
                        y2 = 2.75f,
                        x3 = 12.0f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 17.1086f,
                        y1 = 2.75f,
                        x2 = 21.25f,
                        y2 = 6.89137f,
                        x3 = 21.25f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _circlePlus = it }
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
                imageVector = CirclePlus,
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
private var _circlePlus: ImageVector? = null
