package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: ArrowBoxLeft (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val ArrowBoxLeft: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_arrow_box_left)

@Preview
@Composable
private fun ArrowBoxLeftPreview() {
    GdsTheme {
        Icon(
            imageVector = ArrowBoxLeft,
            contentDescription = "ArrowBoxLeft icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
