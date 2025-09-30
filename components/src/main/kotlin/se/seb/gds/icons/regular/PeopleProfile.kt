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

val PeopleProfile: ImageVector
    get() {
        val current = _peopleProfile
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.PeopleProfile",
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
                    moveTo(x = 15.75f, y = 6.5f)
                    curveTo(x1 = 15.75f, y1 = 8.57107f, x2 = 14.0711f, y2 = 10.25f, x3 = 12.0f, y3 = 10.25f)
                    curveTo(x1 = 9.92893f, y1 = 10.25f, x2 = 8.25f, y2 = 8.57107f, x3 = 8.25f, y3 = 6.5f)
                    curveTo(x1 = 8.25f, y1 = 4.42893f, x2 = 9.92893f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                    curveTo(x1 = 14.0711f, y1 = 2.75f, x2 = 15.75f, y2 = 4.42893f, x3 = 15.75f, y3 = 6.5f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 12.0f, y = 13.25f)
                    curveTo(x1 = 7.8098f, y1 = 13.25f, x2 = 4.86894f, y2 = 16.3254f, x3 = 4.5f, y3 = 20.25f)
                    horizontalLineTo(x = 19.5f)
                    curveTo(x1 = 19.1311f, y1 = 16.3254f, x2 = 16.1902f, y2 = 13.25f, x3 = 12.0f, y3 = 13.25f)
                    close()
                }
            }.build()
            .also { _peopleProfile = it }
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
                imageVector = PeopleProfile,
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
private var _peopleProfile: ImageVector? = null
