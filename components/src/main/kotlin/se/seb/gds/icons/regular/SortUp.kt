package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: SortUp (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val SortUp: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_sort_up)

@Preview
@Composable
private fun SortUpPreview() {
    GdsTheme {
        Icon(
            imageVector = SortUp,
            contentDescription = "SortUp icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
