package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: ZoomOut (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val ZoomOut: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_zoom_out)

@Preview
@Composable
private fun ZoomOutPreview() {
    GdsTheme {
        Icon(
            imageVector = ZoomOut,
            contentDescription = "ZoomOut icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
