package atoms.cards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.atoms.cards.CardButton
import se.seb.gds.atoms.cards.GdsCardDefaults
import se.seb.gds.atoms.cards.GdsInformationCard
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.theme.GdsTheme

/**
 * Screenshot tests for the default information style of the [GdsInformationCard] component.
 */
@PreviewTest
@GdsUiPreview
@Composable
private fun GdsInfoCardScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            // Default Information Card with action button and dismiss icon
            GdsInformationCard(
                heading = "Information Card",
                body = "This is an information card used for testing screenshot functionality.",
                onDismiss = {},
                button = CardButton(
                    title = "Action",
                    onClick = {},
                ),
            )

            // Information Card without action button and dismiss icon
            GdsInformationCard(
                heading = "Information Card",
                body = "This is an information card used for testing screenshot functionality.",
                onDismiss = null,
                button = null,
            )
        }
    }
}

/**
 * Screenshot tests for the HD style of the [GdsInformationCard] component.
 */
@PreviewTest
@GdsUiPreview
@Composable
private fun GdsInfoCardHdScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            // HD Information Card with action button and dismiss icon
            GdsInformationCard(
                style = GdsCardDefaults.informationHd(),
                heading = "Information Card HD",
                body = "This is an information card used for testing screenshot functionality.",
                onDismiss = {},
                button = CardButton(
                    title = "Action",
                    onClick = {},
                ),
            )

            // HD Information Card without action button and dismiss icon
            GdsInformationCard(
                style = GdsCardDefaults.informationHd(),
                heading = "Information Card HD",
                body = "This is an information card used for testing screenshot functionality.",
                onDismiss = null,
                button = null,
            )
        }
    }
}
