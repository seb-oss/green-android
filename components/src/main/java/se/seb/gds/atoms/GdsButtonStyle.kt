package se.seb.gds.atoms

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

/**
 * Represents the styling options for a "Green Design System Button".
 *
 * This data class encapsulates the visual properties of a button, allowing you to customize its
 * size, shape, and colors.  It provides a structured way to define the appearance of
 * buttons consistently throughout your application.
 *
 * @property size The [GdsButtonSize] enum that determines the overall size (e.g., small, medium, large) of the button.
 * @property shape The [Shape] that defines the button's outline, such as rounded corners or a pill shape.
 * @property colors The [ButtonColors] that dictate the button's colors for various states (e.g., enabled, disabled, pressed).
 *
 * Example usage:
 *
 * ```
 * val myButtonStyle = GdsButtonStyle(
 *     size = GdsButtonSize.Medium,
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
data class GdsButtonStyle(
    val size: GdsButtonSize,
    val shape: Shape,
    val colors: ButtonColors,
    val bookFont: Boolean = false,
    val textButton: Boolean = false,
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

enum class LegacyButtonSize {
    LARGE,
    MEDIUM,
    SMALL,
}

/**
 * Represents the size configuration for a Green Design System Button.
 *
 * This sealed class defines different size variants for a Green Button,
 * specifying both the width and height. Each variant is a data class, allowing for
 * easy comparison and usage in composables.
 *
 * @property buttonWidth The width configuration for the button. Can be either [ButtonWidthType.Fixed] or [ButtonWidthType.Full].
 * @property buttonHeight The height of the button, represented as a [Dp] value.
 */
sealed class GdsButtonSize(val buttonWidth: ButtonWidthType, val buttonHeight: Dp) {
    data class Default(val width: ButtonWidthType) : GdsButtonSize(width, 48.dp)
    data class Legacy(val size: LegacyButtonSize) : GdsButtonSize(
        buttonWidth = when (size) {
            LegacyButtonSize.LARGE -> ButtonWidthType.Full
            LegacyButtonSize.MEDIUM -> ButtonWidthType.Full
            LegacyButtonSize.SMALL -> ButtonWidthType.Dynamic
        },
        buttonHeight = when (size) {
            LegacyButtonSize.LARGE -> 50.dp
            LegacyButtonSize.MEDIUM -> 45.dp
            LegacyButtonSize.SMALL -> 40.dp
        }
    )

    data class Custom(val width: ButtonWidthType, val height: Dp) : GdsButtonSize(width, height)
}

object GdsButtonDefaults {

    object TwentyThree {
        @Composable
        fun primaryStyle() = GdsButtonStyle(
            size = GdsButtonSize.Default(ButtonWidthType.Full),
            shape = sebShape(),
            colors = primaryColors(),
            bookFont = true
        )

        @Composable
        fun secondaryStyle() = GdsButtonStyle(
            size = GdsButtonSize.Default(ButtonWidthType.Full),
            shape = sebShape(),
            colors = secondaryColors(),
            bookFont = true
        )

        @Composable
        fun tertiaryStyle() = GdsButtonStyle(
            size = GdsButtonSize.Default(ButtonWidthType.Full),
            shape = sebShape(),
            colors = tertiaryColors(),
            bookFont = true,
            textButton = true
        )

        @Composable
        fun primaryColors() = ButtonDefaults.buttonColors(
            containerColor = GdsTheme.colors.level3BackgroundPrimary,
            contentColor = GdsTheme.colors.level3ContentPrimary,
        )

        @Composable
        fun secondaryColors() = ButtonDefaults.buttonColors(
            containerColor = GdsTheme.colors.level3BackgroundSecondary,
            contentColor = GdsTheme.colors.level3ContentTertiary
        )

        @Composable
        fun tertiaryColors() = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = GdsTheme.colors.level3ContentTertiary
        )
    }

    @Composable
    fun primary(size: LegacyButtonSize = LegacyButtonSize.LARGE) = GdsButtonStyle(
        size = GdsButtonSize.Legacy(size),
        shape = seb2016Shape(size),
        colors = primaryColors(),
        bookFont = false
    )

    @Composable
    fun secondary(size: LegacyButtonSize) = GdsButtonStyle(
        size = GdsButtonSize.Legacy(size),
        shape = seb2016Shape(size),
        colors = secondaryColors(),
        bookFont = false,
        textButton = true,
    )

    @Composable
    fun tertiary(size: LegacyButtonSize) = GdsButtonStyle(
        size = GdsButtonSize.Legacy(size),
        shape = seb2016Shape(size),
        colors = tertiaryColors(),
        bookFont = false
    )

    @Composable
    fun primaryDestructive(size: LegacyButtonSize) = GdsButtonStyle(
        size = GdsButtonSize.Legacy(size),
        shape = seb2016Shape(size),
        colors = primaryDestructiveColors(),
        bookFont = false
    )

    @Composable
    fun secondaryDestructive() = GdsButtonStyle(
        size = GdsButtonSize.Custom(ButtonWidthType.Full, 50.dp),
        shape = seb2016Shape(LegacyButtonSize.SMALL),
        colors = secondaryDestructiveColors(),
        bookFont = false,
        textButton = true
    )

    @Composable
    fun tertiaryDestructive() = GdsButtonStyle(
        size = GdsButtonSize.Custom(ButtonWidthType.Full, 50.dp),
        shape = seb2016Shape(LegacyButtonSize.SMALL),
        colors = tertiaryDestructiveColors(),
        bookFont = false,
    )

    @Composable
    fun tertiaryEmphasis() = GdsButtonStyle(
        size = GdsButtonSize.Custom(ButtonWidthType.Full, 50.dp),
        shape = seb2016Shape(LegacyButtonSize.SMALL),
        colors = tertiaryEmphasisColors(),
        bookFont = false
    )

    @Composable
    fun primaryColors() = ButtonDefaults.buttonColors(
        containerColor = GdsTheme.legacyColors.secondary,
        contentColor = Color.White,
    )

    @Composable
    fun primaryDestructiveColors() = ButtonDefaults.buttonColors(
        containerColor = GdsTheme.legacyColors.Red1,
        contentColor = Color.White,
    )

    @Composable
    fun secondaryDestructiveColors() = ButtonDefaults.buttonColors(
        containerColor = Color.Transparent,
        contentColor = GdsTheme.legacyColors.Red1,
    )

    @Composable
    fun tertiaryDestructiveColors() = ButtonDefaults.buttonColors(
        containerColor = GdsTheme.legacyColors.TertiaryButtonBackground,
        contentColor = GdsTheme.legacyColors.Red1,
    )

    @Composable
    fun secondaryColors() = ButtonDefaults.buttonColors(
        containerColor = Color.Transparent,
        contentColor = GdsTheme.legacyColors.secondary,
    )

    @Composable
    fun tertiaryColors() = ButtonDefaults.buttonColors(
        containerColor = GdsTheme.legacyColors.TertiaryButtonBackground,
        contentColor = GdsTheme.legacyColors.PrimaryText,
    )

    @Composable
    fun tertiaryEmphasisColors() = ButtonDefaults.buttonColors(
        containerColor = GdsTheme.legacyColors.TertiaryButtonBackground,
        contentColor = GdsTheme.legacyColors.DarkBlue1,
    )

    @Composable
    fun sebShape() = RoundedCornerShape(24.dp)

    @Composable
    fun seb2016Shape(size: LegacyButtonSize) = RoundedCornerShape(
        when (size) {
            LegacyButtonSize.LARGE -> 12.dp
            LegacyButtonSize.MEDIUM -> 12.dp
            LegacyButtonSize.SMALL -> 8.dp
        }
    )
}