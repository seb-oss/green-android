package se.seb.gds.renderer

import androidx.compose.runtime.Composable
import se.seb.components.Component
import se.seb.components.common.Action

object UnknownComponentRenderer : ComponentRenderer<Component> {
    @Composable
    override fun Render(
        component: Component,
        actionHandler: (Action) -> Unit,
    ) {
    }
}