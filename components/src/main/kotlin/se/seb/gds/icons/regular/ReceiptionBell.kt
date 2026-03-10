package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: ReceiptionBell (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val ReceiptionBell: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_receiption_bell)

@Preview
@Composable
private fun ReceiptionBellPreview() {
    GdsTheme {
        Icon(
            imageVector = ReceiptionBell,
            contentDescription = "ReceiptionBell icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
