package se.seb.gds.atoms

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
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
 * @property colors The [ButtonColors] that dictate the button's colors for various states (e.g., enabled, disabled, pressed).
 * @property textButton A [Boolean] indicating if the button should be styled as a text
 * button (true) or a filled button (false). Default is false.
 * @property border A [Boolean] indicating if the button should have a border. Default is false.
 * @property legacyRipple A [Boolean] indicating if the button should use legacy ripple effect. Default is false.
 *
 * Example usage:
 *
 * ```
 * val myButtonStyle = GdsButtonStyle(
 *      colors = ButtonDefaults.buttonColors(
 *              containerColor = Color.Green,
 *              contentColor = Color.White
 *          ),
 *    textButton = false,
 *    border = BorderStroke(1.dp, Color.Black),
 * )
 * ```
 */
data class GdsButtonStyle(
    val colors: ButtonColors,
    val textButton: Boolean = false,
    val border: BorderStroke? = null,
    val legacyRipple: Boolean = false,
)

/**
 * Represents the size profile for a "Green Design System Button".
 *
 * This data class encapsulates the size-related properties of a button, allowing you to customize its
 * width, height, shape, padding, icon size, icon spacing, and text style. It provides a structured way to define the
 * size and layout of buttons consistently throughout your application.
 *
 * @property widthType The [ButtonWidthType] that determines the button's width behavior (e.g., full, dynamic, fixed).
 * @property height The height of the button, specified in Dp.
 * @property shape The [Shape] that defines the button's outline, such as rounded corners or a pill shape.
 * @property horizontalPadding The horizontal padding inside the button, specified in Dp.
 * @property iconSize The size of any icon included in the button, specified in Dp.
 * @property iconSpacing The spacing between the icon and the text within the button, specified in Dp.
 * @property textStyle The [TextStyle] that specifies the typography for the button's label, including font size and weight.
 *
 * Example usage:
 *
 * ```
 * val myButtonSizeProfile = GdsButtonSizeProfile(
 *     widthType = ButtonWidthType.Full,
 *     height = 48.dp,
 *     shape = RoundedCornerShape(8.dp),
 *     horizontalPadding = 16.dp,
 *     iconSize = 24.dp,
 *     iconSpacing = 8.dp,
 * )
 * ```
 */
data class GdsButtonSizeProfile(
    val widthType: ButtonWidthType = ButtonWidthType.Full,
    val height: Dp = 48.dp,
    val shape: Shape,
    val horizontalPadding: Dp,
    val iconSize: Dp = 24.dp,
    val iconSpacing: Dp,
    val textStyle: TextStyle,
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

object GdsButtonDefaults {
    object TwentyThree {
        @Composable
        fun primary() = GdsButtonStyle(colors = primaryColors())

        @Composable
        fun secondaryOnWhite() = GdsButtonStyle(colors = secondaryOnWhiteColors())

        @Composable
        fun secondaryOnGrey() = GdsButtonStyle(colors = secondaryOnGreyColors())

        @Composable
        fun secondaryOnWhiteCard() = GdsButtonStyle(colors = secondaryOnWhiteCardColors())

        @Composable
        fun secondaryOnGreyCard() = GdsButtonStyle(colors = secondaryOnGreyCardColors())

        @Composable
        fun tertiary() =
            GdsButtonStyle(
                colors = tertiaryColors(),
                textButton = true,
            )

        @Composable
        fun outline() =
            GdsButtonStyle(
                colors = outlineColors(),
                border = BorderStroke(width = 1.dp, color = GdsTheme.colors.BorderSubtle01),
            )

        @Composable
        fun negative() =
            GdsButtonStyle(
                colors = negativeColors(),
            )

        @Composable
        fun primaryColors() =
            ButtonDefaults.buttonColors(
                containerColor = GdsTheme.colors.L3NeutralStrong,
                contentColor = GdsTheme.colors.ContentNeutral03,
                disabledContainerColor = GdsTheme.colors.L3Disabled03,
                disabledContentColor = GdsTheme.colors.ContentDisabled01,
            )

        @Composable
        fun secondaryOnWhiteColors() =
            ButtonDefaults.buttonColors(
                containerColor = GdsTheme.colors.L2Neutral01,
                contentColor = GdsTheme.colors.ContentNeutral01,
                disabledContainerColor = GdsTheme.colors.L3Disabled03,
                disabledContentColor = GdsTheme.colors.ContentDisabled01,
            )

        @Composable
        fun secondaryOnGreyColors() =
            ButtonDefaults.buttonColors(
                containerColor = GdsTheme.colors.L2Neutral02,
                contentColor = GdsTheme.colors.ContentNeutral01,
                disabledContainerColor = GdsTheme.colors.L3Disabled03,
                disabledContentColor = GdsTheme.colors.ContentDisabled01,
            )

        @Composable
        fun secondaryOnWhiteCardColors() =
            ButtonDefaults.buttonColors(
                containerColor = GdsTheme.colors.L3Neutral02,
                contentColor = GdsTheme.colors.ContentNeutral01,
                disabledContainerColor = GdsTheme.colors.L3Disabled03,
                disabledContentColor = GdsTheme.colors.ContentDisabled01,
            )

        @Composable
        fun secondaryOnGreyCardColors() =
            ButtonDefaults.buttonColors(
                containerColor = GdsTheme.colors.L3Neutral01,
                contentColor = GdsTheme.colors.ContentNeutral01,
                disabledContainerColor = GdsTheme.colors.L3Disabled03,
                disabledContentColor = GdsTheme.colors.ContentDisabled01,
            )

        @Composable
        fun tertiaryColors() =
            ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = GdsTheme.colors.ContentNeutral01,
                disabledContainerColor = GdsTheme.colors.L3Disabled03,
                disabledContentColor = GdsTheme.colors.ContentDisabled01,
            )

        @Composable
        fun outlineColors() =
            ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = GdsTheme.colors.ContentNeutral01,
                disabledContainerColor = GdsTheme.colors.L3Disabled03,
                disabledContentColor = GdsTheme.colors.ContentDisabled01,
            )

        @Composable
        fun negativeColors() =
            ButtonDefaults.buttonColors(
                containerColor = GdsTheme.colors.L3Negative01,
                contentColor = GdsTheme.colors.ContentInversed,
                disabledContainerColor = GdsTheme.colors.L3Disabled03,
                disabledContentColor = GdsTheme.colors.ContentDisabled01,
            )

        @Composable
        fun xLarge() =
            GdsButtonSizeProfile(
                height = 56.dp,
                widthType = ButtonWidthType.Full,
                shape = RoundedCornerShape(GdsTheme.dimensions.radius.Radius2Xl),
                horizontalPadding = GdsTheme.dimensions.spacing.SpaceXl,
                textStyle = GdsTheme.typography.DetailBookM,
                iconSize = 24.dp,
                iconSpacing = GdsTheme.dimensions.spacing.SpaceXs,
            )

        @Composable
        fun large() =
            GdsButtonSizeProfile(
                height = 48.dp,
                widthType = ButtonWidthType.Full,
                shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusXl),
                horizontalPadding = GdsTheme.dimensions.spacing.SpaceXl,
                textStyle = GdsTheme.typography.DetailBookM,
                iconSize = 24.dp,
                iconSpacing = GdsTheme.dimensions.spacing.SpaceXs,
            )

        @Composable
        fun medium() =
            GdsButtonSizeProfile(
                height = 40.dp,
                widthType = ButtonWidthType.Full,
                shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusL),
                horizontalPadding = GdsTheme.dimensions.spacing.SpaceL,
                textStyle = GdsTheme.typography.DetailBookM,
                iconSize = 20.dp,
                iconSpacing = GdsTheme.dimensions.spacing.SpaceXs,
            )

        @Composable
        fun small() =
            GdsButtonSizeProfile(
                height = 32.dp,
                widthType = ButtonWidthType.Full,
                shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusM),
                horizontalPadding = GdsTheme.dimensions.spacing.SpaceM,
                textStyle = GdsTheme.typography.DetailBookM,
                iconSize = 16.dp,
                iconSpacing = GdsTheme.dimensions.spacing.Space2Xs,
            )
    }

    @Composable
    fun primary() =
        GdsButtonStyle(
            colors = primaryColors(),
            legacyRipple = true,
        )

    @Composable
    fun secondary() =
        GdsButtonStyle(
            colors = secondaryColors(),
            textButton = true,
            legacyRipple = true,
        )

    @Composable
    fun tertiary() =
        GdsButtonStyle(
            colors = tertiaryColors(),
            legacyRipple = true,
        )

    @Composable
    fun primaryDestructive() =
        GdsButtonStyle(
            colors = primaryDestructiveColors(),
            legacyRipple = true,
        )

    @Composable
    fun secondaryDestructive() =
        GdsButtonStyle(
            colors = secondaryDestructiveColors(),
            textButton = true,
            legacyRipple = true,
        )

    @Composable
    fun tertiaryDestructive() =
        GdsButtonStyle(
            colors = tertiaryDestructiveColors(),
            legacyRipple = true,
        )

    @Composable
    fun tertiaryEmphasis() =
        GdsButtonStyle(
            colors = tertiaryEmphasisColors(),
            legacyRipple = true,
        )

    @Composable
    fun primaryColors() =
        ButtonDefaults.buttonColors(
            containerColor = GdsTheme.legacyColors.secondary,
            contentColor = Color.White,
        )

    @Composable
    fun primaryDestructiveColors() =
        ButtonDefaults.buttonColors(
            containerColor = GdsTheme.legacyColors.Red1,
            contentColor = Color.White,
        )

    @Composable
    fun secondaryDestructiveColors() =
        ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = GdsTheme.legacyColors.Red1,
        )

    @Composable
    fun tertiaryDestructiveColors() =
        ButtonDefaults.buttonColors(
            containerColor = GdsTheme.legacyColors.TertiaryButtonBackground,
            contentColor = GdsTheme.legacyColors.Red1,
        )

    @Composable
    fun secondaryColors() =
        ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = GdsTheme.legacyColors.secondary,
        )

    @Composable
    fun tertiaryColors() =
        ButtonDefaults.buttonColors(
            containerColor = GdsTheme.legacyColors.TertiaryButtonBackground,
            contentColor = GdsTheme.legacyColors.PrimaryText,
        )

    @Composable
    fun tertiaryEmphasisColors() =
        ButtonDefaults.buttonColors(
            containerColor = GdsTheme.legacyColors.TertiaryButtonBackground,
            contentColor = GdsTheme.legacyColors.DarkBlue1,
        )

    @Composable
    fun seb2016Shape(size: LegacyButtonSize) =
        RoundedCornerShape(
            when (size) {
                LegacyButtonSize.LARGE -> GdsTheme.dimensions.radius.RadiusS
                LegacyButtonSize.MEDIUM -> GdsTheme.dimensions.radius.RadiusS
                LegacyButtonSize.SMALL -> GdsTheme.dimensions.radius.RadiusXs
            },
        )

    @Composable
    fun seb2016WidthType(size: LegacyButtonSize): ButtonWidthType =
        when (size) {
            LegacyButtonSize.LARGE -> ButtonWidthType.Full
            LegacyButtonSize.MEDIUM -> ButtonWidthType.Full
            LegacyButtonSize.SMALL -> ButtonWidthType.Dynamic
        }

    @Composable
    fun seb2016HeightType(size: LegacyButtonSize): Dp =
        when (size) {
            LegacyButtonSize.LARGE -> 50.dp
            LegacyButtonSize.MEDIUM -> 45.dp
            LegacyButtonSize.SMALL -> 40.dp
        }

    val legacyIconSize: Dp = 24.dp

    @Composable
    fun legacySizeProfile(size: LegacyButtonSize): GdsButtonSizeProfile =
        GdsButtonSizeProfile(
            widthType = seb2016WidthType(size),
            height = seb2016HeightType(size),
            shape = seb2016Shape(size),
            horizontalPadding = GdsTheme.dimensions.spacing.SpaceM,
            textStyle = GdsTheme.typography.BodyMediumM, // Closest match
            iconSize = legacyIconSize,
            iconSpacing = GdsTheme.dimensions.spacing.SpaceS,
        )

    @Composable
    fun legacyFullSmallProfile(): GdsButtonSizeProfile =
        GdsButtonSizeProfile(
            widthType = ButtonWidthType.Full,
            height = 50.dp,
            shape = seb2016Shape(LegacyButtonSize.SMALL),
            horizontalPadding = GdsTheme.dimensions.spacing.SpaceM,
            textStyle = GdsTheme.typography.BodyMediumM, // Closest match
            iconSize = legacyIconSize,
            iconSpacing = GdsTheme.dimensions.spacing.SpaceS,
        )
}
