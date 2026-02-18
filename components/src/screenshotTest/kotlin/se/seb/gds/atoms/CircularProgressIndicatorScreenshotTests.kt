package se.seb.gds.atoms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.common.GdsUiTestsPreview
import se.seb.gds.theme.GdsTheme

/**
 * Screenshot tests for the default [GdsCircularProgressIndicator] component.
 */
@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsCircularProgressIndicatorDefaultScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsCircularProgressIndicator()
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsCircularProgressIndicatorWithCustomColorScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsCircularProgressIndicator(
                color = GdsTheme.colors.Border.Subtle01,
                trackColor = GdsTheme.colors.Border.Strong,
            )
        }
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsCircularProgressIndicatorWithCustomSize60DpScreenshot() {
    GdsTheme {
        Column(
            modifier = Modifier.padding(GdsTheme.dimensions.spacing.SpaceM),
        ) {
            GdsCircularProgressIndicator(size = 60.dp)
        }
    }
}
