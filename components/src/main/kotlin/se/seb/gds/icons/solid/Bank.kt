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

val Bank: ImageVector
    get() {
        val current = _bank
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Bank",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 12.3382f, y = 1.83058f)
                curveTo(x1 = 12.1255f, y1 = 1.72314f, x2 = 11.8745f, y2 = 1.72314f, x3 = 11.6618f, y3 = 1.83058f)
                lineTo(x = 2.41181f, y = 6.50365f)
                curveTo(x1 = 2.15926f, y1 = 6.63125f, x2 = 2.00001f, y2 = 6.89012f, x3 = 2.00001f, y3 = 7.17308f)
                verticalLineTo(y = 9.25f)
                curveTo(x1 = 2.00001f, y1 = 9.66421f, x2 = 2.33579f, y2 = 10.0f, x3 = 2.75001f, y3 = 10.0f)
                horizontalLineTo(x = 4.00001f)
                verticalLineTo(y = 16.5f)
                horizontalLineTo(x = 3.75001f)
                curveTo(x1 = 3.42718f, y1 = 16.5f, x2 = 3.14058f, y2 = 16.7066f, x3 = 3.03849f, y3 = 17.0128f)
                lineTo(x = 2.03849f, y = 20.0128f)
                curveTo(x1 = 1.96226f, y1 = 20.2415f, x2 = 2.00061f, y2 = 20.493f, x3 = 2.14157f, y3 = 20.6885f)
                curveTo(x1 = 2.28254f, y1 = 20.8841f, x2 = 2.50892f, y2 = 21.0f, x3 = 2.75001f, y3 = 21.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.4911f, y1 = 21.0f, x2 = 21.7175f, y2 = 20.8841f, x3 = 21.8584f, y3 = 20.6885f)
                curveTo(x1 = 21.9994f, y1 = 20.493f, x2 = 22.0378f, y2 = 20.2415f, x3 = 21.9615f, y3 = 20.0128f)
                lineTo(x = 20.9615f, y = 17.0128f)
                curveTo(x1 = 20.8594f, y1 = 16.7066f, x2 = 20.5728f, y2 = 16.5f, x3 = 20.25f, y3 = 16.5f)
                horizontalLineTo(x = 20.0f)
                verticalLineTo(y = 10.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 10.0f, x2 = 22.0f, y2 = 9.66421f, x3 = 22.0f, y3 = 9.25f)
                verticalLineTo(y = 7.17308f)
                curveTo(x1 = 22.0f, y1 = 6.89012f, x2 = 21.8408f, y2 = 6.63125f, x3 = 21.5882f, y3 = 6.50365f)
                lineTo(x = 12.3382f, y = 1.83058f)
                close()
                moveTo(x = 16.0f, y = 10.0f)
                horizontalLineTo(x = 18.5f)
                verticalLineTo(y = 16.5f)
                horizontalLineTo(x = 16.0f)
                verticalLineTo(y = 10.0f)
                close()
                moveTo(x = 8.00001f, y = 16.5f)
                horizontalLineTo(x = 5.50001f)
                verticalLineTo(y = 10.0f)
                horizontalLineTo(x = 8.00001f)
                verticalLineTo(y = 16.5f)
                close()
                moveTo(x = 9.50001f, y = 16.5f)
                verticalLineTo(y = 10.0f)
                horizontalLineTo(x = 14.5f)
                verticalLineTo(y = 16.5f)
                horizontalLineTo(x = 9.50001f)
                close()
            }
        }.build().also { _bank = it }
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
                imageVector = Bank,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bank: ImageVector? = null
