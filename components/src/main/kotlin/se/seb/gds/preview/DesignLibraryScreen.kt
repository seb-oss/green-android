package se.seb.gds.preview

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

private const val CONTENT_ANIMATION_DURATION = 500

// When design review is done of the bottom sheet we can enable this entry point again
private const val SHOW_BOTTOM_SHEET_ENTRY = false

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

    if (currentScreen == LibraryScreen.TOP_BAR) {
        TopBarScreen(onBack = { currentScreen = LibraryScreen.LIBRARY })
    } else {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = GdsTheme.colors.L1Neutral02,
                        titleContentColor = GdsTheme.colors.ContentNeutral01,
                    ),
                    title = {
                        Text(text = currentScreen.name, style = GdsTheme.typography.DetailBookM)
                    },
                    navigationIcon = {
                        if (currentScreen != LibraryScreen.LIBRARY) {
                            IconButton(onClick = { currentScreen = LibraryScreen.LIBRARY }) {
                                Icon(
                                    GdsIcons.Regular.ArrowLeft,
                                    contentDescription = "Back",
                                    tint = GdsTheme.colors.ContentNeutral01,
                                )
                            }
                        }
                    },
                )
            },
            containerColor = GdsTheme.colors.L1Neutral02,
            contentColor = GdsTheme.colors.ContentNeutral01,
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
                    LibraryScreen.LIBRARY ->
                        DesignLibrary(scrollState = scrollState) {
                            currentScreen = it
                        }

                    LibraryScreen.COLORS -> ColorsScreen(allColors, true)

                    LibraryScreen.LEGACY_COLORS -> ColorsScreen(legacyColors, false)

                    LibraryScreen.FONTS -> FontsScreen(scrollState = scrollState)

                    LibraryScreen.SWITCHES -> SwitchesScreen(scrollState = scrollState)

                    LibraryScreen.BUTTONS -> ButtonsScreen(scrollState = scrollState)

                    LibraryScreen.INPUT_DEFAULT -> InputScreen(scrollState = scrollState)

                    LibraryScreen.INPUT_CONTAINED -> InputContainedScreen(scrollState = scrollState)

                    LibraryScreen.ICONS -> IconsScreen()

                    LibraryScreen.LIST_ITEM -> ListItemScreen()

                    LibraryScreen.PROGRESS_INDICATOR -> ProgressIndicatorScreen()

                    LibraryScreen.LOADING_INDICATOR -> LoadingIndicatorScreen()

                    LibraryScreen.DIALOGS -> DialogsScreen()

                    LibraryScreen.BOTTOM_SHEET -> BottomSheetScreen()

                    LibraryScreen.INFORMATION_CARD -> InformationCardScreen()

                    else -> {}
                }
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
            .padding(GdsTheme.dimensions.spacing.SpaceM),
        verticalArrangement = spacedBy(GdsTheme.dimensions.spacing.SpaceM),
    ) {
        GallerySection("Tokens") {
            ListItem("Colors") { onNavigateToSection(LibraryScreen.COLORS) }
            HorizontalDivider()
            ListItem("2016 Colors") { onNavigateToSection(LibraryScreen.LEGACY_COLORS) }
            HorizontalDivider()
            ListItem("Fonts") { onNavigateToSection(LibraryScreen.FONTS) }
            HorizontalDivider()
            ListItem("Icons") { onNavigateToSection(LibraryScreen.ICONS) }
        }

        GallerySection("Components") {
            ListItem("Switches") { onNavigateToSection(LibraryScreen.SWITCHES) }
            HorizontalDivider()
            ListItem("Buttons") { onNavigateToSection(LibraryScreen.BUTTONS) }
            HorizontalDivider()
            ListItem("Input Default") { onNavigateToSection(LibraryScreen.INPUT_DEFAULT) }
            HorizontalDivider()
            ListItem("Input Contained") { onNavigateToSection(LibraryScreen.INPUT_CONTAINED) }
            HorizontalDivider()
            ListItem("Top Bar") { onNavigateToSection(LibraryScreen.TOP_BAR) }
            HorizontalDivider()
            ListItem("List items") { onNavigateToSection(LibraryScreen.LIST_ITEM) }
            HorizontalDivider()
            ListItem("Progress Indicator") { onNavigateToSection(LibraryScreen.PROGRESS_INDICATOR) }
            HorizontalDivider()
            ListItem("Loading Indicator") { onNavigateToSection(LibraryScreen.LOADING_INDICATOR) }
            HorizontalDivider()
            ListItem("Dialogs") { onNavigateToSection(LibraryScreen.DIALOGS) }
            if (SHOW_BOTTOM_SHEET_ENTRY) {
                HorizontalDivider()
                ListItem("Bottom sheets") { onNavigateToSection(LibraryScreen.BOTTOM_SHEET) }
            }
            HorizontalDivider()
            ListItem("Information Card") { onNavigateToSection(LibraryScreen.INFORMATION_CARD) }
        }
    }
}
