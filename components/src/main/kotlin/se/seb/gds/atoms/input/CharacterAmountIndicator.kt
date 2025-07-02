package se.seb.gds.atoms.input

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

@Composable
fun CharacterAmountIndicator(
    maxCharacters: Int,
    currentCharacters: Int,
    isFocused: Boolean
) {
    val maxCharactersText = maxCharacters.toString()
    val currentCharactersText = currentCharacters.toString()
    val trailingIconText = "$currentCharactersText/$maxCharactersText"

    Text(
        text = trailingIconText,
        modifier = Modifier
            .background(color = GdsTheme.colors.l303, shape = RoundedCornerShape(4.dp))
            .padding(vertical = 4.dp, horizontal = 6.dp)
            .alpha(if (isFocused) 1f else 0f),
        style = GdsTheme.typography.Caption,
        color = GdsTheme.colors.contentContent01,
    )
}