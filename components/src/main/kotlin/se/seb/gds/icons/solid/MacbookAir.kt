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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val MacbookAir: ImageVector
    get() {
        val current = _macbookAir
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.MacbookAir",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 1.75f, y = 17.0f)
                curveTo(x1 = 1.33579f, y1 = 17.0f, x2 = 1.0f, y2 = 17.3358f, x3 = 1.0f, y3 = 17.75f)
                verticalLineTo(y = 18.25f)
                curveTo(x1 = 1.0f, y1 = 19.2165f, x2 = 1.7835f, y2 = 20.0f, x3 = 2.75f, y3 = 20.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 22.2165f, y1 = 20.0f, x2 = 23.0f, y2 = 19.2165f, x3 = 23.0f, y3 = 18.25f)
                verticalLineTo(y = 17.75f)
                curveTo(x1 = 23.0f, y1 = 17.3358f, x2 = 22.6642f, y2 = 17.0f, x3 = 22.25f, y3 = 17.0f)
                horizontalLineTo(x = 15.075f)
                curveTo(x1 = 14.956f, y1 = 17.0f, x2 = 14.8387f, y2 = 17.0283f, x3 = 14.7328f, y3 = 17.0826f)
                lineTo(x = 14.08f, y = 17.4174f)
                curveTo(x1 = 13.9741f, y1 = 17.4717f, x2 = 13.8568f, y2 = 17.5f, x3 = 13.7378f, y3 = 17.5f)
                horizontalLineTo(x = 10.3318f)
                curveTo(x1 = 10.2225f, y1 = 17.5f, x2 = 10.1145f, y2 = 17.4761f, x3 = 10.0155f, y3 = 17.43f)
                lineTo(x = 9.2413f, y = 17.07f)
                curveTo(x1 = 9.14222f, y1 = 17.0239f, x2 = 9.03427f, y2 = 17.0f, x3 = 8.925f, y3 = 17.0f)
                horizontalLineTo(x = 1.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 2.75f, y = 4.0f)
                curveTo(x1 = 2.33579f, y1 = 4.0f, x2 = 2.0f, y2 = 4.33579f, x3 = 2.0f, y3 = 4.75f)
                verticalLineTo(y = 15.25f)
                curveTo(x1 = 2.0f, y1 = 15.6642f, x2 = 2.33579f, y2 = 16.0f, x3 = 2.75f, y3 = 16.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 16.0f, x2 = 22.0f, y2 = 15.6642f, x3 = 22.0f, y3 = 15.25f)
                verticalLineTo(y = 4.75f)
                curveTo(x1 = 22.0f, y1 = 4.33579f, x2 = 21.6642f, y2 = 4.0f, x3 = 21.25f, y3 = 4.0f)
                horizontalLineTo(x = 2.75f)
                close()
            }
        }.build().also { _macbookAir = it }
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
                imageVector = MacbookAir,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _macbookAir: ImageVector? = null
