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

val Maintenance: ImageVector
    get() {
        val current = _maintenance
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Maintenance",
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
                    moveTo(x = 14.5694f, y = 16.1111f)
                    curveTo(x1 = 18.259f, y1 = 16.1111f, x2 = 21.25f, y2 = 13.1201f, x3 = 21.25f, y3 = 9.43056f)
                    curveTo(x1 = 21.25f, y1 = 8.66012f, x2 = 21.1196f, y2 = 7.92014f, x3 = 20.8796f, y3 = 7.23149f)
                    lineTo(x = 18.1667f, y = 9.94444f)
                    curveTo(x1 = 17.0314f, y1 = 11.0797f, x2 = 15.1908f, y2 = 11.0797f, x3 = 14.0556f, y3 = 9.94444f)
                    curveTo(x1 = 12.9203f, y1 = 8.80919f, x2 = 12.9203f, y2 = 6.96858f, x3 = 14.0556f, y3 = 5.83333f)
                    lineTo(x = 16.7685f, y = 3.12038f)
                    curveTo(x1 = 16.0799f, y1 = 2.88042f, x2 = 15.3399f, y2 = 2.75f, x3 = 14.5694f, y3 = 2.75f)
                    curveTo(x1 = 10.8799f, y1 = 2.75f, x2 = 7.88889f, y2 = 5.74099f, x3 = 7.88889f, y3 = 9.43056f)
                    curveTo(x1 = 7.88889f, y1 = 10.3416f, x2 = 8.07124f, y2 = 11.21f, x3 = 8.40145f, y3 = 12.0013f)
                    lineTo(x = 2.75f, y = 17.6528f)
                    lineTo(x = 6.34722f, y = 21.25f)
                    lineTo(x = 11.9987f, y = 15.5986f)
                    curveTo(x1 = 12.79f, y1 = 15.9288f, x2 = 13.6584f, y2 = 16.1111f, x3 = 14.5694f, y3 = 16.1111f)
                    close()
                }
            }.build()
            .also { _maintenance = it }
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
                imageVector = Maintenance,
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
private var _maintenance: ImageVector? = null
