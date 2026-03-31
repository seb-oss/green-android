package se.seb.gds.atoms.input

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.then
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import se.seb.gds.components.R
import se.seb.gds.icons.GdsIcons
import se.seb.gds.theme.GdsTheme

/**
 *
 * @property readOnly Whether the input field is read-only.
 * @property clearable Whether the input field includes a clear button to clear the text.
 * @property isError Whether the input field is in an error state.
 * @property errorMessage Optional error message displayed below the input field.
 * @property overrideTextDescription Optional text description to override the default accessibility description.
 * @property lineLimits Line limits for the input field, such as single-line or multi-line.
 * @property characterLimit Optional character limit configuration for the input field.
 */
data class BasicInputState(
    val readOnly: Boolean = false,
    val clearable: Boolean = true,
    val isError: Boolean = false,
    val errorMessage: String? = null,
    val overrideTextDescription: String? = null,
    val lineLimits: TextFieldLineLimits = TextFieldLineLimits.Default,
    val characterLimit: CharacterLimit? = null,
) {
    fun hasCharacterLimit(): Boolean = characterLimit != null
    fun hasHardCharacterLimit(): Boolean = characterLimit != null && characterLimit.type == CharacterLimitType.HARD
}

/**
 * Configuration for character limit in the input field, including the maximum number of characters allowed and the type of limit (soft or hard).
 *
 * @property maxCharacters The maximum number of characters allowed in the input field.
 * @property type The type of character limit, either soft (allows input but shows error) or hard (prevents input beyond the limit).
 */
data class CharacterLimit(
    val maxCharacters: Int,
    val type: CharacterLimitType = CharacterLimitType.SOFT,
)

enum class CharacterLimitType {
    SOFT,
    HARD,
}

/**
 * A composable function responsible for rendering the actual container text field UI, including its border, background, and layout.
 *
 * @param modifier Modifier to be applied to the container.
 * @param basicStyle The style configuration for the input field, including text styles and colors.
 * @param isError Whether the input field is in an error state.
 * @param inputState Configuration for the input field.
 * @param isTextFieldFocused Whether the text field is currently focused.
 */
@Composable
fun InputContainer(
    modifier: Modifier = Modifier,
    basicStyle: BasicInputStyle,
    isError: Boolean,
    isTextFieldFocused: Boolean,
    inputState: BasicInputState,
) {
    val borderStroke = animateBorderStrokeAsState(
        basicStyle,
        isError,
        isTextFieldFocused,
    )

    Box(
        modifier = modifier
            .borderIf(
                basicStyle.showBorder || isError,
                borderStroke.value,
                basicStyle.shape,
            )
            .background(
                shape = basicStyle.shape,
                color = basicStyle.colors.containerColor,
            ),
    )
}

/**
 * Displays an error message with an error icon. Used as supportingText in the input field.
 *
 * @param errorMessage The error message to display.
 * @param style The style configuration for the input field, including text styles and colors.
 */
@Composable
internal fun errorContent(
    visible: Boolean = false,
    errorMessage: String = "",
    style: BasicInputStyle,
): @Composable (() -> Unit)? =
    if (visible) {
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = GdsTheme.dimensions.spacing.Space3Xs),
                horizontalArrangement = Arrangement.spacedBy(GdsTheme.dimensions.spacing.SpaceXs),
            ) {
                Icon(
                    modifier = Modifier
                        .size(GdsTheme.dimensions.spacing.SpaceL)
                        .align(Alignment.Top),
                    imageVector = GdsIcons.Solid.TriangleExclamation,
                    contentDescription = null,
                    tint = style.colors.errorTextColor,
                )
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically),
                    text = errorMessage,
                    style = style.errorMessageStyle,
                    color = style.colors.errorTextColor,
                )
            }
        }
    } else {
        null
    }

/**
 * Animates the border stroke color and thickness for the input field based on error and focus state.
 *
 * @param style The style configuration for the input field.
 * @param isError Whether the input field is in an error state.
 * @param focused Whether the input field is currently focused.
 * @return A State object containing the animated BorderStroke.
 */
@Composable
internal fun animateBorderStrokeAsState(
    style: BasicInputStyle,
    isError: Boolean,
    focused: Boolean,
): State<BorderStroke> {
    val targetColor = style.colors.borderColor(isError)
    val indicatorColor = animateColorAsState(targetColor, tween(durationMillis = 150))

    val targetThickness = style.getBorderWidth(focused, isError)
    val thickness = animateDpAsState(targetThickness, tween(durationMillis = 150))
    return rememberUpdatedState(BorderStroke(thickness.value, indicatorColor.value))
}

/**
 * Chains the provided InputTransformation with additional transformations based on the input state, such as character limit and character whitelist.
 *
 * @param inputTransformation The initial InputTransformation to chain with.
 * @param inputState The state of the input field, including character limit configuration.
 * @param characterWhitelistPredicate Predicate function to filter allowed characters in the input.
 * @return The chained InputTransformation or null if the initial transformation is null and no additional transformations are added.
 */
@Composable
internal fun basicTransformation(
    inputTransformation: InputTransformation?,
    inputState: BasicInputState,
    characterWhitelistPredicate: (CharSequence, CharSequence) -> Boolean,
): InputTransformation? =
    inputTransformation
        .thenIfNotNull(
            inputState.characterLimit?.takeIf { inputState.hasHardCharacterLimit() }?.let {
                MaxCharacterInputTransformation(it.maxCharacters)
            },
        )
        .thenIfNotNull(CharacterWhitelistInputTransformation(characterWhitelistPredicate))

/**
 * Chains two InputTransformation objects if both are not null.
 *
 * @receiver The first InputTransformation or null.
 * @param next The next InputTransformation or null.
 * @return The chained InputTransformation or null if both are null.
 */
internal fun InputTransformation?.thenIfNotNull(next: InputTransformation?): InputTransformation? {
    return when {
        this == null -> next
        next == null -> this
        else -> this.then(next)
    }
}

/**
 * Builds the accessibility description string for the input field.
 *
 * @param state The state of the text field, including the current text value.
 * @param textFieldIsFocused Whether the text field is currently focused.
 * @param label Optional label text displayed above the input field.
 * @param supportLabel Optional support label displayed below the main label.
 * @return The accessibility description string.
 */
@Composable
internal fun getAccessibilityDescription(
    inputState: BasicInputState,
    state: TextFieldState,
    textFieldIsFocused: Boolean = false,
    label: String? = null,
    supportLabel: String? = null,
): String {
    val descriptionBuilder = StringBuilder()

    label?.let {
        if (it.isNotBlank()) {
            descriptionBuilder.append(label)
            descriptionBuilder.append(", ")
        }
    }

    if (inputState.isError) {
        descriptionBuilder.append(stringResource(id = R.string.text_field_error_in_field))
        descriptionBuilder.append(", ")
        if (inputState.errorMessage != null) {
            descriptionBuilder.append(inputState.errorMessage)
            descriptionBuilder.append(", ")
        }
    }

    supportLabel?.let {
        descriptionBuilder.append(supportLabel)
        descriptionBuilder.append(", ")
    }

    val currentText = inputState.overrideTextDescription ?: state.text
    if (currentText.isNotEmpty()) {
        descriptionBuilder.append(currentText)
        descriptionBuilder.append(". ")
    }

    descriptionBuilder.append(stringResource(id = R.string.text_field))

    if (textFieldIsFocused && !inputState.readOnly) {
        descriptionBuilder.append(", ")
        descriptionBuilder.append(stringResource(id = R.string.text_field_is_editing))
    }

    // Announce character count if the text field is valid. If not valid, the error message will
    // include the character limit information, so it would be redundant to announce it here as well.
    val isCharacterLimitValid =
        inputState.characterLimit != null && state.text.length <= inputState.characterLimit.maxCharacters
    if (textFieldIsFocused && isCharacterLimitValid) {
        descriptionBuilder.append(", ")
        descriptionBuilder.append(
            stringResource(
                id = R.string.text_field_characters_written,
                state.text.length,
                inputState.characterLimit.maxCharacters,
            ),
        )
    }

    return descriptionBuilder.toString().replace(" ,", ",").trim()
}

/**
 * Validates the input text against the provided character limit and updates the character limit error state.
 *
 * @param text The current text input to validate.
 * @param characterLimit The character limit configuration to validate against.
 * @return True if the text exceeds the character limit, false otherwise.
 */
fun validate(
    text: CharSequence,
    characterLimit: CharacterLimit?,
): Boolean {
    characterLimit ?: return false
    return text.length > characterLimit.maxCharacters
}

/**
 * Applies a border to the modifier if showBorder is true.
 *
 * @param showBorder Whether to show the border.
 * @param border The BorderStroke to apply.
 * @param shape The shape of the border.
 * @receiver The original Modifier.
 * @return The modified Modifier with border if showBorder is true.
 */
fun Modifier.borderIf(
    showBorder: Boolean,
    border: BorderStroke,
    shape: Shape,
): Modifier {
    return if (showBorder) {
        this.border(border, shape)
    } else {
        this
    }
}
