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

internal val FolderUpload: ImageVector
    get() {
        val current = _folderUpload
        if (current != null) return current

        return ImageVector.Builder(
            name = "se.seb.gds.theme.GdsTheme.FolderUpload",
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
                moveTo(x = 12.0f, y = 19.25f)
                verticalLineTo(y = 13.0f)
                moveTo(x = 12.0f, y = 13.0f)
                lineTo(x = 14.5f, y = 15.5f)
                moveTo(x = 12.0f, y = 13.0f)
                lineTo(x = 9.5f, y = 15.5f)
                moveTo(x = 7.375f, y = 19.25f)
                horizontalLineTo(x = 2.75f)
                verticalLineTo(y = 3.75f)
                horizontalLineTo(x = 10.0f)
                lineTo(x = 12.0f, y = 6.75f)
                horizontalLineTo(x = 21.25f)
                verticalLineTo(y = 19.25f)
                horizontalLineTo(x = 16.625f)
            }
        }.build().also { _folderUpload = it }
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
                imageVector = FolderUpload,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _folderUpload: ImageVector? = null
