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

val PeopleA11y: ImageVector
    get() {
        val current = _peopleA11y
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PeopleA11y",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(x = 12.0f, y = 2.0f)
                    curveTo(x1 = 6.47715f, y1 = 2.0f, x2 = 2.0f, y2 = 6.47715f, x3 = 2.0f, y3 = 12.0f)
                    curveTo(x1 = 2.0f, y1 = 17.5228f, x2 = 6.47715f, y2 = 22.0f, x3 = 12.0f, y3 = 22.0f)
                    curveTo(x1 = 17.5228f, y1 = 22.0f, x2 = 22.0f, y2 = 17.5228f, x3 = 22.0f, y3 = 12.0f)
                    curveTo(x1 = 22.0f, y1 = 6.47715f, x2 = 17.5228f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                    close()
                    moveTo(x = 12.0f, y = 6.5f)
                    curveTo(x1 = 11.1716f, y1 = 6.5f, x2 = 10.5f, y2 = 7.17157f, x3 = 10.5f, y3 = 8.0f)
                    curveTo(x1 = 10.5f, y1 = 8.82843f, x2 = 11.1716f, y2 = 9.5f, x3 = 12.0f, y3 = 9.5f)
                    curveTo(x1 = 12.8284f, y1 = 9.5f, x2 = 13.5f, y2 = 8.82843f, x3 = 13.5f, y3 = 8.0f)
                    curveTo(x1 = 13.5f, y1 = 7.17157f, x2 = 12.8284f, y2 = 6.5f, x3 = 12.0f, y3 = 6.5f)
                    close()
                    moveTo(x = 11.2407f, y = 11.6834f)
                    curveTo(x1 = 11.1699f, y1 = 13.2501f, x2 = 10.6131f, y2 = 14.4679f, x3 = 9.31529f, y3 = 15.7077f)
                    curveTo(x1 = 9.01576f, y1 = 15.9938f, x2 = 9.00489f, y2 = 16.4685f, x3 = 9.291f, y3 = 16.768f)
                    curveTo(x1 = 9.57711f, y1 = 17.0676f, x2 = 10.0519f, y2 = 17.0784f, x3 = 10.3514f, y3 = 16.7923f)
                    curveTo(x1 = 11.0847f, y1 = 16.0919f, x2 = 11.6343f, y2 = 15.3746f, x3 = 12.021f, y3 = 14.6089f)
                    curveTo(x1 = 12.4136f, y1 = 15.3682f, x2 = 12.9522f, y2 = 16.0769f, x3 = 13.629f, y3 = 16.7729f)
                    curveTo(x1 = 13.9177f, y1 = 17.0698f, x2 = 14.3926f, y2 = 17.0765f, x3 = 14.6895f, y3 = 16.7877f)
                    curveTo(x1 = 14.9865f, y1 = 16.4989f, x2 = 14.9931f, y2 = 16.0241f, x3 = 14.7044f, y3 = 15.7271f)
                    curveTo(x1 = 13.4602f, y1 = 14.4476f, x2 = 12.841f, y2 = 13.2299f, x3 = 12.7582f, y3 = 11.6834f)
                    curveTo(x1 = 13.2466f, y1 = 11.6576f, x2 = 13.7527f, y2 = 11.613f, x3 = 14.18f, y3 = 11.5697f)
                    curveTo(x1 = 14.571f, y1 = 11.5301f, x2 = 14.9604f, y2 = 11.4831f, x3 = 15.3495f, y3 = 11.433f)
                    curveTo(x1 = 15.7604f, y1 = 11.3801f, x2 = 16.0484f, y2 = 11.0019f, x3 = 15.9932f, y3 = 10.5914f)
                    curveTo(x1 = 15.9381f, y1 = 10.1808f, x2 = 15.5607f, y2 = 9.89354f, x3 = 15.1499f, y3 = 9.94637f)
                    curveTo(x1 = 14.7769f, y1 = 9.99433f, x2 = 14.4036f, y2 = 10.0393f, x3 = 14.0287f, y3 = 10.0773f)
                    curveTo(x1 = 13.3808f, y1 = 10.143f, x2 = 12.5994f, y2 = 10.2059f, x3 = 11.9996f, y3 = 10.2059f)
                    curveTo(x1 = 11.3997f, y1 = 10.2059f, x2 = 10.6185f, y2 = 10.143f, x3 = 9.97075f, y3 = 10.0773f)
                    curveTo(x1 = 9.59603f, y1 = 10.0393f, x2 = 9.22287f, y2 = 9.99434f, x3 = 8.84996f, y3 = 9.94637f)
                    curveTo(x1 = 8.43913f, y1 = 9.89352f, x2 = 8.06173f, y2 = 10.1808f, x3 = 8.00659f, y3 = 10.5913f)
                    curveTo(x1 = 7.95144f, y1 = 11.0018f, x2 = 8.23944f, y2 = 11.3801f, x3 = 8.65026f, y3 = 11.433f)
                    curveTo(x1 = 9.03927f, y1 = 11.4831f, x2 = 9.42853f, y2 = 11.5301f, x3 = 9.81941f, y3 = 11.5697f)
                    curveTo(x1 = 10.2466f, y1 = 11.613f, x2 = 10.7524f, y2 = 11.6575f, x3 = 11.2407f, y3 = 11.6834f)
                    close()
                }
            }.build()
            .also { _peopleA11y = it }
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
                imageVector = PeopleA11y,
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
private var _peopleA11y: ImageVector? = null
