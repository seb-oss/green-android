package se.seb.gds.renderer

//class InputDefaultComponentRenderer : ComponentRenderer<GdsInputContainedComponent> {
//    @Composable
//    override fun Render(
//        component: GdsInputContainedComponent,
//        actionHandler: (ActionComponent) -> Unit,
//    ) {
//        val lineLimits = component.minHeightInLines?.let { TextFieldLineLimits.MultiLine(minHeightInLines = it) } ?: TextFieldLineLimits.SingleLine
//        GdsInput(
//            modifier = Modifier
//                .margin(component.modifier?.margin)
//                .background(component.modifier?.backgroundColor?.toColor()),
//            style = GdsInputDefaults.defaultStyle(),
//            state = rememberTextFieldState(),
//            label = component.label,
//            supportLabel = component.supportLabel,
//            supportingText = component.supportingMessage,
//            errorMessage = component.errorMessage,
//            maxCharacters = component.validation?.maxCharacters,
//            lineLimits = lineLimits,
//        )
//    }
//}
