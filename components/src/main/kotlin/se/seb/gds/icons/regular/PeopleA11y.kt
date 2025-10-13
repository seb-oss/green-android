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

internal val PeopleA11y: ImageVector
    get() {
        val current = _peopleA11y
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.PeopleA11y",
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
                moveTo(x = 12.0f, y = 21.25f)
                curveTo(x1 = 17.1086f, y1 = 21.25f, x2 = 21.25f, y2 = 17.1086f, x3 = 21.25f, y3 = 12.0f)
                curveTo(x1 = 21.25f, y1 = 6.89137f, x2 = 17.1086f, y2 = 2.75f, x3 = 12.0f, y3 = 2.75f)
                curveTo(x1 = 6.89137f, y1 = 2.75f, x2 = 2.75f, y2 = 6.89137f, x3 = 2.75f, y3 = 12.0f)
                curveTo(x1 = 2.75f, y1 = 17.1086f, x2 = 6.89137f, y2 = 21.25f, x3 = 12.0f, y3 = 21.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.2485f, y = 16.25f)
                curveTo(x1 = 12.7476f, y1 = 14.7408f, x2 = 11.9999f, y2 = 13.2338f, x3 = 11.9985f, y3 = 11.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.75f, y = 16.25f)
                curveTo(x1 = 11.2894f, y1 = 14.758f, x2 = 11.9998f, y2 = 13.2338f, x3 = 11.9984f, y3 = 11.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.75f, y = 10.6912f)
                curveTo(x1 = 8.75f, y1 = 10.6912f, x2 = 10.7206f, y2 = 10.9559f, x3 = 11.9996f, y3 = 10.9559f)
                curveTo(x1 = 13.2787f, y1 = 10.9559f, x2 = 15.25f, y2 = 10.6912f, x3 = 15.25f, y3 = 10.6912f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.75f, y = 8.0f)
                curveTo(x1 = 12.75f, y1 = 8.41421f, x2 = 12.4142f, y2 = 8.75f, x3 = 12.0f, y3 = 8.75f)
                curveTo(x1 = 11.5858f, y1 = 8.75f, x2 = 11.25f, y2 = 8.41421f, x3 = 11.25f, y3 = 8.0f)
                curveTo(x1 = 11.25f, y1 = 7.58579f, x2 = 11.5858f, y2 = 7.25f, x3 = 12.0f, y3 = 7.25f)
                curveTo(x1 = 12.4142f, y1 = 7.25f, x2 = 12.75f, y2 = 7.58579f, x3 = 12.75f, y3 = 8.0f)
                close()
            }
        }.build().also { _peopleA11y = it }
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
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _peopleA11y: ImageVector? = null
