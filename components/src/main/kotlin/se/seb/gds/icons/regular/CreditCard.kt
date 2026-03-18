package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: CreditCard (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val CreditCard: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_credit_card)

@Preview
@Composable
private fun CreditCardPreview() {
    GdsTheme {
        Icon(
            imageVector = CreditCard,
            contentDescription = "CreditCard icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
