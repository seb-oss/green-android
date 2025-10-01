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

val ShieldChecked: ImageVector
    get() {
        val current = _shieldChecked
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.ShieldChecked",
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
                    moveTo(x = 9.25f, y = 11.5f)
                    lineTo(x = 11.0f, y = 13.25f)
                    lineTo(x = 14.75f, y = 9.5f)
                    moveTo(x = 12.0f, y = 2.75f)
                    lineTo(x = 20.25f, y = 5.5f)
                    verticalLineTo(y = 11.9123f)
                    curveTo(
                        x1 = 20.25f,
                        y1 = 16.8848f,
                        x2 = 16.0f,
                        y2 = 19.25f,
                        x3 = 12.0f,
                        y3 = 21.4079f,
                    )
                    curveTo(
                        x1 = 8.0f,
                        y1 = 19.25f,
                        x2 = 3.75f,
                        y2 = 16.8848f,
                        x3 = 3.75f,
                        y3 = 11.9123f,
                    )
                    verticalLineTo(y = 5.5f)
                    lineTo(x = 12.0f, y = 2.75f)
                    close()
                }
            }.build()
            .also { _shieldChecked = it }
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
                imageVector = ShieldChecked,
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
private var _shieldChecked: ImageVector? = null
