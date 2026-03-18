package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: CirclePlus (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val CirclePlus: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_circle_plus)

@Preview
@Composable
private fun CirclePlusPreview() {
    GdsTheme {
        Icon(
            imageVector = CirclePlus,
            contentDescription = "CirclePlus icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
