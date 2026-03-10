package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: SquareArrowTopRight (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val SquareArrowTopRight: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_square_arrow_top_right)

@Preview
@Composable
private fun SquareArrowTopRightPreview() {
    GdsTheme {
        Icon(
            imageVector = SquareArrowTopRight,
            contentDescription = "SquareArrowTopRight icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
