package se.seb.green.atoms

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import se.seb.green.theme.GreenTheme


/**
 * A primary green button composable.
 *
 * This composable creates a button with a green theme, customizable size, and styling.
 *
 * @param modifier The modifier to be applied to the button.
 * @param title The text displayed on the button.
 * @param enabled Controls the enabled state of the button. When `false`, this button will not be clickable.
 * @param style The styling to be applied to the button, including colors, shape, and size. Defaults to `GreenButtonDefaults.defaultStyle()`.
 * @param onClick The callback to be invoked when the button is clicked.
 *
 * Example usage:
 * ```
 * GreenButtonPrimary(
 *     title = "Click Me",
 *     onClick = { println("Button clicked!") }
 * )
 *
 * GreenButtonPrimary(
 *     title = "Fixed Width Button",
 *     style = GreenButtonDefaults.legacyStyle().copy(
 *         size = GreenButtonSize.legacy(ButtonWidthType.Fixed(200.dp))
 *     )
 * )
 */
@Composable
fun GreenButtonPrimary(
    modifier: Modifier = Modifier,
    title: String,
    enabled: Boolean = true,
    style: GreenButtonStyle = GreenButtonDefaults.defaultStyle(),
    onClick: () -> Unit,
) {
    val widthModifier = when (style.size.buttonWidth) {
        ButtonWidthType.Dynamic -> modifier
        is ButtonWidthType.Fixed -> modifier.width(style.size.buttonWidth.width)
        ButtonWidthType.Full -> modifier.fillMaxWidth()
    }

    GreenTheme {
        Button(
            modifier = modifier
                .then(widthModifier)
                .heightIn(min = style.size.buttonHeight),
            colors = style.colors,
            shape = style.shape,
            enabled = enabled,
            onClick = onClick
        ) {
            Text(title, style = GreenTheme.typography.Headline)
        }
    }
}

/**
 * Represents the styling options for a "Green Button".
 *
 * This data class encapsulates the visual properties of a button, allowing you to customize its
 * size, shape, and colors.  It provides a structured way to define the appearance of
 * buttons consistently throughout your application.
 *
 * @property size The [GreenButtonSize] enum that determines the overall size (e.g., small, medium, large) of the button.
 * @property shape The [Shape] that defines the button's outline, such as rounded corners or a pill shape.
 * @property colors The [ButtonColors] that dictate the button's colors for various states (e.g., enabled, disabled, pressed).
 *
 * Example usage:
 *
 * ```
 * val myButtonStyle = GreenButtonStyle(
 *     size = GreenButtonSize.Medium,
 *     shape = RoundedCornerShape(8.dp),
 *     colors = ButtonDefaults.buttonColors(
 *         backgroundColor = Color.Green,
 *         contentColor = Color.White,
 *         disabledBackgroundColor = Color.LightGray,
 *         disabledContentColor = Color.Gray
 *     )
 * )
 * ```
 */
data class GreenButtonStyle(
    val size: GreenButtonSize,
    val shape: Shape,
    val colors: ButtonColors
)

/**
 * Represents the different types of width that a button can have.
 *
 * A button's width can be:
 * - Full: The button will expand to fill the available horizontal space.
 * - Dynamic: The button's width will adjust based on its content.
 * - Fixed: The button will have a specific, predetermined width.
 */
sealed class ButtonWidthType {
    data object Full : ButtonWidthType()
    data object Dynamic : ButtonWidthType()
    data class Fixed(val width: Dp) : ButtonWidthType()
}

/**
 * Represents the size configuration for a Green Button.
 *
 * This sealed class defines different size variants for a Green Button,
 * specifying both the width and height. Each variant is a data class, allowing for
 * easy comparison and usage in composables.
 *
 * @property buttonWidth The width configuration for the button. Can be either [ButtonWidthType.Fixed] or [ButtonWidthType.Full].
 * @property buttonHeight The height of the button, represented as a [Dp] value.
 */
sealed class GreenButtonSize(val buttonWidth: ButtonWidthType, val buttonHeight: Dp) {
    data class Default(val width: ButtonWidthType) : GreenButtonSize(width, 48.dp)
    data class Legacy(val width: ButtonWidthType) : GreenButtonSize(width, 50.dp)
}

object GreenButtonDefaults {
    @Composable
    fun defaultStyle() = GreenButtonStyle(
        size = GreenButtonSize.Default(ButtonWidthType.Full),
        shape = sebShape(),
        colors = defaultColors()
    )

    @Composable
    fun legacyStyle() = GreenButtonStyle(
        size = GreenButtonSize.Legacy(ButtonWidthType.Full),
        shape = seb2016Shape(),
        colors = legacyColors()
    )

    @Composable
    fun defaultColors() = ButtonDefaults.buttonColors(
        containerColor = GreenTheme.colors.level3Colors.levelL3BackgroundPrimary,
        contentColor = GreenTheme.colors.level3Colors.levelL3ContentPrimary,
    )

    @Composable
    fun legacyColors() = ButtonDefaults.buttonColors(
        containerColor = GreenTheme.legacyColors.secondary,
        contentColor = Color.White,
    )

    @Composable
    fun sebShape() = CircleShape

    @Composable
    fun seb2016Shape() = RoundedCornerShape(12.dp)
}

@Preview(
    name = "Light Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0xFFFFFF,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0x000000,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun GreenButtonPrimaryPreview() {
    GreenTheme {
        GreenButtonPrimary(
            title = "Button",
            onClick = {}
        )
    }
}

@Preview(
    name = "Light Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0xFFFFFF,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Dark Mode",
    group = "Themes",
    showBackground = true,
    backgroundColor = 0x000000,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun GreenButton2016PrimaryPreview() {
    GreenTheme {
        GreenButtonPrimary(
            style = GreenButtonDefaults.legacyStyle().copy(
                size = GreenButtonSize.Legacy(ButtonWidthType.Fixed(200.dp))
            ),
            title = "Button",
            onClick = {}
        )
    }
}