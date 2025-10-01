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

val PeopleCircle: ImageVector
    get() {
        val current = _peopleCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.PeopleCircle",
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
                moveTo(x = 5.85697f, y = 18.9157f)
                curveTo(x1 = 7.17056f, y1 = 16.9968f, x2 = 9.33203f, y2 = 15.75f, x3 = 12.0f, y3 = 15.75f)
                curveTo(x1 = 14.668f, y1 = 15.75f, x2 = 16.8294f, y2 = 16.9968f, x3 = 18.143f, y3 = 18.9157f)
                moveTo(x = 5.85697f, y = 18.9157f)
                curveTo(x1 = 7.49061f, y1 = 20.3679f, x2 = 9.6423f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                curveTo(x1 = 14.3577f, y1 = 21.25f, x2 = 16.5094f, y2 = 20.3679f, x3 = 18.143f, y3 = 18.9157f)
                moveTo(x = 5.85697f, y = 18.9157f)
                curveTo(x1 = 3.95086f, y1 = 17.2214f, x2 = 2.75f, y2 = 14.7509f, x3 = 2.75f, y3 = 12.0f)
                curveTo(x1 = 2.75f, y1 = 6.89137f, x2 = 6.89137f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 17.1086f, y1 = 2.75f, x2 = 21.25f, y2 = 6.89137f, x3 = 21.25f, y3 = 12.0f)
                curveTo(x1 = 21.25f, y1 = 14.7509f, x2 = 20.0491f, y2 = 17.2214f, x3 = 18.143f, y3 = 18.9157f)
                moveTo(x = 15.25f, y = 10.0f)
                curveTo(x1 = 15.25f, y1 = 11.7949f, x2 = 13.7949f, y2 = 13.25f, x3 = 12.0f, y3 = 13.25f)
                curveTo(x1 = 10.2051f, y1 = 13.25f, x2 = 8.75f, y2 = 11.7949f, x3 = 8.75f, y3 = 10.0f)
                curveTo(x1 = 8.75f, y1 = 8.20507f, x2 = 10.2051f, y2 = 6.75f, x3 = 12.0f, y3 = 6.75f)
                curveTo(x1 = 13.7949f, y1 = 6.75f, x2 = 15.25f, y2 = 8.20507f, x3 = 15.25f, y3 = 10.0f)
                close()
            }
        }.build().also { _peopleCircle = it }
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
                imageVector = PeopleCircle,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _peopleCircle: ImageVector? = null
