package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: PlusSmall (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val PlusSmall: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_plus_small)

@Preview
@Composable
private fun PlusSmallPreview() {
    GdsTheme {
        Icon(
            imageVector = PlusSmall,
            contentDescription = "PlusSmall icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
