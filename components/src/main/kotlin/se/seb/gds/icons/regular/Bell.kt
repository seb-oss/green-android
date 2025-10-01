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

val Bell: ImageVector
    get() {
        val current = _bell
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Bell",
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
                    moveTo(x = 16.0f, y = 17.25f)
                    curveTo(
                        x1 = 16.0f,
                        y1 = 19.4591f,
                        x2 = 14.2091f,
                        y2 = 21.25f,
                        x3 = 12.0f,
                        y3 = 21.25f,
                    )
                    curveTo(
                        x1 = 9.79086f,
                        y1 = 21.25f,
                        x2 = 8.0f,
                        y2 = 19.4591f,
                        x3 = 8.0f,
                        y3 = 17.25f,
                    )
                    moveTo(x = 3.75f, y = 17.25f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 16.0f)
                    lineTo(x = 18.7031f, y = 13.0f)
                    lineTo(x = 18.4965f, y = 8.90897f)
                    curveTo(
                        x1 = 18.3234f,
                        y1 = 5.45882f,
                        x2 = 15.4661f,
                        y2 = 2.75f,
                        x3 = 12.0f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 8.53386f,
                        y1 = 2.75f,
                        x2 = 5.6766f,
                        y2 = 5.45882f,
                        x3 = 5.50351f,
                        y3 = 8.90897f,
                    )
                    lineTo(x = 5.29688f, y = 13.0f)
                    lineTo(x = 3.75f, y = 16.0f)
                    verticalLineTo(y = 17.25f)
                    close()
                }
            }.build()
            .also { _bell = it }
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
                imageVector = Bell,
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
private var _bell: ImageVector? = null
