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

val Star: ImageVector
    get() {
        val current = _star
        if (current != null) return current

        return ImageVector
            .Builder(
                name = "se.seb.gds.theme.GdsTheme.Star",
                defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp,
                viewportWidth = 24.0f,
                viewportHeight = 24.0f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    moveTo(x = 12.6766f, y = 1.42636f)
                    curveTo(
                        x1 = 12.552f,
                        y1 = 1.16583f,
                        x2 = 12.2888f,
                        y2 = 1.0f,
                        x3 = 12.0f,
                        y3 = 1.0f,
                    )
                    curveTo(
                        x1 = 11.7112f,
                        y1 = 1.0f,
                        x2 = 11.4481f,
                        y2 = 1.16583f,
                        x3 = 11.3234f,
                        y3 = 1.42636f,
                    )
                    lineTo(x = 8.54631f, y = 7.23199f)
                    lineTo(x = 2.15224f, y = 8.07277f)
                    curveTo(
                        x1 = 1.86544f,
                        y1 = 8.11049f,
                        x2 = 1.62589f,
                        y2 = 8.30978f,
                        x3 = 1.53663f,
                        y3 = 8.58493f,
                    )
                    curveTo(
                        x1 = 1.44736f,
                        y1 = 8.86009f,
                        x2 = 1.52429f,
                        y2 = 9.16205f,
                        x3 = 1.73434f,
                        y3 = 9.36095f,
                    )
                    lineTo(x = 6.41068f, y = 13.7892f)
                    lineTo(x = 5.23679f, y = 20.1131f)
                    curveTo(
                        x1 = 5.18405f,
                        y1 = 20.3972f,
                        x2 = 5.29924f,
                        y2 = 20.6864f,
                        x3 = 5.53291f,
                        y3 = 20.8564f,
                    )
                    curveTo(
                        x1 = 5.76657f,
                        y1 = 21.0265f,
                        x2 = 6.07715f,
                        y2 = 21.0471f,
                        x3 = 6.33127f,
                        y3 = 20.9095f,
                    )
                    lineTo(x = 12.0f, y = 17.8404f)
                    lineTo(x = 17.6688f, y = 20.9095f)
                    curveTo(
                        x1 = 17.9229f,
                        y1 = 21.0471f,
                        x2 = 18.2335f,
                        y2 = 21.0265f,
                        x3 = 18.4671f,
                        y3 = 20.8564f,
                    )
                    curveTo(
                        x1 = 18.7008f,
                        y1 = 20.6864f,
                        x2 = 18.816f,
                        y2 = 20.3972f,
                        x3 = 18.7633f,
                        y3 = 20.1131f,
                    )
                    lineTo(x = 17.5894f, y = 13.7892f)
                    lineTo(x = 22.2657f, y = 9.36095f)
                    curveTo(
                        x1 = 22.4758f,
                        y1 = 9.16205f,
                        x2 = 22.5527f,
                        y2 = 8.86009f,
                        x3 = 22.4634f,
                        y3 = 8.58493f,
                    )
                    curveTo(
                        x1 = 22.3742f,
                        y1 = 8.30978f,
                        x2 = 22.1346f,
                        y2 = 8.11049f,
                        x3 = 21.8478f,
                        y3 = 8.07277f,
                    )
                    lineTo(x = 15.4537f, y = 7.23199f)
                    lineTo(x = 12.6766f, y = 1.42636f)
                    close()
                }
            }.build()
            .also { _star = it }
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
                imageVector = Star,
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
private var _star: ImageVector? = null
