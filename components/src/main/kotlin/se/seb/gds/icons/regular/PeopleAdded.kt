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

val PeopleAdded: ImageVector
    get() {
        val current = _peopleAdded
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.PeopleAdded",
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
                moveTo(x = 11.8523f, y = 13.2513f)
                curveTo(x1 = 7.74082f, y1 = 13.3226f, x2 = 4.86459f, y2 = 16.3717f, x3 = 4.5f, y3 = 20.25f)
                horizontalLineTo(x = 11.5f)
                moveTo(x = 11.8523f, y = 13.2513f)
                curveTo(x1 = 11.9014f, y1 = 13.2504f, x2 = 11.9506f, y2 = 13.25f, x3 = 12.0f, y3 = 13.25f)
                curveTo(x1 = 12.3521f, y1 = 13.25f, x2 = 12.6954f, y2 = 13.2717f, x3 = 13.029f, y3 = 13.3138f)
                moveTo(x = 11.8523f, y = 13.2513f)
                curveTo(x1 = 11.2023f, y1 = 13.2626f, x2 = 10.5834f, y2 = 13.3483f, x3 = 10.0001f, y3 = 13.5f)
                moveTo(x = 13.029f, y = 13.3138f)
                curveTo(x1 = 13.3627f, y1 = 13.3559f, x2 = 13.6867f, y2 = 13.4184f, x3 = 14.0004f, y3 = 13.5f)
                moveTo(x = 13.029f, y = 13.3138f)
                curveTo(x1 = 13.7309f, y1 = 13.4024f, x2 = 14.3904f, y2 = 13.5812f, x3 = 15.0f, y3 = 13.838f)
                moveTo(x = 14.75f, y = 18.6f)
                lineTo(x = 16.95f, y = 20.25f)
                lineTo(x = 20.25f, y = 14.75f)
                moveTo(x = 15.75f, y = 6.5f)
                curveTo(x1 = 15.75f, y1 = 8.57107f, x2 = 14.0711f, y2 = 10.25f, x3 = 12.0f, y3 = 10.25f)
                curveTo(x1 = 9.92893f, y1 = 10.25f, x2 = 8.25f, y2 = 8.57107f, x3 = 8.25f, y3 = 6.5f)
                curveTo(x1 = 8.25f, y1 = 4.42893f, x2 = 9.92893f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 14.0711f, y1 = 2.75f, x2 = 15.75f, y2 = 4.42893f, x3 = 15.75f, y3 = 6.5f)
                close()
            }
        }.build().also { _peopleAdded = it }
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
                imageVector = PeopleAdded,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _peopleAdded: ImageVector? = null
