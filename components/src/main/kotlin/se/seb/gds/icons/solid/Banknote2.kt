package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: Banknote2 (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val Banknote2: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_banknote_2)

@Preview
@Composable
private fun Banknote2Preview() {
    GdsTheme {
        Icon(
            imageVector = Banknote2,
            contentDescription = "Banknote2 icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
