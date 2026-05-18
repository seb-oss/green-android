package se.seb.gds.atoms.checkbox

import androidx.compose.foundation.layout.size
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.RippleConfiguration
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.state.ToggleableState
import kotlin.math.floor
import se.seb.gds.atoms.checkbox.GdsCheckboxDefaults.defaultColors
import se.seb.gds.atoms.checkbox.GdsCheckboxDefaults.errorColors
import se.seb.gds.common.GdsUiPreview
import se.seb.gds.theme.GdsTheme

/**
 * GDS TriStateCheckbox component.
 *
 * @param modifier Modifier to be applied to the checkbox.
 * @param state The state of the checkbox, which can be On, Off, or Indeterminate.
 * @param enabled Whether the checkbox is enabled or not.
 * @param isError Whether the checkbox is in an error state or not.
 * @param onClick Callback to be invoked when the checkbox is clicked. If null, the checkbox will be read-only.
 *
 * Example usage:
 * ```
 * var state by remember { mutableStateOf(ToggleableState.On) }
 * GdsTriStateCheckbox(
 *     state = state,
 *     onClick = { /* Handle click event */ },
 * )
 * ```
 */
@Composable
fun GdsTriStateCheckbox(
    modifier: Modifier = Modifier,
    state: ToggleableState = ToggleableState.Off,
    enabled: Boolean = true,
    isError: Boolean = false,
    onClick: (() -> Unit)?,
) {
    val strokeWidthPx = with(LocalDensity.current) { floor(GdsCheckboxDefaults.StrokeWidth.toPx()) }
    val stroke = Stroke(width = strokeWidthPx, cap = StrokeCap.Round)
    val colors = if (isError) errorColors() else defaultColors()

    CompositionLocalProvider(
        LocalRippleConfiguration provides RippleConfiguration(color = colors.checkedBoxColor),
    ) {
        TriStateCheckbox(
            modifier = modifier.size(GdsCheckboxDefaults.CheckboxSize),
            state = state,
            enabled = enabled,
            onClick = onClick,
            colors = colors,
            checkmarkStroke = stroke,
            outlineStroke = stroke,
        )
    }
}

@GdsUiPreview
@Composable
private fun TriStateCheckboxCheckedPreview() {
    GdsTheme {
        GdsTriStateCheckbox(
            state = ToggleableState.On,
            onClick = {},
        )
    }
}

@GdsUiPreview
@Composable
private fun TriStateCheckboxUncheckedPreview() {
    GdsTheme {
        GdsTriStateCheckbox(
            state = ToggleableState.Off,
            onClick = {},
        )
    }
}

@GdsUiPreview
@Composable
private fun TriStateCheckboxIndeterminatePreview() {
    GdsTheme {
        GdsTriStateCheckbox(
            state = ToggleableState.Indeterminate,
            onClick = {},
        )
    }
}
