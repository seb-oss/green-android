package se.seb.gds.renderer

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import se.seb.components.SpaceComponent
import se.seb.components.common.Action
import se.seb.gds.renderer.mapper.toDimen


class SpaceComponentRenderer : ComponentRenderer<SpaceComponent> {
    @Composable
    override fun Render(
        component: SpaceComponent,
        actionHandler: (Action) -> Unit,
    ) {
        Spacer(Modifier.height(component.height.toDimen()))
    }
}