package se.seb.gds.atoms.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.GdsButtonStyle
import se.seb.gds.theme.GdsTheme

/**
 * Represents a button within a card component.
 *
 * @property title The text displayed on the button.
 * @property onClick The lambda to be executed when the button is clicked.
 * @property leadingIcon An optional icon to be displayed on the button.
 * @property trailingIcon An optional icon to be displayed at the end of the button.
 */
@Immutable
data class CardButton(
    val title: String,
    val onClick: () -> Unit,
    val leadingIcon: ImageVector? = null,
    val trailingIcon: ImageVector? = null,
)

/**
 * Defines the style of a card component.
 *
 * @property colors The [CardColors] used for the card.
 * @property shape The shape of the card.
 * @property border An optional border for the card.
 * @property buttonStyle The style of the button within the card.
 */
data class CardStyle(
    val colors: CardColors,
    val shape: Shape,
    val border: BorderStroke? = null,
    val buttonStyle: GdsButtonStyle,
)

object GdsInformationCardDefaults {

    @Composable
    fun information() =
        CardStyle(
            colors = CardColors(
                containerColor = GdsTheme.colors.L2.Neutral02,
                contentColor = GdsTheme.colors.Content.Neutral01,
            ),
            border = GdsCardDefaults.border,
            shape = GdsCardDefaults.shape,
            buttonStyle = GdsButtonDefaults.TwentyThree.secondaryOnWhiteCard(),
        )

    @Composable
    fun informationOnWhite() =
        CardStyle(
            colors = CardColors(
                containerColor = GdsTheme.colors.L2.Neutral01,
                contentColor = GdsTheme.colors.Content.Neutral01,
            ),
            border = GdsCardDefaults.border,
            shape = GdsCardDefaults.shape,
            buttonStyle = GdsButtonDefaults.TwentyThree.secondaryOnGreyCard(),
        )

    @Composable
    fun loud() =
        CardStyle(
            colors = CardColors(
                containerColor = GdsTheme.colors.L2.NeutralLoud,
                contentColor = GdsTheme.colors.Content.Inversed,
            ),
            shape = GdsCardDefaults.shape,
            buttonStyle = GdsButtonStyle(
                colors = ButtonDefaults.buttonColors(
                    containerColor = GdsTheme.colors.L3.NeutralTone,
                    contentColor = GdsTheme.colors.Content.Inversed,
                    disabledContainerColor = GdsTheme.colors.L3.Disabled03,
                    disabledContentColor = GdsTheme.colors.Content.Disabled01,
                ),
            ),
        )
}
