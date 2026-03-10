package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: Email (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val Email: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_email)

@Preview
@Composable
private fun EmailPreview() {
    GdsTheme {
        Icon(
            imageVector = Email,
            contentDescription = "Email icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
