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
 * Screenshot tests for the Loud style of the [GdsCallout] component.
 */
@PreviewTest
@GdsUiPreview
@Composable
private fun GdsCalloutInformationScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(horizontal = GdsTheme.dimensions.spacing.SpaceM),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            // Information Call out with action button and dismiss icon
            GdsCallout(
                style = GdsCalloutDefaults.information(),
                heading = "Information Call out",
                body = "This is an information card used for testing screenshot functionality.",
                onDismiss = {},
                button = CardButton(
                    title = "Action",
                    onClick = {},
                ),
            )

            // Information Call out without action button and dismiss icon
            GdsCallout(
                style = GdsCalloutDefaults.information(),
                heading = "Information Call out",
                body = "This is an information card used for testing screenshot functionality.",
                onDismiss = null,
                button = null,
            )
        }
    }
}
