package se.seb.gds.atoms

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import se.seb.gds.theme.GdsTheme

/**
 * A composable for displaying text with GDS styling.
 *
 * @param modifier The modifier to be applied to the text.
 * @param label The text to be displayed.
 * @param color The color of the text. Defaults to `GdsTheme.colors.ContentNeutral01`.
 * @param style The text style to be applied. Defaults to `GdsTheme.typography.BodyBookM`.
 *
 * Example usage:
 * ```
 * GdsText(
 *     label = "Hello, World!",
 *     style = GdsTheme.typography.DisplayL,
 *     color = GdsTheme.colors.Content.Positive01
 * )
 * ```
 */
@Composable
fun GdsText(
    modifier: Modifier = Modifier,
    label: String,
    color: Color? = null,
    style: TextStyle? = null,
) {
    Text(
        modifier = modifier,
        text = label,
        style = style ?: GdsTheme.typography.BodyBookM,
        color = color ?: GdsTheme.colors.Content.Neutral01,
    )
}
