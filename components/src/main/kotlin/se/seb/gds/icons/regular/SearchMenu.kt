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

val SearchMenu: ImageVector
    get() {
        val current = _searchMenu
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.SearchMenu",
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
                    moveTo(x = 2.75f, y = 12.0f)
                    horizontalLineTo(x = 5.25f)
                    moveTo(x = 2.75f, y = 6.75f)
                    horizontalLineTo(x = 6.25f)
                    moveTo(x = 2.75f, y = 17.25f)
                    horizontalLineTo(x = 6.25f)
                    moveTo(x = 19.5f, y = 16.5f)
                    lineTo(x = 22.25f, y = 19.25f)
                    moveTo(x = 21.25f, y = 12.0f)
                    curveTo(
                        x1 = 21.25f,
                        y1 = 15.4518f,
                        x2 = 18.4518f,
                        y2 = 18.25f,
                        x3 = 15.0f,
                        y3 = 18.25f,
                    )
                    curveTo(
                        x1 = 11.5482f,
                        y1 = 18.25f,
                        x2 = 8.75f,
                        y2 = 15.4518f,
                        x3 = 8.75f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 8.75f,
                        y1 = 8.54822f,
                        x2 = 11.5482f,
                        y2 = 5.75f,
                        x3 = 15.0f,
                        y3 = 5.75f,
                    )
                    curveTo(
                        x1 = 18.4518f,
                        y1 = 5.75f,
                        x2 = 21.25f,
                        y2 = 8.54822f,
                        x3 = 21.25f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _searchMenu = it }
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
                imageVector = SearchMenu,
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
private var _searchMenu: ImageVector? = null
