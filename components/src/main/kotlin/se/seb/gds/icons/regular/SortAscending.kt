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

internal val SortAscending: ImageVector
    get() {
        val current = _sortAscending
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.SortAscending",
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
                moveTo(x = 14.3482f, y = 10.25f)
                lineTo(x = 15.5606f, y = 7.75f)
                moveTo(x = 15.5606f, y = 7.75f)
                lineTo(x = 17.5005f, y = 3.75f)
                lineTo(x = 19.4338f, y = 7.75f)
                moveTo(x = 15.5606f, y = 7.75f)
                horizontalLineTo(x = 19.4338f)
                moveTo(x = 19.4338f, y = 7.75f)
                lineTo(x = 20.6421f, y = 10.25f)
                moveTo(x = 14.75f, y = 13.75f)
                horizontalLineTo(x = 20.25f)
                lineTo(x = 14.75f, y = 20.25f)
                horizontalLineTo(x = 20.25f)
                moveTo(x = 7.0f, y = 3.75f)
                verticalLineTo(y = 20.25f)
                moveTo(x = 7.0f, y = 20.25f)
                lineTo(x = 4.0f, y = 17.25f)
                moveTo(x = 7.0f, y = 20.25f)
                lineTo(x = 10.0f, y = 17.25f)
            }
        }.build().also { _sortAscending = it }
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
                imageVector = SortAscending,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _sortAscending: ImageVector? = null
