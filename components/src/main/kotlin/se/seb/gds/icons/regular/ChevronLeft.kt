package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: ChevronLeft (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val ChevronLeft: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_chevron_left)

@Preview
@Composable
private fun ChevronLeftPreview() {
    GdsTheme {
        Icon(
            imageVector = ChevronLeft,
            contentDescription = "ChevronLeft icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
