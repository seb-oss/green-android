package se.seb.gds.atoms.cards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.theme.GdsTheme

/**
 * Screenshot tests for the default information style of the [GdsCallout] component.
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
            GdsCallout(
                heading = "Information Subtle",
                style = GdsCalloutDefaults.informationSubtle(),
                body = "This is an information card used for testing screenshot functionality.",
            )
            GdsCallout(
                heading = "Warning",
                style = GdsCalloutDefaults.warning(),
                body = "This is an information card used for testing screenshot functionality.",
            )
            GdsCallout(
                heading = "Notice",
                style = GdsCalloutDefaults.notice(),
                body = "This is an information card used for testing screenshot functionality.",
                onDismiss = null,
                button = null,
            )
            GdsCallout(
                heading = "Critical",
                style = GdsCalloutDefaults.critical(),
                body = "This is an information card used for testing screenshot functionality.",
                onDismiss = null,
                button = null,
            )
        }
    }
}
