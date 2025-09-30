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

val People: ImageVector
    get() {
        val current = _people
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.People",
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
                    moveTo(x = 3.75f, y = 20.25f)
                    verticalLineTo(y = 18.75f)
                    curveTo(x1 = 3.75f, y1 = 16.5409f, x2 = 5.54086f, y2 = 14.75f, x3 = 7.75f, y3 = 14.75f)
                    horizontalLineTo(x = 16.25f)
                    curveTo(x1 = 18.4591f, y1 = 14.75f, x2 = 20.25f, y2 = 16.5409f, x3 = 20.25f, y3 = 18.75f)
                    verticalLineTo(y = 20.25f)
                    moveTo(x = 16.75f, y = 7.5f)
                    curveTo(x1 = 16.75f, y1 = 10.1234f, x2 = 14.6234f, y2 = 12.25f, x3 = 12.0f, y3 = 12.25f)
                    curveTo(x1 = 9.37665f, y1 = 12.25f, x2 = 7.25f, y2 = 10.1234f, x3 = 7.25f, y3 = 7.5f)
                    curveTo(x1 = 7.25f, y1 = 4.87665f, x2 = 9.37665f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                    curveTo(x1 = 14.6234f, y1 = 2.75f, x2 = 16.75f, y2 = 4.87665f, x3 = 16.75f, y3 = 7.5f)
                    close()
                }
            }.build()
            .also { _people = it }
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
                imageVector = People,
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
private var _people: ImageVector? = null
