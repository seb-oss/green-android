package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: TriangleExclamation (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val TriangleExclamation: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_triangle_exclamation)

@Preview
@Composable
private fun TriangleExclamationPreview() {
    GdsTheme {
        Icon(
            imageVector = TriangleExclamation,
            contentDescription = "TriangleExclamation icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
