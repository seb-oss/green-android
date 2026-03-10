package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: HomeRoof (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val HomeRoof: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_home_roof)

@Preview
@Composable
private fun HomeRoofPreview() {
    GdsTheme {
        Icon(
            imageVector = HomeRoof,
            contentDescription = "HomeRoof icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
