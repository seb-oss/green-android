package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: Group (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val Group: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_group)

@Preview
@Composable
private fun GroupPreview() {
    GdsTheme {
        Icon(
            imageVector = Group,
            contentDescription = "Group icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
