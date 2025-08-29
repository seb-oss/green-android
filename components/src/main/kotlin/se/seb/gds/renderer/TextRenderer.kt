package se.seb.gds.renderer

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import se.seb.components.GDSTextComponent
import se.seb.components.common.Action
import se.seb.gds.atoms.GdsText
import se.seb.gds.renderer.mapper.toColor
import se.seb.gds.renderer.mapper.toTextStyle

@Composable
fun GDSTextComponent.Render(actionHandler: (Action) -> Unit) =
        GdsText(
            modifier = Modifier
                .margin(this.modifier?.margin)
                .gdsBackground(this.modifier?.backgroundColor?.toColor()),
            label = this.label,
            style = this.style.toTextStyle(),
            color = this.color.toColor(),
        )
