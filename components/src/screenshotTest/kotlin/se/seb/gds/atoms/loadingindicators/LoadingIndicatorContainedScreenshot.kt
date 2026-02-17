package se.seb.gds.atoms.loadingindicators

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.common.GdsUiTestsPreview
import se.seb.gds.theme.GdsTheme

/**
 * Screenshot tests for the default [GdsLoadingIndicatorContained] component.
 */
@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsLoadingIndicatorContainedScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            // Default loading indicator contained
            GdsLoadingIndicatorContained()

            // Loading indicator contained with custom size
            GdsLoadingIndicatorContained(size = 60.dp)
        }
    }
}
