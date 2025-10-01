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

val Wallet: ImageVector
    get() {
        val current = _wallet
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Wallet",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 6.5f, y = 3.0f)
                    curveTo(x1 = 4.567f, y1 = 3.0f, x2 = 3.0f, y2 = 4.567f, x3 = 3.0f, y3 = 6.5f)
                    verticalLineTo(y = 17.25f)
                    curveTo(
                        x1 = 3.0f,
                        y1 = 19.3211f,
                        x2 = 4.67893f,
                        y2 = 21.0f,
                        x3 = 6.75f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 20.25f)
                    curveTo(
                        x1 = 20.6642f,
                        y1 = 21.0f,
                        x2 = 21.0f,
                        y2 = 20.6642f,
                        x3 = 21.0f,
                        y3 = 20.25f,
                    )
                    verticalLineTo(y = 8.75f)
                    curveTo(
                        x1 = 21.0f,
                        y1 = 8.33579f,
                        x2 = 20.6642f,
                        y2 = 8.0f,
                        x3 = 20.25f,
                        y3 = 8.0f,
                    )
                    horizontalLineTo(x = 17.0f)
                    verticalLineTo(y = 3.75f)
                    curveTo(
                        x1 = 17.0f,
                        y1 = 3.33579f,
                        x2 = 16.6642f,
                        y2 = 3.0f,
                        x3 = 16.25f,
                        y3 = 3.0f,
                    )
                    horizontalLineTo(x = 6.5f)
                    close()
                    moveTo(x = 15.5f, y = 8.0f)
                    verticalLineTo(y = 4.5f)
                    horizontalLineTo(x = 6.5f)
                    curveTo(
                        x1 = 5.39543f,
                        y1 = 4.5f,
                        x2 = 4.5f,
                        y2 = 5.39543f,
                        x3 = 4.5f,
                        y3 = 6.5f,
                    )
                    curveTo(
                        x1 = 4.5f,
                        y1 = 7.32843f,
                        x2 = 5.17157f,
                        y2 = 8.0f,
                        x3 = 6.0f,
                        y3 = 8.0f,
                    )
                    horizontalLineTo(x = 15.5f)
                    close()
                    moveTo(x = 15.5f, y = 15.5f)
                    curveTo(
                        x1 = 16.0523f,
                        y1 = 15.5f,
                        x2 = 16.5f,
                        y2 = 15.0523f,
                        x3 = 16.5f,
                        y3 = 14.5f,
                    )
                    curveTo(
                        x1 = 16.5f,
                        y1 = 13.9477f,
                        x2 = 16.0523f,
                        y2 = 13.5f,
                        x3 = 15.5f,
                        y3 = 13.5f,
                    )
                    curveTo(
                        x1 = 14.9477f,
                        y1 = 13.5f,
                        x2 = 14.5f,
                        y2 = 13.9477f,
                        x3 = 14.5f,
                        y3 = 14.5f,
                    )
                    curveTo(
                        x1 = 14.5f,
                        y1 = 15.0523f,
                        x2 = 14.9477f,
                        y2 = 15.5f,
                        x3 = 15.5f,
                        y3 = 15.5f,
                    )
                    close()
                }
            }.build()
            .also { _wallet = it }
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
                imageVector = Wallet,
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
private var _wallet: ImageVector? = null
