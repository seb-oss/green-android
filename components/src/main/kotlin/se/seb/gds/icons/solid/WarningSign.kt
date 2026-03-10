package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: WarningSign (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val WarningSign: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_warning_sign)

@Preview
@Composable
private fun WarningSignPreview() {
    GdsTheme {
        Icon(
            imageVector = WarningSign,
            contentDescription = "WarningSign icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
