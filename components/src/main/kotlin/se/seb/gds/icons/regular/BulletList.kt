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

val BulletList: ImageVector
    get() {
        val current = _bulletList
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.BulletList",
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
                    moveTo(x = 11.75f, y = 16.75f)
                    horizontalLineTo(x = 20.25f)
                    moveTo(x = 11.75f, y = 7.25f)
                    horizontalLineTo(x = 20.25f)
                    moveTo(x = 7.75f, y = 7.25f)
                    curveTo(x1 = 7.75f, y1 = 8.35457f, x2 = 6.85457f, y2 = 9.25f, x3 = 5.75f, y3 = 9.25f)
                    curveTo(x1 = 4.64543f, y1 = 9.25f, x2 = 3.75f, y2 = 8.35457f, x3 = 3.75f, y3 = 7.25f)
                    curveTo(x1 = 3.75f, y1 = 6.14543f, x2 = 4.64543f, y2 = 5.25f, x3 = 5.75f, y3 = 5.25f)
                    curveTo(x1 = 6.85457f, y1 = 5.25f, x2 = 7.75f, y2 = 6.14543f, x3 = 7.75f, y3 = 7.25f)
                    close()
                    moveTo(x = 7.75f, y = 16.75f)
                    curveTo(x1 = 7.75f, y1 = 17.8546f, x2 = 6.85457f, y2 = 18.75f, x3 = 5.75f, y3 = 18.75f)
                    curveTo(x1 = 4.64543f, y1 = 18.75f, x2 = 3.75f, y2 = 17.8546f, x3 = 3.75f, y3 = 16.75f)
                    curveTo(x1 = 3.75f, y1 = 15.6454f, x2 = 4.64543f, y2 = 14.75f, x3 = 5.75f, y3 = 14.75f)
                    curveTo(x1 = 6.85457f, y1 = 14.75f, x2 = 7.75f, y2 = 15.6454f, x3 = 7.75f, y3 = 16.75f)
                    close()
                }
            }.build()
            .also { _bulletList = it }
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
                imageVector = BulletList,
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
private var _bulletList: ImageVector? = null
