package se.seb.gds.atoms.topbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import se.seb.gds.theme.GdsTheme

@OptIn(ExperimentalMaterial3Api::class)
data class TopAppBarStyle(
    val colors: TopAppBarColors,
    val titleStyle: TextStyle,
    val collapsedTitleStyle: TextStyle,
    val subtitleStyle: TextStyle,
    val collapsedSubtitleStyle: TextStyle,
) {
    fun getTitleStyle(scrollBehavior: TopAppBarScrollBehavior): TextStyle {
        return if (scrollBehavior.state.collapsedFraction < 0.5f) {
            titleStyle
        } else {
            collapsedTitleStyle
        }
    }

    fun getSubtitleStyle(scrollBehavior: TopAppBarScrollBehavior): TextStyle {
        return if (scrollBehavior.state.collapsedFraction < 0.5f) {
            subtitleStyle
        } else {
            collapsedSubtitleStyle
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
object TopAppBarDefaults {

    @Composable
    fun small() =
        TopAppBarStyle(
            colors = defaultTopAppBarColors(),
            titleStyle = GdsTheme.typography.HeadingS,
            collapsedTitleStyle = GdsTheme.typography.HeadingS,
            subtitleStyle = GdsTheme.typography.DetailBookXs,
            collapsedSubtitleStyle = GdsTheme.typography.DetailBookXs,
        )

    @Composable
    fun medium() =
        TopAppBarStyle(
            colors = defaultTopAppBarColors(),
            titleStyle = GdsTheme.typography.HeadingL,
            collapsedTitleStyle = GdsTheme.typography.HeadingS,
            subtitleStyle = GdsTheme.typography.Heading2xs,
            collapsedSubtitleStyle = GdsTheme.typography.DetailBookXs,
        )

    @Composable
    fun large() =
        TopAppBarStyle(
            colors = defaultTopAppBarColors(),
            titleStyle = GdsTheme.typography.HeadingXl,
            collapsedTitleStyle = GdsTheme.typography.HeadingS,
            subtitleStyle = GdsTheme.typography.HeadingXs,
            collapsedSubtitleStyle = GdsTheme.typography.DetailBookXs,
        )

    @Composable
    fun defaultTopAppBarColors() =
        TopAppBarDefaults.topAppBarColors(
            containerColor = GdsTheme.colors.L1.Elevated01.copy(alpha = 0.1f),
            titleContentColor = GdsTheme.colors.Content.Neutral01,
            scrolledContainerColor = GdsTheme.colors.L1.Elevated01,
            subtitleContentColor = GdsTheme.colors.Content.Neutral01,
        )

    @Composable
    fun mediumLargeAppBarScrollBehavior() = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())

    @Composable
    fun smallAppBarScrollBehavior() = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
}
