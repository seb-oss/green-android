package se.seb.gds.atoms.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import se.seb.gds.theme.GdsTheme

/**
 * A foundational composable for building card-based UI elements within the GDS design system.
 *
 * This component wraps the Material 3 [Card] and applies default GDS styling. It is intended
 * to be a generic building block for more specific card components, such as [GdsInformationCard].
 *
 * @param modifier The [Modifier] to be applied to the card.
 * @param containerColor The background color of the card. Defaults to `GdsTheme.colors.L1Neutral01`.
 * @param shape The shape of the card's corners. Defaults to [GdsCardDefaults.shape].
 * @param border An optional border to draw around the card.
 * @param content The content to be placed inside the card.
 *
 * Example usage:
 * ```
 * GdsCard(
 *     containerColor = GdsTheme.colors.L1Neutral01,
 * ) {
 *     // Card content goes here
 * }
 * ```
 */
@Composable
fun GdsCard(
    modifier: Modifier = Modifier,
    containerColor: Color = GdsTheme.colors.L1.Neutral01,
    shape: Shape = GdsCardDefaults.shape,
    border: BorderStroke? = GdsCardDefaults.border,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier),
        colors = CardDefaults.cardColors(containerColor = containerColor),
        shape = shape,
        border = border,
        content = content,
    )
}
