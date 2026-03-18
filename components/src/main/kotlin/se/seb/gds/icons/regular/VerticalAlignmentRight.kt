package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: VerticalAlignmentRight (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val VerticalAlignmentRight: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_vertical_alignment_right)

@Preview
@Composable
private fun VerticalAlignmentRightPreview() {
    GdsTheme {
        Icon(
            imageVector = VerticalAlignmentRight,
            contentDescription = "VerticalAlignmentRight icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
