package se.seb.gds.atoms.cards

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.components.R
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

/**
 * A component that displays an information card with a heading, body text, an optional dismiss
 * button, and an optional action button. The card can also be made clickable.
 *
 * This component is built on top of [GdsCard] and is styled using [CardStyle]. Default styles
 * are provided by [GdsInformationCardDefaults].
 *
 * @param heading The heading of the card.
 * @param body The body text of the card.
 * @param modifier The [Modifier] to be applied to the card.
 * @param style The [CardStyle] to be applied to the card, defining its colors, shape, and border.
 * Defaults to [GdsInformationCardDefaults.information].
 * @param onDismiss A lambda to be executed when the dismiss icon is clicked. If null, the dismiss
 * icon is not shown.
 * @param onClick A lambda to be executed when the card is clicked. If null, the card will not be
 * clickable.
 * @param button A [CardButton] object to define an action button at the bottom of the card. If
 * null, no button is shown.
 *
 * Example usage:
 * ```
 * GdsInformationCard(
 *    heading = "Important Update",
 *    body = "Please read the following information carefully.",
 *    onDismiss = { /* Handle dismiss */ },
 *    button = CardButton(
 *      title = "Learn More",
 *      trailingIcon = GdsIcons.Regular.ArrowRight,
 *      onClick = { /* Handle button click */ }
 *    ),
 *    onClick = { /* Handle card click */ }
 * )
 * ```
 */
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun GdsInformationCard(
    heading: String,
    body: String,
    modifier: Modifier = Modifier,
    style: CardStyle = GdsInformationCardDefaults.information(),
    onDismiss: (() -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    button: CardButton? = null,
) {
    GdsCard(
        modifier = modifier
            .clickable(
                enabled = onClick != null,
                onClick = { onClick?.invoke() },
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple(),
            ),
        containerColor = style.colors.containerColor,
        shape = style.shape,
        border = style.border,
    ) {
        Row {
            Column(
                modifier = Modifier
                    .weight(1.0f)
                    .padding(
                        start = GdsTheme.dimensions.spacing.SpaceM,
                        top = GdsTheme.dimensions.spacing.SpaceM,
                    ),
                verticalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.Space3Xs),
            ) {
                Text(
                    text = heading,
                    style = GdsTheme.typography.HeadingXs,
                    color = style.colors.contentColor,
                )
                Text(
                    text = body,
                    style = GdsTheme.typography.BodyRegularS,
                    color = style.colors.contentColor,
                )
            }

            if (onDismiss != null) {
                IconButton(
                    onClick = onDismiss,
                ) {
                    Icon(
                        modifier = Modifier.size(GdsTheme.dimensions.spacing.SpaceXl),
                        tint = style.colors.contentColor,
                        imageVector = GdsIcons.Regular.CrossSmall,
                        contentDescription = stringResource(R.string.common_action_close),
                    )
                }
            } else {
                Spacer(Modifier.size(GdsTheme.dimensions.spacing.SpaceM))
            }
        }
        if (button != null) {
            Box(
                modifier = Modifier.padding(
                    top = GdsTheme.dimensions.spacing.Space3Xs,
                    bottom = GdsTheme.dimensions.spacing.SpaceXs,
                    start = GdsTheme.dimensions.spacing.SpaceM,
                    end = GdsTheme.dimensions.spacing.SpaceM,
                ),
            ) {
                GdsButton(
                    title = button.title,
                    leadingIcon = button.leadingIcon,
                    trailingIcon = button.trailingIcon,
                    style = style.buttonStyle,
                    sizeProfile = GdsButtonDefaults.TwentyThree.small(),
                    onClick = button.onClick,
                )
            }
        } else {
            Spacer(Modifier.height(GdsTheme.dimensions.spacing.SpaceM))
        }
    }
}

@GdsUiPreview
@Composable
private fun GdsInformationCardPreview() {
    GdsTheme {
        GdsInformationCard(
            heading = "Spärra ditt kort snabbt i appen",
            body = "This information card displays important details and optional actions for the user.",
            button = CardButton(
                title = "Action Button",
                leadingIcon = GdsIcons.Regular.ArrowRight,
                onClick = {},
            ),
            onDismiss = {},
        )
    }
}

@GdsUiPreview
@Composable
private fun GdsInformationCardHdPreview() {
    GdsTheme {
        GdsInformationCard(
            style = GdsInformationCardDefaults.informationHd(),
            heading = "Spärra ditt kort snabbt i appen",
            body = "This information card displays important details and optional actions for the user.",
            button = CardButton(
                title = "Action Button",
                leadingIcon = GdsIcons.Regular.ArrowRight,
                onClick = {},
            ),
            onDismiss = {},
        )
    }
}

@GdsUiPreview
@Composable
private fun GdsInformationCardWhitePreview() {
    GdsTheme {
        GdsInformationCard(
            style = GdsInformationCardDefaults.informationOnWhite(),
            heading = "Information Card Heading",
            body = "This information card displays important details and optional actions for the user.",
            button = CardButton(
                title = "Action Button",
                leadingIcon = GdsIcons.Regular.ArrowRight,
                onClick = {},
            ),
            onDismiss = {},
        )
    }
}
