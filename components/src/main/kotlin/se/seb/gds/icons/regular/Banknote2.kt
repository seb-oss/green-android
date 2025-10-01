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

val Banknote2: ImageVector
    get() {
        val current = _banknote2
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Banknote2",
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
                    moveTo(x = 4.75f, y = 8.25f)
                    horizontalLineTo(x = 5.75f)
                    moveTo(x = 18.25f, y = 15.75f)
                    horizontalLineTo(x = 19.25f)
                    moveTo(x = 1.75f, y = 18.75f)
                    verticalLineTo(y = 5.25f)
                    horizontalLineTo(x = 22.25f)
                    verticalLineTo(y = 18.75f)
                    horizontalLineTo(x = 1.75f)
                    close()
                    moveTo(x = 14.0f, y = 12.0f)
                    curveTo(
                        x1 = 14.0f,
                        y1 = 13.1046f,
                        x2 = 13.1046f,
                        y2 = 14.0f,
                        x3 = 12.0f,
                        y3 = 14.0f,
                    )
                    curveTo(
                        x1 = 10.8954f,
                        y1 = 14.0f,
                        x2 = 10.0f,
                        y2 = 13.1046f,
                        x3 = 10.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 10.0f,
                        y1 = 10.8954f,
                        x2 = 10.8954f,
                        y2 = 10.0f,
                        x3 = 12.0f,
                        y3 = 10.0f,
                    )
                    curveTo(
                        x1 = 13.1046f,
                        y1 = 10.0f,
                        x2 = 14.0f,
                        y2 = 10.8954f,
                        x3 = 14.0f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _banknote2 = it }
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
                imageVector = Banknote2,
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
private var _banknote2: ImageVector? = null
