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

val PiggyBank: ImageVector
    get() {
        val current = _piggyBank
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PiggyBank",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 5.0f, y = 3.75f)
                    curveTo(x1 = 5.0f, y1 = 3.33579f, x2 = 5.33579f, y2 = 3.0f, x3 = 5.75f, y3 = 3.0f)
                    curveTo(x1 = 6.47743f, y1 = 3.0f, x2 = 8.50198f, y2 = 3.24069f, x3 = 10.1403f, y3 = 5.0f)
                    horizontalLineTo(x = 14.004f)
                    curveTo(x1 = 17.87f, y1 = 5.0f, x2 = 21.004f, y2 = 8.13401f, x3 = 21.004f, y3 = 12.0f)
                    curveTo(x1 = 21.004f, y1 = 12.8135f, x2 = 20.8649f, y2 = 13.5957f, x3 = 20.6089f, y3 = 14.3235f)
                    curveTo(x1 = 20.7965f, y1 = 14.4358f, x2 = 21.0156f, y2 = 14.5f, x3 = 21.25f, y3 = 14.5f)
                    curveTo(x1 = 21.9404f, y1 = 14.5f, x2 = 22.5f, y2 = 13.9404f, x3 = 22.5f, y3 = 13.25f)
                    curveTo(x1 = 22.5f, y1 = 12.9537f, x2 = 22.3978f, y2 = 12.6832f, x3 = 22.2262f, y3 = 12.4691f)
                    curveTo(x1 = 21.9671f, y1 = 12.1459f, x2 = 22.0191f, y2 = 11.6739f, x3 = 22.3422f, y3 = 11.4148f)
                    curveTo(x1 = 22.6654f, y1 = 11.1557f, x2 = 23.1374f, y2 = 11.2077f, x3 = 23.3965f, y3 = 11.5309f)
                    curveTo(x1 = 23.7738f, y1 = 12.0016f, x2 = 24.0f, y2 = 12.6004f, x3 = 24.0f, y3 = 13.25f)
                    curveTo(x1 = 24.0f, y1 = 14.7688f, x2 = 22.7688f, y2 = 16.0f, x3 = 21.25f, y3 = 16.0f)
                    curveTo(x1 = 20.7839f, y1 = 16.0f, x2 = 20.3448f, y2 = 15.8838f, x3 = 19.9602f, y3 = 15.6792f)
                    curveTo(x1 = 19.6857f, y1 = 16.1227f, x2 = 19.3632f, y2 = 16.533f, x3 = 19.0f, y3 = 16.9031f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 19.0f, y1 = 20.6642f, x2 = 18.6642f, y2 = 21.0f, x3 = 18.25f, y3 = 21.0f)
                    horizontalLineTo(x = 13.75f)
                    curveTo(x1 = 13.3358f, y1 = 21.0f, x2 = 13.0f, y2 = 20.6642f, x3 = 13.0f, y3 = 20.25f)
                    verticalLineTo(y = 19.0f)
                    horizontalLineTo(x = 11.0f)
                    verticalLineTo(y = 20.25f)
                    curveTo(x1 = 11.0f, y1 = 20.6642f, x2 = 10.6642f, y2 = 21.0f, x3 = 10.25f, y3 = 21.0f)
                    horizontalLineTo(x = 5.75f)
                    curveTo(x1 = 5.33579f, y1 = 21.0f, x2 = 5.0f, y2 = 20.6642f, x3 = 5.0f, y3 = 20.25f)
                    verticalLineTo(y = 16.8949f)
                    curveTo(x1 = 4.46134f, y1 = 16.3443f, x2 = 4.01257f, y2 = 15.7048f, x3 = 3.67782f, y3 = 15.0f)
                    horizontalLineTo(x = 1.75f)
                    curveTo(x1 = 1.33579f, y1 = 15.0f, x2 = 1.0f, y2 = 14.6642f, x3 = 1.0f, y3 = 14.25f)
                    verticalLineTo(y = 9.75f)
                    curveTo(x1 = 1.0f, y1 = 9.33579f, x2 = 1.33579f, y2 = 9.0f, x3 = 1.75f, y3 = 9.0f)
                    horizontalLineTo(x = 3.67782f)
                    curveTo(x1 = 4.01257f, y1 = 8.29522f, x2 = 4.46134f, y2 = 7.65571f, x3 = 5.0f, y3 = 7.1051f)
                    verticalLineTo(y = 3.75f)
                    close()
                    moveTo(x = 8.25f, y = 12.0f)
                    curveTo(x1 = 8.94036f, y1 = 12.0f, x2 = 9.5f, y2 = 11.4404f, x3 = 9.5f, y3 = 10.75f)
                    curveTo(x1 = 9.5f, y1 = 10.0596f, x2 = 8.94036f, y2 = 9.5f, x3 = 8.25f, y3 = 9.5f)
                    curveTo(x1 = 7.55964f, y1 = 9.5f, x2 = 7.0f, y2 = 10.0596f, x3 = 7.0f, y3 = 10.75f)
                    curveTo(x1 = 7.0f, y1 = 11.4404f, x2 = 7.55964f, y2 = 12.0f, x3 = 8.25f, y3 = 12.0f)
                    close()
                }
            }.build()
            .also { _piggyBank = it }
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
                imageVector = PiggyBank,
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
private var _piggyBank: ImageVector? = null
