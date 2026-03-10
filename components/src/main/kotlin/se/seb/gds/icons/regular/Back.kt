package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: Back (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val Back: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_back)

@Preview
@Composable
private fun BackPreview() {
    GdsTheme {
        Icon(
            imageVector = Back,
            contentDescription = "Back icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
