package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: PencilSign (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val PencilSign: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_pencil_sign)

@Preview
@Composable
private fun PencilSignPreview() {
    GdsTheme {
        Icon(
            imageVector = PencilSign,
            contentDescription = "PencilSign icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
