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

val TrashCan: ImageVector
    get() {
        val current = _trashCan
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.TrashCan",
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
                    moveTo(x = 5.75f, y = 5.75f)
                    verticalLineTo(y = 21.25f)
                    horizontalLineTo(x = 18.25f)
                    verticalLineTo(y = 5.75f)
                    moveTo(x = 5.75f, y = 5.75f)
                    horizontalLineTo(x = 18.25f)
                    moveTo(x = 5.75f, y = 5.75f)
                    horizontalLineTo(x = 3.75f)
                    moveTo(x = 18.25f, y = 5.75f)
                    horizontalLineTo(x = 20.25f)
                    moveTo(x = 14.0f, y = 10.75f)
                    verticalLineTo(y = 16.25f)
                    moveTo(x = 10.0f, y = 10.75f)
                    verticalLineTo(y = 16.25f)
                    moveTo(x = 9.0f, y = 5.75f)
                    curveTo(x1 = 9.0f, y1 = 4.09315f, x2 = 10.3431f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                    curveTo(x1 = 13.6569f, y1 = 2.75f, x2 = 15.0f, y2 = 4.09315f, x3 = 15.0f, y3 = 5.75f)
                }
            }.build()
            .also { _trashCan = it }
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
                imageVector = TrashCan,
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
private var _trashCan: ImageVector? = null
