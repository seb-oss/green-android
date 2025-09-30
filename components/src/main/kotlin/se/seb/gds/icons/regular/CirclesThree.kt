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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val CirclesThree: ImageVector
    get() {
        val current = _circlesThree
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.CirclesThree",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Square,
                    strokeLineWidth = 1.5f,
                ) {
                    moveTo(x = 14.6766f, y = 7.38126f)
                    curveTo(x1 = 13.686f, y1 = 5.23749f, x2 = 11.5167f, y2 = 3.75f, x3 = 9.0f, y3 = 3.75f)
                    curveTo(x1 = 5.54822f, y1 = 3.75f, x2 = 2.75f, y2 = 6.54822f, x3 = 2.75f, y3 = 10.0f)
                    curveTo(x1 = 2.75f, y1 = 13.3961f, x2 = 5.45873f, y2 = 16.1596f, x3 = 8.83359f, y3 = 16.2478f)
                    moveTo(x = 21.25f, y = 14.0f)
                    curveTo(x1 = 21.25f, y1 = 17.4518f, x2 = 18.4518f, y2 = 20.25f, x3 = 15.0f, y3 = 20.25f)
                    curveTo(x1 = 12.3406f, y1 = 20.25f, x2 = 10.0691f, y2 = 18.589f, x3 = 9.16641f, y3 = 16.2478f)
                    curveTo(x1 = 8.89745f, y1 = 15.5503f, x2 = 8.75f, y2 = 14.7924f, x3 = 8.75f, y3 = 14.0f)
                    curveTo(x1 = 8.75f, y1 = 10.6039f, x2 = 11.4587f, y2 = 7.84038f, x3 = 14.8336f, y3 = 7.75217f)
                    curveTo(x1 = 14.8889f, y1 = 7.75073f, x2 = 14.9444f, y2 = 7.75f, x3 = 15.0f, y3 = 7.75f)
                    curveTo(x1 = 18.4518f, y1 = 7.75f, x2 = 21.25f, y2 = 10.5482f, x3 = 21.25f, y3 = 14.0f)
                    close()
                }
            }.build()
            .also { _circlesThree = it }
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
                imageVector = CirclesThree,
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
private var _circlesThree: ImageVector? = null
