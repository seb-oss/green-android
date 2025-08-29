package se.seb.gds.renderer

import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import se.seb.components.GdsInputContainedComponent
import se.seb.components.common.Action
import se.seb.gds.atoms.input.GdsInput
import se.seb.gds.atoms.input.GdsInputDefaults
import se.seb.gds.renderer.mapper.toColor

class InputContainedComponentRenderer : ComponentRenderer<GdsInputContainedComponent> {
    @Composable
    override fun Render(
        component: GdsInputContainedComponent,
        actionHandler: (Action) -> Unit,
    ) {
        val lineLimits = component.minHeightInLines?.let { TextFieldLineLimits.MultiLine(minHeightInLines = it) } ?: TextFieldLineLimits.SingleLine
        GdsInput(
            modifier = Modifier
                .margin(component.modifier?.margin)
                .gdsBackground(component.modifier?.backgroundColor?.toColor()),
            style = GdsInputDefaults.containedStyle(),
            state = rememberTextFieldState(),
            label = component.label,
            supportingText = component.supportingMessage,
            errorMessage = component.errorMessage,
            maxCharacters = component.validation?.maxCharacters,
            lineLimits = lineLimits,
        )
    }
}
