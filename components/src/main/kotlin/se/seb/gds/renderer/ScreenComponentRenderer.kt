package se.seb.gds.renderer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntSize
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import se.seb.components.Component
import se.seb.components.DefaultTopbarComponent
import se.seb.components.ScreenComponent
import se.seb.components.TopbarActionComponent
import se.seb.components.common.Action
import se.seb.gds.atoms.topbar.GdsTopBarAction
import se.seb.gds.atoms.topbar.GdsTopBarComponent
import se.seb.gds.renderer.mapper.toColor
import se.seb.gds.renderer.mapper.toIconInt
import se.seb.gds.theme.GdsTheme
import kotlin.collections.forEach

fun ScreenComponentRenderer(): ComponentRenderer<ScreenComponent> {
    return object : ComponentRenderer<ScreenComponent> {
        @Composable
        override fun Render(
            component: ScreenComponent,
            actionHandler: (Action) -> Unit,
        ) {
            component.Render(actionHandler)
        }
    }
}

@Composable
fun ScreenComponent.Render(
    actionHandler: (Action) -> Unit,
) {
    ScreenRender(
        actionHandler = { actionHandler },
        stateFlow = MutableStateFlow(this),
    )
}

@Composable
fun ScreenRender(
    actionHandler: (Action) -> Unit,
    stateFlow: StateFlow<ScreenComponent>,
) {
    val uiState by stateFlow.collectAsStateWithLifecycle()
    Scaffold(
        topBar = {
            RenderTop(uiState.topBar, { actionHandler.invoke(it) })
        },
        containerColor = uiState.modifier?.backgroundColor?.toColor()?: GdsTheme.colors.l101,
        content = { paddingValues ->
            RenderContent(
                modifier = Modifier.padding(paddingValues),
                uiState = uiState,
                actionHandler = actionHandler,
            )
        },
    )
}

@Composable
private fun RenderContent(
    modifier: Modifier = Modifier,
    uiState: ScreenComponent,
    actionHandler: (Action) -> Unit,
) {
    var bottomContentSize by remember {
        mutableStateOf(IntSize.Zero)
    }
    val bottomContentHeight = with(LocalDensity.current) { bottomContentSize.height.toDp() }
    if (uiState.content != null) {
        Box(modifier = modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .conditional(uiState.scrollable) {
                        Modifier.verticalScroll(rememberScrollState())
                    }
                    .conditional(uiState.bottomBar != null) {
                        padding(bottom = bottomContentHeight)
                    },
            ) {
                uiState.content.forEach { component ->
                    RenderComponent(component, actionHandler)
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Transparent)
                    .align(Alignment.BottomCenter)
                    .onGloballyPositioned {
                        bottomContentSize = it.size
                    },
            ) {
                uiState.bottomBar?.forEach { bottomBarComponent ->
                    RenderComponent(
                        component = bottomBarComponent,
                        actionHandler = { actionHandler.invoke(it) },
                    )
                }
            }
        }
    }
}

@Composable
fun RenderComponent(
    component: Component,
    actionHandler: (Action) -> Unit,
) {
    ComponentRendererRegistry.RenderComponent(component, actionHandler)
}

@Composable
private fun RenderTop(
    components: List<Component>? = emptyList(),
    onHandleAction: (Action) -> Unit,
) {
    components?.forEach { component ->
        when (component) {
            is DefaultTopbarComponent -> {
                RenderTopBar(component, onHandleAction)
            }

            else -> {}
        }
    }
}

@Composable
private fun RenderTopBar(
    component: DefaultTopbarComponent,
    onHandleAction: (Action) -> Unit,
) {
    GdsTopBarComponent(
        title = component.title,
        color = component.modifier?.backgroundColor?.toColor(),
        leftAction = {
            component.leftAction.let { leftAction ->
                RenderTopBarAction(leftAction, onHandleAction)
            }
        },
        rightActions = component.rightActions?.let { actions ->
            {
                actions.forEach { action ->
                    RenderTopBarAction(action, onHandleAction)
                }
            }
        },
    )
}

@Composable
private fun RenderTopBarAction(
    topBarAction: TopbarActionComponent,
    onHandleAction: (Action) -> Unit,
) {
    val icon = topBarAction.icon.toIconInt()
    icon?.let {
        GdsTopBarAction(
            icon = it,
            onClick = { onHandleAction(topBarAction.action) },
        )
    }
}

@Composable
fun Modifier.conditional(
    condition: Boolean,
    modifier: @Composable Modifier.() -> Modifier,
): Modifier =
    if (condition) {
        modifier.invoke(this)
    } else {
        this
    }
