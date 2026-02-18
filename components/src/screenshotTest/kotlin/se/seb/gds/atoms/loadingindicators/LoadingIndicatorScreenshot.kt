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
 * Screenshot tests for the default [GdsLoadingIndicator] component.
 */
@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsLoadingIndicatorDefaultScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsLoadingIndicator()
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsLoadingIndicatorWithCustomColorScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsLoadingIndicator(
                color = GdsTheme.colors.L1.Brand01,
            )
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsLoadingIndicatorWithCustomSize60DpScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsLoadingIndicator(size = 60.dp)
        }
    }
}
