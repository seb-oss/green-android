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
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Gift: ImageVector
    get() {
        val current = _gift
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Gift",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 12.0f, y = 7.75f)
                    verticalLineTo(y = 6.08333f)
                    moveTo(x = 12.0f, y = 7.75f)
                    horizontalLineTo(x = 10.3333f)
                    curveTo(
                        x1 = 8.49238f,
                        y1 = 7.75f,
                        x2 = 7.0f,
                        y2 = 6.25762f,
                        x3 = 7.0f,
                        y3 = 4.41667f,
                    )
                    curveTo(
                        x1 = 7.0f,
                        y1 = 3.49619f,
                        x2 = 7.74619f,
                        y2 = 2.75f,
                        x3 = 8.66667f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 10.5076f,
                        y1 = 2.75f,
                        x2 = 12.0f,
                        y2 = 4.24238f,
                        x3 = 12.0f,
                        y3 = 6.08333f,
                    )
                    moveTo(x = 12.0f, y = 7.75f)
                    horizontalLineTo(x = 13.6667f)
                    curveTo(
                        x1 = 15.5076f,
                        y1 = 7.75f,
                        x2 = 17.0f,
                        y2 = 6.25762f,
                        x3 = 17.0f,
                        y3 = 4.41667f,
                    )
                    curveTo(
                        x1 = 17.0f,
                        y1 = 3.49619f,
                        x2 = 16.2538f,
                        y2 = 2.75f,
                        x3 = 15.3333f,
                        y3 = 2.75f,
                    )
                    curveTo(
                        x1 = 13.4924f,
                        y1 = 2.75f,
                        x2 = 12.0f,
                        y2 = 4.24238f,
                        x3 = 12.0f,
                        y3 = 6.08333f,
                    )
                    moveTo(x = 12.0f, y = 7.75f)
                    verticalLineTo(y = 20.25f)
                    moveTo(x = 4.75f, y = 12.0f)
                    verticalLineTo(y = 20.25f)
                    horizontalLineTo(x = 19.25f)
                    verticalLineTo(y = 12.0f)
                    moveTo(x = 4.75f, y = 12.0f)
                    horizontalLineTo(x = 19.25f)
                    moveTo(x = 4.75f, y = 12.0f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 7.75f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 12.0f)
                    horizontalLineTo(x = 19.25f)
                }
            }.build()
            .also { _gift = it }
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
                imageVector = Gift,
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
private var _gift: ImageVector? = null
