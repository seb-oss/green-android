package se.seb.gds.renderer

import androidx.compose.runtime.Composable
import se.seb.components.Component
import se.seb.components.common.Action


interface ComponentRenderer<T : Component> {
    @Composable
    fun Render(component: T, actionHandler: (Action) -> Unit)
}