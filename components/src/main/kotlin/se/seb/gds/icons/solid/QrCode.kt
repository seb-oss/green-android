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

internal val QrCode: ImageVector
    get() {
        val current = _qrCode
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.QrCode",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 3.0f, y = 3.75f)
                curveTo(x1 = 3.0f, y1 = 3.33579f, x2 = 3.33579f, y2 = 3.0f, x3 = 3.75f, y3 = 3.0f)
                horizontalLineTo(x = 10.25f)
                curveTo(x1 = 10.6642f, y1 = 3.0f, x2 = 11.0f, y2 = 3.33579f, x3 = 11.0f, y3 = 3.75f)
                verticalLineTo(y = 10.25f)
                curveTo(x1 = 11.0f, y1 = 10.6642f, x2 = 10.6642f, y2 = 11.0f, x3 = 10.25f, y3 = 11.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 11.0f, x2 = 3.0f, y2 = 10.6642f, x3 = 3.0f, y3 = 10.25f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 4.5f, y = 4.5f)
                verticalLineTo(y = 9.5f)
                horizontalLineTo(x = 9.5f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 4.5f)
                close()
                moveTo(x = 13.0f, y = 3.75f)
                curveTo(x1 = 13.0f, y1 = 3.33579f, x2 = 13.3358f, y2 = 3.0f, x3 = 13.75f, y3 = 3.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 3.0f, x2 = 21.0f, y2 = 3.33579f, x3 = 21.0f, y3 = 3.75f)
                verticalLineTo(y = 10.25f)
                curveTo(x1 = 21.0f, y1 = 10.6642f, x2 = 20.6642f, y2 = 11.0f, x3 = 20.25f, y3 = 11.0f)
                horizontalLineTo(x = 13.75f)
                curveTo(x1 = 13.3358f, y1 = 11.0f, x2 = 13.0f, y2 = 10.6642f, x3 = 13.0f, y3 = 10.25f)
                verticalLineTo(y = 3.75f)
                close()
                moveTo(x = 14.5f, y = 4.5f)
                verticalLineTo(y = 9.5f)
                horizontalLineTo(x = 19.5f)
                verticalLineTo(y = 4.5f)
                horizontalLineTo(x = 14.5f)
                close()
                moveTo(x = 3.0f, y = 13.75f)
                curveTo(x1 = 3.0f, y1 = 13.3358f, x2 = 3.33579f, y2 = 13.0f, x3 = 3.75f, y3 = 13.0f)
                horizontalLineTo(x = 10.25f)
                curveTo(x1 = 10.6642f, y1 = 13.0f, x2 = 11.0f, y2 = 13.3358f, x3 = 11.0f, y3 = 13.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 11.0f, y1 = 20.6642f, x2 = 10.6642f, y2 = 21.0f, x3 = 10.25f, y3 = 21.0f)
                horizontalLineTo(x = 3.75f)
                curveTo(x1 = 3.33579f, y1 = 21.0f, x2 = 3.0f, y2 = 20.6642f, x3 = 3.0f, y3 = 20.25f)
                verticalLineTo(y = 13.75f)
                close()
                moveTo(x = 4.5f, y = 14.5f)
                verticalLineTo(y = 19.5f)
                horizontalLineTo(x = 9.5f)
                verticalLineTo(y = 14.5f)
                horizontalLineTo(x = 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 13.75f, y = 13.0f)
                curveTo(x1 = 14.1642f, y1 = 13.0f, x2 = 14.5f, y2 = 13.3358f, x3 = 14.5f, y3 = 13.75f)
                verticalLineTo(y = 15.5f)
                horizontalLineTo(x = 16.25f)
                curveTo(x1 = 16.6642f, y1 = 15.5f, x2 = 17.0f, y2 = 15.8358f, x3 = 17.0f, y3 = 16.25f)
                curveTo(x1 = 17.0f, y1 = 16.6642f, x2 = 16.6642f, y2 = 17.0f, x3 = 16.25f, y3 = 17.0f)
                horizontalLineTo(x = 13.75f)
                curveTo(x1 = 13.3358f, y1 = 17.0f, x2 = 13.0f, y2 = 16.6642f, x3 = 13.0f, y3 = 16.25f)
                verticalLineTo(y = 13.75f)
                curveTo(x1 = 13.0f, y1 = 13.3358f, x2 = 13.3358f, y2 = 13.0f, x3 = 13.75f, y3 = 13.0f)
                close()
                moveTo(x = 17.0f, y = 13.75f)
                curveTo(x1 = 17.0f, y1 = 13.3358f, x2 = 17.3358f, y2 = 13.0f, x3 = 17.75f, y3 = 13.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 13.0f, x2 = 21.0f, y2 = 13.3358f, x3 = 21.0f, y3 = 13.75f)
                curveTo(x1 = 21.0f, y1 = 14.1642f, x2 = 20.6642f, y2 = 14.5f, x3 = 20.25f, y3 = 14.5f)
                horizontalLineTo(x = 17.75f)
                curveTo(x1 = 17.3358f, y1 = 14.5f, x2 = 17.0f, y2 = 14.1642f, x3 = 17.0f, y3 = 13.75f)
                close()
                moveTo(x = 17.0f, y = 17.75f)
                curveTo(x1 = 17.0f, y1 = 17.3358f, x2 = 17.3358f, y2 = 17.0f, x3 = 17.75f, y3 = 17.0f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 17.0f, x2 = 21.0f, y2 = 17.3358f, x3 = 21.0f, y3 = 17.75f)
                curveTo(x1 = 21.0f, y1 = 18.1642f, x2 = 20.6642f, y2 = 18.5f, x3 = 20.25f, y3 = 18.5f)
                horizontalLineTo(x = 18.5f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 18.5f, y1 = 20.6642f, x2 = 18.1642f, y2 = 21.0f, x3 = 17.75f, y3 = 21.0f)
                curveTo(x1 = 17.3358f, y1 = 21.0f, x2 = 17.0f, y2 = 20.6642f, x3 = 17.0f, y3 = 20.25f)
                verticalLineTo(y = 17.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 5.5f, y = 15.5f)
                horizontalLineTo(x = 8.5f)
                verticalLineTo(y = 18.5f)
                horizontalLineTo(x = 5.5f)
                verticalLineTo(y = 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 5.5f, y = 5.5f)
                horizontalLineTo(x = 8.5f)
                verticalLineTo(y = 8.5f)
                horizontalLineTo(x = 5.5f)
                verticalLineTo(y = 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 15.5f, y = 5.5f)
                horizontalLineTo(x = 18.5f)
                verticalLineTo(y = 8.5f)
                horizontalLineTo(x = 15.5f)
                verticalLineTo(y = 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 13.75f, y = 19.0f)
                curveTo(x1 = 14.1642f, y1 = 19.0f, x2 = 14.5f, y2 = 19.3358f, x3 = 14.5f, y3 = 19.75f)
                verticalLineTo(y = 20.25f)
                curveTo(x1 = 14.5f, y1 = 20.6642f, x2 = 14.1642f, y2 = 21.0f, x3 = 13.75f, y3 = 21.0f)
                curveTo(x1 = 13.3358f, y1 = 21.0f, x2 = 13.0f, y2 = 20.6642f, x3 = 13.0f, y3 = 20.25f)
                verticalLineTo(y = 19.75f)
                curveTo(x1 = 13.0f, y1 = 19.3358f, x2 = 13.3358f, y2 = 19.0f, x3 = 13.75f, y3 = 19.0f)
                close()
            }
        }.build().also { _qrCode = it }
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
                imageVector = QrCode,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _qrCode: ImageVector? = null
