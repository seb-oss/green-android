package se.seb.gds.icons.solid

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val MinusSmall: ImageVector
    get() {
        val current = _minusSmall
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.MinusSmall",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 6.0f, y = 12.0f)
                    curveTo(
                        x1 = 6.0f,
                        y1 = 11.5858f,
                        x2 = 6.33579f,
                        y2 = 11.25f,
                        x3 = 6.75f,
                        y3 = 11.25f,
                    )
                    horizontalLineTo(x = 17.25f)
                    curveTo(
                        x1 = 17.6642f,
                        y1 = 11.25f,
                        x2 = 18.0f,
                        y2 = 11.5858f,
                        x3 = 18.0f,
                        y3 = 12.0f,
                    )
                    curveTo(
                        x1 = 18.0f,
                        y1 = 12.4142f,
                        x2 = 17.6642f,
                        y2 = 12.75f,
                        x3 = 17.25f,
                        y3 = 12.75f,
                    )
                    horizontalLineTo(x = 6.75f)
                    curveTo(
                        x1 = 6.33579f,
                        y1 = 12.75f,
                        x2 = 6.0f,
                        y2 = 12.4142f,
                        x3 = 6.0f,
                        y3 = 12.0f,
                    )
                    close()
                }
            }.build()
            .also { _minusSmall = it }
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
                imageVector = MinusSmall,
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
private var _minusSmall: ImageVector? = null
