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

val PeopleAdd: ImageVector
    get() {
        val current = _peopleAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.PeopleAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                curveTo(x1 = 9.51472f, y1 = 2.0f, x2 = 7.5f, y2 = 4.01472f, x3 = 7.5f, y3 = 6.5f)
                curveTo(x1 = 7.5f, y1 = 8.98528f, x2 = 9.51472f, y2 = 11.0f, x3 = 12.0f, y3 = 11.0f)
                curveTo(x1 = 14.4853f, y1 = 11.0f, x2 = 16.5f, y2 = 8.98528f, x3 = 16.5f, y3 = 6.5f)
                curveTo(x1 = 16.5f, y1 = 4.01472f, x2 = 14.4853f, y2 = 2.0f, x3 = 12.0f, y3 = 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 3.7533f, y = 20.1798f)
                curveTo(x1 = 4.15473f, y1 = 15.9097f, x2 = 7.38415f, y2 = 12.5f, x3 = 12.0f, y3 = 12.5f)
                curveTo(x1 = 13.7292f, y1 = 12.5f, x2 = 15.2639f, y2 = 12.9785f, x3 = 16.5281f, y3 = 13.8016f)
                curveTo(x1 = 16.1986f, y1 = 14.193f, x2 = 16.0f, y2 = 14.6983f, x3 = 16.0f, y3 = 15.25f)
                verticalLineTo(y = 16.0f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 14.0074f, y1 = 16.0f, x2 = 13.0f, y2 = 17.0074f, x3 = 13.0f, y3 = 18.25f)
                curveTo(x1 = 13.0f, y1 = 19.4926f, x2 = 14.0074f, y2 = 20.5f, x3 = 15.25f, y3 = 20.5f)
                horizontalLineTo(x = 16.0f)
                verticalLineTo(y = 21.0f)
                horizontalLineTo(x = 4.5f)
                curveTo(x1 = 4.28888f, y1 = 21.0f, x2 = 4.08754f, y2 = 20.911f, x3 = 3.94541f, y3 = 20.7549f)
                curveTo(x1 = 3.80328f, y1 = 20.5988f, x2 = 3.73354f, y2 = 20.39f, x3 = 3.7533f, y3 = 20.1798f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 19.0f, y = 15.25f)
                curveTo(x1 = 19.0f, y1 = 14.8358f, x2 = 18.6642f, y2 = 14.5f, x3 = 18.25f, y3 = 14.5f)
                curveTo(x1 = 17.8358f, y1 = 14.5f, x2 = 17.5f, y2 = 14.8358f, x3 = 17.5f, y3 = 15.25f)
                verticalLineTo(y = 17.5f)
                horizontalLineTo(x = 15.25f)
                curveTo(x1 = 14.8358f, y1 = 17.5f, x2 = 14.5f, y2 = 17.8358f, x3 = 14.5f, y3 = 18.25f)
                curveTo(x1 = 14.5f, y1 = 18.6642f, x2 = 14.8358f, y2 = 19.0f, x3 = 15.25f, y3 = 19.0f)
                horizontalLineTo(x = 17.5f)
                verticalLineTo(y = 21.25f)
                curveTo(x1 = 17.5f, y1 = 21.6642f, x2 = 17.8358f, y2 = 22.0f, x3 = 18.25f, y3 = 22.0f)
                curveTo(x1 = 18.6642f, y1 = 22.0f, x2 = 19.0f, y2 = 21.6642f, x3 = 19.0f, y3 = 21.25f)
                verticalLineTo(y = 19.0f)
                horizontalLineTo(x = 21.25f)
                curveTo(x1 = 21.6642f, y1 = 19.0f, x2 = 22.0f, y2 = 18.6642f, x3 = 22.0f, y3 = 18.25f)
                curveTo(x1 = 22.0f, y1 = 17.8358f, x2 = 21.6642f, y2 = 17.5f, x3 = 21.25f, y3 = 17.5f)
                horizontalLineTo(x = 19.0f)
                verticalLineTo(y = 15.25f)
                close()
            }
        }.build().also { _peopleAdd = it }
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
                imageVector = PeopleAdd,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _peopleAdd: ImageVector? = null
