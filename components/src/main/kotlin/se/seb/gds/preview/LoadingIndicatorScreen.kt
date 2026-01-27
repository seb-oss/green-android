package se.seb.gds.preview

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Elevation
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorMaxDistance
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.indicatorShape
import androidx.compose.material3.pulltorefresh.PullToRefreshState
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import se.seb.gds.atoms.loadingindicators.GdsLoadingIndicator
import se.seb.gds.atoms.loadingindicators.GdsLoadingIndicatorContained
import se.seb.gds.atoms.loadingindicators.GdsLoadingIndicatorDefaults
import se.seb.gds.theme.GdsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun LoadingIndicatorScreen() {
    var isRefreshing by remember { mutableStateOf(false) }
    val state = rememberPullToRefreshState()
    val scope = rememberCoroutineScope()
    var selectedIndicator by remember {
        mutableStateOf(LoadingIndicatorType.CONTAINED_LOADING_INDICATOR)
    }

    PullToRefreshBox(
        modifier = Modifier,
        state = state,
        isRefreshing = isRefreshing,
        onRefresh = {
            scope.launch {
                isRefreshing = true
                delay(4000) // Simulate network request
                isRefreshing = false
            }
        },
        indicator = {
            GdsIndicatorBox(
                state = state,
                isRefreshing = isRefreshing,
                modifier = Modifier.align(Alignment.TopCenter),
                elevation = 0.dp,
            ) {
                when (selectedIndicator) {
                    LoadingIndicatorType.LOADING_INDICATOR ->
                        GdsLoadingIndicator()

                    LoadingIndicatorType.CONTAINED_LOADING_INDICATOR ->
                        GdsLoadingIndicatorContained()
                }
            }
        },
        content = {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp),
            ) {
                item {
                    GallerySection("Pull down to see pull to refresh mode") {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                        ) {
                            Text(
                                text = "Choose pull to refresh indicator",
                                modifier = Modifier.padding(8.dp),
                            )

                            LoadingIndicatorType.entries.forEach { type ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .selectable(
                                            selected = (type == selectedIndicator),
                                            onClick = { selectedIndicator = type },
                                        )
                                        .padding(horizontal = 8.dp, vertical = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    RadioButton(
                                        selected = (type == selectedIndicator),
                                        onClick = null,
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(text = type.displayName)
                                }
                            }
                        }
                    }
                }

                item {
                    LoadingIndicatorListItem("Loading indicator", isRefreshing) {
                        GdsLoadingIndicator()
                    }
                }

                item {
                    LoadingIndicatorListItem("Loading indicator contained", isRefreshing) {
                        GdsLoadingIndicatorContained()
                    }
                }
            }
        },
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun LoadingIndicatorListItem(
    title: String,
    isRefreshing: Boolean,
    content: @Composable () -> Unit,
) {
    Box {
        GallerySection(title) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp),
                contentAlignment = Alignment.Center,
            ) {
                Crossfade(
                    targetState = isRefreshing,
                    animationSpec = tween(durationMillis = 1500),
                ) { refreshing ->
                    if (refreshing) {
                        Box(
                            modifier = Modifier
                                .size(GdsLoadingIndicatorDefaults.size)
                                .background(GdsTheme.colors.L3Neutral01),
                        )
                    } else {
                        content()
                    }
                }
            }
        }
    }
}

@Composable
private fun GdsIndicatorBox(
    state: PullToRefreshState,
    isRefreshing: Boolean,
    modifier: Modifier = Modifier,
    maxDistance: Dp = IndicatorMaxDistance,
    shape: Shape = indicatorShape,
    containerColor: Color = Color.Unspecified,
    elevation: Dp = Elevation,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(
        modifier =
        modifier
            .size(GdsLoadingIndicatorDefaults.size)
            .drawWithContent {
                clipRect(
                    top = 0f,
                    left = -Float.MAX_VALUE,
                    right = Float.MAX_VALUE,
                    bottom = Float.MAX_VALUE,
                ) {
                    this@drawWithContent.drawContent()
                }
            }
            .layout { measurable, constraints ->
                val placeable = measurable.measure(constraints)
                layout(placeable.width, placeable.height) {
                    placeable.placeWithLayer(
                        0,
                        0,
                        layerBlock = {
                            val showElevation = state.distanceFraction > 0f || isRefreshing
                            translationY =
                                state.distanceFraction *
                                maxDistance.roundToPx() -
                                size.height
                            shadowElevation = if (showElevation) elevation.toPx() else 0f
                            this.shape = shape
                            clip = true
                        },
                    )
                }
            }
            .background(color = containerColor, shape = shape),
        contentAlignment = Alignment.Center,
        content = content,
    )
}

enum class LoadingIndicatorType(val displayName: String) {
    LOADING_INDICATOR("Loading indicator"),
    CONTAINED_LOADING_INDICATOR("Contained loading indicator"),
}
