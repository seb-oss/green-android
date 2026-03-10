package se.seb.gds.icons.solid

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: FocusSquare (solid)
 *
 * This icon loads from the vector drawable resource.
 */
internal val FocusSquare: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_solid_focus_square)

@Preview
@Composable
private fun FocusSquarePreview() {
    GdsTheme {
        Icon(
            imageVector = FocusSquare,
            contentDescription = "FocusSquare icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
