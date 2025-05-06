package se.seb.greencomponentsandroid.ui

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

private const val CONTENT_ANIMATION_DURATION = 500

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun DesignLibraryScreen(
    allColors: List<Pair<String, ColorMapping>> = emptyList(),
    legacyColors: List<Pair<String, ColorMapping>> = emptyList(),
) {
    val scrollState = rememberScrollState(0)
    var currentScreen: LibraryScreen by rememberSaveable { mutableStateOf(LibraryScreen.LIBRARY) }

    BackHandler(enabled = currentScreen != LibraryScreen.LIBRARY) {
        currentScreen = LibraryScreen.LIBRARY
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = GdsTheme.colors.level1BackgroundSecondary,
                    titleContentColor = GdsTheme.colors.level2ContentPrimary
                ),
                title = { Text(text = currentScreen.name, style = GdsTheme.typography.Headline) },
                navigationIcon = {
                    if (currentScreen != LibraryScreen.LIBRARY) {
                        IconButton(onClick = { currentScreen = LibraryScreen.LIBRARY }) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = GdsTheme.colors.level2ContentPrimary
                            )
                        }
                    }
                }
            )
        },
        containerColor = GdsTheme.colors.level1BackgroundSecondary,
        contentColor = GdsTheme.colors.level2ContentPrimary
    ) { paddingValues ->
        AnimatedContent(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            targetState = currentScreen,
            transitionSpec = {
                if ((targetState.ordinal) > (initialState.ordinal)) {
                    slideInHorizontally(
                        animationSpec = tween(CONTENT_ANIMATION_DURATION),
                        initialOffsetX = { fullWidth -> fullWidth },
                    ) togetherWith
                            slideOutHorizontally(
                                animationSpec = tween(CONTENT_ANIMATION_DURATION),
                                targetOffsetX = { fullWidth -> -fullWidth },
                            )
                } else {
                    slideInHorizontally(
                        animationSpec = tween(CONTENT_ANIMATION_DURATION),
                        initialOffsetX = { fullWidth -> -fullWidth },
                    ) togetherWith
                            slideOutHorizontally(
                                animationSpec = tween(CONTENT_ANIMATION_DURATION),
                                targetOffsetX = { fullWidth -> fullWidth },
                            )
                }
            },
        ) { targetState ->
            when (targetState) {
                LibraryScreen.LIBRARY -> DesignLibrary(scrollState = scrollState) {
                    currentScreen = it
                }

                LibraryScreen.COLORS -> {
                    Box(modifier = Modifier.fillMaxSize())
                }

                LibraryScreen.FONTS -> FontsScreen(scrollState = scrollState)
                LibraryScreen.SWITCHES -> SwitchesScreen(scrollState = scrollState)
                LibraryScreen.BUTTONS -> ButtonsScreen(scrollState = scrollState)
            }

        }
    }

}

@Composable
private fun DesignLibrary(
    scrollState: ScrollState,
    onNavigateToSection: (screen: LibraryScreen) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = spacedBy(16.dp),
    ) {
        GallerySection("Tokens") {
            ListItem("Colors") { onNavigateToSection(LibraryScreen.COLORS) }
            HorizontalDivider()
            ListItem("Fonts") { onNavigateToSection(LibraryScreen.FONTS) }
        }

        GallerySection("Components") {
            ListItem("Switches") { onNavigateToSection(LibraryScreen.SWITCHES) }
            HorizontalDivider()
            ListItem("Buttons") { onNavigateToSection(LibraryScreen.BUTTONS) }
        }
    }
}