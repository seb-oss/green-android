package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: Unlocked (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val Unlocked: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_unlocked)

@Preview
@Composable
private fun UnlockedPreview() {
    GdsTheme {
        Icon(
            imageVector = Unlocked,
            contentDescription = "Unlocked icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
