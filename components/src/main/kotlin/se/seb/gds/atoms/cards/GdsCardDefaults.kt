package se.seb.gds.atoms.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

/**
 * Defines the colors used in a card component.
 *
 * @property containerColor The background color of the card.
 * @property contentColor The color of the content (text and icons) inside the card.
 */
@Immutable
data class CardColors(
    val containerColor: Color,
    val contentColor: Color,
)

object GdsCardDefaults {
    val border: BorderStroke
        @Composable get() = BorderStroke(width = 1.dp, color = GdsTheme.colors.Border.Information02)

    val shape: Shape
        @Composable get() = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusM)
}
