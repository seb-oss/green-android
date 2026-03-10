package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: BrandGreen (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val BrandGreen: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_brand_green)

@Preview
@Composable
private fun BrandGreenPreview() {
    GdsTheme {
        Icon(
            imageVector = BrandGreen,
            contentDescription = "BrandGreen icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
