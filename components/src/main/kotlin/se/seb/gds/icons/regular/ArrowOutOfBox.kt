package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: ArrowOutOfBox (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val ArrowOutOfBox: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_arrow_out_of_box)

@Preview
@Composable
private fun ArrowOutOfBoxPreview() {
    GdsTheme {
        Icon(
            imageVector = ArrowOutOfBox,
            contentDescription = "ArrowOutOfBox icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
