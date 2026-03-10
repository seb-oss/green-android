package se.seb.gds.icons.regular

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Icon
import se.seb.gds.components.R
import se.seb.gds.theme.GdsTheme

/**
 * GDS icon: ArrowRightUpCircle (regular)
 *
 * This icon loads from the vector drawable resource.
 */
internal val ArrowRightUpCircle: ImageVector
    @Composable
    get() = ImageVector.vectorResource(R.drawable.gds_regular_arrow_right_up_circle)

@Preview
@Composable
private fun ArrowRightUpCirclePreview() {
    GdsTheme {
        Icon(
            imageVector = ArrowRightUpCircle,
            contentDescription = "ArrowRightUpCircle icon",
            tint = GdsTheme.colors.Content.Neutral01
        )
    }
}
