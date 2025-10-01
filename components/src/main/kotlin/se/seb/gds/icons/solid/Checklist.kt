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

val Checklist: ImageVector
    get() {
        val current = _checklist
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.Checklist",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 9.19644f, y = 4.64738f)
                curveTo(x1 = 9.52928f, y1 = 4.89393f, x2 = 9.59923f, y2 = 5.36362f, x3 = 9.35268f, y3 = 5.69647f)
                lineTo(x = 6.01935f, y = 10.1965f)
                curveTo(x1 = 5.7804f, y1 = 10.5191f, x2 = 5.32981f, y2 = 10.5963f, x3 = 4.99708f, y3 = 10.3717f)
                lineTo(x = 3.33041f, y = 9.24668f)
                curveTo(x1 = 2.98709f, y1 = 9.01494f, x2 = 2.89664f, y2 = 8.54876f, x3 = 3.12838f, y3 = 8.20544f)
                curveTo(x1 = 3.36012f, y1 = 7.86212f, x2 = 3.8263f, y2 = 7.77167f, x3 = 4.16962f, y3 = 8.00341f)
                lineTo(x = 5.2413f, y = 8.72679f)
                lineTo(x = 8.14735f, y = 4.80363f)
                curveTo(x1 = 8.3939f, y1 = 4.47078f, x2 = 8.86359f, y2 = 4.40083f, x3 = 9.19644f, y3 = 4.64738f)
                close()
                moveTo(x = 11.0f, y = 7.75005f)
                curveTo(x1 = 11.0f, y1 = 7.33583f, x2 = 11.3358f, y2 = 7.00005f, x3 = 11.75f, y3 = 7.00005f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 7.00005f, x2 = 21.0f, y2 = 7.33583f, x3 = 21.0f, y3 = 7.75005f)
                curveTo(x1 = 21.0f, y1 = 8.16426f, x2 = 20.6642f, y2 = 8.50005f, x3 = 20.25f, y3 = 8.50005f)
                horizontalLineTo(x = 11.75f)
                curveTo(x1 = 11.3358f, y1 = 8.50005f, x2 = 11.0f, y2 = 8.16426f, x3 = 11.0f, y3 = 7.75005f)
                close()
                moveTo(x = 9.19644f, y = 13.6474f)
                curveTo(x1 = 9.52928f, y1 = 13.8939f, x2 = 9.59923f, y2 = 14.3636f, x3 = 9.35268f, y3 = 14.6965f)
                lineTo(x = 6.01935f, y = 19.1965f)
                curveTo(x1 = 5.7804f, y1 = 19.5191f, x2 = 5.32981f, y2 = 19.5963f, x3 = 4.99708f, y3 = 19.3717f)
                lineTo(x = 3.33041f, y = 18.2467f)
                curveTo(x1 = 2.98709f, y1 = 18.0149f, x2 = 2.89664f, y2 = 17.5488f, x3 = 3.12838f, y3 = 17.2054f)
                curveTo(x1 = 3.36012f, y1 = 16.8621f, x2 = 3.8263f, y2 = 16.7717f, x3 = 4.16962f, y3 = 17.0034f)
                lineTo(x = 5.2413f, y = 17.7268f)
                lineTo(x = 8.14735f, y = 13.8036f)
                curveTo(x1 = 8.3939f, y1 = 13.4708f, x2 = 8.86359f, y2 = 13.4008f, x3 = 9.19644f, y3 = 13.6474f)
                close()
                moveTo(x = 11.0f, y = 16.25f)
                curveTo(x1 = 11.0f, y1 = 15.8358f, x2 = 11.3358f, y2 = 15.5f, x3 = 11.75f, y3 = 15.5f)
                horizontalLineTo(x = 20.25f)
                curveTo(x1 = 20.6642f, y1 = 15.5f, x2 = 21.0f, y2 = 15.8358f, x3 = 21.0f, y3 = 16.25f)
                curveTo(x1 = 21.0f, y1 = 16.6643f, x2 = 20.6642f, y2 = 17.0f, x3 = 20.25f, y3 = 17.0f)
                horizontalLineTo(x = 11.75f)
                curveTo(x1 = 11.3358f, y1 = 17.0f, x2 = 11.0f, y2 = 16.6643f, x3 = 11.0f, y3 = 16.25f)
                close()
            }
        }.build().also { _checklist = it }
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
                imageVector = Checklist,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _checklist: ImageVector? = null
