package se.seb.gds.atoms.input

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import se.seb.gds.theme.GdsTheme

/**
 * Style configuration for [GdsInputContained] and [GdsInputDefault], including sizes, colors, and text styles.
 *
 * @property shape The shape of the input container.
 * @property colors The colors used by the input in different states.
 * @property textSelectionColors The colors used for text selection in the input field.
 * @property inputTextStyle The text style for the input text.
 * @property errorMessageStyle The text style for the error message displayed below the input.
 * @property characterCounter The text style for the character counter displayed below the input.
 * @property unfocusedBorderThickness The thickness of the border when the input is unfocused.
 * @property focusedBorderThickness The thickness of the border when the input is focused.
 * @property showBorder A flag indicating whether to display the border around the input container.
 *
 */
data class BasicInputStyle(
    val shape: Shape,
    val colors: GdsInputColors,
    val textSelectionColors: TextSelectionColors,
    val inputTextStyle: TextStyle,
    val errorMessageStyle: TextStyle,
    val characterCounter: TextStyle,
    val unfocusedBorderThickness: Dp,
    val focusedBorderThickness: Dp,
    val showBorder: Boolean = true,
) {
    /**
     * Determines the border width based on the input's focus and error state.
     *
     * @param textFieldIsFocused Whether the input field is currently focused.
     * @param isError Whether the input field is in an error state.
     * @return The border thickness to be applied.
     */
    fun getBorderWidth(
        textFieldIsFocused: Boolean,
        isError: Boolean,
    ): Dp =
        if (textFieldIsFocused || isError) {
            focusedBorderThickness
        } else {
            unfocusedBorderThickness
        }
}

/**
 * Style configuration for [GdsInputDefault].
 *
 * @property basicInputStyle The basic style configuration for the input.
 * @property labelStyle The text style for the label positioned above the container.
 * @property supportLabelStyle The text style for the supporting label positioned above the container.
 */
data class InputDefaultStyle(
    val basicInputStyle: BasicInputStyle,
    val labelStyle: TextStyle,
    val supportLabelStyle: TextStyle,
)

/**
 * Style configuration for [GdsInputContained].
 *
 * @property basicInputStyle The basic style configuration for the input.
 * @property smallLabelStyle The text style for the small floating label inside the container.
 * @property largeLabelStyle The text style for the large floating label inside the container.
 */
data class InputContainedStyle(
    val basicInputStyle: BasicInputStyle,
    val smallLabelStyle: TextStyle,
    val largeLabelStyle: TextStyle,
)

/**
 *  Represents the colors used by a [GdsInputDefault] and [GdsInputContained] in different states.
 *
 *  See [GdsInputDefaults.defaultInputColors] for the default colors.
 *  @property containerColor The background color of the input container.
 *  @property labelColor The color of the label positioned above the container.
 *  @property supportLabelColor The color of the supporting label positioned above the container.
 *  @property floatingLabelColor The color of the floating label inside the container.
 *  @property characterCounterColor The color of the character counter displayed in the trailing position when a character limit is set.
 *  @property inputTextColor The color of the input text.
 *  @property errorTextColor The color of the supporting text when the input is in an error state.
 *  @property errorIndicatorColor The color of the indicator (border) when the input is in an error state.
 *  @property focusedContainerColor The background color of the input container when focused.
 *  @property cursorColor The color of the cursor in the input field.
 *  @property borderColor The color of the indicator (border) when the input is in normal state.
 */
@Immutable
data class GdsInputColors(
    val containerColor: Color,
    val labelColor: Color,
    val floatingLabelColor: Color,
    val characterCounterColor: Color,
    val supportLabelColor: Color,
    val inputTextColor: Color,
    val errorTextColor: Color,
    val errorIndicatorColor: Color,
    val focusedContainerColor: Color,
    val cursorColor: Color,
    val borderColor: Color,
) {

    fun borderColor(isError: Boolean): Color =
        when {
            isError -> errorIndicatorColor
            else -> borderColor
        }
}

object GdsInputDefaults {
    /** Style for [GdsInputDefault] on white background */
    @Composable
    fun defaultStyle() =
        InputDefaultStyle(
            basicInputStyle = basicContainerStyle(),
            labelStyle = GdsTheme.typography.DetailBookM,
            supportLabelStyle = GdsTheme.typography.DetailBookS,
        )

    /** Style for [GdsInputDefault] on grey background */
    @Composable
    fun defaultOnGreyStyle() =
        InputDefaultStyle(
            basicInputStyle = basicContainerStyle().copy(
                colors = defaultInputColors().copy(
                    containerColor = GdsTheme.colors.L2.Neutral02,
                ),
            ),
            labelStyle = GdsTheme.typography.DetailBookM,
            supportLabelStyle = GdsTheme.typography.DetailRegularS,
        )

    /** Style for [GdsInputContained] on white background */
    @Composable
    fun containedStyle() =
        InputContainedStyle(
            basicInputStyle = basicContainerStyle().copy(
                showBorder = false,
            ),
            smallLabelStyle = GdsTheme.typography.DetailBookXs,
            largeLabelStyle = GdsTheme.typography.DetailBookM,
        )

    /** Style for [GdsInputContained] on grey background */
    @Composable
    fun containedOnGreyStyle() =
        InputContainedStyle(
            basicInputStyle = basicContainerStyle().copy(
                colors = defaultInputColors().copy(
                    containerColor = GdsTheme.colors.L2.Neutral02,
                ),
                showBorder = false,
            ),
            smallLabelStyle = GdsTheme.typography.DetailBookXs,
            largeLabelStyle = GdsTheme.typography.DetailBookM,
        )

    /** Basic style used by both [GdsInputDefault] and [GdsInputContained] */
    @Composable
    fun basicContainerStyle() =
        BasicInputStyle(
            shape = shapeContainer(),
            colors = defaultInputColors(),
            textSelectionColors = textSelectionColors(),
            inputTextStyle = GdsTheme.typography.DetailBookM,
            errorMessageStyle = GdsTheme.typography.DetailBookS,
            characterCounter = GdsTheme.typography.DetailRegularXs,
            unfocusedBorderThickness = GdsTheme.dimensions.spacing.Space5Xs,
            focusedBorderThickness = GdsTheme.dimensions.spacing.Space4Xs,
            showBorder = true,
        )

    /**
     * Override default TextField colors to make container and indicator transparent
     * as we are using our own container and indicator in [GdsInputContained] and [GdsInputDefault]
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
            handleColor = GdsTheme.colors.Content.Neutral01,
            backgroundColor = GdsTheme.colors.Content.Neutral01.copy(alpha = 0.2f),
        )

    /**
     * Default input colors for [GdsInputDefault] and [GdsInputContained] in different states.
     */
    @Composable
    fun defaultInputColors(): GdsInputColors =
        GdsInputColors(
            containerColor = GdsTheme.colors.L2.Neutral01,
            floatingLabelColor = GdsTheme.colors.Content.Neutral02,
            characterCounterColor = GdsTheme.colors.Content.Neutral01,
            labelColor = GdsTheme.colors.Content.Neutral01,
            supportLabelColor = GdsTheme.colors.Content.Neutral02,
            inputTextColor = GdsTheme.colors.Content.Neutral01,
            errorTextColor = GdsTheme.colors.Content.Negative01,
            errorIndicatorColor = GdsTheme.colors.Border.Negative01,
            focusedContainerColor = GdsTheme.colors.State.Neutral04,
            cursorColor = GdsTheme.colors.Content.Neutral01,
            borderColor = GdsTheme.colors.Border.Interactive,
        )

    /**
     * Container configuration for [GdsInputDefault].
     */
    @Composable
    fun shapeContainer() = RoundedCornerShape(GdsTheme.dimensions.radius.RadiusM)
}
