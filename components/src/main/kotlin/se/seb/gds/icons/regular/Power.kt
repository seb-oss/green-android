package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: Power (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val Power: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_power)

@Preview
@Composable
private fun PowerPreview() {
    GdsTheme {
        Icon(
            imageVector = Power,
            contentDescription = "Power icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
