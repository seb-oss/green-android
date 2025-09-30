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

val Tag: ImageVector
    get() {
        val current = _tag
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Tag",
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
                    moveTo(x = 8.25f, y = 7.5f)
                    curveTo(x1 = 8.25f, y1 = 7.91421f, x2 = 7.91421f, y2 = 8.25f, x3 = 7.5f, y3 = 8.25f)
                    curveTo(x1 = 7.08579f, y1 = 8.25f, x2 = 6.75f, y2 = 7.91421f, x3 = 6.75f, y3 = 7.5f)
                    curveTo(x1 = 6.75f, y1 = 7.08579f, x2 = 7.08579f, y2 = 6.75f, x3 = 7.5f, y3 = 6.75f)
                    curveTo(x1 = 7.91421f, y1 = 6.75f, x2 = 8.25f, y2 = 7.08579f, x3 = 8.25f, y3 = 7.5f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 2.75f, y = 12.0f)
                    verticalLineTo(y = 2.75f)
                    horizontalLineTo(x = 12.0f)
                    lineTo(x = 21.25f, y = 12.0f)
                    lineTo(x = 12.0f, y = 21.25f)
                    lineTo(x = 2.75f, y = 12.0f)
                    close()
                }
            }.build()
            .also { _tag = it }
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
                imageVector = Tag,
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
private var _tag: ImageVector? = null
