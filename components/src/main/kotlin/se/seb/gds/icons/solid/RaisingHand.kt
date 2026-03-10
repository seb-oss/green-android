package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: RaisingHand (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val RaisingHand: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_raising_hand)

@Preview
@Composable
private fun RaisingHandPreview() {
    GdsTheme {
        Icon(
            imageVector = RaisingHand,
            contentDescription = "RaisingHand icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
