package se.seb.gds.atoms.loadingindicators

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
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
private fun GdsLoadingIndicatorContainedDefaultScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsLoadingIndicatorContained()
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsLoadingIndicatorContainedWithCustomColorScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsLoadingIndicatorContained(
                containerColor = GdsTheme.colors.L3.NeutralStrong,
                indicatorColor = GdsTheme.colors.L3.Neutral02,
            )
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsLoadingIndicatorContainedWithCustomSize60DpScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsLoadingIndicatorContained(size = 60.dp)
        }
    }
}
