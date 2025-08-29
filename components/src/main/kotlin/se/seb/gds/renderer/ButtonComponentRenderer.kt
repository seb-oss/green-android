package se.seb.gds.renderer

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import se.seb.components.GDSButtonComponent
import se.seb.components.common.Action
import se.seb.components.uitokens.Style
import se.seb.gds.atoms.GdsButton
import se.seb.gds.atoms.GdsButtonDefaults
import se.seb.gds.atoms.GdsButtonStyle
import se.seb.gds.renderer.mapper.toColor


class ButtonComponentRenderer : ComponentRenderer<GDSButtonComponent> {
    @Composable
    override fun Render(
        component: GDSButtonComponent,
        actionHandler: (Action) -> Unit,
    ) {
        GdsButton(
            modifier = Modifier
                .margin(component.modifier?.margin)
                .gdsBackground(component.modifier?.backgroundColor?.toColor()),
            title = component.text,
            style = component.style.toButtonStyle(),
            onClick = { actionHandler(component.action) },
        )
    }
}

@Composable
fun Style.toButtonStyle(): GdsButtonStyle =
    when (this) {
        Style.BUTTON_PRIMARY -> GdsButtonDefaults.TwentyThree.primaryStyle()
//        ButtonStyleTokens.SECONDARY -> GdsButtonDefaults.TwentyThree.secondaryStyle()
//        ButtonStyleTokens.TERTIARY -> GdsButtonDefaults.TwentyThree.tertiaryStyle()
        else -> GdsButtonDefaults.TwentyThree.primaryStyle()
    }
