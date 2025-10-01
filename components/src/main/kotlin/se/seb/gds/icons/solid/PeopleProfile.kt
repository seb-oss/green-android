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
import androidx.compose.ui.graphics.SolidColor
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
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.0f, y = 2.0f)
                    curveTo(
                        x1 = 9.51472f,
                        y1 = 2.0f,
                        x2 = 7.5f,
                        y2 = 4.01472f,
                        x3 = 7.5f,
                        y3 = 6.5f,
                    )
                    curveTo(
                        x1 = 7.5f,
                        y1 = 8.98528f,
                        x2 = 9.51472f,
                        y2 = 11.0f,
                        x3 = 12.0f,
                        y3 = 11.0f,
                    )
                    curveTo(
                        x1 = 14.4853f,
                        y1 = 11.0f,
                        x2 = 16.5f,
                        y2 = 8.98528f,
                        x3 = 16.5f,
                        y3 = 6.5f,
                    )
                    curveTo(
                        x1 = 16.5f,
                        y1 = 4.01472f,
                        x2 = 14.4853f,
                        y2 = 2.0f,
                        x3 = 12.0f,
                        y3 = 2.0f,
                    )
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.0f, y = 12.5f)
                    curveTo(
                        x1 = 7.38412f,
                        y1 = 12.5f,
                        x2 = 4.15473f,
                        y2 = 15.9097f,
                        x3 = 3.7533f,
                        y3 = 20.1798f,
                    )
                    curveTo(
                        x1 = 3.73354f,
                        y1 = 20.39f,
                        x2 = 3.80328f,
                        y2 = 20.5988f,
                        x3 = 3.94541f,
                        y3 = 20.7549f,
                    )
                    curveTo(
                        x1 = 4.08754f,
                        y1 = 20.911f,
                        x2 = 4.28888f,
                        y2 = 21.0f,
                        x3 = 4.5f,
                        y3 = 21.0f,
                    )
                    horizontalLineTo(x = 19.5f)
                    curveTo(
                        x1 = 19.7111f,
                        y1 = 21.0f,
                        x2 = 19.9125f,
                        y2 = 20.911f,
                        x3 = 20.0546f,
                        y3 = 20.7549f,
                    )
                    curveTo(
                        x1 = 20.1967f,
                        y1 = 20.5988f,
                        x2 = 20.2665f,
                        y2 = 20.39f,
                        x3 = 20.2467f,
                        y3 = 20.1798f,
                    )
                    curveTo(
                        x1 = 19.8453f,
                        y1 = 15.9097f,
                        x2 = 16.6159f,
                        y2 = 12.5f,
                        x3 = 12.0f,
                        y3 = 12.5f,
                    )
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
