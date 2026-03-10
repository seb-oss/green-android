package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: ShieldCrossed (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val ShieldCrossed: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_shield_crossed)

@Preview
@Composable
private fun ShieldCrossedPreview() {
    GdsTheme {
        Icon(
            imageVector = ShieldCrossed,
            contentDescription = "ShieldCrossed icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
