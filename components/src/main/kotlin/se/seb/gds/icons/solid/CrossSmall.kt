package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: CrossSmall (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val CrossSmall: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_cross_small)

@Preview
@Composable
private fun CrossSmallPreview() {
    GdsTheme {
        Icon(
            imageVector = CrossSmall,
            contentDescription = "CrossSmall icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
