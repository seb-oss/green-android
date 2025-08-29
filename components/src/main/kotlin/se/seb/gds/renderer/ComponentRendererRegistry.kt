package se.seb.gds.renderer

import androidx.compose.runtime.Composable
import se.seb.components.ColumnComponent
import se.seb.components.Component
import se.seb.components.GDSButtonComponent
import se.seb.components.GDSTextComponent
import se.seb.components.GdsInputContainedComponent
import se.seb.components.ScreenComponent
import se.seb.components.SpaceComponent
import se.seb.components.common.Action
import kotlin.reflect.KClass

object ComponentRendererRegistry {
    private val componentRegistry: Map<KClass<out Component>, ComponentRenderer<out Component>> =
        mapOf(
            ScreenComponent::class to ScreenComponentRenderer(),
            ColumnComponent::class to ColumnComponentRenderer(),
            GDSTextComponent::class to TextComponentRenderer(),
            GDSButtonComponent::class to ButtonComponentRenderer(),
            GdsInputContainedComponent::class to InputContainedComponentRenderer(),
            SpaceComponent::class to SpaceComponentRenderer(),
        )

    @Suppress("UNCHECKED_CAST")
    @Composable
    fun RenderComponent(
        component: Component,
        actionHandler: (Action) -> Unit,
    ) {
        val renderer = componentRegistry[component::class] ?: UnknownComponentRenderer
        (renderer as ComponentRenderer<Component>).Render(component, actionHandler)
    }
}
