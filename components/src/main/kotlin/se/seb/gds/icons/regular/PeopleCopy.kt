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

val PeopleCopy: ImageVector
    get() {
        val current = _peopleCopy
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PeopleCopy",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 17.25f, y = 6.75f)
                    verticalLineTo(y = 2.75f)
                    horizontalLineTo(x = 2.75f)
                    verticalLineTo(y = 17.25f)
                    horizontalLineTo(x = 6.75f)
                    moveTo(x = 9.32626f, y = 21.25f)
                    curveTo(x1 = 9.78713f, y1 = 18.9642f, x2 = 11.7046f, y2 = 17.25f, x3 = 14.0f, y3 = 17.25f)
                    curveTo(x1 = 16.2954f, y1 = 17.25f, x2 = 18.2129f, y2 = 18.9642f, x3 = 18.6737f, y3 = 21.25f)
                    moveTo(x = 9.32626f, y = 21.25f)
                    horizontalLineTo(x = 6.75f)
                    verticalLineTo(y = 6.75f)
                    horizontalLineTo(x = 21.25f)
                    verticalLineTo(y = 21.25f)
                    horizontalLineTo(x = 18.6737f)
                    moveTo(x = 9.32626f, y = 21.25f)
                    horizontalLineTo(x = 18.6737f)
                    moveTo(x = 16.25f, y = 12.5f)
                    curveTo(x1 = 16.25f, y1 = 13.7426f, x2 = 15.2426f, y2 = 14.75f, x3 = 14.0f, y3 = 14.75f)
                    curveTo(x1 = 12.7574f, y1 = 14.75f, x2 = 11.75f, y2 = 13.7426f, x3 = 11.75f, y3 = 12.5f)
                    curveTo(x1 = 11.75f, y1 = 11.2574f, x2 = 12.7574f, y2 = 10.25f, x3 = 14.0f, y3 = 10.25f)
                    curveTo(x1 = 15.2426f, y1 = 10.25f, x2 = 16.25f, y2 = 11.2574f, x3 = 16.25f, y3 = 12.5f)
                    close()
                }
            }.build()
            .also { _peopleCopy = it }
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
                imageVector = PeopleCopy,
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
private var _peopleCopy: ImageVector? = null
