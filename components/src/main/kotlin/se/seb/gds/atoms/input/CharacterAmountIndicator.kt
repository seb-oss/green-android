package se.seb.gds.atoms.input

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun CharacterAmountIndicator(
    modifier: Modifier = Modifier,
    maxCharacters: Int?,
    currentCharacters: Int,
    textStyle: TextStyle,
    color: Color,
) {
    val maxCharactersText = maxCharacters.toString()
    val currentCharactersText = currentCharacters.toString()
    val trailingIconText = "$currentCharactersText/$maxCharactersText"

    Text(
        modifier = modifier,
        text = trailingIconText,
        style = textStyle,
        color = color,
    )
}
