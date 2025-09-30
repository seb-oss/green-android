package se.seb.gds.atoms.input

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.TextFieldColors
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
 * @property containerSize The size of the input container, either [InputSize.Small] or [InputSize.Large].
 * @property floatingLabel Whether the input uses a floating label style or label outside the container.
 * @property textFieldColors The colors used by the underlying TextField component.
 * @property colors The colors used by the input in different states.
 * @property textSelectionColors The colors used for text selection in the input field.
 * @property textStyle The text styles used by the input in different states.
 *
 */
data class GdsInputStyle(
    val containerSize: InputSize,
    val floatingLabel: Boolean,
    val textFieldColors: TextFieldColors,
    val colors: GdsInputColors,
    val textSelectionColors: TextSelectionColors,
    val textStyle: GdsInputTextStyle,
)

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
    /** Default style for [GdsInput] with large container and floating label. */
    @Composable
    fun containedStyle() =
        GdsInputStyle(
            containerSize = InputSize.Large,
            floatingLabel = true,
            textFieldColors = textFieldColors(),
            colors = inputColors(),
            textSelectionColors = textSelectionColors(),
            textStyle = inputTextStyle(),
        )

    @Composable
    fun defaultStyle() =
        GdsInputStyle(
            containerSize = InputSize.Small,
            floatingLabel = false,
            textFieldColors = textFieldColors(),
            colors = inputColors(),
            textSelectionColors = textSelectionColors(),
            textStyle = inputTextStyle(),
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
            focusedPlaceholderColor = GdsTheme.colors.ContentNeutral02,
            unfocusedPlaceholderColor = GdsTheme.colors.ContentNeutral02,
            disabledPlaceholderColor = GdsTheme.colors.ContentDisabled01,
            errorPlaceholderColor = GdsTheme.colors.ContentNeutral02,
        )

    /**
     * Default text selection colors for [GdsInput].
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
     * Default input colors for [GdsInput] in different states.
     *
     * See [GdsInputColors] for more details.
     */
    @Composable
    fun inputColors(): GdsInputColors =
        GdsInputColors(
            containerColor = GdsTheme.colors.L3Neutral02,
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
        )

    /**
     * Default text styles for [GdsInput] in different states.
     *
     * See [GdsInputTextStyle] for more details.
     */
    @Composable
    fun inputTextStyle() =
        GdsInputTextStyle(
            smallLabelStyle = GdsTheme.typography.DetailBookSmall,
            largeLabelStyle = GdsTheme.typography.DetailBookMedium,
            inputTextStyle = GdsTheme.typography.DetailBookMedium,
            footerMessageStyle = GdsTheme.typography.DetailRegularSmall,
            labelStyle = GdsTheme.typography.DetailBookMedium,
            supportLabelStyle = GdsTheme.typography.DetailRegularSmall,
            characterCounter = GdsTheme.typography.DetailBookSmall,
        )
}

sealed class InputSize(
    val height: Dp,
    val shape: Shape,
) {
    data object Small : InputSize(height = 48.dp, shape = RoundedCornerShape(8.dp))

    data object Large : InputSize(height = 64.dp, shape = RoundedCornerShape(12.dp))
}

/**
 * Represents the colors used by a [GdsInput] in different states.
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
)
