package se.seb.gds.atoms.input

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.TextFieldBuffer
import androidx.compose.foundation.text.input.forEachChange

open class CharacterWhitelistInputTransformation(
    private val characterWhitelistPredicate: (
        original: CharSequence,
        newCharSequence: CharSequence,
    ) -> (Boolean),
) : InputTransformation {
    @OptIn(ExperimentalFoundationApi::class)
    override fun TextFieldBuffer.transformInput() {
        this.changes.forEachChange { sourceRange, _ ->
            val newString = asCharSequence().substring(sourceRange.start, sourceRange.end)
            if (newString.isEmpty()) {
                return@forEachChange
            }
            if (!characterWhitelistPredicate(this.originalText, newString)) {
                revertAllChanges()
            }
        }
    }
}
