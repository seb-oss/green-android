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

val CalenderAdd: ImageVector
    get() {
        val current = _calenderAdd
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CalenderAdd",
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
                    moveTo(x = 7.75f, y = 4.75f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 9.25f)
                    moveTo(x = 7.75f, y = 4.75f)
                    horizontalLineTo(x = 16.25f)
                    moveTo(x = 7.75f, y = 4.75f)
                    verticalLineTo(y = 2.75f)
                    moveTo(x = 16.25f, y = 4.75f)
                    horizontalLineTo(x = 20.25f)
                    verticalLineTo(y = 9.25f)
                    moveTo(x = 16.25f, y = 4.75f)
                    verticalLineTo(y = 2.75f)
                    moveTo(x = 11.25f, y = 20.25f)
                    horizontalLineTo(x = 3.75f)
                    verticalLineTo(y = 9.25f)
                    moveTo(x = 3.75f, y = 9.25f)
                    horizontalLineTo(x = 20.25f)
                    moveTo(x = 20.25f, y = 9.25f)
                    verticalLineTo(y = 11.25f)
                    moveTo(x = 17.75f, y = 14.75f)
                    verticalLineTo(y = 18.0f)
                    moveTo(x = 17.75f, y = 18.0f)
                    verticalLineTo(y = 21.25f)
                    moveTo(x = 17.75f, y = 18.0f)
                    horizontalLineTo(x = 14.5f)
                    moveTo(x = 17.75f, y = 18.0f)
                    horizontalLineTo(x = 21.0f)
                }
            }.build()
            .also { _calenderAdd = it }
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
                imageVector = CalenderAdd,
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
private var _calenderAdd: ImageVector? = null
