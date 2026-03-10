package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: Signature (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val Signature: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_signature)

@Preview
@Composable
private fun SignaturePreview() {
    GdsTheme {
        Icon(
            imageVector = Signature,
            contentDescription = "Signature icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
