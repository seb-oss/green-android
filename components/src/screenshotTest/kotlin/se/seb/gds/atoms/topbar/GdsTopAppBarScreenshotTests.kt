@file:OptIn(ExperimentalMaterial3Api::class)

package se.seb.gds.atoms.topbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import se.seb.gds.common.GdsUiTestsPreview
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

@Composable
private fun LeftIcon() {
    GdsTopBarAction(
        icon = GdsIcons.Regular.ArrowLeft,
        onClick = {},
    )
}

@Composable
private fun RightIcon() {
    GdsTopBarAction(
        icon = GdsIcons.Regular.CircleInfo,
        onClick = {},
    )
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsLargeAppBarCollapsedScreenshot() {
    val scrollBehavior = TopAppBarDefaults.mediumLargeAppBarScrollBehavior()
    // Force the top app bar to be in a collapsed state for the preview
    scrollBehavior.state.heightOffset = scrollBehavior.state.heightOffsetLimit

    GdsTheme {
        GdsLargeTopAppBar(
            title = "Large Top Bar",
            subtitle = "Subtitle",
            scrollBehavior = scrollBehavior,
            navigationIcon = { LeftIcon() },
            rightActions = { RightIcon() },
        )
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsLargeAppBarExpandedScreenshot() {
    // The default state is expanded, so no changes to scrollBehavior.state are needed.
    val scrollBehavior = TopAppBarDefaults.mediumLargeAppBarScrollBehavior()
    GdsTheme {
        GdsLargeTopAppBar(
            title = "Large Top Bar",
            subtitle = "Subtitle",
            scrollBehavior = scrollBehavior,
            navigationIcon = { LeftIcon() },
            rightActions = { RightIcon() },
        )
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsMediumAppBarCollapsedScreenshot() {
    val scrollBehavior = TopAppBarDefaults.mediumLargeAppBarScrollBehavior()
    // Force the top app bar to be in a collapsed state for the preview
    scrollBehavior.state.heightOffset = scrollBehavior.state.heightOffsetLimit

    GdsTheme {
        GdsMediumTopAppBar(
            title = "Medium Top Bar",
            subtitle = "Subtitle",
            scrollBehavior = scrollBehavior,
            navigationIcon = { LeftIcon() },
            rightActions = { RightIcon() },
        )
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsMediumAppBarExpandedScreenshot() {
    // The default state is expanded, so no changes to scrollBehavior.state are needed.
    val scrollBehavior = TopAppBarDefaults.mediumLargeAppBarScrollBehavior()
    GdsTheme {
        GdsMediumTopAppBar(
            title = "Medium Top Bar",
            subtitle = "Subtitle",
            scrollBehavior = scrollBehavior,
            navigationIcon = { LeftIcon() },
            rightActions = { RightIcon() },
        )
    }
}

@PreviewTest
@GdsUiTestsPreview
@Composable
private fun GdsSmallAppBarScreenshot() {
    val scrollBehavior = TopAppBarDefaults.smallAppBarScrollBehavior()
    GdsTheme {
        GdsSmallTopAppBar(
            title = "Small Top Bar",
            subtitle = "Subtitle",
            scrollBehavior = scrollBehavior,
            navigationIcon = { LeftIcon() },
            rightActions = { RightIcon() },
        )
    }
}
