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

val Group: ImageVector
    get() {
        val current = _group
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Group",
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
                moveTo(x = 14.4251f, y = 13.1804f)
                curveTo(x1 = 17.9999f, y1 = 11.6957f, x2 = 22.5632f, y2 = 14.0522f, x3 = 23.0001f, y3 = 20.25f)
                horizontalLineTo(x = 16.75f)
                moveTo(x = 10.75f, y = 7.0f)
                curveTo(x1 = 10.75f, y1 = 8.79493f, x2 = 9.29493f, y2 = 10.25f, x3 = 7.5f, y3 = 10.25f)
                curveTo(x1 = 5.70507f, y1 = 10.25f, x2 = 4.25f, y2 = 8.79493f, x3 = 4.25f, y3 = 7.0f)
                curveTo(x1 = 4.25f, y1 = 5.20507f, x2 = 5.70507f, y2 = 3.75f, x3 = 7.5f, y3 = 3.75f)
                curveTo(x1 = 9.29493f, y1 = 3.75f, x2 = 10.75f, y2 = 5.20507f, x3 = 10.75f, y3 = 7.0f)
                close()
                moveTo(x = 19.75f, y = 7.0f)
                curveTo(x1 = 19.75f, y1 = 8.79493f, x2 = 18.2949f, y2 = 10.25f, x3 = 16.5f, y3 = 10.25f)
                curveTo(x1 = 14.7051f, y1 = 10.25f, x2 = 13.25f, y2 = 8.79493f, x3 = 13.25f, y3 = 7.0f)
                curveTo(x1 = 13.25f, y1 = 5.20507f, x2 = 14.7051f, y2 = 3.75f, x3 = 16.5f, y3 = 3.75f)
                curveTo(x1 = 18.2949f, y1 = 3.75f, x2 = 19.75f, y2 = 5.20507f, x3 = 19.75f, y3 = 7.0f)
                close()
                moveTo(x = 1.0f, y = 20.25f)
                horizontalLineTo(x = 13.8571f)
                curveTo(x1 = 13.1522f, y1 = 10.25f, x2 = 1.70491f, y2 = 10.25f, x3 = 1.0f, y3 = 20.25f)
                close()
            }
        }.build().also { _group = it }
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
                imageVector = Group,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _group: ImageVector? = null
