package se.seb.gds.atoms

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import se.seb.gds.theme.GdsTheme

@Composable
fun GdsText(
    modifier: Modifier = Modifier,
    label: String,
    color: Color?,
    style: TextStyle?,
) {
    Text(
        modifier = modifier,
        text = label,
        style = style ?: GdsTheme.legacyTypography.Body,
        color = color ?: GdsTheme.colors.ContentNeutral01,
    )
}
