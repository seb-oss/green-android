package se.seb.gds.renderer

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import se.seb.components.ColumnComponent
import se.seb.components.common.Action
import se.seb.gds.renderer.mapper.toColor

class ColumnComponentRenderer : ComponentRenderer<ColumnComponent> {
    @Composable
    override fun Render(
        component: ColumnComponent,
        actionHandler: (Action) -> Unit,
    ) {
        Column(
            Modifier
                .margin(component.modifier?.margin)
                .gdsBackground(component.modifier?.backgroundColor?.toColor()),
        ) {
            component.children.forEach {
                RenderComponent(it, actionHandler)
            }
        }
    }
}