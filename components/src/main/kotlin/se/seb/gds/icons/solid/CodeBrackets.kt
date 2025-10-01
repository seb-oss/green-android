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

val CodeBrackets: ImageVector
    get() {
        val current = _codeBrackets
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.CodeBrackets",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 14.4473f, y = 3.02637f)
                curveTo(x1 = 14.847f, y1 = 3.13536f, x2 = 15.0826f, y2 = 3.54766f, x3 = 14.9736f, y3 = 3.94728f)
                lineTo(x = 10.4736f, y = 20.4473f)
                curveTo(x1 = 10.3646f, y1 = 20.8469f, x2 = 9.95228f, y2 = 21.0825f, x3 = 9.55266f, y3 = 20.9735f)
                curveTo(x1 = 9.15304f, y1 = 20.8645f, x2 = 8.91744f, y2 = 20.4522f, x3 = 9.02643f, y3 = 20.0526f)
                lineTo(x = 13.5264f, y = 3.55261f)
                curveTo(x1 = 13.6354f, y1 = 3.15299f, x2 = 14.0477f, y2 = 2.91738f, x3 = 14.4473f, y3 = 3.02637f)
                close()
                moveTo(x = 6.26402f, y = 7.20379f)
                curveTo(x1 = 6.56565f, y1 = 7.48768f, x2 = 6.58004f, y2 = 7.96234f, x3 = 6.29615f, y3 = 8.26397f)
                lineTo(x = 2.77994f, y = 12.0f)
                lineTo(x = 6.29615f, y = 15.7359f)
                curveTo(x1 = 6.58004f, y1 = 16.0375f, x2 = 6.56565f, y2 = 16.5122f, x3 = 6.26402f, y3 = 16.7961f)
                curveTo(x1 = 5.9624f, y1 = 17.08f, x2 = 5.48774f, y2 = 17.0656f, x3 = 5.20385f, y3 = 16.764f)
                lineTo(x = 1.20385f, y = 12.514f)
                curveTo(x1 = 0.932051f, y1 = 12.2252f, x2 = 0.932049f, y2 = 11.7747f, x3 = 1.20385f, y3 = 11.4859f)
                lineTo(x = 5.20385f, y = 7.23592f)
                curveTo(x1 = 5.48774f, y1 = 6.93429f, x2 = 5.96239f, y2 = 6.91991f, x3 = 6.26402f, y3 = 7.20379f)
                close()
                moveTo(x = 17.736f, y = 7.20379f)
                curveTo(x1 = 18.0376f, y1 = 6.91991f, x2 = 18.5123f, y2 = 6.93429f, x3 = 18.7962f, y3 = 7.23592f)
                lineTo(x = 22.7962f, y = 11.4859f)
                curveTo(x1 = 23.068f, y1 = 11.7747f, x2 = 23.0679f, y2 = 12.2252f, x3 = 22.7961f, y3 = 12.514f)
                lineTo(x = 18.7961f, y = 16.764f)
                curveTo(x1 = 18.5123f, y1 = 17.0656f, x2 = 18.0376f, y2 = 17.08f, x3 = 17.736f, y3 = 16.7961f)
                curveTo(x1 = 17.4343f, y1 = 16.5122f, x2 = 17.42f, y2 = 16.0375f, x3 = 17.7039f, y3 = 15.7359f)
                lineTo(x = 21.2201f, y = 12.0f)
                lineTo(x = 17.7038f, y = 8.26397f)
                curveTo(x1 = 17.42f, y1 = 7.96234f, x2 = 17.4343f, y2 = 7.48768f, x3 = 17.736f, y3 = 7.20379f)
                close()
            }
        }.build().also { _codeBrackets = it }
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
                imageVector = CodeBrackets,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _codeBrackets: ImageVector? = null
