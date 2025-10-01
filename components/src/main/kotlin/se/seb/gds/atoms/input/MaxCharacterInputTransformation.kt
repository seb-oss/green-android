package se.seb.gds.atoms.input

import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.TextFieldBuffer

open class MaxCharacterInputTransformation(private val maxCharacters: Int) : InputTransformation {
    override fun TextFieldBuffer.transformInput() {
        if (length > maxCharacters) {
            revertAllChanges()
        }
    }
}
