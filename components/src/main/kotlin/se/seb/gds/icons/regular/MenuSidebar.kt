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

val MenuSidebar: ImageVector
    get() {
        val current = _menuSidebar
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.MenuSidebar",
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
                moveTo(x = 11.25f, y = 4.75f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 19.25f)
                horizontalLineTo(x = 11.25f)
                moveTo(x = 11.25f, y = 4.75f)
                horizontalLineTo(x = 21.25f)
                verticalLineTo(y = 19.25f)
                horizontalLineTo(x = 11.25f)
                moveTo(x = 11.25f, y = 4.75f)
                verticalLineTo(y = 19.25f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.5f,
            ) {
                moveTo(x = 7.75f, y = 8.5f)
                curveTo(x1 = 7.75f, y1 = 8.91421f, x2 = 7.41421f, y2 = 9.25f, x3 = 7.0f, y3 = 9.25f)
                curveTo(x1 = 6.58579f, y1 = 9.25f, x2 = 6.25f, y2 = 8.91421f, x3 = 6.25f, y3 = 8.5f)
                curveTo(x1 = 6.25f, y1 = 8.08579f, x2 = 6.58579f, y2 = 7.75f, x3 = 7.0f, y3 = 7.75f)
                curveTo(x1 = 7.41421f, y1 = 7.75f, x2 = 7.75f, y2 = 8.08579f, x3 = 7.75f, y3 = 8.5f)
                close()
                moveTo(x = 7.75f, y = 12.0f)
                curveTo(x1 = 7.75f, y1 = 12.4142f, x2 = 7.41421f, y2 = 12.75f, x3 = 7.0f, y3 = 12.75f)
                curveTo(x1 = 6.58579f, y1 = 12.75f, x2 = 6.25f, y2 = 12.4142f, x3 = 6.25f, y3 = 12.0f)
                curveTo(x1 = 6.25f, y1 = 11.5858f, x2 = 6.58579f, y2 = 11.25f, x3 = 7.0f, y3 = 11.25f)
                curveTo(x1 = 7.41421f, y1 = 11.25f, x2 = 7.75f, y2 = 11.5858f, x3 = 7.75f, y3 = 12.0f)
                close()
                moveTo(x = 7.75f, y = 15.5f)
                curveTo(x1 = 7.75f, y1 = 15.9142f, x2 = 7.41421f, y2 = 16.25f, x3 = 7.0f, y3 = 16.25f)
                curveTo(x1 = 6.58579f, y1 = 16.25f, x2 = 6.25f, y2 = 15.9142f, x3 = 6.25f, y3 = 15.5f)
                curveTo(x1 = 6.25f, y1 = 15.0858f, x2 = 6.58579f, y2 = 14.75f, x3 = 7.0f, y3 = 14.75f)
                curveTo(x1 = 7.41421f, y1 = 14.75f, x2 = 7.75f, y2 = 15.0858f, x3 = 7.75f, y3 = 15.5f)
                close()
            }
        }.build().also { _menuSidebar = it }
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
                imageVector = MenuSidebar,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _menuSidebar: ImageVector? = null
