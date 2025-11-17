package se.seb.gds.atoms.input

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import se.seb.gds.theme.GdsTheme

/**
 * Style configuration for a [GdsInput], including sizes, colors, and text styles.
 *
 * See [GdsInputDefaults] for the default implementation.
 *
 * @property containerSize The size of the input container, including height and shape.
 * @property colors The colors used by the input in different states.
 * @property textSelectionColors The colors used for text selection in the input field.
 * @property textStyle The text styles used by the input in different states.
 * @property unfocusedBorderThickness The thickness of the border when the input is unfocused.
 * @property focusedBorderThickness The thickness of the border when the input is focused.
 *
 */
data class GdsInputStyle(
    val containerSize: InputSizeConfig,
    val colors: GdsInputColors,
    val textSelectionColors: TextSelectionColors,
    val textStyle: GdsInputTextStyle,
    val unfocusedBorderThickness: Dp,
    val focusedBorderThickness: Dp,
    val showBorder: Boolean = true,
) {
    fun getBorderWidth(
        textFieldIsFocused: Boolean,
        isError: Boolean,
    ): Dp =
        if (textFieldIsFocused || isError) {
            focusedBorderThickness
        } else {
            unfocusedBorderThickness
        }

    fun getContainerSize(isLandscape: Boolean): InputSize =
        if (isLandscape) containerSize.landscape else containerSize.portrait
}

/**
 * Text styles used by a [GdsInput] in different states.
 *
 * See [GdsInputDefaults.inputTextStyle] for the default text styles.
 * @property smallLabelStyle The text style for the floating label in the small state.
 * @property largeLabelStyle The text style for the floating label in the large state.
 * @property inputTextStyle The text style for the input text.
 * @property footerMessageStyle The text style for the footer message (supporting or error text).
 * @property labelStyle The text style for the label positioned above the container.
 * @property supportLabelStyle The text style for the supporting label positioned above the container.
 * @property characterCounter The text style for the character counter.
 */
data class GdsInputTextStyle(
    val smallLabelStyle: TextStyle,
    val largeLabelStyle: TextStyle,
    val inputTextStyle: TextStyle,
    val footerMessageStyle: TextStyle,
    val labelStyle: TextStyle,
    val supportLabelStyle: TextStyle,
    val characterCounter: TextStyle,
)

/**
 * Creates a [GdsInputColors] that represents the default colors used in
 * a [GdsInput].
 */

object GdsInputDefaults {
    /** Default style for [GdsInputDefault] and [GdsInputContained] */
    @Composable
    fun defaultStyle() =
        GdsInputStyle(
            containerSize = defaultInputSizeConfig(),
            colors = inputColors(),
            textSelectionColors = textSelectionColors(),
            textStyle = inputTextStyle(),
            unfocusedBorderThickness = 1.dp,
            focusedBorderThickness = 2.dp,
            showBorder = true
        )

    /** Contained style for [GdsInput] with floating label. */
    @Composable
    fun containedStyle() =
        defaultStyle().copy(
            containerSize = containedInputSizeConfig(),
            showBorder = false
        )

    /** Override default TextField colors to make container and indicator transparent
     * as we are using our own container and indicator in GdsInput
     */
    @Composable
    fun textFieldColors() =
        TextFieldDefaults.colors().copy(
            disabledContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            errorContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        )

    /**
     * Default text selection colors for [GdsInputContained] and [GdsInputDefault].
     *
     * See [TextSelectionColors] for more details.
     */
    @Composable
    fun textSelectionColors() =
        TextSelectionColors(
            handleColor = GdsTheme.colors.ContentNeutral01,
            backgroundColor = GdsTheme.colors.ContentNeutral01.copy(alpha = 0.2f),
        )

    /**
     * Default input colors for [GdsInputDefault] and [GdsInputContained] in different states.
     *
     * See [GdsInputColors] for more details.
     */
    @Composable
    fun inputColors(): GdsInputColors =
        GdsInputColors(
            containerColor = GdsTheme.colors.L2Neutral01,
            floatingLabelColor = GdsTheme.colors.ContentNeutral02,
            labelColor = GdsTheme.colors.ContentNeutral01,
            supportLabelColor = GdsTheme.colors.ContentNeutral01,
            inputTextColor = GdsTheme.colors.ContentNeutral01,
            supportingTextColor = GdsTheme.colors.ContentNeutral01,
            errorSupportingTextColor = GdsTheme.colors.ContentNegative01,
            errorIndicatorColor = GdsTheme.colors.BorderNegative01,
            disabledContainerColor = GdsTheme.colors.L3Disabled01,
            disabledContentColor = GdsTheme.colors.ContentDisabled01,
            disabledSupportingTextColor = GdsTheme.colors.ContentDisabled01,
            focusedContainerColor = GdsTheme.colors.StateNeutral04,
            cursorColor = GdsTheme.colors.ContentNeutral01,
            borderColor = GdsTheme.colors.BorderInteractive,
        )

    /**
     * Default text styles for [GdsInputDefault] and [GdsInputContained] in different states.
     *
     * See [GdsInputTextStyle] for more details.
     */
    @Composable
    fun inputTextStyle() =
        GdsInputTextStyle(
            smallLabelStyle = GdsTheme.typography.DetailBookS,
            largeLabelStyle = GdsTheme.typography.DetailBookM,
            inputTextStyle = GdsTheme.typography.DetailBookM,
            footerMessageStyle = GdsTheme.typography.DetailBookS,
            labelStyle = GdsTheme.typography.DetailBookM,
            supportLabelStyle = GdsTheme.typography.DetailRegularS,
            characterCounter = GdsTheme.typography.DetailBookS,
        )

    @Composable
    fun defaultInputSizeConfig(): InputSizeConfig =
        InputSizeConfig(
            landscape = InputSize(
                height = 56.dp,
                shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusM),
            ),
            portrait = InputSize(
                height = 64.dp,
                shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusM),
            ),
        )

    @Composable
    fun containedInputSizeConfig(): InputSizeConfig =
        InputSizeConfig(
            landscape = InputSize(
                height = 56.dp,
                shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusM),
            ),
            portrait = InputSize(
                height = 72.dp,
                shape = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusM),
            ),
        )

    fun contentPaddingWithoutLabel(): PaddingValues =
        PaddingValues(
            horizontal = 0.dp,
            vertical = 16.dp,
        )

    fun contentPaddingWithLabel(): PaddingValues =
        PaddingValues(
            horizontal = 0.dp,
            vertical = 8.dp,
        )
}

/**
 * Represents the size and shape of an input container.
 *
 * @property height The height of the input container.
 * @property shape The shape of the input container.
 */
class InputSize(
    val height: Dp,
    val shape: Shape,
)

/**
 * Represents the sizes of an input container in landscape and portrait modes.
 *
 * @property landscape The size of the input container in landscape mode.
 * @property portrait The size of the input container in portrait mode.
 */
data class InputSizeConfig(
    val landscape: InputSize,
    val portrait: InputSize,
)

/**
 * Represents the colors used by a [GdsInputDefault] and [GdsInputContained] in different states.
 *
 * See [GdsInputDefaults.inputColors] for the default colors.
 *  @property containerColor The background color of the input container.
 *  @property labelColor The color of the label positioned above the container.
 *  @property supportLabelColor The color of the supporting label positioned above the container.
 *  @property floatingLabelColor The color of the floating label inside the container.
 *  @property inputTextColor The color of the input text.
 *  @property supportingTextColor The color of the supporting text placed below the container.
 *  @property errorSupportingTextColor The color of the supporting text when the input is in an error state.
 *  @property errorIndicatorColor The color of the indicator (border) when the input is in an error state.
 *  @property focusedContainerColor The background color of the input container when focused.
 *  @property disabledContainerColor The background color of the input container when disabled.
 *  @property disabledContentColor The color of the input text and floating label when the input is disabled.
 *  @property disabledSupportingTextColor The color of the supporting text when the input is disabled.
 *  @property cursorColor The color of the cursor in the input field.
 */
@Immutable
data class GdsInputColors(
    val containerColor: Color,
    val labelColor: Color,
    val floatingLabelColor: Color,
    val supportLabelColor: Color,
    val inputTextColor: Color,
    val supportingTextColor: Color,
    val errorSupportingTextColor: Color,
    val errorIndicatorColor: Color,
    val focusedContainerColor: Color,
    val disabledContainerColor: Color,
    val disabledContentColor: Color,
    val disabledSupportingTextColor: Color,
    val cursorColor: Color,
    val borderColor: Color,
) {

    fun inputTextColor(enabled: Boolean): Color =
        when {
            !enabled -> disabledContentColor
            else -> inputTextColor
        }

    fun containerColor(enabled: Boolean): Color =
        when {
            enabled -> containerColor
            else -> disabledContainerColor
        }

    fun floatingLabelColor(enabled: Boolean): Color =
        when {
            !enabled -> disabledContentColor
            else -> floatingLabelColor
        }

    fun borderColor(isError: Boolean): Color =
        when {
            isError -> errorIndicatorColor
            else -> borderColor
        }

    fun footerTextColor(
        enabled: Boolean,
        error: Boolean,
    ): Color =
        when {
            !enabled -> disabledSupportingTextColor
            error -> errorSupportingTextColor
            else -> supportingTextColor
        }
}
