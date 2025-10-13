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

internal val AirplaneUp: ImageVector
    get() {
        val current = _airplaneUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.AirplaneUp",
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
                moveTo(x = 4.15869f, y = 6.39304f)
                lineTo(x = 1.75f, y = 7.28394f)
                lineTo(x = 4.11619f, y = 10.844f)
                lineTo(x = 3.5f, y = 12.0001f)
                lineTo(x = 3.77183f, y = 12.6796f)
                curveTo(x1 = 4.1763f, y1 = 13.6908f, x2 = 5.31551f, y2 = 14.1925f, x3 = 6.33453f, y3 = 13.8082f)
                lineTo(x = 10.0f, y = 12.4258f)
                lineTo(x = 10.4012f, y = 15.7701f)
                lineTo(x = 13.2916f, y = 14.701f)
                lineTo(x = 15.5f, y = 10.3516f)
                lineTo(x = 20.4817f, y = 8.35636f)
                curveTo(x1 = 21.0968f, y1 = 8.11003f, x2 = 21.5f, y2 = 7.51419f, x3 = 21.5f, y3 = 6.85165f)
                curveTo(x1 = 21.5f, y1 = 6.06882f, x2 = 20.9405f, y2 = 5.39785f, x3 = 20.1704f, y3 = 5.25715f)
                lineTo(x = 17.9451f, y = 4.85054f)
                curveTo(x1 = 17.5854f, y1 = 4.78482f, x2 = 17.2181f, y2 = 4.81766f, x3 = 16.8764f, y3 = 4.94779f)
                curveTo(x1 = 15.2983f, y1 = 5.54881f, x2 = 10.5415f, y2 = 7.35862f, x3 = 8.52196f, y3 = 8.1056f)
                curveTo(x1 = 7.95008f, y1 = 8.31712f, x2 = 7.31528f, y2 = 8.25958f, x3 = 6.78927f, y3 = 7.94854f)
                lineTo(x = 4.15869f, y = 6.39304f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.75f, y = 19.25f)
                horizontalLineTo(x = 21.25f)
            }
        }.build().also { _airplaneUp = it }
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
                imageVector = AirplaneUp,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _airplaneUp: ImageVector? = null
