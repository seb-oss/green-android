package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: Bookmark (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val Bookmark: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_bookmark)

@Preview
@Composable
private fun BookmarkPreview() {
    GdsTheme {
        Icon(
            imageVector = Bookmark,
            contentDescription = "Bookmark icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
