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

data class GdsInputStyle(
    val containerSize: InputSize,
    val floatingLabel: Boolean,
    val textFieldColors: TextFieldColors,
    val colors: GdsInputColors,
    val textSelectionColors: TextSelectionColors,
    val textStyle: GdsInputTextStyle,
)

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

    @Composable
    fun containedStyle() = GdsInputStyle(
        containerSize = InputSize.Large,
        floatingLabel = true,
        textFieldColors = textFieldColors(),
        colors = inputColors(),
        textSelectionColors = textSelectionColors(),
        textStyle = inputTextStyle()
    )

    @Composable
    fun defaultStyle() = GdsInputStyle(
        containerSize = InputSize.Small,
        floatingLabel = false,
        textFieldColors = textFieldColors(),
        colors = inputColors(),
        textSelectionColors = textSelectionColors(),
        textStyle = inputTextStyle()
    )

    @Composable
    fun textFieldColors() = TextFieldDefaults.colors().copy(
        disabledContainerColor = Color.Transparent,
        focusedContainerColor = Color.Transparent,
        errorContainerColor = Color.Transparent,
        unfocusedContainerColor = Color.Transparent,
        focusedTextColor = GdsTheme.colors.contentContent01,
        unfocusedTextColor = GdsTheme.colors.contentContent01,
        disabledTextColor = GdsTheme.colors.contentContentDisabled01,
        errorTextColor = GdsTheme.colors.contentContentNegative01,
        focusedLabelColor = GdsTheme.colors.contentContent02,
        unfocusedLabelColor = GdsTheme.colors.contentContent02,
        errorLabelColor = GdsTheme.colors.contentContent02,
        disabledLabelColor = GdsTheme.colors.contentContent02,
        focusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        errorIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        focusedPlaceholderColor = GdsTheme.colors.contentContent02,
        unfocusedPlaceholderColor = GdsTheme.colors.contentContent02,
        disabledPlaceholderColor = GdsTheme.colors.contentContentDisabled01,
        errorPlaceholderColor = GdsTheme.colors.contentContent02,
    )

    @Composable
    fun textSelectionColors() = TextSelectionColors(
        handleColor = GdsTheme.colors.contentContent01,
        backgroundColor = GdsTheme.colors.contentContent01.copy(alpha = 0.2f),
    )

    @Composable
    fun inputColors(): GdsInputColors = GdsInputColors(
        containerColor = GdsTheme.colors.l302,
        disabledContainerColor = GdsTheme.colors.l3Disabled01,
        floatingLabelColor = GdsTheme.colors.contentContent02,
        disabledFloatingLabelColor = GdsTheme.colors.contentContentDisabled01,
        labelColor = GdsTheme.colors.contentContent01,
        supportLabelColor = GdsTheme.colors.contentContent01,
        inputTextColor = GdsTheme.colors.contentContent01,
        disabledInputTextColor = GdsTheme.colors.contentContentDisabled01,
        errorIndicatorColor = GdsTheme.colors.borderNegative,
        disabledSupportingTextColor = GdsTheme.colors.contentContentDisabled01,
        errorSupportingTextColor = GdsTheme.colors.contentContentNegative01,
        enabledSupportingTextColor = GdsTheme.colors.contentContent01,
        focusedContainerColor = GdsTheme.colors.stateLightPressed,
        cursorColor = GdsTheme.colors.contentContent01,
    )

    @Composable
    fun inputTextStyle() = GdsInputTextStyle(
        smallLabelStyle = GdsTheme.typography.Caption,
        largeLabelStyle = GdsTheme.typography.Body,
        inputTextStyle = GdsTheme.typography.Headline,
        footerMessageStyle = GdsTheme.typography.SubHeader2,
        labelStyle = GdsTheme.typography.Headline,
        supportLabelStyle = GdsTheme.typography.SubHeader2,
        characterCounter = GdsTheme.typography.Caption,
    )
}

sealed class InputSize(val height: Dp, val shape: Shape) {
    data object Small : InputSize(height = 48.dp, shape = RoundedCornerShape(8.dp))
    data object Large : InputSize(height = 64.dp, shape = RoundedCornerShape(12.dp))
}

/**
 * Represents the colors used by a [GdsInput] in different states.
 *
 * See [GdsInputDefaults.inputColors] for the default colors.
 */
@Immutable
data class GdsInputColors(
    val containerColor: Color,
    val disabledContainerColor: Color,
    val labelColor: Color,
    val floatingLabelColor: Color,
    val disabledFloatingLabelColor: Color,
    val supportLabelColor: Color,
    val inputTextColor: Color,
    val disabledInputTextColor: Color,
    val errorIndicatorColor: Color,
    val disabledSupportingTextColor: Color,
    val errorSupportingTextColor: Color,
    val enabledSupportingTextColor: Color,
    val focusedContainerColor: Color,
    val cursorColor: Color,
)