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

val CreditCard: ImageVector
    get() {
        val current = _creditCard
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CreditCard",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 2.75f, y = 4.00293f)
                    curveTo(x1 = 2.33579f, y1 = 4.00293f, x2 = 2.0f, y2 = 4.33872f, x3 = 2.0f, y3 = 4.75293f)
                    verticalLineTo(y = 9.0f)
                    horizontalLineTo(x = 21.9961f)
                    verticalLineTo(y = 10.5f)
                    horizontalLineTo(x = 2.0f)
                    verticalLineTo(y = 19.2461f)
                    curveTo(x1 = 2.0f, y1 = 19.6604f, x2 = 2.33579f, y2 = 19.9961f, x3 = 2.75f, y3 = 19.9961f)
                    horizontalLineTo(x = 21.2461f)
                    curveTo(x1 = 21.6603f, y1 = 19.9961f, x2 = 21.9961f, y2 = 19.6604f, x3 = 21.9961f, y3 = 19.2461f)
                    lineTo(x = 21.9961f, y = 9.05303f)
                    curveTo(x1 = 21.9962f, y1 = 7.61979f, x2 = 21.9964f, y2 = 6.18525f, x3 = 21.9922f, y3 = 4.75075f)
                    curveTo(x1 = 21.991f, y1 = 4.33739f, x2 = 21.6556f, y2 = 4.00293f, x3 = 21.2422f, y3 = 4.00293f)
                    horizontalLineTo(x = 2.75f)
                    close()
                    moveTo(x = 6.75f, y = 12.5f)
                    curveTo(x1 = 6.33579f, y1 = 12.5f, x2 = 6.0f, y2 = 12.8358f, x3 = 6.0f, y3 = 13.25f)
                    curveTo(x1 = 6.0f, y1 = 13.6642f, x2 = 6.33579f, y2 = 14.0f, x3 = 6.75f, y3 = 14.0f)
                    horizontalLineTo(x = 9.75f)
                    curveTo(x1 = 10.1642f, y1 = 14.0f, x2 = 10.5f, y2 = 13.6642f, x3 = 10.5f, y3 = 13.25f)
                    curveTo(x1 = 10.5f, y1 = 12.8358f, x2 = 10.1642f, y2 = 12.5f, x3 = 9.75f, y3 = 12.5f)
                    horizontalLineTo(x = 6.75f)
                    close()
                }
            }.build()
            .also { _creditCard = it }
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
                imageVector = CreditCard,
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
private var _creditCard: ImageVector? = null
