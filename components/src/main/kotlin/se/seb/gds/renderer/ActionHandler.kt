package se.seb.gds.renderer

import se.seb.components.common.ActionType

interface ActionHandler {
    fun onAction(action: ActionType): kotlin.Unit
}