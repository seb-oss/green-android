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
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 2.75f, y = 9.75005f)
                    verticalLineTo(y = 19.2461f)
                    horizontalLineTo(x = 21.2461f)
                    verticalLineTo(y = 9.75005f)
                    moveTo(x = 2.75f, y = 9.75005f)
                    verticalLineTo(y = 4.75293f)
                    horizontalLineTo(x = 21.2422f)
                    curveTo(
                        x1 = 21.247f,
                        y1 = 6.41863f,
                        x2 = 21.2461f,
                        y2 = 8.08434f,
                        x3 = 21.2461f,
                        y3 = 9.75005f,
                    )
                    moveTo(x = 2.75f, y = 9.75005f)
                    horizontalLineTo(x = 21.2461f)
                    moveTo(x = 6.75f, y = 13.25f)
                    horizontalLineTo(x = 9.75f)
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
