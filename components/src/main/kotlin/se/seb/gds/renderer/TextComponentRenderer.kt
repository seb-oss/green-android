package se.seb.gds.renderer

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import se.seb.components.GDSTextComponent
import se.seb.components.common.Action
import se.seb.gds.atoms.GdsText
import se.seb.gds.renderer.mapper.toColor
import se.seb.gds.renderer.mapper.toTextStyle

class TextComponentRenderer : ComponentRenderer<GDSTextComponent> {
    @Composable
    override fun Render(
        component: GDSTextComponent,
        actionHandler: (Action) -> Unit,
    ) {
        GdsText(
            modifier = Modifier
                .margin(component.modifier?.margin)
                .gdsBackground(component.modifier?.backgroundColor?.toColor()),
            label = component.label,
            style = component.style.toTextStyle(),
            color = component.color.toColor(),
        )
    }
}
