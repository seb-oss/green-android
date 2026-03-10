package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: BookmarkRemove (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val BookmarkRemove: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_bookmark_remove)

@Preview
@Composable
private fun BookmarkRemovePreview() {
    GdsTheme {
        Icon(
            imageVector = BookmarkRemove,
            contentDescription = "BookmarkRemove icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
